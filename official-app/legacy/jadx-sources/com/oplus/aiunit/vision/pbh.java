package com.oplus.aiunit.vision;

import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.heytap.health.core.widget.charts.data.SleepDailyEntry;

/* JADX INFO: loaded from: classes16.dex */
public class pbh extends BarBuffer {
    public pbh(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.BarBuffer, com.github.mikephil.charting.buffer.AbstractBuffer
    public void feed(IBarDataSet iBarDataSet) {
        float entryCount = iBarDataSet.getEntryCount() * this.phaseX;
        for (int i = 0; i < entryCount; i++) {
            SleepDailyEntry sleepDailyEntry = (SleepDailyEntry) iBarDataSet.getEntryForIndex(i);
            if (sleepDailyEntry != null) {
                float x = sleepDailyEntry.getX();
                addBar(x, sleepDailyEntry.getY(), sleepDailyEntry.getDuration() + x, sleepDailyEntry.getLowY());
            }
        }
        reset();
    }
}
