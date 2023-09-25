package db

import (
	dm "github.com/smilextay/gorm-dm"
    "gorm.io/driver/mysql"
    "gorm.io/driver/postgres"
    "gorm.io/driver/sqlite"
    "gorm.io/gorm"
)

const (
    PostgresDriverName = "postgres"
    MysqlDriverName    = "mysql"
    SqliteDriverName   = "sqlite"
    DmDriverName       = "dm"
)

type DB struct {
    *gorm.DB
    Config *Config
}

func New(cfg *Config) *DB {
    db := &DB{
        Config: cfg,
    }

    config := func(gdb *gorm.DB) *gorm.DB {
        if db.Config.Debug {
            gdb = gdb.Debug()
        }

        return gdb
    }

    if db.Config.Driver == PostgresDriverName {
        if d, err := gorm.Open(postgres.Open(db.Config.Dsn), &gorm.Config{}); err != nil {
            return nil
        } else {
            db.DB = d
            db.DB = config(d)
            return db
        }
    } else if db.Config.Driver == MysqlDriverName {
        if d, err := gorm.Open(mysql.Open(db.Config.Dsn), &gorm.Config{}); err != nil {
            return nil
        } else {
            db.DB = config(d)
            return db
        }
    } else if db.Config.Driver == SqliteDriverName {
        if d, err := gorm.Open(sqlite.Open(db.Config.Dsn), &gorm.Config{}); err != nil {
            return nil
        } else {
            db.DB = d
            db.DB = config(d)
            return db
        }
	} else if db.Config.Driver == DmDriverName {
		if d, err := gorm.Open(dm.Open(db.Config.Dsn), &gorm.Config{
			DisableForeignKeyConstraintWhenMigrating: true,
		}); err != nil {
			return nil
		} else {
			db.DB = config(d)
			return db
		}

    }
    return nil
}
