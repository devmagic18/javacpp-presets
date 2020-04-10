// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// WIN CE Exception table format
//

//
// Function table entry format.  Function table is pointed to by the
// IMAGE_DIRECTORY_ENTRY_EXCEPTION directory entry.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_CE_RUNTIME_FUNCTION_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_CE_RUNTIME_FUNCTION_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_CE_RUNTIME_FUNCTION_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_CE_RUNTIME_FUNCTION_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_CE_RUNTIME_FUNCTION_ENTRY position(long position) {
        return (IMAGE_CE_RUNTIME_FUNCTION_ENTRY)super.position(position);
    }

    public native @Cast("DWORD") int FuncStart(); public native IMAGE_CE_RUNTIME_FUNCTION_ENTRY FuncStart(int setter);
    public native @Cast("DWORD") @NoOffset int PrologLen(); public native IMAGE_CE_RUNTIME_FUNCTION_ENTRY PrologLen(int setter);
    public native @Cast("DWORD") @NoOffset int FuncLen(); public native IMAGE_CE_RUNTIME_FUNCTION_ENTRY FuncLen(int setter);
    public native @Cast("DWORD") @NoOffset int ThirtyTwoBit(); public native IMAGE_CE_RUNTIME_FUNCTION_ENTRY ThirtyTwoBit(int setter);
    public native @Cast("DWORD") @NoOffset int ExceptionFlag(); public native IMAGE_CE_RUNTIME_FUNCTION_ENTRY ExceptionFlag(int setter);
}
