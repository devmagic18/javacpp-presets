// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;



/** Data structure for a single dewarp */
@Name("L_Dewarp") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_DEWARP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_DEWARP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_DEWARP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_DEWARP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_DEWARP position(long position) {
        return (L_DEWARP)super.position(position);
    }

    /** ptr to parent (not owned)          */
    public native L_DEWARPA dewa(); public native L_DEWARP dewa(L_DEWARPA setter);
    /** source pix, 1 bpp                  */
    public native PIX pixs(); public native L_DEWARP pixs(PIX setter);
    /** sampled vert disparity array       */
    public native FPIX sampvdispar(); public native L_DEWARP sampvdispar(FPIX setter);
    /** sampled horiz disparity array      */
    public native FPIX samphdispar(); public native L_DEWARP samphdispar(FPIX setter);
    /** sampled slope h-disparity array    */
    public native FPIX sampydispar(); public native L_DEWARP sampydispar(FPIX setter);
    /** full vert disparity array          */
    public native FPIX fullvdispar(); public native L_DEWARP fullvdispar(FPIX setter);
    /** full horiz disparity array         */
    public native FPIX fullhdispar(); public native L_DEWARP fullhdispar(FPIX setter);
    /** full slope h-disparity array       */
    public native FPIX fullydispar(); public native L_DEWARP fullydispar(FPIX setter);
    /** sorted y val of midpoint each line */
    public native NUMA namidys(); public native L_DEWARP namidys(NUMA setter);
    /** sorted curvature of each line      */
    public native NUMA nacurves(); public native L_DEWARP nacurves(NUMA setter);
    /** width of source image              */
    public native @Cast("l_int32") int w(); public native L_DEWARP w(int setter);
    /** height of source image             */
    public native @Cast("l_int32") int h(); public native L_DEWARP h(int setter);
    /** page number; important for reuse   */
    public native @Cast("l_int32") int pageno(); public native L_DEWARP pageno(int setter);
    /** sampling factor of disparity arrays */
    public native @Cast("l_int32") int sampling(); public native L_DEWARP sampling(int setter);
    /** reduction factor of pixs: 1 or 2   */
    public native @Cast("l_int32") int redfactor(); public native L_DEWARP redfactor(int setter);
    /** min number of long lines required  */
    public native @Cast("l_int32") int minlines(); public native L_DEWARP minlines(int setter);
    /** number of long lines found         */
    public native @Cast("l_int32") int nlines(); public native L_DEWARP nlines(int setter);
    /** min line curvature in micro-units  */
    public native @Cast("l_int32") int mincurv(); public native L_DEWARP mincurv(int setter);
    /** max line curvature in micro-units  */
    public native @Cast("l_int32") int maxcurv(); public native L_DEWARP maxcurv(int setter);
    /** left edge slope in milli-units     */
    public native @Cast("l_int32") int leftslope(); public native L_DEWARP leftslope(int setter);
    /** right edge slope in milli-units    */
    public native @Cast("l_int32") int rightslope(); public native L_DEWARP rightslope(int setter);
    /** left edge curvature in micro-units */
    public native @Cast("l_int32") int leftcurv(); public native L_DEWARP leftcurv(int setter);
    /** right edge curvature in micro-units*/
    public native @Cast("l_int32") int rightcurv(); public native L_DEWARP rightcurv(int setter);
    /** number of sampling pts in x-dir    */
    public native @Cast("l_int32") int nx(); public native L_DEWARP nx(int setter);
    /** number of sampling pts in y-dir    */
    public native @Cast("l_int32") int ny(); public native L_DEWARP ny(int setter);
    /** 0 if normal; 1 if has a refpage    */
    public native @Cast("l_int32") int hasref(); public native L_DEWARP hasref(int setter);
    /** page with disparity model to use   */
    public native @Cast("l_int32") int refpage(); public native L_DEWARP refpage(int setter);
    /** sets to 1 if vert disparity builds */
    public native @Cast("l_int32") int vsuccess(); public native L_DEWARP vsuccess(int setter);
    /** sets to 1 if horiz disparity builds */
    public native @Cast("l_int32") int hsuccess(); public native L_DEWARP hsuccess(int setter);
    /** sets to 1 if slope disparity builds */
    public native @Cast("l_int32") int ysuccess(); public native L_DEWARP ysuccess(int setter);
    /** sets to 1 if valid vert disparity  */
    public native @Cast("l_int32") int vvalid(); public native L_DEWARP vvalid(int setter);
    /** sets to 1 if valid horiz disparity */
    public native @Cast("l_int32") int hvalid(); public native L_DEWARP hvalid(int setter);
    /** if 1, skip horiz disparity         */
    /** correction                         */
    public native @Cast("l_int32") int skip_horiz(); public native L_DEWARP skip_horiz(int setter);
    /** set to 1 if debug output requested */
    public native @Cast("l_int32") int debug(); public native L_DEWARP debug(int setter);
}
