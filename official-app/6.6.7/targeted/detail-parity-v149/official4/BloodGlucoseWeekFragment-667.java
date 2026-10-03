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
import com.heytap.health.base.i18n.WeekStrUtils;
import com.heytap.health.base.track.a;
import com.heytap.health.blood.glucose.BloodGlucoseWeekFragment;
import com.heytap.health.blood.glucose.card.BloodGlucoseWarningCard;
import com.heytap.health.blood.glucose.listener.BloodGlucoseChartTouchListener;
import com.heytap.health.blood.glucose.viewmodel.BloodGlucoseWeekViewModel;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.oplus.aiunit.vision.TimeStampedCandleData;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.ek1;
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
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
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

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/heytap/health/blood/glucose/BloodGlucoseWeekFragment;", "Lcom/heytap/health/blood/glucose/BloodGlucoseBaseFragment;", "", acl.KEY_A0, "initData", "", "Lcom/oplus/aiunit/vision/dq8;", "p0", "Ljava/time/LocalDate;", "date", "L0", "", "moveToXvalue", "", "j0", "n1", "", "startTime", "endTime", "t1", "Lcom/oplus/aiunit/vision/ek1;", "M", "Lcom/oplus/aiunit/vision/ek1;", "detailsCard", "Lcom/oplus/aiunit/vision/mk1;", "N", "Lcom/oplus/aiunit/vision/mk1;", "levelCard", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseWarningCard;", "O", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseWarningCard;", "warningCard", "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseWeekViewModel;", SecureGcmConstants.MESSAGE_KEY, "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseWeekViewModel;", "viewModel", "<init>", "()V", "Companion", "a", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class BloodGlucoseWeekFragment extends BloodGlucoseBaseFragment {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ek1 detailsCard;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public mk1 levelCard;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public BloodGlucoseWarningCard warningCard;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public BloodGlucoseWeekViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/blood/glucose/BloodGlucoseWeekFragment$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof TimeStampedCandleData) || BloodGlucoseWeekFragment.this.getContext() == null) {
                return "anything";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            TimeStampedCandleData timeStampedCandleData = (TimeStampedCandleData) data;
            int i = 0;
            if (!(timeStampedCandleData.getExpandStr().length() > 0)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Context context = BloodGlucoseWeekFragment.this.getContext();
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
                m8b.f("BloodGlucoseWeekFragment", "getContentLabel conversion exception");
            }
            Context context2 = BloodGlucoseWeekFragment.this.getContext();
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
                String strG = lo9.g(((TimeStampedData) data2).getTimestamp(), "yyyMMMd");
                Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
                return strG;
            }
            if (!(data instanceof TimeStampedCandleData)) {
                return "anything";
            }
            Object data3 = entry.getData();
            Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            String strG2 = lo9.g(((TimeStampedCandleData) data3).getTimestamp(), "yyyMMMd");
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

    public static final String o1(BloodGlucoseWeekFragment this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long unit = (long) (d * this$0.q0().getXAxisTimeUnit().getUnit());
        return pr8.INSTANCE.m(unit, System.currentTimeMillis()) <= 0 ? this$0.getString(com.heytap.health.base.R$string.lib_base_chart_today) : WeekStrUtils.c(unit);
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
        V0(new BloodGlucoseChartTouchListener(this, q0(), q0().getViewPortHandler().getMatrixTouch(), 3.0f, 0));
        GluCombineChart gluCombineChartQ0 = q0();
        gluCombineChartQ0.i(this);
        q0().setOnTouchListener((ChartTouchListener) t0());
        gluCombineChartQ0.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.uk1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodGlucoseWeekFragment.o1(this.a, i, d);
            }
        });
        gluCombineChartQ0.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.vk1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodGlucoseWeekFragment.p1(i, d);
            }
        });
        gluCombineChartQ0.setDrawZeroGridLine(true);
        gluCombineChartQ0.D(false, true);
        gluCombineChartQ0.getXAxis().setLabelCount(7, false);
        gluCombineChartQ0.setXAxisTimeUnit(TimeUnit.DAY);
        gluCombineChartQ0.getXAxis().setGranularity(1.0f);
        gluCombineChartQ0.getAxisRight().setAxisMinimum(0.0f);
        gluCombineChartQ0.getAxisRight().setAxisMaximum(10.0f);
        gluCombineChartQ0.setExtraOffsets(16.0f, 55.0f, 13.0f, 30.0f);
        gluCombineChartQ0.e(false, false, false, false);
        gluCombineChartQ0.setBarWidth2(0.47619048f);
        q0().setOnChartGestureListener(new k7h() { // from class: com.heytap.health.blood.glucose.BloodGlucoseWeekFragment$initChart$2
            @Override // com.oplus.aiunit.vision.k7h
            public void a(@NotNull ChartScrollState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (!this.a.getIsNotData() && state == ChartScrollState.IDLE) {
                    long lowestVisibleValueX = (long) ((this.a.q0().getLowestVisibleValueX() + ((double) this.a.q0().getBarWidth()) + ((double) this.a.q0().getExtraXAxisSpace())) * this.a.q0().getXAxisTimeUnit().getUnit());
                    long highestVisibleValueX = (long) (this.a.q0().getHighestVisibleValueX() * this.a.q0().getXAxisTimeUnit().getUnit());
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(lowestVisibleValueX);
                    pr8 pr8Var = pr8.INSTANCE;
                    long epochMilli = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().atStartOfDay().atZone(pr8Var.d()).toInstant().toEpochMilli();
                    long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(highestVisibleValueX), pr8Var.d()).toLocalDate().atStartOfDay().plusDays(1L).atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000);
                    m8b.f("BloodGlucoseWeekFragment", "chart gesture startTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", epochMilli)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", epochMilli2)));
                    if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() == epochMilli && this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String() == epochMilli2) {
                        return;
                    }
                    if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() > 0 && !this.a.getClickChangeDate()) {
                        if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() < epochMilli) {
                            this.a.z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseWeekFragment$initChart$2$onScrollStateChanged$1
                                @Override // p010kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 2).a("element", "周视图").b();
                                }
                            });
                        } else if (this.a.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String() > epochMilli) {
                            this.a.z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseWeekFragment$initChart$2$onScrollStateChanged$2
                                @Override // p010kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a("element", "周视图").b();
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
        LocalDateTime localDateTimeAtStartOfDay = date.with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay();
        pr8 pr8Var = pr8.INSTANCE;
        R0(localDateTimeAtStartOfDay.atZone(pr8Var.d()).toInstant().toEpochMilli());
        Q0(LocalDateTime.ofInstant(Instant.ofEpochMilli(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String()), pr8Var.d()).toLocalDate().atStartOfDay().plusDays(7L).atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000));
        q0().A((q0().getXAxisTimeUnit().timeStampToUnitDouble(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String()) - ((double) q0().getExtraXAxisSpace())) - ((double) (q0().getBarWidth() / 2)));
        String strY = pr8Var.y(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), "yyyy/MM/dd HH:mm:ss");
        String strY2 = pr8Var.y(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String(), "yyyy/MM/dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("onClickDateCallBack:Lowest:");
        sb.append(strY);
        sb.append("Highest:");
        sb.append(strY2);
        n1();
    }

    @Override // com.heytap.health.blood.glucose.BloodGlucoseBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initData() {
        BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel;
        w0().setVisibility(0);
        q0().setVisibility(4);
        O0(1546272000000L);
        N0(System.currentTimeMillis());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.viewModel = (BloodGlucoseWeekViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(BloodGlucoseWeekViewModel.class);
        if (z0().u5()) {
            BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel2 = this.viewModel;
            if (bloodGlucoseWeekViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                bloodGlucoseWeekViewModel2 = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanP7 = z0().p7();
            bloodGlucoseWeekViewModel2.B(familyMoreDataDetailConfigBeanP7 != null ? familyMoreDataDetailConfigBeanP7.getSsoid() : null);
            BloodGlucoseWarningCard bloodGlucoseWarningCard = this.warningCard;
            if (bloodGlucoseWarningCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("warningCard");
                bloodGlucoseWarningCard = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanP8 = z0().p7();
            bloodGlucoseWarningCard.u(familyMoreDataDetailConfigBeanP8 != null ? familyMoreDataDetailConfigBeanP8.getSsoid() : null);
        }
        BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel3 = this.viewModel;
        if (bloodGlucoseWeekViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseWeekViewModel3 = null;
        }
        bloodGlucoseWeekViewModel3.y().observe(requireActivity(), new c(new Function1<t88, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseWeekFragment.initData.1
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
                BloodGlucoseWeekFragment.this.Y0(t88Var);
                BloodGlucoseWeekFragment.this.O0(t88Var.getChartStartTime());
                BloodGlucoseWeekFragment.this.N0(t88Var.getChartEndTime());
                BloodGlucoseWeekFragment bloodGlucoseWeekFragment = BloodGlucoseWeekFragment.this;
                bloodGlucoseWeekFragment.R0(bloodGlucoseWeekFragment.x0() > 0 ? BloodGlucoseWeekFragment.this.x0() : t88Var.getChartLowestVisibleTime());
                BloodGlucoseWeekFragment bloodGlucoseWeekFragment2 = BloodGlucoseWeekFragment.this;
                bloodGlucoseWeekFragment2.Q0(bloodGlucoseWeekFragment2.x0() > 0 ? (BloodGlucoseWeekFragment.this.x0() + 604800000) - 1000 : t88Var.getChartHighestVisibleTime());
                BloodGlucoseWeekFragment.this.d1(t88Var.getIsShowNullChart());
                BloodGlucoseWeekFragment.this.q0().setVisibility(0);
                GluCombineChart gluCombineChartQ0 = BloodGlucoseWeekFragment.this.q0();
                BloodGlucoseWeekFragment bloodGlucoseWeekFragment3 = BloodGlucoseWeekFragment.this;
                float f = 2;
                gluCombineChartQ0.setExtraXAxisSpace((1 - gluCombineChartQ0.getBarWidth()) / f);
                gluCombineChartQ0.setTimeXAxisMinimum(t88Var.getChartStartTime());
                gluCombineChartQ0.setTimeXAxisMaximum(t88Var.getChartEndTime());
                gluCombineChartQ0.setVisibleXRange(6.0f, 6.0f);
                gluCombineChartQ0.A((bloodGlucoseWeekFragment3.q0().getXAxisTimeUnit().timeStampToUnitDouble(bloodGlucoseWeekFragment3.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String()) - ((double) gluCombineChartQ0.getExtraXAxisSpace())) - ((double) (gluCombineChartQ0.getBarWidth() / f)));
                gluCombineChartQ0.E(new ArrayList(), t88Var.e());
                gluCombineChartQ0.setVisibility(0);
                BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.CUSTOM_DP;
                gluCombineChartQ0.m(linePosition, 16.0f);
                gluCombineChartQ0.l(linePosition, 42.0f);
                gluCombineChartQ0.setGridLinePos(new float[]{jjk.a(gluCombineChartQ0.getContext(), 16.0f), qmg.f(gluCombineChartQ0.getContext()) - jjk.a(gluCombineChartQ0.getContext(), 43.0f)});
                BloodGlucoseWeekFragment.this.w0().setVisibility(8);
                BloodGlucoseWeekFragment.this.n1();
            }
        }));
        BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel4 = this.viewModel;
        if (bloodGlucoseWeekViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseWeekViewModel4 = null;
        }
        bloodGlucoseWeekViewModel4.z().observe(getViewLifecycleOwner(), new c(new Function1<List<? extends BloodSugarWarning>, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseWeekFragment.initData.2
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
                BloodGlucoseWarningCard bloodGlucoseWarningCard2 = BloodGlucoseWeekFragment.this.warningCard;
                if (bloodGlucoseWarningCard2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("warningCard");
                    bloodGlucoseWarningCard2 = null;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                bloodGlucoseWarningCard2.t(it, BloodGlucoseWeekFragment.this.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), BloodGlucoseWeekFragment.this.getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String());
            }
        }));
        BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel5 = this.viewModel;
        if (bloodGlucoseWeekViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseWeekViewModel = null;
        } else {
            bloodGlucoseWeekViewModel = bloodGlucoseWeekViewModel5;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lD7 = z0().D7();
        bloodGlucoseWeekViewModel.w(1546272000000L, jCurrentTimeMillis, lD7 != null ? lD7.longValue() : 0L);
    }

    @Override // com.heytap.health.blood.glucose.BloodGlucoseBaseFragment
    @NotNull
    public String j0(float moveToXvalue) {
        long xStart = (long) ((((double) moveToXvalue) + q0().getXStart() + ((double) q0().getBarWidth()) + ((double) q0().getExtraXAxisSpace())) * q0().getXAxisTimeUnit().getUnit());
        Instant instantOfEpochMilli = Instant.ofEpochMilli(xStart);
        pr8 pr8Var = pr8.INSTANCE;
        long epochMilli = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().atStartOfDay().plusDays(7L).atZone(pr8Var.d()).toInstant().toEpochMilli() - ((long) 1000);
        if (LocalDateTime.ofInstant(Instant.ofEpochMilli(xStart), pr8Var.d()).toLocalDate().getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), pr8Var.d()).toLocalDate().getYear()) {
            return pr8Var.y(xStart, "MMM-dd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + pr8Var.y(epochMilli, "MMM-dd");
        }
        return pr8Var.y(xStart, "yyy-MMM-dd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + pr8Var.y(epochMilli, "yyy-MMM-dd");
    }

    public final void n1() {
        BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel;
        mk1 mk1Var;
        t1(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String());
        if (getGluChartDataBean() != null) {
            BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel2 = this.viewModel;
            BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel3 = null;
            if (bloodGlucoseWeekViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                bloodGlucoseWeekViewModel = null;
            } else {
                bloodGlucoseWeekViewModel = bloodGlucoseWeekViewModel2;
            }
            long j2 = getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String();
            long j3 = getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String();
            t88 gluChartDataBean = getGluChartDataBean();
            Intrinsics.checkNotNull(gluChartDataBean);
            s88 s88VarX = bloodGlucoseWeekViewModel.x(j2, j3, gluChartDataBean.f());
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
            mk1Var.u(s88VarX, getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String(), 0);
            BloodGlucoseWarningCard bloodGlucoseWarningCard = this.warningCard;
            if (bloodGlucoseWarningCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("warningCard");
                bloodGlucoseWarningCard = null;
            }
            bloodGlucoseWarningCard.v(s88VarX.getWarningCounts());
            BloodGlucoseWeekViewModel bloodGlucoseWeekViewModel4 = this.viewModel;
            if (bloodGlucoseWeekViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                bloodGlucoseWeekViewModel3 = bloodGlucoseWeekViewModel4;
            }
            bloodGlucoseWeekViewModel3.A(getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME java.lang.String(), getCom.heytap.health.blood.glucose.BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME java.lang.String());
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
        if (LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).toLocalDate().getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), pr8Var.d()).toLocalDate().getYear()) {
            X0(startTime, endTime, pr8Var.y(startTime, "MMM-dd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + pr8Var.y(endTime, "MMM-dd"));
            return;
        }
        X0(startTime, endTime, pr8Var.y(startTime, "yyy-MMM-dd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + pr8Var.y(endTime, "yyy-MMM-dd"));
    }
}