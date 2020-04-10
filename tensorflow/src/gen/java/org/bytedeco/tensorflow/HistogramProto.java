// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class HistogramProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HistogramProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HistogramProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HistogramProto position(long position) {
        return (HistogramProto)super.position(position);
    }

  public HistogramProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public HistogramProto(@Const @ByRef HistogramProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef HistogramProto from);

  public native @ByRef @Name("operator =") HistogramProto put(@Const @ByRef HistogramProto from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef HistogramProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const HistogramProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(HistogramProto other);
  public native void Swap(HistogramProto other);
  

  // implements Message ----------------------------------------------

  public native HistogramProto New();

  public native HistogramProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef HistogramProto from);
  public native void MergeFrom(@Const @ByRef HistogramProto from);
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

  // repeated double bucket_limit = 6 [packed = true];
  public native int bucket_limit_size();
  public native void clear_bucket_limit();
  @MemberGetter public static native int kBucketLimitFieldNumber();
  public static final int kBucketLimitFieldNumber = kBucketLimitFieldNumber();
  public native double bucket_limit(int index);
  public native void set_bucket_limit(int index, double value);
  public native void add_bucket_limit(double value);

  // repeated double bucket = 7 [packed = true];
  public native int bucket_size();
  public native void clear_bucket();
  @MemberGetter public static native int kBucketFieldNumber();
  public static final int kBucketFieldNumber = kBucketFieldNumber();
  public native double bucket(int index);
  public native void set_bucket(int index, double value);
  public native void add_bucket(double value);

  // double min = 1;
  public native void clear_min();
  @MemberGetter public static native int kMinFieldNumber();
  public static final int kMinFieldNumber = kMinFieldNumber();
  public native double min();
  public native void set_min(double value);

  // double max = 2;
  public native void clear_max();
  @MemberGetter public static native int kMaxFieldNumber();
  public static final int kMaxFieldNumber = kMaxFieldNumber();
  public native double max();
  public native void set_max(double value);

  // double num = 3;
  public native void clear_num();
  @MemberGetter public static native int kNumFieldNumber();
  public static final int kNumFieldNumber = kNumFieldNumber();
  public native double num();
  public native void set_num(double value);

  // double sum = 4;
  public native void clear_sum();
  @MemberGetter public static native int kSumFieldNumber();
  public static final int kSumFieldNumber = kSumFieldNumber();
  public native double sum();
  public native void set_sum(double value);

  // double sum_squares = 5;
  public native void clear_sum_squares();
  @MemberGetter public static native int kSumSquaresFieldNumber();
  public static final int kSumSquaresFieldNumber = kSumSquaresFieldNumber();
  public native double sum_squares();
  public native void set_sum_squares(double value);
}
