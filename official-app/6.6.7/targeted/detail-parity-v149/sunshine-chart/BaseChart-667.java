package com.heytap.health.sunshine.ui.chart;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.sunshine.R$color;
import com.oplus.aiunit.vision.i7j;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 e2\u00020\u0001:\u0001fB\u0013\b\u0016\u0012\b\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b^\u0010_B\u001d\b\u0016\u0012\b\u0010]\u001a\u0004\u0018\u00010\\\u0012\b\u0010a\u001a\u0004\u0018\u00010`¢\u0006\u0004\b^\u0010bB%\b\u0016\u0012\b\u0010]\u001a\u0004\u0018\u00010\\\u0012\b\u0010a\u001a\u0004\u0018\u00010`\u0012\u0006\u0010c\u001a\u00020#¢\u0006\u0004\b^\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\t\u001a\u00020\bJ\u0014\u0010\u001c\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u0014\u0010'\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u000bJ\u000e\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020#R\"\u00100\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010K\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010Q\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010A\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010W\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010*\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010F\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010J¨\u0006g"}, d2 = {"Lcom/heytap/health/sunshine/ui/chart/BaseChart;", "Lcom/heytap/health/core/widget/charts/ControllableOffsetCombinedChart;", "", "t", "u", "v", "Lcom/github/mikephil/charting/data/BarDataSet;", "barDataSet", "", "barWidth", "w", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "barData", "r", "s", "init", "extraSpace", "setExtraSpace", "", "timestamp", "setTimeXAxisMinimum", "setTimeXAxisMaximum", "", "xMaximum", "setXAxisMaximum", "barDatas", "x", "setBarEntryDataYear", "", "drawZeroGridLine", "setDrawZeroGridLine", "", CityBean.POS, "setGridLinePos", "", "type", "setChartType", "baselines", "setBaseLines", "color", "setChartBackgroundColor", UserInfo.SEX_FEMALE, "D", "getXStart", "()D", "setXStart", "(D)V", "xStart", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "G", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "getXAxisTimeUnit", "()Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "setXAxisTimeUnit", "(Lcom/heytap/health/core/widget/charts/data/TimeUnit;)V", "xAxisTimeUnit", "Lcom/oplus/aiunit/vision/xp0;", "H", "Lcom/oplus/aiunit/vision/xp0;", "getXAxisValueFormatter", "()Lcom/oplus/aiunit/vision/xp0;", "setXAxisValueFormatter", "(Lcom/oplus/aiunit/vision/xp0;)V", "xAxisValueFormatter", "I", "getYAxisValueFormatter", "setYAxisValueFormatter", "yAxisValueFormatter", "J", "Z", "getShowYAxisStartLine", "()Z", "setShowYAxisStartLine", "(Z)V", "showYAxisStartLine", "K", "getLineColor", "()I", "setLineColor", "(I)V", "lineColor", "L", "getExtraXAxisSpace", "()F", "setExtraXAxisSpace", "(F)V", "extraXAxisSpace", "M", "getIfIntercept", "setIfIntercept", "ifIntercept", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final class BaseChart extends ControllableOffsetCombinedChart {

    @NotNull
    public static final String TAG = "BaseChart";

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
    public boolean ifIntercept;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/sunshine/ui/chart/BaseChart$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "sunshine_release"}, k = 1, mv = {1, 8, 0})
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
            if (BaseChart.this.getXAxisValueFormatter() == null) {
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
            String str = i + "_" + (BaseChart.this.getXStart() + d);
            String strA = this.labelCache.get(str);
            if (TextUtils.isEmpty(strA)) {
                double xStart = BaseChart.this.getXStart() + d;
                xp0 xAxisValueFormatter = BaseChart.this.getXAxisValueFormatter();
                Intrinsics.checkNotNull(xAxisValueFormatter);
                strA = xAxisValueFormatter.a(i, xStart);
                this.labelCache.put(str, strA);
            }
            Intrinsics.checkNotNull(strA);
            return strA;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/sunshine/ui/chart/BaseChart$c", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "sunshine_release"}, k = 1, mv = {1, 8, 0})
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
            if (BaseChart.this.getYAxisValueFormatter() == null) {
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
            if (!BaseChart.this.getShowYAxisStartLine() && i <= 0) {
                String axisLabel2 = super.getAxisLabel(value, axis);
                Intrinsics.checkNotNullExpressionValue(axisLabel2, "super.getAxisLabel(value, axis)");
                return axisLabel2;
            }
            if (!BaseChart.this.getShowYAxisStartLine()) {
                i--;
            }
            String str = i + "_" + value;
            String strA = this.labelCache.get(str);
            if (TextUtils.isEmpty(strA)) {
                xp0 yAxisValueFormatter = BaseChart.this.getYAxisValueFormatter();
                Intrinsics.checkNotNull(yAxisValueFormatter);
                strA = yAxisValueFormatter.a(i, value);
                this.labelCache.put(str, strA);
            }
            Intrinsics.checkNotNull(strA);
            return strA;
        }
    }

    public BaseChart(@Nullable Context context) {
        super(context);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineColor = ContextCompat.getColor(getContext(), R$color.health_sunshine_one);
        t();
    }

    public static /* synthetic */ void y(BaseChart baseChart, List list, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.85f;
        }
        baseChart.x(list, f);
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
        this.mDrawOrder = new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.SCATTER};
        ChartAnimator mAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(mAnimator, "mAnimator");
        ViewPortHandler mViewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(mViewPortHandler, "mViewPortHandler");
        this.mRenderer = new i7j(this, mAnimator, mViewPortHandler);
        this.mAxisRendererRight = new nya(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new oya(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        l(BaseYAxisRenderer.LinePosition.CUSTOM_PERCENT, 0.9f);
        m(BaseYAxisRenderer.LinePosition.END, 0.0f);
    }

    public final BarDataSet r(List<? extends TimeStampedData> barData) {
        ArrayList arrayList = new ArrayList();
        int size = barData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = barData.get(i);
            arrayList.add(new HealthSingleBarEntry((float) (this.xAxisTimeUnit.timeStampToUnitDouble(timeStampedData.getTimestamp()) - this.xStart), timeStampedData.getY(), timeStampedData, timeStampedData.getColor(), timeStampedData.getGradientColor()));
        }
        return new BarDataSet(CollectionsKt___CollectionsKt.toList(arrayList), "");
    }

    public final BarDataSet s(List<? extends TimeStampedData> barData) {
        ArrayList arrayList = new ArrayList();
        int size = barData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = barData.get(i);
            arrayList.add(new HealthSingleBarEntry(i, timeStampedData.getY(), timeStampedData, timeStampedData.getColor(), timeStampedData.getGradientColor()));
        }
        return new BarDataSet(arrayList, "");
    }

    public final void setBarEntryDataYear(@NotNull List<? extends TimeStampedData> barDatas) {
        Intrinsics.checkNotNullParameter(barDatas, "barDatas");
        w(s(barDatas), 0.5f);
    }

    public final void setBaseLines(@NotNull List<Integer> baselines) {
        Intrinsics.checkNotNullParameter(baselines, "baselines");
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.sunshine.ui.chart.SunshineChartRenderer");
        ((i7j) dataRenderer).a(baselines);
        invalidate();
    }

    public final void setChartBackgroundColor(int color) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof i7j) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.sunshine.ui.chart.SunshineChartRenderer");
            ((i7j) dataRenderer).b(color);
        }
    }

    public final void setChartType(int type) {
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.sunshine.ui.chart.SunshineChartRenderer");
        ((i7j) dataRenderer).c(type);
    }

    public final void setDrawZeroGridLine(boolean drawZeroGridLine) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof nya) {
            Intrinsics.checkNotNull(yAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.LineCombinedChartYAxisRenderer");
            ((nya) yAxisRenderer).G(drawZeroGridLine);
        }
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

    public final void setIfIntercept(boolean z) {
        this.ifIntercept = z;
    }

    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    public final void setShowYAxisStartLine(boolean z) {
        this.showYAxisStartLine = z;
    }

    public final void setTimeXAxisMaximum(long timestamp) {
        getXAxis().setAxisMaximum(((float) (this.xAxisTimeUnit.timeStampToUnitDouble(timestamp) - this.xStart)) + this.extraXAxisSpace);
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd HH:mm:ss", timestamp);
        m8b.f("BaseChart", "setTimeXAxisMaximum" + ((Object) charSequence) + "/xStart:" + this.xStart + "/barWidth:" + (getBarWidth() / 2) + "/axisMaximum:" + getXAxis().getAxisMaximum());
    }

    public final void setTimeXAxisMinimum(long timestamp) {
        this.xStart = this.xAxisTimeUnit.timeStampToUnitDouble(timestamp);
        getXAxis().setAxisMinimum(0 - this.extraXAxisSpace);
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd HH:mm:ss", timestamp);
        m8b.f("BaseChart", "setTimeXAxisMinimum" + ((Object) charSequence) + "/xStart:" + this.xStart + "/barWidth:" + (getBarWidth() / 2) + "/axisMinimum:" + getXAxis().getAxisMinimum());
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

    public final void t() {
        setExtraTopOffset(65.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setExtraBottomOffset(0.0f);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getXAxis().setDrawLabels(true);
        getXAxis().setDrawAxisLine(false);
        getXAxis().setLabelCount(2);
        getXAxis().setTextSize(10.0f);
        getXAxis().setDrawGridLines(false);
        getAxisRight().setDrawAxisLine(false);
        getAxisRight().setDrawZeroLine(false);
        getAxisRight().setDrawLabels(true);
        getAxisRight().setAxisMinimum(0.0f);
        getAxisRight().setAxisMaximum(100.0f);
        getAxisRight().setGranularity(1.0f);
        getAxisLeft().setEnabled(false);
        getAxisLeft().setDrawGridLines(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        setHighlightPerDragEnabled(false);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        u();
        v();
        e(true, false, true, false);
        p(0.0f, 0.0f, 26.0f, 0.0f);
        if (if0.y(getContext())) {
            XAxis xAxis = getXAxis();
            Context context = getContext();
            int i = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label_night;
            xAxis.setTextColor(ContextCompat.getColor(context, i));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i));
            return;
        }
        XAxis xAxis2 = getXAxis();
        Context context2 = getContext();
        int i2 = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label;
        xAxis2.setTextColor(ContextCompat.getColor(context2, i2));
        getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i2));
    }

    public final void u() {
        getXAxis().setValueFormatter(new b());
    }

    public final void v() {
        getAxisRight().setValueFormatter(new c());
    }

    public final void w(BarDataSet barDataSet, float barWidth) {
        barDataSet.setDrawValues(false);
        barDataSet.setDrawIcons(false);
        barDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        barDataSet.setHighLightAlpha(0);
        CombinedData combinedData = new CombinedData();
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(barWidth);
        combinedData.setData(barData);
        setData(combinedData);
        invalidate();
    }

    public final void x(@NotNull List<? extends TimeStampedData> barDatas, float barWidth) {
        Intrinsics.checkNotNullParameter(barDatas, "barDatas");
        w(r(barDatas), barWidth);
    }

    public BaseChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineColor = ContextCompat.getColor(getContext(), R$color.health_sunshine_one);
        t();
    }

    public BaseChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineColor = ContextCompat.getColor(getContext(), R$color.health_sunshine_one);
        t();
    }
}