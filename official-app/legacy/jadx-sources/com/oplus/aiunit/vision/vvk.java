package com.oplus.aiunit.vision;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.utils.ObjectPool;

/* JADX INFO: loaded from: classes16.dex */
public abstract class vvk extends ObjectPool.Poolable implements Runnable {
    public final String i = "VerticalPortJob";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Chart f18013j;
    public float[] k;

    public vvk(Chart chart, float[] fArr) {
        this.f18013j = chart;
        this.k = fArr;
    }
}
