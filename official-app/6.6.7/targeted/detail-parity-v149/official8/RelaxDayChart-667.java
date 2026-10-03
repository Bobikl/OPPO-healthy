package com.heytap.health.relax.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.health_base.R$string;
import com.heytap.health.relax.R$id;
import com.heytap.health.relax.R$layout;
import com.heytap.health.relax.bean.RelaxBarData;
import com.heytap.health.relax.bean.RelaxDayBean;
import com.heytap.health.relax.view.RelaxDayChart;
import com.oplus.aiunit.vision.br8;
import com.oplus.aiunit.vision.hpf;
import com.oplus.aiunit.vision.jqf;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.spf;
import com.oplus.aiunit.vision.xp0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class RelaxDayChart extends ViewPager {
    public final List<RelaxDayBean> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f6319j;
    public Context k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayoutInflater f6320l;
    public final MutableLiveData<Boolean> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedList<View> f6321n;

    public class a extends PagerAdapter {
        public View a;

        /* JADX INFO: renamed from: com.heytap.health.relax.view.RelaxDayChart$a$a, reason: collision with other inner class name */
        public class C0536a {
            public View a;
            public final RelaxBarChart b;

            /* JADX INFO: renamed from: com.heytap.health.relax.view.RelaxDayChart$a$a$a, reason: collision with other inner class name */
            public class C0537a extends ohb {
                public C0537a() {
                }

                @Override // com.oplus.aiunit.vision.ohb
                public String a(Entry entry) {
                    RelaxBarData relaxBarData = (RelaxBarData) entry.getData();
                    if (relaxBarData == null) {
                        return null;
                    }
                    return RelaxDayChart.this.k.getString(R$string.health_base_minute, new BigDecimal(relaxBarData.getTotalDuration()).divide(new BigDecimal(60), 0, RoundingMode.HALF_UP).toString());
                }

                @Override // com.oplus.aiunit.vision.ohb
                public String b(Entry entry) {
                    return lo9.g(((RelaxBarData) entry.getData()).getTimestamp(), "MMMdd") + " " + hpf.a((int) entry.getX());
                }
            }

            public C0536a(View view) {
                this.a = view;
                this.b = (RelaxBarChart) view.findViewById(R$id.chart_health_relaxation_history_day_pager);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void d() {
                RelaxDayChart.this.getParent().requestDisallowInterceptTouchEvent(false);
            }

            public static /* synthetic */ String e(RelaxDayBean relaxDayBean, int i, double d) {
                if (i != 1) {
                    return hpf.a(i);
                }
                return lo9.g(relaxDayBean.getCurPageTimestamp(), "d") + " " + hpf.a(i);
            }

            public void c(final RelaxDayBean relaxDayBean) {
                this.b.setStyle(RelaxBarChart.Style.DAY);
                this.b.setBarWidth(0.2857143f);
                this.b.setXAxisMinimum(0.0f);
                this.b.setXAxisMaximum(8.0f);
                this.b.setRadius(5.0f);
                this.b.setXAxisLabelCount(9);
                this.b.setYAxisValueFormatter(new jqf());
                this.b.setYAxisMinimum(0.0f);
                this.b.setShowYAxisStartLine(true);
                this.b.setShowYAxisEndLine(true);
                this.b.setExtraTopOffset(54.0f);
                this.b.setHighlightFullBarEnabled(true);
                RelaxBarChart relaxBarChart = this.b;
                RelaxBarChart relaxBarChart2 = this.b;
                relaxBarChart.setOnTouchListener((ChartTouchListener) new sp8(relaxBarChart2, relaxBarChart2.getViewPortHandler().getMatrixTouch(), 3.0f, new br8() { // from class: com.oplus.aiunit.vision.xof
                    @Override // com.oplus.aiunit.vision.br8
                    public final void b() {
                        this.a.d();
                    }
                }));
                this.b.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.yof
                    @Override // com.oplus.aiunit.vision.xp0
                    public final String a(int i, double d) {
                        return RelaxDayChart.a.C0536a.e(relaxDayBean, i, d);
                    }
                });
                this.b.setMarker(new CommonMarkerView(RelaxDayChart.this.k, new C0537a()));
                this.b.setHighlightPerTapEnabled(true);
                this.b.setHighlightPerDragEnabled(false);
                if (relaxDayBean.isUndue()) {
                    this.b.setRelaxBarData(relaxDayBean.getUndueDataList());
                } else {
                    this.b.setRelaxBarData(relaxDayBean.getDataList());
                }
                if (this.b.getAxisRight().getAxisMaximum() != this.b.N(relaxDayBean.getYMaxValue())) {
                    this.b.S(relaxDayBean.getYMaxValue(), false);
                }
                spf.c("RelaxDayChart", "init day item chart end");
            }
        }

        public View a() {
            return this.a;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            View view = (View) obj;
            viewGroup.removeView(view);
            RelaxDayChart.this.f6321n.add(view);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return RelaxDayChart.this.i.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate;
            C0536a c0536a;
            if (RelaxDayChart.this.f6321n.isEmpty()) {
                viewInflate = RelaxDayChart.this.f6320l.inflate(R$layout.health_relax_activity_day_pager_content, (ViewGroup) null, false);
                c0536a = new C0536a(viewInflate);
                viewInflate.setTag(c0536a);
            } else {
                viewInflate = (View) RelaxDayChart.this.f6321n.removeFirst();
                c0536a = (C0536a) viewInflate.getTag();
            }
            c0536a.c((RelaxDayBean) RelaxDayChart.this.i.get(i));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
            this.a = (View) obj;
        }

        public a() {
        }
    }

    public RelaxDayChart(@NonNull Context context) {
        super(context);
        this.i = new ArrayList();
        this.m = new MutableLiveData<>();
        this.f6321n = new LinkedList<>();
        e(context);
    }

    public final void e(Context context) {
        this.k = context;
        this.f6320l = LayoutInflater.from(context);
        a aVar = new a();
        this.f6319j = aVar;
        setAdapter(aVar);
    }

    public List<RelaxDayBean> getData() {
        return this.i;
    }

    public MutableLiveData<Boolean> getUpdateChartLiveData() {
        return this.m;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View viewA;
        if (motionEvent.getAction() != 0 && (viewA = this.f6319j.a()) != null) {
            RelaxBarChart relaxBarChart = (RelaxBarChart) viewA.findViewById(R$id.chart_health_relaxation_history_day_pager);
            relaxBarChart.dispatchTouchEvent(motionEvent);
            if (relaxBarChart.getOnTouchListener().getTouchMode() == 10) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setData(List<RelaxDayBean> list) {
        this.i.clear();
        this.i.addAll(list);
        this.f6319j.notifyDataSetChanged();
        this.m.postValue(Boolean.TRUE);
    }

    public RelaxDayChart(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new ArrayList();
        this.m = new MutableLiveData<>();
        this.f6321n = new LinkedList<>();
        e(context);
    }
}