// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_monte_vegas_params extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_monte_vegas_params() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_monte_vegas_params(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_monte_vegas_params(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_monte_vegas_params position(long position) {
        return (gsl_monte_vegas_params)super.position(position);
    }

  public native double alpha(); public native gsl_monte_vegas_params alpha(double setter);
  public native @Cast("size_t") long iterations(); public native gsl_monte_vegas_params iterations(long setter);
  public native int stage(); public native gsl_monte_vegas_params stage(int setter);
  public native int mode(); public native gsl_monte_vegas_params mode(int setter);
  public native int verbose(); public native gsl_monte_vegas_params verbose(int setter);
  public native FILE ostream(); public native gsl_monte_vegas_params ostream(FILE setter);
}
