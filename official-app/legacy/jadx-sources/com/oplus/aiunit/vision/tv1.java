package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.Entry;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class tv1 {
    public List<WeightBodyFat> a = new ArrayList();
    public List<Entry> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Entry> f17163c = new ArrayList();
    public WeightBodyFat d;

    public WeightBodyFat a() {
        return this.d;
    }

    public List<Entry> b() {
        return this.b;
    }

    public List<Entry> c() {
        return this.f17163c;
    }

    public String toString() {
        return "ChartWeightBodyFatBean{weightBodyFatList=" + this.a.size() + ", highEntryList=" + this.b.size() + ", lowEntryList=" + this.f17163c.size() + '}';
    }
}
