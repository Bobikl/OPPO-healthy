package com.heytap.health.heartrate.view;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.HeartRateCandleEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;
import com.heytap.health.heartrate.R$string;
import com.heytap.health.heartrate.ui.HeartRateDayHorizontalActivity;
import com.heytap.health.heartrate.utils.ChartType;
import com.heytap.health.heartrate.view.HeartRateDayView;
import com.oplus.aiunit.vision.br8;
import com.oplus.aiunit.vision.e3k;
import com.oplus.aiunit.vision.g59;
import com.oplus.aiunit.vision.gg8;
import com.oplus.aiunit.vision.h59;
import com.oplus.aiunit.vision.iig;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.rp8;
import com.oplus.aiunit.vision.xp0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateDayView extends ViewPager {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Fragment f5741j;
    public LayoutInflater k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f5742l;
    public List<h59> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f5743n;
    public String o;
    public ChartType p;

    public class a extends PagerAdapter {
        public final LinkedList<View> a;
        public final Map<Integer, View> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5744c;

        /* JADX INFO: renamed from: com.heytap.health.heartrate.view.HeartRateDayView$a$a, reason: collision with other inner class name */
        public class C0455a {
            public TextView a;
            public TextView b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f5745c;
            public TextView d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public HeartRateDayChart f5746e;
            public ImageView f;

            /* JADX INFO: renamed from: com.heytap.health.heartrate.view.HeartRateDayView$a$a$a, reason: collision with other inner class name */
            public class C0456a extends ohb {
                public final Map<Object, String> a = new HashMap();
                public final /* synthetic */ String b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f5747c;

                public C0456a(String str, String str2) {
                    this.b = str;
                    this.f5747c = str2;
                }

                @Override // com.oplus.aiunit.vision.ohb
                public String a(Entry entry) {
                    if (entry == null) {
                        return null;
                    }
                    if (!(entry instanceof HeartRateCandleEntry)) {
                        return String.format(this.f5747c, Integer.valueOf((int) entry.getY()));
                    }
                    HeartRateCandleEntry heartRateCandleEntry = (HeartRateCandleEntry) entry;
                    return String.format(this.b, Integer.valueOf((int) heartRateCandleEntry.getLow()), Integer.valueOf((int) heartRateCandleEntry.getHigh()));
                }

                @Override // com.oplus.aiunit.vision.ohb
                public String b(Entry entry) {
                    String strG = this.a.get(entry.getData());
                    if (!TextUtils.isEmpty(strG)) {
                        return strG;
                    }
                    if (entry.getData() instanceof TimeStampedData) {
                        strG = lo9.g(((TimeStampedData) entry.getData()).getTimestamp(), o15.DATE_FORMAT_HOUR);
                    } else if (entry.getData() instanceof e3k) {
                        e3k e3kVar = (e3k) entry.getData();
                        strG = lo9.g(e3kVar.h(), o15.DATE_FORMAT_HOUR) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(e3kVar.a(), o15.DATE_FORMAT_HOUR);
                    }
                    this.a.put(entry.getData(), strG);
                    return strG;
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.heartrate.view.HeartRateDayView$a$a$b */
            public class b implements OnChartValueSelectedListener {
                public b() {
                }

                @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                public void onNothingSelected() {
                    C0455a.this.a.setAlpha(1.0f);
                    C0455a.this.f5745c.setAlpha(1.0f);
                    C0455a.this.d.setAlpha(1.0f);
                    C0455a.this.b.setAlpha(1.0f);
                }

                @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                public void onValueSelected(Entry entry, Highlight highlight) {
                    if (entry == null || entry.getY() <= 0.0f) {
                        return;
                    }
                    C0455a.this.a.setAlpha(0.0f);
                    C0455a.this.f5745c.setAlpha(0.0f);
                    C0455a.this.d.setAlpha(0.0f);
                    C0455a.this.b.setAlpha(0.0f);
                }
            }

            public C0455a(View view) {
                this.a = (TextView) view.findViewById(R$id.tv_heart_rate_title);
                this.b = (TextView) view.findViewById(R$id.tv_no_data);
                this.f5745c = (TextView) view.findViewById(R$id.tv_heart_rate_range);
                this.d = (TextView) view.findViewById(R$id.tv_heart_rate_unit);
                this.f5746e = (HeartRateDayChart) view.findViewById(R$id.line_candle_chart);
                this.f = (ImageView) view.findViewById(R$id.iv_full_screen);
            }

            public static /* synthetic */ String g(int i, double d) {
                return String.valueOf(i * 6);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void h() {
                if (this.f5746e.getRendererXAxis() instanceof oya) {
                    ((oya) this.f5746e.getRendererXAxis()).e(new float[]{0.0f, this.f5746e.getWidth() - qmg.a(this.f5746e.getContext(), 34.0f)});
                }
            }

            public static /* synthetic */ String i(int i, double d) {
                return String.format(Locale.getDefault(), "%.0f", Double.valueOf(d));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void j() {
                HeartRateDayView.this.getParent().requestDisallowInterceptTouchEvent(false);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void k(h59 h59Var, View view) {
                HeartRateDayHorizontalActivity.F7(HeartRateDayView.this.i, h59Var.j(), HeartRateDayView.this.o);
            }

            public void f(final h59 h59Var) {
                this.f5746e.i(HeartRateDayView.this.f5741j);
                this.f5746e.setXAxisTimeUnit(TimeUnit.MINUTE);
                this.f5746e.setCandleRadius(2.0f);
                CommonMarkerView commonMarkerView = new CommonMarkerView(this.f5746e.getContext(), new C0456a(HeartRateDayView.this.getContext().getString(R$string.health_heart_rate_charts_marker_content_format), HeartRateDayView.this.getContext().getString(R$string.health_heart_rate_charts_line_marker_content_format)));
                this.f5746e.setMarker(commonMarkerView);
                commonMarkerView.setChartView(this.f5746e);
                this.f5746e.t();
                HeartRateDayChart heartRateDayChart = this.f5746e;
                float f = iig.WINDOW_NIGHT_END;
                heartRateDayChart.G(3.0f, f);
                this.f5746e.setHighlightPerTapEnabled(true);
                this.f5746e.setHighlightPerDragEnabled(false);
                this.f5746e.setXAxisLabelCount(5);
                this.f5746e.getXAxis().setGranularity(108.0f);
                this.f5746e.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.o59
                    @Override // com.oplus.aiunit.vision.xp0
                    public final String a(int i, double d) {
                        return HeartRateDayView.a.C0455a.g(i, d);
                    }
                });
                if (h59Var.c() == 0.0f || h59Var.d() == 0.0f || h59Var.c() < h59Var.d()) {
                    this.f5746e.setYAxisRightValues(HeartRateDayView.this.f5743n);
                } else {
                    this.f5746e.N((int) h59Var.d(), (int) h59Var.c());
                }
                this.f5746e.d(true);
                this.f5746e.p(0.0f, 84.0f, 34.0f, 40.0f);
                this.f5746e.g();
                HeartRateDayChart heartRateDayChart2 = this.f5746e;
                BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.CUSTOM_DP;
                heartRateDayChart2.m(linePosition, 0.0f);
                this.f5746e.l(linePosition, 26.0f);
                this.f5746e.getAxisRight().setXOffset(12.0f);
                this.f5746e.getXAxis().setYOffset(8.0f);
                this.f5746e.getXAxis().setDrawAxisLine(true);
                this.f5746e.getXAxis().setAxisLineWidth(0.6f);
                this.f5746e.getXAxis().setAxisLineDashedLine(new DashPathEffect(new float[]{qmg.a(this.f5746e.getContext(), 3.0f), qmg.a(this.f5746e.getContext(), 3.0f)}, 0.0f));
                this.f5746e.getAxisRight().setAxisLineDashedLine(new DashPathEffect(new float[]{qmg.a(this.f5746e.getContext(), 3.0f), qmg.a(this.f5746e.getContext(), 3.0f)}, 0.0f));
                this.f5746e.getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{qmg.a(this.f5746e.getContext(), 3.0f), qmg.a(this.f5746e.getContext(), 3.0f)}, 0.0f));
                this.f5746e.getAxisRight().setGridLineWidth(0.6f);
                if (this.f5746e.getRendererRightYAxis() instanceof BaseYAxisRenderer) {
                    ((BaseYAxisRenderer) this.f5746e.getRendererRightYAxis()).D(true);
                }
                if (this.f5746e.getRendererRightYAxis() instanceof nya) {
                    ((nya) this.f5746e.getRendererRightYAxis()).G(true);
                    this.f5746e.setShowYAxisStartLine(true);
                }
                this.f5746e.post(new Runnable() { // from class: com.oplus.aiunit.vision.p59
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.h();
                    }
                });
                this.f5746e.getAxisRight().setLabelCount(3, true);
                this.f5746e.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.q59
                    @Override // com.oplus.aiunit.vision.xp0
                    public final String a(int i, double d) {
                        return HeartRateDayView.a.C0455a.i(i, d);
                    }
                });
                this.f5746e.setForceLabelMultipleOfGranularity(true);
                this.f5746e.setTimeXAxisMinimum(h59Var.j());
                this.f5746e.setTimeXAxisMaximum(h59Var.e());
                this.f5746e.setVisibleXRange(f, f);
                HeartRateDayChart heartRateDayChart3 = this.f5746e;
                HeartRateDayChart heartRateDayChart4 = this.f5746e;
                heartRateDayChart3.setOnTouchListener((ChartTouchListener) new rp8(heartRateDayChart4, heartRateDayChart4.getViewPortHandler().getMatrixTouch(), 3.0f, new br8() { // from class: com.oplus.aiunit.vision.r59
                    @Override // com.oplus.aiunit.vision.br8
                    public final void b() {
                        this.a.j();
                    }
                }));
                if (h59Var.isUndue()) {
                    this.f5746e.H(h59Var.n(), h59Var.m(), true);
                } else {
                    this.f5746e.H(h59Var.l(), h59Var.k(), true);
                }
                this.f5746e.P();
                if (HeartRateDayView.this.p == ChartType.LINE) {
                    this.f5746e.K(true, false);
                } else {
                    this.f5746e.K(false, true);
                }
                this.f5746e.setOnChartValueSelectedListener(new b());
                this.f5746e.highlightValue((Highlight) null, true);
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.s59
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.i.k(h59Var, view);
                    }
                });
                g59 g59VarF = h59Var.f();
                if (g59VarF == null || g59VarF.g() <= 0 || g59VarF.f() <= 0) {
                    this.b.setVisibility(0);
                    this.f5745c.setVisibility(8);
                    this.d.setVisibility(8);
                    return;
                }
                this.f5745c.setText(g59VarF.g() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + g59VarF.f());
                this.f5745c.setVisibility(0);
                this.d.setVisibility(0);
                this.b.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void g(int i) {
            HeartRateDayChart heartRateDayChart;
            View viewF = f(i);
            StringBuilder sb = new StringBuilder();
            sb.append("animateByPosition position is ");
            sb.append(i);
            sb.append(" view is ");
            sb.append(viewF);
            if (viewF == null || (heartRateDayChart = (HeartRateDayChart) viewF.findViewById(R$id.line_candle_chart)) == null) {
                return;
            }
            heartRateDayChart.b();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, @NonNull Object obj) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.a.add(view);
            this.b.remove(Integer.valueOf(i));
        }

        public HeartRateDayChart e() {
            View view = this.b.get(Integer.valueOf(this.f5744c));
            if (view != null) {
                return (HeartRateDayChart) view.findViewById(R$id.line_candle_chart);
            }
            return null;
        }

        public final View f(int i) {
            return this.b.get(Integer.valueOf(i));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return HeartRateDayView.this.m.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        public final void h(final int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("pageSelected position is ");
            sb.append(i);
            if (this.f5744c < 0) {
                ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.n59
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.g(i);
                    }
                }, 30L);
            } else {
                g(i);
            }
            if (this.f5744c != i) {
                i();
            }
            this.f5744c = i;
        }

        public final void i() {
            HeartRateDayChart heartRateDayChartE = e();
            if (heartRateDayChartE != null) {
                heartRateDayChartE.P();
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            View viewRemoveFirst;
            C0455a c0455a;
            StringBuilder sb = new StringBuilder();
            sb.append("instantiateItem position is ");
            sb.append(i);
            sb.append(" cache size is ");
            sb.append(this.a.size());
            if (this.a.size() == 0) {
                viewRemoveFirst = HeartRateDayView.this.k.inflate(R$layout.health_heart_rate_day_view_chart, (ViewGroup) null);
                c0455a = new C0455a(viewRemoveFirst);
                viewRemoveFirst.setTag(c0455a);
            } else {
                viewRemoveFirst = this.a.removeFirst();
                c0455a = (C0455a) viewRemoveFirst.getTag();
            }
            c0455a.f((h59) HeartRateDayView.this.m.get(i));
            this.b.put(Integer.valueOf(i), viewRemoveFirst);
            viewGroup.addView(viewRemoveFirst);
            return viewRemoveFirst;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        public a() {
            this.a = new LinkedList<>();
            this.b = new HashMap();
            this.f5744c = -1;
        }
    }

    public HeartRateDayView(@NonNull Context context) {
        super(context);
        this.k = null;
        this.m = new ArrayList();
        this.f5743n = new float[]{40.0f, 80.0f, 120.0f};
        this.p = ChartType.BAR;
        j(context);
    }

    public List<h59> getData() {
        return this.m;
    }

    public void h() {
        HeartRateDayChart heartRateDayChartE = this.f5742l.e();
        StringBuilder sb = new StringBuilder();
        sb.append("animatePage chart is ");
        sb.append(heartRateDayChartE);
        if (heartRateDayChartE != null) {
            heartRateDayChartE.b();
        }
    }

    public void i(ChartType chartType) {
        this.p = chartType;
        this.f5742l.notifyDataSetChanged();
    }

    public final void j(Context context) {
        this.i = context;
        this.k = LayoutInflater.from(context);
        a aVar = new a();
        this.f5742l = aVar;
        setAdapter(aVar);
    }

    public void k(int i) {
        this.f5742l.h(i);
    }

    public void l() {
        this.f5742l.i();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e2) {
            gg8.b("HeartRateDayView", e2.toString());
            return false;
        }
    }

    public void setData(List<h59> list) {
        this.m = list;
        this.f5742l.notifyDataSetChanged();
    }

    public void setFragment(Fragment fragment) {
        this.f5741j = fragment;
    }

    public void setSsoid(String str) {
        this.o = str;
    }

    public HeartRateDayView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = null;
        this.m = new ArrayList();
        this.f5743n = new float[]{40.0f, 80.0f, 120.0f};
        this.p = ChartType.BAR;
        j(context);
    }
}