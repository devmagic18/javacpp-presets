// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyOSErrorObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyOSErrorObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyOSErrorObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyOSErrorObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyOSErrorObject position(long position) {
        return (PyOSErrorObject)super.position(position);
    }

    public native @ByRef PyObject ob_base(); public native PyOSErrorObject ob_base(PyObject setter); public native PyObject dict(); public native PyOSErrorObject dict(PyObject setter);
             public native PyObject args(); public native PyOSErrorObject args(PyObject setter); public native PyObject traceback(); public native PyOSErrorObject traceback(PyObject setter);
             public native PyObject context(); public native PyOSErrorObject context(PyObject setter); public native PyObject cause(); public native PyOSErrorObject cause(PyObject setter);
             public native @Cast("char") byte suppress_context(); public native PyOSErrorObject suppress_context(byte setter);
    public native PyObject myerrno(); public native PyOSErrorObject myerrno(PyObject setter);
    public native PyObject strerror(); public native PyOSErrorObject strerror(PyObject setter);
    public native PyObject filename(); public native PyOSErrorObject filename(PyObject setter);
    public native PyObject filename2(); public native PyOSErrorObject filename2(PyObject setter);
// #ifdef MS_WINDOWS
// #endif
    public native @Cast("Py_ssize_t") long written(); public native PyOSErrorObject written(long setter);   /* only for BlockingIOError, -1 otherwise */
}
