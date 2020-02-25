// Code generated by protoc-gen-go. DO NOT EDIT.
// source: user-level/v1/user-level.proto

package v1

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	grpc "google.golang.org/grpc"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type StringMessage struct {
	Value                string   `protobuf:"bytes,1,opt,name=value,proto3" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *StringMessage) Reset()         { *m = StringMessage{} }
func (m *StringMessage) String() string { return proto.CompactTextString(m) }
func (*StringMessage) ProtoMessage()    {}
func (*StringMessage) Descriptor() ([]byte, []int) {
	return fileDescriptor_79de12449813e521, []int{0}
}

func (m *StringMessage) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_StringMessage.Unmarshal(m, b)
}
func (m *StringMessage) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_StringMessage.Marshal(b, m, deterministic)
}
func (m *StringMessage) XXX_Merge(src proto.Message) {
	xxx_messageInfo_StringMessage.Merge(m, src)
}
func (m *StringMessage) XXX_Size() int {
	return xxx_messageInfo_StringMessage.Size(m)
}
func (m *StringMessage) XXX_DiscardUnknown() {
	xxx_messageInfo_StringMessage.DiscardUnknown(m)
}

var xxx_messageInfo_StringMessage proto.InternalMessageInfo

func (m *StringMessage) GetValue() string {
	if m != nil {
		return m.Value
	}
	return ""
}

func init() {
	proto.RegisterType((*StringMessage)(nil), "user_level.v1.StringMessage")
}

func init() { proto.RegisterFile("user-level/v1/user-level.proto", fileDescriptor_79de12449813e521) }

var fileDescriptor_79de12449813e521 = []byte{
	// 162 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x92, 0x2b, 0x2d, 0x4e, 0x2d,
	0xd2, 0xcd, 0x49, 0x2d, 0x4b, 0xcd, 0xd1, 0x2f, 0x33, 0xd4, 0x47, 0xf0, 0xf4, 0x0a, 0x8a, 0xf2,
	0x4b, 0xf2, 0x85, 0x78, 0x41, 0x22, 0xf1, 0x10, 0x91, 0x32, 0x43, 0x25, 0x55, 0x2e, 0xde, 0xe0,
	0x92, 0xa2, 0xcc, 0xbc, 0x74, 0xdf, 0xd4, 0xe2, 0xe2, 0xc4, 0xf4, 0x54, 0x21, 0x11, 0x2e, 0xd6,
	0xb2, 0xc4, 0x9c, 0xd2, 0x54, 0x09, 0x46, 0x05, 0x46, 0x0d, 0xce, 0x20, 0x08, 0xc7, 0x28, 0x81,
	0x4b, 0x20, 0xb4, 0x38, 0xb5, 0xc8, 0x07, 0xa4, 0x2d, 0x38, 0xb5, 0xa8, 0x2c, 0x33, 0x39, 0x55,
	0xc8, 0x87, 0x8b, 0xc7, 0x3d, 0xb5, 0x04, 0x2e, 0x2c, 0x24, 0xa3, 0x87, 0x62, 0xb4, 0x1e, 0x8a,
	0xb9, 0x52, 0x78, 0x65, 0x95, 0x18, 0x9c, 0xf4, 0xb9, 0x84, 0xcb, 0xf2, 0xf4, 0x12, 0x73, 0x32,
	0xcb, 0x52, 0x91, 0x54, 0x3a, 0x71, 0xc2, 0xcd, 0x8f, 0x42, 0x72, 0xb9, 0x7e, 0x99, 0x61, 0x12,
	0x1b, 0xd8, 0x3f, 0xc6, 0x80, 0x00, 0x00, 0x00, 0xff, 0xff, 0x82, 0xf3, 0x82, 0xc2, 0xf1, 0x00,
	0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// UserLevelServiceClient is the client API for UserLevelService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type UserLevelServiceClient interface {
	GetUserLevel(ctx context.Context, in *StringMessage, opts ...grpc.CallOption) (*StringMessage, error)
}

type userLevelServiceClient struct {
	cc *grpc.ClientConn
}

func NewUserLevelServiceClient(cc *grpc.ClientConn) UserLevelServiceClient {
	return &userLevelServiceClient{cc}
}

func (c *userLevelServiceClient) GetUserLevel(ctx context.Context, in *StringMessage, opts ...grpc.CallOption) (*StringMessage, error) {
	out := new(StringMessage)
	err := c.cc.Invoke(ctx, "/user_level.v1.UserLevelService/GetUserLevel", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// UserLevelServiceServer is the server API for UserLevelService service.
type UserLevelServiceServer interface {
	GetUserLevel(context.Context, *StringMessage) (*StringMessage, error)
}

func RegisterUserLevelServiceServer(s *grpc.Server, srv UserLevelServiceServer) {
	s.RegisterService(&_UserLevelService_serviceDesc, srv)
}

func _UserLevelService_GetUserLevel_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StringMessage)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UserLevelServiceServer).GetUserLevel(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/user_level.v1.UserLevelService/GetUserLevel",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UserLevelServiceServer).GetUserLevel(ctx, req.(*StringMessage))
	}
	return interceptor(ctx, in, info, handler)
}

var _UserLevelService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "user_level.v1.UserLevelService",
	HandlerType: (*UserLevelServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetUserLevel",
			Handler:    _UserLevelService_GetUserLevel_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "user-level/v1/user-level.proto",
}
