// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MESSAGE_RESOURCE_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MESSAGE_RESOURCE_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MESSAGE_RESOURCE_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MESSAGE_RESOURCE_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MESSAGE_RESOURCE_ENTRY position(long position) {
        return (MESSAGE_RESOURCE_ENTRY)super.position(position);
    }

    public native @Cast("WORD") short Length(); public native MESSAGE_RESOURCE_ENTRY Length(short setter);
    public native @Cast("WORD") short Flags(); public native MESSAGE_RESOURCE_ENTRY Flags(short setter);
    public native @Cast("BYTE") byte Text(int i); public native MESSAGE_RESOURCE_ENTRY Text(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Text();
}
