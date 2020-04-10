// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


     /** \brief This class represents high-level API for object detection networks.
      *
      * DetectionModel allows to set params for preprocessing input image.
      * DetectionModel creates net from file with trained weights and config,
      * sets preprocessing input, runs forward pass and return result detections.
      * For DetectionModel SSD, Faster R-CNN, YOLO topologies are supported.
      */
     @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class DetectionModel extends Model {
         static { Loader.load(); }
         /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
         public DetectionModel(Pointer p) { super(p); }
     
         /**
          * \brief Create detection model from network represented in one of the supported formats.
          * An order of \p model and \p config arguments does not matter.
          * @param model [in] Binary file contains trained weights.
          * @param config [in] Text file contains network configuration.
          */
         public DetectionModel(@Str BytePointer model, @Str BytePointer config/*=""*/) { super((Pointer)null); allocate(model, config); }
         private native void allocate(@Str BytePointer model, @Str BytePointer config/*=""*/);
         public DetectionModel(@Str BytePointer model) { super((Pointer)null); allocate(model); }
         private native void allocate(@Str BytePointer model);
         public DetectionModel(@Str String model, @Str String config/*=""*/) { super((Pointer)null); allocate(model, config); }
         private native void allocate(@Str String model, @Str String config/*=""*/);
         public DetectionModel(@Str String model) { super((Pointer)null); allocate(model); }
         private native void allocate(@Str String model);

         /**
          * \brief Create model from deep learning network.
          * @param network [in] Net object.
          */
         public DetectionModel(@Const @ByRef Net network) { super((Pointer)null); allocate(network); }
         private native void allocate(@Const @ByRef Net network);

         /** \brief Given the \p input frame, create input blob, run net and return result detections.
          *  @param frame [in]  The input image.
          *  @param classIds [out] Class indexes in result detection.
          *  @param confidences [out] A set of corresponding confidences.
          *  @param boxes [out] A set of bounding boxes.
          *  @param confThreshold [in] A threshold used to filter boxes by confidences.
          *  @param nmsThreshold [in] A threshold used in non maximum suppression.
          */
         public native void detect(@ByVal Mat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal Mat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal Mat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal Mat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal Mat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal Mat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal UMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal UMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal UMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal UMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal UMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal UMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal GpuMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal GpuMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal GpuMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal GpuMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal GpuMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal GpuMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes);
     }
