package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.health.core.widget.charts.renderer.BaseBarChartRenderer;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/psb;", "Lcom/heytap/health/core/widget/charts/renderer/BaseBarChartRenderer;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;", "dataSet", "", "entryIndex", "stackedValueIndex", LogFieldKey.PROCESS_NAME_KEY, "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class psb extends BaseBarChartRenderer {
    public static final int $stable = 0;

    public psb(@Nullable BarDataProvider barDataProvider, @Nullable ChartAnimator chartAnimator, @Nullable ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
    }

    @Override // com.heytap.health.core.widget.charts.renderer.BaseBarChartRenderer
    public int p(@Nullable IBarDataSet dataSet, int entryIndex, int stackedValueIndex) {
        return dataSet != null ? dataSet.getValueTextColor(stackedValueIndex) : super.p(dataSet, entryIndex, stackedValueIndex);
    }
}
