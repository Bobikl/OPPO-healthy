package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\fH\u0002\u001a+\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0019\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "lerp--bDIf60", "(JJF)J", "div", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "roundToTenths", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "times", "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n130#1:201\n25#2,3:198\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:201\n31#1:198,3\n*E\n"})
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m3193constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m3207divUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m1449getWidthimpl(j2) / ScaleFactor.m3199getScaleXimpl(j3), Size.m1446getHeightimpl(j2) / ScaleFactor.m3200getScaleYimpl(j3));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3208isSpecifiedFK8aYYs(long j2) {
        return j2 != ScaleFactor.Companion.m3206getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3209isSpecifiedFK8aYYs$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3210isUnspecifiedFK8aYYs(long j2) {
        return j2 == ScaleFactor.Companion.m3206getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3211isUnspecifiedFK8aYYs$annotations(long j2) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m3212lerpbDIf60(long j2, long j3, float f) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m3199getScaleXimpl(j2), ScaleFactor.m3199getScaleXimpl(j3), f), MathHelpersKt.lerp(ScaleFactor.m3200getScaleYimpl(j2), ScaleFactor.m3200getScaleYimpl(j3), f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m3213takeOrElseoyDd2qo(long j2, @NotNull Function0<ScaleFactor> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > ScaleFactor.Companion.m3206getUnspecified_hLwfpc() ? 1 : (j2 == ScaleFactor.Companion.m3206getUnspecified_hLwfpc() ? 0 : -1)) != 0 ? j2 : block.invoke().m3204unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m3214timesUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m1449getWidthimpl(j2) * ScaleFactor.m3199getScaleXimpl(j3), Size.m1446getHeightimpl(j2) * ScaleFactor.m3200getScaleYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m3215timesmw2e94(long j2, long j3) {
        return m3214timesUQTWf7w(j3, j2);
    }
}
