package db

import (
	"time"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

const DeleteTimeTypeFullName = "mojo.db.DeleteTime"

func (m DeleteTime) ToTime() time.Time {
	return m.Val.ToTime()
}

func (m *DeleteTime) FromTime(t time.Time) {
	m.Val = &core.Timestamp{}
	m.Val.FromTime(t)
}
