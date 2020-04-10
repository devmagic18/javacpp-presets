// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTIVATION_CONTEXT_DETAILED_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTIVATION_CONTEXT_DETAILED_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTIVATION_CONTEXT_DETAILED_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTIVATION_CONTEXT_DETAILED_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTIVATION_CONTEXT_DETAILED_INFORMATION position(long position) {
        return (ACTIVATION_CONTEXT_DETAILED_INFORMATION)super.position(position);
    }

    public native @Cast("DWORD") int dwFlags(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION dwFlags(int setter);
    public native @Cast("DWORD") int ulFormatVersion(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulFormatVersion(int setter);
    public native @Cast("DWORD") int ulAssemblyCount(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulAssemblyCount(int setter);
    public native @Cast("DWORD") int ulRootManifestPathType(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulRootManifestPathType(int setter);
    public native @Cast("DWORD") int ulRootManifestPathChars(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulRootManifestPathChars(int setter);
    public native @Cast("DWORD") int ulRootConfigurationPathType(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulRootConfigurationPathType(int setter);
    public native @Cast("DWORD") int ulRootConfigurationPathChars(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulRootConfigurationPathChars(int setter);
    public native @Cast("DWORD") int ulAppDirPathType(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulAppDirPathType(int setter);
    public native @Cast("DWORD") int ulAppDirPathChars(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION ulAppDirPathChars(int setter);
    public native @Cast("PCWSTR") CharPointer lpRootManifestPath(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION lpRootManifestPath(CharPointer setter);
    public native @Cast("PCWSTR") CharPointer lpRootConfigurationPath(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION lpRootConfigurationPath(CharPointer setter);
    public native @Cast("PCWSTR") CharPointer lpAppDirPath(); public native ACTIVATION_CONTEXT_DETAILED_INFORMATION lpAppDirPath(CharPointer setter);
}
