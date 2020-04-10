// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Adjust the saturation of one or more images.
 * 
 *  {@code images} is a tensor of at least 3 dimensions.  The last dimension is
 *  interpretted as channels, and must be three.
 * 
 *  The input image is considered in the RGB colorspace. Conceptually, the RGB
 *  colors are first mapped into HSV. A scale is then applied all the saturation
 *  values, and then remapped back to RGB colorspace.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * images: Images to adjust.  At least 3-D.
 *  * scale: A float scale to add to the saturation.
 * 
 *  Returns:
 *  * {@code Output}: The hue-adjusted image or images. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AdjustSaturation extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdjustSaturation(Pointer p) { super(p); }

  public AdjustSaturation(@Const @ByRef Scope scope, @ByVal Input images,
                   @ByVal Input scale) { super((Pointer)null); allocate(scope, images, scale); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images,
                   @ByVal Input scale);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native AdjustSaturation operation(Operation setter);
  public native @ByRef Output output(); public native AdjustSaturation output(Output setter);
}
