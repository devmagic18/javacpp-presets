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
 * A single result of code completion.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXCompletionResult extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXCompletionResult() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXCompletionResult(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCompletionResult(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXCompletionResult position(long position) {
        return (CXCompletionResult)super.position(position);
    }

  /**
   * The kind of entity that this completion refers to.
   *
   * The cursor kind will be a macro, keyword, or a declaration (one of the
   * *Decl cursor kinds), describing the entity that the completion is
   * referring to.
   *
   * \todo In the future, we would like to provide a full cursor, to allow
   * the client to extract additional information from declaration.
   */
  public native @Cast("CXCursorKind") int CursorKind(); public native CXCompletionResult CursorKind(int setter);

  /**
   * The code-completion string that describes how to insert this
   * code-completion result into the editing buffer.
   */
  public native CXCompletionString CompletionString(); public native CXCompletionResult CompletionString(CXCompletionString setter);
}
