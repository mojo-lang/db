package db

import (
	"database/sql/driver"
	"fmt"
	jsoniter "github.com/json-iterator/go"
	"gorm.io/gorm"
	"gorm.io/gorm/schema"
	"reflect"
)

type JSONValuer struct{}

func (v JSONValuer) Value(value interface{}) (driver.Value, error) {
	if val := reflect.ValueOf(value); val.IsZero() {
		return nil, nil
	}

	return jsoniter.ConfigFastest.MarshalToString(value)
}

type JSONScanner struct{}

func (s JSONScanner) Scan(value interface{}, src interface{}) error {
	if src == nil {
		return nil
	}
	if val := reflect.ValueOf(value); !val.IsValid() || (val.CanAddr() && val.IsNil()) {
		return nil
	}

	var bytes []byte
	switch v := src.(type) {
	case []byte:
		bytes = v
	case string:
		bytes = []byte(v)
	default:
		return fmt.Errorf("failed to unmarshal JSONB value: %v", src)
	}

	return jsoniter.ConfigFastest.Unmarshal(bytes, value)
}

type JSONDbDataType struct{}

func (JSONDbDataType) GormDBDataType(db *gorm.DB, field *schema.Field) string {
	switch db.Dialector.Name() {
	case "sqlite":
		return "JSON"
	case "mysql":
		return "JSON"
	case "postgres":
		return "JSONB"
	}
	return ""
}
