// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Inner product weights gradient primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class inner_product_backward_weights extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_backward_weights(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public inner_product_backward_weights(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public inner_product_backward_weights position(long position) {
        return (inner_product_backward_weights)super.position(position);
    }

    /** Descriptor for an inner product weights gradient primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        ///
        public native @ByRef dnnl_inner_product_desc_t data(); public native desc data(dnnl_inner_product_desc_t setter);

        /** Constructs a descriptor for an inner product descriptor weights
         *  update primitive with bias.
         * 
         *  \note
         *      Memory descriptors can be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  Inputs:
         *   - src (#dnnl::primitive_desc_base::src_desc (0))
         *   - diff_dst (#dnnl::primitive_desc_base::diff_dst_desc (0))
         * 
         *  Outputs:
         *   - diff_weights (#dnnl::primitive_desc_base::diff_weights_desc (0))
         *   - diff_bias (#dnnl::primitive_desc_base::diff_weights_desc (1))
         * 
         *  @param src_desc Memory descriptor for src.
         *  @param diff_weights_desc Memory descriptor for diff weights.
         *  @param diff_bias_desc Memory descriptor for diff bias.
         *  @param diff_dst_desc Memory descriptor for diff dst. */
        
        ///
        ///
        ///
        ///
        public desc(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc); }
        private native void allocate(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc);

        /** Constructs a descriptor for an inner product descriptor weights
         *  update primitive without bias.
         * 
         *  \note
         *      Memory descriptors can be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  Inputs:
         *   - src (#dnnl::primitive_desc_base::src_desc (0))
         *   - diff_dst (#dnnl::primitive_desc_base::diff_dst_desc (0))
         * 
         *  Outputs:
         *   - diff_weights (#dnnl::primitive_desc_base::diff_weights_desc (0))
         * 
         *  @param src_desc Memory descriptor for src.
         *  @param diff_weights_desc Memory descriptor for diff weights.
         *  @param diff_dst_desc Memory descriptor for diff dst. */
        public desc(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(src_desc, diff_weights_desc, diff_dst_desc); }
        private native void allocate(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
    }

    /** Primitive descriptor for an inner product weights gradient primitive. */
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

        /** Constructs a primitive descriptor for an inner product weights
         *  update primitive.
         * 
         *  @param desc Descriptor for an inner product weights gradient
         *      primitive.
         *  @param engine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an inner product
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, engine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, engine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an inner product weights
         *  update primitive.
         * 
         *  @param desc Descriptor for an inner product weights gradient
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param engine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an inner product
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, engine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, engine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an inner product weights
         *  update primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for an inner product weights
         *      gradient primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_weights_desc()const */
        public native @ByVal memory.desc diff_weights_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();

        /** \copydoc dnnl::convolution_backward_weights::primitive_desc::diff_bias_desc()const */
        public native @ByVal memory.desc diff_bias_desc();
    }

    /** Default constructor. Produces an empty object. */
    public inner_product_backward_weights() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an inner product weights gradient primitive.
     *  @param pd Primitive descriptor for an inner product weights gradient
     *      primitive. */
    public inner_product_backward_weights(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
