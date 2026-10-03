package com.oplus.aiunit.vision;

import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.MPPointF;

/* JADX INFO: loaded from: classes16.dex */
public class u1l extends t1l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBarLineScatterCandleBubbleDataSet f17260c;
    public BarLineScatterCandleBubbleDataProvider d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MPPointF f17261e;
    public int a = -1;
    public int b = -1;
    public boolean f = false;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.oplus.aiunit.vision.t1l
    public MPPointF a() {
        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet;
        this.f17261e = MPPointF.getInstance();
        float y = -1.0f;
        if (this.d == null || (iBarLineScatterCandleBubbleDataSet = this.f17260c) == null || iBarLineScatterCandleBubbleDataSet.getEntryCount() < this.b) {
            MPPointF mPPointF = this.f17261e;
            mPPointF.x = -1.0f;
            mPPointF.y = -1.0f;
            return mPPointF;
        }
        int i = -1;
        for (int i2 = this.a; i2 <= this.b; i2++) {
            ?? entryForIndex = this.f17260c.getEntryForIndex(i2);
            if (c(entryForIndex.getX()) && entryForIndex.getY() > y) {
                y = entryForIndex.getY();
                i = i2;
            }
        }
        MPPointF mPPointF2 = this.f17261e;
        mPPointF2.x = i;
        mPPointF2.y = y;
        return mPPointF2;
    }

    public void b(int i, int i2, IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet, BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider) {
        this.d = barLineScatterCandleBubbleDataProvider;
        this.f17260c = iBarLineScatterCandleBubbleDataSet;
        this.a = i;
        this.b = i2;
        this.f = true;
    }

    public boolean c(float f) {
        return f >= this.d.getLowestVisibleX() && f <= this.d.getHighestVisibleX();
    }
}
