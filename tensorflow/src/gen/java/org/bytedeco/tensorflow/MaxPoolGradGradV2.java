// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes second-order gradients of the maxpooling function.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * orig_input: The original input tensor.
 *  * orig_output: The original output tensor.
 *  * grad: 4-D.  Gradients of gradients w.r.t. the input of {@code max_pool}.
 *  * ksize: The size of the window for each dimension of the input tensor.
 *  * strides: The stride of the sliding window for each dimension of the
 *  input tensor.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * data_format: Specify the data format of the input and output data. With the
 *  default format "NHWC", the data is stored in the order of:
 *      [batch, in_height, in_width, in_channels].
 *  Alternatively, the format could be "NCHW", the data storage order of:
 *      [batch, in_channels, in_height, in_width].
 * 
 *  Returns:
 *  * {@code Output}: Gradients of gradients w.r.t. the input to {@code max_pool}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MaxPoolGradGradV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxPoolGradGradV2(Pointer p) { super(p); }

  /** Optional attribute setters for MaxPoolGradGradV2 */
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
  
    /** Specify the data format of the input and output data. With the
     *  default format "NHWC", the data is stored in the order of:
     *      [batch, in_height, in_width, in_channels].
     *  Alternatively, the format could be "NCHW", the data storage order of:
     *      [batch, in_channels, in_height, in_width].
     * 
     *  Defaults to "NHWC" */
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
  }
  public MaxPoolGradGradV2(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece BytePointer padding);
  public MaxPoolGradGradV2(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece String padding);
  public MaxPoolGradGradV2(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPoolGradGradV2(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input, @ByVal Input orig_output,
                    @ByVal Input grad, @ByVal Input ksize,
                    @ByVal Input strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);

  public native @ByRef Operation operation(); public native MaxPoolGradGradV2 operation(Operation setter);
  public native @ByRef Output output(); public native MaxPoolGradGradV2 output(Output setter);
}
