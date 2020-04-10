// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Deconvolution backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class deconvolution_backward_data extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public deconvolution_backward_data(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public deconvolution_backward_data(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public deconvolution_backward_data position(long position) {
        return (deconvolution_backward_data)super.position(position);
    }

    /** Descriptor for a deconvolution backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        ///
        public native @ByRef @Cast("dnnl_deconvolution_desc_t*") dnnl_convolution_desc_t data(); public native desc data(dnnl_convolution_desc_t setter);

        /** Constructs a descriptor for a deconvolution backward propagation
         *  primitive.
         * 
         *  \note
         *      Memory descriptors can be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  Inputs:
         *   - diff_dst (#dnnl::primitive_desc_base::diff_dst_desc (0))
         *   - weights (#dnnl::primitive_desc_base::weights_desc (0))
         * 
         *  Outputs:
         *   - diff_src (#dnnl::primitive_desc_base::diff_src_desc (0))
         * 
         *  @param algorithm Deconvolution algorithm
         *      (#dnnl::algorithm::convolution_direct,
         *      #dnnl::algorithm::convolution_winograd).
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param weights_desc Weights memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor.
         *  @param strides Strides for each spatial dimension.
         *  @param padding_l Vector of padding values for low indices for each
         *      spatial dimension (front, top, left).
         *  @param padding_r Vector of padding values for high indices for
         *      each spatial dimension (back, bottom, right). */
        
        ///
        ///
        ///
        ///
        public desc(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, padding_l, padding_r); }
        private native void allocate(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r);
        public desc(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r);
        public desc(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, padding_l, padding_r); }
        private native void allocate(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r);
        public desc(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r);
        public desc(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, padding_l, padding_r); }
        private native void allocate(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r);
        public desc(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r);

        /** Constructs a descriptor for a dilated deconvolution backward
         *  propagation primitive.
         * 
         *  \note
         *      Memory descriptors can be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  Inputs:
         *   - diff_dst (#dnnl::primitive_desc_base::diff_dst_desc (0))
         *   - weights (#dnnl::primitive_desc_base::weights_desc (0))
         * 
         *  Outputs:
         *   - diff_src (#dnnl::primitive_desc_base::diff_src_desc (0))
         * 
         *  @param algorithm Deconvolution algorithm
         *      (#dnnl::algorithm::convolution_direct,
         *      #dnnl::algorithm::convolution_winograd).
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param weights_desc Weights memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor.
         *  @param strides Strides for each spatial dimension.
         *  @param dilates Dilations for each spatial dimension. A zero value
         *      means no dilation in the corresponding dimension.
         *  @param padding_l Vector of padding values for low indices for each
         *      spatial dimension (front, top, left).
         *  @param padding_r Vector of padding values for high indices for
         *      each spatial dimension (back, bottom, right). */
        public desc(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r);
        public desc(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r);
        public desc(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r);
        public desc(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongPointer padding_r);
        public desc(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(algorithm algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef LongBuffer padding_r);
        public desc(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r) { super((Pointer)null); allocate(algorithm, diff_src_desc, weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("dnnl::algorithm") int algorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] strides,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] dilates, @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_l,
                        @Const @Cast({"dnnl_dim_t*", "std::vector<dnnl_dim_t>&"}) @StdVector("dnnl_dim_t") @ByRef long[] padding_r);
    }

    /** Primitive descriptor for a deconvolution backward propagation primitive. */
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

        /** Constructs a primitive descriptor for a deconvolution backward
         *  propagation primitive.
         * 
         *  @param desc descriptor for a deconvolution backward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a deconvolution forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, engine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, engine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a deconvolution backward
         *  propagation primitive.
         * 
         *  @param desc descriptor for a deconvolution backward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param engine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a deconvolution forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, engine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, engine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef deconvolution_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a deconvolution backward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a deconvolution backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal memory.desc weights_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public deconvolution_backward_data() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a deconvolution backward propagation primitive.
     *  @param pd Primitive descriptor for a deconvolution backward propagation
     *      primitive. */
    public deconvolution_backward_data(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
