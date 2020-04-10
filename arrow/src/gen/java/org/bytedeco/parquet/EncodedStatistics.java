// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// ----------------------------------------------------------------------

/** \brief Structure represented encoded statistics to be written to
 *  and from Parquet serialized metadata */
@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class EncodedStatistics extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncodedStatistics(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EncodedStatistics(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EncodedStatistics position(long position) {
        return (EncodedStatistics)super.position(position);
    }

  public EncodedStatistics() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @StdString String max();
  public native @StdString String min();

  public native @Cast("int64_t") long null_count(); public native EncodedStatistics null_count(long setter);
  public native @Cast("int64_t") long distinct_count(); public native EncodedStatistics distinct_count(long setter);

  public native @Cast("bool") boolean has_min(); public native EncodedStatistics has_min(boolean setter);
  public native @Cast("bool") boolean has_max(); public native EncodedStatistics has_max(boolean setter);
  public native @Cast("bool") boolean has_null_count(); public native EncodedStatistics has_null_count(boolean setter);
  public native @Cast("bool") boolean has_distinct_count(); public native EncodedStatistics has_distinct_count(boolean setter);

  // From parquet-mr
  // Don't write stats larger than the max size rather than truncating. The
  // rationale is that some engines may use the minimum value in the page as
  // the true minimum for aggregations and there is no way to mark that a
  // value has been truncated and is a lower bound and not in the page.
  public native void ApplyStatSizeLimits(@Cast("size_t") long length);

  public native @Cast("bool") boolean is_set();

  public native @Cast("bool") boolean is_signed();

  public native void set_is_signed(@Cast("bool") boolean is_signed);

  public native @ByRef EncodedStatistics set_max(@StdString String value);
  public native @ByRef EncodedStatistics set_max(@StdString BytePointer value);

  public native @ByRef EncodedStatistics set_min(@StdString String value);
  public native @ByRef EncodedStatistics set_min(@StdString BytePointer value);

  public native @ByRef EncodedStatistics set_null_count(@Cast("int64_t") long value);

  public native @ByRef EncodedStatistics set_distinct_count(@Cast("int64_t") long value);
}
