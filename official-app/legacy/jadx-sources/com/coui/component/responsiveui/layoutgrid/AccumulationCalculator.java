package com.coui.component.responsiveui.layoutgrid;

import com.coui.component.responsiveui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"Lcom/coui/component/responsiveui/layoutgrid/AccumulationCalculator;", "Lcom/coui/component/responsiveui/layoutgrid/IColumnsWidthCalculator;", "()V", "calculate", "", "Lcom/coui/component/responsiveui/unit/Dp;", "layoutGridWidth", "margin", "gutter", "columnCount", "", "(Lcom/coui/component/responsiveui/unit/Dp;Lcom/coui/component/responsiveui/unit/Dp;Lcom/coui/component/responsiveui/unit/Dp;I)[Lcom/coui/component/responsiveui/unit/Dp;", "", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccumulationCalculator implements IColumnsWidthCalculator {
    @Override // com.coui.component.responsiveui.layoutgrid.IColumnsWidthCalculator
    @NotNull
    public Dp[] calculate(@NotNull Dp layoutGridWidth, @NotNull Dp margin, @NotNull Dp gutter, int columnCount) {
        Intrinsics.checkNotNullParameter(layoutGridWidth, "layoutGridWidth");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(gutter, "gutter");
        Dp[] dpArr = new Dp[columnCount];
        int i = 0;
        for (int i2 = 0; i2 < columnCount; i2++) {
            dpArr[i2] = new Dp(0.0f);
        }
        float f = columnCount - 1;
        if (((double) (gutter.getValue() * f)) + (((double) margin.getValue()) * 2.0d) > layoutGridWidth.getValue()) {
            return dpArr;
        }
        double value = ((((double) layoutGridWidth.getValue()) - (((double) margin.getValue()) * 2.0d)) - ((double) (f * gutter.getValue()))) / ((double) columnCount);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dpArr);
        if (lastIndex >= 0) {
            double d = 0.0d;
            while (true) {
                int i3 = i + 1;
                int iRoundToInt = MathKt__MathJVMKt.roundToInt((((double) i3) * value) - d);
                dpArr[i] = new Dp(iRoundToInt);
                d += (double) iRoundToInt;
                if (i == lastIndex) {
                    break;
                }
                i = i3;
            }
        }
        return dpArr;
    }

    @Override // com.coui.component.responsiveui.layoutgrid.IColumnsWidthCalculator
    @NotNull
    public int[] calculate(int layoutGridWidth, int margin, int gutter, int columnCount) {
        int[] iArr = new int[columnCount];
        double d = (columnCount - 1) * gutter;
        double d2 = ((double) margin) * 2.0d;
        double d3 = layoutGridWidth;
        if (d + d2 > d3) {
            return iArr;
        }
        double d4 = ((d3 - d2) - d) / ((double) columnCount);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex >= 0) {
            double d5 = 0.0d;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int iRoundToInt = MathKt__MathJVMKt.roundToInt((((double) i2) * d4) - d5);
                iArr[i] = iRoundToInt;
                d5 += (double) iRoundToInt;
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return iArr;
    }
}
