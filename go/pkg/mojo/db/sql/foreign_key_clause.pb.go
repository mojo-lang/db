// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: mojo/db/sql/foreign_key_clause.proto

package sql

import (
	lang "github.com/mojo-lang/lang/go/pkg/mojo/lang"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ForeignKeyClause_MatchType int32

const (
	ForeignKeyClause_MATCH_TYPE_UNSPECIFIED ForeignKeyClause_MatchType = 0
	ForeignKeyClause_MATCH_TYPE_SIMPLE      ForeignKeyClause_MatchType = 1
	ForeignKeyClause_MATCH_TYPE_PARTIAL     ForeignKeyClause_MatchType = 2
	ForeignKeyClause_MATCH_TYPE_FULL        ForeignKeyClause_MatchType = 3
)

// Enum value maps for ForeignKeyClause_MatchType.
var (
	ForeignKeyClause_MatchType_name = map[int32]string{
		0: "MATCH_TYPE_UNSPECIFIED",
		1: "MATCH_TYPE_SIMPLE",
		2: "MATCH_TYPE_PARTIAL",
		3: "MATCH_TYPE_FULL",
	}
	ForeignKeyClause_MatchType_value = map[string]int32{
		"MATCH_TYPE_UNSPECIFIED": 0,
		"MATCH_TYPE_SIMPLE":      1,
		"MATCH_TYPE_PARTIAL":     2,
		"MATCH_TYPE_FULL":        3,
	}
)

func (x ForeignKeyClause_MatchType) Enum() *ForeignKeyClause_MatchType {
	p := new(ForeignKeyClause_MatchType)
	*p = x
	return p
}

func (x ForeignKeyClause_MatchType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ForeignKeyClause_MatchType) Descriptor() protoreflect.EnumDescriptor {
	return file_mojo_db_sql_foreign_key_clause_proto_enumTypes[0].Descriptor()
}

func (ForeignKeyClause_MatchType) Type() protoreflect.EnumType {
	return &file_mojo_db_sql_foreign_key_clause_proto_enumTypes[0]
}

func (x ForeignKeyClause_MatchType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ForeignKeyClause_MatchType.Descriptor instead.
func (ForeignKeyClause_MatchType) EnumDescriptor() ([]byte, []int) {
	return file_mojo_db_sql_foreign_key_clause_proto_rawDescGZIP(), []int{0, 0}
}

type ForeignKeyClause_TriggerAction_Trigger int32

const (
	ForeignKeyClause_TriggerAction_TRIGGER_UPDATED ForeignKeyClause_TriggerAction_Trigger = 0
	ForeignKeyClause_TriggerAction_TRIGGER_DELETED ForeignKeyClause_TriggerAction_Trigger = 1
)

// Enum value maps for ForeignKeyClause_TriggerAction_Trigger.
var (
	ForeignKeyClause_TriggerAction_Trigger_name = map[int32]string{
		0: "TRIGGER_UPDATED",
		1: "TRIGGER_DELETED",
	}
	ForeignKeyClause_TriggerAction_Trigger_value = map[string]int32{
		"TRIGGER_UPDATED": 0,
		"TRIGGER_DELETED": 1,
	}
)

func (x ForeignKeyClause_TriggerAction_Trigger) Enum() *ForeignKeyClause_TriggerAction_Trigger {
	p := new(ForeignKeyClause_TriggerAction_Trigger)
	*p = x
	return p
}

func (x ForeignKeyClause_TriggerAction_Trigger) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ForeignKeyClause_TriggerAction_Trigger) Descriptor() protoreflect.EnumDescriptor {
	return file_mojo_db_sql_foreign_key_clause_proto_enumTypes[1].Descriptor()
}

func (ForeignKeyClause_TriggerAction_Trigger) Type() protoreflect.EnumType {
	return &file_mojo_db_sql_foreign_key_clause_proto_enumTypes[1]
}

func (x ForeignKeyClause_TriggerAction_Trigger) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ForeignKeyClause_TriggerAction_Trigger.Descriptor instead.
func (ForeignKeyClause_TriggerAction_Trigger) EnumDescriptor() ([]byte, []int) {
	return file_mojo_db_sql_foreign_key_clause_proto_rawDescGZIP(), []int{0, 0, 0}
}

type ForeignKeyClause_TriggerAction_Action int32

const (
	ForeignKeyClause_TriggerAction_ACTION_CASCADE     ForeignKeyClause_TriggerAction_Action = 0
	ForeignKeyClause_TriggerAction_ACTION_SET_NULL    ForeignKeyClause_TriggerAction_Action = 1
	ForeignKeyClause_TriggerAction_ACTION_SET_DEFAULT ForeignKeyClause_TriggerAction_Action = 2
	ForeignKeyClause_TriggerAction_ACTION_RESTRICT    ForeignKeyClause_TriggerAction_Action = 3
	ForeignKeyClause_TriggerAction_ACTION_NO_ACTION   ForeignKeyClause_TriggerAction_Action = 4
)

// Enum value maps for ForeignKeyClause_TriggerAction_Action.
var (
	ForeignKeyClause_TriggerAction_Action_name = map[int32]string{
		0: "ACTION_CASCADE",
		1: "ACTION_SET_NULL",
		2: "ACTION_SET_DEFAULT",
		3: "ACTION_RESTRICT",
		4: "ACTION_NO_ACTION",
	}
	ForeignKeyClause_TriggerAction_Action_value = map[string]int32{
		"ACTION_CASCADE":     0,
		"ACTION_SET_NULL":    1,
		"ACTION_SET_DEFAULT": 2,
		"ACTION_RESTRICT":    3,
		"ACTION_NO_ACTION":   4,
	}
)

func (x ForeignKeyClause_TriggerAction_Action) Enum() *ForeignKeyClause_TriggerAction_Action {
	p := new(ForeignKeyClause_TriggerAction_Action)
	*p = x
	return p
}

func (x ForeignKeyClause_TriggerAction_Action) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ForeignKeyClause_TriggerAction_Action) Descriptor() protoreflect.EnumDescriptor {
	return file_mojo_db_sql_foreign_key_clause_proto_enumTypes[2].Descriptor()
}

func (ForeignKeyClause_TriggerAction_Action) Type() protoreflect.EnumType {
	return &file_mojo_db_sql_foreign_key_clause_proto_enumTypes[2]
}

func (x ForeignKeyClause_TriggerAction_Action) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ForeignKeyClause_TriggerAction_Action.Descriptor instead.
func (ForeignKeyClause_TriggerAction_Action) EnumDescriptor() ([]byte, []int) {
	return file_mojo_db_sql_foreign_key_clause_proto_rawDescGZIP(), []int{0, 0, 1}
}

type ForeignKeyClause struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	StartPosition *lang.Position                  `protobuf:"bytes,1,opt,name=start_position,json=startPosition,proto3" json:"startPosition,omitempty"`
	EndPosition   *lang.Position                  `protobuf:"bytes,2,opt,name=end_position,json=endPosition,proto3" json:"endPosition,omitempty"`
	Kind          int64                           `protobuf:"varint,4,opt,name=kind,proto3" json:"kind,omitempty"`
	Implicit      bool                            `protobuf:"varint,5,opt,name=implicit,proto3" json:"implicit,omitempty"`
	Table         string                          `protobuf:"bytes,10,opt,name=table,proto3" json:"table,omitempty"`
	Columns       []string                        `protobuf:"bytes,11,rep,name=columns,proto3" json:"columns,omitempty"`
	Match         ForeignKeyClause_MatchType      `protobuf:"varint,12,opt,name=match,proto3,enum=mojo.db.sql.ForeignKeyClause_MatchType" json:"match,omitempty"`
	Action        *ForeignKeyClause_TriggerAction `protobuf:"bytes,13,opt,name=action,proto3" json:"action,omitempty"`
	DeferStrategy *DeferStrategy                  `protobuf:"bytes,15,opt,name=defer_strategy,json=deferStrategy,proto3" json:"deferStrategy,omitempty"`
}

func (x *ForeignKeyClause) Reset() {
	*x = ForeignKeyClause{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_foreign_key_clause_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ForeignKeyClause) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ForeignKeyClause) ProtoMessage() {}

func (x *ForeignKeyClause) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_foreign_key_clause_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ForeignKeyClause.ProtoReflect.Descriptor instead.
func (*ForeignKeyClause) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_foreign_key_clause_proto_rawDescGZIP(), []int{0}
}

func (x *ForeignKeyClause) GetStartPosition() *lang.Position {
	if x != nil {
		return x.StartPosition
	}
	return nil
}

func (x *ForeignKeyClause) GetEndPosition() *lang.Position {
	if x != nil {
		return x.EndPosition
	}
	return nil
}

func (x *ForeignKeyClause) GetKind() int64 {
	if x != nil {
		return x.Kind
	}
	return 0
}

func (x *ForeignKeyClause) GetImplicit() bool {
	if x != nil {
		return x.Implicit
	}
	return false
}

func (x *ForeignKeyClause) GetTable() string {
	if x != nil {
		return x.Table
	}
	return ""
}

func (x *ForeignKeyClause) GetColumns() []string {
	if x != nil {
		return x.Columns
	}
	return nil
}

func (x *ForeignKeyClause) GetMatch() ForeignKeyClause_MatchType {
	if x != nil {
		return x.Match
	}
	return ForeignKeyClause_MATCH_TYPE_UNSPECIFIED
}

func (x *ForeignKeyClause) GetAction() *ForeignKeyClause_TriggerAction {
	if x != nil {
		return x.Action
	}
	return nil
}

func (x *ForeignKeyClause) GetDeferStrategy() *DeferStrategy {
	if x != nil {
		return x.DeferStrategy
	}
	return nil
}

type ForeignKeyClause_TriggerAction struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Trigger ForeignKeyClause_TriggerAction_Trigger `protobuf:"varint,1,opt,name=trigger,proto3,enum=mojo.db.sql.ForeignKeyClause_TriggerAction_Trigger" json:"trigger,omitempty"`
	Action  ForeignKeyClause_TriggerAction_Action  `protobuf:"varint,2,opt,name=action,proto3,enum=mojo.db.sql.ForeignKeyClause_TriggerAction_Action" json:"action,omitempty"`
}

func (x *ForeignKeyClause_TriggerAction) Reset() {
	*x = ForeignKeyClause_TriggerAction{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_foreign_key_clause_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ForeignKeyClause_TriggerAction) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ForeignKeyClause_TriggerAction) ProtoMessage() {}

func (x *ForeignKeyClause_TriggerAction) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_foreign_key_clause_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ForeignKeyClause_TriggerAction.ProtoReflect.Descriptor instead.
func (*ForeignKeyClause_TriggerAction) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_foreign_key_clause_proto_rawDescGZIP(), []int{0, 0}
}

func (x *ForeignKeyClause_TriggerAction) GetTrigger() ForeignKeyClause_TriggerAction_Trigger {
	if x != nil {
		return x.Trigger
	}
	return ForeignKeyClause_TriggerAction_TRIGGER_UPDATED
}

func (x *ForeignKeyClause_TriggerAction) GetAction() ForeignKeyClause_TriggerAction_Action {
	if x != nil {
		return x.Action
	}
	return ForeignKeyClause_TriggerAction_ACTION_CASCADE
}

var File_mojo_db_sql_foreign_key_clause_proto protoreflect.FileDescriptor

var file_mojo_db_sql_foreign_key_clause_proto_rawDesc = []byte{
	0x0a, 0x24, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x66, 0x6f,
	0x72, 0x65, 0x69, 0x67, 0x6e, 0x5f, 0x6b, 0x65, 0x79, 0x5f, 0x63, 0x6c, 0x61, 0x75, 0x73, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e,
	0x73, 0x71, 0x6c, 0x1a, 0x18, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c,
	0x2f, 0x63, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x64, 0x65, 0x66, 0x65, 0x72,
	0x5f, 0x73, 0x74, 0x72, 0x61, 0x74, 0x65, 0x67, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x14, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x6c, 0x61, 0x6e, 0x67, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xf2, 0x06, 0x0a, 0x10, 0x46, 0x6f, 0x72, 0x65, 0x69, 0x67,
	0x6e, 0x4b, 0x65, 0x79, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x12, 0x3a, 0x0a, 0x0e, 0x73, 0x74,
	0x61, 0x72, 0x74, 0x5f, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x50,
	0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0d, 0x73, 0x74, 0x61, 0x72, 0x74, 0x50, 0x6f,
	0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x36, 0x0a, 0x0c, 0x65, 0x6e, 0x64, 0x5f, 0x70, 0x6f,
	0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2e, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x52, 0x0b, 0x65, 0x6e, 0x64, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x12,
	0x0a, 0x04, 0x6b, 0x69, 0x6e, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x04, 0x6b, 0x69,
	0x6e, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x69, 0x6d, 0x70, 0x6c, 0x69, 0x63, 0x69, 0x74, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x08, 0x69, 0x6d, 0x70, 0x6c, 0x69, 0x63, 0x69, 0x74, 0x12, 0x14,
	0x0a, 0x05, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74,
	0x61, 0x62, 0x6c, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x18,
	0x0b, 0x20, 0x03, 0x28, 0x09, 0x52, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x12, 0x3d,
	0x0a, 0x05, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x27, 0x2e,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x46, 0x6f, 0x72, 0x65,
	0x69, 0x67, 0x6e, 0x4b, 0x65, 0x79, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x4d, 0x61, 0x74,
	0x63, 0x68, 0x54, 0x79, 0x70, 0x65, 0x52, 0x05, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x12, 0x43, 0x0a,
	0x06, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2b, 0x2e,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x46, 0x6f, 0x72, 0x65,
	0x69, 0x67, 0x6e, 0x4b, 0x65, 0x79, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x54, 0x72, 0x69,
	0x67, 0x67, 0x65, 0x72, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x06, 0x61, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x12, 0x41, 0x0a, 0x0e, 0x64, 0x65, 0x66, 0x65, 0x72, 0x5f, 0x73, 0x74, 0x72, 0x61,
	0x74, 0x65, 0x67, 0x79, 0x18, 0x0f, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x44, 0x65, 0x66, 0x65, 0x72, 0x53, 0x74,
	0x72, 0x61, 0x74, 0x65, 0x67, 0x79, 0x52, 0x0d, 0x64, 0x65, 0x66, 0x65, 0x72, 0x53, 0x74, 0x72,
	0x61, 0x74, 0x65, 0x67, 0x79, 0x1a, 0xd5, 0x02, 0x0a, 0x0d, 0x54, 0x72, 0x69, 0x67, 0x67, 0x65,
	0x72, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x4d, 0x0a, 0x07, 0x74, 0x72, 0x69, 0x67, 0x67,
	0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x33, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x46, 0x6f, 0x72, 0x65, 0x69, 0x67, 0x6e, 0x4b, 0x65,
	0x79, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x54, 0x72, 0x69, 0x67, 0x67, 0x65, 0x72, 0x41,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x54, 0x72, 0x69, 0x67, 0x67, 0x65, 0x72, 0x52, 0x07, 0x74,
	0x72, 0x69, 0x67, 0x67, 0x65, 0x72, 0x12, 0x4a, 0x0a, 0x06, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x32, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62,
	0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x46, 0x6f, 0x72, 0x65, 0x69, 0x67, 0x6e, 0x4b, 0x65, 0x79, 0x43,
	0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x54, 0x72, 0x69, 0x67, 0x67, 0x65, 0x72, 0x41, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x2e, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x06, 0x61, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x22, 0x33, 0x0a, 0x07, 0x54, 0x72, 0x69, 0x67, 0x67, 0x65, 0x72, 0x12, 0x13, 0x0a,
	0x0f, 0x54, 0x52, 0x49, 0x47, 0x47, 0x45, 0x52, 0x5f, 0x55, 0x50, 0x44, 0x41, 0x54, 0x45, 0x44,
	0x10, 0x00, 0x12, 0x13, 0x0a, 0x0f, 0x54, 0x52, 0x49, 0x47, 0x47, 0x45, 0x52, 0x5f, 0x44, 0x45,
	0x4c, 0x45, 0x54, 0x45, 0x44, 0x10, 0x01, 0x22, 0x74, 0x0a, 0x06, 0x41, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x12, 0x12, 0x0a, 0x0e, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x43, 0x41, 0x53, 0x43,
	0x41, 0x44, 0x45, 0x10, 0x00, 0x12, 0x13, 0x0a, 0x0f, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f,
	0x53, 0x45, 0x54, 0x5f, 0x4e, 0x55, 0x4c, 0x4c, 0x10, 0x01, 0x12, 0x16, 0x0a, 0x12, 0x41, 0x43,
	0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x45, 0x54, 0x5f, 0x44, 0x45, 0x46, 0x41, 0x55, 0x4c, 0x54,
	0x10, 0x02, 0x12, 0x13, 0x0a, 0x0f, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x52, 0x45, 0x53,
	0x54, 0x52, 0x49, 0x43, 0x54, 0x10, 0x03, 0x12, 0x14, 0x0a, 0x10, 0x41, 0x43, 0x54, 0x49, 0x4f,
	0x4e, 0x5f, 0x4e, 0x4f, 0x5f, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x10, 0x04, 0x22, 0x6b, 0x0a,
	0x09, 0x4d, 0x61, 0x74, 0x63, 0x68, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1a, 0x0a, 0x16, 0x4d, 0x41,
	0x54, 0x43, 0x48, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49,
	0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x15, 0x0a, 0x11, 0x4d, 0x41, 0x54, 0x43, 0x48, 0x5f,
	0x54, 0x59, 0x50, 0x45, 0x5f, 0x53, 0x49, 0x4d, 0x50, 0x4c, 0x45, 0x10, 0x01, 0x12, 0x16, 0x0a,
	0x12, 0x4d, 0x41, 0x54, 0x43, 0x48, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x50, 0x41, 0x52, 0x54,
	0x49, 0x41, 0x4c, 0x10, 0x02, 0x12, 0x13, 0x0a, 0x0f, 0x4d, 0x41, 0x54, 0x43, 0x48, 0x5f, 0x54,
	0x59, 0x50, 0x45, 0x5f, 0x46, 0x55, 0x4c, 0x4c, 0x10, 0x03, 0x42, 0x64, 0x0a, 0x19, 0x6f, 0x72,
	0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x42, 0x15, 0x46, 0x6f, 0x72, 0x65, 0x69, 0x67, 0x6e,
	0x4b, 0x65, 0x79, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01,
	0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67,
	0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x3b, 0x73, 0x71, 0x6c,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_db_sql_foreign_key_clause_proto_rawDescOnce sync.Once
	file_mojo_db_sql_foreign_key_clause_proto_rawDescData = file_mojo_db_sql_foreign_key_clause_proto_rawDesc
)

func file_mojo_db_sql_foreign_key_clause_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_foreign_key_clause_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_foreign_key_clause_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_foreign_key_clause_proto_rawDescData)
	})
	return file_mojo_db_sql_foreign_key_clause_proto_rawDescData
}

var file_mojo_db_sql_foreign_key_clause_proto_enumTypes = make([]protoimpl.EnumInfo, 3)
var file_mojo_db_sql_foreign_key_clause_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_mojo_db_sql_foreign_key_clause_proto_goTypes = []interface{}{
	(ForeignKeyClause_MatchType)(0),             // 0: mojo.db.sql.ForeignKeyClause.MatchType
	(ForeignKeyClause_TriggerAction_Trigger)(0), // 1: mojo.db.sql.ForeignKeyClause.TriggerAction.Trigger
	(ForeignKeyClause_TriggerAction_Action)(0),  // 2: mojo.db.sql.ForeignKeyClause.TriggerAction.Action
	(*ForeignKeyClause)(nil),                    // 3: mojo.db.sql.ForeignKeyClause
	(*ForeignKeyClause_TriggerAction)(nil),      // 4: mojo.db.sql.ForeignKeyClause.TriggerAction
	(*lang.Position)(nil),                       // 5: mojo.lang.Position
	(*DeferStrategy)(nil),                       // 6: mojo.db.sql.DeferStrategy
}
var file_mojo_db_sql_foreign_key_clause_proto_depIdxs = []int32{
	5, // 0: mojo.db.sql.ForeignKeyClause.start_position:type_name -> mojo.lang.Position
	5, // 1: mojo.db.sql.ForeignKeyClause.end_position:type_name -> mojo.lang.Position
	0, // 2: mojo.db.sql.ForeignKeyClause.match:type_name -> mojo.db.sql.ForeignKeyClause.MatchType
	4, // 3: mojo.db.sql.ForeignKeyClause.action:type_name -> mojo.db.sql.ForeignKeyClause.TriggerAction
	6, // 4: mojo.db.sql.ForeignKeyClause.defer_strategy:type_name -> mojo.db.sql.DeferStrategy
	1, // 5: mojo.db.sql.ForeignKeyClause.TriggerAction.trigger:type_name -> mojo.db.sql.ForeignKeyClause.TriggerAction.Trigger
	2, // 6: mojo.db.sql.ForeignKeyClause.TriggerAction.action:type_name -> mojo.db.sql.ForeignKeyClause.TriggerAction.Action
	7, // [7:7] is the sub-list for method output_type
	7, // [7:7] is the sub-list for method input_type
	7, // [7:7] is the sub-list for extension type_name
	7, // [7:7] is the sub-list for extension extendee
	0, // [0:7] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_foreign_key_clause_proto_init() }
func file_mojo_db_sql_foreign_key_clause_proto_init() {
	if File_mojo_db_sql_foreign_key_clause_proto != nil {
		return
	}
	file_mojo_db_sql_clause_proto_init()
	file_mojo_db_sql_defer_strategy_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_db_sql_foreign_key_clause_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ForeignKeyClause); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_mojo_db_sql_foreign_key_clause_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ForeignKeyClause_TriggerAction); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_db_sql_foreign_key_clause_proto_rawDesc,
			NumEnums:      3,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_foreign_key_clause_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_foreign_key_clause_proto_depIdxs,
		EnumInfos:         file_mojo_db_sql_foreign_key_clause_proto_enumTypes,
		MessageInfos:      file_mojo_db_sql_foreign_key_clause_proto_msgTypes,
	}.Build()
	File_mojo_db_sql_foreign_key_clause_proto = out.File
	file_mojo_db_sql_foreign_key_clause_proto_rawDesc = nil
	file_mojo_db_sql_foreign_key_clause_proto_goTypes = nil
	file_mojo_db_sql_foreign_key_clause_proto_depIdxs = nil
}