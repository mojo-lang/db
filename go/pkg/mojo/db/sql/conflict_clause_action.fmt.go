// Code generated by mojo. DO NOT EDIT.
// Rerunning mojo will overwrite this file.
//
// Copyright 2021 Mojo-lang.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package sql

import (
	"fmt"
	"strconv"
	"strings"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

var ConflictClauseActionNames = map[int32]string{
	0: "rollback",
	1: "abort",
	2: "fail",
	3: "ignore",
	4: "replace",
}

var ConflictClauseActionValues = map[string]ConflictClause_Action{
	"rollback": ConflictClause_ACTION_ROLLBACK,
	"abort":    ConflictClause_ACTION_ABORT,
	"fail":     ConflictClause_ACTION_FAIL,
	"ignore":   ConflictClause_ACTION_IGNORE,
	"replace":  ConflictClause_ACTION_REPLACE,
}

func (x ConflictClause_Action) Format() string {
	v := int32(x)
	if s, ok := ConflictClauseActionNames[v]; ok {
		if v == 0 && "unspecified" == strings.ToLower(s) {
			return ""
		}
		return s
	}
	if v == 0 {
		return ""
	}
	return strconv.Itoa(int(v))
}

func (x ConflictClause_Action) ToString() string {
	return x.Format()
}

func (x *ConflictClause_Action) Parse(value string) error {
	if x != nil && len(value) > 0 {
		if s, ok := ConflictClauseActionValues[value]; ok {
			*x = s
		} else {
			v := core.CaseStyler("snake")(value)
			if s, ok = ConflictClauseActionValues[v]; ok {
				*x = s
			} else {
				return fmt.Errorf("invalid ConflictClause_Action: %s", value)
			}
		}
	}
	return nil
}

func ParseConflictClause_Action(value string) (ConflictClause_Action, error) {
	var v ConflictClause_Action
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}
