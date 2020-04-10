// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Reorders a SparseTensor into the canonical, row-major ordering.
 * 
 *  Note that by convention, all sparse ops preserve the canonical ordering along
 *  increasing dimension number. The only time ordering can be violated is during
 *  manual manipulation of the indices and values vectors to add entries.
 * 
 *  Reordering does not affect the shape of the SparseTensor.
 * 
 *  If the tensor has rank {@code R} and {@code N} non-empty values, {@code input_indices} has
 *  shape {@code [N, R]}, input_values has length {@code N}, and input_shape has length {@code R}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_indices: 2-D.  {@code N x R} matrix with the indices of non-empty values in a
 *  SparseTensor, possibly not in canonical ordering.
 *  * input_values: 1-D.  {@code N} non-empty values corresponding to {@code input_indices}.
 *  * input_shape: 1-D.  Shape of the input SparseTensor.
 * 
 *  Returns:
 *  * {@code Output} output_indices: 2-D.  {@code N x R} matrix with the same indices as input_indices, but
 *  in canonical row-major ordering.
 *  * {@code Output} output_values: 1-D.  {@code N} non-empty values corresponding to {@code output_indices}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseReorder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseReorder(Pointer p) { super(p); }

  public SparseReorder(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_values,
                @ByVal Input input_shape) { super((Pointer)null); allocate(scope, input_indices, input_values, input_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_values,
                @ByVal Input input_shape);

  public native @ByRef Operation operation(); public native SparseReorder operation(Operation setter);
  public native @ByRef Output output_indices(); public native SparseReorder output_indices(Output setter);
  public native @ByRef Output output_values(); public native SparseReorder output_values(Output setter);
}
