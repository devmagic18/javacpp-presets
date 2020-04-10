// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;


/** \brief Default predict collector
<p>
Trace minimal distance with treshhold checking (that is default behavior for most predict logic)
*/
@Namespace("cv::face") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class StandardCollector extends PredictCollector {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StandardCollector(Pointer p) { super(p); }

    @NoOffset public static class PredictResult extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PredictResult(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PredictResult(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public PredictResult position(long position) {
            return (PredictResult)super.position(position);
        }
    
        public native int label(); public native PredictResult label(int setter);
        public native double distance(); public native PredictResult distance(double setter);
        public PredictResult(int label_/*=-1*/, double distance_/*=DBL_MAX*/) { super((Pointer)null); allocate(label_, distance_); }
        private native void allocate(int label_/*=-1*/, double distance_/*=DBL_MAX*/);
        public PredictResult() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
    /** \brief Constructor
    @param threshold_ set threshold
    */
    public StandardCollector(double threshold_/*=DBL_MAX*/) { super((Pointer)null); allocate(threshold_); }
    private native void allocate(double threshold_/*=DBL_MAX*/);
    public StandardCollector() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \brief overloaded interface method */
    public native @Override void init(@Cast("size_t") long size);
    /** \brief overloaded interface method */
    public native @Cast("bool") @Override boolean collect(int label, double dist);
    /** \brief Returns label with minimal distance */
    public native int getMinLabel();
    /** \brief Returns minimal distance value */
    public native double getMinDist();
    /** \brief Return results as vector
    @param sorted If set, results will be sorted by distance
    Each values is a pair of label and distance.
    */
    public native @ByVal IntDoublePairVector getResults(@Cast("bool") boolean sorted/*=false*/);
    public native @ByVal IntDoublePairVector getResults();
    /** \brief Return results as map
    Labels are keys, values are minimal distances
    */
    public native @ByVal IntDoubleMap getResultsMap();
    /** \brief Static constructor
    @param threshold set threshold
    */
    public static native @Ptr StandardCollector create(double threshold/*=DBL_MAX*/);
    public static native @Ptr StandardCollector create();
}
