package com.oplus.aiunit.vision;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/l6m;", "Lcom/github/mikephil/charting/renderer/CombinedChartRenderer;", "", "createRenderers", "Lcom/github/mikephil/charting/model/GradientColor;", "heightGradientColor", "normalGradientColor", "lowGradientColor", "", "maskColor", "b", "type", "a", "", "ifDrawMask", "c", "d", "Lcom/oplus/aiunit/vision/a8m;", "Lcom/oplus/aiunit/vision/a8m;", "gluLineChartRenderer", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class l6m extends CombinedChartRenderer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public a8m gluLineChartRenderer;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CombinedChart.DrawOrder.values().length];
            try {
                iArr[CombinedChart.DrawOrder.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6m(@NotNull CombinedChart chart, @NotNull ChartAnimator animator, @NotNull ViewPortHandler viewPortHandler) {
        super(chart, animator, viewPortHandler);
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
        ChartAnimator mAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(mAnimator, "mAnimator");
        ViewPortHandler mViewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(mViewPortHandler, "mViewPortHandler");
        a8m a8mVar = new a8m(chart, mAnimator, mViewPortHandler);
        this.gluLineChartRenderer = a8mVar;
        Intrinsics.checkNotNull(a8mVar);
        a8mVar.getPaintRender().setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int type) {
        a8m a8mVar = this.gluLineChartRenderer;
        if (a8mVar == null) {
            return;
        }
        a8mVar.D(type);
    }

    public final void b(@NotNull GradientColor heightGradientColor, @NotNull GradientColor normalGradientColor, @NotNull GradientColor lowGradientColor, int maskColor) {
        Intrinsics.checkNotNullParameter(heightGradientColor, "heightGradientColor");
        Intrinsics.checkNotNullParameter(normalGradientColor, "normalGradientColor");
        Intrinsics.checkNotNullParameter(lowGradientColor, "lowGradientColor");
        a8m a8mVar = this.gluLineChartRenderer;
        if (a8mVar != null) {
            a8mVar.F(heightGradientColor);
        }
        a8m a8mVar2 = this.gluLineChartRenderer;
        if (a8mVar2 != null) {
            a8mVar2.J(normalGradientColor);
        }
        a8m a8mVar3 = this.gluLineChartRenderer;
        if (a8mVar3 != null) {
            a8mVar3.H(lowGradientColor);
        }
        a8m a8mVar4 = this.gluLineChartRenderer;
        if (a8mVar4 == null) {
            return;
        }
        a8mVar4.I(maskColor);
    }

    public final void c(boolean ifDrawMask) {
        a8m a8mVar = this.gluLineChartRenderer;
        if (a8mVar == null) {
            return;
        }
        a8mVar.G(ifDrawMask);
    }

    @Override // com.github.mikephil.charting.renderer.CombinedChartRenderer
    public void createRenderers() {
        a8m a8mVar;
        super.createRenderers();
        this.mRenderers.clear();
        CombinedChart combinedChart = (CombinedChart) this.mChart.get();
        if (combinedChart != null) {
            CombinedChart.DrawOrder[] drawOrder = combinedChart.getDrawOrder();
            int length = drawOrder.length;
            for (int i = 0; i < length; i++) {
                CombinedChart.DrawOrder drawOrder2 = drawOrder[i];
                if ((drawOrder2 == null ? -1 : a.$EnumSwitchMapping$0[drawOrder2.ordinal()]) == 1 && combinedChart.getLineData() != null && (a8mVar = this.gluLineChartRenderer) != null) {
                    this.mRenderers.add(a8mVar);
                }
            }
        }
    }

    public final void d(int maskColor) {
        a8m a8mVar = this.gluLineChartRenderer;
        if (a8mVar == null) {
            return;
        }
        a8mVar.I(maskColor);
    }
}