// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief Matrix expression representation
\anchor MatrixExpressions
This is a list of implemented matrix operations that can be combined in arbitrary complex
expressions (here A, B stand for matrices ( Mat ), s for a scalar ( Scalar ), alpha for a
real-valued scalar ( double )):
-   Addition, subtraction, negation: {@code A+B}, {@code A-B}, {@code A+s}, {@code A-s}, {@code s+A}, {@code s-A}, {@code -A}
-   Scaling: {@code A*alpha}
-   Per-element multiplication and division: {@code A.mul(B)}, {@code A/B}, {@code alpha/A}
-   Matrix multiplication: {@code A*B}
-   Transposition: {@code A.t()} (means A<sup>T</sup>)
-   Matrix inversion and pseudo-inversion, solving linear systems and least-squares problems:
    {@code A.inv([method]) (~ A<sup>-1</sup>)},   {@code A.inv([method])*B (~ X: AX=B)}
-   Comparison: {@code A cmpop B}, {@code A cmpop alpha}, {@code alpha cmpop A}, where *cmpop* is one of
  {@code >}, {@code >=}, {@code ==}, {@code !=}, {@code <=}, {@code <}. The result of comparison is an 8-bit single channel mask whose
    elements are set to 255 (if the particular element or pair of elements satisfy the condition) or
    0.
-   Bitwise logical operations: {@code A logicop B}, {@code A logicop s}, {@code s logicop A}, {@code ~A}, where *logicop* is one of
  {@code &}, {@code |}, {@code ^}.
-   Element-wise minimum and maximum: {@code min(A, B)}, {@code min(A, alpha)}, {@code max(A, B)}, {@code max(A, alpha)}
-   Element-wise absolute value: {@code abs(A)}
-   Cross-product, dot-product: {@code A.cross(B)}, {@code A.dot(B)}
-   Any function of matrix or matrices and scalars that returns a matrix or a scalar, such as norm,
    mean, sum, countNonZero, trace, determinant, repeat, and others.
-   Matrix initializers ( Mat::eye(), Mat::zeros(), Mat::ones() ), matrix comma-separated
    initializers, matrix constructors and operators that extract sub-matrices (see Mat description).
-   Mat_<destination_type>() constructors to cast the result to the proper type.
\note Comma-separated initializers and probably some other operations may require additional
explicit Mat() or Mat_<T>() constructor calls to resolve a possible ambiguity.
<p>
Here are examples of matrix expressions:
<pre>{@code
    // compute pseudo-inverse of A, equivalent to A.inv(DECOMP_SVD)
    SVD svd(A);
    Mat pinvA = svd.vt.t()*Mat::diag(1./svd.w)*svd.u.t();

    // compute the new vector of parameters in the Levenberg-Marquardt algorithm
    x -= (A.t()*A + lambda*Mat::eye(A.cols,A.cols,A.type())).inv(DECOMP_CHOLESKY)*(A.t()*err);

    // sharpen image using "unsharp mask" algorithm
    Mat blurred; double sigma = 1, threshold = 5, amount = 1;
    GaussianBlur(img, blurred, Size(), sigma, sigma);
    Mat lowContrastMask = abs(img - blurred) < threshold;
    Mat sharpened = img*(1+amount) + blurred*(-amount);
    img.copyTo(sharpened, lowContrastMask);
}</pre>
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MatExpr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatExpr(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MatExpr(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MatExpr position(long position) {
        return (MatExpr)super.position(position);
    }

    public MatExpr() { super((Pointer)null); allocate(); }
    private native void allocate();
    public MatExpr(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);

    public MatExpr(@Const MatOp _op, int _flags, @Const @ByRef(nullValue = "cv::Mat()") Mat _a, @Const @ByRef(nullValue = "cv::Mat()") Mat _b,
                @Const @ByRef(nullValue = "cv::Mat()") Mat _c, double _alpha/*=1*/, double _beta/*=1*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar _s) { super((Pointer)null); allocate(_op, _flags, _a, _b, _c, _alpha, _beta, _s); }
    private native void allocate(@Const MatOp _op, int _flags, @Const @ByRef(nullValue = "cv::Mat()") Mat _a, @Const @ByRef(nullValue = "cv::Mat()") Mat _b,
                @Const @ByRef(nullValue = "cv::Mat()") Mat _c, double _alpha/*=1*/, double _beta/*=1*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar _s);
    public MatExpr(@Const MatOp _op, int _flags) { super((Pointer)null); allocate(_op, _flags); }
    private native void allocate(@Const MatOp _op, int _flags);

    public native @ByVal @Name("operator cv::Mat") Mat asMat();

    public native @ByVal Size size();
    public native int type();

    public native @ByVal MatExpr row(int y);
    public native @ByVal MatExpr col(int x);
    public native @ByVal MatExpr diag(int d/*=0*/);
    public native @ByVal MatExpr diag();
    public native @ByVal @Name("operator ()") MatExpr apply( @Const @ByRef Range rowRange, @Const @ByRef Range colRange );
    public native @ByVal @Name("operator ()") MatExpr apply( @Const @ByRef Rect roi );

    public native @ByVal MatExpr t();
    public native @ByVal MatExpr inv(int method/*=cv::DECOMP_LU*/);
    public native @ByVal MatExpr inv();
    public native @ByVal MatExpr mul(@Const @ByRef MatExpr e, double scale/*=1*/);
    public native @ByVal MatExpr mul(@Const @ByRef MatExpr e);
    public native @ByVal MatExpr mul(@Const @ByRef Mat m, double scale/*=1*/);
    public native @ByVal MatExpr mul(@Const @ByRef Mat m);

    public native @ByVal Mat cross(@Const @ByRef Mat m);
    public native double dot(@Const @ByRef Mat m);

    @MemberGetter public native @Const MatOp op();
    public native int flags(); public native MatExpr flags(int setter);

    public native @ByRef Mat a(); public native MatExpr a(Mat setter);
    public native @ByRef Mat b(); public native MatExpr b(Mat setter);
    public native @ByRef Mat c(); public native MatExpr c(Mat setter);
    public native double alpha(); public native MatExpr alpha(double setter);
    public native double beta(); public native MatExpr beta(double setter);
    public native @ByRef Scalar s(); public native MatExpr s(Scalar setter);
}