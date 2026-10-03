package com.heytap.health.wrist_temperature.ui;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.wrist_temperature.R$id;
import com.heytap.health.wrist_temperature.R$layout;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristDayChart;
import com.heytap.health.wrist_temperature.view.WristTemperatureChart;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.TimeStampedCandleData;
import com.oplus.aiunit.vision.WristValue;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.n6m;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.xp0;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002CDB\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b?\u0010\u001dB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b?\u0010BJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R$\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010&\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0006X\u0086D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristDayChart;", "Landroidx/viewpager/widget/ViewPager;", "Lcom/heytap/health/wrist_temperature/ui/WristDayChart$a;", "listener", "", "f", "", "Lcom/oplus/aiunit/vision/n6m;", "dataList", "setData", "", "getData", "", "position", c7n.f, "c", "d", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "Landroid/content/Context;", "context", MapSchema.FIELD_NAME_ENTRY, "i", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Landroid/view/LayoutInflater;", "j", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Lcom/heytap/health/wrist_temperature/ui/WristDayChart$PagerChartAdapter;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/wrist_temperature/ui/WristDayChart$PagerChartAdapter;", "mAdapter", LogFieldKey.LEVEL_KEY, "Ljava/util/List;", "mDayBeanList", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/wrist_temperature/ui/WristDayChart$a;", "getMChartListener", "()Lcom/heytap/health/wrist_temperature/ui/WristDayChart$a;", "setMChartListener", "(Lcom/heytap/health/wrist_temperature/ui/WristDayChart$a;)V", "mChartListener", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "n", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "getMChart", "()Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "setMChart", "(Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;)V", "mChart", "", "o", UserInfo.SEX_FEMALE, "getDEFAULT_AXIS_MAX", "()F", "DEFAULT_AXIS_MAX", "<init>", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "PagerChartAdapter", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class WristDayChart extends ViewPager {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutInflater mLayoutInflater;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public PagerChartAdapter mAdapter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<n6m> mDayBeanList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public a mChartListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public WristTemperatureChart mChart;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final float DEFAULT_AXIS_MAX;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0014\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006("}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristDayChart$PagerChartAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "", "getCount", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "c", "position", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/view/View;", "view", "", "object", "", "isViewFromObject", "getItemPosition", "Landroid/view/ViewGroup;", "container", "instantiateItem", "destroyItem", "", "Lcom/oplus/aiunit/vision/k8m;", "dataList", "", "d", "wristValueList", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "a", "b", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "mViewCache", "", "Ljava/util/Map;", "mInstantiatedViews", "I", "mCurrentPosition", "<init>", "(Lcom/heytap/health/wrist_temperature/ui/WristDayChart;)V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public final class PagerChartAdapter extends PagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final LinkedList<View> mViewCache = new LinkedList<>();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<Integer, View> mInstantiatedViews = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int mCurrentPosition = -1;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristDayChart$PagerChartAdapter$a;", "", "Lcom/oplus/aiunit/vision/n6m;", "wristDayBean", "", "c", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "a", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "getMChart", "()Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "setMChart", "(Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;)V", "mChart", "Landroid/view/View;", "contentView", "<init>", "(Lcom/heytap/health/wrist_temperature/ui/WristDayChart$PagerChartAdapter;Landroid/view/View;)V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
        public final class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public WristTemperatureChart mChart;
            public final /* synthetic */ PagerChartAdapter b;

            /* JADX INFO: renamed from: com.heytap.health.wrist_temperature.ui.WristDayChart$PagerChartAdapter$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/wrist_temperature/ui/WristDayChart$PagerChartAdapter$a$a", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", MapSchema.FIELD_NAME_ENTRY, "Lcom/github/mikephil/charting/highlight/Highlight;", c7n.g, "", "onValueSelected", "onNothingSelected", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
            public static final class C0711a implements OnChartValueSelectedListener {
                public final /* synthetic */ WristDayChart a;

                public C0711a(WristDayChart wristDayChart) {
                    this.a = wristDayChart;
                }

                @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                public void onNothingSelected() {
                    a mChartListener = this.a.getMChartListener();
                    if (mChartListener != null) {
                        mChartListener.onNothingSelected();
                    }
                }

                @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                public void onValueSelected(@Nullable Entry e2, @Nullable Highlight h) {
                    a mChartListener = this.a.getMChartListener();
                    if (mChartListener != null) {
                        mChartListener.S();
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/wrist_temperature/ui/WristDayChart$PagerChartAdapter$a$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
            public static final class b extends ohb {
                public final /* synthetic */ WristDayChart a;

                public b(WristDayChart wristDayChart) {
                    this.a = wristDayChart;
                }

                @Override // com.oplus.aiunit.vision.ohb
                @NotNull
                public String a(@NotNull Entry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    return m6m.INSTANCE.g(entry.getY(), this.a.getContext()) + this.a.getContext().getString(R$string.health_wrist_temperature_unit);
                }

                @Override // com.oplus.aiunit.vision.ohb
                @NotNull
                public String b(@NotNull Entry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    Object data = entry.getData();
                    if (data instanceof TimeStampedData) {
                        Object data2 = entry.getData();
                        Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
                        String strG = lo9.g(((TimeStampedData) data2).getTimestamp(), o15.DATE_FORMAT_HOUR);
                        Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
                        return strG;
                    }
                    if (!(data instanceof TimeStampedCandleData)) {
                        return "anything";
                    }
                    Object data3 = entry.getData();
                    Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
                    String strG2 = lo9.g(((TimeStampedCandleData) data3).getTimestamp(), o15.DATE_FORMAT_HOUR);
                    Intrinsics.checkNotNullExpressionValue(strG2, "{\n                      …                        }");
                    return strG2;
                }
            }

            public a(@NotNull PagerChartAdapter pagerChartAdapter, View contentView) {
                Intrinsics.checkNotNullParameter(contentView, "contentView");
                this.b = pagerChartAdapter;
                View viewFindViewById = contentView.findViewById(R$id.health_wrist_chart_day);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "contentView.findViewById…d.health_wrist_chart_day)");
                this.mChart = (WristTemperatureChart) viewFindViewById;
            }

            public static final String d(WristTemperatureChart it, int i, double d) {
                Intrinsics.checkNotNullParameter(it, "$it");
                return DateFormat.format(o15.DATE_FORMAT_HOUR, new Date((long) (d * it.getXAxisTimeUnit().getUnit()))).toString();
            }

            public static final String e(int i, double d) {
                if (d == 0.0d) {
                    return "基线";
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void c(@NotNull n6m wristDayBean) {
                Intrinsics.checkNotNullParameter(wristDayBean, "wristDayBean");
                final WristTemperatureChart wristTemperatureChart = this.mChart;
                PagerChartAdapter pagerChartAdapter = this.b;
                WristDayChart wristDayChart = WristDayChart.this;
                CommonMarkerView commonMarkerView = new CommonMarkerView(wristTemperatureChart.getContext(), new b(wristDayChart));
                wristTemperatureChart.setMarker(commonMarkerView);
                commonMarkerView.setChartView(wristTemperatureChart);
                wristTemperatureChart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.o6m
                    @Override // com.oplus.aiunit.vision.xp0
                    public final String a(int i, double d) {
                        return WristDayChart.PagerChartAdapter.a.d(wristTemperatureChart, i, d);
                    }
                });
                wristTemperatureChart.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.p6m
                    @Override // com.oplus.aiunit.vision.xp0
                    public final String a(int i, double d) {
                        return WristDayChart.PagerChartAdapter.a.e(i, d);
                    }
                });
                wristTemperatureChart.setDrawZeroGridLine(true);
                wristTemperatureChart.setOnChartValueSelectedListener(new C0711a(wristDayChart));
                wristTemperatureChart.getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{qmg.a(wristTemperatureChart.getContext(), 3.0f), qmg.a(wristTemperatureChart.getContext(), 3.0f)}, 0.0f));
                float f = qmg.f(wristDayChart.getContext());
                Context context = wristDayChart.getContext();
                Intrinsics.checkNotNull(context);
                float f2 = qmg.f(wristDayChart.getContext()) / 2;
                Context context2 = wristDayChart.getContext();
                Intrinsics.checkNotNull(context2);
                wristTemperatureChart.setGridLinePos(new float[]{0.0f, f - jjk.a(context, 67.0f), f2 - jjk.a(context2, 33.0f)});
                wristTemperatureChart.setXAxisTimeUnit(TimeUnit.MINUTE);
                wristTemperatureChart.getXAxis().setLabelCount(2);
                float default_axis_max = wristDayChart.getDEFAULT_AXIS_MAX();
                List<WristValue> listC = wristDayBean.c();
                if (listC != null) {
                    default_axis_max = pagerChartAdapter.d(listC);
                }
                wristTemperatureChart.setYAxisRightValues(new float[]{-default_axis_max, 0.0f, default_axis_max});
                wristTemperatureChart.setChartType(0);
                wristTemperatureChart.setTimeXAxisMinimum(wristDayBean.getStartTimestamp());
                wristTemperatureChart.setTimeXAxisMaximum(wristDayBean.getEndTimestamp());
                wristTemperatureChart.setEntryData(pagerChartAdapter.a(wristDayBean.c()));
                List<WristValue> listC2 = wristDayBean.c();
                if (listC2 != null) {
                    if (listC2.size() == 1) {
                        if (listC2.get(0).getValue() == -10000.0f) {
                            wristTemperatureChart.setIfDrawMask(false);
                            return;
                        }
                    }
                    wristTemperatureChart.setIfDrawMask(true);
                }
            }
        }

        public PagerChartAdapter() {
        }

        @NotNull
        public final List<TimeStampedData> a(@Nullable List<WristValue> wristValueList) {
            if (wristValueList == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            int size = wristValueList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new TimeStampedData(wristValueList.get(i).getStartTimestamp(), wristValueList.get(i).getValue()));
            }
            return arrayList;
        }

        public final WristTemperatureChart b(int position) {
            View view = this.mInstantiatedViews.get(Integer.valueOf(position));
            if (view != null) {
                return (WristTemperatureChart) view.findViewById(R$id.health_wrist_chart_day);
            }
            return null;
        }

        @Nullable
        public final WristTemperatureChart c() {
            View view = this.mInstantiatedViews.get(Integer.valueOf(this.mCurrentPosition));
            if (view != null) {
                return (WristTemperatureChart) view.findViewById(R$id.health_wrist_chart_day);
            }
            return null;
        }

        public final float d(@NotNull List<WristValue> dataList) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            int default_axis_max = (int) WristDayChart.this.getDEFAULT_AXIS_MAX();
            int i = -default_axis_max;
            int size = dataList.size();
            for (int i2 = 0; i2 < size; i2++) {
                float fC = dataList.get(i2).getValue();
                if (!(fC == -10000.0f)) {
                    if (!(fC == 10000.0f)) {
                        if (fC > default_axis_max) {
                            default_axis_max = ((fC % ((float) 2)) > 0.0f ? 1 : ((fC % ((float) 2)) == 0.0f ? 0 : -1)) == 0 ? (int) fC : ((((int) fC) / 2) + 1) * 2;
                        }
                        if (fC < i) {
                            i = ((fC % ((float) 2)) > 0.0f ? 1 : ((fC % ((float) 2)) == 0.0f ? 0 : -1)) == 0 ? (int) fC : ((((int) fC) / 2) - 1) * 2;
                        }
                    }
                }
            }
            int i3 = -i;
            if (i3 > default_axis_max) {
                default_axis_max = i3;
            }
            return default_axis_max;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(object, "object");
            View view = (View) object;
            container.removeView(view);
            this.mViewCache.add(view);
            this.mInstantiatedViews.remove(Integer.valueOf(position));
        }

        public final void e(int position) {
            WristTemperatureChart wristTemperatureChartB = b(position);
            if (wristTemperatureChartB != null) {
                wristTemperatureChartB.r();
            }
            this.mCurrentPosition = position;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return WristDayChart.this.mDayBeanList.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NotNull Object object) {
            Intrinsics.checkNotNullParameter(object, "object");
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            View viewInflate;
            a aVar;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.mViewCache.isEmpty()) {
                LayoutInflater layoutInflater = WristDayChart.this.mLayoutInflater;
                Intrinsics.checkNotNull(layoutInflater);
                viewInflate = layoutInflater.inflate(R$layout.health_wrist_temperature_daychart_layout, (ViewGroup) null, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "mLayoutInflater!!.inflat…  false\n                )");
                WristDayChart.this.setMChart((WristTemperatureChart) viewInflate.findViewById(R$id.health_wrist_chart_day));
                aVar = new a(this, viewInflate);
                viewInflate.setTag(aVar);
            } else {
                View viewRemoveFirst = this.mViewCache.removeFirst();
                Intrinsics.checkNotNullExpressionValue(viewRemoveFirst, "mViewCache.removeFirst()");
                viewInflate = viewRemoveFirst;
                Object tag = viewInflate.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.ui.WristDayChart.PagerChartAdapter.ViewHolder");
                aVar = (a) tag;
            }
            aVar.c((n6m) WristDayChart.this.mDayBeanList.get(position));
            container.addView(viewInflate);
            this.mInstantiatedViews.put(Integer.valueOf(position), viewInflate);
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(object, "object");
            return Intrinsics.areEqual(view, object);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristDayChart$a;", "", "", "S", "onNothingSelected", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void S();

        void onNothingSelected();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WristDayChart(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDayBeanList = new ArrayList();
        this.DEFAULT_AXIS_MAX = 2.0f;
        e(context);
    }

    public final void c() {
        PagerChartAdapter pagerChartAdapter = this.mAdapter;
        WristTemperatureChart wristTemperatureChartC = pagerChartAdapter != null ? pagerChartAdapter.c() : null;
        if (wristTemperatureChartC != null) {
            wristTemperatureChartC.r();
        }
    }

    public final void d() {
        PagerChartAdapter pagerChartAdapter = this.mAdapter;
        WristTemperatureChart wristTemperatureChartC = pagerChartAdapter != null ? pagerChartAdapter.c() : null;
        if (wristTemperatureChartC != null) {
            wristTemperatureChartC.x();
        }
    }

    public final void e(Context context) {
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        PagerChartAdapter pagerChartAdapter = new PagerChartAdapter();
        this.mAdapter = pagerChartAdapter;
        setAdapter(pagerChartAdapter);
    }

    public final void f(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChartListener = listener;
    }

    public final void g(int position) {
        PagerChartAdapter pagerChartAdapter = this.mAdapter;
        if (pagerChartAdapter != null) {
            pagerChartAdapter.e(position);
        }
    }

    public final float getDEFAULT_AXIS_MAX() {
        return this.DEFAULT_AXIS_MAX;
    }

    @NotNull
    public final List<n6m> getData() {
        return this.mDayBeanList;
    }

    @Nullable
    public final WristTemperatureChart getMChart() {
        return this.mChart;
    }

    @Nullable
    public final a getMChartListener() {
        return this.mChartListener;
    }

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev) {
        try {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.onInterceptTouchEvent(ev);
        } catch (Exception e2) {
            m8b.b("WristDayChart", "sleep viewPage onInterceptTouchEvent:" + e2);
            return false;
        }
    }

    public final void setData(@NotNull List<n6m> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mDayBeanList.clear();
        this.mDayBeanList.addAll(dataList);
        PagerChartAdapter pagerChartAdapter = this.mAdapter;
        if (pagerChartAdapter != null) {
            pagerChartAdapter.notifyDataSetChanged();
        }
    }

    public final void setMChart(@Nullable WristTemperatureChart wristTemperatureChart) {
        this.mChart = wristTemperatureChart;
    }

    public final void setMChartListener(@Nullable a aVar) {
        this.mChartListener = aVar;
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WristDayChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDayBeanList = new ArrayList();
        this.DEFAULT_AXIS_MAX = 2.0f;
        e(context);
    }
}