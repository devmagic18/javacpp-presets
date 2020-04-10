// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Camera configuration ROM. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class ConfigROM extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ConfigROM(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ConfigROM(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public ConfigROM position(long position) {
            return (ConfigROM)super.position(position);
        }
    
        /** Vendor ID of a node. */
        public native @Cast("unsigned int") int nodeVendorId(); public native ConfigROM nodeVendorId(int setter);
        /** Chip ID (high part). */
        public native @Cast("unsigned int") int chipIdHi(); public native ConfigROM chipIdHi(int setter);
        /** Chip ID (low part). */
        public native @Cast("unsigned int") int chipIdLo(); public native ConfigROM chipIdLo(int setter);
        /** Unit Spec ID, usually 0xa02d. */
        public native @Cast("unsigned int") int unitSpecId(); public native ConfigROM unitSpecId(int setter);
        /** Unit software version. */
        public native @Cast("unsigned int") int unitSWVer(); public native ConfigROM unitSWVer(int setter);
        /** Unit sub software version. */
        public native @Cast("unsigned int") int unitSubSWVer(); public native ConfigROM unitSubSWVer(int setter);
        /** Vendor unique info 0. */
        public native @Cast("unsigned int") int vendorUniqueInfo_0(); public native ConfigROM vendorUniqueInfo_0(int setter);
        /** Vendor unique info 1. */
        public native @Cast("unsigned int") int vendorUniqueInfo_1(); public native ConfigROM vendorUniqueInfo_1(int setter);
        /** Vendor unique info 2. */
        public native @Cast("unsigned int") int vendorUniqueInfo_2(); public native ConfigROM vendorUniqueInfo_2(int setter);
        /** Vendor unique info 3. */
        public native @Cast("unsigned int") int vendorUniqueInfo_3(); public native ConfigROM vendorUniqueInfo_3(int setter);
        /** Keyword. */
        public native @Cast("char") byte pszKeyword(int i); public native ConfigROM pszKeyword(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer pszKeyword();
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native ConfigROM reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public ConfigROM() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
