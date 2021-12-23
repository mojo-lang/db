package db

import (
	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"time"
)

const DeleteTimeTypeName = "mojo.db.DeleteTime"

func (m DeleteTime) ToTime() time.Time {
	return m.Val.ToTime()
}

func (m *DeleteTime) FromTime(t time.Time) {
	m.Val = &core.Timestamp{}
	m.Val.FromTime(t)
}
