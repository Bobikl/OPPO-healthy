package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.heytap.health.core.widget.charts.data.SleepDailyEntry;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class nbh extends CombinedData {
    public LineDataSet a;
    public LineDataSet b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rbh f14432c;

    public LineDataSet a() {
        return this.a;
    }

    public final float b(SleepUnitData sleepUnitData, float[] fArr) {
        if (sleepUnitData == null) {
            return 1.0f;
        }
        int type = sleepUnitData.getType();
        if (type == 1) {
            return fArr[1];
        }
        if (type == 2) {
            return fArr[3];
        }
        if (type == 3) {
            return fArr[5];
        }
        if (type != 4) {
            return 1.0f;
        }
        return fArr[7];
    }

    public final float c(SleepUnitData sleepUnitData, float[] fArr) {
        if (sleepUnitData == null) {
            return 0.0f;
        }
        int type = sleepUnitData.getType();
        if (type == 1) {
            return fArr[0];
        }
        if (type == 2) {
            return fArr[2];
        }
        if (type == 3) {
            return fArr[4];
        }
        if (type != 4) {
            return 0.0f;
        }
        return fArr[6];
    }

    public rbh d() {
        return this.f14432c;
    }

    public LineDataSet e() {
        return this.b;
    }

    public void f(@NonNull List<TimeStampedData> list, @NonNull List<TimeStampedData> list2, TimeUnit timeUnit, double d) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            TimeStampedData timeStampedData = list.get(i);
            arrayList.add(new Entry((float) (timeUnit.timeStampToUnitDouble(timeStampedData.getTimestamp()) - d), timeStampedData.getY(), timeStampedData));
        }
        this.a = new LineDataSet(arrayList, "");
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            TimeStampedData timeStampedData2 = list2.get(i2);
            arrayList2.add(new Entry((float) (timeUnit.timeStampToUnitDouble(timeStampedData2.getTimestamp()) - d), timeStampedData2.getY(), timeStampedData2));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList2, "");
        this.b = lineDataSet;
        setData(new LineData(this.a, lineDataSet));
    }

    public void g(List<SleepUnitData> list, double d, TimeUnit timeUnit, float[] fArr) {
        if (fArr == null || fArr.length < 8) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SleepUnitData sleepUnitData = list.get(i);
            arrayList.add(new SleepDailyEntry((float) (timeUnit.timeStampToUnitDouble(sleepUnitData.getTimestamp()) - d), (float) (sleepUnitData.getDuration() / timeUnit.getUnit()), c(sleepUnitData, fArr), b(sleepUnitData, fArr), sleepUnitData));
        }
        rbh rbhVar = new rbh(arrayList, "Sleep daily chart");
        this.f14432c = rbhVar;
        setData(new BarData(rbhVar));
    }
}
