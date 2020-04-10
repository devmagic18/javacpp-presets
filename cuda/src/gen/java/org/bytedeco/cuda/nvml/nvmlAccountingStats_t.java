// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;

/** \} */

/***************************************************************************************************/
/** \defgroup nvmlAccountingStats Accounting Statistics
 *  \{
 *
 *  Set of APIs designed to provide per process information about usage of GPU.
 *
 *  \note All accounting statistics and accounting mode live in nvidia driver and reset 
 *        to default (Disabled) when driver unloads.
 *        It is advised to run with persistence mode enabled.
 *
 *  \note Enabling accounting mode has no negative impact on the GPU performance.
 */
/***************************************************************************************************/

/**
 * Describes accounting statistics of a process.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlAccountingStats_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlAccountingStats_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlAccountingStats_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlAccountingStats_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlAccountingStats_t position(long position) {
        return (nvmlAccountingStats_t)super.position(position);
    }

    /** Percent of time over the process's lifetime during which one or more kernels was executing on the GPU. */
    public native @Cast("unsigned int") int gpuUtilization(); public native nvmlAccountingStats_t gpuUtilization(int setter);
                                                /** Utilization stats just like returned by \ref nvmlDeviceGetUtilizationRates but for the life time of a
                                                 *  process (not just the last sample period).
                                                 *  Set to NVML_VALUE_NOT_AVAILABLE if nvmlDeviceGetUtilizationRates is not supported */
    
    /** Percent of time over the process's lifetime during which global (device) memory was being read or written. */
    public native @Cast("unsigned int") int memoryUtilization(); public native nvmlAccountingStats_t memoryUtilization(int setter);
                                                /** Set to NVML_VALUE_NOT_AVAILABLE if nvmlDeviceGetUtilizationRates is not supported */
    
    /** Maximum total memory in bytes that was ever allocated by the process. */
    public native @Cast("unsigned long long") long maxMemoryUsage(); public native nvmlAccountingStats_t maxMemoryUsage(long setter);
                                                /** Set to NVML_VALUE_NOT_AVAILABLE if nvmlProcessInfo_t->usedGpuMemory is not supported */
    

    /** Amount of time in ms during which the compute context was active. The time is reported as 0 if 
     *  the process is not terminated */
    public native @Cast("unsigned long long") long time(); public native nvmlAccountingStats_t time(long setter);
    
    /** CPU Timestamp in usec representing start time for the process */
    public native @Cast("unsigned long long") long startTime(); public native nvmlAccountingStats_t startTime(long setter);
    
    /** Flag to represent if the process is running (1 for running, 0 for terminated) */
    public native @Cast("unsigned int") int isRunning(); public native nvmlAccountingStats_t isRunning(int setter);

    /** Reserved for future use */
    public native @Cast("unsigned int") int reserved(int i); public native nvmlAccountingStats_t reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}
