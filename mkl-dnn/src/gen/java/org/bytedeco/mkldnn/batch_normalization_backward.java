// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class batch_normalization_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public batch_normalization_backward(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_batch_normalization_desc_t data(); public native desc data(mkldnn_batch_normalization_desc_t setter);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float epsilon, @Cast("unsigned") int flags) { super((Pointer)null); allocate(aprop_kind, diff_data_desc, data_desc, epsilon, flags); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float epsilon, @Cast("unsigned") int flags);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd);

        public native @ByVal memory.primitive_desc src_primitive_desc();
        public native @ByVal memory.primitive_desc mean_primitive_desc();
        public native @ByVal memory.primitive_desc variance_primitive_desc();
        public native @ByVal memory.primitive_desc weights_primitive_desc();
        public native @ByVal memory.primitive_desc dst_primitive_desc();
        public native @ByVal memory.primitive_desc diff_dst_primitive_desc();
        public native @ByVal memory.primitive_desc workspace_primitive_desc();

        public native @ByVal memory.primitive_desc diff_src_primitive_desc();
        public native @ByVal memory.primitive_desc diff_weights_primitive_desc();
    }

    // Prop_kind == backward
    public batch_normalization_backward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at weights, @Const @ByRef memory diff_src,
                @Const @ByRef memory diff_weights) { super((Pointer)null); allocate(aprimitive_desc, src, mean, variance, diff_dst, weights, diff_src, diff_weights); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at weights, @Const @ByRef memory diff_src,
                @Const @ByRef memory diff_weights);

    // Prop_kind == backward (+ws)
    public batch_normalization_backward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at weights, @Const @ByRef primitive.at workspace,
                @Const @ByRef memory diff_src, @Const @ByRef memory diff_weights) { super((Pointer)null); allocate(aprimitive_desc, src, mean, variance, diff_dst, weights, workspace, diff_src, diff_weights); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at weights, @Const @ByRef primitive.at workspace,
                @Const @ByRef memory diff_src, @Const @ByRef memory diff_weights);

    // Prop_kind == backward_data (+ws or +weights)
    /** \warning This constructor works for backward_data propagation
     *           - w/ weights but w/o workspace, or
     *           - w/ workspace but w/o weights */
    public batch_normalization_backward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance,@Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at weights_or_workspace, @Const @ByRef memory diff_src) { super((Pointer)null); allocate(aprimitive_desc, src, mean, variance, diff_dst, weights_or_workspace, diff_src); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance,@Const @ByRef primitive.at diff_dst,
                @Const @ByRef primitive.at weights_or_workspace, @Const @ByRef memory diff_src);

    // Prop_kind == backward_data
    public batch_normalization_backward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_src) { super((Pointer)null); allocate(aprimitive_desc, src, mean, variance, diff_dst, diff_src); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at mean,
                @Const @ByRef primitive.at variance, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_src);
}
