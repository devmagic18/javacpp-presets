// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Gui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;

import static org.bytedeco.qt.global.Qt5Gui.*;

// Parsed from QtGui/qfont.h

@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Gui.class)
public class QFont extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QFont(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QFont(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QFont position(long position) {
        return (QFont)super.position(position);
    }

    /** enum QFont::StyleHint */
    public static final int
        Helvetica = 0,  SansSerif = Helvetica,
        Times = Helvetica + 1,      Serif = Times,
        Courier = Times + 1,    TypeWriter = Courier,
        OldEnglish = Courier + 1, Decorative = OldEnglish,
        System = OldEnglish + 1,
        AnyStyle = OldEnglish + 2,
        Cursive = OldEnglish + 3,
        Monospace = OldEnglish + 4,
        Fantasy = OldEnglish + 5;
    

    /** enum QFont::StyleStrategy */
    public static final int
        PreferDefault       = 0x0001,
        PreferBitmap        = 0x0002,
        PreferDevice        = 0x0004,
        PreferOutline       = 0x0008,
        ForceOutline        = 0x0010,
        PreferMatch         = 0x0020,
        PreferQuality       = 0x0040,
        PreferAntialias     = 0x0080,
        NoAntialias         = 0x0100,
        OpenGLCompatible    = 0x0200,
        ForceIntegerMetrics = 0x0400,
        NoSubpixelAntialias = 0x0800,
        PreferNoShaping     = 0x1000,
        NoFontMerging       = 0x8000;
    

    /** enum QFont::HintingPreference */
    public static final int
        PreferDefaultHinting        = 0,
        PreferNoHinting             = 1,
        PreferVerticalHinting       = 2,
        PreferFullHinting           = 3;
    

    // Mapping OpenType weight value.
    /** enum QFont::Weight */
    public static final int
        Thin     = 0,    // 100
        ExtraLight = 12, // 200
        Light    = 25,   // 300
        Normal   = 50,   // 400
        Medium   = 57,   // 500
        DemiBold = 63,   // 600
        Bold     = 75,   // 700
        ExtraBold = 81,  // 800
        Black    = 87;    // 900
    

    /** enum QFont::Style */
    public static final int
        StyleNormal = 0,
        StyleItalic = 1,
        StyleOblique = 2;
    

    /** enum QFont::Stretch */
    public static final int
        AnyStretch     = 0,
        UltraCondensed = 50,
        ExtraCondensed = 62,
        Condensed      = 75,
        SemiCondensed  = 87,
        Unstretched    = 100,
        SemiExpanded   = 112,
        Expanded       = 125,
        ExtraExpanded  = 150,
        UltraExpanded  = 200;
    

    /** enum QFont::Capitalization */
    public static final int
        MixedCase = 0,
        AllUppercase = 1,
        AllLowercase = 2,
        SmallCaps = 3,
        Capitalize = 4;
    

    /** enum QFont::SpacingType */
    public static final int
        PercentageSpacing = 0,
        AbsoluteSpacing = 1;
    

    /** enum QFont::ResolveProperties */
    public static final int
        NoPropertiesResolved        = 0x0000,
        FamilyResolved              = 0x0001,
        SizeResolved                = 0x0002,
        StyleHintResolved           = 0x0004,
        StyleStrategyResolved       = 0x0008,
        WeightResolved              = 0x0010,
        StyleResolved               = 0x0020,
        UnderlineResolved           = 0x0040,
        OverlineResolved            = 0x0080,
        StrikeOutResolved           = 0x0100,
        FixedPitchResolved          = 0x0200,
        StretchResolved             = 0x0400,
        KerningResolved             = 0x0800,
        CapitalizationResolved      = 0x1000,
        LetterSpacingResolved       = 0x2000,
        WordSpacingResolved         = 0x4000,
        HintingPreferenceResolved   = 0x8000,
        StyleNameResolved           = 0x10000,
        FamiliesResolved            = 0x20000,
        AllPropertiesResolved       = 0x3ffff;
    

    public QFont() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QFont(@Const @ByRef QString family, int pointSize/*=-1*/, int weight/*=-1*/, @Cast("bool") boolean italic/*=false*/) { super((Pointer)null); allocate(family, pointSize, weight, italic); }
    private native void allocate(@Const @ByRef QString family, int pointSize/*=-1*/, int weight/*=-1*/, @Cast("bool") boolean italic/*=false*/);
    public QFont(@Const @ByRef QString family) { super((Pointer)null); allocate(family); }
    private native void allocate(@Const @ByRef QString family);
// #if QT_VERSION < QT_VERSION_CHECK(6, 0, 0)
// #endif
    public QFont(@Const @ByRef QFont font, @Const QPaintDevice pd) { super((Pointer)null); allocate(font, pd); }
    private native void allocate(@Const @ByRef QFont font, @Const QPaintDevice pd);
    public QFont(@Const @ByRef QFont font) { super((Pointer)null); allocate(font); }
    private native void allocate(@Const @ByRef QFont font);

    public native void swap(@ByRef QFont other);

    public native @ByVal QString family();
    public native void setFamily(@Const @ByRef QString arg0);

    public native @ByVal QString styleName();
    public native void setStyleName(@Const @ByRef QString arg0);

    public native int pointSize();
    public native void setPointSize(int arg0);
    public native double pointSizeF();
    public native void setPointSizeF(double arg0);

    public native int pixelSize();
    public native void setPixelSize(int arg0);

    public native int weight();
    public native void setWeight(int arg0);

    public native @Cast("bool") boolean bold();
    public native void setBold(@Cast("bool") boolean arg0);

    public native void setStyle(@Cast("QFont::Style") int style);
    public native @Cast("QFont::Style") int style();

    public native @Cast("bool") boolean italic();
    public native void setItalic(@Cast("bool") boolean b);

    public native @Cast("bool") boolean underline();
    public native void setUnderline(@Cast("bool") boolean arg0);

    public native @Cast("bool") boolean overline();
    public native void setOverline(@Cast("bool") boolean arg0);

    public native @Cast("bool") boolean strikeOut();
    public native void setStrikeOut(@Cast("bool") boolean arg0);

    public native @Cast("bool") boolean fixedPitch();
    public native void setFixedPitch(@Cast("bool") boolean arg0);

    public native @Cast("bool") boolean kerning();
    public native void setKerning(@Cast("bool") boolean arg0);

    public native @Cast("QFont::StyleHint") int styleHint();
    public native @Cast("QFont::StyleStrategy") int styleStrategy();
    public native void setStyleHint(@Cast("QFont::StyleHint") int arg0, @Cast("QFont::StyleStrategy") int arg1/*=QFont::PreferDefault*/);
    public native void setStyleHint(@Cast("QFont::StyleHint") int arg0);
    public native void setStyleStrategy(@Cast("QFont::StyleStrategy") int s);

    public native int stretch();
    public native void setStretch(int arg0);

    public native double letterSpacing();
    public native @Cast("QFont::SpacingType") int letterSpacingType();
    public native void setLetterSpacing(@Cast("QFont::SpacingType") int type, double spacing);

    public native double wordSpacing();
    public native void setWordSpacing(double spacing);

    public native void setCapitalization(@Cast("QFont::Capitalization") int arg0);
    public native @Cast("QFont::Capitalization") int capitalization();

    public native void setHintingPreference(@Cast("QFont::HintingPreference") int hintingPreference);
    public native @Cast("QFont::HintingPreference") int hintingPreference();

// #if QT_DEPRECATED_SINCE(5, 5)
    public native @Cast("bool") boolean rawMode();
    public native void setRawMode(@Cast("bool") boolean arg0);
// #endif

    // dupicated from QFontInfo
    public native @Cast("bool") boolean exactMatch();

    public native @ByRef @Name("operator =") QFont put(@Const @ByRef QFont arg0);
    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef QFont arg0);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef QFont arg0);
    public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef QFont arg0);
    public native @ByVal @Name("operator QVariant") QVariant asQVariant();
    public native @Cast("bool") boolean isCopyOf(@Const @ByRef QFont arg0);

// #if QT_DEPRECATED_SINCE(5, 3)
    // needed for X11
    public native @Deprecated void setRawName(@Const @ByRef QString arg0);
    public native @Deprecated @ByVal QString rawName();
// #endif

    public native @ByVal QString key();

    public native @ByVal @Name("toString") QString toQString();
    public native @Cast("bool") boolean fromString(@Const @ByRef QString arg0);

    public static native @ByVal QString substitute(@Const @ByRef QString arg0);
    public static native void insertSubstitution(@Const @ByRef QString arg0, @Const @ByRef QString arg1);
    public static native void removeSubstitutions(@Const @ByRef QString arg0);
// #if QT_DEPRECATED_SINCE(5, 0)
// #endif
    public static native void initialize();
    public static native void cleanup();
    public static native void cacheStatistics();

    public native @ByVal QString defaultFamily();
// #if QT_DEPRECATED_SINCE(5, 13)
// #endif

    
    
    
}
