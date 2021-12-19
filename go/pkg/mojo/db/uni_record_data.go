package db

import (
	"database/sql/driver"
	"gorm.io/gorm"
	"gorm.io/gorm/schema"
)

func (u UniRecordData) Value() (driver.Value, error) {
	return JSONValuer{}.Value(u.Object)
}

func (u *UniRecordData) Scan(value interface{}) error {
	return JSONScanner{}.Scan(&u.Object, value)
}

func (u UniRecordData) GormDBDataType(db *gorm.DB, field *schema.Field) string {
	return JSONDbDataType{}.GormDBDataType(db, field)
}
