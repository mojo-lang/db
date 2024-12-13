package query

import (
	"gorm.io/gorm"
	"strconv"
	"strings"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"github.com/mojo-lang/lang/go/pkg/mojo/lang"
)

type Query struct {
	Fields    []*FieldQuery    `json:"fields,omitempty"`
	Filter    *lang.Expression `json:"filter,omitempty"`
	Order     *core.Ordering   `json:"order,omitempty"`
	Unique    bool             `json:"unique,omitempty"`
	Uniques   []string         `json:"uniques,omitempty"`
	FieldMask *core.FieldMask  `json:"fieldMask,omitempty"`

	Calculates []*FieldCalculate `json:"calcFields,omitempty"`
	Groups     []string          `json:"groups,omitempty"`

	PageSize  int32  `json:"pageSize,omitempty"`
	PageToken string `json:"pageToken,omitempty"`
	Skip      int32  `json:"skip,omitempty"`
	Limit     int    `json:"limit,omitempty"`
}

func (q *Query) preprocess() {
	if q != nil {
		if q.Unique && q.FieldMask != nil && len(q.Uniques) == 0 {
			fields := normalizeFiledMask(q.FieldMask)
			for _, p := range fields {
				q.Uniques = append(q.Uniques, p)
			}
		}
	}
}

func (q *Query) Calculate(d *gorm.DB, meta Fields) *gorm.DB {
	if q == nil {
		return d
	}

	var err error
	tx := d

	q.preprocess()

	if len(q.Calculates) > 0 {
		if tx, err = ApplyFieldCalculate(tx, q.Calculates, meta); err != nil {
			_ = tx.AddError(err)
			return tx
		}
	}

	if len(q.Groups) > 0 {
		tx = tx.Group(strings.Join(q.Groups, ","))
	}

	if tx, err = q.applyQuery(tx, meta); err != nil {
		_ = tx.AddError(err)
		return tx
	}

	return tx
}

func (q *Query) TotalCount(d *gorm.DB, meta Fields) *gorm.DB {
	if q == nil {
		return d
	}

	q.preprocess()
	if len(q.Uniques) > 0 {
		q.Calculates = []*FieldCalculate{{Name: "DISTINCT (" + strings.Join(q.Uniques, ",") + ")", Functions: []string{"COUNT"}}}
	} else {
		q.Calculates = []*FieldCalculate{{Name: "*", Functions: []string{"COUNT"}}}
	}

	return q.Calculate(d, meta)
}

func (q *Query) Apply(d *gorm.DB, meta Fields) *gorm.DB {
	if q == nil {
		return d
	}

	var err error
	tx := d

	q.preprocess()

	if len(q.Uniques) > 0 {
		tx = tx.Distinct(q.Uniques)
	}

	if q.FieldMask != nil {
		if tx, err = ApplyFieldMask(tx, q.FieldMask); err != nil {
			return tx
		}
	}

	if tx, err = q.applyQuery(tx, meta); err != nil {
		_ = tx.AddError(err)
		return tx
	}

	return tx
}

func (q *Query) applyQuery(d *gorm.DB, meta Fields) (tx *gorm.DB, err error) {
	tx = d

	if len(q.Fields) > 0 {
		for _, field := range q.Fields {
			if tx, err = ApplyFieldQuery(tx, field, meta); err != nil {
				return
			}
		}
	}
	if q.Filter != nil {
		if tx, err = ApplyFilter(tx, q.Filter, meta); err != nil {
			return
		}
	}
	if q.Order != nil {
		if tx, err = ApplyOrder(tx, q.Order); err != nil {
			return
		}
	}

	if q.PageSize > 0 {
		if tx, err = ApplyPagination(d, q.PageSize, q.PageToken, q.Skip); err != nil {
			return
		}
	} else {
		if q.Skip > 0 {
			tx = d.Offset(int(q.Skip))
		}
		if q.Limit > 0 {
			tx = d.Limit(q.Limit)
		}
	}
	return
}

func ApplyOrder(d *gorm.DB, order *core.Ordering) (*gorm.DB, error) {
	if d != nil && order != nil && len(order.Orders) > 0 {
		return d.Order(order.Format()), nil
	}
	return d, nil
}

func ApplyPagination(d *gorm.DB, pageSize int32, pageToken string, skip int32) (*gorm.DB, error) {
	if d != nil && pageSize > 0 {
		var index int64 = 0
		var err error
		if len(pageToken) > 0 {
			index, err = strconv.ParseInt(pageToken, 10, 64)
			if err != nil {
				return nil, err
			}
		}

		offset := pageSize*int32(index) + skip
		return d.Offset(int(offset)).Limit(int(pageSize)), nil
	}
	return d, nil
}
