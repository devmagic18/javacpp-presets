// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class HDF5DataParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HDF5DataParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HDF5DataParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HDF5DataParameter position(long position) {
        return (HDF5DataParameter)super.position(position);
    }

  public HDF5DataParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public HDF5DataParameter(@Const @ByRef HDF5DataParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef HDF5DataParameter from);

  public native @ByRef @Name("operator =") HDF5DataParameter put(@Const @ByRef HDF5DataParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef HDF5DataParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const HDF5DataParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(HDF5DataParameter other);
  

  // implements Message ----------------------------------------------

  public native final HDF5DataParameter New();

  public native final HDF5DataParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef HDF5DataParameter from);
  public native void MergeFrom(@Const @ByRef HDF5DataParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional string source = 1;
  public native @Cast("bool") boolean has_source();
  public native void clear_source();
  @MemberGetter public static native int kSourceFieldNumber();
  public static final int kSourceFieldNumber = kSourceFieldNumber();
  public native @StdString BytePointer source();
  public native void set_source(@StdString BytePointer value);
  public native void set_source(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_source(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_source(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_source();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_source();
  public native void set_allocated_source(@StdString @Cast({"char*", "std::string*"}) BytePointer source);

  // optional uint32 batch_size = 2;
  public native @Cast("bool") boolean has_batch_size();
  public native void clear_batch_size();
  @MemberGetter public static native int kBatchSizeFieldNumber();
  public static final int kBatchSizeFieldNumber = kBatchSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int batch_size();
  public native void set_batch_size(@Cast("google::protobuf::uint32") int value);

  // optional bool shuffle = 3 [default = false];
  public native @Cast("bool") boolean has_shuffle();
  public native void clear_shuffle();
  @MemberGetter public static native int kShuffleFieldNumber();
  public static final int kShuffleFieldNumber = kShuffleFieldNumber();
  public native @Cast("bool") boolean shuffle();
  public native void set_shuffle(@Cast("bool") boolean value);
}
