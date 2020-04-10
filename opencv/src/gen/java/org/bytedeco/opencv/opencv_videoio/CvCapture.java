// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videoio;

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

import static org.bytedeco.opencv.global.opencv_videoio.*;


/**
  \defgroup videoio Video I/O
  <p>
  \brief Read and write video or images sequence with OpenCV
  <p>
  ### See also:
  - \ref videoio_overview
  - Tutorials: \ref tutorial_table_of_content_videoio
  \{
    \defgroup videoio_flags_base Flags for video I/O
    \defgroup videoio_flags_others Additional flags for video I/O API backends
    \defgroup videoio_c C API for video I/O
    \defgroup videoio_ios iOS glue for video I/O
    \defgroup videoio_winrt WinRT glue for video I/O
    \defgroup videoio_registry Query I/O API backends registry
  \}
*/

////////////////////////////////// video io /////////////////////////////////

@Opaque @Properties(inherit = org.bytedeco.opencv.presets.opencv_videoio.class)
public class CvCapture extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvCapture() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvCapture(Pointer p) { super(p); }
}
