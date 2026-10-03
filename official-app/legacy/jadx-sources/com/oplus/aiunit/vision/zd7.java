package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class zd7 extends BarDataSet {
    public zd7(List<BarEntry> list, String str) {
        super(list, str);
    }

    public final void a() {
        List<T> values = getValues();
        for (int i = 0; i < values.size(); i++) {
            ((BarEntry) values.get(i)).setVals(new float[]{((BarEntry) values.get(i)).getYVals()[0], ((BarEntry) values.get(i)).getYVals()[1] - ((BarEntry) values.get(i)).getYVals()[0]});
        }
        setValues(values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMin() {
        float f = ((BarEntry) getEntryForIndex(0)).getYVals()[0];
        for (int i = 0; i < getEntryCount(); i++) {
            if (((BarEntry) getEntryForIndex(i)).getYVals()[0] < f) {
                f = ((BarEntry) getEntryForIndex(i)).getYVals()[0];
            }
        }
        return f;
    }

    public zd7(List<BarEntry> list) {
        this(list, "");
        a();
    }
}
