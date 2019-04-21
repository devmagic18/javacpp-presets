// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeOutput extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeOutput(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeOutput(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NodeOutput position(long position) {
        return (NodeOutput)super.position(position);
    }

  public NodeOutput() { super((Pointer)null); allocate(); }
  private native void allocate();

  public NodeOutput(@Const @ByRef NodeOutput from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef NodeOutput from);

  public native @ByRef @Name("operator =") NodeOutput put(@Const @ByRef NodeOutput from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef NodeOutput default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const NodeOutput internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(NodeOutput other);
  public native void Swap(NodeOutput other);
  

  // implements Message ----------------------------------------------

  public native NodeOutput New();

  public native NodeOutput New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef NodeOutput from);
  public native void MergeFrom(@Const @ByRef NodeOutput from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // .tensorflow.TensorDescription tensor_description = 3;
  public native @Cast("bool") boolean has_tensor_description();
  public native void clear_tensor_description();
  @MemberGetter public static native int kTensorDescriptionFieldNumber();
  public static final int kTensorDescriptionFieldNumber = kTensorDescriptionFieldNumber();
  public native @Const @ByRef TensorDescription tensor_description();
  public native TensorDescription release_tensor_description();
  public native TensorDescription mutable_tensor_description();
  public native void set_allocated_tensor_description(TensorDescription tensor_description);
  public native void unsafe_arena_set_allocated_tensor_description(
        TensorDescription tensor_description);
  public native TensorDescription unsafe_arena_release_tensor_description();

  // int32 slot = 1;
  public native void clear_slot();
  @MemberGetter public static native int kSlotFieldNumber();
  public static final int kSlotFieldNumber = kSlotFieldNumber();
  public native @Cast("google::protobuf::int32") int slot();
  public native void set_slot(@Cast("google::protobuf::int32") int value);
}