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

var ForeignKeyClauseTriggerActionActionNames = map[int32]string{
	0: "cascade",
	1: "set_null",
	2: "set_default",
	3: "restrict",
	4: "no_action",
}

var ForeignKeyClauseTriggerActionActionValues = map[string]ForeignKeyClause_TriggerAction_Action{
	"cascade":     ForeignKeyClause_TriggerAction_ACTION_CASCADE,
	"set_null":    ForeignKeyClause_TriggerAction_ACTION_SET_NULL,
	"set_default": ForeignKeyClause_TriggerAction_ACTION_SET_DEFAULT,
	"restrict":    ForeignKeyClause_TriggerAction_ACTION_RESTRICT,
	"no_action":   ForeignKeyClause_TriggerAction_ACTION_NO_ACTION,
}

func (x ForeignKeyClause_TriggerAction_Action) Format() string {
	v := int32(x)
	if s, ok := ForeignKeyClauseTriggerActionActionNames[v]; ok {
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

func (x ForeignKeyClause_TriggerAction_Action) ToString() string {
	return x.Format()
}

func (x *ForeignKeyClause_TriggerAction_Action) Parse(value string) error {
	if x != nil && len(value) > 0 {
		if s, ok := ForeignKeyClauseTriggerActionActionValues[value]; ok {
			*x = s
		} else {
			v := core.CaseStyler("snake")(value)
			if s, ok = ForeignKeyClauseTriggerActionActionValues[v]; ok {
				*x = s
			} else {
				return fmt.Errorf("invalid ForeignKeyClause_TriggerAction_Action: %s", value)
			}
		}
	}
	return nil
}

func ParseForeignKeyClause_TriggerAction_Action(value string) (ForeignKeyClause_TriggerAction_Action, error) {
	var v ForeignKeyClause_TriggerAction_Action
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}
