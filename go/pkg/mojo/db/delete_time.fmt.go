package db

import (
	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

func (m DeleteTime) Format() string {
	return m.Val.Format()
}

func ParseDeleteTime(value string) (*DeleteTime, error) {
	deleteTime := &DeleteTime{}
	if err := deleteTime.Parse(value); err != nil {
		return nil, err
	}
	return deleteTime, nil
}

func (m *DeleteTime) Parse(value string) error {
	if m != nil {
		m.Val = &core.Timestamp{}
		return m.Val.Parse(value)
	}
	return nil
}
