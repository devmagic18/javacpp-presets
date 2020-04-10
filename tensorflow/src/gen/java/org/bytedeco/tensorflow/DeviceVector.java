// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::vector<tensorflow::Device*>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceVector(Pointer p) { super(p); }
    public DeviceVector(Device value) { this(1); put(0, value); }
    public DeviceVector(Device ... array) { this(array.length); put(array); }
    public DeviceVector()       { allocate();  }
    public DeviceVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef DeviceVector put(@ByRef DeviceVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native Device get(@Cast("size_t") long i);
    public native DeviceVector put(@Cast("size_t") long i, Device value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, Device value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Const Device get();
    }

    public Device[] get() {
        Device[] array = new Device[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Device pop_back() {
        long size = size();
        Device value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public DeviceVector push_back(Device value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public DeviceVector put(Device value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public DeviceVector put(Device ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

