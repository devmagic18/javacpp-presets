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

@Name("arrow::dataset::ExpressionImpl<arrow::dataset::BinaryExpression,arrow::dataset::ComparisonExpression,arrow::dataset::ExpressionType::COMPARISON>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ComparisonExpressionImpl extends BinaryExpression {
    static { Loader.load(); }
    /** Default native constructor. */
    public ComparisonExpressionImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ComparisonExpressionImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ComparisonExpressionImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ComparisonExpressionImpl position(long position) {
        return (ComparisonExpressionImpl)super.position(position);
    }

  @MemberGetter public static native ExpressionType.type expression_type();

  public native @SharedPtr @ByVal Expression Copy();
}
