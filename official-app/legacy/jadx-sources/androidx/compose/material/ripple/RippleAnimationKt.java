package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\r\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"BoundedRippleExtraRadius", "Landroidx/compose/ui/unit/Dp;", UserInfo.SEX_FEMALE, "FadeInDuration", "", "FadeOutDuration", "RadiusDuration", "getRippleStartRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "getRippleStartRadius-uvyYCjk", "(J)F", "getRippleEndRadius", "Landroidx/compose/ui/unit/Density;", "bounded", "", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n155#2:195\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n189#1:195\n*E\n"})
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m4104constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* JADX INFO: renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1222getRippleEndRadiuscSwnlzA(@NotNull Density getRippleEndRadius, boolean z, long j2) {
        Intrinsics.checkNotNullParameter(getRippleEndRadius, "$this$getRippleEndRadius");
        float fM1378getDistanceimpl = Offset.m1378getDistanceimpl(OffsetKt.Offset(Size.m1449getWidthimpl(j2), Size.m1446getHeightimpl(j2))) / 2.0f;
        return z ? fM1378getDistanceimpl + getRippleEndRadius.mo313toPx0680j_4(BoundedRippleExtraRadius) : fM1378getDistanceimpl;
    }

    /* JADX INFO: renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1223getRippleStartRadiusuvyYCjk(long j2) {
        return Math.max(Size.m1449getWidthimpl(j2), Size.m1446getHeightimpl(j2)) * 0.3f;
    }
}
