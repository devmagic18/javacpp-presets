// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_attributes
 <p>
 *  \addtogroup dnnl_api_primitives_common
 *  \{
 <p>
 *  Base class for all primitive descriptors. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class primitive_desc_base extends dnnl_primitive_desc_handle {
    static { Loader.load(); }

    
        public primitive_desc_base() { super((Pointer)null); allocate(); }
        private native void allocate();
        public primitive_desc_base(@Const @ByRef primitive_desc_base arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef primitive_desc_base arg0);
        
        ///
        public primitive_desc_base(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
        private native void allocate(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/);
        public primitive_desc_base(dnnl_primitive_desc t) { super((Pointer)null); allocate(t); }
        private native void allocate(dnnl_primitive_desc t);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive_desc_base(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public primitive_desc_base(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public primitive_desc_base position(long position) {
        return (primitive_desc_base)super.position(position);
    }


    /** Default constructor. Produces an empty object. */

    /** Returns the engine of the primitive descriptor.
     *  @return The engine of the primitive descriptor. */
    public native @ByVal engine get_engine();

    /** Returns implementation name.
     *  @return The implementation name. */
    public native @Cast("const char*") BytePointer impl_info_str();

    /** Returns a memory::dim value (same as int64_t).
     *  @param what The value to query.
     *  @return The result of the query. */
    
    ///
    ///
    public native @Cast("dnnl::memory::dim") long query_s64(query what);
    public native @Cast("dnnl::memory::dim") long query_s64(@Cast("dnnl::query") int what);

    /** Returns a memory descriptor.
     * 
     *  \note
     *      There are convenience methods
     *      #dnnl::primitive_desc_base::src_desc(),
     *      #dnnl::primitive_desc_base::dst_desc(), and others.
     * 
     *  @param what The kind of parameter to query; can be
     *      #dnnl::query::src_md, #dnnl::query::dst_md, etc.
     *  @param idx Index of the parameter. For example, convolution bias can
     *      be queried with what = #dnnl::query::weights_md and idx = 1.
     *  @return The requested memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      parameter of the specified kind or index. */
    public native @ByVal memory.desc query_md(query what, int idx/*=0*/);
    public native @ByVal memory.desc query_md(query what);
    public native @ByVal memory.desc query_md(@Cast("dnnl::query") int what, int idx/*=0*/);
    public native @ByVal memory.desc query_md(@Cast("dnnl::query") int what);

    /** Returns a source memory descriptor.
     *  @param idx Source index.
     *  @return Source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      source parameter with index \p pdx. */
    public native @ByVal memory.desc src_desc(int idx);

    /** Returns a destination memory descriptor.
     *  @param idx Destination index.
     *  @return Destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      destination parameter with index \p pdx. */
    public native @ByVal memory.desc dst_desc(int idx);

    /** Returns a weights memory descriptor.
     *  @param idx Weights index.
     *  @return Weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      weights parameter with index \p pdx. */
    public native @ByVal memory.desc weights_desc(int idx);

    /** Returns a diff source memory descriptor.
     *  @param idx Diff source index.
     *  @return Diff source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff source parameter with index \p pdx. */
    public native @ByVal memory.desc diff_src_desc(int idx);

    /** Returns a diff destination memory descriptor.
     *  @param idx Diff destination index.
     *  @return Diff destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff destination parameter with index \p pdx. */
    public native @ByVal memory.desc diff_dst_desc(int idx);

    /** Returns a diff weights memory descriptor.
     *  @param idx Diff weights index.
     *  @return Diff weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff weights parameter with index \p pdx. */
    public native @ByVal memory.desc diff_weights_desc(int idx);

    // Separate versions without the index argument for documentation
    // purposes.

    /** Returns a source memory descriptor.
     *  @return Source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      source parameter. */
    public native @ByVal memory.desc src_desc();

    /** Returns a destination memory descriptor.
     *  @return Destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      destination parameter. */
    public native @ByVal memory.desc dst_desc();

    /** Returns a weights memory descriptor.
     *  @return Weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      weights parameter. */
    public native @ByVal memory.desc weights_desc();

    /** Returns a diff source memory descriptor.
     *  @return Diff source memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff source memory with. */
    public native @ByVal memory.desc diff_src_desc();

    /** Returns a diff destination memory descriptor.
     *  @return Diff destination memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff destination parameter. */
    public native @ByVal memory.desc diff_dst_desc();

    /** Returns a diff weights memory descriptor.
     *  @return Diff weights memory descriptor.
     *  @return A zero memory descriptor if the primitive does not have a
     *      diff weights parameter. */
    public native @ByVal memory.desc diff_weights_desc();

    /** Returns the workspace memory descriptor.
     *  @return Workspace memory descriptor.
     *  @return A zero memory descriptor if the primitive does not require
     *      workspace parameter. */
    public native @ByVal memory.desc workspace_desc();

    /** Returns the scratchpad memory descriptor.
     *  @return scratchpad memory descriptor.
     *  @return A zero memory descriptor if the primitive does not require
     *      scratchpad parameter.
     *  @see \ref dev_guide_attributes_scratchpad */
    public native @ByVal memory.desc scratchpad_desc();

    /** Returns the engine on which the scratchpad memory is located.
     *  @return The engine on which the scratchpad memory is located. */
    public native @ByVal engine scratchpad_engine();

    /** Returns the primitive attributes.
     *  @return The primitive attributes. */
    public native @ByVal primitive_attr get_primitive_attr();

    /** Returns the kind of the primitive descriptor.
     *  @return The kind of the primitive descriptor. */
    public native primitive.kind get_kind();
}
