// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief An authentication mechanism that does nothing. */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class NoOpAuthHandler extends ServerAuthHandler {
    static { Loader.load(); }
    /** Default native constructor. */
    public NoOpAuthHandler() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NoOpAuthHandler(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NoOpAuthHandler(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NoOpAuthHandler position(long position) {
        return (NoOpAuthHandler)super.position(position);
    }

  public native @ByVal Status Authenticate(ServerAuthSender outgoing, ServerAuthReader incoming);
  public native @ByVal Status IsValid(@StdString String token, @StdString @Cast({"char*", "std::string*"}) BytePointer peer_identity);
  public native @ByVal Status IsValid(@StdString BytePointer token, @StdString @Cast({"char*", "std::string*"}) BytePointer peer_identity);
}
