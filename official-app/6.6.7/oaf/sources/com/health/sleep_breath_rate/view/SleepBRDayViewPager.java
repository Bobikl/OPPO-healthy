package com.health.sleep_breath_rate.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.health.sleep_breath_rate.R$id;
import com.health.sleep_breath_rate.R$layout;
import com.health.sleep_breath_rate.R$string;
import com.health.sleep_breath_rate.view.SleepBRDayViewPager;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.oplus.aiunit.vision.bdh;
import com.oplus.aiunit.vision.br8;
import com.oplus.aiunit.vision.d3k;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u000234B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b-\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0018\u00010\u001cR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130'2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00065"}, d2 = {"Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "familyMoreDataDetailConfigBean", "", "setFamilyConfig", "f", "e", "", "Lcom/oplus/aiunit/vision/bdh;", "dataList", "h", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "Landroid/content/Context;", "context", "g", "", "i", "Ljava/util/List;", "dayTimeList", "j", "Landroid/view/LayoutInflater;", "k", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager$ChartPageAdapter;", "l", "Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager$ChartPageAdapter;", "mChartPageAdapter", "m", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "Ljava/util/LinkedList;", "Landroid/view/View;", "n", "Ljava/util/LinkedList;", "mViewCache", "", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "ChartPageAdapter", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRDayViewPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRDayViewPager.kt\ncom/health/sleep_breath_rate/view/SleepBRDayViewPager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1#2:347\n*E\n"})
public final class SleepBRDayViewPager extends ViewPager {

    @NotNull
    public final List<Long> i;

    @Nullable
    public List<bdh> j;
    public LayoutInflater k;

    @Nullable
    public ChartPageAdapter l;

    @Nullable
    public FamilyMoreDataDetailConfigBean m;

    @NotNull
    public final LinkedList<View> n;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R(\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager$ChartPageAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Landroid/view/ViewGroup;", "container", "", "position", "", "object", "", "setPrimaryItem", "getCount", "Landroid/view/View;", "view", "", "isViewFromObject", "getItemPosition", "instantiateItem", "destroyItem", "<set-?>", "a", "Landroid/view/View;", "()Landroid/view/View;", "currentView", "<init>", "(Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager;)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public final class ChartPageAdapter extends PagerAdapter {

        @Nullable
        public View a;

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006!"}, d2 = {"Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager$ChartPageAdapter$a;", "", "Lcom/oplus/aiunit/vision/bdh;", "dayBean", "", "d", "e", "", "isMarkerVisible", "h", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "tvRangeTitle", "b", "tvNoData", "c", "tvRangeValue", "tvRangeValueUnit", "tvSleepStartTime", "f", "tvSleepEndTime", "Lcom/health/sleep_breath_rate/view/SleepBRChart;", "g", "Lcom/health/sleep_breath_rate/view/SleepBRChart;", "chart", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "loading", "Landroid/view/View;", "contentView", "<init>", "(Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager$ChartPageAdapter;Landroid/view/View;)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
        public final class a {

            @NotNull
            public TextView a;

            @NotNull
            public TextView b;

            @NotNull
            public TextView c;

            @NotNull
            public TextView d;

            @NotNull
            public TextView e;

            @NotNull
            public TextView f;

            @NotNull
            public SleepBRChart g;

            @NotNull
            public final LinearLayout h;
            public final /* synthetic */ ChartPageAdapter i;

            @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/health/sleep_breath_rate/view/SleepBRDayViewPager$ChartPageAdapter$a$a", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", "e", "Lcom/github/mikephil/charting/highlight/Highlight;", "h", "", "onValueSelected", "onNothingSelected", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
            public static final class a implements OnChartValueSelectedListener {
                public a() {
                }

                public void onNothingSelected() {
                    a.this.h(false);
                }

                public void onValueSelected(@NotNull Entry e, @NotNull Highlight h) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    Intrinsics.checkNotNullParameter(h, "h");
                    a.this.h(MathKt.roundToInt(e.getX()) >= 0);
                }
            }

            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0007"}, d2 = {"com/health/sleep_breath_rate/view/SleepBRDayViewPager$ChartPageAdapter$a$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
            public static final class b extends ohb {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                public b(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                @SuppressLint({"DefaultLocale"})
                @NotNull
                public String a(@NotNull Entry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    if (!(entry.getData() instanceof d3k)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = this.b;
                        String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(entry.getY())}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        String str3 = String.format(str, Arrays.copyOf(new Object[]{str2}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        return str3;
                    }
                    Object data = entry.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
                    d3k d3kVar = (d3k) data;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str4 = this.a;
                    String str5 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(d3kVar.c())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                    String str6 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(d3kVar.b())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                    String str7 = String.format(str4, Arrays.copyOf(new Object[]{str5, str6}, 2));
                    Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                    return str7;
                }

                @NotNull
                public String b(@NotNull Entry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    if (!(entry.getData() instanceof d3k)) {
                        return "anything";
                    }
                    Object data = entry.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
                    return pr8.INSTANCE.y(((d3k) data).d(), "HH:mm");
                }
            }

            public a(@NotNull ChartPageAdapter chartPageAdapter, View view) {
                Intrinsics.checkNotNullParameter(view, "contentView");
                this.i = chartPageAdapter;
                View viewFindViewById = view.findViewById(R$id.tv_range_title);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "contentView.findViewById(R.id.tv_range_title)");
                this.a = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(R$id.tv_no_data);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "contentView.findViewById(R.id.tv_no_data)");
                this.b = (TextView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(R$id.tv_range_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "contentView.findViewById(R.id.tv_range_value)");
                this.c = (TextView) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(R$id.tv_range_value_unit);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "contentView.findViewById(R.id.tv_range_value_unit)");
                this.d = (TextView) viewFindViewById4;
                View viewFindViewById5 = view.findViewById(R$id.tv_sleep_start_time);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "contentView.findViewById(R.id.tv_sleep_start_time)");
                this.e = (TextView) viewFindViewById5;
                View viewFindViewById6 = view.findViewById(R$id.tv_sleep_end_time);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "contentView.findViewById(R.id.tv_sleep_end_time)");
                this.f = (TextView) viewFindViewById6;
                Object objFindViewById = view.findViewById(R$id.view_history_chart);
                Intrinsics.checkNotNullExpressionValue(objFindViewById, "contentView.findViewById(R.id.view_history_chart)");
                this.g = (SleepBRChart) objFindViewById;
                View viewFindViewById7 = view.findViewById(R$id.loading_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "contentView.findViewById(R.id.loading_layout)");
                this.h = (LinearLayout) viewFindViewById7;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void f(SleepBRDayViewPager sleepBRDayViewPager) {
                Intrinsics.checkNotNullParameter(sleepBRDayViewPager, "this$0");
                sleepBRDayViewPager.getParent().requestDisallowInterceptTouchEvent(false);
            }

            public static final String g(int i, double d) {
                return String.valueOf((int) d);
            }

            public final void d(@Nullable bdh dayBean) {
                if (dayBean == null) {
                    this.h.setVisibility(0);
                    this.b.setVisibility(8);
                    this.c.setVisibility(8);
                    this.d.setVisibility(8);
                    this.g.setVisibility(4);
                    return;
                }
                this.h.setVisibility(8);
                this.g.setVisibility(0);
                String string = this.g.getContext().getString(R$string.health_sleep_br_charts_marker_range1);
                Intrinsics.checkNotNullExpressionValue(string, "chart.context.getString(…_br_charts_marker_range1)");
                String string2 = this.g.getContext().getString(R$string.health_sleep_br_charts_marker_range2);
                Intrinsics.checkNotNullExpressionValue(string2, "chart.context.getString(…_br_charts_marker_range2)");
                CommonMarkerView commonMarkerView = new CommonMarkerView(this.g.getContext(), new b(string2, string));
                this.g.setMarker(commonMarkerView);
                commonMarkerView.setChartView(this.g);
                e(dayBean);
                this.g.setOnChartValueSelectedListener(new a());
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @SuppressLint({"SetTextI18n"})
            public final void e(bdh dayBean) {
                this.a.setVisibility(0);
                if (dayBean.getI()) {
                    this.b.setVisibility(0);
                    this.c.setVisibility(8);
                    this.d.setVisibility(8);
                    TextView textView = this.e;
                    pr8 pr8Var = pr8.INSTANCE;
                    textView.setText(pr8Var.y(dayBean.getF(), "HH:mm"));
                    this.f.setText(pr8Var.y(dayBean.getG(), "HH:mm"));
                } else {
                    this.b.setVisibility(8);
                    this.c.setVisibility(0);
                    this.d.setVisibility(0);
                    this.c.setText(dayBean.getB() + "-" + dayBean.getC());
                    TextView textView2 = this.e;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Context context = SleepBRDayViewPager.this.getContext();
                    Intrinsics.checkNotNull(context);
                    String string = context.getString(R$string.health_sleep_br_in_time);
                    Intrinsics.checkNotNullExpressionValue(string, "context!!.getString(R.st….health_sleep_br_in_time)");
                    pr8 pr8Var2 = pr8.INSTANCE;
                    String str = String.format(string, Arrays.copyOf(new Object[]{pr8Var2.y(dayBean.getF(), "HH:mm")}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    textView2.setText(str);
                    TextView textView3 = this.f;
                    Context context2 = SleepBRDayViewPager.this.getContext();
                    Intrinsics.checkNotNull(context2);
                    String string2 = context2.getString(R$string.health_sleep_br_out_time);
                    Intrinsics.checkNotNullExpressionValue(string2, "context!!.getString(R.st…health_sleep_br_out_time)");
                    String str2 = String.format(string2, Arrays.copyOf(new Object[]{pr8Var2.y(dayBean.getG(), "HH:mm")}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    textView3.setText(str2);
                }
                Chart chart = this.g;
                final SleepBRDayViewPager sleepBRDayViewPager = SleepBRDayViewPager.this;
                chart.setExtraTopOffset(55.0f);
                chart.setExtraLeftOffset(0.0f);
                chart.setExtraRightOffset(0.0f);
                chart.setExtraBottomOffset(0.0f);
                chart.setOnTouchListener(new sp8(chart, chart.getViewPortHandler().getMatrixTouch(), 3.0f, new br8() { // from class: com.oplus.aiunit.vision.kdh
                    public final void b() {
                        SleepBRDayViewPager.ChartPageAdapter.a.f(sleepBRDayViewPager);
                    }
                }));
                chart.I(dayBean.getE() > 0.0f ? dayBean.getE() : 0.0f, dayBean.getD() > 0.0f ? dayBean.getD() : 0.0f);
                chart.J(dayBean.getB(), dayBean.getC());
                chart.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.ldh
                    public final String a(int i, double d) {
                        return SleepBRDayViewPager.ChartPageAdapter.a.g(i, d);
                    }
                });
                chart.setSectionDraw(false);
                chart.setShowYAxisStartLine(true);
                chart.setDrawZeroGridLine(true);
                chart.D(false, true);
                chart.setNeedChangeMonthBar(false);
                chart.setUseDefaultLabelPosition(true);
                chart.g();
                chart.q(-5.0f, 5.0f);
                chart.p(16.0f, 55.0f, 35.0f, 8.0f);
                chart.e(true, true, true, true);
                chart.setLineStrokeWidth(1.5f);
                BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.CUSTOM_DP;
                chart.m(linePosition, 16.0f);
                chart.l(linePosition, 36.0f);
                chart.setGridLinePos(new float[]{jjk.a(chart.getContext(), 16.0f), qmg.f(chart.getContext()) - jjk.a(chart.getContext(), 36.0f)});
                chart.setXAxisTimeUnit(TimeUnit.MINUTE);
                chart.getXAxis().setLabelCount(5, true);
                chart.getXAxis().setDrawLabels(false);
                chart.setBarWidth2(0.0f);
                chart.setBarFixedWidth(5.0f);
                chart.setTimeXAxisMinimum(dayBean.getF());
                chart.setTimeXAxisMaximum(dayBean.getG());
                chart.t();
                chart.E(new ArrayList(), dayBean.b());
            }

            public final void h(boolean isMarkerVisible) {
                if (this.b.getVisibility() == 0) {
                    return;
                }
                int i = isMarkerVisible ? 4 : 0;
                if (i == this.c.getVisibility()) {
                    return;
                }
                this.c.setVisibility(i);
                this.a.setVisibility(i);
                this.d.setVisibility(i);
            }
        }

        public ChartPageAdapter() {
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final View getA() {
            return this.a;
        }

        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(object, "object");
            int size = SleepBRDayViewPager.this.n.size();
            StringBuilder sb = new StringBuilder();
            sb.append("destroyItem:");
            sb.append(position);
            sb.append(" mViewCache size:");
            sb.append(size);
            View view = (View) object;
            container.removeView(view);
            SleepBRDayViewPager.this.n.add(view);
        }

        public int getCount() {
            return SleepBRDayViewPager.this.i.size();
        }

        public int getItemPosition(@NotNull Object object) {
            Intrinsics.checkNotNullParameter(object, "object");
            return -2;
        }

        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            View viewInflate;
            a aVar;
            Intrinsics.checkNotNullParameter(container, "container");
            int size = SleepBRDayViewPager.this.n.size();
            StringBuilder sb = new StringBuilder();
            sb.append("instantiateItem:");
            sb.append(position);
            sb.append(" mViewCache size:");
            sb.append(size);
            bdh bdhVar = null;
            if (SleepBRDayViewPager.this.n.size() == 0) {
                LayoutInflater layoutInflater = SleepBRDayViewPager.this.k;
                if (layoutInflater == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLayoutInflater");
                    layoutInflater = null;
                }
                viewInflate = layoutInflater.inflate(R$layout.health_sleep_br_viewpage_view, (ViewGroup) null, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "mLayoutInflater.inflate(…ewpage_view, null, false)");
                aVar = new a(this, viewInflate);
                viewInflate.setTag(aVar);
            } else {
                Object objRemoveFirst = SleepBRDayViewPager.this.n.removeFirst();
                Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "mViewCache.removeFirst()");
                viewInflate = (View) objRemoveFirst;
                Object tag = viewInflate.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.health.sleep_breath_rate.view.SleepBRDayViewPager.ChartPageAdapter.ViewHolder");
                aVar = (a) tag;
            }
            long jLongValue = ((Number) SleepBRDayViewPager.this.i.get(position)).longValue();
            List list = SleepBRDayViewPager.this.j;
            if (list != null) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    bdh bdhVar2 = (bdh) list.get(i);
                    if (bdhVar2.getA() == jLongValue) {
                        bdhVar = bdhVar2;
                        break;
                    }
                }
            }
            aVar.d(bdhVar);
            container.addView(viewInflate);
            return viewInflate;
        }

        public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(object, "object");
            return Intrinsics.areEqual(view, object);
        }

        public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(object, "object");
            super.setPrimaryItem(container, position, object);
            if (Intrinsics.areEqual(this.a, object)) {
                View view = this.a;
                if (view != null) {
                    Intrinsics.checkNotNull(view);
                    GluCombineChart gluCombineChartFindViewById = view.findViewById(R$id.view_history_chart);
                    if (gluCombineChartFindViewById.getPhaseY() <= 0.0f) {
                        gluCombineChartFindViewById.u();
                        return;
                    }
                    return;
                }
                return;
            }
            View view2 = this.a;
            if (view2 != null) {
                Intrinsics.checkNotNull(view2);
                GluCombineChart gluCombineChartFindViewById2 = view2.findViewById(R$id.view_history_chart);
                Intrinsics.checkNotNullExpressionValue(gluCombineChartFindViewById2, "currentView!!.findViewBy…(R.id.view_history_chart)");
                gluCombineChartFindViewById2.t();
            }
            View view3 = (View) object;
            this.a = view3;
            Intrinsics.checkNotNull(view3);
            GluCombineChart gluCombineChartFindViewById3 = view3.findViewById(R$id.view_history_chart);
            Intrinsics.checkNotNullExpressionValue(gluCombineChartFindViewById3, "currentView!!.findViewBy…(R.id.view_history_chart)");
            gluCombineChartFindViewById3.u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepBRDayViewPager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = new ArrayList();
        this.n = new LinkedList<>();
        g(context);
    }

    public final void e() {
        ChartPageAdapter chartPageAdapter = this.l;
        if (chartPageAdapter != null) {
            Intrinsics.checkNotNull(chartPageAdapter);
            View a = chartPageAdapter.getA();
            if (a != null) {
                a.findViewById(R$id.view_history_chart).t();
            }
        }
    }

    public final void f() {
        ChartPageAdapter chartPageAdapter = this.l;
        if (chartPageAdapter != null) {
            Intrinsics.checkNotNull(chartPageAdapter);
            View a = chartPageAdapter.getA();
            if (a != null) {
                a.findViewById(R$id.view_history_chart).u();
            }
        }
    }

    public final void g(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(context)");
        this.k = layoutInflaterFrom;
        ChartPageAdapter chartPageAdapter = new ChartPageAdapter();
        this.l = chartPageAdapter;
        setAdapter(chartPageAdapter);
    }

    @NotNull
    public final List<Long> getData() {
        return this.i;
    }

    public final void h(@NotNull List<bdh> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.j = dataList;
        ChartPageAdapter chartPageAdapter = this.l;
        if (chartPageAdapter != null) {
            chartPageAdapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev) {
        try {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.onInterceptTouchEvent(ev);
        } catch (Exception e) {
            m8b.b("SleepBRDayViewPager", "viewPage onInterceptTouchEvent:" + e);
            return false;
        }
    }

    public final void setData(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "dataList");
        this.i.clear();
        this.i.addAll(list);
        ChartPageAdapter chartPageAdapter = new ChartPageAdapter();
        this.l = chartPageAdapter;
        setAdapter(chartPageAdapter);
    }

    public final void setFamilyConfig(@Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean) {
        this.m = familyMoreDataDetailConfigBean;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepBRDayViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = new ArrayList();
        this.n = new LinkedList<>();
        g(context);
    }
}
