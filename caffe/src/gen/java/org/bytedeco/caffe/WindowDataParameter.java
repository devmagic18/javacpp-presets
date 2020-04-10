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
public class WindowDataParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WindowDataParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WindowDataParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public WindowDataParameter position(long position) {
        return (WindowDataParameter)super.position(position);
    }

  public WindowDataParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public WindowDataParameter(@Const @ByRef WindowDataParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef WindowDataParameter from);

  public native @ByRef @Name("operator =") WindowDataParameter put(@Const @ByRef WindowDataParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef WindowDataParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const WindowDataParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(WindowDataParameter other);
  

  // implements Message ----------------------------------------------

  public native final WindowDataParameter New();

  public native final WindowDataParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef WindowDataParameter from);
  public native void MergeFrom(@Const @ByRef WindowDataParameter from);
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

  // optional string mean_file = 3;
  public native @Cast("bool") boolean has_mean_file();
  public native void clear_mean_file();
  @MemberGetter public static native int kMeanFileFieldNumber();
  public static final int kMeanFileFieldNumber = kMeanFileFieldNumber();
  public native @StdString BytePointer mean_file();
  public native void set_mean_file(@StdString BytePointer value);
  public native void set_mean_file(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_mean_file(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_mean_file(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_mean_file();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_mean_file();
  public native void set_allocated_mean_file(@StdString @Cast({"char*", "std::string*"}) BytePointer mean_file);

  // optional string crop_mode = 11 [default = "warp"];
  public native @Cast("bool") boolean has_crop_mode();
  public native void clear_crop_mode();
  @MemberGetter public static native int kCropModeFieldNumber();
  public static final int kCropModeFieldNumber = kCropModeFieldNumber();
  public native @StdString BytePointer crop_mode();
  public native void set_crop_mode(@StdString BytePointer value);
  public native void set_crop_mode(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_crop_mode(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_crop_mode(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_crop_mode();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_crop_mode();
  public native void set_allocated_crop_mode(@StdString @Cast({"char*", "std::string*"}) BytePointer crop_mode);

  // optional string root_folder = 13 [default = ""];
  public native @Cast("bool") boolean has_root_folder();
  public native void clear_root_folder();
  @MemberGetter public static native int kRootFolderFieldNumber();
  public static final int kRootFolderFieldNumber = kRootFolderFieldNumber();
  public native @StdString BytePointer root_folder();
  public native void set_root_folder(@StdString BytePointer value);
  public native void set_root_folder(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_root_folder(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_root_folder(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_root_folder();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_root_folder();
  public native void set_allocated_root_folder(@StdString @Cast({"char*", "std::string*"}) BytePointer root_folder);

  // optional uint32 batch_size = 4;
  public native @Cast("bool") boolean has_batch_size();
  public native void clear_batch_size();
  @MemberGetter public static native int kBatchSizeFieldNumber();
  public static final int kBatchSizeFieldNumber = kBatchSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int batch_size();
  public native void set_batch_size(@Cast("google::protobuf::uint32") int value);

  // optional uint32 crop_size = 5 [default = 0];
  public native @Cast("bool") boolean has_crop_size();
  public native void clear_crop_size();
  @MemberGetter public static native int kCropSizeFieldNumber();
  public static final int kCropSizeFieldNumber = kCropSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int crop_size();
  public native void set_crop_size(@Cast("google::protobuf::uint32") int value);

  // optional bool mirror = 6 [default = false];
  public native @Cast("bool") boolean has_mirror();
  public native void clear_mirror();
  @MemberGetter public static native int kMirrorFieldNumber();
  public static final int kMirrorFieldNumber = kMirrorFieldNumber();
  public native @Cast("bool") boolean mirror();
  public native void set_mirror(@Cast("bool") boolean value);

  // optional bool cache_images = 12 [default = false];
  public native @Cast("bool") boolean has_cache_images();
  public native void clear_cache_images();
  @MemberGetter public static native int kCacheImagesFieldNumber();
  public static final int kCacheImagesFieldNumber = kCacheImagesFieldNumber();
  public native @Cast("bool") boolean cache_images();
  public native void set_cache_images(@Cast("bool") boolean value);

  // optional uint32 context_pad = 10 [default = 0];
  public native @Cast("bool") boolean has_context_pad();
  public native void clear_context_pad();
  @MemberGetter public static native int kContextPadFieldNumber();
  public static final int kContextPadFieldNumber = kContextPadFieldNumber();
  public native @Cast("google::protobuf::uint32") int context_pad();
  public native void set_context_pad(@Cast("google::protobuf::uint32") int value);

  // optional float scale = 2 [default = 1];
  public native @Cast("bool") boolean has_scale();
  public native void clear_scale();
  @MemberGetter public static native int kScaleFieldNumber();
  public static final int kScaleFieldNumber = kScaleFieldNumber();
  public native float scale();
  public native void set_scale(float value);

  // optional float fg_threshold = 7 [default = 0.5];
  public native @Cast("bool") boolean has_fg_threshold();
  public native void clear_fg_threshold();
  @MemberGetter public static native int kFgThresholdFieldNumber();
  public static final int kFgThresholdFieldNumber = kFgThresholdFieldNumber();
  public native float fg_threshold();
  public native void set_fg_threshold(float value);

  // optional float bg_threshold = 8 [default = 0.5];
  public native @Cast("bool") boolean has_bg_threshold();
  public native void clear_bg_threshold();
  @MemberGetter public static native int kBgThresholdFieldNumber();
  public static final int kBgThresholdFieldNumber = kBgThresholdFieldNumber();
  public native float bg_threshold();
  public native void set_bg_threshold(float value);

  // optional float fg_fraction = 9 [default = 0.25];
  public native @Cast("bool") boolean has_fg_fraction();
  public native void clear_fg_fraction();
  @MemberGetter public static native int kFgFractionFieldNumber();
  public static final int kFgFractionFieldNumber = kFgFractionFieldNumber();
  public native float fg_fraction();
  public native void set_fg_fraction(float value);
}
