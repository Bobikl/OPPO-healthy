package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "packedValue", "", "constructor-impl", "(J)J", "componentCount", "", "getComponentCount$annotations", "()V", "getComponentCount-impl", "(J)I", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,89:1\n55#2:90\n48#2:91\n48#2:92\n48#2:93\n48#2:94\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n48#1:90\n57#1:91\n64#1:92\n71#1:93\n79#1:94\n*E\n"})
public final class ColorModel {
    private static final long Cmyk;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "()V", "Cmyk", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "getCmyk-xdoWZVw", "()J", "J", "Lab", "getLab-xdoWZVw", "Rgb", "getRgb-xdoWZVw", "Xyz", "getXyz-xdoWZVw", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m2020getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* JADX INFO: renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m2021getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* JADX INFO: renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m2022getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* JADX INFO: renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m2023getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }
    }

    static {
        long j2 = 3;
        long j3 = j2 << 32;
        Rgb = m2013constructorimpl((((long) 0) & 4294967295L) | j3);
        Xyz = m2013constructorimpl((((long) 1) & 4294967295L) | j3);
        Lab = m2013constructorimpl(j3 | (((long) 2) & 4294967295L));
        Cmyk = m2013constructorimpl((j2 & 4294967295L) | (((long) 4) << 32));
    }

    private /* synthetic */ ColorModel(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m2012boximpl(long j2) {
        return new ColorModel(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2013constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2014equalsimpl(long j2, Object obj) {
        return (obj instanceof ColorModel) && j2 == ((ColorModel) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2015equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* JADX INFO: renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m2016getComponentCountimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2017hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2018toStringimpl(long j2) {
        if (m2015equalsimpl0(j2, Rgb)) {
            return "Rgb";
        }
        if (m2015equalsimpl0(j2, Xyz)) {
            return "Xyz";
        }
        if (m2015equalsimpl0(j2, Lab)) {
            return "Lab";
        }
        return m2015equalsimpl0(j2, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2014equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2017hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m2018toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
