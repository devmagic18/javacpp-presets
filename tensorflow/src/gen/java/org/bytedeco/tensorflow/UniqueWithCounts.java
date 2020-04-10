// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Finds unique elements in a 1-D tensor.
 * 
 *  This operation returns a tensor {@code y} containing all of the unique elements of {@code x}
 *  sorted in the same order that they occur in {@code x}. This operation also returns a
 *  tensor {@code idx} the same size as {@code x} that contains the index of each value of {@code x}
 *  in the unique output {@code y}. Finally, it returns a third tensor {@code count} that
 *  contains the count of each element of {@code y} in {@code x}. In other words:
 * 
 *  {@code y[idx[i]] = x[i] for i in [0, 1,...,rank(x) - 1]}
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # tensor 'x' is [1, 1, 2, 4, 4, 4, 7, 8, 8]
 *  y, idx, count = unique_with_counts(x)
 *  y ==> [1, 2, 4, 7, 8]
 *  idx ==> [0, 0, 1, 2, 2, 2, 3, 4, 4]
 *  count ==> [2, 1, 3, 1, 2]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: 1-D.
 * 
 *  Returns:
 *  * {@code Output} y: 1-D.
 *  * {@code Output} idx: 1-D.
 *  * {@code Output} count: 1-D. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class UniqueWithCounts extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UniqueWithCounts(Pointer p) { super(p); }

  /** Optional attribute setters for UniqueWithCounts */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Defaults to DT_INT32 */
    public native @ByVal Attrs OutIdx(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int out_idx_(); public native Attrs out_idx_(int setter);
  }
  public UniqueWithCounts(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public UniqueWithCounts(@Const @ByRef Scope scope, @ByVal Input x, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutIdx(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native UniqueWithCounts operation(Operation setter);
  public native @ByRef Output y(); public native UniqueWithCounts y(Output setter);
  public native @ByRef Output idx(); public native UniqueWithCounts idx(Output setter);
  public native @ByRef Output count(); public native UniqueWithCounts count(Output setter);
}
