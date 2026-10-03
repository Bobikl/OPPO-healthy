package com.health.sleep_breath_rate.week;

import android.text.format.DateFormat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.data.Entry;
import com.health.sleep_breath_rate.R$string;
import com.health.sleep_breath_rate.SleepBRBaseFragment;
import com.health.sleep_breath_rate.listener.SleepBRChartTouchListener;
import com.health.sleep_breath_rate.view.SleepBRChart;
import com.health.sleep_breath_rate.week.SleepBRWeekFragment;
import com.health.sleep_breath_rate.week.model.SameViewModel;
import com.health.sleep_breath_rate.week.viewmodel.SleepBRWeekViewModel;
import com.heytap.health.base.R;
import com.heytap.health.base.i18n.WeekStrUtils;
import com.heytap.health.base.track.a;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.oplus.aiunit.vision.adh;
import com.oplus.aiunit.vision.d3k;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.k7h;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.pdh;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.rch;
import com.oplus.aiunit.vision.sch;
import com.oplus.aiunit.vision.xp0;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/health/sleep_breath_rate/week/SleepBRWeekFragment;", "Lcom/health/sleep_breath_rate/SleepBRBaseFragment;", "", "y0", "initData", "", "Lcom/oplus/aiunit/vision/dq8;", "p0", "Ljava/time/LocalDate;", "date", "J0", "", "moveToXvalue", "", "j0", "C1", "", "startTime", "endTime", "K1", "Lcom/health/sleep_breath_rate/week/viewmodel/SleepBRWeekViewModel;", "L", "Lcom/health/sleep_breath_rate/week/viewmodel/SleepBRWeekViewModel;", "viewModel", "Lcom/health/sleep_breath_rate/week/model/SameViewModel;", "M", "Lcom/health/sleep_breath_rate/week/model/SameViewModel;", "sameViewModel", "Lcom/oplus/aiunit/vision/sch;", "N", "Lcom/oplus/aiunit/vision/sch;", "sleepBRAnalyzeCard", "Lcom/oplus/aiunit/vision/rch;", "O", "Lcom/oplus/aiunit/vision/rch;", "sleepBRAboutCard", "<init>", "()V", "Companion", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRWeekFragment extends SleepBRBaseFragment {
    public SleepBRWeekViewModel L;
    public SameViewModel M;
    public sch N;
    public rch O;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/health/sleep_breath_rate/week/SleepBRWeekFragment$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        public b() {
        }

        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof d3k) || SleepBRWeekFragment.this.getContext() == null) {
                return "anything";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            d3k d3kVar = (d3k) data;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = SleepBRWeekFragment.this.getString(R$string.health_sleep_br_charts_marker_range2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.healt…_br_charts_marker_range2)");
            String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(d3kVar.c()), String.valueOf(d3kVar.b())}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object data = entry.getData();
            if (data instanceof TimeStampedData) {
                Object data2 = entry.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
                String strG = lo9.g(((TimeStampedData) data2).getTimestamp(), "yyyMMMd");
                Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
                return strG;
            }
            if (!(data instanceof d3k)) {
                return "anything";
            }
            Object data3 = entry.getData();
            Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            String strG2 = lo9.g(((d3k) data3).d(), "yyyMMMd");
            Intrinsics.checkNotNullExpressionValue(strG2, "{\n                      …                        }");
            return strG2;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "function");
            this.i = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public static final String G1(SleepBRWeekFragment sleepBRWeekFragment, int i, double d) {
        Intrinsics.checkNotNullParameter(sleepBRWeekFragment, "this$0");
        long unit = (long) (d * sleepBRWeekFragment.q0().getXAxisTimeUnit().getUnit());
        return pr8.INSTANCE.m(unit, System.currentTimeMillis()) <= 0 ? sleepBRWeekFragment.getString(R.string.lib_base_chart_today) : WeekStrUtils.c(unit);
    }

    public static final String J1(int i, double d) {
        return String.valueOf((int) d);
    }

    public final void C1() {
        SameViewModel sameViewModel;
        K1(getF(), getG());
        if (getC() != null) {
            SameViewModel sameViewModel2 = this.M;
            sch schVar = null;
            if (sameViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sameViewModel");
                sameViewModel = null;
            } else {
                sameViewModel = sameViewModel2;
            }
            long f = getF();
            long g = getG();
            adh c2 = getC();
            Intrinsics.checkNotNull(c2);
            pdh pdhVarU = sameViewModel.u(f, g, c2.a());
            K0(pdhVarU, true);
            sch schVar2 = this.N;
            if (schVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepBRAnalyzeCard");
            } else {
                schVar = schVar2;
            }
            schVar.t(pdhVarU);
        }
    }

    @Override // com.health.sleep_breath_rate.SleepBRBaseFragment
    public void J0(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDateTime localDateTimeAtStartOfDay = date.with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay();
        pr8 pr8Var = pr8.INSTANCE;
        P0(localDateTimeAtStartOfDay.atZone(pr8Var.d()).toInstant().toEpochMilli());
        O0(LocalDateTime.ofInstant(Instant.ofEpochMilli(getF()), pr8Var.d()).toLocalDate().atStartOfDay().plusDays(7L).atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000));
        q0().A((q0().getXAxisTimeUnit().timeStampToUnitDouble(getF()) - ((double) q0().getExtraXAxisSpace())) - ((double) (q0().getBarWidth() / 2)));
        String strY = pr8Var.y(getF(), "yyyy/MM/dd HH:mm:ss");
        String strY2 = pr8Var.y(getG(), "yyyy/MM/dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("onClickDateCallBack:Lowest:");
        sb.append(strY);
        sb.append("Highest:");
        sb.append(strY2);
        C1();
    }

    public final void K1(long startTime, long endTime) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        pr8 pr8Var = pr8.INSTANCE;
        if (LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), pr8Var.d()).toLocalDate().getYear()) {
            V0(startTime, endTime, pr8Var.y(startTime, "MMM-dd") + "-" + pr8Var.y(endTime, "MMM-dd"));
            return;
        }
        V0(startTime, endTime, pr8Var.y(startTime, "yyy-MMM-dd") + "-" + pr8Var.y(endTime, "yyy-MMM-dd"));
    }

    @Override // com.health.sleep_breath_rate.SleepBRBaseFragment
    public void initData() {
        SleepBRWeekViewModel sleepBRWeekViewModel;
        w0().setVisibility(0);
        q0().setVisibility(4);
        M0(1546272000000L);
        L0(System.currentTimeMillis());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.L = new ViewModelProvider(fragmentActivityRequireActivity).get(SleepBRWeekViewModel.class);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity()");
        this.M = (SameViewModel) new ViewModelProvider(fragmentActivityRequireActivity2).get(SameViewModel.class);
        SleepBRWeekViewModel sleepBRWeekViewModel2 = this.L;
        if (sleepBRWeekViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            sleepBRWeekViewModel2 = null;
        }
        sleepBRWeekViewModel2.x().observe(requireActivity(), new c(new Function1<adh, Unit>() { // from class: com.health.sleep_breath_rate.week.SleepBRWeekFragment.initData.1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((adh) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(adh adhVar) {
                SleepBRWeekFragment.this.W0(adhVar);
                SleepBRWeekFragment.this.M0(adhVar.getD());
                SleepBRWeekFragment.this.L0(adhVar.getE());
                SleepBRWeekFragment.this.P0(adhVar.getF());
                SleepBRWeekFragment.this.O0(adhVar.getG());
                SleepBRWeekFragment.this.Y0(adhVar.getC());
                SleepBRWeekFragment.this.q0().setVisibility(0);
                GluCombineChart gluCombineChartQ0 = SleepBRWeekFragment.this.q0();
                SleepBRWeekFragment sleepBRWeekFragment = SleepBRWeekFragment.this;
                float f = 2;
                gluCombineChartQ0.setExtraXAxisSpace((1 - gluCombineChartQ0.getBarWidth()) / f);
                gluCombineChartQ0.setTimeXAxisMinimum(adhVar.getD());
                gluCombineChartQ0.setTimeXAxisMaximum(adhVar.getE());
                gluCombineChartQ0.setVisibleXRange(6.0f, 6.0f);
                gluCombineChartQ0.A((sleepBRWeekFragment.q0().getXAxisTimeUnit().timeStampToUnitDouble(adhVar.getF()) - ((double) gluCombineChartQ0.getExtraXAxisSpace())) - ((double) (gluCombineChartQ0.getBarWidth() / f)));
                gluCombineChartQ0.E(new ArrayList(), adhVar.f());
                gluCombineChartQ0.setVisibility(0);
                BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.CUSTOM_DP;
                gluCombineChartQ0.m(linePosition, 16.0f);
                gluCombineChartQ0.l(linePosition, 36.0f);
                gluCombineChartQ0.setGridLinePos(new float[]{jjk.a(gluCombineChartQ0.getContext(), 16.0f), qmg.f(gluCombineChartQ0.getContext()) - jjk.a(gluCombineChartQ0.getContext(), 36.0f)});
                SleepBRWeekFragment.this.w0().setVisibility(8);
                SleepBRWeekFragment.this.C1();
            }
        }));
        SleepBRWeekViewModel sleepBRWeekViewModel3 = this.L;
        if (sleepBRWeekViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            sleepBRWeekViewModel = null;
        } else {
            sleepBRWeekViewModel = sleepBRWeekViewModel3;
        }
        sleepBRWeekViewModel.w(1546272000000L, System.currentTimeMillis(), x0().t7());
    }

    @Override // com.health.sleep_breath_rate.SleepBRBaseFragment
    @NotNull
    public String j0(float moveToXvalue) {
        long xAxisOffset = (long) ((((double) moveToXvalue) + q0().getXAxisOffset() + ((double) q0().getBarWidth()) + ((double) q0().getExtraXAxisSpace())) * q0().getXAxisTimeUnit().getUnit());
        Instant instantOfEpochMilli = Instant.ofEpochMilli(xAxisOffset);
        pr8 pr8Var = pr8.INSTANCE;
        long epochMilli = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().atStartOfDay().plusDays(7L).atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000);
        if (LocalDateTime.ofInstant(Instant.ofEpochMilli(xAxisOffset), pr8Var.d()).toLocalDate().getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), pr8Var.d()).toLocalDate().getYear()) {
            return pr8Var.y(xAxisOffset, "MMM-dd") + "-" + pr8Var.y(epochMilli, "MMM-dd");
        }
        return pr8Var.y(xAxisOffset, "yyy-MMM-dd") + "-" + pr8Var.y(epochMilli, "yyy-MMM-dd");
    }

    @Override // com.health.sleep_breath_rate.SleepBRBaseFragment
    @NotNull
    public List<dq8> p0() {
        this.N = new sch(HealthFrgType.WEEK);
        this.O = new rch();
        ArrayList arrayList = new ArrayList();
        sch schVar = this.N;
        rch rchVar = null;
        if (schVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepBRAnalyzeCard");
            schVar = null;
        }
        arrayList.add(schVar);
        rch rchVar2 = this.O;
        if (rchVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepBRAboutCard");
        } else {
            rchVar = rchVar2;
        }
        arrayList.add(rchVar);
        return arrayList;
    }

    @Override // com.health.sleep_breath_rate.SleepBRBaseFragment
    public void y0() {
        CommonMarkerView commonMarkerView = new CommonMarkerView(q0().getContext(), new b());
        q0().setMarker(commonMarkerView);
        commonMarkerView.setChartView(q0());
        Q0(new SleepBRChartTouchListener(this, q0(), q0().getViewPortHandler().getMatrixTouch(), 3.0f, HealthFrgType.WEEK));
        SleepBRChart sleepBRChartQ0 = q0();
        sleepBRChartQ0.i(this);
        q0().setOnTouchListener(t0());
        sleepBRChartQ0.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.rdh
            public final String a(int i, double d) {
                return SleepBRWeekFragment.G1(this.a, i, d);
            }
        });
        sleepBRChartQ0.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.sdh
            public final String a(int i, double d) {
                return SleepBRWeekFragment.J1(i, d);
            }
        });
        sleepBRChartQ0.getXAxis().setYOffset(8.0f);
        sleepBRChartQ0.q(-5.0f, 5.0f);
        sleepBRChartQ0.setShowYAxisStartLine(true);
        sleepBRChartQ0.setDrawZeroGridLine(true);
        sleepBRChartQ0.D(false, true);
        sleepBRChartQ0.setNeedChangeMonthBar(false);
        sleepBRChartQ0.setUseDefaultLabelPosition(true);
        sleepBRChartQ0.g();
        sleepBRChartQ0.getXAxis().setLabelCount(7, false);
        sleepBRChartQ0.setXAxisTimeUnit(TimeUnit.DAY);
        sleepBRChartQ0.getXAxis().setGranularity(1.0f);
        sleepBRChartQ0.getAxisRight().setAxisMinimum(0.0f);
        sleepBRChartQ0.getAxisRight().setAxisMaximum(10.0f);
        sleepBRChartQ0.p(16.0f, 55.0f, 35.0f, 30.0f);
        sleepBRChartQ0.e(true, true, true, true);
        sleepBRChartQ0.setBarWidth2(0.47619048f);
        q0().setOnChartGestureListener(new k7h() { // from class: com.health.sleep_breath_rate.week.SleepBRWeekFragment$initChart$2
            public void a(@NotNull ChartScrollState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (!this.a.getB() && state == ChartScrollState.IDLE) {
                    long lowestVisibleValueX = (long) ((this.a.q0().getLowestVisibleValueX() + ((double) this.a.q0().getBarWidth()) + ((double) this.a.q0().getExtraXAxisSpace())) * this.a.q0().getXAxisTimeUnit().getUnit());
                    long highestVisibleValueX = (long) (this.a.q0().getHighestVisibleValueX() * this.a.q0().getXAxisTimeUnit().getUnit());
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(lowestVisibleValueX);
                    pr8 pr8Var = pr8.INSTANCE;
                    long epochMilli = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().atStartOfDay().atZone(pr8Var.d()).toInstant().toEpochMilli();
                    long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(highestVisibleValueX), pr8Var.d()).toLocalDate().atStartOfDay().plusDays(1L).atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000);
                    m8b.f("SleepBRWeekFragment", "chart gesture startTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", epochMilli)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", epochMilli2)));
                    if (this.a.getF() == epochMilli && this.a.getG() == epochMilli2) {
                        return;
                    }
                    if (this.a.getF() > 0 && !this.a.getJ()) {
                        if (this.a.getF() < epochMilli) {
                            this.a.x0().s7(new Function0<Unit>() { // from class: com.health.sleep_breath_rate.week.SleepBRWeekFragment$initChart$2$onScrollStateChanged$1
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    a.k().a("moduleid", 4).a("position1", 2).a("element", "周视图").b();
                                }
                            });
                        } else if (this.a.getF() > epochMilli) {
                            this.a.x0().s7(new Function0<Unit>() { // from class: com.health.sleep_breath_rate.week.SleepBRWeekFragment$initChart$2$onScrollStateChanged$2
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    a.k().a("moduleid", 4).a("position1", 1).a("element", "周视图").b();
                                }
                            });
                        }
                    }
                    this.a.R0(false);
                    this.a.P0(epochMilli);
                    this.a.O0(epochMilli2);
                    this.a.d1();
                    this.a.C1();
                }
            }
        });
    }
}
