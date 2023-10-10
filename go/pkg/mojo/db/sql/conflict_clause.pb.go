// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/db/sql/conflict_clause.proto

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

type ConflictClause_Action int32

const (
	ConflictClause_ACTION_ROLLBACK ConflictClause_Action = 0
	ConflictClause_ACTION_ABORT    ConflictClause_Action = 1
	ConflictClause_ACTION_FAIL     ConflictClause_Action = 2
	ConflictClause_ACTION_IGNORE   ConflictClause_Action = 3
	ConflictClause_ACTION_REPLACE  ConflictClause_Action = 4
)

// Enum value maps for ConflictClause_Action.
var (
	ConflictClause_Action_name = map[int32]string{
		0: "ACTION_ROLLBACK",
		1: "ACTION_ABORT",
		2: "ACTION_FAIL",
		3: "ACTION_IGNORE",
		4: "ACTION_REPLACE",
	}
	ConflictClause_Action_value = map[string]int32{
		"ACTION_ROLLBACK": 0,
		"ACTION_ABORT":    1,
		"ACTION_FAIL":     2,
		"ACTION_IGNORE":   3,
		"ACTION_REPLACE":  4,
	}
)

func (x ConflictClause_Action) Enum() *ConflictClause_Action {
	p := new(ConflictClause_Action)
	*p = x
	return p
}

func (x ConflictClause_Action) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ConflictClause_Action) Descriptor() protoreflect.EnumDescriptor {
	return file_mojo_db_sql_conflict_clause_proto_enumTypes[0].Descriptor()
}

func (ConflictClause_Action) Type() protoreflect.EnumType {
	return &file_mojo_db_sql_conflict_clause_proto_enumTypes[0]
}

func (x ConflictClause_Action) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ConflictClause_Action.Descriptor instead.
func (ConflictClause_Action) EnumDescriptor() ([]byte, []int) {
	return file_mojo_db_sql_conflict_clause_proto_rawDescGZIP(), []int{0, 0}
}

type ConflictClause struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	StartPosition *lang.Position        `protobuf:"bytes,1,opt,name=start_position,json=startPosition,proto3" json:"startPosition,omitempty"`
	EndPosition   *lang.Position        `protobuf:"bytes,2,opt,name=end_position,json=endPosition,proto3" json:"endPosition,omitempty"`
	Kind          int64                 `protobuf:"varint,4,opt,name=kind,proto3" json:"kind,omitempty"`
	Implicit      bool                  `protobuf:"varint,5,opt,name=implicit,proto3" json:"implicit,omitempty"`
	Action        ConflictClause_Action `protobuf:"varint,10,opt,name=action,proto3,enum=mojo.db.sql.ConflictClause_Action" json:"action,omitempty"`
}

func (x *ConflictClause) Reset() {
	*x = ConflictClause{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_db_sql_conflict_clause_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ConflictClause) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ConflictClause) ProtoMessage() {}

func (x *ConflictClause) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_db_sql_conflict_clause_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ConflictClause.ProtoReflect.Descriptor instead.
func (*ConflictClause) Descriptor() ([]byte, []int) {
	return file_mojo_db_sql_conflict_clause_proto_rawDescGZIP(), []int{0}
}

func (x *ConflictClause) GetStartPosition() *lang.Position {
	if x != nil {
		return x.StartPosition
	}
	return nil
}

func (x *ConflictClause) GetEndPosition() *lang.Position {
	if x != nil {
		return x.EndPosition
	}
	return nil
}

func (x *ConflictClause) GetKind() int64 {
	if x != nil {
		return x.Kind
	}
	return 0
}

func (x *ConflictClause) GetImplicit() bool {
	if x != nil {
		return x.Implicit
	}
	return false
}

func (x *ConflictClause) GetAction() ConflictClause_Action {
	if x != nil {
		return x.Action
	}
	return ConflictClause_ACTION_ROLLBACK
}

var File_mojo_db_sql_conflict_clause_proto protoreflect.FileDescriptor

var file_mojo_db_sql_conflict_clause_proto_rawDesc = []byte{
	0x0a, 0x21, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x63, 0x6f,
	0x6e, 0x66, 0x6c, 0x69, 0x63, 0x74, 0x5f, 0x63, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c,
	0x1a, 0x18, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x2f, 0x63, 0x6c,
	0x61, 0x75, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x14, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2f, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xd9, 0x02, 0x0a, 0x0e, 0x43, 0x6f, 0x6e, 0x66, 0x6c, 0x69, 0x63, 0x74, 0x43, 0x6c, 0x61,
	0x75, 0x73, 0x65, 0x12, 0x3a, 0x0a, 0x0e, 0x73, 0x74, 0x61, 0x72, 0x74, 0x5f, 0x70, 0x6f, 0x73,
	0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2e, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e,
	0x52, 0x0d, 0x73, 0x74, 0x61, 0x72, 0x74, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12,
	0x36, 0x0a, 0x0c, 0x65, 0x6e, 0x64, 0x5f, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6c, 0x61, 0x6e,
	0x67, 0x2e, 0x50, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0b, 0x65, 0x6e, 0x64, 0x50,
	0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x6b, 0x69, 0x6e, 0x64, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x04, 0x6b, 0x69, 0x6e, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x69,
	0x6d, 0x70, 0x6c, 0x69, 0x63, 0x69, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x08, 0x69,
	0x6d, 0x70, 0x6c, 0x69, 0x63, 0x69, 0x74, 0x12, 0x3a, 0x0a, 0x06, 0x61, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x22, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x64,
	0x62, 0x2e, 0x73, 0x71, 0x6c, 0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x6c, 0x69, 0x63, 0x74, 0x43, 0x6c,
	0x61, 0x75, 0x73, 0x65, 0x2e, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x06, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x22, 0x67, 0x0a, 0x06, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x13, 0x0a,
	0x0f, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x52, 0x4f, 0x4c, 0x4c, 0x42, 0x41, 0x43, 0x4b,
	0x10, 0x00, 0x12, 0x10, 0x0a, 0x0c, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x41, 0x42, 0x4f,
	0x52, 0x54, 0x10, 0x01, 0x12, 0x0f, 0x0a, 0x0b, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x46,
	0x41, 0x49, 0x4c, 0x10, 0x02, 0x12, 0x11, 0x0a, 0x0d, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f,
	0x49, 0x47, 0x4e, 0x4f, 0x52, 0x45, 0x10, 0x03, 0x12, 0x12, 0x0a, 0x0e, 0x41, 0x43, 0x54, 0x49,
	0x4f, 0x4e, 0x5f, 0x52, 0x45, 0x50, 0x4c, 0x41, 0x43, 0x45, 0x10, 0x04, 0x42, 0x61, 0x0a, 0x18,
	0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2e, 0x64, 0x62, 0x2e, 0x73, 0x71, 0x6c, 0x42, 0x13, 0x43, 0x6f, 0x6e, 0x66, 0x6c, 0x69,
	0x63, 0x74, 0x43, 0x6c, 0x61, 0x75, 0x73, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x64, 0x62, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x64, 0x62, 0x2f, 0x73, 0x71, 0x6c, 0x3b, 0x73, 0x71, 0x6c, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_db_sql_conflict_clause_proto_rawDescOnce sync.Once
	file_mojo_db_sql_conflict_clause_proto_rawDescData = file_mojo_db_sql_conflict_clause_proto_rawDesc
)

func file_mojo_db_sql_conflict_clause_proto_rawDescGZIP() []byte {
	file_mojo_db_sql_conflict_clause_proto_rawDescOnce.Do(func() {
		file_mojo_db_sql_conflict_clause_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_db_sql_conflict_clause_proto_rawDescData)
	})
	return file_mojo_db_sql_conflict_clause_proto_rawDescData
}

var file_mojo_db_sql_conflict_clause_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_mojo_db_sql_conflict_clause_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_db_sql_conflict_clause_proto_goTypes = []interface{}{
	(ConflictClause_Action)(0), // 0: mojo.db.sql.ConflictClause.Action
	(*ConflictClause)(nil),     // 1: mojo.db.sql.ConflictClause
	(*lang.Position)(nil),      // 2: mojo.lang.Position
}
var file_mojo_db_sql_conflict_clause_proto_depIdxs = []int32{
	2, // 0: mojo.db.sql.ConflictClause.start_position:type_name -> mojo.lang.Position
	2, // 1: mojo.db.sql.ConflictClause.end_position:type_name -> mojo.lang.Position
	0, // 2: mojo.db.sql.ConflictClause.action:type_name -> mojo.db.sql.ConflictClause.Action
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_mojo_db_sql_conflict_clause_proto_init() }
func file_mojo_db_sql_conflict_clause_proto_init() {
	if File_mojo_db_sql_conflict_clause_proto != nil {
		return
	}
	file_mojo_db_sql_clause_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_db_sql_conflict_clause_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ConflictClause); i {
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
			RawDescriptor: file_mojo_db_sql_conflict_clause_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_db_sql_conflict_clause_proto_goTypes,
		DependencyIndexes: file_mojo_db_sql_conflict_clause_proto_depIdxs,
		EnumInfos:         file_mojo_db_sql_conflict_clause_proto_enumTypes,
		MessageInfos:      file_mojo_db_sql_conflict_clause_proto_msgTypes,
	}.Build()
	File_mojo_db_sql_conflict_clause_proto = out.File
	file_mojo_db_sql_conflict_clause_proto_rawDesc = nil
	file_mojo_db_sql_conflict_clause_proto_goTypes = nil
	file_mojo_db_sql_conflict_clause_proto_depIdxs = nil
}
