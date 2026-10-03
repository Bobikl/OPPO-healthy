package com.heytap.health.relax.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.heytap.databaseengine.model.relax.Relax;
import com.heytap.databaseengine.model.relax.RelaxStat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.health.relax.R$id;
import com.heytap.health.relax.R$layout;
import com.heytap.health.relax.R$string;
import com.heytap.health.relax.bean.RelaxDayBean;
import com.heytap.health.relax.view.RelaxDayChart;
import com.heytap.health.relax.viewModel.RelaxHistoryViewModel;
import com.oplus.aiunit.vision.dr8;
import com.oplus.aiunit.vision.gpf;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.hpf;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.spf;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class RelaxDayFragment extends BaseFragment {
    public RelaxHistoryViewModel o;
    public RelaxDayChart p;
    public RelativeLayout q;
    public gpf r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public TextView v;
    public RecyclerView w;
    public c x;
    public long y;
    public final Observer<List<RelaxDayBean>> z = new Observer() { // from class: com.oplus.aiunit.vision.bpf
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.w0((List) obj);
        }
    };
    public final Observer<List<RelaxStat>> A = new Observer() { // from class: com.oplus.aiunit.vision.cpf
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.x0((List) obj);
        }
    };
    public final Observer<List<Relax>> B = new Observer() { // from class: com.oplus.aiunit.vision.dpf
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.y0((List) obj);
        }
    };
    public final Observer<Boolean> C = new Observer() { // from class: com.oplus.aiunit.vision.epf
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.z0((Boolean) obj);
        }
    };

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            spf.c("RelaxDayFragment", "chart onPageSelected: " + i);
            RelaxDayFragment.this.r.g(i, RelaxDayFragment.this.p.getData().get(RelaxDayFragment.this.p.getCurrentItem()).getDataList().get(0).getTimestamp());
            long j2 = RelaxDayFragment.this.y + (((long) i) * 86400000);
            long j3 = (86400000 + j2) - 1000;
            RelaxDayFragment.this.o.G(j2, j3);
            RelaxDayFragment.this.o.H(j2, j3);
        }
    }

    public class b extends jzi {
        public b(BaseFragment baseFragment) {
            super(baseFragment);
        }

        @Override // com.oplus.aiunit.vision.u91
        public void b(@NonNull kzi kziVar) {
            spf.c("RelaxDayFragment", "prepareFetchData:" + this.f18736c);
            if (!f(this.f18736c)) {
                RelaxDayFragment.this.r.l(this.f18736c);
                RelaxDayFragment.this.s0();
                return;
            }
            ArrayList arrayList = new ArrayList();
            RelaxDayBean relaxDayBean = new RelaxDayBean();
            relaxDayBean.insertCurTimeEmptyData(o15.q(System.currentTimeMillis()), o15.l(System.currentTimeMillis()));
            arrayList.add(relaxDayBean);
            RelaxDayFragment.this.A0(arrayList);
            RelaxDayFragment.this.p.setVisibility(0);
            RelaxDayFragment.this.s.setVisibility(8);
        }
    }

    public static class c extends RecyclerView.Adapter<a> {
        public List<Relax> i;

        public static class a extends RecyclerView.ViewHolder {
            public final TextView i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final TextView f6318j;
            public final TextView k;

            public a(@NonNull View view) {
                super(view);
                this.i = (TextView) view.findViewById(R$id.tv_health_relaxation_day_item_heart_rate);
                this.f6318j = (TextView) view.findViewById(R$id.tv_health_relaxation_day_item_name);
                this.k = (TextView) view.findViewById(R$id.tv_health_relaxation_day_item_stress);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull a aVar, int i) {
            Context context = aVar.i.getContext();
            Relax relax = this.i.get(i);
            String strG = lo9.g(relax.getStartTimestamp(), o15.DATE_FORMAT_HOUR);
            if (relax.getMaxHeartRate() <= 0) {
                aVar.i.setText(context.getString(R$string.health_relax_detail_item_time, strG, "- -"));
            } else {
                aVar.i.setText(context.getString(R$string.health_relax_detail_item_time, strG, String.format(Locale.getDefault(), "%d-%d", Integer.valueOf(Math.max(relax.getMinHeartRate(), 0)), Integer.valueOf(Math.max(relax.getMaxHeartRate(), 0)))));
            }
            aVar.f6318j.setText(hpf.f(relax.getType(), relax.getSubType()));
            if (relax.getType() != 3) {
                if (relax.getPhysicalMental() != null && relax.getPhysicalMental().intValue() > 0) {
                    aVar.k.setText(context.getString(R$string.health_relax_physical_mental_value, String.valueOf(relax.getPhysicalMental())));
                } else if (relax.getStressValue() <= 0) {
                    aVar.k.setText("");
                } else {
                    aVar.k.setText(context.getString(R$string.health_relax_stress_value, String.valueOf(relax.getStressValue())));
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.health_relax_view_day_detail_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.i.size();
        }

        public void setDataList(List<Relax> list) {
            this.i = list;
            notifyDataSetChanged();
        }

        public c() {
            this.i = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(long j2, long j3) {
        this.y = j2;
        this.p.setVisibility(4);
        this.s.setVisibility(0);
        this.o.F(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(List list) {
        A0(this.r.n(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(List list) {
        if (list.isEmpty()) {
            spf.c("RelaxDayFragment", "day stat is empty");
            this.t.setText(getString(R$string.health_relax_total_times_empty));
            this.u.setText(getString(R$string.health_relax_total_minute_empty));
        } else {
            RelaxStat relaxStat = (RelaxStat) list.get(0);
            this.t.setText(hpf.g(relaxStat.getTotalCounts()));
            this.u.setText(hpf.b(relaxStat.getTotalDuration()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(List list) {
        if (list.isEmpty()) {
            this.v.setVisibility(8);
            this.w.setVisibility(8);
        } else {
            this.v.setVisibility(0);
            this.w.setVisibility(0);
        }
        this.x.setDataList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(Boolean bool) {
        this.p.setVisibility(0);
        this.s.setVisibility(8);
        this.q.setVisibility(0);
    }

    public final void A0(List<RelaxDayBean> list) {
        this.p.setData(list);
        this.p.setCurrentItem(this.r.e(), false);
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_relax_fragment_day;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        if (getArguments() != null && getArguments().containsKey("date")) {
            try {
                long jA = o15.a(Integer.parseInt(getArguments().getString("date")));
                if (jA > 0) {
                    this.r.l(jA);
                    s0();
                    return;
                }
            } catch (Exception e2) {
                spf.b("RelaxDayFragment", "parse jump_date error: " + e2.getMessage());
            }
        }
        t0();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(View view) {
        u0();
        this.p = (RelaxDayChart) W(R$id.chart_health_relax_history_day);
        this.q = (RelativeLayout) W(R$id.rl_health_relax_day_chart_notes);
        this.s = (LinearLayout) W(R$id.loading_health_relax_day);
        this.t = (TextView) W(R$id.tv_health_relax_times_content);
        this.u = (TextView) W(R$id.tv_health_relax_duration_content);
        this.v = (TextView) W(R$id.tv_health_relax_day_detail_title);
        this.w = (RecyclerView) W(R$id.rv_health_relax_day);
        gpf gpfVar = new gpf(0, System.currentTimeMillis(), new dr8() { // from class: com.oplus.aiunit.vision.apf
            @Override // com.oplus.aiunit.vision.dr8
            public final void a(long j2, long j3) {
                this.a.v0(j2, j3);
            }
        });
        this.r = gpfVar;
        gpfVar.o(3);
        this.p.getUpdateChartLiveData().observe(this, this.C);
        this.p.addOnPageChangeListener(new a());
        this.w.setLayoutManager(new LinearLayoutManager(getContext()));
        c cVar = new c();
        this.x = cVar;
        this.w.setAdapter(cVar);
    }

    public final void s0() {
        if (System.currentTimeMillis() >= 1546272000000L) {
            this.r.k(1546272000000L, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        RelaxDayBean relaxDayBean = new RelaxDayBean();
        relaxDayBean.insertCurTimeEmptyData(o15.q(System.currentTimeMillis()), o15.l(System.currentTimeMillis()));
        arrayList.add(relaxDayBean);
        A0(arrayList);
        this.p.setVisibility(0);
        this.s.setVisibility(8);
    }

    public final void t0() {
        new b(this).p(DataModel.LAST).h(gqf.class);
    }

    public final void u0() {
        RelaxHistoryViewModel relaxHistoryViewModel = (RelaxHistoryViewModel) new ViewModelProvider(this).get(RelaxHistoryViewModel.class);
        this.o = relaxHistoryViewModel;
        relaxHistoryViewModel.K().observe(this, this.z);
        this.o.L().observe(this, this.A);
        this.o.M().observe(this, this.B);
    }
}