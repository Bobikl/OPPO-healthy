package com.heytap.health.core.widget.charts;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
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
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.TimeStampedCandleData;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.bt8;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.u88;
import com.oplus.aiunit.vision.xp0;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002 \u0001B\u0017\b\u0016\u0012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001B#\b\u0016\u0012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001\u0012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u009c\u0001B,\b\u0016\u0012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001\u0012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001\u0012\u0007\u0010\u009d\u0001\u001a\u00020#¢\u0006\u0006\b\u0098\u0001\u0010\u009e\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\u001e\u0010&\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001eJ\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001eJ\u000e\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001eJ\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u001eJ\u0016\u0010/\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006J\"\u00100\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\nJ*\u00101\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\r\u001a\u00020\u0006J0\u00103\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\nJ8\u00104\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0006J\u000e\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u000207J\u000e\u0010;\u001a\u00020\u00022\u0006\u0010:\u001a\u000207J\u000e\u0010=\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0019J\u000e\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>J\u000e\u0010B\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0006J\u0006\u0010C\u001a\u00020\u0019J\u0006\u0010D\u001a\u00020\u0019J\u0006\u0010E\u001a\u00020\u0019J\u000e\u0010G\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0006J\u000e\u0010I\u001a\u00020\u00022\u0006\u0010H\u001a\u00020#J\u0006\u0010J\u001a\u00020\u0002J\u000e\u0010L\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0006J\u0010\u0010O\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010MJ\u0006\u0010P\u001a\u00020\u0015J\u0006\u0010R\u001a\u00020QJ\u0016\u0010U\u001a\u00020\u00022\u0006\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020\u001eJ\u0006\u0010V\u001a\u00020\u0002J\u0006\u0010W\u001a\u00020\u0002J\u0006\u0010X\u001a\u00020\u001eJ\u000e\u0010Z\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u001eJ\u000e\u0010\\\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u0006J\u000e\u0010^\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u001eR\"\u0010c\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010j\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010o\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010U\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010pR\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010pR\"\u0010x\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010U\u001a\u0004\bz\u0010l\"\u0004\b{\u0010nR#\u0010\u0080\u0001\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010U\u001a\u0004\b~\u0010l\"\u0004\b\u007f\u0010nR&\u0010\u0084\u0001\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010U\u001a\u0005\b\u0082\u0001\u0010l\"\u0005\b\u0083\u0001\u0010nR'\u0010+\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0085\u0001\u00103\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R(\u0010\u008d\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008a\u0001\u00103\u001a\u0006\b\u008b\u0001\u0010\u0087\u0001\"\u0006\b\u008c\u0001\u0010\u0089\u0001R%\u0010-\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010s\u001a\u0005\b\u008f\u0001\u0010u\"\u0005\b\u0090\u0001\u0010wR\u0017\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010sR&\u0010\u0095\u0001\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010U\u001a\u0005\b\u0093\u0001\u0010l\"\u0005\b\u0094\u0001\u0010n¨\u0006¡\u0001"}, d2 = {"Lcom/heytap/health/core/widget/charts/GluCombineChart;", "Lcom/heytap/health/core/widget/charts/ControllableOffsetCombinedChart;", "", "x", "y", "z", "", ViewEntity.ENABLED, "setLineHighLightEnabled", "setCandleHighlightEnabled", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "lineData", "xValueIsTime", "Lcom/github/mikephil/charting/data/LineDataSet;", "w", "Lcom/oplus/aiunit/vision/d3k;", "candleData", "Lcom/github/mikephil/charting/data/CandleDataSet;", "v", "init", "", "timestamp", "setTimeXAxisMinimum", "setTimeXAxisMaximum", "", "xMinimum", "setXAxisMinimum", "xMaximum", "setXAxisMaximum", "", "minXRange", "maxXRange", "setVisibleXRange", "visibleRange", "", "barNum", "barSpace", "C", "barWidth2", "setBarWidth2", "barWidthDp", "setBarFixedWidth", "extraXAxisSpace", "setExtraXAxis", "lineMode", "candleMode", "D", ExifInterface.LONGITUDE_EAST, "H", "lineData2", UserInfo.SEX_FEMALE, "G", "drawZeroGridLine", "setDrawZeroGridLine", "Lcom/oplus/aiunit/vision/xp0;", "xAxisValueFormatter", "setXAxisValueFormatter", "yAxisValueFormatter", "setYAxisValueFormatter", "xValue", "A", "", CityBean.POS, "setGridLinePos", "forceStartEndValue", "setForceStartEndValue", "getLowestVisibleValueX", "getHighestVisibleValueX", "getXAxisOffset", "sectionDraw", "setSectionDraw", "maskColor", "setMaskColor", acl.KEY_B, "needChangeMonthBar", "setNeedChangeMonthBar", "Lcom/github/mikephil/charting/model/GradientColor;", "completeGradientColor", "setBarChartCompleteGradientColor", "getLowestVisibleTime", "Ljava/time/LocalDateTime;", "getLowestVisibleDate", "heightNumber", "lowNumber", "I", "u", "t", "getPhaseY", "xCutInterval", "setXCutInterval", "useDefaultLabelPosition", "setUseDefaultLabelPosition", "extraSpace", "setExtraSpace", "getXStart", "()D", "setXStart", "(D)V", "xStart", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "getXAxisTimeUnit", "()Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "setXAxisTimeUnit", "(Lcom/heytap/health/core/widget/charts/data/TimeUnit;)V", "xAxisTimeUnit", "getXAxisLabelCount", "()I", "setXAxisLabelCount", "(I)V", "xAxisLabelCount", "Lcom/oplus/aiunit/vision/xp0;", "J", "K", "Z", "getShowYAxisStartLine", "()Z", "setShowYAxisStartLine", "(Z)V", "showYAxisStartLine", "L", "getLineColor", "setLineColor", "lineColor", "M", "getLineColor2", "setLineColor2", "lineColor2", "N", "getBarColor", "setBarColor", "barColor", "O", "getExtraXAxisSpace", "()F", "setExtraXAxisSpace", "(F)V", SecureGcmConstants.MESSAGE_KEY, "getLineStrokeWidth", "setLineStrokeWidth", "lineStrokeWidth", "Q", "getLineMode", "setLineMode", "R", "S", "getSelectedIndex", "setSelectedIndex", "selectedIndex", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public class GluCombineChart extends ControllableOffsetCombinedChart {
    public static final float HEIGHT_THRESHOLD_DEFAULT = 7.8f;
    public static final float LOW_THRESHOLD_DEFAULT = 3.9f;

    @NotNull
    public static final String TAG = "GluCombineChart";
    public static final float YAXIS_MAXIMUM_DEFAULT = 10.0f;
    public static final float YAXIS_MINIMUM_DEFAULT = 0.0f;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public double xStart;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public TimeUnit xAxisTimeUnit;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int xAxisLabelCount;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public xp0 xAxisValueFormatter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public xp0 yAxisValueFormatter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean showYAxisStartLine;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int lineColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int lineColor2;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int barColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public float extraXAxisSpace;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public float lineStrokeWidth;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean lineMode;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean candleMode;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public int selectedIndex;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/core/widget/charts/GluCombineChart$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
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
            if (GluCombineChart.this.xAxisValueFormatter == null) {
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
            String str = i + "_" + (GluCombineChart.this.getXStart() + d);
            String strA = this.labelCache.get(str);
            if (TextUtils.isEmpty(strA)) {
                xp0 xp0Var = GluCombineChart.this.xAxisValueFormatter;
                Intrinsics.checkNotNull(xp0Var);
                strA = xp0Var.a(i, GluCombineChart.this.getXStart() + d);
                this.labelCache.put(str, strA);
            }
            Intrinsics.checkNotNull(strA);
            return strA;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/health/core/widget/charts/GluCombineChart$c", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "value", "Lcom/github/mikephil/charting/components/AxisBase;", "axis", "", "getAxisLabel", "", "a", "Ljava/util/Map;", "labelCache", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
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
            if (GluCombineChart.this.yAxisValueFormatter == null) {
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
            if (!GluCombineChart.this.getShowYAxisStartLine() && i <= 0) {
                String axisLabel2 = super.getAxisLabel(value, axis);
                Intrinsics.checkNotNullExpressionValue(axisLabel2, "super.getAxisLabel(value, axis)");
                return axisLabel2;
            }
            if (!GluCombineChart.this.getShowYAxisStartLine()) {
                i--;
            }
            String str = i + "_" + value;
            String strA = this.labelCache.get(str);
            if (TextUtils.isEmpty(strA)) {
                xp0 xp0Var = GluCombineChart.this.yAxisValueFormatter;
                Intrinsics.checkNotNull(xp0Var);
                strA = xp0Var.a(i, value);
                this.labelCache.put(str, strA);
            }
            Intrinsics.checkNotNull(strA);
            return strA;
        }
    }

    public GluCombineChart(@Nullable Context context) {
        super(context);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.xAxisLabelCount = 5;
        this.lineStrokeWidth = 2.0f;
        this.lineMode = true;
        this.selectedIndex = -1;
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCandleHighlightEnabled(boolean enabled) {
        if (getCandleData() != null) {
            T dataSetByIndex = getCandleData().getDataSetByIndex(0);
            Intrinsics.checkNotNull(dataSetByIndex, "null cannot be cast to non-null type com.github.mikephil.charting.data.CandleDataSet");
            ((CandleDataSet) dataSetByIndex).setHighlightEnabled(enabled);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLineHighLightEnabled(boolean enabled) {
        if (getLineData() != null) {
            T dataSetByIndex = getLineData().getDataSetByIndex(0);
            Intrinsics.checkNotNull(dataSetByIndex, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            ((LineDataSet) dataSetByIndex).setHighlightEnabled(enabled);
        }
    }

    public final void A(double xValue) {
        super.moveViewToX((float) (xValue - this.xStart));
    }

    public final void B() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).f(0);
        }
    }

    public final void C(float visibleRange, int barNum, float barSpace) {
        setBarWidth((visibleRange / barNum) * barSpace);
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).c(getBarWidth());
        }
    }

    public final void D(boolean lineMode, boolean candleMode) {
        this.lineMode = lineMode;
        this.candleMode = candleMode;
        setLineHighLightEnabled(lineMode);
        setCandleHighlightEnabled(candleMode);
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).d(lineMode, candleMode);
        }
        postInvalidate();
    }

    public final void E(@NotNull List<? extends TimeStampedData> lineData, @NotNull List<TimeStampedCandleData> candleData) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        Intrinsics.checkNotNullParameter(candleData, "candleData");
        H(lineData, candleData, true);
    }

    public final void F(@NotNull List<? extends TimeStampedData> lineData, @NotNull List<? extends TimeStampedData> lineData2, @NotNull List<TimeStampedCandleData> candleData) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        Intrinsics.checkNotNullParameter(lineData2, "lineData2");
        Intrinsics.checkNotNullParameter(candleData, "candleData");
        G(lineData, lineData2, candleData, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(@NotNull List<? extends TimeStampedData> lineData, @NotNull List<? extends TimeStampedData> lineData2, @NotNull List<TimeStampedCandleData> candleData, boolean xValueIsTime) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        Intrinsics.checkNotNullParameter(lineData2, "lineData2");
        Intrinsics.checkNotNullParameter(candleData, "candleData");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lineData);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(lineData2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(candleData);
        LineDataSet lineDataSetW = w(arrayList, xValueIsTime);
        lineDataSetW.setColor(this.lineColor);
        LineDataSet lineDataSetW2 = w(arrayList2, xValueIsTime);
        lineDataSetW2.setColor(this.lineColor2);
        lineDataSetW2.setHighlightEnabled(false);
        CandleDataSet candleDataSetV = v(arrayList3, xValueIsTime);
        bt8 bt8Var = new bt8(lineDataSetW, null, 2, 0 == true ? 1 : 0);
        bt8Var.setData(new LineData(lineDataSetW, lineDataSetW2));
        bt8Var.setData(new CandleData(candleDataSetV));
        setData((CombinedData) bt8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(@NotNull List<? extends TimeStampedData> lineData, @NotNull List<TimeStampedCandleData> candleData, boolean xValueIsTime) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        Intrinsics.checkNotNullParameter(candleData, "candleData");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lineData);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(candleData);
        LineDataSet lineDataSetW = w(arrayList, xValueIsTime);
        CandleDataSet candleDataSetV = v(arrayList2, xValueIsTime);
        bt8 bt8Var = new bt8(lineDataSetW, null, 2, 0 == true ? 1 : 0);
        bt8Var.setData(new LineData(lineDataSetW));
        bt8Var.setData(new CandleData(candleDataSetV));
        setData((CombinedData) bt8Var);
    }

    public final void I(float heightNumber, float lowNumber) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).i(heightNumber, lowNumber);
        }
    }

    public final int getBarColor() {
        return this.barColor;
    }

    public final float getExtraXAxisSpace() {
        return this.extraXAxisSpace;
    }

    public final double getHighestVisibleValueX() {
        return ((double) getHighestVisibleX()) + this.xStart;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final int getLineColor2() {
        return this.lineColor2;
    }

    public final boolean getLineMode() {
        return this.lineMode;
    }

    public final float getLineStrokeWidth() {
        return this.lineStrokeWidth;
    }

    @NotNull
    public final LocalDateTime getLowestVisibleDate() {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(getLowestVisibleTime()), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
        return localDateTimeOfInstant;
    }

    public final long getLowestVisibleTime() {
        return (long) ((getLowestVisibleValueX() + ((double) getBarWidth()) + ((double) this.extraXAxisSpace)) * this.xAxisTimeUnit.getUnit());
    }

    public final double getLowestVisibleValueX() {
        return ((double) getLowestVisibleX()) + this.xStart;
    }

    public final float getPhaseY() {
        return getAnimator().getPhaseY();
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final boolean getShowYAxisStartLine() {
        return this.showYAxisStartLine;
    }

    public final int getXAxisLabelCount() {
        return this.xAxisLabelCount;
    }

    /* JADX INFO: renamed from: getXAxisOffset, reason: from getter */
    public final double getXStart() {
        return this.xStart;
    }

    @NotNull
    public final TimeUnit getXAxisTimeUnit() {
        return this.xAxisTimeUnit;
    }

    public final double getXStart() {
        return this.xStart;
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart, com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mDrawOrder = new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.SCATTER};
        ChartAnimator mAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(mAnimator, "mAnimator");
        ViewPortHandler mViewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(mViewPortHandler, "mViewPortHandler");
        this.mRenderer = new u88(this, mAnimator, mViewPortHandler);
        this.mAxisRendererLeft = new nya(this, this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new nya(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new oya(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        l(BaseYAxisRenderer.LinePosition.CUSTOM_PERCENT, 0.922f);
        m(BaseYAxisRenderer.LinePosition.END, 0.0f);
    }

    public final void setBarChartCompleteGradientColor(@Nullable GradientColor completeGradientColor) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).a(completeGradientColor);
        }
    }

    public final void setBarColor(int i) {
        this.barColor = i;
    }

    public final void setBarFixedWidth(float barWidthDp) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).b(barWidthDp);
        }
    }

    public final void setBarWidth2(float barWidth2) {
        setBarWidth(barWidth2);
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).c(getBarWidth());
        }
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

    public final void setExtraXAxis(float extraXAxisSpace) {
        this.extraXAxisSpace = extraXAxisSpace;
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            Intrinsics.checkNotNull(xAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.LineCombinedXAxisRenderer");
            ((oya) xAxisRenderer).i(extraXAxisSpace);
        }
    }

    public final void setExtraXAxisSpace(float f) {
        this.extraXAxisSpace = f;
    }

    public final void setForceStartEndValue(boolean forceStartEndValue) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            Intrinsics.checkNotNull(xAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.LineCombinedXAxisRenderer");
            ((oya) xAxisRenderer).k(forceStartEndValue);
        }
    }

    public final void setGridLinePos(@NotNull float[] pos) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            Intrinsics.checkNotNull(xAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.LineCombinedXAxisRenderer");
            ((oya) xAxisRenderer).e(pos);
        }
    }

    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    public final void setLineColor2(int i) {
        this.lineColor2 = i;
    }

    public final void setLineMode(boolean z) {
        this.lineMode = z;
    }

    public final void setLineStrokeWidth(float f) {
        this.lineStrokeWidth = f;
    }

    public final void setMaskColor(int maskColor) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).f(maskColor);
        }
    }

    public final void setNeedChangeMonthBar(boolean needChangeMonthBar) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).g(needChangeMonthBar);
        }
    }

    public final void setSectionDraw(boolean sectionDraw) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).h(sectionDraw);
        }
    }

    public final void setSelectedIndex(int i) {
        this.selectedIndex = i;
    }

    public final void setShowYAxisStartLine(boolean z) {
        this.showYAxisStartLine = z;
    }

    public final void setTimeXAxisMaximum(long timestamp) {
        float f = 2;
        getXAxis().setAxisMaximum(((float) (this.xAxisTimeUnit.timeStampToUnitDouble(timestamp) - this.xStart)) + (getBarWidth() / f) + this.extraXAxisSpace);
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd HH:mm:ss", timestamp);
        m8b.f(TAG, "setTimeXAxisMaximum" + ((Object) charSequence) + "/xStart:" + this.xStart + "/barWidth:" + (getBarWidth() / f) + "/axisMaximum:" + getXAxis().getAxisMaximum());
    }

    public final void setTimeXAxisMinimum(long timestamp) {
        this.xStart = this.xAxisTimeUnit.timeStampToUnitDouble(timestamp);
        float f = 2;
        getXAxis().setAxisMinimum((0 - (getBarWidth() / f)) - this.extraXAxisSpace);
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd HH:mm:ss", timestamp);
        m8b.f(TAG, "setTimeXAxisMinimum" + ((Object) charSequence) + "/xStart:" + this.xStart + "/barWidth:" + (getBarWidth() / f) + "/axisMinimum:" + getXAxis().getAxisMinimum());
    }

    public final void setUseDefaultLabelPosition(boolean useDefaultLabelPosition) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof BaseYAxisRenderer) {
            Intrinsics.checkNotNull(yAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer");
            ((BaseYAxisRenderer) yAxisRenderer).D(useDefaultLabelPosition);
        }
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererLeft;
        if (yAxisRenderer2 instanceof BaseYAxisRenderer) {
            Intrinsics.checkNotNull(yAxisRenderer2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer");
            ((BaseYAxisRenderer) yAxisRenderer2).D(useDefaultLabelPosition);
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float minXRange, float maxXRange) {
        float f = 2;
        super.setVisibleXRange(minXRange + getBarWidth() + (this.extraXAxisSpace * f), maxXRange + getBarWidth() + (this.extraXAxisSpace * f));
    }

    public final void setXAxisLabelCount(int i) {
        this.xAxisLabelCount = i;
    }

    public final void setXAxisMaximum(double xMaximum) {
        getXAxis().setAxisMaximum(((float) (xMaximum - this.xStart)) + (getBarWidth() / 2) + this.extraXAxisSpace);
    }

    public final void setXAxisMinimum(double xMinimum) {
        this.xStart = xMinimum;
        getXAxis().setAxisMinimum((0 - (getBarWidth() / 2)) - this.extraXAxisSpace);
    }

    public final void setXAxisTimeUnit(@NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<set-?>");
        this.xAxisTimeUnit = timeUnit;
    }

    public final void setXAxisValueFormatter(@NotNull xp0 xAxisValueFormatter) {
        Intrinsics.checkNotNullParameter(xAxisValueFormatter, "xAxisValueFormatter");
        this.xAxisValueFormatter = xAxisValueFormatter;
    }

    public final void setXCutInterval(float xCutInterval) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof u88) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer).j(xCutInterval);
        }
    }

    public final void setXStart(double d) {
        this.xStart = d;
    }

    public final void setYAxisValueFormatter(@NotNull xp0 yAxisValueFormatter) {
        Intrinsics.checkNotNullParameter(yAxisValueFormatter, "yAxisValueFormatter");
        this.yAxisValueFormatter = yAxisValueFormatter;
    }

    public final void t() {
        ChartAnimator chartAnimator = this.mAnimator;
        Intrinsics.checkNotNull(chartAnimator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
        ((CustomChartAnimator) chartAnimator).resetChartYAxisToZeroState();
    }

    public final void u() {
        if (!(getAnimator() instanceof CustomChartAnimator) || this.lineMode) {
            animateY(AnimatorUtil.INSTANCE.m());
            return;
        }
        AnimatorUtil.Companion companion = AnimatorUtil.INSTANCE;
        int iQ = companion.q(this, Float.valueOf(getLowestVisibleX()), Float.valueOf(getHighestVisibleX()), Boolean.TRUE);
        ChartAnimator animator = getAnimator();
        Intrinsics.checkNotNull(animator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
        ((CustomChartAnimator) animator).animateWaveY(companion.m(), iQ);
    }

    public final CandleDataSet v(List<TimeStampedCandleData> candleData, boolean xValueIsTime) {
        ArrayList arrayList = new ArrayList();
        int size = candleData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedCandleData timeStampedCandleData = candleData.get(i);
            arrayList.add(new HealthCandleEntry(xValueIsTime ? (float) (this.xAxisTimeUnit.timeStampToUnitDouble(timeStampedCandleData.getTimestamp()) - this.xStart) : i, timeStampedCandleData.getHigh(), timeStampedCandleData.getLow(), timeStampedCandleData));
        }
        CandleDataSet candleDataSet = new CandleDataSet(arrayList, "");
        candleDataSet.setColor(this.barColor);
        candleDataSet.setDrawValues(false);
        candleDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        candleDataSet.setDrawHighlightIndicators(false);
        candleDataSet.setHighlightEnabled(this.candleMode);
        return candleDataSet;
    }

    public final LineDataSet w(List<? extends TimeStampedData> lineData, boolean xValueIsTime) {
        ArrayList arrayList = new ArrayList();
        int size = lineData.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = lineData.get(i);
            arrayList.add(new Entry(xValueIsTime ? (float) (this.xAxisTimeUnit.timeStampToUnitDouble(timeStampedData.getTimestamp()) - this.xStart) : i, timeStampedData.getY(), timeStampedData));
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
        lineDataSet.setHighlightEnabled(this.lineMode);
        return lineDataSet;
    }

    public final void x() {
        setExtraTopOffset(55.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setExtraBottomOffset(0.0f);
        this.lineStrokeWidth = 1.5f;
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getXAxis().setDrawLabels(true);
        getXAxis().setDrawAxisLine(false);
        getXAxis().setLabelCount(this.xAxisLabelCount, true);
        getXAxis().setTextSize(10.0f);
        getXAxis().setGridLineWidth(0.7f);
        getXAxis().setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        getAxisRight().setDrawAxisLine(false);
        getAxisRight().setDrawZeroLine(false);
        getAxisRight().setDrawLabels(true);
        getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        getAxisLeft().setEnabled(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        setHighlightPerDragEnabled(false);
        setYAxisRightValues(new float[]{0.0f, 3.9f, 7.8f, 10.0f});
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        y();
        z();
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
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            Context context3 = getContext();
            int i3 = R$color.lib_chart_glu_normal_night;
            GradientColor gradientColor = new GradientColor(ContextCompat.getColor(context3, i3), ContextCompat.getColor(getContext(), i3));
            Context context4 = getContext();
            int i4 = R$color.lib_chart_glu_height_night;
            GradientColor gradientColor2 = new GradientColor(ContextCompat.getColor(context4, i4), ContextCompat.getColor(getContext(), i4));
            GradientColor gradientColor3 = new GradientColor(ContextCompat.getColor(getContext(), i3), ContextCompat.getColor(getContext(), i3));
            Context context5 = getContext();
            int i5 = R$color.lib_chart_glu_low_night;
            ((u88) dataRenderer).e(gradientColor, gradientColor2, gradientColor3, new GradientColor(ContextCompat.getColor(context5, i5), ContextCompat.getColor(getContext(), i5)));
            DataRenderer dataRenderer2 = this.mRenderer;
            Intrinsics.checkNotNull(dataRenderer2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer2).f(ContextCompat.getColor(getContext(), R$color.lib_chart_glu_mask_color_night));
            Context context6 = getContext();
            int i6 = R$color.lib_core_charts_heart_rate_day_night;
            this.lineColor = ContextCompat.getColor(context6, i6);
            this.lineColor2 = ContextCompat.getColor(getContext(), R$color.lib_chart_B3B3B3);
            this.barColor = ContextCompat.getColor(getContext(), i6);
        } else {
            XAxis xAxis3 = getXAxis();
            Context context7 = getContext();
            int i7 = R$color.lib_core_charts_grid_line;
            xAxis3.setGridColor(ContextCompat.getColor(context7, i7));
            XAxis xAxis4 = getXAxis();
            Context context8 = getContext();
            int i8 = R$color.lib_core_charts_axis_label;
            xAxis4.setTextColor(ContextCompat.getColor(context8, i8));
            getAxisRight().setGridColor(ContextCompat.getColor(getContext(), i7));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i8));
            DataRenderer dataRenderer3 = this.mRenderer;
            Intrinsics.checkNotNull(dataRenderer3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            Context context9 = getContext();
            int i9 = R$color.lib_chart_glu_normal;
            GradientColor gradientColor4 = new GradientColor(ContextCompat.getColor(context9, i9), ContextCompat.getColor(getContext(), i9));
            Context context10 = getContext();
            int i10 = R$color.lib_chart_glu_height;
            GradientColor gradientColor5 = new GradientColor(ContextCompat.getColor(context10, i10), ContextCompat.getColor(getContext(), i10));
            GradientColor gradientColor6 = new GradientColor(ContextCompat.getColor(getContext(), i9), ContextCompat.getColor(getContext(), i9));
            Context context11 = getContext();
            int i11 = R$color.lib_chart_glu_low;
            ((u88) dataRenderer3).e(gradientColor4, gradientColor5, gradientColor6, new GradientColor(ContextCompat.getColor(context11, i11), ContextCompat.getColor(getContext(), i11)));
            DataRenderer dataRenderer4 = this.mRenderer;
            Intrinsics.checkNotNull(dataRenderer4, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            ((u88) dataRenderer4).f(ContextCompat.getColor(getContext(), R$color.lib_chart_glu_mask_color));
            Context context12 = getContext();
            int i12 = R$color.lib_core_charts_heart_rate_day_night;
            this.lineColor = ContextCompat.getColor(context12, i12);
            this.lineColor2 = ContextCompat.getColor(getContext(), R$color.lib_chart_B3B3B3);
            this.barColor = ContextCompat.getColor(getContext(), i12);
        }
        DataRenderer dataRenderer5 = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer5, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
        ((u88) dataRenderer5).h(true);
    }

    public final void y() {
        getXAxis().setValueFormatter(new b());
    }

    public final void z() {
        getAxisRight().setValueFormatter(new c());
    }

    public GluCombineChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.xAxisLabelCount = 5;
        this.lineStrokeWidth = 2.0f;
        this.lineMode = true;
        this.selectedIndex = -1;
        x();
    }

    public GluCombineChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.xAxisTimeUnit = TimeUnit.ORIGINAL;
        this.xAxisLabelCount = 5;
        this.lineStrokeWidth = 2.0f;
        this.lineMode = true;
        this.selectedIndex = -1;
        x();
    }
}