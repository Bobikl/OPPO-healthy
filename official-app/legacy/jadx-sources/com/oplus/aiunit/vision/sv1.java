package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.Entry;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class sv1 {
    public WeightBodyFat a;
    public List<Entry> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16763c;

    public List<Entry> a() {
        return this.b;
    }

    public WeightBodyFat b() {
        return this.a;
    }

    public float c() {
        return this.f16763c;
    }

    public void d(List<Entry> list) {
        this.b = list;
    }

    public void e(WeightBodyFat weightBodyFat) {
        this.a = weightBodyFat;
    }
}
