package com.heytap.health.main.wristtemperature;

import android.content.Context;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.core.provider.StepDataObserverManager;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.core.widget.charts.HealthTimeXBarChart;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.daily.R;
import com.heytap.health.homecard.constant.HomeCardDataEnum;
import com.heytap.health.main.bean.StepCardViewModel;
import com.heytap.health.main.wristtemperature.common.HealthBaseCard;
import com.heytap.health.main.wristtemperature.common.HealthCommonCardView;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.jxi;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.m07;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.u91;
import com.oplus.aiunit.vision.vxa;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public class StepCard extends HealthBaseCard implements LifecycleEventObserver {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public SportDataStat E;
    public long F;
    public jzi G;
    public StepCardViewModel H;
    public final List<HealthSingleBarEntry> I;
    public final Observer<String> J;
    public final Observer<List<HealthSingleBarEntry>> K;
    public final Observer<Boolean> L;
    public final Observer<Long> M;
    public final StepDataObserverManager.a N;
    public long z;

    public class a extends jzi {
        public a(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        public void b(@NonNull kzi kziVar) {
            m8b.f("StepCard", "prepareFetchData:" + ((u91) this).c);
            if (!f(((u91) this).c)) {
                StepCard.this.F = ((u91) this).c;
            }
            if (k()) {
                StepCard.this.A0();
                StepCard.this.m0();
            } else if (kziVar.b() == null || !(kziVar.b() instanceof SportDataStat)) {
                StepCard.this.B0(null);
            } else {
                StepCard.this.B0((SportDataStat) kziVar.b());
                StepCard.this.m0();
            }
            StepCard.this.S();
        }
    }

    public StepCard(@NonNull FragmentActivity fragmentActivity, MultiLayoutAdapter multiLayoutAdapter) {
        super(fragmentActivity, multiLayoutAdapter);
        this.A = 8000L;
        this.D = false;
        this.F = System.currentTimeMillis();
        this.I = new ArrayList();
        this.J = new Observer() { // from class: com.oplus.aiunit.vision.osi
            public final void onChanged(Object obj) {
                this.i.q0((String) obj);
            }
        };
        this.K = new Observer() { // from class: com.oplus.aiunit.vision.psi
            public final void onChanged(Object obj) {
                this.i.r0((List) obj);
            }
        };
        this.L = new Observer() { // from class: com.oplus.aiunit.vision.qsi
            public final void onChanged(Object obj) {
                this.i.s0((Boolean) obj);
            }
        };
        this.M = new Observer() { // from class: com.oplus.aiunit.vision.rsi
            public final void onChanged(Object obj) {
                this.i.t0((Long) obj);
            }
        };
        this.N = new StepDataObserverManager.a() { // from class: com.oplus.aiunit.vision.ssi
            public final void a() {
                this.a.u0();
            }
        };
        if (this.l != null) {
            vxa.c(fragmentActivity.getLifecycle(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(String str) {
        m8b.f("StepCard", "step goal: " + str);
        this.A = str != null ? Long.parseLong(str) : 8000L;
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("step detail size: ");
        Objects.requireNonNull(list);
        sb.append(list.size());
        m8b.f("StepCard", sb.toString());
        this.I.clear();
        this.I.addAll(list);
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(Boolean bool) {
        m8b.f("StepCard", "is have history data: " + bool);
        this.D = bool.booleanValue();
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(Long l) {
        m8b.f("StepCard", "todayStepObserver ");
        this.B = l.longValue();
        A0();
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        A0();
        S();
        m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(View view) {
        p0();
    }

    public final void A0() {
        long j = SportDataAdapter.G(this.k).getLong("step");
        this.z = j;
        long j2 = this.B;
        if (j < j2) {
            this.z = j2;
        }
    }

    public void B0(SportDataStat sportDataStat) {
        this.E = sportDataStat;
        long totalSteps = sportDataStat != null ? sportDataStat.getTotalSteps() : 0L;
        this.z = totalSteps;
        this.C = totalSteps;
        this.A = sportDataStat != null ? sportDataStat.getCurrentDayStepsGoal() : 0L;
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void L(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        super.L(viewHolder, i, context);
        long j = this.F;
        if (j <= 0 || j > System.currentTimeMillis() + 31536000000L) {
            this.F = System.currentTimeMillis();
        }
        HealthCommonCardView healthCommonCardView = this.t;
        int i2 = R.string.health_daily_step_count;
        healthCommonCardView.setDataModel(context.getString(i2));
        this.t.setIcon(com.heytap.health.health.impl.R.drawable.health_icon_step);
        if (!w0()) {
            x0(this.t, this.z);
            return;
        }
        this.t.setDataModel(context.getString(i2));
        View viewX = x(com.heytap.health.health.impl.R.layout.health_common_daily_step_card);
        this.t.g(null, -1L);
        n0((HealthTimeXBarChart) viewX.findViewById(com.heytap.health.health.impl.R.id.step_health_bar_chart));
        y0(viewX, this.z, this.A);
        this.t.n.setTextSize(22.0f);
        this.t.setDataContent(String.valueOf(this.z));
        this.t.setDataContent2(context.getResources().getQuantityString(com.heytap.health.health.impl.R.plurals.health_days_step_num, (int) this.z));
        this.t.setDataNotice(context.getString(com.heytap.health.base.R.string.lib_base_chart_today));
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void R() {
        m8b.f("StepCard", "refresh start! canRefresh is ");
        o0();
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void T() {
        super.T();
        FragmentActivity fragmentActivity = this.k;
        if (fragmentActivity != null) {
            fragmentActivity.getLifecycle().removeObserver(this);
            StepDataObserverManager.INSTANCE.removeListener(this.N);
        }
        StepCardViewModel stepCardViewModel = this.H;
        if (stepCardViewModel != null) {
            stepCardViewModel.E().removeObserver(this.J);
            this.H.A().removeObserver(this.K);
            this.H.B().removeObserver(this.L);
            this.H.F().removeObserver(this.M);
        }
        jzi jziVar = this.G;
        if (jziVar != null) {
            jziVar.o();
        }
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void V() {
        super.V();
        o0();
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void X(Context context) {
        p0();
    }

    public final void m0() {
        if (this.H == null) {
            this.H = (StepCardViewModel) new ViewModelProvider(this.k).get(StepCardViewModel.class);
        }
        this.H.E().removeObserver(this.J);
        this.H.A().removeObserver(this.K);
        this.H.F().removeObserver(this.M);
        this.H.B().removeObserver(this.L);
        this.H.E().observe(this.k, this.J);
        this.H.A().observe(this.k, this.K);
        this.H.F().observe(this.k, this.M);
        this.H.B().observe(this.k, this.L);
        LocalDate localDate = Instant.ofEpochMilli(this.F).atZone(ZoneId.systemDefault()).toLocalDate();
        this.H.y(localDate, localDate.plusDays(1L));
        this.H.C();
        this.H.G();
        this.H.z(localDate, localDate.plusDays(1L));
    }

    public final void n0(HealthTimeXBarChart healthTimeXBarChart) {
        healthTimeXBarChart.setForceRadiusHalfBarWidth(true);
        healthTimeXBarChart.setBarWidth(0.6363636f);
        healthTimeXBarChart.setXAxisMinimum(0.0f);
        healthTimeXBarChart.setXAxisMaximum(23.0f);
        healthTimeXBarChart.getXAxis().setGranularity(1.0f);
        healthTimeXBarChart.getXAxis().setLabelCount(24, false);
        healthTimeXBarChart.getXAxis().setEnabled(false);
        healthTimeXBarChart.getAxisRight().setEnabled(false);
        healthTimeXBarChart.getAxisLeft().setEnabled(false);
        healthTimeXBarChart.setOnTouchListener((ChartTouchListener) null);
        healthTimeXBarChart.t();
        healthTimeXBarChart.setDrawAllBarShadow(false);
        healthTimeXBarChart.setDrawBarShadow(true);
        healthTimeXBarChart.setYAxisMinimum(0.0f);
        healthTimeXBarChart.e(true);
        healthTimeXBarChart.n(1.0f, 1.0f, 1.0f, 1.0f);
        healthTimeXBarChart.setEntryList(this.I);
        healthTimeXBarChart.getData().getDataSetByIndex(0).setBarShadowColor(healthTimeXBarChart.getContext().getColor(com.heytap.health.health.impl.R.color.health_card_bar_chart_bg));
    }

    public final void o0() {
        if (this.G == null) {
            this.G = new a(this.k);
        }
        this.G.h(jxi.class);
    }

    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        StringBuilder sb = new StringBuilder();
        sb.append("onStateChanged :");
        sb.append(event);
        if (event == Lifecycle.Event.ON_RESUME) {
            StepDataObserverManager.INSTANCE.addListener(this.N);
        } else if (event == Lifecycle.Event.ON_STOP) {
            StepDataObserverManager.INSTANCE.removeListener(this.N);
        }
    }

    public final void p0() {
        SportDataStat sportDataStat;
        A0();
        if (this.z >= this.A) {
            fdg.x("step_card_details_stat").T("home_punch_btn_status", System.currentTimeMillis());
        }
        if (this.z <= 0 && this.C > 0 && (sportDataStat = this.E) != null) {
            this.z = sportDataStat.getTotalSteps();
            this.A = this.E.getCurrentDayStepsGoal();
        }
        Postcard postcardB = e1.d().b("/step/StepHistoryActivity");
        if (com.heytap.health.base.resposiveui.config.a.m(this.k).q().getValue() == NearUIConfig.Status.UNFOLD) {
            postcardB.withInt("step", (int) this.z).withString("date", String.valueOf(pr8.INSTANCE.e(this.F))).withInt("stepGoal", (int) this.A).navigation(this.k);
            return;
        }
        ActivityOptionsCompat activityOptionsCompatD = ActivityTransitionUtil.d(this.k, this.t);
        if (activityOptionsCompatD != null) {
            postcardB.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatD.toBundle()));
        }
        postcardB.withString("CUS_TRANSITION_NAME", this.t.getTransitionName()).withInt("step", (int) this.z).withInt("stepGoal", (int) this.A).withString("date", String.valueOf(pr8.INSTANCE.e(this.F))).navigation(this.k);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public HomeCardDataEnum.DataType t() {
        return HomeCardDataEnum.DataType.STEP;
    }

    public final boolean w0() {
        return this.D || this.z > 0 || this.B > 0 || this.C > 0;
    }

    public final void x0(View view, long j) {
        this.t.f(view.getContext().getString(R.string.health_daily_step_count), view.getContext().getString(com.heytap.health.health.impl.R.string.health_step_no_data_content), view.getContext().getString(i7k.I() ? com.heytap.health.health_base.R.string.health_base_go_to_authorize : com.heytap.health.health_base.R.string.health_base_common_card_empty));
        this.t.setIcon(com.heytap.health.health.impl.R.drawable.health_icon_step);
        this.t.l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nsi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.i.v0(view2);
            }
        });
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public HomeCardDataEnum.CardUiMode y() {
        return HomeCardDataEnum.CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }

    public final void y0(View view, long j, long j2) {
        z0(view);
        ((TextView) view.findViewById(com.heytap.health.health.impl.R.id.step_number)).setText(this.t.getResources().getQuantityString(com.heytap.health.health.impl.R.plurals.health_step_goal_card_desc, (int) j2, Long.valueOf(j2)));
        ComposeView composeViewFindViewById = view.findViewById(com.heytap.health.health.impl.R.id.progress_compose_view);
        long j3 = this.z;
        long j4 = this.A;
        int i = com.heytap.health.health.impl.R.color.health_step_progress_bg;
        StepCardComposeBridge.a(composeViewFindViewById, j3, j4, i, i);
    }

    public final void z0(View view) {
        int i = com.heytap.health.health.impl.R.id.step_number;
        view.findViewById(i).setVisibility(0);
        if (m07.k()) {
            view.findViewById(com.heytap.health.health.impl.R.id.progress_compose_view).setVisibility(8);
            view.findViewById(i).setVisibility(8);
            view.findViewById(com.heytap.health.health.impl.R.id.step_health_bar_chart).setVisibility(0);
        } else {
            view.findViewById(com.heytap.health.health.impl.R.id.step_health_bar_chart).setVisibility(8);
            view.findViewById(com.heytap.health.health.impl.R.id.progress_compose_view).setVisibility(0);
            view.findViewById(i).setVisibility(0);
        }
    }
}