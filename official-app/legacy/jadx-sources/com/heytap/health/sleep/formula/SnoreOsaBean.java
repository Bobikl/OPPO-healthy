package com.heytap.health.sleep.formula;

import android.text.format.DateFormat;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.snore.SensorOsaData;
import com.heytap.health.sleep.formula.formula.OsaSensorBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreOsaBean extends OsaSensorBean {
    private static final String TAG = "SnoreOsaBean";
    private long firstDataTime;
    private long lastDataTime;

    public SnoreOsaBean(List<SensorOsaData> list) {
        this.firstDataTime = 0L;
        this.lastDataTime = 0L;
        StringBuilder sb = new StringBuilder();
        sb.append("Before conversion:");
        sb.append(list.size());
        if (lza.a(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        long dataTimestamp = 0;
        for (int i = 0; i < list.size(); i++) {
            SensorOsaData sensorOsaData = list.get(i);
            if (this.firstDataTime == 0) {
                this.firstDataTime = sensorOsaData.getDataTimestamp();
                dataTimestamp = sensorOsaData.getDataTimestamp();
                arrayList.add(Integer.valueOf(sensorOsaData.getValue()));
            } else {
                int dataTimestamp2 = (int) ((sensorOsaData.getDataTimestamp() - dataTimestamp) / 60000);
                if (dataTimestamp2 >= 1) {
                    dataTimestamp += ((long) dataTimestamp2) * 60000;
                    for (int i2 = 0; i2 < dataTimestamp2 - 1; i2++) {
                        arrayList.add(0);
                    }
                    arrayList.add(Integer.valueOf(sensorOsaData.getValue()));
                }
            }
        }
        long j2 = this.firstDataTime;
        if (j2 > 0) {
            this.lastDataTime = j2 + (((long) arrayList.size()) * 60000);
            this.sensorOsaStartUnix = this.firstDataTime / 1000;
            int size = arrayList.size();
            this.sensorOsaBuffLen = size;
            this.sensorOsaMinBuff = new int[size];
            for (int i3 = 0; i3 < this.sensorOsaBuffLen; i3++) {
                this.sensorOsaMinBuff[i3] = ((Integer) arrayList.get(i3)).intValue();
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
        return "SnoreOsaBean{firstDataTime=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.firstDataTime)) + ", lastDataTime=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.lastDataTime)) + ", sensorOsaBuffLen=" + this.sensorOsaBuffLen + ", sensorOsaMinBuff=" + Arrays.toString(this.sensorOsaMinBuff) + '}';
    }
}
