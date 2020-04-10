// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LDT_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LDT_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LDT_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LDT_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LDT_ENTRY position(long position) {
        return (LDT_ENTRY)super.position(position);
    }

    public native @Cast("WORD") short LimitLow(); public native LDT_ENTRY LimitLow(short setter);
    public native @Cast("WORD") short BaseLow(); public native LDT_ENTRY BaseLow(short setter);
            @Name("HighWord.Bytes.BaseMid") public native @Cast("BYTE") byte HighWord_Bytes_BaseMid(); public native LDT_ENTRY HighWord_Bytes_BaseMid(byte setter);
            @Name("HighWord.Bytes.Flags1") public native @Cast("BYTE") byte HighWord_Bytes_Flags1(); public native LDT_ENTRY HighWord_Bytes_Flags1(byte setter);     // Declare as bytes to avoid alignment
            @Name("HighWord.Bytes.Flags2") public native @Cast("BYTE") byte HighWord_Bytes_Flags2(); public native LDT_ENTRY HighWord_Bytes_Flags2(byte setter);     // Problems.
            @Name("HighWord.Bytes.BaseHi") public native @Cast("BYTE") byte HighWord_Bytes_BaseHi(); public native LDT_ENTRY HighWord_Bytes_BaseHi(byte setter);
            @Name("HighWord.Bits.BaseMid") public native @Cast("DWORD") @NoOffset int HighWord_Bits_BaseMid(); public native LDT_ENTRY HighWord_Bits_BaseMid(int setter);
            @Name("HighWord.Bits.Type") public native @Cast("DWORD") @NoOffset int HighWord_Bits_Type(); public native LDT_ENTRY HighWord_Bits_Type(int setter);
            @Name("HighWord.Bits.Dpl") public native @Cast("DWORD") @NoOffset int HighWord_Bits_Dpl(); public native LDT_ENTRY HighWord_Bits_Dpl(int setter);
            @Name("HighWord.Bits.Pres") public native @Cast("DWORD") @NoOffset int HighWord_Bits_Pres(); public native LDT_ENTRY HighWord_Bits_Pres(int setter);
            @Name("HighWord.Bits.LimitHi") public native @Cast("DWORD") @NoOffset int HighWord_Bits_LimitHi(); public native LDT_ENTRY HighWord_Bits_LimitHi(int setter);
            @Name("HighWord.Bits.Sys") public native @Cast("DWORD") @NoOffset int HighWord_Bits_Sys(); public native LDT_ENTRY HighWord_Bits_Sys(int setter);
            @Name("HighWord.Bits.Reserved_0") public native @Cast("DWORD") @NoOffset int HighWord_Bits_Reserved_0(); public native LDT_ENTRY HighWord_Bits_Reserved_0(int setter);
            @Name("HighWord.Bits.Default_Big") public native @Cast("DWORD") @NoOffset int HighWord_Bits_Default_Big(); public native LDT_ENTRY HighWord_Bits_Default_Big(int setter);
            @Name("HighWord.Bits.Granularity") public native @Cast("DWORD") @NoOffset int HighWord_Bits_Granularity(); public native LDT_ENTRY HighWord_Bits_Granularity(int setter);
            @Name("HighWord.Bits.BaseHi") public native @Cast("DWORD") @NoOffset int HighWord_Bits_BaseHi(); public native LDT_ENTRY HighWord_Bits_BaseHi(int setter);
}
