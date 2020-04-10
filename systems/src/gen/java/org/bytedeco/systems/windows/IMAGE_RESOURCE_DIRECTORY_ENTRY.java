// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

//
// Each directory contains the 32-bit Name of the entry and an offset,
// relative to the beginning of the resource directory of the data associated
// with this directory entry.  If the name of the entry is an actual text
// string instead of an integer Id, then the high order bit of the name field
// is set to one and the low order 31-bits are an offset, relative to the
// beginning of the resource directory of the string, which is of type
// IMAGE_RESOURCE_DIRECTORY_STRING.  Otherwise the high bit is clear and the
// low-order 16-bits are the integer Id that identify this resource directory
// entry. If the directory entry is yet another resource directory (i.e. a
// subdirectory), then the high order bit of the offset field will be
// set to indicate this.  Otherwise the high bit is clear and the offset
// field points to a resource data entry.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_RESOURCE_DIRECTORY_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_RESOURCE_DIRECTORY_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_RESOURCE_DIRECTORY_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_RESOURCE_DIRECTORY_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_RESOURCE_DIRECTORY_ENTRY position(long position) {
        return (IMAGE_RESOURCE_DIRECTORY_ENTRY)super.position(position);
    }

            public native @Cast("DWORD") @NoOffset int NameOffset(); public native IMAGE_RESOURCE_DIRECTORY_ENTRY NameOffset(int setter);
            public native @Cast("DWORD") @NoOffset int NameIsString(); public native IMAGE_RESOURCE_DIRECTORY_ENTRY NameIsString(int setter); 
        public native @Cast("DWORD") int Name(); public native IMAGE_RESOURCE_DIRECTORY_ENTRY Name(int setter);
        public native @Cast("WORD") short Id(); public native IMAGE_RESOURCE_DIRECTORY_ENTRY Id(short setter); 
        public native @Cast("DWORD") int OffsetToData(); public native IMAGE_RESOURCE_DIRECTORY_ENTRY OffsetToData(int setter);
            public native @Cast("DWORD") @NoOffset int OffsetToDirectory(); public native IMAGE_RESOURCE_DIRECTORY_ENTRY OffsetToDirectory(int setter);
            public native @Cast("DWORD") @NoOffset int DataIsDirectory(); public native IMAGE_RESOURCE_DIRECTORY_ENTRY DataIsDirectory(int setter);  
}
