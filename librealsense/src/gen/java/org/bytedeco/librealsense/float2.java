// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    @Namespace("rs") @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class float2 extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public float2() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public float2(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public float2(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public float2 position(long position) {
            return (float2)super.position(position);
        }
     public native float x(); public native float2 x(float setter);
public native float y(); public native float2 y(float setter); }
