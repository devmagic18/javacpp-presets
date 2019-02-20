// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Resource view descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_RESOURCE_VIEW_DESC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_RESOURCE_VIEW_DESC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_RESOURCE_VIEW_DESC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_RESOURCE_VIEW_DESC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_RESOURCE_VIEW_DESC position(long position) {
        return (CUDA_RESOURCE_VIEW_DESC)super.position(position);
    }

    /** Resource view format */
    public native @Cast("CUresourceViewFormat") int format(); public native CUDA_RESOURCE_VIEW_DESC format(int format);
    /** Width of the resource view */
    public native @Cast("size_t") long width(); public native CUDA_RESOURCE_VIEW_DESC width(long width);
    /** Height of the resource view */
    public native @Cast("size_t") long height(); public native CUDA_RESOURCE_VIEW_DESC height(long height);
    /** Depth of the resource view */
    public native @Cast("size_t") long depth(); public native CUDA_RESOURCE_VIEW_DESC depth(long depth);
    /** First defined mipmap level */
    public native @Cast("unsigned int") int firstMipmapLevel(); public native CUDA_RESOURCE_VIEW_DESC firstMipmapLevel(int firstMipmapLevel);
    /** Last defined mipmap level */
    public native @Cast("unsigned int") int lastMipmapLevel(); public native CUDA_RESOURCE_VIEW_DESC lastMipmapLevel(int lastMipmapLevel);
    /** First layer index */
    public native @Cast("unsigned int") int firstLayer(); public native CUDA_RESOURCE_VIEW_DESC firstLayer(int firstLayer);
    /** Last layer index */
    public native @Cast("unsigned int") int lastLayer(); public native CUDA_RESOURCE_VIEW_DESC lastLayer(int lastLayer);
    public native @Cast("unsigned int") int reserved(int i); public native CUDA_RESOURCE_VIEW_DESC reserved(int i, int reserved);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}