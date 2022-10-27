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
	"unsafe"

	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

func init() {
	core.RegisterJSONTypeDecoder("sql.PostfixUnaryExpr_Operator", &PostfixUnaryExprOperatorCodec{})
	core.RegisterJSONTypeEncoder("sql.PostfixUnaryExpr_Operator", &PostfixUnaryExprOperatorCodec{})
}

type PostfixUnaryExprOperatorCodec struct {
}

func (codec *PostfixUnaryExprOperatorCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	e := (*PostfixUnaryExpr_Operator)(ptr)
	if any.ValueType() == jsoniter.StringValue {
		if err := e.Parse(any.ToString()); err != nil {
			iter.ReportError("PostfixUnaryExprOperatorCodec.Decode", err.Error())
		}
	} else if any.ValueType() == jsoniter.NumberValue {
		value := any.ToInt32()
		if _, ok := PostfixUnaryExprOperatorNames[value]; ok {
			*e = PostfixUnaryExpr_Operator(value)
		} else {
			iter.ReportError("PostfixUnaryExprOperatorCodec.Decode", fmt.Sprintf("invalid enum value %d for PostfixUnaryExpr_Operator", value))
		}
	}
}

func (codec *PostfixUnaryExprOperatorCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	e := (*PostfixUnaryExpr_Operator)(ptr)
	stream.WriteString(e.Format())
}

func (codec *PostfixUnaryExprOperatorCodec) IsEmpty(ptr unsafe.Pointer) bool {
	e := (*PostfixUnaryExpr_Operator)(ptr)
	return e == nil || *e == 0
}