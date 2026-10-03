package com.heytap.health.sleep.formula;

import android.text.format.DateFormat;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.snore.HrvData;
import com.heytap.health.sleep.formula.formula.OsaHrvBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lza;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreHrvBeanV2 extends OsaHrvBean {
    private static final String TAG = "SnoreHrvBeanV2";
    private long firstDataTime;
    private long lastDataTime;

    public SnoreHrvBeanV2(List<HrvData> list) {
        this.firstDataTime = 0L;
        this.lastDataTime = 0L;
        StringBuilder sb = new StringBuilder();
        sb.append("Before conversion:");
        sb.append(list.size());
        if (lza.a(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        long startTimestamp = 0;
        for (int i = 0; i < list.size(); i++) {
            HrvData hrvData = list.get(i);
            if (hrvData.getHrvValue() >= 16448) {
                if (this.firstDataTime == 0) {
                    this.firstDataTime = hrvData.getStartTimestamp();
                    startTimestamp = hrvData.getStartTimestamp();
                    arrayList.add(Integer.valueOf(hrvData.getHrvValue()));
                } else {
                    int startTimestamp2 = (int) ((hrvData.getStartTimestamp() - startTimestamp) / 60000);
                    if (startTimestamp2 >= 1) {
                        startTimestamp += ((long) startTimestamp2) * 60000;
                        for (int i2 = 0; i2 < startTimestamp2 - 1; i2++) {
                            arrayList.add(0);
                        }
                        arrayList.add(Integer.valueOf(hrvData.getHrvValue()));
                    }
                }
            }
        }
        long j2 = this.firstDataTime;
        if (j2 > 0) {
            this.lastDataTime = j2 + (((long) arrayList.size()) * 60000);
            this.hrvStartUnix = this.firstDataTime / 1000;
            int size = arrayList.size();
            this.hrvBuffLen = size;
            this.hrvMinBuff = new int[size];
            for (int i3 = 0; i3 < this.hrvBuffLen; i3++) {
                this.hrvMinBuff[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            a7b.f(TAG, "result:" + toString());
        }
    }

    public long getFirstDataTime() {
        return this.firstDataTime;
    }

    public long getLastDataTime() {
        return this.lastDataTime;
    }

    public void setFirstDataTime(long j2) {
        this.firstDataTime = j2;
    }

    public void setLastDataTime(long j2) {
        this.lastDataTime = j2;
    }

    @NonNull
    public String toString() {
        return "SnoreHrvBeanV2{firstDataTime=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.firstDataTime)) + ", lastDataTime=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.lastDataTime)) + ", hrvBuffLen=" + this.hrvBuffLen + '}';
    }
}
