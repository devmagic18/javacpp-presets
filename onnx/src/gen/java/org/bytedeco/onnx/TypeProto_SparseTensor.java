// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TypeProto_SparseTensor extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeProto_SparseTensor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeProto_SparseTensor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypeProto_SparseTensor position(long position) {
        return (TypeProto_SparseTensor)super.position(position);
    }

  public TypeProto_SparseTensor() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TypeProto_SparseTensor(@Const @ByRef TypeProto_SparseTensor from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TypeProto_SparseTensor from);

  public native @ByRef @Name("operator =") TypeProto_SparseTensor put(@Const @ByRef TypeProto_SparseTensor from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef TypeProto_SparseTensor default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TypeProto_SparseTensor internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TypeProto_SparseTensor other);
  

  // implements Message ----------------------------------------------

  public native TypeProto_SparseTensor New();

  public native TypeProto_SparseTensor New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TypeProto_SparseTensor from);
  public native void MergeFrom(@Const @ByRef TypeProto_SparseTensor from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional .onnx.TensorShapeProto shape = 2;
  public native @Cast("bool") boolean has_shape();
  public native void clear_shape();
  @MemberGetter public static native int kShapeFieldNumber();
  public static final int kShapeFieldNumber = kShapeFieldNumber();
  public native @Const @ByRef TensorShapeProto shape();
  public native TensorShapeProto release_shape();
  public native TensorShapeProto mutable_shape();
  public native void set_allocated_shape(TensorShapeProto shape);

  // optional int32 elem_type = 1;
  public native @Cast("bool") boolean has_elem_type();
  public native void clear_elem_type();
  @MemberGetter public static native int kElemTypeFieldNumber();
  public static final int kElemTypeFieldNumber = kElemTypeFieldNumber();
  public native @Cast("google::protobuf::int32") int elem_type();
  public native void set_elem_type(@Cast("google::protobuf::int32") int value);
}
