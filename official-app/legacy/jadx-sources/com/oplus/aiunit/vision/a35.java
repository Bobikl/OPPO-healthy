package com.oplus.aiunit.vision;

import androidx.annotation.Px;
import coil.size.Scale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J8\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J8\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007J8\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/a35;", "", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "Lcoil/size/Scale;", "scale", "a", "", "c", "", "d", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class a35 {

    @NotNull
    public static final a35 INSTANCE = new a35();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final int a(@Px int srcWidth, @Px int srcHeight, @Px int dstWidth, @Px int dstHeight, @NotNull Scale scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int iHighestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return RangesKt___RangesKt.coerceAtLeast(iMin, 1);
    }

    @JvmStatic
    public static final double b(@Px double srcWidth, @Px double srcHeight, @Px double dstWidth, @Px double dstHeight, @NotNull Scale scale) {
        double d = dstWidth / srcWidth;
        double d2 = dstHeight / srcHeight;
        int i = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i == 2) {
            return Math.min(d, d2);
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final double c(@Px int srcWidth, @Px int srcHeight, @Px int dstWidth, @Px int dstHeight, @NotNull Scale scale) {
        double d = ((double) dstWidth) / ((double) srcWidth);
        double d2 = ((double) dstHeight) / ((double) srcHeight);
        int i = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i == 2) {
            return Math.min(d, d2);
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final float d(@Px float srcWidth, @Px float srcHeight, @Px float dstWidth, @Px float dstHeight, @NotNull Scale scale) {
        float f = dstWidth / srcWidth;
        float f2 = dstHeight / srcHeight;
        int i = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return Math.max(f, f2);
        }
        if (i == 2) {
            return Math.min(f, f2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
