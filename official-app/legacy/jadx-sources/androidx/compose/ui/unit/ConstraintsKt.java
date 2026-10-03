package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ViewEntity;
import p010kotlin.Metadata;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {androidx.constraintlayout.widget.Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", ViewEntity.MIN_WIDTH, "", ParserTag.TAG_MAX_WIDTH, ViewEntity.MIN_HEIGHT, ParserTag.TAG_MAX_HEIGHT, "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", Fields.HEIGHT_FIELD, "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", Fields.WIDTH_FIELD, "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (!(i4 >= i3)) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i >= 0 && i3 >= 0) {
            return Constraints.INSTANCE.m4067createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : RangesKt___RangesKt.coerceAtLeast(i + i2, 0);
    }

    @Stable
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m4071constrain4WqzIAM(long j2, long j3) {
        return IntSizeKt.IntSize(RangesKt___RangesKt.coerceIn(IntSize.m4264getWidthimpl(j3), Constraints.m4062getMinWidthimpl(j2), Constraints.m4060getMaxWidthimpl(j2)), RangesKt___RangesKt.coerceIn(IntSize.m4263getHeightimpl(j3), Constraints.m4061getMinHeightimpl(j2), Constraints.m4059getMaxHeightimpl(j2)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m4072constrainN9IONVI(long j2, long j3) {
        return Constraints(RangesKt___RangesKt.coerceIn(Constraints.m4062getMinWidthimpl(j3), Constraints.m4062getMinWidthimpl(j2), Constraints.m4060getMaxWidthimpl(j2)), RangesKt___RangesKt.coerceIn(Constraints.m4060getMaxWidthimpl(j3), Constraints.m4062getMinWidthimpl(j2), Constraints.m4060getMaxWidthimpl(j2)), RangesKt___RangesKt.coerceIn(Constraints.m4061getMinHeightimpl(j3), Constraints.m4061getMinHeightimpl(j2), Constraints.m4059getMaxHeightimpl(j2)), RangesKt___RangesKt.coerceIn(Constraints.m4059getMaxHeightimpl(j3), Constraints.m4061getMinHeightimpl(j2), Constraints.m4059getMaxHeightimpl(j2)));
    }

    @Stable
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m4073constrainHeightK40F9xA(long j2, int i) {
        return RangesKt___RangesKt.coerceIn(i, Constraints.m4061getMinHeightimpl(j2), Constraints.m4059getMaxHeightimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m4074constrainWidthK40F9xA(long j2, int i) {
        return RangesKt___RangesKt.coerceIn(i, Constraints.m4062getMinWidthimpl(j2), Constraints.m4060getMaxWidthimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m4075isSatisfiedBy4WqzIAM(long j2, long j3) {
        int iM4062getMinWidthimpl = Constraints.m4062getMinWidthimpl(j2);
        int iM4060getMaxWidthimpl = Constraints.m4060getMaxWidthimpl(j2);
        int iM4264getWidthimpl = IntSize.m4264getWidthimpl(j3);
        if (iM4062getMinWidthimpl <= iM4264getWidthimpl && iM4264getWidthimpl <= iM4060getMaxWidthimpl) {
            int iM4061getMinHeightimpl = Constraints.m4061getMinHeightimpl(j2);
            int iM4059getMaxHeightimpl = Constraints.m4059getMaxHeightimpl(j2);
            int iM4263getHeightimpl = IntSize.m4263getHeightimpl(j3);
            if (iM4061getMinHeightimpl <= iM4263getHeightimpl && iM4263getHeightimpl <= iM4059getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m4076offsetNN6EwU(long j2, int i, int i2) {
        return Constraints(RangesKt___RangesKt.coerceAtLeast(Constraints.m4062getMinWidthimpl(j2) + i, 0), addMaxWithMinimum(Constraints.m4060getMaxWidthimpl(j2), i), RangesKt___RangesKt.coerceAtLeast(Constraints.m4061getMinHeightimpl(j2) + i2, 0), addMaxWithMinimum(Constraints.m4059getMaxHeightimpl(j2), i2));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m4077offsetNN6EwU$default(long j2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m4076offsetNN6EwU(j2, i, i2);
    }
}
