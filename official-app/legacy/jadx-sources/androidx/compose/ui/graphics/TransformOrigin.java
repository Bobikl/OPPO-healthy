package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.PublishedApi;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FloatCompanionObject;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000bJ*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "pivotFractionX", "", "getPivotFractionX-impl", "(J)F", "pivotFractionY", "getPivotFractionY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-zey9I6w", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n34#2:84\n41#2:85\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:85\n*E\n"})
public final class TransformOrigin {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin$Companion;", "", "()V", "Center", "Landroidx/compose/ui/graphics/TransformOrigin;", "getCenter-SzJe1aQ", "()J", "J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m1999getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }
    }

    private /* synthetic */ TransformOrigin(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m1986boximpl(long j2) {
        return new TransformOrigin(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1987component1impl(long j2) {
        return m1994getPivotFractionXimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m1988component2impl(long j2) {
        return m1995getPivotFractionYimpl(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1989constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m1990copyzey9I6w(long j2, float f, float f2) {
        return TransformOriginKt.TransformOrigin(f, f2);
    }

    /* JADX INFO: renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m1991copyzey9I6w$default(long j2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m1994getPivotFractionXimpl(j2);
        }
        if ((i & 2) != 0) {
            f2 = m1995getPivotFractionYimpl(j2);
        }
        return m1990copyzey9I6w(j2, f, f2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1992equalsimpl(long j2, Object obj) {
        return (obj instanceof TransformOrigin) && j2 == ((TransformOrigin) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1993equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m1994getPivotFractionXimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m1995getPivotFractionYimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1996hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1997toStringimpl(long j2) {
        return "TransformOrigin(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m1992equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1996hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1997toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
