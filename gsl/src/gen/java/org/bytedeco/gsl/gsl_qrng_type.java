// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* Once again, more inane C-style OOP... kill me now. */

/* Structure describing a type of generator.
 */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_qrng_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_qrng_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_qrng_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_qrng_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_qrng_type position(long position) {
        return (gsl_qrng_type)super.position(position);
    }

  public native @Cast("const char*") BytePointer name(); public native gsl_qrng_type name(BytePointer setter);
  public native @Cast("unsigned int") int max_dimension(); public native gsl_qrng_type max_dimension(int setter);
  public static class State_size_int extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    State_size_int(Pointer p) { super(p); }
      protected State_size_int() { allocate(); }
      private native void allocate();
      public native @Cast("size_t") long call(@Cast("unsigned int") int dimension);
  }
  public native State_size_int state_size(); public native gsl_qrng_type state_size(State_size_int setter);
  public static class Init_state_Pointer_int extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Init_state_Pointer_int(Pointer p) { super(p); }
      protected Init_state_Pointer_int() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Cast("unsigned int") int dimension);
  }
  public native Init_state_Pointer_int init_state(); public native gsl_qrng_type init_state(Init_state_Pointer_int setter);
  public static class Get_Pointer_int_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Get_Pointer_int_DoublePointer(Pointer p) { super(p); }
      protected Get_Pointer_int_DoublePointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Cast("unsigned int") int dimension, DoublePointer x);
  }
  public native Get_Pointer_int_DoublePointer get(); public native gsl_qrng_type get(Get_Pointer_int_DoublePointer setter);
}
