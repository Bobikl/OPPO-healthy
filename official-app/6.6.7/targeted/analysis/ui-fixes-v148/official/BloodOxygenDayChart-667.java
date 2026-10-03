package com.heytap.health.bloodoxygen.view;

import android.content.Context;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.bloodoxygen.R$id;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.bloodoxygen.view.BloodOxygenDayChart;
import com.heytap.health.bloodoxygen.view.BloodOxygenDayChart.a;
import com.heytap.health.core.widget.charts.BloodOxCandleChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ar0;
import com.oplus.aiunit.vision.br8;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.f59;
import com.oplus.aiunit.vision.fl1;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import com.xiaomi.mipush.sdk.Constants;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u000212B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b+\u0010/J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001f\u0010!\u001a\u00060\u001cR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R6\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart;", "Landroidx/viewpager/widget/ViewPager;", "Lcom/oplus/aiunit/vision/fl1;", "getCurrentItemData", "Ljava/time/LocalDate;", "date", "", "c", "(Ljava/time/LocalDate;)Ljava/lang/Integer;", "getCurrentPosition", "()Ljava/lang/Integer;", "", "i", c7n.g, "d", "position", "f", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "onTouchEvent", "Landroid/content/Context;", "context", MapSchema.FIELD_NAME_ENTRY, "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "layoutInflater", "Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart$a;", "j", "Lkotlin/Lazy;", "getChartPageAdapter", "()Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart$a;", "chartPageAdapter", "", "list", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "b", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodOxygenDayChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxygenDayChart.kt\ncom/heytap/health/bloodoxygen/view/BloodOxygenDayChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1864#2,3:398\n*S KotlinDebug\n*F\n+ 1 BloodOxygenDayChart.kt\ncom/heytap/health/bloodoxygen/view/BloodOxygenDayChart\n*L\n86#1:398,3\n*E\n"})
public final class BloodOxygenDayChart extends ViewPager {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public LayoutInflater layoutInflater;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy chartPageAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<? extends fl1> data;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R3\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0018j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b`\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart$a;", "Landroidx/viewpager/widget/PagerAdapter;", "", "position", "", LogFieldKey.MESSAGE_KEY, "j", c7n.f, "Landroid/view/View;", "c", "getCount", "view", "", "object", "", "isViewFromObject", "getItemPosition", "Landroid/view/ViewGroup;", "container", "instantiateItem", "destroyItem", "f", "Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "b", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "d", "()Ljava/util/HashMap;", "mInstantiateViews", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "viewCache", "I", MapSchema.FIELD_NAME_ENTRY, "()I", LogFieldKey.LEVEL_KEY, "(I)V", "mPosition", "<init>", "(Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart;)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
    public final class a extends PagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final HashMap<Integer, View> mInstantiateViews = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final LinkedList<View> viewCache = new LinkedList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int mPosition = -1;

        /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.view.BloodOxygenDayChart$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u001f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006$"}, d2 = {"Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart$a$a;", "", "Lcom/oplus/aiunit/vision/fl1;", "itemData", "", "d", "", "isMarkerVisible", "i", "", "spo2RangeStr", c7n.g, "Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "a", "Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "getCandleChart", "()Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "candleChart", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getRangeValueText", "()Landroid/widget/TextView;", "rangeValueText", "c", "getRangeValueUnitText", "rangeValueUnitText", "getEmptyValueText", "emptyValueText", MapSchema.FIELD_NAME_ENTRY, "getRangeValueLabelText", "rangeValueLabelText", "Landroid/view/View;", "contentView", "<init>", "(Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart$a;Landroid/view/View;)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
        public final class C0304a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final BloodOxCandleChart candleChart;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final TextView rangeValueText;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final TextView rangeValueUnitText;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final TextView emptyValueText;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final TextView rangeValueLabelText;
            public final /* synthetic */ a f;

            /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.view.BloodOxygenDayChart$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/bloodoxygen/view/BloodOxygenDayChart$a$a$a", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", MapSchema.FIELD_NAME_ENTRY, "Lcom/github/mikephil/charting/highlight/Highlight;", c7n.g, "", "onValueSelected", "onNothingSelected", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
            public static final class C0305a implements OnChartValueSelectedListener {
                public C0305a() {
                }

                @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                public void onNothingSelected() {
                    ar0.a("BloodOxygenDayChart", "onNothingSelected");
                    C0304a.this.i(false);
                }

                @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                public void onValueSelected(@Nullable Entry e2, @Nullable Highlight h) {
                    int iRoundToInt = MathKt__MathJVMKt.roundToInt(e2 != null ? e2.getX() : -1.0f);
                    ar0.a("BloodOxygenDayChart", "onValueSelected index=" + iRoundToInt);
                    C0304a.this.i(iRoundToInt >= 0);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.view.BloodOxygenDayChart$a$a$b */
            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/bloodoxygen/view/BloodOxygenDayChart$a$a$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
            public static final class b extends ohb {
                @Override // com.oplus.aiunit.vision.ohb
                @Nullable
                public String a(@Nullable Entry entry) {
                    if (entry == null || entry.getData() == null) {
                        return null;
                    }
                    Object data = entry.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.HeartRateData");
                    f59 f59Var = (f59) data;
                    if (f59Var.b() <= 0 && f59Var.a() <= 0) {
                        return "--";
                    }
                    if (f59Var.b() == f59Var.a()) {
                        return f59Var.b() + "%";
                    }
                    return f59Var.b() + "%-" + f59Var.a() + "%";
                }

                @Override // com.oplus.aiunit.vision.ohb
                @Nullable
                public String b(@Nullable Entry entry) {
                    if (entry == null || entry.getData() == null) {
                        return null;
                    }
                    Object data = entry.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.HeartRateData");
                    f59 f59Var = (f59) data;
                    return lo9.g(f59Var.c(), o15.DATE_FORMAT_HOUR) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(f59Var.c() + 3600000, o15.DATE_FORMAT_HOUR);
                }
            }

            public C0304a(@NotNull a aVar, View contentView) {
                Intrinsics.checkNotNullParameter(contentView, "contentView");
                this.f = aVar;
                View viewFindViewById = contentView.findViewById(R$id.view_blood_oxygen_candle_chart);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "contentView.findViewById…lood_oxygen_candle_chart)");
                this.candleChart = (BloodOxCandleChart) viewFindViewById;
                View viewFindViewById2 = contentView.findViewById(R$id.tv_range_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "contentView.findViewById(R.id.tv_range_value)");
                this.rangeValueText = (TextView) viewFindViewById2;
                View viewFindViewById3 = contentView.findViewById(R$id.tv_range_value_unit);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "contentView.findViewById(R.id.tv_range_value_unit)");
                this.rangeValueUnitText = (TextView) viewFindViewById3;
                View viewFindViewById4 = contentView.findViewById(R$id.tv_empty_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "contentView.findViewById(R.id.tv_empty_value)");
                this.emptyValueText = (TextView) viewFindViewById4;
                View viewFindViewById5 = contentView.findViewById(R$id.tv_range_label);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "contentView.findViewById(R.id.tv_range_label)");
                this.rangeValueLabelText = (TextView) viewFindViewById5;
            }

            public static final String e(int i, double d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }

            public static final String f(int i, double d) {
                return String.valueOf(i * 6);
            }

            public static final void g(BloodOxygenDayChart this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getParent().requestDisallowInterceptTouchEvent(false);
            }

            public final void d(@NotNull fl1 itemData) {
                Intrinsics.checkNotNullParameter(itemData, "itemData");
                XAxis xAxis = this.candleChart.getXAxis();
                YAxis axisRight = this.candleChart.getAxisRight();
                this.candleChart.setBarWidth(0.6f);
                this.candleChart.setRadius(2.0f);
                this.candleChart.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.il1
                    @Override // com.oplus.aiunit.vision.xp0
                    public final String a(int i, double d) {
                        return BloodOxygenDayChart.a.C0304a.e(i, d);
                    }
                });
                axisRight.removeAllLimitLines();
                BloodOxCandleChart bloodOxCandleChart = this.candleChart;
                TimeUnit timeUnit = TimeUnit.HOUR;
                bloodOxCandleChart.setXAxisTimeUnit(timeUnit);
                this.candleChart.setXAxisLabelCount(5);
                xAxis.setLabelCount(5, true);
                this.candleChart.setHighlightPerDragEnabled(false);
                this.candleChart.setHighlightPerTapEnabled(true);
                this.candleChart.setXAxisMinimum(timeUnit.timeStampToUnitDouble(itemData.b()));
                this.candleChart.setXAxisMaximum(timeUnit.timeStampToUnitDouble(itemData.getChartEndTime()));
                this.candleChart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.jl1
                    @Override // com.oplus.aiunit.vision.xp0
                    public final String a(int i, double d) {
                        return BloodOxygenDayChart.a.C0304a.f(i, d);
                    }
                });
                BloodOxCandleChart bloodOxCandleChart2 = this.candleChart;
                BloodOxCandleChart bloodOxCandleChart3 = this.candleChart;
                Matrix matrixTouch = bloodOxCandleChart3.getViewPortHandler().getMatrixTouch();
                final BloodOxygenDayChart bloodOxygenDayChart = BloodOxygenDayChart.this;
                bloodOxCandleChart2.setOnTouchListener((ChartTouchListener) new sp8(bloodOxCandleChart3, matrixTouch, 3.0f, new br8() { // from class: com.oplus.aiunit.vision.kl1
                    @Override // com.oplus.aiunit.vision.br8
                    public final void b() {
                        BloodOxygenDayChart.a.C0304a.g(bloodOxygenDayChart);
                    }
                }));
                this.candleChart.setOnChartValueSelectedListener(new C0305a());
                CommonMarkerView commonMarkerView = new CommonMarkerView(this.candleChart.getContext(), new b());
                commonMarkerView.setOffsetTop(jjk.a(BloodOxygenDayChart.this.getContext(), 20.0f));
                if (itemData.isUndue()) {
                    this.candleChart.getAxisRight().setEnabled(false);
                    this.candleChart.setYAxisLabel(90.0f);
                    h("");
                } else {
                    this.candleChart.getAxisRight().setEnabled(true);
                    this.candleChart.setYAxisLabel(itemData.isEmptyData() ? 90.0f : itemData.g());
                    if (itemData.g() <= 0 || itemData.f() <= 0) {
                        h("");
                    } else {
                        h(itemData.g() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + itemData.f());
                    }
                }
                BloodOxCandleChart bloodOxCandleChart4 = this.candleChart;
                List<f59> undueDataList = itemData.isUndue() ? itemData.getUndueDataList() : itemData.a();
                Intrinsics.checkNotNullExpressionValue(undueDataList, "if (itemData.isUndue) it…se itemData.chartSpo2List");
                bloodOxCandleChart4.setHeartRateData(undueDataList);
                if (itemData.j()) {
                    this.candleChart.setMarker(commonMarkerView);
                } else {
                    this.candleChart.setMarker(null);
                }
                if (!(this.candleChart.getAnimator() instanceof CustomChartAnimator)) {
                    this.candleChart.getAnimator().setPhaseY(0.0f);
                    return;
                }
                ChartAnimator animator = this.candleChart.getAnimator();
                Intrinsics.checkNotNull(animator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
                ((CustomChartAnimator) animator).resetChartYAxisToZeroState();
            }

            public final void h(String spo2RangeStr) {
                if (TextUtils.isEmpty(spo2RangeStr)) {
                    this.emptyValueText.setVisibility(0);
                    this.rangeValueText.setVisibility(8);
                    this.rangeValueUnitText.setVisibility(8);
                } else {
                    this.emptyValueText.setVisibility(8);
                    this.rangeValueText.setVisibility(0);
                    this.rangeValueText.setText(spo2RangeStr);
                    this.rangeValueUnitText.setVisibility(0);
                }
            }

            public final void i(boolean isMarkerVisible) {
                float f = isMarkerVisible ? 0.0f : 1.0f;
                this.rangeValueUnitText.setAlpha(f);
                this.rangeValueText.setAlpha(f);
                this.rangeValueLabelText.setAlpha(f);
                this.emptyValueText.setAlpha(f);
            }
        }

        public a() {
        }

        public static /* synthetic */ void h(a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.mPosition;
            }
            aVar.g(i);
        }

        public static final void i(a this$0, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            BloodOxCandleChart bloodOxCandleChartB = this$0.b(i);
            if (bloodOxCandleChartB != null) {
                bloodOxCandleChartB.highlightValue((Highlight) null, true);
            }
        }

        public static /* synthetic */ void k(a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.mPosition;
            }
            aVar.j(i);
        }

        public static /* synthetic */ void n(a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.mPosition;
            }
            aVar.m(i);
        }

        public final BloodOxCandleChart b(int position) {
            View viewF = f(position);
            if (viewF != null) {
                return (BloodOxCandleChart) viewF.findViewById(R$id.view_blood_oxygen_candle_chart);
            }
            return null;
        }

        @Nullable
        public final View c() {
            return f(this.mPosition);
        }

        @NotNull
        public final HashMap<Integer, View> d() {
            return this.mInstantiateViews;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(object, "object");
            ar0.a("BloodOxygenDayChart", "destroyItem() position = " + position);
            View view = (View) object;
            container.removeView(view);
            this.viewCache.add(view);
            this.mInstantiateViews.remove(Integer.valueOf(position));
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMPosition() {
            return this.mPosition;
        }

        public final View f(int position) {
            return this.mInstantiateViews.get(Integer.valueOf(position));
        }

        public final void g(final int position) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.hl1
                @Override // java.lang.Runnable
                public final void run() {
                    BloodOxygenDayChart.a.i(this.i, position);
                }
            }, 200L);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return BloodOxygenDayChart.this.getData().size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NotNull Object object) {
            Intrinsics.checkNotNullParameter(object, "object");
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            View viewRemoveFirst;
            C0304a c0304a;
            Intrinsics.checkNotNullParameter(container, "container");
            ar0.a("BloodOxygenDayChart", "instantiateItem() position = " + position);
            if (this.viewCache.size() == 0) {
                LayoutInflater layoutInflater = BloodOxygenDayChart.this.layoutInflater;
                Intrinsics.checkNotNull(layoutInflater);
                viewRemoveFirst = layoutInflater.inflate(R$layout.health_blood_oxygen_frgment_daily_chart_v2, (ViewGroup) null, false);
                c0304a = new C0304a(this, viewRemoveFirst);
                viewRemoveFirst.setTag(c0304a);
            } else {
                viewRemoveFirst = this.viewCache.removeFirst();
                Object tag = viewRemoveFirst.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.heytap.health.bloodoxygen.view.BloodOxygenDayChart.ChartPageAdapter.ViewHolder");
                c0304a = (C0304a) tag;
            }
            c0304a.d(BloodOxygenDayChart.this.getData().get(position));
            container.addView(viewRemoveFirst);
            this.mInstantiateViews.put(Integer.valueOf(position), viewRemoveFirst);
            return viewRemoveFirst;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(object, "object");
            return view == object;
        }

        public final void j(int position) {
            BloodOxCandleChart bloodOxCandleChartB = b(position);
            if (bloodOxCandleChartB != null) {
                if (!(bloodOxCandleChartB.getAnimator() instanceof CustomChartAnimator)) {
                    bloodOxCandleChartB.getAnimator().setPhaseY(0.0f);
                    return;
                }
                ChartAnimator animator = bloodOxCandleChartB.getAnimator();
                Intrinsics.checkNotNull(animator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
                ((CustomChartAnimator) animator).resetChartYAxisToZeroState();
            }
        }

        public final void l(int i) {
            this.mPosition = i;
        }

        public final void m(int position) {
            BloodOxCandleChart bloodOxCandleChartB = b(position);
            if (Intrinsics.areEqual(bloodOxCandleChartB != null ? Boolean.valueOf(bloodOxCandleChartB.N()) : null, Boolean.TRUE)) {
                ar0.a("BloodOxygenDayChart", "startChartAnimation : animation already start");
                return;
            }
            j(position);
            BloodOxCandleChart bloodOxCandleChartB2 = b(position);
            if (bloodOxCandleChartB2 != null) {
                bloodOxCandleChartB2.b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodOxygenDayChart(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartPageAdapter = LazyKt__LazyJVMKt.lazy(new Function0<a>() { // from class: com.heytap.health.bloodoxygen.view.BloodOxygenDayChart$chartPageAdapter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final BloodOxygenDayChart.a invoke() {
                return this.this$0.new a();
            }
        });
        this.data = new ArrayList();
        e(context);
    }

    public static final void g(a this_apply, int i) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.m(i);
    }

    private final a getChartPageAdapter() {
        return (a) this.chartPageAdapter.getValue();
    }

    @Nullable
    public final Integer c(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long epochMilli = date.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        int i = 0;
        for (Object obj : this.data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (epochMilli == ((fl1) obj).d()) {
                ar0.a("BloodOxygenDayChart", "fetchItemIndexWithDate() index=" + i + "; date=" + date);
                return Integer.valueOf(i);
            }
            i = i2;
        }
        ar0.a("BloodOxygenDayChart", "fetchItemIndexWithDate() not found");
        return null;
    }

    public final void d() {
        a chartPageAdapter = getChartPageAdapter();
        if (chartPageAdapter != null) {
            a.h(chartPageAdapter, 0, 1, null);
        }
    }

    public final void e(Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        setAdapter(getChartPageAdapter());
    }

    public final void f(final int position) {
        final a chartPageAdapter = getChartPageAdapter();
        if (chartPageAdapter != null) {
            ar0.a("BloodOxygenDayChart", "onPageSelected position=" + position + " mPosition=" + chartPageAdapter.getMPosition());
            chartPageAdapter.g(chartPageAdapter.getMPosition());
            if (chartPageAdapter.getMPosition() != position) {
                chartPageAdapter.j(chartPageAdapter.getMPosition());
            }
            if (chartPageAdapter.getMPosition() < 0) {
                ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.gl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BloodOxygenDayChart.g(chartPageAdapter, position);
                    }
                }, 30L);
            } else {
                chartPageAdapter.m(position);
            }
            chartPageAdapter.l(position);
        }
    }

    @Nullable
    public final fl1 getCurrentItemData() {
        return (fl1) CollectionsKt___CollectionsKt.getOrNull(this.data, getCurrentItem());
    }

    @Nullable
    public final Integer getCurrentPosition() {
        a chartPageAdapter = getChartPageAdapter();
        if (chartPageAdapter != null) {
            return Integer.valueOf(chartPageAdapter.getMPosition());
        }
        return null;
    }

    @NotNull
    public final List<fl1> getData() {
        return this.data;
    }

    public final void h() {
        ar0.a("BloodOxygenDayChart", "resetChartAnimation()");
        a chartPageAdapter = getChartPageAdapter();
        if (chartPageAdapter != null) {
            a.k(chartPageAdapter, 0, 1, null);
        }
    }

    public final void i() {
        ar0.a("BloodOxygenDayChart", "startChartAnimation()");
        a chartPageAdapter = getChartPageAdapter();
        if (chartPageAdapter != null) {
            a.n(chartPageAdapter, 0, 1, null);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.onInterceptTouchEvent(ev);
        } catch (Exception e2) {
            ar0.b("BloodOxygenDayChart", e2.toString());
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        a chartPageAdapter;
        View viewC;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() != 0 && (chartPageAdapter = getChartPageAdapter()) != null && (viewC = chartPageAdapter.c()) != null) {
            View viewFindViewById = viewC.findViewById(R$id.view_blood_oxygen_candle_chart);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "this.findViewById(R.id.v…lood_oxygen_candle_chart)");
            BloodOxCandleChart bloodOxCandleChart = (BloodOxCandleChart) viewFindViewById;
            bloodOxCandleChart.dispatchTouchEvent(ev);
            if (bloodOxCandleChart.getOnTouchListener().getTouchMode() == 10) {
                return false;
            }
        }
        return super.onTouchEvent(ev);
    }

    public final void setData(@NotNull List<? extends fl1> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.data = new ArrayList(list);
        getChartPageAdapter().d().clear();
        getChartPageAdapter().notifyDataSetChanged();
        PagerAdapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodOxygenDayChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartPageAdapter = LazyKt__LazyJVMKt.lazy(new Function0<a>() { // from class: com.heytap.health.bloodoxygen.view.BloodOxygenDayChart$chartPageAdapter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final BloodOxygenDayChart.a invoke() {
                return this.this$0.new a();
            }
        });
        this.data = new ArrayList();
        e(context);
    }
}