package com.heytap.health.relax.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.databaseengine.model.relax.RelaxStat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.health.relax.R$id;
import com.heytap.health.relax.R$layout;
import com.heytap.health.relax.bean.RelaxBarData;
import com.heytap.health.relax.bean.RelaxBean;
import com.heytap.health.relax.view.RelaxBarChart;
import com.heytap.health.relax.viewModel.RelaxHistoryViewModel;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.hpf;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.spf;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class RelaxBaseFragment extends BaseFragment {
    public long A;
    public long B;
    public long C;
    public long D;
    public RelaxHistoryViewModel p;
    public RelaxBarChart t;
    public LinearLayout u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public long z;
    public final String o = "RelaxBaseFragment";
    public OLiveData<RelaxBean> q = new OLiveData<>();
    public OLiveData<List<RelaxStat>> r = new OLiveData<>();
    public List<RelaxBarData> s = new ArrayList();
    public boolean E = true;
    public final Observer<RelaxBean> F = new Observer() { // from class: com.oplus.aiunit.vision.lof
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.p0((RelaxBean) obj);
        }
    };
    public final Observer<List<RelaxStat>> G = new Observer() { // from class: com.oplus.aiunit.vision.mof
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.n0((List) obj);
        }
    };

    public class a extends jzi {
        public a(BaseFragment baseFragment) {
            super(baseFragment);
        }

        @Override // com.oplus.aiunit.vision.u91
        public void b(@NonNull kzi kziVar) {
            spf.c("RelaxBaseFragment", "prepareFetchData:" + this.f18736c);
            if (f(this.f18736c)) {
                RelaxBaseFragment.this.B = LocalDateTime.of(LocalDate.now(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            } else {
                RelaxBaseFragment.this.B = LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f18736c), ZoneId.systemDefault()).toLocalDate(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            }
            RelaxBaseFragment relaxBaseFragment = RelaxBaseFragment.this;
            relaxBaseFragment.z = relaxBaseFragment.d0();
            RelaxBaseFragment.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(double d) {
        this.t.H(d);
    }

    public abstract long d0();

    public abstract void e0();

    public final void f0() {
        new a(this).p(DataModel.LAST).h(gqf.class);
    }

    public final void g0() {
        this.p = (RelaxHistoryViewModel) new ViewModelProvider(this).get(RelaxHistoryViewModel.class);
        this.q.observe(this, this.F);
        this.r.observe(this, this.G);
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_relax_fragment_base;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        f0();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(View view) {
        g0();
        this.t = (RelaxBarChart) W(R$id.chart_health_relax_history_base);
        this.u = (LinearLayout) W(R$id.loading_health_relax_history_base);
        this.v = (TextView) W(R$id.tv_health_relax_times_content);
        this.w = (TextView) W(R$id.tv_health_relax_duration_content);
        this.x = (TextView) W(R$id.tv_health_relax_meditation_content);
        this.y = (TextView) W(R$id.tv_health_relax_breath_content);
        e0();
    }

    public void j0(final double d) {
        spf.a("RelaxBaseFragment", "moveToDataXDelayed x = " + d);
        this.t.setVisibility(0);
        this.u.setVisibility(8);
        this.t.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.nof
            @Override // java.lang.Runnable
            public final void run() {
                this.i.h0(d);
            }
        }, 100L);
    }

    public abstract void k0();

    public void n0(List<RelaxStat> list) {
        int totalCounts = 0;
        if (list.isEmpty()) {
            spf.b("RelaxBaseFragment", "relaxStatList is empty");
            this.v.setText(hpf.g(0));
            this.w.setText(hpf.b(0L));
            this.y.setText(hpf.c(0L, 0));
            this.x.setText(hpf.c(0L, 0));
            return;
        }
        int totalCounts2 = 0;
        long totalDuration = 0;
        long totalDuration2 = 0;
        long totalDuration3 = 0;
        int totalCounts3 = 0;
        for (RelaxStat relaxStat : list) {
            totalDuration2 += relaxStat.getTotalDuration();
            totalCounts3 += relaxStat.getTotalCounts();
            if (relaxStat.getType() == 1) {
                totalDuration3 += relaxStat.getTotalDuration();
                totalCounts += relaxStat.getTotalCounts();
            } else if (relaxStat.getType() == 2) {
                totalDuration += relaxStat.getTotalDuration();
                totalCounts2 += relaxStat.getTotalCounts();
            }
        }
        this.y.setText(hpf.c(totalDuration3, totalCounts));
        this.x.setText(hpf.c(totalDuration, totalCounts2));
        this.v.setText(hpf.g(totalCounts3));
        this.w.setText(hpf.b(totalDuration2));
    }

    public abstract void p0(RelaxBean relaxBean);
}