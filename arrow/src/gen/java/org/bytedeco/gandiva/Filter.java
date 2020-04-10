// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;


/** \brief filter records based on a condition.
 * 
 *  A filter is built for a specific schema and condition. Once the filter is built, it
 *  can be used to evaluate many row batches. */
@Namespace("gandiva") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class Filter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Filter(Pointer p) { super(p); }

  public Filter(@UniquePtr LLVMGenerator llvm_generator, @SharedPtr @ByVal Schema schema,
           @SharedPtr Configuration config) { super((Pointer)null); allocate(llvm_generator, schema, config); }
  private native void allocate(@UniquePtr LLVMGenerator llvm_generator, @SharedPtr @ByVal Schema schema,
           @SharedPtr Configuration config);

  // Inline dtor will attempt to resolve the destructor for
  // LLVMGenerator on MSVC, so we compile the dtor in the object code

  /** Build a filter for the given schema and condition, with the default configuration.
   * 
   *  @param schema [in] schema for the record batches, and the condition.
   *  @param condition [in] filter condition.
   *  @param filter [out] the returned filter object */
  
  ///
  public static native @ByVal Status Make(@SharedPtr @ByVal Schema schema, @SharedPtr Condition condition,
                       @SharedPtr Filter filter);

  /** \brief Build a filter for the given schema and condition.
   *  Customize the filter with runtime configuration.
   * 
   *  @param schema [in] schema for the record batches, and the condition.
   *  @param condition [in] filter conditions.
   *  @param config [in] run time configuration.
   *  @param filter [out] the returned filter object */
  
  ///
  public static native @ByVal Status Make(@SharedPtr @ByVal Schema schema, @SharedPtr Condition condition,
                       @SharedPtr Configuration config,
                       @SharedPtr Filter filter);

  /** Evaluate the specified record batch, and populate output selection vector.
   * 
   *  @param batch [in] the record batch. schema should be the same as the one in 'Make'
   *  @param out_selection [in,out] the selection array with indices of rows that match
   *                 the condition. */
  public native @ByVal Status Evaluate(@Const @ByRef RecordBatch batch,
                    @SharedPtr SelectionVector out_selection);
}
