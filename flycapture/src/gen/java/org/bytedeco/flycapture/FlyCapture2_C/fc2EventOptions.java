// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /*******************************************************************************
     * Camera event data types
     ******************************************************************************/
    /** Options for enabling device event registration. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2EventOptions extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2EventOptions() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2EventOptions(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2EventOptions(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2EventOptions position(long position) {
            return (fc2EventOptions)super.position(position);
        }
    
        /** Callback function pointer */
        public native fc2CameraEventCallback EventCallbackFcn(); public native fc2EventOptions EventCallbackFcn(fc2CameraEventCallback setter);

        /** Event name to register */
        public native @Cast("const char*") BytePointer EventName(); public native fc2EventOptions EventName(BytePointer setter);

        /** Pointer to callback data to be passed to the callback function */
        public native @Const Pointer EventUserData(); public native fc2EventOptions EventUserData(Pointer setter);

        /** Size of the underlying struct passed as eventCallbackData for sanity checks */
        public native @Cast("size_t") long EventUserDataSize(); public native fc2EventOptions EventUserDataSize(long setter);
    }
