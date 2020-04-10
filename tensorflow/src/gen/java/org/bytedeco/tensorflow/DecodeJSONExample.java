// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Convert JSON-encoded Example records to binary protocol buffer strings.
 * 
 *  This op translates a tensor containing Example records, encoded using
 *  the [standard JSON
 *  mapping](https://developers.google.com/protocol-buffers/docs/proto3#json),
 *  into a tensor containing the same records encoded as binary protocol
 *  buffers. The resulting tensor can then be fed to any of the other
 *  Example-parsing ops.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * json_examples: Each string is a JSON object serialized according to the JSON
 *  mapping of the Example proto.
 * 
 *  Returns:
 *  * {@code Output}: Each string is a binary Example protocol buffer corresponding
 *  to the respective element of {@code json_examples}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DecodeJSONExample extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecodeJSONExample(Pointer p) { super(p); }

  public DecodeJSONExample(@Const @ByRef Scope scope, @ByVal Input json_examples) { super((Pointer)null); allocate(scope, json_examples); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input json_examples);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native DecodeJSONExample operation(Operation setter);
  public native @ByRef Output binary_examples(); public native DecodeJSONExample binary_examples(Output setter);
}
