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

var DeferStrategyStrategyNames = map[int32]string{
	0: "unspecified",
	1: "initially_deferred",
	2: "initially_immediate",
}

var DeferStrategyStrategyValues = map[string]DeferStrategy_Strategy{
	"unspecified":         DeferStrategy_STRATEGY_UNSPECIFIED,
	"initially_deferred":  DeferStrategy_STRATEGY_INITIALLY_DEFERRED,
	"initially_immediate": DeferStrategy_STRATEGY_INITIALLY_IMMEDIATE,
}

func (x DeferStrategy_Strategy) Format() string {
	v := int32(x)
	if s, ok := DeferStrategyStrategyNames[v]; ok {
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

func (x DeferStrategy_Strategy) ToString() string {
	return x.Format()
}

func (x *DeferStrategy_Strategy) Parse(value string) error {
	if x != nil && len(value) > 0 {
		if s, ok := DeferStrategyStrategyValues[value]; ok {
			*x = s
		} else {
			v := core.CaseStyler("snake")(value)
			if s, ok = DeferStrategyStrategyValues[v]; ok {
				*x = s
			} else {
				return fmt.Errorf("invalid DeferStrategy_Strategy: %s", value)
			}
		}
	}
	return nil
}

func ParseDeferStrategy_Strategy(value string) (DeferStrategy_Strategy, error) {
	var v DeferStrategy_Strategy
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}
