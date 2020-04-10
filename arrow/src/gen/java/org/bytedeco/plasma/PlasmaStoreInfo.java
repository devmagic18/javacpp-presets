// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.plasma;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.plasma.*;


/** Globally accessible reference to plasma store configuration.
 *  TODO(pcm): This can be avoided with some refactoring of existing code
 *  by making it possible to pass a context object through dlmalloc. */
@Namespace("plasma") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.plasma.class)
public class PlasmaStoreInfo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PlasmaStoreInfo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PlasmaStoreInfo(Pointer p) { super(p); }
}
