// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class pollfd extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public pollfd() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public pollfd(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public pollfd(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public pollfd position(long position) {
        return (pollfd)super.position(position);
    }

	public native int fd(); public native pollfd fd(int setter);
	public native short events(); public native pollfd events(short setter);
	public native short revents(); public native pollfd revents(short setter);
}
