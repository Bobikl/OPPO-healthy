package com.heytap.health.hrv.ui.item;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$string;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.i18n.WeekStrUtils;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.hrv.ui.chart.BaseChart;
import com.heytap.health.hrv.ui.chart.BaseStatChart;
import com.heytap.health.hrv.ui.chart.HChartTouchListener;
import com.heytap.health.hrv.ui.item.WeekStatView;
import com.heytap.health.hrv.util.ChartType;
import com.heytap.health.hrv.viewmodel.StressStatAnalyzeVM;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.heytap.sporthealth.blib.compose.composable.DatePickerKt;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt;
import com.oplus.aiunit.vision.gf8;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.ti9;
import com.oplus.aiunit.vision.xp0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001\tB#\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0002J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u001c\u0010\u0015\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006/"}, d2 = {"Lcom/heytap/health/hrv/ui/item/WeekStatView;", "Lcom/heytap/health/hrv/ui/chart/BaseStatChart;", "Lcom/heytap/health/hrv/util/ChartType;", "type", "Landroid/view/View;", "b", "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "chart", "", "a", "K", "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "list", "M", "", "L", "H", "Lkotlin/Pair;", "", "rangePair", "N", "Lcom/heytap/health/base/base/BaseFragment;", "r", "Lcom/heytap/health/base/base/BaseFragment;", "I", "()Lcom/heytap/health/base/base/BaseFragment;", "fragment", "s", "J", "getLocationTime", "()J", "locationTime", "Landroidx/compose/runtime/MutableState;", "", "t", "Landroidx/compose/runtime/MutableState;", "mDateTitle", "Lcom/heytap/health/hrv/viewmodel/StressStatAnalyzeVM;", "u", "Lcom/heytap/health/hrv/viewmodel/StressStatAnalyzeVM;", "mStatFragmentVM", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "familyConfig", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;J)V", "Companion", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class WeekStatView extends BaseStatChart {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final BaseFragment fragment;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final long locationTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final MutableState<String> mDateTitle;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final StressStatAnalyzeVM mStatFragmentVM;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/hrv/ui/item/WeekStatView$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
            TimeStampedData timeStampedData = (TimeStampedData) data;
            return ti9.a(timeStampedData.getHeartRateType()) + " " + ((int) timeStampedData.getY());
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof TimeStampedData)) {
                return "anything";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
            String strG = lo9.g(((TimeStampedData) data).getTimestamp(), "yyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
            return strG;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekStatView(@NotNull BaseFragment fragment, @Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean, long j2) {
        super(fragment, familyMoreDataDetailConfigBean);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.locationTime = j2;
        this.mDateTitle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.mStatFragmentVM = (StressStatAnalyzeVM) new ViewModelProvider(fragment).get(StressStatAnalyzeVM.class);
    }

    public static final String J(BaseChart chart, WeekStatView this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(chart, "$chart");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long unit = (long) (d * chart.getXAxisTimeUnit().getUnit());
        return lo9.d(unit, System.currentTimeMillis()) ? this$0.fragment.getString(R$string.lib_base_chart_today) : WeekStrUtils.c(unit);
    }

    public final void H() {
        getMViewModel().G().observe(this.fragment, new c(new Function1<List<? extends PhysicalMentalStat>, Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$dataChangeListener$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends PhysicalMentalStat> list) {
                invoke2((List<PhysicalMentalStat>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<PhysicalMentalStat> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                this.this$0.L(mutableList);
                WeekStatView weekStatView = this.this$0;
                weekStatView.M(weekStatView.o(), mutableList);
                BaseChart baseChartO = this.this$0.o();
                BaseFragment fragment = this.this$0.getFragment();
                BaseChart baseChartO2 = this.this$0.o();
                ViewPortHandler viewPortHandler = this.this$0.o().getViewPortHandler();
                baseChartO.setOnTouchListener((ChartTouchListener) new HChartTouchListener(fragment, baseChartO2, viewPortHandler != null ? viewPortHandler.getMatrixTouch() : null, 3.0f, 0, 0, 32, null));
            }
        }));
        this.mStatFragmentVM.K().observe(this.fragment, new c(new Function1<Pair<? extends Long, ? extends Long>, Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$dataChangeListener$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Long, ? extends Long> pair) {
                invoke2((Pair<Long, Long>) pair);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Long, Long> rangePair) {
                WeekStatView weekStatView = this.this$0;
                Intrinsics.checkNotNullExpressionValue(rangePair, "rangePair");
                weekStatView.N(rangePair);
                gf8.Companion companion = gf8.INSTANCE;
                LocalDate localDateF = companion.f(rangePair.getFirst().longValue());
                LocalDate localDateF2 = companion.f(rangePair.getSecond().longValue());
                List<PhysicalMentalStat> value = this.this$0.getMViewModel().G().getValue();
                if (value != null) {
                    StressStatAnalyzeVM stressStatAnalyzeVM = this.this$0.mStatFragmentVM;
                    String str = localDateF.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    Intrinsics.checkNotNullExpressionValue(str, "startLocalDate.format(Da…er.ofPattern(\"yyyyMMdd\"))");
                    int i = Integer.parseInt(str);
                    String str2 = localDateF2.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    Intrinsics.checkNotNullExpressionValue(str2, "endLocalDate.format(Date…er.ofPattern(\"yyyyMMdd\"))");
                    stressStatAnalyzeVM.B(value, i, Integer.parseInt(str2), 5);
                }
                this.this$0.o().moveViewToX(this.this$0.v(rangePair.getFirst().longValue(), this.this$0.o()));
                this.this$0.x(rangePair.getFirst().longValue(), rangePair.getSecond().longValue());
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final BaseFragment getFragment() {
        return this.fragment;
    }

    public final void K() {
        H();
    }

    public final void L(List<PhysicalMentalStat> list) {
        if (list.isEmpty()) {
            return;
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDateD = h15.D(o15.a(((PhysicalMentalStat) CollectionsKt___CollectionsKt.last((List) list)).getDate()));
        int value = 7 - localDateD.getDayOfWeek().getValue();
        int i = 1;
        if (1 > value) {
            return;
        }
        while (true) {
            String date = localDateD.plusDays(i).format(dateTimeFormatterOfPattern);
            Intrinsics.checkNotNullExpressionValue(date, "date");
            list.add(new PhysicalMentalStat(null, Integer.parseInt(date), null, null, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777213, null));
            if (i == value) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void M(BaseChart chart, List<PhysicalMentalStat> list) {
        long jH;
        long jLongValue;
        m8b.f("WeekStatView", "updateChartData list:" + list);
        if (list.isEmpty()) {
            return;
        }
        gf8.Companion companion = gf8.INSTANCE;
        int date = 0;
        LocalDate localDateWith = companion.f(o15.a(list.get(0).getDate())).with((TemporalAdjuster) DayOfWeek.MONDAY);
        Intrinsics.checkNotNullExpressionValue(localDateWith, "HDateUtil.getLocalDate(D…)).with(DayOfWeek.MONDAY)");
        long jH2 = h15.H(localDateWith);
        LocalDate localDateWith2 = companion.f(o15.a(((PhysicalMentalStat) CollectionsKt___CollectionsKt.last((List) list)).getDate())).with((TemporalAdjuster) DayOfWeek.SUNDAY);
        Intrinsics.checkNotNullExpressionValue(localDateWith2, "HDateUtil.getLocalDate(D…)).with(DayOfWeek.SUNDAY)");
        long jH3 = h15.H(localDateWith2);
        int date2 = list.get(0).getDate();
        int date3 = ((PhysicalMentalStat) CollectionsKt___CollectionsKt.last((List) list)).getDate();
        StringBuilder sb = new StringBuilder();
        sb.append("firstDate:");
        sb.append(date2);
        sb.append(", :");
        sb.append(jH2);
        sb.append(", lastDate:");
        sb.append(date3);
        sb.append(", :");
        sb.append(jH3);
        chart.setTimeXAxisMinimum(jH2);
        chart.setTimeXAxisMaximum(jH3);
        chart.setVisibleXRange(7.0f, 7.0f);
        q().clear();
        q().addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) n(list)));
        chart.G(q(), 0.4f);
        if (this.mStatFragmentVM.K().getValue() != null) {
            Pair<Long, Long> value = this.mStatFragmentVM.K().getValue();
            Intrinsics.checkNotNull(value);
            jLongValue = value.getFirst().longValue();
            Pair<Long, Long> value2 = this.mStatFragmentVM.K().getValue();
            Intrinsics.checkNotNull(value2);
            jH = value2.getSecond().longValue();
        } else {
            long j2 = this.locationTime;
            if (j2 > 0) {
                LocalDate localDateMinusDays = h15.D(j2).plusWeeks(1L).minusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "chartLowestVisibleTime.t…plusWeeks(1).minusDays(1)");
                jH = companion.j(localDateMinusDays);
                jLongValue = j2;
            } else {
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    PhysicalMentalStat physicalMentalStat = list.get(size);
                    if (physicalMentalStat.getAvgStress() > 0) {
                        date = physicalMentalStat.getDate();
                        break;
                    }
                }
                gf8.Companion companion2 = gf8.INSTANCE;
                LocalDate localDateWith3 = companion2.f(o15.a(date)).with((TemporalAdjuster) DayOfWeek.MONDAY);
                Intrinsics.checkNotNullExpressionValue(localDateWith3, "HDateUtil.getLocalDate(D…)).with(DayOfWeek.MONDAY)");
                long jH4 = h15.H(localDateWith3);
                LocalDate localDateWith4 = companion2.f(o15.a(date)).with((TemporalAdjuster) DayOfWeek.SUNDAY);
                Intrinsics.checkNotNullExpressionValue(localDateWith4, "HDateUtil.getLocalDate(D…)).with(DayOfWeek.SUNDAY)");
                jH = h15.H(localDateWith4);
                jLongValue = jH4;
            }
        }
        this.mStatFragmentVM.N(new Pair<>(Long.valueOf(jLongValue), Long.valueOf(jH)));
    }

    public final void N(Pair<Long, Long> rangePair) {
        String strG;
        String strG2;
        gf8.Companion companion = gf8.INSTANCE;
        if (companion.f(rangePair.getFirst().longValue()).getYear() == companion.a().getYear()) {
            strG = lo9.g(rangePair.getFirst().longValue(), "MMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(rangePair.first, \"MMMdd\")");
            strG2 = lo9.g(rangePair.getSecond().longValue(), "MMMdd");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(rangePair.second, \"MMMdd\")");
        } else {
            strG = lo9.g(rangePair.getFirst().longValue(), "yyyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(rangePair.first, \"yyyyMMMdd\")");
            strG2 = lo9.g(rangePair.getSecond().longValue(), "yyyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(rangePair.second, \"yyyyMMMdd\")");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%1$s-%2$s", Arrays.copyOf(new Object[]{strG, strG2}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.mDateTitle.setValue(str);
    }

    @Override // com.oplus.aiunit.vision.uz9
    public void a(@NotNull final BaseChart chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        chart.getXAxis().setLabelCount(7);
        chart.setExtraSpace(0.5f);
        chart.setXAxisTimeUnit(TimeUnit.DAY);
        CommonMarkerView commonMarkerView = new CommonMarkerView(chart.getContext(), new b());
        chart.setMarker(commonMarkerView);
        commonMarkerView.setChartView(chart);
        chart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.otl
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return WeekStatView.J(chart, this, i, d);
            }
        });
        K();
    }

    @Override // com.oplus.aiunit.vision.uz9
    @NotNull
    public View b() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-63026957, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$createView$1$1
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-63026957, i, -1, "com.heytap.health.hrv.ui.item.WeekStatView.createView.<anonymous>.<anonymous> (WeekStatView.kt:68)");
                }
                final WeekStatView weekStatView = this.this$0;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i2 = R$color.lib_base_card_white_bg_2;
                Modifier modifierB = AutoClipContentModifierKt.b(BackgroundKt.m163backgroundbw27NRU$default(companion, ColorResources_androidKt.colorResource(i2, composer, 0), null, 2, null));
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierB);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                MutableState mutableState = weekStatView.mDateTitle;
                long jColorResource = ColorResources_androidKt.colorResource(i2, composer, 0);
                DatePickerKt.a(mutableState, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$createView$1$1$1$1$1
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        weekStatView.s(false);
                    }
                }, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$createView$1$1$1$1$2
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        weekStatView.s(true);
                    }
                }, weekStatView.p(), jColorResource, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$createView$1$1$1$1$3
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        weekStatView.u();
                    }
                }, composer, 0, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                LazyDslKt.LazyColumn(OverScrollModifierKt.b(companion, false, null, 0.0f, 0.0f, null, null, 63, null), null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$createView$1$1$1$2
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                        invoke2(lazyListScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        final WeekStatView weekStatView2 = weekStatView;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1419832317, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.WeekStatView$createView$1$1$1$2.1
                            {
                                super(3);
                            }

                            @Override // p010kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                                invoke(lazyItemScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull LazyItemScope item, @Nullable Composer composer2, int i3) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i3 & 81) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1419832317, i3, -1, "com.heytap.health.hrv.ui.item.WeekStatView.createView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeekStatView.kt:84)");
                                }
                                weekStatView2.d(composer2, 8);
                                StressStatAnalyzeViewKt.b(5, weekStatView2.mStatFragmentVM.I(), weekStatView2.mStatFragmentVM.J(), AutoClipContentModifierKt.b(Modifier.INSTANCE), composer2, CircleNetworkImageView.IMG_TYPE_RECT_TANGLE, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                    }
                }, composer, 0, 254);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    @Override // com.oplus.aiunit.vision.uz9
    @NotNull
    public ChartType type() {
        return ChartType.WEEK;
    }
}