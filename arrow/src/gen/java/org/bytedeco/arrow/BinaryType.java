// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for variable-size binary data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BinaryType extends BaseBinaryType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BinaryType(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BinaryType(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BinaryType position(long position) {
        return (BinaryType)super.position(position);
    }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();
  @MemberGetter public static native @Cast("const bool") boolean is_utf8();
  public static final boolean is_utf8 = is_utf8();

  public static native String type_name();

  public BinaryType() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal DataTypeLayout layout();

  public native @StdString String ToString();
  public native @StdString String name();
}
