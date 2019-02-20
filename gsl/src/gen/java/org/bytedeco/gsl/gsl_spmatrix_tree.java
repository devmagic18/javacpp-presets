// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/*
 * Binary tree data structure for storing sparse matrix elements
 * in triplet format. This is used for efficiently detecting
 * duplicates and element retrieval via gsl_spmatrix_get
 */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_spmatrix_tree extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_spmatrix_tree() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_spmatrix_tree(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_spmatrix_tree(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_spmatrix_tree position(long position) {
        return (gsl_spmatrix_tree)super.position(position);
    }

  public native Pointer tree(); public native gsl_spmatrix_tree tree(Pointer tree);       /* tree structure */
  public native Pointer node_array(); public native gsl_spmatrix_tree node_array(Pointer node_array); /* preallocated array of tree nodes */
  public native @Cast("size_t") long n(); public native gsl_spmatrix_tree n(long n);         /* number of tree nodes in use (<= nzmax) */
}