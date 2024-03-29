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
	core.RegisterJSONTypeDecoder("sql.Boolean", &BooleanCodec{})
	core.RegisterJSONTypeEncoder("sql.Boolean", &BooleanCodec{})
}

type BooleanCodec struct {
}

func (codec *BooleanCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	e := (*Boolean)(ptr)
	if any.ValueType() == jsoniter.StringValue {
		if err := e.Parse(any.ToString()); err != nil {
			iter.ReportError("BooleanCodec.Decode", err.Error())
		}
	} else if any.ValueType() == jsoniter.NumberValue {
		value := any.ToInt32()
		if _, ok := BooleanNames[value]; ok {
			*e = Boolean(value)
		} else {
			iter.ReportError("BooleanCodec.Decode", fmt.Sprintf("invalid enum value %d for Boolean", value))
		}
	}
}

func (codec *BooleanCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	e := (*Boolean)(ptr)
	stream.WriteString(e.Format())
}

func (codec *BooleanCodec) IsEmpty(ptr unsafe.Pointer) bool {
	e := (*Boolean)(ptr)
	return e == nil || *e == 0
}
