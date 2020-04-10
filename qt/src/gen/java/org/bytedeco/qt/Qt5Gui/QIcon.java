// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Gui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;

import static org.bytedeco.qt.global.Qt5Gui.*;

// Parsed from QtGui/qicon.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Gui.class)
public class QIcon extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QIcon(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QIcon(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QIcon position(long position) {
        return (QIcon)super.position(position);
    }

    /** enum QIcon::Mode */
    public static final int Normal = 0, Disabled = 1, Active = 2, Selected = 3;
    /** enum QIcon::State */
    public static final int On = 0, Off = 1;

    public QIcon() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    public QIcon(@Const @ByRef QIcon other) { super((Pointer)null); allocate(other); }
    private native void allocate(@Const @ByRef QIcon other);
    public QIcon(@Const @ByRef QString fileName) { super((Pointer)null); allocate(fileName); }
    private native void allocate(@Const @ByRef QString fileName); // file or resource name
    public native @ByRef @Name("operator =") QIcon put(@Const @ByRef QIcon other);
    public native @NoException void swap(@ByRef QIcon other);

    public native @ByVal @Name("operator QVariant") QVariant asQVariant();

    public native @ByVal QSize actualSize(@Const @ByRef QSize size, @Cast("QIcon::Mode") int mode/*=QIcon::Normal*/, @Cast("QIcon::State") int state/*=QIcon::Off*/);
    public native @ByVal QSize actualSize(@Const @ByRef QSize size);

    public native @ByVal QString name();

    public native @Cast("bool") boolean isNull();
    public native @Cast("bool") boolean isDetached();
    public native void detach();

// #if QT_DEPRECATED_SINCE(5, 0)
// #endif
    public native long cacheKey();
    public native void addFile(@Const @ByRef QString fileName, @Const @ByRef(nullValue = "QSize()") QSize size, @Cast("QIcon::Mode") int mode/*=QIcon::Normal*/, @Cast("QIcon::State") int state/*=QIcon::Off*/);
    public native void addFile(@Const @ByRef QString fileName);

    public native void setIsMask(@Cast("bool") boolean isMask);
    public native @Cast("bool") boolean isMask();

    public static native @ByVal QIcon fromTheme(@Const @ByRef QString name);
    public static native @ByVal QIcon fromTheme(@Const @ByRef QString name, @Const @ByRef QIcon fallback);
    public static native @Cast("bool") boolean hasThemeIcon(@Const @ByRef QString name);

    public static native @ByVal QString themeName();
    public static native void setThemeName(@Const @ByRef QString path);

    public static native @ByVal QString fallbackThemeName();
    public static native void setFallbackThemeName(@Const @ByRef QString name);
// #if !defined(QT_NO_DATASTREAM)
    
    
    public native @Cast("QIcon::DataPtr*") @ByRef PointerPointer data_ptr();
}
