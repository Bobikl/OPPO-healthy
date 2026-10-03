package com.heytap.health.sleep.view;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.heytap.health.core.widget.charts.HealthTimeXLineChart;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.sleep.R$drawable;
import com.heytap.health.ui.R$color;
import com.oplus.aiunit.vision.hfk;
import com.oplus.aiunit.vision.qe0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/sleep/view/SnoreEnvNoiseChart;", "Lcom/heytap/health/core/widget/charts/HealthTimeXLineChart;", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "dataList", "", "setData", "u", "", "maxValue", "v", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SnoreEnvNoiseChart extends HealthTimeXLineChart {
    public static final int $stable = 0;

    public SnoreEnvNoiseChart(@Nullable Context context) {
        super(context);
        u();
    }

    @Override // com.heytap.health.core.widget.charts.HealthTimeXLineChart, com.heytap.health.core.widget.charts.HealthLineChart
    public void setData(@Nullable List<? extends TimeStampedData> dataList) {
        if (dataList == null || dataList.isEmpty()) {
            clear();
            return;
        }
        ArrayList arrayList = new ArrayList();
        float y = 0.0f;
        for (TimeStampedData timeStampedData : dataList) {
            if (timeStampedData.getY() > y) {
                y = timeStampedData.getY();
            }
            arrayList.add(new Entry((float) (this.E.timeStampToUnitDouble(timeStampedData.getTimestamp()) - this.T), timeStampedData.getY(), timeStampedData));
        }
        v(y);
        setEntryList(arrayList);
    }

    public final void u() {
        super.l();
        setExtraTopOffset(54.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setExtraBottomOffset(0.0f);
        this.E = TimeUnit.MINUTE;
        setYAxisMinimum(0.0f);
        setYAxisMaximum(75.0f);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getXAxis().setLabelCount(2, true);
        getXAxis().setDrawLabels(false);
        getXAxis().setDrawGridLines(true);
        getXAxis().setGranularity(60.0f);
        getXAxis().setGridDashedLine(new DashPathEffect(new float[]{hfk.a(getContext(), 3.67f), hfk.a(getContext(), 3.67f)}, 0.0f));
        getAxisRight().setDrawLabels(true);
        getAxisRight().setLabelCount(4, true);
        getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{hfk.a(getContext(), 3.67f), hfk.a(getContext(), 3.67f)}, 0.0f));
        getAxisRight().setDrawGridLines(true);
        getAxisRight().setTextColor(getContext().getColor(R$color.fit_colorAccent));
        setShowYAxisStartLine(true);
        if (qe0.y(getContext())) {
            XAxis xAxis = getXAxis();
            Context context = getContext();
            int i = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label_night;
            xAxis.setTextColor(ContextCompat.getColor(context, i));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i));
            XAxis xAxis2 = getXAxis();
            Context context2 = getContext();
            int i2 = com.heytap.health.lib_chart.R$color.lib_core_charts_grid_line_night;
            xAxis2.setGridColor(ContextCompat.getColor(context2, i2));
            getAxisRight().setGridColor(ContextCompat.getColor(getContext(), i2));
        } else {
            XAxis xAxis3 = getXAxis();
            Context context3 = getContext();
            int i3 = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label;
            xAxis3.setTextColor(ContextCompat.getColor(context3, i3));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i3));
            XAxis xAxis4 = getXAxis();
            Context context4 = getContext();
            int i4 = com.heytap.health.lib_chart.R$color.lib_core_charts_grid_line;
            xAxis4.setGridColor(ContextCompat.getColor(context4, i4));
            getAxisRight().setGridColor(ContextCompat.getColor(getContext(), i4));
        }
        this.G = ContextCompat.getColor(getContext(), com.heytap.health.sleep.R$color.health_sleep_D8266BF5);
        this.I = ContextCompat.getDrawable(getContext(), R$drawable.health_sleep_chart_env_noise_fill);
        c(true, false, true, true);
        i(16.0f, 0.0f, 35.0f, 8.0f);
        BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.DEFAULT;
        r(linePosition, 0.0f);
        s(linePosition, 0.0f);
    }

    public final void v(float maxValue) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        Intrinsics.checkNotNull(yAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.HealthYAxisRenderer");
        f fVar = (f) yAxisRenderer;
        getAxisRight().setAxisMinimum(0.0f);
        if (maxValue <= 75.0f) {
            getAxisRight().setLabelCount(4, true);
            getAxisRight().setAxisMaximum(75.0f);
            fVar.E(new float[]{0.0f, 25.0f, 50.0f, 75.0f});
            return;
        }
        if (maxValue <= 100.0f) {
            getAxisRight().setLabelCount(5, true);
            getAxisRight().setAxisMaximum(100.0f);
            fVar.E(new float[]{0.0f, 25.0f, 50.0f, 75.0f, 100.0f});
        } else if (maxValue <= 125.0f) {
            getAxisRight().setLabelCount(6, true);
            getAxisRight().setAxisMaximum(125.0f);
            fVar.E(new float[]{0.0f, 25.0f, 50.0f, 75.0f, 100.0f, 125.0f});
        } else if (maxValue <= 150.0f) {
            getAxisRight().setLabelCount(7, true);
            getAxisRight().setAxisMaximum(150.0f);
            fVar.E(new float[]{0.0f, 25.0f, 50.0f, 75.0f, 100.0f, 125.0f, 150.0f});
        }
    }

    public SnoreEnvNoiseChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        u();
    }

    public SnoreEnvNoiseChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u();
    }
}
