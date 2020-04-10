// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_layer_normalization
 <p>
 *  \addtogroup dnnl_api_inner_product Inner Product
 * 
 *  A primitive to compute an inner product.
 * 
 *  @see \ref dev_guide_inner_product in developer guide
 * 
 *  \{
 <p>
 *  Inner product forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class inner_product_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public inner_product_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public inner_product_forward position(long position) {
        return (inner_product_forward)super.position(position);
    }

    /** Descriptor for an inner product forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        ///
        public native @ByRef dnnl_inner_product_desc_t data(); public native desc data(dnnl_inner_product_desc_t setter);

        /** Constructs a descriptor for an inner product forward propagation
         *  primitive with bias.
         * 
         *  \note
         *      Memory descriptors can be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  Inputs:
         *   - src (#dnnl::primitive_desc_base::src_desc (0))
         *   - weights (#dnnl::primitive_desc_base::weights_desc (0))
         *   - bias (#dnnl::primitive_desc_base::weights_desc (1))
         * 
         *  Outputs:
         *   - dst (#dnnl::primitive_desc_base::dst_desc (0))
         * 
         *  @param prop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param src_desc Memory descriptor for src.
         *  @param weights_desc Memory descriptor for diff weights.
         *  @param bias_desc Memory descriptor for diff bias.
         *  @param dst_desc Memory descriptor for diff dst. */
        
        ///
        ///
        ///
        ///
        public desc(prop_kind prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc, @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(prop_kind, src_desc, weights_desc, bias_desc, dst_desc); }
        private native void allocate(prop_kind prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc, @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc);
        public desc(@Cast("dnnl::prop_kind") int prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc, @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(prop_kind, src_desc, weights_desc, bias_desc, dst_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc, @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc);

        /** Constructs a descriptor for an inner product forward propagation
         *  primitive without bias.
         * 
         *  \note
         *      Memory descriptors can be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  Inputs:
         *   - src (#dnnl::primitive_desc_base::src_desc (0))
         *   - weights (#dnnl::primitive_desc_base::weights_desc (0))
         * 
         *  Outputs:
         *   - dst (#dnnl::primitive_desc_base::dst_desc (0))
         * 
         *  @param prop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param src_desc Memory descriptor for src.
         *  @param weights_desc Memory descriptor for diff weights.
         *  @param dst_desc Memory descriptor for dst. */
        public desc(prop_kind prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(prop_kind, src_desc, weights_desc, dst_desc); }
        private native void allocate(prop_kind prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc);
        public desc(@Cast("dnnl::prop_kind") int prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(prop_kind, src_desc, weights_desc, dst_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int prop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc);
    }

    /** Primitive descriptor for an inner product forward propagation primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an inner product forward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for an inner product forward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for an inner product forward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for an inner product forward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param engine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, attr, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for an inner product forward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for an inner product forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal memory.desc weights_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();

        /** \copydoc dnnl::convolution_forward::primitive_desc::bias_desc()const */
        public native @ByVal memory.desc bias_desc();
    }

    /** Default constructor. Produces an empty object. */
    public inner_product_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an inner product forward propagation primitive.
     *  @param pd Primitive descriptor for an inner product forward
     *      propagation primitive. */
    public inner_product_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
