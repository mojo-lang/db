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

var NullExprOperatorNames = map[int32]string{
	0: "is_null",
	1: "not_null",
}

var NullExprOperatorValues = map[string]NullExpr_Operator{
	"is_null":  NullExpr_OPERATOR_IS_NULL,
	"not_null": NullExpr_OPERATOR_NOT_NULL,
}

func (x NullExpr_Operator) Format() string {
	v := int32(x)
	if s, ok := NullExprOperatorNames[v]; ok {
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

func (x NullExpr_Operator) ToString() string {
	return x.Format()
}

func (x *NullExpr_Operator) Parse(value string) error {
	if x != nil && len(value) > 0 {
		if s, ok := NullExprOperatorValues[value]; ok {
			*x = s
		} else {
			v := core.CaseStyler("snake")(value)
			if s, ok = NullExprOperatorValues[v]; ok {
				*x = s
			} else {
				return fmt.Errorf("invalid NullExpr_Operator: %s", value)
			}
		}
	}
	return nil
}

func ParseNullExpr_Operator(value string) (NullExpr_Operator, error) {
	var v NullExpr_Operator
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}