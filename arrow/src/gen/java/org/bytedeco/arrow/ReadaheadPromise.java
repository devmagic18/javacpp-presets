// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// A type-erased promise object for ReadaheadQueue.
@Namespace("arrow::detail") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadaheadPromise extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadaheadPromise(Pointer p) { super(p); }

  public native void Call();
}
