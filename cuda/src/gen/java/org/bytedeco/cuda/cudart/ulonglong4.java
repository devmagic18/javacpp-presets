// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ulonglong4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulonglong4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ulonglong4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulonglong4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ulonglong4 position(long position) {
        return (ulonglong4)super.position(position);
    }

    public native @Cast("unsigned long long int") long x(); public native ulonglong4 x(long setter);
    public native @Cast("unsigned long long int") long y(); public native ulonglong4 y(long setter);
    public native @Cast("unsigned long long int") long z(); public native ulonglong4 z(long setter);
    public native @Cast("unsigned long long int") long w(); public native ulonglong4 w(long setter);
}
