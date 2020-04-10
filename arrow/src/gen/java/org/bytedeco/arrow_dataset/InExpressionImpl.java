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

@Name("arrow::dataset::ExpressionImpl<arrow::dataset::UnaryExpression,arrow::dataset::InExpression,arrow::dataset::ExpressionType::IN>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class InExpressionImpl extends UnaryExpression {
    static { Loader.load(); }
    /** Default native constructor. */
    public InExpressionImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InExpressionImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InExpressionImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public InExpressionImpl position(long position) {
        return (InExpressionImpl)super.position(position);
    }

  @MemberGetter public static native ExpressionType.type expression_type();

  public native @SharedPtr @ByVal Expression Copy();
}
