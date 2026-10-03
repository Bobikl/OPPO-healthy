package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.heytap.health.core.widget.charts.data.SleepDailyEntry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rbh extends BarDataSet {
    public rbh(List<BarEntry> list, String str) {
        super(list, str);
    }

    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<BarEntry> getEntriesForXValue(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.mValues.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            SleepDailyEntry sleepDailyEntry = (SleepDailyEntry) this.mValues.get(i2);
            if (f >= sleepDailyEntry.getX() && f < sleepDailyEntry.getX() + sleepDailyEntry.getDuration()) {
                while (i2 > 0) {
                    SleepDailyEntry sleepDailyEntry2 = (SleepDailyEntry) this.mValues.get(i2 - 1);
                    if (f < sleepDailyEntry2.getX() || f >= sleepDailyEntry2.getX() + sleepDailyEntry2.getDuration()) {
                        break;
                    }
                    i2--;
                }
                int size2 = this.mValues.size();
                while (i2 < size2) {
                    SleepDailyEntry sleepDailyEntry3 = (SleepDailyEntry) this.mValues.get(i2);
                    if (f < sleepDailyEntry3.getX() || f >= sleepDailyEntry3.getX() + sleepDailyEntry3.getDuration()) {
                        break;
                    }
                    arrayList.add(sleepDailyEntry3);
                    i2++;
                }
                break;
            }
            if (f >= sleepDailyEntry.getX() + sleepDailyEntry.getDuration()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(float f, float f2, DataSet.Rounding rounding) {
        int i;
        Entry entry;
        float x;
        List<T> list = this.mValues;
        if (list == 0 || list.isEmpty()) {
            return -1;
        }
        int size = this.mValues.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            SleepDailyEntry sleepDailyEntry = (SleepDailyEntry) this.mValues.get(i3);
            int i4 = i3 + 1;
            SleepDailyEntry sleepDailyEntry2 = (SleepDailyEntry) this.mValues.get(i4);
            float x2 = 0.0f;
            if (f < sleepDailyEntry.getX()) {
                x = sleepDailyEntry.getX() - f;
            } else {
                x = f < sleepDailyEntry.getX() + sleepDailyEntry.getDuration() ? 0.0f : (sleepDailyEntry.getX() + sleepDailyEntry.getDuration()) - f;
            }
            if (f < sleepDailyEntry2.getX()) {
                x2 = sleepDailyEntry2.getX() - f;
            } else if (f >= sleepDailyEntry2.getX() + sleepDailyEntry2.getDuration()) {
                x2 = (sleepDailyEntry2.getX() + sleepDailyEntry2.getDuration()) - f;
            }
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(x2);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = x;
                    if (d <= 0.0d) {
                        if (d <= 0.0d) {
                        }
                    }
                }
                size = i3;
            }
            i2 = i4;
        }
        if (size == -1) {
            return size;
        }
        SleepDailyEntry sleepDailyEntry3 = (SleepDailyEntry) this.mValues.get(size);
        float x3 = sleepDailyEntry3.getX();
        if (rounding == DataSet.Rounding.UP) {
            if (sleepDailyEntry3.getDuration() + x3 < f && size < this.mValues.size() - 1) {
                size++;
            }
        } else if (rounding == DataSet.Rounding.DOWN && x3 > f && size > 0) {
            size--;
        }
        if (Float.isNaN(f2)) {
            return size;
        }
        while (size > 0 && ((BarEntry) this.mValues.get(size - 1)).getX() == x3) {
            size--;
        }
        float y = ((BarEntry) this.mValues.get(size)).getY();
        loop2: while (true) {
            i = size;
            do {
                size++;
                if (size >= this.mValues.size()) {
                    break loop2;
                }
                entry = (Entry) this.mValues.get(size);
                if (entry.getX() != x3) {
                    break loop2;
                }
            } while (Math.abs(entry.getY() - f2) >= Math.abs(y - f2));
            y = f2;
        }
        return i;
    }
}
