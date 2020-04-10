// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.videoinput;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.videoinput.global.videoInputLib.*;

@Opaque @Properties(inherit = org.bytedeco.videoinput.presets.videoInputLib.class)
public class IAMStreamConfig extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public IAMStreamConfig() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IAMStreamConfig(Pointer p) { super(p); }
}
