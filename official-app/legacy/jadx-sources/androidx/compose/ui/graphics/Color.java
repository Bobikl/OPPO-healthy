package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.xnl;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.ULong;
import p010kotlin.UnsignedKt;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010%\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b&\u0010\u0013J\u001e\u0010'\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J@\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n*L\n1#1,659:1\n320#2:660\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n*E\n"})
public final class Color {
    private final long value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002JB\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R'\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R'\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R'\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R'\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R'\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R'\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R'\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R'\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", b2n.g, "s", LogFieldKey.LEVEL_KEY, "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1629getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1630getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1631getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1632getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1633getGray0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1634getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1635getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1636getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1637getRed0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1638getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1639getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1640getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m1641getYellow0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m1642hslJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m1657hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hslToRgbComponent(int n2, float h, float s, float l2) {
            float f = (n2 + (h / 30.0f)) % 12.0f;
            return l2 - ((s * Math.min(l2, 1.0f - l2)) * Math.max(-1.0f, Math.min(f - 3, Math.min(9 - f, 1.0f))));
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m1643hsvJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m1658hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hsvToRgbComponent(int n2, float h, float s, float v) {
            float f = (n2 + (h / 60.0f)) % 6.0f;
            return v - ((s * v) * Math.max(0.0f, Math.min(f, Math.min(4 - f, 1.0f))));
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m1644getBlack0d7_KjU() {
            return Color.Black;
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m1645getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m1646getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m1647getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m1648getGray0d7_KjU() {
            return Color.Gray;
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m1649getGreen0d7_KjU() {
            return Color.Green;
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m1650getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m1651getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m1652getRed0d7_KjU() {
            return Color.Red;
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m1653getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m1654getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m1655getWhite0d7_KjU() {
            return Color.White;
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m1656getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0034  */
        /* JADX INFO: renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m1657hslJlNiLsg(float hue, float saturation, float lightness, float alpha, @NotNull Rgb colorSpace) {
            boolean z;
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            if (0.0f <= hue && hue <= 360.0f) {
                if (0.0f <= saturation && saturation <= 1.0f) {
                    z = (0.0f > lightness ? 1 : (0.0f == lightness ? 0 : -1)) <= 0 && (lightness > 1.0f ? 1 : (lightness == 1.0f ? 0 : -1)) <= 0;
                }
            }
            if (z) {
                return ColorKt.Color(hslToRgbComponent(0, hue, saturation, lightness), hslToRgbComponent(8, hue, saturation, lightness), hslToRgbComponent(4, hue, saturation, lightness), alpha, colorSpace);
            }
            throw new IllegalArgumentException(("HSL (" + hue + ", " + saturation + ", " + lightness + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m1658hsvJlNiLsg(float hue, float saturation, float value, float alpha, @NotNull Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            boolean z = false;
            if (0.0f <= hue && hue <= 360.0f) {
                if (0.0f <= saturation && saturation <= 1.0f) {
                    if (0.0f <= value && value <= 1.0f) {
                        z = true;
                    }
                }
            }
            if (z) {
                return ColorKt.Color(hsvToRgbComponent(5, hue, saturation, value), hsvToRgbComponent(3, hue, saturation, value), hsvToRgbComponent(1, hue, saturation, value), alpha, colorSpace);
            }
            throw new IllegalArgumentException(("HSV (" + hue + ", " + saturation + ", " + value + ") must be in range (0..360, 0..1, 0..1)").toString());
        }
    }

    private /* synthetic */ Color(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m1608boximpl(long j2) {
        return new Color(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1609component1impl(long j2) {
        return m1624getRedimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m1610component2impl(long j2) {
        return m1623getGreenimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component3-impl, reason: not valid java name */
    public static final float m1611component3impl(long j2) {
        return m1621getBlueimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component4-impl, reason: not valid java name */
    public static final float m1612component4impl(long j2) {
        return m1620getAlphaimpl(j2);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m1613component5impl(long j2) {
        return m1622getColorSpaceimpl(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1614constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m1615convertvNxB06k(long j2, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        ColorSpace colorSpaceM1622getColorSpaceimpl = m1622getColorSpaceimpl(j2);
        return Intrinsics.areEqual(colorSpace, colorSpaceM1622getColorSpaceimpl) ? j2 : ColorSpaceKt.m2027connectYBCOT_4$default(colorSpaceM1622getColorSpaceimpl, colorSpace, 0, 2, null).mo2029transformToColorwmQWz5c$ui_graphics_release(m1624getRedimpl(j2), m1623getGreenimpl(j2), m1621getBlueimpl(j2), m1620getAlphaimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m1616copywmQWz5c(long j2, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m1622getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m1617copywmQWz5c$default(long j2, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m1620getAlphaimpl(j2);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m1624getRedimpl(j2);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m1623getGreenimpl(j2);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m1621getBlueimpl(j2);
        }
        return m1616copywmQWz5c(j2, f5, f6, f7, f4);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1618equalsimpl(long j2, Object obj) {
        return (obj instanceof Color) && j2 == ((Color) obj).m1628unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1619equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* JADX INFO: renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m1620getAlphaimpl(long j2) {
        float fUlongToDouble;
        float f;
        if (ULong.m5461constructorimpl(63 & j2) == 0) {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 56) & 255));
            f = 255.0f;
        } else {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 6) & 1023));
            f = 1023.0f;
        }
        return fUlongToDouble / f;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* JADX INFO: renamed from: getBlue-impl, reason: not valid java name */
    public static final float m1621getBlueimpl(long j2) {
        return ULong.m5461constructorimpl(63 & j2) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 32) & 255))) / 255.0f : Float16.m1738toFloatimpl(Float16.m1722constructorimpl((short) ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 16) & xnl.PAYLOAD_SHORT_MAX)));
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m1622getColorSpaceimpl(long j2) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m5461constructorimpl(j2 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* JADX INFO: renamed from: getGreen-impl, reason: not valid java name */
    public static final float m1623getGreenimpl(long j2) {
        return ULong.m5461constructorimpl(63 & j2) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 40) & 255))) / 255.0f : Float16.m1738toFloatimpl(Float16.m1722constructorimpl((short) ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 32) & xnl.PAYLOAD_SHORT_MAX)));
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* JADX INFO: renamed from: getRed-impl, reason: not valid java name */
    public static final float m1624getRedimpl(long j2) {
        return ULong.m5461constructorimpl(63 & j2) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 48) & 255))) / 255.0f : Float16.m1738toFloatimpl(Float16.m1722constructorimpl((short) ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2 >>> 48) & xnl.PAYLOAD_SHORT_MAX)));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1625hashCodeimpl(long j2) {
        return ULong.m5473hashCodeimpl(j2);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1626toStringimpl(long j2) {
        return "Color(" + m1624getRedimpl(j2) + ", " + m1623getGreenimpl(j2) + ", " + m1621getBlueimpl(j2) + ", " + m1620getAlphaimpl(j2) + ", " + m1622getColorSpaceimpl(j2).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m1618equalsimpl(this.value, obj);
    }

    /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1625hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m1626toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1628unboximpl() {
        return this.value;
    }
}
