package com.heytap.health.relax.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.MutableLiveData;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.heytap.health.core.widget.charts.HealthTimeXBarChart;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.renderer.BaseBarChartRenderer;
import com.heytap.health.relax.R$array;
import com.heytap.health.relax.bean.RelaxBarData;
import com.heytap.health.relax.view.RelaxBarChart;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.p30;
import com.oplus.aiunit.vision.sed;
import com.oplus.aiunit.vision.spf;
import com.oplus.aiunit.vision.tdd;
import com.oplus.aiunit.vision.wv8;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class RelaxBarChart extends HealthTimeXBarChart {
    public final MutableLiveData<Boolean> Q;
    public Style R;

    public enum Style {
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public RelaxBarChart(Context context) {
        super(context);
        this.Q = new MutableLiveData<>();
        this.R = Style.DAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(List list, tdd tddVar) throws Throwable {
        tddVar.onNext(M(list));
        tddVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(List list, List list2) throws Throwable {
        setRelaxEntryData(list2);
        this.Q.postValue(Boolean.TRUE);
        if (this.R == Style.DAY) {
            long timestamp = ((RelaxBarData) list.get(0)).getTimestamp();
            T(timestamp, 86400000 + timestamp);
        }
    }

    public static /* synthetic */ void R(Throwable th) throws Throwable {
        spf.c("RelaxBarChart", "setRelaxBarData failed, " + th.toString());
    }

    private void setRelaxEntryData(List<BarEntry> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        BarDataSet barDataSet = new BarDataSet(new ArrayList(list), "Relax bar chart");
        barDataSet.setColors(getResources().getIntArray(R$array.health_relax_color_array));
        barDataSet.setDrawValues(false);
        barDataSet.setHighLightAlpha(0);
        barDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        ArrayList arrayList = new ArrayList();
        arrayList.add(barDataSet);
        BarData barData = new BarData(arrayList);
        barData.setBarWidth(this.C);
        setData(barData);
        invalidate();
    }

    @Override // com.heytap.health.core.widget.charts.HealthTimeXBarChart
    public List<HealthSingleBarEntry> F(List<TimeStampedData> list) {
        return new ArrayList();
    }

    public final float[] L(long... jArr) {
        float[] fArr = new float[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            fArr[i] = new BigDecimal(jArr[i]).divide(new BigDecimal(60), 0, RoundingMode.HALF_UP).divide(new BigDecimal(60), 4, RoundingMode.HALF_UP).floatValue();
        }
        return fArr;
    }

    public final List<BarEntry> M(List<RelaxBarData> list) {
        if (list == null || list.isEmpty()) {
            clear();
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            RelaxBarData relaxBarData = list.get(i);
            Style style = this.R;
            arrayList.add(style == Style.DAY ? new BarEntry((i * 2) + 1, L(relaxBarData.getMeditation(), relaxBarData.getBreath()), relaxBarData) : style == Style.YEAR ? new BarEntry(i, L(relaxBarData.getMeditation(), relaxBarData.getBreath()), relaxBarData) : new BarEntry((float) (this.J.timeStampToUnitDouble(relaxBarData.getTimestamp()) - this.O), L(relaxBarData.getMeditation(), relaxBarData.getBreath()), relaxBarData));
        }
        return arrayList;
    }

    public float N(float f) {
        if (f <= 0.2f) {
            return 0.2f;
        }
        if (f <= 0.4f) {
            return 0.4f;
        }
        if (f <= 0.8f) {
            return 0.8f;
        }
        if (f <= 1.0f) {
            return 1.0f;
        }
        if (f <= 2.0f) {
            return 2.0f;
        }
        if (f <= 3.0f) {
            return 3.0f;
        }
        if (f <= 4.0f) {
            return 4.0f;
        }
        if (f <= 6.0f) {
            return 6.0f;
        }
        return f <= 10.0f ? 10.0f : 18.0f;
    }

    public final float[] O(float f) {
        return new float[]{0.0f, 0.2f * f, 0.4f * f, 0.6f * f, 0.8f * f, f};
    }

    public void S(float f, boolean z) {
        float[] fArrO;
        if (f <= 0.2f) {
            fArrO = new float[]{0.0f, 0.1f, 0.2f};
        } else if (f <= 0.4f) {
            fArrO = new float[]{0.0f, 0.1f, 0.2f, 0.3f, 0.4f};
        } else if (f <= 0.8f) {
            fArrO = new float[]{0.0f, 0.2f, 0.4f, 0.6f, 0.8f};
        } else if (f <= 1.0f) {
            fArrO = O(1.0f);
        } else if (f <= 2.0f) {
            fArrO = O(2.0f);
        } else if (f <= 3.0f) {
            fArrO = O(3.0f);
        } else if (f <= 4.0f) {
            fArrO = O(4.0f);
        } else if (f <= 6.0f) {
            fArrO = O(6.0f);
        } else if (f <= 8.0f) {
            fArrO = O(8.0f);
        } else if (f <= 16.0f) {
            fArrO = O(16.0f);
        } else if (f <= 24.0f) {
            fArrO = O(24.0f);
        } else if (f <= 36.0f) {
            fArrO = O(36.0f);
        } else {
            fArrO = f <= 48.0f ? O(48.0f) : O(new BigDecimal(f + 1.0f).setScale(0, RoundingMode.HALF_UP).floatValue());
        }
        o(fArrO, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float T(long j2, long j3) {
        BarDataSet barDataSet;
        if (j2 < j3 && ((BarData) getData()).getDataSets() != null && !((BarData) getData()).getDataSets().isEmpty()) {
            if ((((BarData) getData()).getDataSets().get(0) instanceof BarDataSet) && (barDataSet = (BarDataSet) ((BarData) getData()).getDataSets().get(0)) != null && barDataSet.getEntryCount() > 0) {
                long j4 = 0;
                if (((BarEntry) barDataSet.getEntryForIndex(0)).getData() instanceof RelaxBarData) {
                    int i = 0;
                    long totalDuration = 0;
                    for (int i2 = 0; i2 < barDataSet.getEntryCount(); i2++) {
                        RelaxBarData relaxBarData = (RelaxBarData) ((BarEntry) barDataSet.getEntryForIndex(i2)).getData();
                        if (relaxBarData.getTimestamp() >= j2 && relaxBarData.getTimestamp() <= j3 && relaxBarData.getTotalDuration() > totalDuration) {
                            totalDuration = relaxBarData.getTotalDuration();
                            i = i2;
                        }
                    }
                    if (totalDuration > 0) {
                        setSelected(i);
                    }
                    j4 = totalDuration;
                }
                return (j4 * 1000.0f) / 3600000.0f;
            }
        }
        return 0.0f;
    }

    public MutableLiveData<Boolean> getUpdateChartLiveData() {
        return this.Q;
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart, com.heytap.health.core.widget.charts.ControllableOffsetBarChart, com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new BaseBarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.heytap.health.core.widget.charts.HealthTimeXBarChart, com.heytap.health.core.widget.charts.HealthBarChart
    public void r() {
        super.r();
        setHighlightFullBarEnabled(true);
    }

    @Override // com.heytap.health.core.widget.charts.HealthTimeXBarChart, com.heytap.health.core.widget.charts.HealthBarChart
    public void setBarData(List<TimeStampedData> list) {
    }

    public void setRelaxBarData(final List<RelaxBarData> list) {
        ddd.w(new sed() { // from class: com.oplus.aiunit.vision.iof
            @Override // com.oplus.aiunit.vision.sed
            public final void a(tdd tddVar) throws Throwable {
                this.a.P(list, tddVar);
            }
        }).K0(wv8.f()).n0(p30.c()).b(new b24() { // from class: com.oplus.aiunit.vision.jof
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) throws Throwable {
                this.i.Q(list, (List) obj);
            }
        }, new b24() { // from class: com.oplus.aiunit.vision.kof
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) throws Throwable {
                RelaxBarChart.R((Throwable) obj);
            }
        });
    }

    public void setStyle(Style style) {
        this.R = style;
    }

    public RelaxBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = new MutableLiveData<>();
        this.R = Style.DAY;
    }

    public RelaxBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q = new MutableLiveData<>();
        this.R = Style.DAY;
    }
}