// Copyright 2022 Mojo-lang.org
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

@discriminator('@type')
@label_format('{}')
type Expression = lang.NullLiteralExpr @1
                | lang.BoolLiteralExpr @2
                | lang.IntegerLiteralExpr @3
                | lang.FloatLiteralExpr @4
                | lang.StringLiteralExpr @5
                | BlobLiteralExpr @6
                | IdentifierExpr @7
                | BindParameterExpr @10
                | ColumnRefExpr @11
                | PrefixUnaryExpr @15
                | PostfixUnaryExpr @16
                | BinaryExpr @17
                | BetweenExpr @18
                | InExpr @19
                | CaseExpr @20
                | FunctionCallExpr @21
                | SubqueryExpr @30
