// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DayTimeIntervalBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DayTimeIntervalBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DayTimeIntervalBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DayTimeIntervalBuilder position(long position) {
        return (DayTimeIntervalBuilder)super.position(position);
    }


  public DayTimeIntervalBuilder(MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(pool); }
  private native void allocate(MemoryPool pool/*=arrow::default_memory_pool()*/);
  public DayTimeIntervalBuilder() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DayTimeIntervalBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                           MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(type, pool); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                           MemoryPool pool/*=arrow::default_memory_pool()*/);
  public DayTimeIntervalBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native void Reset();
  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);
  public native @ByVal Status Append(@ByVal @Cast("arrow::DayTimeIntervalBuilder::DayMilliseconds*") DayTimeIntervalType.DayMilliseconds day_millis);
  public native void UnsafeAppend(@ByVal @Cast("arrow::DayTimeIntervalBuilder::DayMilliseconds*") DayTimeIntervalType.DayMilliseconds day_millis);
  public native @ByVal Status AppendNull();
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);
  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
