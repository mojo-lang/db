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

type ValuesClause: Clause {

}

type IntoClause: Clause {

}

type UpsertClause: Clause {

}

type InsertStmt: DataManipulationStmt {
    with: WithClause @10

    into: IntoClause      @11
    values: ValuesClause  @12
    subquery: SelectStmt  @13

    upsert: UpsertClause  @15
    returning: ReturningClause @16
}