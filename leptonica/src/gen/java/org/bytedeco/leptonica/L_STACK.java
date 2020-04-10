// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/**
 * \file stack.h
 *
 * <pre>
 *       Expandable pointer stack for arbitrary void* data.
 *
 *       The L_Stack is an array of void * ptrs, onto which arbitrary
 *       objects can be stored.  At any time, the number of
 *       stored objects is stack->n.  The object at the bottom
 *       of the stack is at array[0]; the object at the top of
 *       the stack is at array[n-1].  New objects are added
 *       to the top of the stack, at the first available location,
 *       which is array[n].  Objects are removed from the top of the
 *       stack.  When an attempt is made to remove an object from an
 *       empty stack, the result is null.   When the stack becomes
 *       filled, so that n = nalloc, the size is doubled.
 *
 *       The auxiliary stack can be used to store and remove
 *       objects for re-use.  It must be created by a separate
 *       call to pstackCreate().  [Just imagine the chaos if
 *       pstackCreate() created the auxiliary stack!]
 *       pstackDestroy() checks for the auxiliary stack and removes it.
 * </pre>
 */


    /** Expandable pointer stack for arbitrary void* data.
     * Note that array[n] is the first null ptr in the array
     */
@Name("L_Stack") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_STACK extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_STACK() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_STACK(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_STACK(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_STACK position(long position) {
        return (L_STACK)super.position(position);
    }

    /** size of ptr array              */
    public native @Cast("l_int32") int nalloc(); public native L_STACK nalloc(int setter);
    /** number of stored elements      */
    public native @Cast("l_int32") int n(); public native L_STACK n(int setter);
    /** ptr array                      */
    public native Pointer array(int i); public native L_STACK array(int i, Pointer setter);
    public native @Cast("void**") PointerPointer array(); public native L_STACK array(PointerPointer setter);
    /** auxiliary stack                */
    public native L_STACK auxstack(); public native L_STACK auxstack(L_STACK setter);
}
