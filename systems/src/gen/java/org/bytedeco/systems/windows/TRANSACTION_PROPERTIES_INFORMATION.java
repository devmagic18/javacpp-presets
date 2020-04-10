// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// begin_wdm


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTION_PROPERTIES_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTION_PROPERTIES_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTION_PROPERTIES_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTION_PROPERTIES_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTION_PROPERTIES_INFORMATION position(long position) {
        return (TRANSACTION_PROPERTIES_INFORMATION)super.position(position);
    }

    public native @Cast("DWORD") int IsolationLevel(); public native TRANSACTION_PROPERTIES_INFORMATION IsolationLevel(int setter);
    public native @Cast("DWORD") int IsolationFlags(); public native TRANSACTION_PROPERTIES_INFORMATION IsolationFlags(int setter);
    public native @ByRef LARGE_INTEGER Timeout(); public native TRANSACTION_PROPERTIES_INFORMATION Timeout(LARGE_INTEGER setter);
    public native @Cast("DWORD") int Outcome(); public native TRANSACTION_PROPERTIES_INFORMATION Outcome(int setter);
    public native @Cast("DWORD") int DescriptionLength(); public native TRANSACTION_PROPERTIES_INFORMATION DescriptionLength(int setter);
    public native @Cast("WCHAR") char Description(int i); public native TRANSACTION_PROPERTIES_INFORMATION Description(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer Description();            // Variable size
//          Data[1];            // Variable size data not declared
}
