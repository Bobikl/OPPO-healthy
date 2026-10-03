package com.heytap.health.blood.glucose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarWarning;
import com.heytap.health.base.track.a;
import com.heytap.health.blood.glucose.BloodGlucoseYearFragment;
import com.heytap.health.blood.glucose.card.BloodGlucoseWarningCard;
import com.heytap.health.blood.glucose.listener.BloodGlucoseChartTouchListener;
import com.heytap.health.blood.glucose.viewmodel.BloodGlucoseYearViewModel;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.oplus.aiunit.vision.TimeStampedCandleData;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.ek1;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.k7h;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mk1;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.s88;
import com.oplus.aiunit.vision.t88;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.xp0;
import com.xiaomi.mipush.sdk.Constants;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/heytap/health/blood/glucose/BloodGlucoseYearFragment;", "Lcom/heytap/health/blood/glucose/BloodGlucoseBaseFragment;", "", acl.KEY_A0, "initData", "", "Lcom/oplus/aiunit/vision/dq8;", "p0", "Ljava/time/LocalDate;", "date", "L0", "", "moveToXvalue", "", "j0", "n1", "", "startTime", "endTime", "t1", "Lcom/oplus/aiunit/vision/ek1;", "M", "Lcom/oplus/aiunit/vision/ek1;", "detailsCard", "Lcom/oplus/aiunit/vision/mk1;", "N", "Lcom/oplus/aiunit/vision/mk1;", "levelCard", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseWarningCard;", "O", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseWarningCard;", "warningCard", "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseYearViewModel;", SecureGcmConstants.MESSAGE_KEY, "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseYearViewModel;", "viewModel", "<init>", "()V", "Companion", "a", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class BloodGlucoseYearFragment extends BloodGlucoseBaseFragment {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ek1 detailsCard;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public mk1 levelCard;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public BloodGlucoseWarningCard warningCard;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public BloodGlucoseYearViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/blood/glucose/BloodGlucoseYearFragment$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof TimeStampedCandleData) || BloodGlucoseYearFragment.this.getContext() == null) {
                return "anything";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            TimeStampedCandleData timeStampedCandleData = (TimeStampedCandleData) data;
            int i = 0;
            if (!(timeStampedCandleData.getExpandStr().length() > 0)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Context context = BloodGlucoseYearFragment.this.getContext();
                Intrinsics.checkNotNull(context);
                String string = context.getString(R$string.health_blood_glucose_chart_marker_content_not_warning);
                Intrinsics.checkNotNullExpressionValue(string, "context!!.getString(R.st…rker_content_not_warning)");
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(timeStampedCandleData.getLow())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(timeStampedCandleData.getHigh())}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                String str3 = String.format(string, Arrays.copyOf(new Object[]{str, str2}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return str3;
            }
            try {
                i = Integer.parseInt(timeStampedCandleData.getExpandStr());
            } catch (Exception unused) {
                m8b.f("BloodGlucoseYearFragment", "getContentLabel conversion exception");
            }
            Context context2 = BloodGlucoseYearFragment.this.getContext();
            Intrinsics.checkNotNull(context2);
            String quantityString = context2.getResources().getQuantityString(R$plurals.health_blood_glucose_chart_marker_content, i);
            Intrinsics.checkNotNullExpressionValue(quantityString, "context!!.resources.getQ…t_marker_content, counts)");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(timeStampedCandleData.getLow())}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            String str5 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(timeStampedCandleData.getHigh())}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            String str6 = String.format(quantityString, Arrays.copyOf(new Object[]{str4, str5, timeStampedCandleData.getExpandStr()}, 3));
            Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
            return str6;
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object data = entry.getData();
            if (data instanceof TimeStampedData) {
                Object data2 = entry.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
                String strG = lo9.g(((TimeStampedData) data2).getTimestamp(), "yyyMMM");
                Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
                return strG;
            }
            if (!(data instanceof TimeStampedCandleData)) {
                return "anything";
            }
            Object data3 = entry.getData();
            Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            String strG2 = lo9.g(((TimeStampedCandleData) data3).getTimestamp(), "yyyMMM");
            Intrinsics.checkNotNullExpressionValue(strG2, "{\n                      …                        }");
            return strG2;
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

    public static final String o1(BloodGlucoseYearFragment this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = (int) d;
        if (i2 >= 0) {
            t88 gluChartDataBean = this$0.getGluChartDataBean();
            Intrinsics.checkNotNull(gluChartDataBean);
            if (gluChartDataBean.e().size() > i2) {
                t88 gluChartDataBean2 = this$0.getGluChartDataBean();
                Intrinsics.checkNotNull(gluChartDataBean2);
                long timestamp = gluChartDataBean2.e().get(i2).getTimestamp();
                return i == 0 ? pr8.INSTANCE.q(timestamp, "MMM") : String.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), pr8.INSTANCE.d()).toLocalDate().getMonthValue());
            }
        }
        return "";
    }

    public static final String p1(int i, double d) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.heytap.health.blood.glucose.BloodGlucoseBaseFragment
    @SuppressLint({"DefaultLocale"})
    public void A0() {
        CommonMarkerView commonMarkerView = new CommonMarkerView(q0().getContext(), new b());
        q0().setMarker(commonMarkerView);
        commonMarkerView.setChartView(q0());
        V0(new BloodGlucoseChartTouchListener(this, q0(), q0().getViewPortHandler().getMatrixTouch(), 3.0f, 2));
        GluCombineChart gluCombineChartQ0 = q0();
        gluCombineChartQ0.i(this);
        q0().setOnTouchListener((ChartTouchListener) t0());
        gluCombineChartQ0.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.xk1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodGlucoseYearFragment.o1(this.a, i, d);
            }
        });
        gluCombineChartQ0.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.yk1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodGlucoseYearFragment.p1(i, d);
            }
        });
        gluCombineChartQ0.setDrawZeroGridLine(true);
        gluCombineChartQ0.D(false, true);
        gluCombineChartQ0.setNeedChangeMonthBar(false);
        gluCombineChartQ0.getXAxis().setLabelCount(12, false);
        gluCombineChartQ0.getXAxis().setGranularity(1.0f);
        gluCombineChartQ0.getAxisRight().setAxisMinimum(0.0f);
        gluCombineChartQ0.getAxisRight().setAxisMaximum(10.0f);
        gluCombineChartQ0.setExtraOffsets(16.0f, 55.0f, 13.0f, 30.0f);
        gluCombineChartQ0.e(false, false, false, false);
        gluCombineChartQ0.setBarWidth2(0.5416667f);
        q0().setOnChartGestureListener(new k7h() { // from class: com.heytap.health.blood.glucose.BloodGlucoseYearFragment$initChart$2
            @Override // com.oplus.aiunit.vision.k7h
            public void a(@NotNull ChartScrollState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (!this.a.getIsNotData() && state == ChartScrollState.IDLE) {
                    int iRoundToInt = MathKt__MathJVMKt.roundToInt((float) (this.a.q0().getLowestVisibleValueX() + ((double) this.a.q0().getBarWidth()) + ((double) this.a.q0().getExtraXAxisSpace())));
                    t88 gluChartDataBean = this.a.getGluChartDataBean();
                    Intrinsics.checkNotNull(gluChartDataBean);
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(gluChartDataBean.e().get(iRoundToInt).getTimestamp());
                    pr8 pr8Var = pr8.INSTANCE;
                    long epochMilli = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(pr8Var.d()).toInstant().toEpochMilli();
                    long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), pr8Var.d()).plusYears(1L).toLocalDate().atStartOfDay().atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000);
                    m8b.f("BloodGlucoseYearFragment", "chart gesture startTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", epochMilli)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", epochMilli2)));
                    if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() == epochMilli && this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String() == epochMilli2) {
                        return;
                    }
                    if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() > 0 && !this.a.getClickChangeDate()) {
                        if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() < epochMilli) {
                            this.a.z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseYearFragment$initChart$2$onScrollStateChanged$1
                                @Override // p010kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 2).a("element", "年视图").b();
                                }
                            });
                        } else if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() > epochMilli) {
                            this.a.z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseYearFragment$initChart$2$onScrollStateChanged$2
                                @Override // p010kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a("element", "年视图").b();
                                }
                            });
                        }
                    }
                    this.a.W0(false);
                    this.a.R0(epochMilli);
                    this.a.Q0(epochMilli2);
                    this.a.f1();
                    this.a.n1();
                }
            }
        });
    }

    @Override // com.heytap.health.blood.glucose.BloodGlucoseBaseFragment
    public void L0(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDateTime localDateTimeAtStartOfDay = date.with(TemporalAdjusters.firstDayOfYear()).atStartOfDay();
        pr8 pr8Var = pr8.INSTANCE;
        R0(localDateTimeAtStartOfDay.atZone(pr8Var.d()).toInstant().toEpochMilli());
        Q0(date.plusYears(1L).with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000));
        int iF = pr8Var.f(pr8Var.j(getCom.heytap.health.sleep.snore.SnoreHistoryActivity.BORDER_START_TIME java.lang.String()), pr8Var.j(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String()));
        q0().A((iF - q0().getExtraXAxisSpace()) - (q0().getBarWidth() / 2));
        m8b.f("BloodGlucoseYearFragment", "onClickDateCallBack:Lowest:" + pr8Var.y(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), "yyyy/MM/dd HH:mm:ss") + "Highest:" + pr8Var.y(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String(), "yyyy/MM/dd HH:mm:ss") + "index:" + iF);
        n1();
    }

    @Override // com.heytap.health.blood.glucose.BloodGlucoseBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initData() {
        BloodGlucoseYearViewModel bloodGlucoseYearViewModel;
        w0().setVisibility(0);
        q0().setVisibility(4);
        O0(1546272000000L);
        N0(System.currentTimeMillis());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.viewModel = (BloodGlucoseYearViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(BloodGlucoseYearViewModel.class);
        if (z0().u5()) {
            BloodGlucoseYearViewModel bloodGlucoseYearViewModel2 = this.viewModel;
            if (bloodGlucoseYearViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                bloodGlucoseYearViewModel2 = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanP7 = z0().p7();
            bloodGlucoseYearViewModel2.B(familyMoreDataDetailConfigBeanP7 != null ? familyMoreDataDetailConfigBeanP7.getSsoid() : null);
            BloodGlucoseWarningCard bloodGlucoseWarningCard = this.warningCard;
            if (bloodGlucoseWarningCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("warningCard");
                bloodGlucoseWarningCard = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanP8 = z0().p7();
            bloodGlucoseWarningCard.u(familyMoreDataDetailConfigBeanP8 != null ? familyMoreDataDetailConfigBeanP8.getSsoid() : null);
        }
        BloodGlucoseYearViewModel bloodGlucoseYearViewModel3 = this.viewModel;
        if (bloodGlucoseYearViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseYearViewModel3 = null;
        }
        bloodGlucoseYearViewModel3.y().observe(requireActivity(), new c(new Function1<t88, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseYearFragment.initData.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(t88 t88Var) {
                invoke2(t88Var);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t88 t88Var) {
                long chartLowestVisibleTime;
                long chartHighestVisibleTime;
                BloodGlucoseYearFragment bloodGlucoseYearFragment = BloodGlucoseYearFragment.this;
                if (bloodGlucoseYearFragment.x0() > 0) {
                    int size = t88Var.e().size();
                    for (int i = 0; i < size; i++) {
                        if (t88Var.e().get(i).getTimestamp() == BloodGlucoseYearFragment.this.x0()) {
                            t88Var.i(i);
                        }
                    }
                    chartLowestVisibleTime = BloodGlucoseYearFragment.this.x0();
                } else {
                    chartLowestVisibleTime = t88Var.getChartLowestVisibleTime();
                }
                bloodGlucoseYearFragment.R0(chartLowestVisibleTime);
                BloodGlucoseYearFragment bloodGlucoseYearFragment2 = BloodGlucoseYearFragment.this;
                if (bloodGlucoseYearFragment2.x0() > 0) {
                    LocalDateTime localDateTimeAtStartOfDay = h15.D(BloodGlucoseYearFragment.this.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String()).plusYears(1L).atStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "chartLowestVisibleTime.t…usYears(1).atStartOfDay()");
                    chartHighestVisibleTime = h15.I(localDateTimeAtStartOfDay) - ((long) 1000);
                } else {
                    chartHighestVisibleTime = t88Var.getChartHighestVisibleTime();
                }
                bloodGlucoseYearFragment2.Q0(chartHighestVisibleTime);
                BloodGlucoseYearFragment.this.Y0(t88Var);
                BloodGlucoseYearFragment.this.O0(t88Var.getChartStartTime());
                BloodGlucoseYearFragment.this.N0(t88Var.getChartEndTime());
                BloodGlucoseYearFragment.this.d1(t88Var.getIsShowNullChart());
                BloodGlucoseYearFragment.this.q0().setVisibility(0);
                GluCombineChart gluCombineChartQ0 = BloodGlucoseYearFragment.this.q0();
                float f = 2;
                gluCombineChartQ0.setExtraXAxisSpace((1 - gluCombineChartQ0.getBarWidth()) / f);
                gluCombineChartQ0.setXAxisMinimum(0.0d);
                gluCombineChartQ0.setXAxisMaximum(t88Var.e().size() - 1);
                gluCombineChartQ0.setVisibleXRange(11.0f, 11.0f);
                gluCombineChartQ0.A((t88Var.getValidLastDataIndex() - gluCombineChartQ0.getExtraXAxisSpace()) - (gluCombineChartQ0.getBarWidth() / f));
                gluCombineChartQ0.H(new ArrayList(), t88Var.e(), false);
                gluCombineChartQ0.setVisibility(0);
                BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.CUSTOM_DP;
                gluCombineChartQ0.m(linePosition, 16.0f);
                gluCombineChartQ0.l(linePosition, 42.0f);
                gluCombineChartQ0.setGridLinePos(new float[]{jjk.a(gluCombineChartQ0.getContext(), 16.0f), qmg.f(gluCombineChartQ0.getContext()) - jjk.a(gluCombineChartQ0.getContext(), 43.0f)});
                BloodGlucoseYearFragment.this.w0().setVisibility(8);
                BloodGlucoseYearFragment.this.n1();
            }
        }));
        BloodGlucoseYearViewModel bloodGlucoseYearViewModel4 = this.viewModel;
        if (bloodGlucoseYearViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseYearViewModel4 = null;
        }
        bloodGlucoseYearViewModel4.z().observe(getViewLifecycleOwner(), new c(new Function1<List<? extends BloodSugarWarning>, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseYearFragment.initData.2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends BloodSugarWarning> list) {
                invoke2((List<BloodSugarWarning>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<BloodSugarWarning> it) {
                BloodGlucoseWarningCard bloodGlucoseWarningCard2 = BloodGlucoseYearFragment.this.warningCard;
                if (bloodGlucoseWarningCard2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("warningCard");
                    bloodGlucoseWarningCard2 = null;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                bloodGlucoseWarningCard2.t(it, BloodGlucoseYearFragment.this.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), BloodGlucoseYearFragment.this.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String());
            }
        }));
        BloodGlucoseYearViewModel bloodGlucoseYearViewModel5 = this.viewModel;
        if (bloodGlucoseYearViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseYearViewModel = null;
        } else {
            bloodGlucoseYearViewModel = bloodGlucoseYearViewModel5;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lD7 = z0().D7();
        bloodGlucoseYearViewModel.w(1546272000000L, jCurrentTimeMillis, lD7 != null ? lD7.longValue() : 0L);
    }

    @Override // com.heytap.health.blood.glucose.BloodGlucoseBaseFragment
    @NotNull
    public String j0(float moveToXvalue) {
        if (getGluChartDataBean() == null) {
            return "";
        }
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(moveToXvalue + (q0().getBarWidth() / 2) + q0().getExtraXAxisSpace());
        t88 gluChartDataBean = getGluChartDataBean();
        Intrinsics.checkNotNull(gluChartDataBean);
        if (gluChartDataBean.e().size() <= iRoundToInt) {
            return "";
        }
        t88 gluChartDataBean2 = getGluChartDataBean();
        Intrinsics.checkNotNull(gluChartDataBean2);
        return pr8.INSTANCE.y(gluChartDataBean2.e().get(iRoundToInt).getTimestamp(), "yyy");
    }

    public final void n1() {
        BloodGlucoseYearViewModel bloodGlucoseYearViewModel;
        mk1 mk1Var;
        if (getGluChartDataBean() != null) {
            t1(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String());
        }
        if (getGluChartDataBean() != null) {
            BloodGlucoseYearViewModel bloodGlucoseYearViewModel2 = this.viewModel;
            BloodGlucoseYearViewModel bloodGlucoseYearViewModel3 = null;
            if (bloodGlucoseYearViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                bloodGlucoseYearViewModel = null;
            } else {
                bloodGlucoseYearViewModel = bloodGlucoseYearViewModel2;
            }
            long j2 = getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String();
            long j3 = getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String();
            t88 gluChartDataBean = getGluChartDataBean();
            Intrinsics.checkNotNull(gluChartDataBean);
            s88 s88VarX = bloodGlucoseYearViewModel.x(j2, j3, gluChartDataBean.f());
            M0(s88VarX);
            ek1 ek1Var = this.detailsCard;
            if (ek1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("detailsCard");
                ek1Var = null;
            }
            ek1Var.r(s88VarX.getAverageValue());
            mk1 mk1Var2 = this.levelCard;
            if (mk1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("levelCard");
                mk1Var = null;
            } else {
                mk1Var = mk1Var2;
            }
            mk1Var.u(s88VarX, getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String(), 2);
            BloodGlucoseWarningCard bloodGlucoseWarningCard = this.warningCard;
            if (bloodGlucoseWarningCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("warningCard");
                bloodGlucoseWarningCard = null;
            }
            bloodGlucoseWarningCard.v(s88VarX.getWarningCounts());
            BloodGlucoseYearViewModel bloodGlucoseYearViewModel4 = this.viewModel;
            if (bloodGlucoseYearViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                bloodGlucoseYearViewModel3 = bloodGlucoseYearViewModel4;
            }
            bloodGlucoseYearViewModel3.A(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String());
        }
    }

    @Override // com.heytap.health.blood.glucose.BloodGlucoseBaseFragment
    @NotNull
    public List<dq8> p0() {
        this.detailsCard = new ek1(this);
        this.levelCard = new mk1(this);
        this.warningCard = new BloodGlucoseWarningCard(this);
        ArrayList arrayList = new ArrayList();
        ek1 ek1Var = this.detailsCard;
        BloodGlucoseWarningCard bloodGlucoseWarningCard = null;
        if (ek1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailsCard");
            ek1Var = null;
        }
        arrayList.add(ek1Var);
        mk1 mk1Var = this.levelCard;
        if (mk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("levelCard");
            mk1Var = null;
        }
        arrayList.add(mk1Var);
        BloodGlucoseWarningCard bloodGlucoseWarningCard2 = this.warningCard;
        if (bloodGlucoseWarningCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("warningCard");
        } else {
            bloodGlucoseWarningCard = bloodGlucoseWarningCard2;
        }
        arrayList.add(bloodGlucoseWarningCard);
        return arrayList;
    }

    public final void t1(long startTime, long endTime) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        pr8 pr8Var = pr8.INSTANCE;
        if (LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), pr8Var.d()).toLocalDate().getYear()) {
            X0(startTime, endTime, pr8Var.y(startTime, "yyy"));
            return;
        }
        X0(startTime, endTime, pr8Var.y(startTime, "yyyMMM") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + pr8Var.y(endTime, "yyyMMM"));
    }
}