package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.heytap.health.core.widget.charts.data.HeartRateCandleEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class xwa extends CombinedData {
    public LineDataSet a;
    public CandleDataSet b;

    public CandleDataSet a() {
        return this.b;
    }

    public LineDataSet b() {
        return this.a;
    }

    public void c(CandleDataSet candleDataSet) {
        this.b = candleDataSet;
        setData(new CandleData(candleDataSet));
    }

    public void d(TimeUnit timeUnit, double d, List<czj> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            czj czjVar = list.get(i);
            arrayList.add(new HeartRateCandleEntry((float) (timeUnit.timeStampToUnitDouble(czjVar.h()) - d), czjVar.b(), czjVar.c(), czjVar.d(), czjVar.f(), czjVar.e(), czjVar.g(), czjVar));
        }
        c(new CandleDataSet(arrayList, ""));
    }

    public void e(List<CandleEntry> list) {
        c(new CandleDataSet(list, ""));
    }

    public void f(LineDataSet lineDataSet) {
        this.a = lineDataSet;
        setData(new LineData(lineDataSet));
    }

    public void g(TimeUnit timeUnit, double d, List<TimeStampedData> list, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            TimeStampedData timeStampedData = list.get(i);
            arrayList.add(new Entry((float) (timeUnit.timeStampToUnitDouble(timeStampedData.getTimestamp()) - d), timeStampedData.getY(), timeStampedData));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setCircleRadius(f);
        lineDataSet.setDrawCircleHole(false);
        f(lineDataSet);
    }

    public void h(List<Entry> list, float f) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setCircleRadius(f);
        lineDataSet.setDrawCircleHole(false);
        f(lineDataSet);
    }
}
