// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Opaque pointer representing client data that will be passed through
 * to various callbacks and visitors.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXClientData extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXClientData() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXClientData(Pointer p) { super(p); }
}
