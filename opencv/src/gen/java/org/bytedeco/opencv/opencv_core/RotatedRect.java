// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace

///////////////////////////// RotatedRect /////////////////////////////

/** \brief The class represents rotated (i.e. not up-right) rectangles on a plane.
<p>
Each rectangle is specified by the center point (mass center), length of each side (represented by
#Size2f structure) and the rotation angle in degrees.
<p>
The sample below demonstrates how to use RotatedRect:
\snippet snippets/core_various.cpp RotatedRect_demo
![image](pics/rotatedrect.png)
<p>
@see CamShift, fitEllipse, minAreaRect, CvBox2D
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class RotatedRect extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RotatedRect(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RotatedRect(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RotatedRect position(long position) {
        return (RotatedRect)super.position(position);
    }

    /** default constructor */
    public RotatedRect() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** full constructor
    @param center The rectangle mass center.
    @param size Width and height of the rectangle.
    @param angle The rotation angle in a clockwise direction. When the angle is 0, 90, 180, 270 etc.,
    the rectangle becomes an up-right rectangle.
    */
    public RotatedRect(@Const @ByRef Point2f center, @Const @ByRef Size2f size, float angle) { super((Pointer)null); allocate(center, size, angle); }
    private native void allocate(@Const @ByRef Point2f center, @Const @ByRef Size2f size, float angle);
    /**
    Any 3 end points of the RotatedRect. They must be given in order (either clockwise or
    anticlockwise).
     */
    public RotatedRect(@Const @ByRef Point2f point1, @Const @ByRef Point2f point2, @Const @ByRef Point2f point3) { super((Pointer)null); allocate(point1, point2, point3); }
    private native void allocate(@Const @ByRef Point2f point1, @Const @ByRef Point2f point2, @Const @ByRef Point2f point3);

    /** returns 4 vertices of the rectangle
    @param pts The points array for storing rectangle vertices. The order is bottomLeft, topLeft, topRight, bottomRight.
    */
    public native void points(Point2f pts);
    /** returns the minimal up-right integer rectangle containing the rotated rectangle */
    public native @ByVal Rect boundingRect();
    /** returns the minimal (exact) floating point rectangle containing the rotated rectangle, not intended for use with images */
    public native @ByVal Rect2f boundingRect2f();
    /** returns the rectangle mass center */
    public native @ByRef Point2f center(); public native RotatedRect center(Point2f setter);
    /** returns width and height of the rectangle */
    public native @ByRef Size2f size(); public native RotatedRect size(Size2f setter);
    /** returns the rotation angle. When the angle is 0, 90, 180, 270 etc., the rectangle becomes an up-right rectangle. */
    public native float angle(); public native RotatedRect angle(float setter);
}
