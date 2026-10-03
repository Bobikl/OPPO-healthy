package com.heytap.health.hrv.ui.chart;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.hrv.R$color;
import com.heytap.health.hrv.constant.HrvStatusType;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.ti9;
import com.oplus.aiunit.vision.x83;
import com.oplus.aiunit.vision.xp0;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0088\u0001B\u0015\b\u0016\u0012\b\u0010\u007f\u001a\u0004\u0018\u00010~¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001B!\b\u0016\u0012\b\u0010\u007f\u001a\u0004\u0018\u00010~\u0012\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0084\u0001B*\b\u0016\u0012\b\u0010\u007f\u001a\u0004\u0018\u00010~\u0012\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u0001\u0012\u0007\u0010\u0085\u0001\u001a\u00020\u001d¢\u0006\u0006\b\u0080\u0001\u0010\u0086\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0014\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001e\u0010\u0014\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0004J\u0014\u0010\u0015\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u0016\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0017J\u0014\u0010#\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eJ\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001dJ\u0006\u0010&\u001a\u00020\u0002J\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004J\u001e\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004J\u0006\u0010-\u001a\u00020\u0017J\u000e\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u001dJ\u000e\u00101\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0004J\b\u00102\u001a\u00020\u0002H\u0002J\b\u00103\u001a\u00020\u0002H\u0002J\b\u00104\u001a\u00020\u0002H\u0002J(\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u0002052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0002J\u0016\u00109\u001a\u0002052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010;\u001a\u00020:2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001a\u0010=\u001a\u00020\u0002*\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010>\u001a\u0002052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010?\u001a\u00020:2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002J\u0018\u0010@\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020:H\u0002R\"\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010,\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010Z\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010R\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR\"\u0010a\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010g\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010=\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010m\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u00107\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u00107\u001a\u0004\bo\u0010j\"\u0004\bp\u0010lR\"\u0010u\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u00107\u001a\u0004\bs\u0010j\"\u0004\bt\u0010lR\"\u0010y\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u00107\u001a\u0004\bw\u0010j\"\u0004\bx\u0010lR\"\u0010}\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010\\\u001a\u0004\b{\u0010^\"\u0004\b|\u0010`¨\u0006\u0089\u0001"}, d2 = {"Lcom/heytap/health/hrv/ui/chart/BaseChart;", "Lcom/heytap/health/core/widget/charts/ControllableOffsetCombinedChart;", "", "init", "", "extraSpace", "setExtraSpace", "", "timestamp", "setTimeXAxisMinimum", "setTimeXAxisMaximum", "", "xMaximum", "setXAxisMaximum", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "lineData", "setEntryData", "barDatas", "barWidth", "G", "setEntryDataYear", "setBarEntryDataYear", "", "drawZeroGridLine", "setDrawZeroGridLine", "", CityBean.POS, "setGridLinePos", "", "type", "setChartType", ParserTag.TAG_DRAW, "setIfDrawMask", "baselines", "setBaseLines", "maskColor", "setMaskColor", "r", ExifInterface.LONGITUDE_EAST, "pointX", "pointY", acl.KEY_B, "range", "D", "A", "color", "setChartBackgroundColor", "radius", "setChartBackgroundRadius", "w", "y", "z", "Lcom/github/mikephil/charting/data/BarDataSet;", "barDataSet", UserInfo.SEX_FEMALE, "barData", "s", "Lcom/github/mikephil/charting/data/LineDataSet;", "u", "dataList", "I", "t", "v", "x", "C", "index", "dataSet", "getXStart", "()D", "setXStart", "(D)V", "xStart", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "getXAxisTimeUnit", "()Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "setXAxisTimeUnit", "(Lcom/heytap/health/core/widget/charts/data/TimeUnit;)V", "xAxisTimeUnit", "Lcom/oplus/aiunit/vision/xp0;", "H", "Lcom/oplus/aiunit/vision/xp0;", "getXAxisValueFormatter", "()Lcom/oplus/aiunit/vision/xp0;", "setXAxisValueFormatter", "(Lcom/oplus/aiunit/vision/xp0;)V", "xAxisValueFormatter", "getYAxisValueFormatter", "setYAxisValueFormatter", "yAxisValueFormatter", "J", "Z", "getShowYAxisStartLine", "()Z", "setShowYAxisStartLine", "(Z)V", "showYAxisStartLine", "K", "getLineColor", "()I", "setLineColor", "(I)V", "lineColor", "L", "getExtraXAxisSpace", "()F", "setExtraXAxisSpace", "(F)V", "extraXAxisSpace", "M", "getLineStrokeWidth", "setLineStrokeWidth", "lineStrokeWidth", "N", "getCircleStrokeHoleRadius", "setCircleStrokeHoleRadius", "circleStrokeHoleRadius", "O", "getCircleStrokeRadius", "setCircleStrokeRadius", "circleStrokeRadius", SecureGcmConstants.MESSAGE_KEY, "getIfIntercept", "setIfIntercept", "ifIntercept", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseChart.kt\ncom/heytap/health/hrv/ui/chart/BaseChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,625:1\n1855#2,2:626\n1855#2,2:628\n*S KotlinDebug\n*F\n+ 1 BaseChart.kt\ncom/heytap/health/hrv/ui/chart/BaseChart\n*L\n311#1:626,2\n423#1:628,2\n*E\n"})
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
    public float lineStrokeWidth;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public float circleStrokeHoleRadius;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public float circleStrokeRadius;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean ifIntercept;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/hrv/ui/chart/BaseChart$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "hrv_release"}, k = 1, mv = {1, 8, 0})
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

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/hrv/ui/chart/BaseChart$c", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "hrv_release"}, k = 1, mv = {1, 8, 0})
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
        this.lineColor = ContextCompat.getColor(getContext(), R$color.health_hrv_stress_normal);
        this.lineStrokeWidth = 4.0f;
        this.circleStrokeHoleRadius = 2.0f;
        this.circleStrokeRadius = 2.0f;
        w();
    }

    public static /* synthetic */ void H(BaseChart baseChart, List list, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.85f;
        }
        baseChart.G(list, f);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final boolean A() {
        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) ((CombinedData) this.mData).getDataSetByIndex(0);
        int entryCount = iBarLineScatterCandleBubbleDataSet.getEntryCount();
        for (int i = 0; i < entryCount; i++) {
            if (iBarLineScatterCandleBubbleDataSet.getEntryForIndex(i).getY() > 0.0f) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(float pointX, float pointY) {
        int measuredWidth = getMeasuredWidth() + 0;
        float f = 0;
        float extraTopOffset = getExtraTopOffset() + f + this.k;
        m8b.f("BaseChart", "isPointInTopOffsetView:(" + pointX + "," + pointY + "),(" + measuredWidth + "," + extraTopOffset + ")");
        return pointX >= f && pointX <= ((float) measuredWidth) && pointY >= f && pointY <= extraTopOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float C(float x, float range) {
        String str;
        T dataSetByIndex = ((CombinedData) this.mData).getDataSetByIndex(0);
        Intrinsics.checkNotNull(dataSetByIndex, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
        Entry entryForXValue = lineDataSet.getEntryForXValue(x, 0.0f);
        if (entryForXValue == null || entryForXValue.getY() > 0.0f) {
            if (entryForXValue != null) {
                str = "x:" + entryForXValue.getX() + ",y:" + entryForXValue.getY() + ",roundedX:" + x;
            } else {
                str = "entry == null";
            }
            m8b.f("BaseChart", "find valid entry:" + str);
            if (entryForXValue == null || Math.abs(entryForXValue.getX() - x) > range || entryForXValue.getY() <= 0.0f) {
                return -1.0f;
            }
            return entryForXValue.getX();
        }
        int entryIndex = lineDataSet.getEntryIndex(entryForXValue);
        if (entryIndex != -1) {
            int i = (int) range;
            int iX = x(entryIndex - i, lineDataSet);
            int iX2 = x(entryIndex + i, lineDataSet);
            if (iX <= iX2) {
                while (true) {
                    Entry entryForIndex = lineDataSet.getEntryForIndex(iX);
                    if (Math.abs(entryForIndex.getX() - x) < range && entryForIndex.getY() > 0.0f) {
                        m8b.f("BaseChart", "find temp entry,x:" + entryForIndex.getX() + ",y:" + entryForIndex.getY());
                        return entryForIndex.getX();
                    }
                    if (iX == iX2) {
                        break;
                    }
                    iX++;
                }
            }
        }
        return -1.0f;
    }

    public final float D(float pointX, float pointY, float range) {
        MPPointD valuesByTouchPoint = getTransformer(YAxis.AxisDependency.RIGHT).getValuesByTouchPoint(pointX, pointY);
        Intrinsics.checkNotNullExpressionValue(valuesByTouchPoint, "this.getTransformer(YAxi…ouchPoint(pointX, pointY)");
        float fC = C((float) valuesByTouchPoint.x, range);
        m8b.b("BaseChart", "isValidPointInChart, touchPointX:" + valuesByTouchPoint.x + ",validX:" + fC);
        return fC;
    }

    public final void E() {
        ChartAnimator chartAnimator = this.mAnimator;
        if (chartAnimator instanceof CustomChartAnimator) {
            Intrinsics.checkNotNull(chartAnimator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
            ((CustomChartAnimator) chartAnimator).resetChartYAxisToZeroState();
        }
    }

    public final void F(BarDataSet barDataSet, List<? extends TimeStampedData> barDatas, float barWidth) {
        barDataSet.setDrawValues(false);
        barDataSet.setDrawIcons(false);
        barDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        barDataSet.setHighLightAlpha(0);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = barDatas.iterator();
        while (it.hasNext()) {
            int iB = ti9.b(Integer.valueOf((int) ((TimeStampedData) it.next()).getY()));
            if (iB == 1) {
                arrayList.add(Integer.valueOf(if0.y(getContext()) ? getContext().getColor(R$color.health_hrv_stress_over_75) : getContext().getColor(R$color.health_hrv_stress_over)));
            } else if (iB == 2) {
                arrayList.add(Integer.valueOf(if0.y(getContext()) ? getContext().getColor(R$color.health_hrv_stress_normal_75) : getContext().getColor(R$color.health_hrv_stress_normal)));
            } else if (iB == 3) {
                arrayList.add(Integer.valueOf(if0.y(getContext()) ? getContext().getColor(R$color.health_hrv_stress_good_75) : getContext().getColor(R$color.health_hrv_stress_good)));
            } else if (iB != 4) {
                arrayList.add(Integer.valueOf(getContext().getColor(R$color.health_hrv_stress_excellent)));
            } else {
                arrayList.add(Integer.valueOf(if0.y(getContext()) ? getContext().getColor(R$color.health_hrv_stress_excellent_75) : getContext().getColor(R$color.health_hrv_stress_excellent)));
            }
        }
        barDataSet.setColors(arrayList);
        CombinedData combinedData = new CombinedData();
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(barWidth);
        combinedData.setData(barData);
        setData(combinedData);
        invalidate();
    }

    public final void G(@NotNull List<? extends TimeStampedData> barDatas, float barWidth) {
        Intrinsics.checkNotNullParameter(barDatas, "barDatas");
        F(s(barDatas), barDatas, barWidth);
    }

    public final void I(LineDataSet lineDataSet, List<? extends TimeStampedData> list) {
        lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawHighlightIndicators(false);
        ArrayList arrayList = new ArrayList();
        Context contextA = e88.a();
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(contextA.getColor(R$color.health_hrv_stress_excellent)), Integer.valueOf(contextA.getColor(R$color.health_hrv_stress_good)), Integer.valueOf(contextA.getColor(R$color.health_hrv_stress_normal)), Integer.valueOf(contextA.getColor(R$color.health_hrv_stress_over)), Integer.valueOf(contextA.getColor(R$color.health_hrv_stress_default))});
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int heartRateType = ((TimeStampedData) it.next()).getHeartRateType();
            if (heartRateType == HrvStatusType.GOOD.getType()) {
                arrayList.add(listListOf.get(0));
            } else if (heartRateType == HrvStatusType.RELAX.getType()) {
                arrayList.add(listListOf.get(1));
            } else if (heartRateType == HrvStatusType.NORMAL.getType()) {
                arrayList.add(listListOf.get(2));
            } else if (heartRateType == HrvStatusType.REST.getType()) {
                arrayList.add(listListOf.get(3));
            } else if (heartRateType == HrvStatusType.DEFAULT.getType()) {
                arrayList.add(listListOf.get(4));
            }
        }
        lineDataSet.setDrawCircles(!arrayList.isEmpty());
        lineDataSet.setCircleColors(arrayList);
        lineDataSet.setDrawCircleHole(true);
        lineDataSet.setCircleHoleColor(contextA.getColor(com.heytap.health.health_base.R$color.health_base_white_50alpha));
    }

    public final float getCircleStrokeHoleRadius() {
        return this.circleStrokeHoleRadius;
    }

    public final float getCircleStrokeRadius() {
        return this.circleStrokeRadius;
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
        this.mDrawOrder = new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.SCATTER};
        ChartAnimator mAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(mAnimator, "mAnimator");
        ViewPortHandler mViewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(mViewPortHandler, "mViewPortHandler");
        this.mRenderer = new x83(this, mAnimator, mViewPortHandler);
        this.mAxisRendererRight = new nya(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new oya(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        l(BaseYAxisRenderer.LinePosition.CUSTOM_PERCENT, 0.9f);
        m(BaseYAxisRenderer.LinePosition.END, 0.0f);
    }

    public final void r() {
        animateY(AnimatorUtil.INSTANCE.m());
    }

    public final BarDataSet s(List<? extends TimeStampedData> barData) {
        ArrayList arrayList = new ArrayList();
        int size = barData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = barData.get(i);
            arrayList.add(new BarEntry((float) (this.xAxisTimeUnit.timeStampToUnitDouble(timeStampedData.getTimestamp()) - this.xStart), timeStampedData.getY(), timeStampedData));
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setColor(this.lineColor);
        return barDataSet;
    }

    public final void setBarEntryDataYear(@NotNull List<? extends TimeStampedData> barDatas) {
        Intrinsics.checkNotNullParameter(barDatas, "barDatas");
        F(t(barDatas), barDatas, 0.5f);
    }

    public final void setBaseLines(@NotNull List<Integer> baselines) {
        Intrinsics.checkNotNullParameter(baselines, "baselines");
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
        ((x83) dataRenderer).a(baselines);
        invalidate();
    }

    public final void setChartBackgroundColor(int color) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof x83) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
            ((x83) dataRenderer).b(color);
        }
    }

    public final void setChartBackgroundRadius(float radius) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof x83) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
            ((x83) dataRenderer).c(radius);
        }
    }

    public final void setChartType(int type) {
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
        ((x83) dataRenderer).d(type);
    }

    public final void setCircleStrokeHoleRadius(float f) {
        this.circleStrokeHoleRadius = f;
    }

    public final void setCircleStrokeRadius(float f) {
        this.circleStrokeRadius = f;
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
        LineDataSet lineDataSetU = u(lineData);
        CombinedData combinedData = new CombinedData();
        combinedData.setData(new LineData(lineDataSetU));
        setData(combinedData);
        invalidate();
    }

    public final void setEntryDataYear(@NotNull List<? extends TimeStampedData> lineData) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        LineDataSet lineDataSetV = v(lineData);
        CombinedData combinedData = new CombinedData();
        combinedData.setData(new LineData(lineDataSetV));
        setData(combinedData);
        invalidate();
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
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
        ((x83) dataRenderer).f(draw);
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
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
        ((x83) dataRenderer).g(maskColor);
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

    public final BarDataSet t(List<? extends TimeStampedData> barData) {
        ArrayList arrayList = new ArrayList();
        int size = barData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = barData.get(i);
            arrayList.add(new BarEntry(i, timeStampedData.getY(), timeStampedData));
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setColor(this.lineColor);
        return barDataSet;
    }

    public final LineDataSet u(List<? extends TimeStampedData> lineData) {
        ArrayList arrayList = new ArrayList();
        int size = lineData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = lineData.get(i);
            arrayList.add(new Entry((float) (this.xAxisTimeUnit.timeStampToUnitDouble(timeStampedData.getTimestamp()) - this.xStart), timeStampedData.getY(), timeStampedData));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setColor(this.lineColor);
        lineDataSet.setCircleRadius(this.circleStrokeRadius);
        lineDataSet.setCircleHoleRadius(this.circleStrokeHoleRadius);
        lineDataSet.setLineWidth(this.lineStrokeWidth);
        I(lineDataSet, lineData);
        lineDataSet.setDrawFilled(false);
        return lineDataSet;
    }

    public final LineDataSet v(List<? extends TimeStampedData> lineData) {
        ArrayList arrayList = new ArrayList();
        int size = lineData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = lineData.get(i);
            arrayList.add(new Entry(i, timeStampedData.getY(), timeStampedData));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setColor(this.lineColor);
        lineDataSet.setCircleRadius(this.circleStrokeRadius);
        lineDataSet.setCircleHoleRadius(this.circleStrokeHoleRadius);
        lineDataSet.setLineWidth(this.lineStrokeWidth);
        I(lineDataSet, lineData);
        lineDataSet.setDrawFilled(false);
        return lineDataSet;
    }

    public final void w() {
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
        setYAxisRightValues(new float[]{0.0f, 50.0f, 100.0f});
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        y();
        z();
        e(true, false, true, false);
        p(0.0f, 0.0f, 26.0f, 0.0f);
        if (if0.y(getContext())) {
            XAxis xAxis = getXAxis();
            Context context = getContext();
            int i = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label_night;
            xAxis.setTextColor(ContextCompat.getColor(context, i));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i));
            DataRenderer dataRenderer = this.mRenderer;
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
            x83 x83Var = (x83) dataRenderer;
            Context context2 = getContext();
            int i2 = R$color.health_hrv_stress_excellent_75;
            GradientColor gradientColor = new GradientColor(ContextCompat.getColor(context2, i2), ContextCompat.getColor(getContext(), i2));
            Context context3 = getContext();
            int i3 = R$color.health_hrv_stress_good_75;
            GradientColor gradientColor2 = new GradientColor(ContextCompat.getColor(context3, i3), ContextCompat.getColor(getContext(), i3));
            Context context4 = getContext();
            int i4 = R$color.health_hrv_stress_normal_75;
            GradientColor gradientColor3 = new GradientColor(ContextCompat.getColor(context4, i4), ContextCompat.getColor(getContext(), i4));
            Context context5 = getContext();
            int i5 = R$color.health_hrv_stress_over_75;
            x83Var.e(gradientColor, gradientColor2, gradientColor3, new GradientColor(ContextCompat.getColor(context5, i5), ContextCompat.getColor(getContext(), i5)), getContext().getColor(com.heytap.health.lib_chart.R$color.lib_chart_wrist_back));
            return;
        }
        XAxis xAxis2 = getXAxis();
        Context context6 = getContext();
        int i6 = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label;
        xAxis2.setTextColor(ContextCompat.getColor(context6, i6));
        getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i6));
        DataRenderer dataRenderer2 = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer2, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
        x83 x83Var2 = (x83) dataRenderer2;
        Context context7 = getContext();
        int i7 = R$color.health_hrv_stress_excellent;
        GradientColor gradientColor4 = new GradientColor(ContextCompat.getColor(context7, i7), ContextCompat.getColor(getContext(), i7));
        Context context8 = getContext();
        int i8 = R$color.health_hrv_stress_good;
        GradientColor gradientColor5 = new GradientColor(ContextCompat.getColor(context8, i8), ContextCompat.getColor(getContext(), i8));
        Context context9 = getContext();
        int i9 = R$color.health_hrv_stress_normal;
        GradientColor gradientColor6 = new GradientColor(ContextCompat.getColor(context9, i9), ContextCompat.getColor(getContext(), i9));
        Context context10 = getContext();
        int i10 = R$color.health_hrv_stress_over;
        x83Var2.e(gradientColor4, gradientColor5, gradientColor6, new GradientColor(ContextCompat.getColor(context10, i10), ContextCompat.getColor(getContext(), i10)), getContext().getColor(com.heytap.health.lib_chart.R$color.lib_chart_wrist_back));
    }

    public final int x(int index, LineDataSet dataSet) {
        return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(index, 0), dataSet.getEntryCount() - 1);
    }

    public final void y() {
        getXAxis().setValueFormatter(new b());
    }

    public final void z() {
        getAxisRight().setValueFormatter(new c());
    }

    public BaseChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineColor = ContextCompat.getColor(getContext(), R$color.health_hrv_stress_normal);
        this.lineStrokeWidth = 4.0f;
        this.circleStrokeHoleRadius = 2.0f;
        this.circleStrokeRadius = 2.0f;
        w();
    }

    public BaseChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.showYAxisStartLine = true;
        this.lineColor = ContextCompat.getColor(getContext(), R$color.health_hrv_stress_normal);
        this.lineStrokeWidth = 4.0f;
        this.circleStrokeHoleRadius = 2.0f;
        this.circleStrokeRadius = 2.0f;
        w();
    }
}