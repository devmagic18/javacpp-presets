// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** Represents a reference to a field. Stores only the field's name (type and other
 *  information is known only when a Schema is provided) */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FieldExpression extends Expression {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldExpression(Pointer p) { super(p); }

  public FieldExpression(@StdString String name) { super((Pointer)null); allocate(name); }
  private native void allocate(@StdString String name);
  public FieldExpression(@StdString BytePointer name) { super((Pointer)null); allocate(name); }
  private native void allocate(@StdString BytePointer name);

  public native @StdString String name();

  public native @StdString String ToString();

  public native @Cast("bool") boolean Equals(@Const @ByRef Expression other);

  public native @ByVal DataTypeResult Validate(@Const @ByRef Schema schema);

  public native @SharedPtr @ByVal Expression Copy();
}
