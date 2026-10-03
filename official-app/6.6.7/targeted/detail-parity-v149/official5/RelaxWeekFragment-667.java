package com.heytap.health.relax.ui;

import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.health.base.R$string;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.relax.bean.RelaxBarData;
import com.heytap.health.relax.bean.RelaxBean;
import com.heytap.health.relax.util.ChartType;
import com.heytap.health.relax.util.RelaxChartTouchListener;
import com.heytap.health.relax.view.RelaxBarChart;
import com.oplus.aiunit.vision.hpf;
import com.oplus.aiunit.vision.jqf;
import com.oplus.aiunit.vision.k7h;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.spf;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: loaded from: classes17.dex */
public class RelaxWeekFragment extends RelaxBaseFragment {
    public final Observer<Boolean> H = new Observer() { // from class: com.oplus.aiunit.vision.hqf
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
            RelaxWeekFragment relaxWeekFragment = RelaxWeekFragment.this;
            if (!relaxWeekFragment.E && chartScrollState == ChartScrollState.IDLE) {
                long lowestVisibleValueX = (long) ((relaxWeekFragment.t.getLowestVisibleValueX() + ((double) RelaxWeekFragment.this.t.getBarWidth())) * RelaxWeekFragment.this.t.getXAxisTimeUnit().getUnit());
                long highestVisibleValueX = (long) (RelaxWeekFragment.this.t.getHighestVisibleValueX() * RelaxWeekFragment.this.t.getXAxisTimeUnit().getUnit());
                long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(lowestVisibleValueX), ZoneId.systemDefault()).toLocalDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(highestVisibleValueX), ZoneId.systemDefault()).toLocalDate().atStartOfDay().plusDays(1L).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
                spf.c("RelaxBaseFragment", "chart gesture startTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", epochMilli)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", epochMilli2)));
                RelaxWeekFragment relaxWeekFragment2 = RelaxWeekFragment.this;
                if (relaxWeekFragment2.C == epochMilli && relaxWeekFragment2.D == epochMilli2) {
                    return;
                }
                relaxWeekFragment2.C = epochMilli;
                relaxWeekFragment2.D = epochMilli2;
                float fT = relaxWeekFragment2.t.T(epochMilli, epochMilli2);
                RelaxBarChart relaxBarChart = RelaxWeekFragment.this.t;
                relaxBarChart.S(relaxBarChart.N(fT), true);
                RelaxWeekFragment relaxWeekFragment3 = RelaxWeekFragment.this;
                relaxWeekFragment3.p.I(relaxWeekFragment3.r, 5, epochMilli, epochMilli2);
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
            return lo9.g(relaxBarData.getTimestamp(), "yyyyMMMd");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t0(int i, double d) {
        long unit = (long) (d * this.t.getXAxisTimeUnit().getUnit());
        return lo9.d(unit, System.currentTimeMillis()) ? getString(R$string.lib_base_chart_today) : lo9.c(requireActivity(), unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(Boolean bool) {
        if (bool.booleanValue()) {
            spf.a("RelaxBaseFragment", "set data success");
            float fT = this.t.T(this.z, this.B);
            RelaxBarChart relaxBarChart = this.t;
            relaxBarChart.S(relaxBarChart.N(fT), true);
            j0(this.t.getXAxisTimeUnit().timeStampToUnitDouble(this.B));
        }
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment
    public long d0() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(this.B), ZoneId.systemDefault()).toLocalDate().minusDays(6L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment
    public void e0() {
        this.t.setStyle(RelaxBarChart.Style.WEEK);
        this.t.setXAxisTimeUnit(TimeUnit.DAY);
        this.t.setBarWidth(0.2f);
        this.t.setRadius(5.0f);
        this.t.setXAxisLabelCount(7);
        this.t.setYAxisValueFormatter(new jqf());
        this.t.setShowYAxisStartLine(true);
        this.t.setShowYAxisEndLine(true);
        this.t.getXAxis().setGranularity(1.0f);
        this.t.setExtraTopOffset(54.0f);
        this.t.setHighlightFullBarEnabled(true);
        this.t.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.iqf
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return this.a.t0(i, d);
            }
        });
        RelaxBarChart relaxBarChart = this.t;
        RelaxBarChart relaxBarChart2 = this.t;
        relaxBarChart.setOnTouchListener((ChartTouchListener) new RelaxChartTouchListener(this, relaxBarChart2, relaxBarChart2.getViewPortHandler().getMatrixTouch(), 3.0f, 0));
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
        this.p.J(this.q, 4, this.A, this.B, this.z, s0());
        this.p.I(this.r, 5, this.z, this.B);
    }

    @Override // com.heytap.health.relax.ui.RelaxBaseFragment
    public void p0(RelaxBean relaxBean) {
        this.E = true;
        if (!relaxBean.isShowEmptyChart()) {
            this.E = false;
        }
        this.s.clear();
        this.s.addAll(relaxBean.getDataList());
        RelaxBarChart relaxBarChart = this.t;
        relaxBarChart.setTimeXAxisMinimum(relaxBarChart.getXAxisTimeUnit().timeStampToUnitDouble(relaxBean.getChartStartTime()));
        RelaxBarChart relaxBarChart2 = this.t;
        relaxBarChart2.setTimeXAxisMaximum(relaxBarChart2.getXAxisTimeUnit().timeStampToUnitDouble(this.B));
        RelaxBarChart relaxBarChart3 = this.t;
        relaxBarChart3.H(relaxBarChart3.getXAxisTimeUnit().timeStampToUnitDouble(this.B));
        this.t.setVisibleXRange(6.0f, 6.0f);
        this.t.setRelaxBarData(relaxBean.getDataList());
    }

    public ChartType s0() {
        return ChartType.WEEK;
    }
}