package com.heytap.health.wrist_temperature.view;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.l6m;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 h2\u00020\u0001:\u0001iB\u0013\b\u0016\u0012\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0004\ba\u0010bB\u001d\b\u0016\u0012\b\u0010`\u001a\u0004\u0018\u00010_\u0012\b\u0010d\u001a\u0004\u0018\u00010c¢\u0006\u0004\ba\u0010eB%\b\u0016\u0012\b\u0010`\u001a\u0004\u0018\u00010_\u0012\b\u0010d\u001a\u0004\u0018\u00010c\u0012\u0006\u0010f\u001a\u00020 ¢\u0006\u0004\ba\u0010gJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0016\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0014J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u0014\u0010\u0018\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u0019\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001aJ\u000e\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020 J\u0006\u0010'\u001a\u00020\u0002J\u0006\u0010(\u001a\u00020\u0002R\"\u0010/\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010C\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010J\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010P\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010)\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010)\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010^\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010E\u001a\u0004\b\\\u0010G\"\u0004\b]\u0010I¨\u0006j"}, d2 = {"Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "Lcom/heytap/health/core/widget/charts/ControllableOffsetCombinedChart;", "", "u", "v", "w", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "lineData", "Lcom/github/mikephil/charting/data/LineDataSet;", "s", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "t", "init", "", "extraSpace", "setExtraSpace", "", "timestamp", "setTimeXAxisMinimum", "setTimeXAxisMaximum", "", "xMaximum", "setXAxisMaximum", "setEntryData", "setEntryDataYeat", "", "drawZeroGridLine", "setDrawZeroGridLine", "", CityBean.POS, "setGridLinePos", "", "type", "setChartType", ParserTag.TAG_DRAW, "setIfDrawMask", "maskColor", "setMaskColor", "r", "x", UserInfo.SEX_FEMALE, "D", "getXStart", "()D", "setXStart", "(D)V", "xStart", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "G", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "getXAxisTimeUnit", "()Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "setXAxisTimeUnit", "(Lcom/heytap/health/core/widget/charts/data/TimeUnit;)V", "xAxisTimeUnit", "Lcom/oplus/aiunit/vision/xp0;", "H", "Lcom/oplus/aiunit/vision/xp0;", "getXAxisValueFormatter", "()Lcom/oplus/aiunit/vision/xp0;", "setXAxisValueFormatter", "(Lcom/oplus/aiunit/vision/xp0;)V", "xAxisValueFormatter", "I", "getYAxisValueFormatter", "setYAxisValueFormatter", "yAxisValueFormatter", "J", "Z", "getShowYAxisStartLine", "()Z", "setShowYAxisStartLine", "(Z)V", "showYAxisStartLine", "K", "getLineColor", "()I", "setLineColor", "(I)V", "lineColor", "L", "getExtraXAxisSpace", "()F", "setExtraXAxisSpace", "(F)V", "extraXAxisSpace", "M", "getLineStrokeWidth", "setLineStrokeWidth", "lineStrokeWidth", "N", "getIfIntercept", "setIfIntercept", "ifIntercept", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class WristTemperatureChart extends ControllableOffsetCombinedChart {

    @NotNull
    public static final String TAG = "WristTemperatureChart";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public double xStart;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public TimeUnit xAxisTimeUnit;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public xp0 xAxisValueFormatter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public xp0 yAxisValueFormatter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean showYAxisStartLine;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int lineColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public float extraXAxisSpace;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public float lineStrokeWidth;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean ifIntercept;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/wrist_temperature/view/WristTemperatureChart$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, String> labelCache = new HashMap();

        public b() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        @NotNull
        public String getAxisLabel(float value, @NotNull AxisBase axis) {
            Intrinsics.checkNotNullParameter(axis, "axis");
            if (WristTemperatureChart.this.getXAxisValueFormatter() == null) {
                String axisLabel = super.getAxisLabel(value, axis);
                Intrinsics.checkNotNullExpressionValue(axisLabel, "{\n                    su…, axis)\n                }");
                return axisLabel;
            }
            int length = axis.mEntries.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (value == axis.mEntries[i]) {
                    break;
                }
                i++;
            }
            double d = value;
            String str = i + "_" + (WristTemperatureChart.this.getXStart() + d);
            String strA = this.labelCache.get(str);
            if (TextUtils.isEmpty(strA)) {
                double xStart = WristTemperatureChart.this.getXStart() + d;
                xp0 xAxisValueFormatter = WristTemperatureChart.this.getXAxisValueFormatter();
                Intrinsics.checkNotNull(xAxisValueFormatter);
                strA = xAxisValueFormatter.a(i, xStart);
                this.labelCache.put(str, strA);
            }
            Intrinsics.checkNotNull(strA);
            return strA;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/wrist_temperature/view/WristTemperatureChart$c", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, String> labelCache = new HashMap();

        public c() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        @NotNull
        public String getAxisLabel(float value, @NotNull AxisBase axis) {
            Intrinsics.checkNotNullParameter(axis, "axis");
            if (WristTemperatureChart.this.getYAxisValueFormatter() == null) {
                String axisLabel = super.getAxisLabel(value, axis);
                Intrinsics.checkNotNullExpressionValue(axisLabel, "{\n                    su…, axis)\n                }");
                return axisLabel;
            }
            int length = axis.mEntries.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (value == axis.mEntries[i]) {
                    break;
                }
                i++;
            }
            if (!WristTemperatureChart.this.getShowYAxisStartLine() && i <= 0) {
                String axisLabel2 = super.getAxisLabel(value, axis);
                Intrinsics.checkNotNullExpressionValue(axisLabel2, "super.getAxisLabel(value, axis)");
                return axisLabel2;
            }
            if (!WristTemperatureChart.this.getShowYAxisStartLine()) {
                i--;
            }
            String str = i + "_" + value;
            String strA = this.labelCache.get(str);
            if (TextUtils.isEmpty(strA)) {
                xp0 yAxisValueFormatter = WristTemperatureChart.this.getYAxisValueFormatter();
                Intrinsics.checkNotNull(yAxisValueFormatter);
                strA = yAxisValueFormatter.a(i, value);
                this.labelCache.put(str, strA);
            }
            Intrinsics.checkNotNull(strA);
            return strA;
        }
    }

    public WristTemperatureChart(@Nullable Context context) {
        super(context);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineStrokeWidth = 2.0f;
        u();
    }

    public final float getExtraXAxisSpace() {
        return this.extraXAxisSpace;
    }

    public final boolean getIfIntercept() {
        return this.ifIntercept;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final float getLineStrokeWidth() {
        return this.lineStrokeWidth;
    }

    public final boolean getShowYAxisStartLine() {
        return this.showYAxisStartLine;
    }

    @NotNull
    public final TimeUnit getXAxisTimeUnit() {
        return this.xAxisTimeUnit;
    }

    @Nullable
    public final xp0 getXAxisValueFormatter() {
        return this.xAxisValueFormatter;
    }

    public final double getXStart() {
        return this.xStart;
    }

    @Nullable
    public final xp0 getYAxisValueFormatter() {
        return this.yAxisValueFormatter;
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart, com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mDrawOrder = new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.SCATTER};
        ChartAnimator mAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(mAnimator, "mAnimator");
        ViewPortHandler mViewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(mViewPortHandler, "mViewPortHandler");
        this.mRenderer = new l6m(this, mAnimator, mViewPortHandler);
        this.mAxisRendererRight = new nya(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new oya(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        l(BaseYAxisRenderer.LinePosition.CUSTOM_PERCENT, 0.9f);
        m(BaseYAxisRenderer.LinePosition.END, 0.0f);
    }

    public final void r() {
        animateY(400);
    }

    public final LineDataSet s(List<? extends TimeStampedData> lineData) {
        ArrayList arrayList = new ArrayList();
        int size = lineData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = lineData.get(i);
            arrayList.add(new Entry((float) (this.xAxisTimeUnit.timeStampToUnitDouble(timeStampedData.getTimestamp()) - this.xStart), timeStampedData.getY(), timeStampedData));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        lineDataSet.setDrawValues(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setDrawHighlightIndicators(false);
        lineDataSet.setColor(this.lineColor);
        lineDataSet.setLineWidth(this.lineStrokeWidth);
        lineDataSet.setDrawFilled(false);
        return lineDataSet;
    }

    public final void setChartType(int type) {
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.view.WristChartRenderer");
        ((l6m) dataRenderer).a(type);
    }

    public final void setDrawZeroGridLine(boolean drawZeroGridLine) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof nya) {
            Intrinsics.checkNotNull(yAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.LineCombinedChartYAxisRenderer");
            ((nya) yAxisRenderer).G(drawZeroGridLine);
        }
    }

    public final void setEntryData(@NotNull List<? extends TimeStampedData> lineData) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        LineDataSet lineDataSetS = s(lineData);
        CombinedData combinedData = new CombinedData();
        combinedData.setData(new LineData(lineDataSetS));
        setData(combinedData);
    }

    public final void setEntryDataYeat(@NotNull List<WristTemperatureStat> lineData) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        LineDataSet lineDataSetT = t(lineData);
        CombinedData combinedData = new CombinedData();
        combinedData.setData(new LineData(lineDataSetT));
        setData(combinedData);
    }

    public final void setExtraSpace(float extraSpace) {
        this.extraXAxisSpace = extraSpace;
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            Intrinsics.checkNotNull(xAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.LineCombinedXAxisRenderer");
            ((oya) xAxisRenderer).i(this.extraXAxisSpace);
        }
    }

    public final void setExtraXAxisSpace(float f) {
        this.extraXAxisSpace = f;
    }

    public final void setGridLinePos(@Nullable float[] pos) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            Intrinsics.checkNotNull(xAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.LineCombinedXAxisRenderer");
            ((oya) xAxisRenderer).e(pos);
        }
    }

    public final void setIfDrawMask(boolean draw) {
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.view.WristChartRenderer");
        ((l6m) dataRenderer).c(draw);
        invalidate();
    }

    public final void setIfIntercept(boolean z) {
        this.ifIntercept = z;
    }

    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    public final void setLineStrokeWidth(float f) {
        this.lineStrokeWidth = f;
    }

    public final void setMaskColor(int maskColor) {
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.view.WristChartRenderer");
        ((l6m) dataRenderer).d(maskColor);
    }

    public final void setShowYAxisStartLine(boolean z) {
        this.showYAxisStartLine = z;
    }

    public final void setTimeXAxisMaximum(long timestamp) {
        getXAxis().setAxisMaximum(((float) (this.xAxisTimeUnit.timeStampToUnitDouble(timestamp) - this.xStart)) + this.extraXAxisSpace);
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd HH:mm:ss", timestamp);
        m8b.f("WristTemperatureChart", "setTimeXAxisMaximum" + ((Object) charSequence) + "/xStart:" + this.xStart + "/barWidth:" + (getBarWidth() / 2) + "/axisMaximum:" + getXAxis().getAxisMaximum());
    }

    public final void setTimeXAxisMinimum(long timestamp) {
        this.xStart = this.xAxisTimeUnit.timeStampToUnitDouble(timestamp);
        getXAxis().setAxisMinimum(0 - this.extraXAxisSpace);
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd HH:mm:ss", timestamp);
        m8b.f("WristTemperatureChart", "setTimeXAxisMinimum" + ((Object) charSequence) + "/xStart:" + this.xStart + "/barWidth:" + (getBarWidth() / 2) + "/axisMinimum:" + getXAxis().getAxisMinimum());
    }

    public final void setXAxisMaximum(double xMaximum) {
        getXAxis().setAxisMaximum(((float) (xMaximum - this.xStart)) + this.extraXAxisSpace);
    }

    public final void setXAxisTimeUnit(@NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<set-?>");
        this.xAxisTimeUnit = timeUnit;
    }

    public final void setXAxisValueFormatter(@Nullable xp0 xp0Var) {
        this.xAxisValueFormatter = xp0Var;
    }

    public final void setXStart(double d) {
        this.xStart = d;
    }

    public final void setYAxisValueFormatter(@Nullable xp0 xp0Var) {
        this.yAxisValueFormatter = xp0Var;
    }

    public final LineDataSet t(List<WristTemperatureStat> lineData) {
        ArrayList arrayList = new ArrayList();
        int size = lineData.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new Entry(i, m6m.INSTANCE.f(lineData.get(i)), lineData.get(i)));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        lineDataSet.setDrawValues(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setDrawHighlightIndicators(false);
        lineDataSet.setColor(this.lineColor);
        lineDataSet.setLineWidth(this.lineStrokeWidth);
        lineDataSet.setDrawFilled(false);
        return lineDataSet;
    }

    public final void u() {
        setExtraTopOffset(55.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setExtraBottomOffset(0.0f);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getXAxis().setDrawLabels(true);
        getXAxis().setDrawAxisLine(false);
        getXAxis().setLabelCount(2);
        getXAxis().setTextSize(10.0f);
        getXAxis().setGridLineWidth(0.7f);
        getXAxis().setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        getAxisRight().setDrawAxisLine(false);
        getAxisRight().setDrawZeroLine(false);
        getAxisRight().setDrawLabels(true);
        getAxisRight().setAxisMinimum(-8.0f);
        getAxisRight().setAxisMaximum(8.0f);
        getAxisRight().setGranularity(8.0f);
        getAxisLeft().setEnabled(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        setHighlightPerDragEnabled(false);
        setYAxisRightValues(new float[]{-2.05f, 0.0f, 2.05f});
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        v();
        w();
        e(true, false, true, false);
        p(0.0f, 0.0f, 35.0f, 0.0f);
        if (if0.y(getContext())) {
            XAxis xAxis = getXAxis();
            Context context = getContext();
            int i = R$color.lib_core_charts_grid_line_night;
            xAxis.setGridColor(ContextCompat.getColor(context, i));
            XAxis xAxis2 = getXAxis();
            Context context2 = getContext();
            int i2 = R$color.lib_core_charts_axis_label_night;
            xAxis2.setTextColor(ContextCompat.getColor(context2, i2));
            getAxisRight().setGridColor(ContextCompat.getColor(getContext(), i));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i2));
            DataRenderer dataRenderer = this.mRenderer;
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.view.WristChartRenderer");
            Context context3 = getContext();
            int i3 = R$color.lib_chart_wrist_height;
            GradientColor gradientColor = new GradientColor(ContextCompat.getColor(context3, i3), ContextCompat.getColor(getContext(), i3));
            Context context4 = getContext();
            int i4 = R$color.lib_chart_wrist_normal;
            GradientColor gradientColor2 = new GradientColor(ContextCompat.getColor(context4, i4), ContextCompat.getColor(getContext(), i4));
            Context context5 = getContext();
            int i5 = R$color.lib_chart_wrist_low;
            ((l6m) dataRenderer).b(gradientColor, gradientColor2, new GradientColor(ContextCompat.getColor(context5, i5), ContextCompat.getColor(getContext(), i5)), getContext().getColor(R$color.lib_chart_wrist_back));
            return;
        }
        XAxis xAxis3 = getXAxis();
        Context context6 = getContext();
        int i6 = R$color.lib_core_charts_grid_line;
        xAxis3.setGridColor(ContextCompat.getColor(context6, i6));
        XAxis xAxis4 = getXAxis();
        Context context7 = getContext();
        int i7 = R$color.lib_core_charts_axis_label;
        xAxis4.setTextColor(ContextCompat.getColor(context7, i7));
        getAxisRight().setGridColor(ContextCompat.getColor(getContext(), i6));
        getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i7));
        DataRenderer dataRenderer2 = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer2, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.view.WristChartRenderer");
        Context context8 = getContext();
        int i8 = R$color.lib_chart_wrist_height_night;
        GradientColor gradientColor3 = new GradientColor(ContextCompat.getColor(context8, i8), ContextCompat.getColor(getContext(), i8));
        Context context9 = getContext();
        int i9 = R$color.lib_chart_wrist_normal_night;
        GradientColor gradientColor4 = new GradientColor(ContextCompat.getColor(context9, i9), ContextCompat.getColor(getContext(), i9));
        Context context10 = getContext();
        int i10 = R$color.lib_chart_wrist_low_night;
        ((l6m) dataRenderer2).b(gradientColor3, gradientColor4, new GradientColor(ContextCompat.getColor(context10, i10), ContextCompat.getColor(getContext(), i10)), getContext().getColor(R$color.lib_chart_wrist_back));
    }

    public final void v() {
        getXAxis().setValueFormatter(new b());
    }

    public final void w() {
        getAxisRight().setValueFormatter(new c());
    }

    public final void x() {
        ChartAnimator chartAnimator = this.mAnimator;
        if (chartAnimator instanceof CustomChartAnimator) {
            Intrinsics.checkNotNull(chartAnimator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
            ((CustomChartAnimator) chartAnimator).resetChartYAxisToZeroState();
        }
    }

    public WristTemperatureChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineStrokeWidth = 2.0f;
        u();
    }

    public WristTemperatureChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineStrokeWidth = 2.0f;
        u();
    }
}