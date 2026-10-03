package com.heytap.health.relax.ui;

import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.relax.bean.RelaxBarData;
import com.heytap.health.relax.bean.RelaxBean;
import com.heytap.health.relax.util.ChartType;
import com.heytap.health.relax.util.RelaxChartTouchListener;
import com.heytap.health.relax.view.RelaxBarChart;
import com.oplus.aiunit.vision.hpf;
import com.oplus.aiunit.vision.jqf;
import com.oplus.aiunit.vision.k7h;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.spf;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

/* JADX INFO: loaded from: classes17.dex */
public class RelaxYearFragment extends RelaxBaseFragment {
    public final Observer<Boolean> H = new Observer() { // from class: com.oplus.aiunit.vision.lqf
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.u0((Boolean) obj);
        }
    };

    public class a extends k7h {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.k7h
        public void a(@NonNull ChartScrollState chartScrollState) {
            RelaxYearFragment relaxYearFragment = RelaxYearFragment.this;
            if (!relaxYearFragment.E && chartScrollState == ChartScrollState.IDLE) {
                long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(RelaxYearFragment.this.s.get(Math.round((float) (relaxYearFragment.t.getLowestVisibleValueX() + ((double) RelaxYearFragment.this.t.getBarWidth())))).getTimestamp()), ZoneId.systemDefault()).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), ZoneId.systemDefault()).plusYears(1L).toLocalDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
                spf.c("RelaxBaseFragment", "chart gesture startTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", epochMilli)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", epochMilli2)));
                RelaxYearFragment relaxYearFragment2 = RelaxYearFragment.this;
                if (relaxYearFragment2.C == epochMilli && relaxYearFragment2.D == epochMilli2) {
                    return;
                }
                relaxYearFragment2.C = epochMilli;
                relaxYearFragment2.D = epochMilli2;
                float fT = relaxYearFragment2.t.T(epochMilli, epochMilli2);
                RelaxBarChart relaxBarChart = RelaxYearFragment.this.t;
                relaxBarChart.S(relaxBarChart.N(fT), true);
                RelaxYearFragment relaxYearFragment3 = RelaxYearFragment.this;
                relaxYearFragment3.p.I(relaxYearFragment3.r, 6, epochMilli, epochMilli2);
            }
        }
    }

    public class b extends ohb {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        public String a(Entry entry) {
            RelaxBarData relaxBarData = (RelaxBarData) entry.getData();
            if (relaxBarData == null) {
                return null;
            }
            return hpf.b(relaxBarData.getTotalDuration()).toString();
        }

        @Override // com.oplus.aiunit.vision.ohb
        public String b(Entry entry) {
            RelaxBarData relaxBarData = (RelaxBarData) entry.getData();
            if (relaxBarData == null) {
                return null;
            }
            return lo9.g(relaxBarData.getTimestamp(), o15.DATE_FORMAT_6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t0(int i, double d) {
        int i2 = (int) d;
        if (i2 < 0 || this.s.size() <= i2) {
            return "";
        }
        long timestamp = this.s.get(i2).getTimestamp();
        return i == 0 ? lo9.g(timestamp, "MMM") : String.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().getMonthValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(Boolean bool) {
        if (bool.booleanValue()) {
            spf.a("RelaxBaseFragment", "set data success");
            long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.B), ZoneId.systemDefault()).plusMonths(1L).toLocalDate().withDayOfMonth(1).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
            this.B = epochMilli;
            float fT = this.t.T(this.z, epochMilli);
            RelaxBarChart relaxBarChart = this.t;
            relaxBarChart.S(relaxBarChart.N(fT), true);
            j0(this.t.getXAxisTimeUnit().timeStampToUnitDouble(this.B));
        }
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment
    public long d0() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(this.B), ZoneId.systemDefault()).toLocalDate().minusMonths(11L).with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment
    public void e0() {
        this.t.setStyle(RelaxBarChart.Style.YEAR);
        this.t.setBarWidth(0.36630037f);
        this.t.setRadius(5.0f);
        this.t.setXAxisLabelCount(12);
        this.t.setYAxisValueFormatter(new jqf());
        this.t.setShowYAxisStartLine(true);
        this.t.setShowYAxisEndLine(true);
        this.t.getXAxis().setGranularity(1.0f);
        this.t.setExtraTopOffset(54.0f);
        this.t.setBarGradientColor(null);
        this.t.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.kqf
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return this.a.t0(i, d);
            }
        });
        RelaxBarChart relaxBarChart = this.t;
        RelaxBarChart relaxBarChart2 = this.t;
        relaxBarChart.setOnTouchListener((ChartTouchListener) new RelaxChartTouchListener(this, relaxBarChart2, relaxBarChart2.getViewPortHandler().getMatrixTouch(), 3.0f, 2));
        this.t.setOnChartGestureListener(new a());
        this.t.setMarker(new CommonMarkerView(requireActivity(), new b()));
        this.t.setHighlightPerTapEnabled(true);
        this.t.setHighlightPerDragEnabled(false);
        this.t.setVisibility(4);
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initData() {
        super.initData();
        this.t.getUpdateChartLiveData().observe(this, this.H);
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment
    public void k0() {
        this.p.J(this.q, 6, this.A, this.B, this.z, s0());
        this.p.I(this.r, 7, this.z, this.B);
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment
    public void p0(RelaxBean relaxBean) {
        this.E = true;
        if (!relaxBean.isShowEmptyChart()) {
            this.E = false;
        }
        this.s.clear();
        this.s.addAll(relaxBean.getDataList());
        this.t.setTimeXAxisMinimum(0.0d);
        this.t.setTimeXAxisMaximum(relaxBean.getDataList().size() - 1);
        this.t.setVisibleXRange(11.0f, 11.0f);
        this.t.setRelaxBarData(relaxBean.getDataList());
    }

    public ChartType s0() {
        return ChartType.YEAR;
    }
}