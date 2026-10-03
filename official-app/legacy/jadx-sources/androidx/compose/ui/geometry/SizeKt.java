package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010$\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020%2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0019\u0010'\u001a\u00020(*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\"\u0010\f\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"center", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "(FF)J", "lerp", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "times", "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,225:1\n152#1:229\n25#2,3:226\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n166#1:229\n33#1:226,3\n*E\n"})
public final class SizeKt {
    @Stable
    public static final long Size(float f, float f2) {
        return Size.m1440constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m1459getCenteruvyYCjk(long j2) {
        return OffsetKt.Offset(Size.m1449getWidthimpl(j2) / 2.0f, Size.m1446getHeightimpl(j2) / 2.0f);
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1460getCenteruvyYCjk$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1461isSpecifieduvyYCjk(long j2) {
        return j2 != Size.INSTANCE.m1457getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1462isSpecifieduvyYCjk$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m1463isUnspecifieduvyYCjk(long j2) {
        return j2 == Size.INSTANCE.m1457getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m1464isUnspecifieduvyYCjk$annotations(long j2) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m1465lerpVgWVRYQ(long j2, long j3, float f) {
        return Size(MathHelpersKt.lerp(Size.m1449getWidthimpl(j2), Size.m1449getWidthimpl(j3), f), MathHelpersKt.lerp(Size.m1446getHeightimpl(j2), Size.m1446getHeightimpl(j3), f));
    }

    /* JADX INFO: renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m1466takeOrElseTmRCtEA(long j2, @NotNull Function0<Size> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > Size.INSTANCE.m1457getUnspecifiedNHjbRc() ? 1 : (j2 == Size.INSTANCE.m1457getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? j2 : block.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1469timesd16Qtg0(int i, long j2) {
        return Size.m1452times7Ah8Wj8(j2, i);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m1470toRectuvyYCjk(long j2) {
        return RectKt.m1420Recttz77jQw(Offset.INSTANCE.m1396getZeroF1C5BW0(), j2);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1467timesd16Qtg0(double d, long j2) {
        return Size.m1452times7Ah8Wj8(j2, (float) d);
    }

    @Stable
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m1468timesd16Qtg0(float f, long j2) {
        return Size.m1452times7Ah8Wj8(j2, f);
    }
}
