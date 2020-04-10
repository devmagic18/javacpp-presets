// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SE_SECURITY_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SE_SECURITY_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SE_SECURITY_DESCRIPTOR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SE_SECURITY_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SE_SECURITY_DESCRIPTOR position(long position) {
        return (SE_SECURITY_DESCRIPTOR)super.position(position);
    }

    public native @Cast("DWORD") int Size(); public native SE_SECURITY_DESCRIPTOR Size(int setter);
    public native @Cast("DWORD") int Flags(); public native SE_SECURITY_DESCRIPTOR Flags(int setter);
    public native @Cast("PSECURITY_DESCRIPTOR") Pointer SecurityDescriptor(); public native SE_SECURITY_DESCRIPTOR SecurityDescriptor(Pointer setter);
}
