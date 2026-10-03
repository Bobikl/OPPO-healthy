package com.heytap.health.sleep.formula;

import android.text.format.DateFormat;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.HealthOriginData;
import com.heytap.health.sleep.formula.formula.OsaSpo2Bean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.x05;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreSpo2BeanV2 extends OsaSpo2Bean {
    private static final String TAG = "SnoreSpo2";
    private long firstDataTime;
    private long lastDataTime;
    private String mac;

    public SnoreSpo2BeanV2(long j2, long j3, List<HealthOriginData> list) {
        String str;
        Iterator<HealthOriginData> it;
        this.firstDataTime = 0L;
        StringBuilder sb = new StringBuilder();
        sb.append("sleep range:");
        String str2 = "yyyy-MM-dd HH:mm:ss";
        sb.append(x05.a(j2, "yyyy-MM-dd HH:mm:ss"));
        String str3 = "/endTime:";
        sb.append("/endTime:");
        sb.append(x05.a(j3, "yyyy-MM-dd HH:mm:ss"));
        String string = sb.toString();
        String str4 = TAG;
        a7b.f(TAG, string);
        ArrayList arrayList = new ArrayList();
        Iterator<HealthOriginData> it2 = list.iterator();
        long j4 = 0;
        long j5 = 0;
        while (it2.hasNext()) {
            HealthOriginData next = it2.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("raw spo2 time:");
            long j6 = j5;
            sb2.append(x05.a(next.getStartTimestamp(), str2));
            sb2.append(str3);
            sb2.append(x05.a(next.getStartTimestamp(), str2));
            if (next.getStartTimestamp() < j2 || next.getStartTimestamp() > j3) {
                str3 = str3;
                str = str4;
                it = it2;
                str2 = str2;
                j5 = j6;
            } else {
                this.mac = next.getDeviceUniqueId();
                String data = next.getData();
                if (data == null || data.length() <= 0) {
                    str2 = str2;
                    str3 = str3;
                } else {
                    String[] strArrSplit = data.split(",");
                    int i = Integer.parseInt(strArrSplit[0]);
                    long startTimestamp = next.getStartTimestamp();
                    if (arrayList.size() > 0 && startTimestamp > j4 && startTimestamp >= j2 && startTimestamp < j3) {
                        int i2 = ((int) ((startTimestamp - j4) / 1000)) - 1;
                        int i3 = 0;
                        while (i3 < i2) {
                            int i4 = i2;
                            arrayList.add((short) 0);
                            j6 = j6 == 0 ? startTimestamp : j6 + 1000;
                            i3++;
                            i2 = i4;
                        }
                    }
                    int i5 = i + 1;
                    while (i5 <= strArrSplit.length - 1) {
                        int i6 = Integer.parseInt(strArrSplit[i5]);
                        int i7 = Integer.parseInt(strArrSplit[i5 + 1]);
                        String[] strArr = strArrSplit;
                        int i8 = Integer.parseInt(strArrSplit[i5 + 2]);
                        String str5 = str4;
                        Iterator<HealthOriginData> it3 = it2;
                        startTimestamp += ((long) i8) * 1000;
                        if (startTimestamp > j4 && startTimestamp >= j2 && startTimestamp < j3) {
                            int i9 = i8 - 1;
                            if (arrayList.size() > 0) {
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if (j6 < startTimestamp - 1 && j6 > j2 && j6 < j3 - 2) {
                                        arrayList.add((short) 0);
                                        j6 = j6 == 0 ? startTimestamp : j6 + 1000;
                                    }
                                }
                            }
                            if (i6 > 69) {
                                arrayList.add(Short.valueOf((short) (((byte) ((((byte) (i7 >> 4)) == 0 ? 1 : 0) << 2)) | ((byte) (((byte) (i7 << 4)) >> 4)) | ((i6 - 69) << 3))));
                                j6 = j6 == 0 ? startTimestamp : j6 + 1000;
                                if (this.firstDataTime <= 0) {
                                    this.firstDataTime = startTimestamp;
                                }
                            } else if (arrayList.size() > 0) {
                                arrayList.add((short) 0);
                                if (j6 == 0) {
                                    j4 = startTimestamp;
                                    j6 = j4;
                                } else {
                                    j6 += 1000;
                                }
                            }
                            j4 = startTimestamp;
                        }
                        i5 += i;
                        strArrSplit = strArr;
                        str4 = str5;
                        it2 = it3;
                    }
                }
                str = str4;
                it = it2;
                j5 = j6;
                str2 = str2;
            }
            str4 = str;
            str3 = str3;
            it2 = it;
        }
        String str6 = str4;
        long j7 = this.firstDataTime;
        if (j7 > 0) {
            this.lastDataTime = j7 + (((long) (arrayList.size() - 1)) * 1000);
            this.spo2StartUnix = this.firstDataTime / 1000;
            this.spo2Buffs = new short[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.spo2Buffs[i11] = ((Short) arrayList.get(i11)).shortValue();
            }
            this.spo2BuffLen = arrayList.size();
            a7b.f(str6, "result:" + toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("array result:");
            sb3.append(Arrays.toString(this.spo2Buffs));
        }
    }

    private String getStr(int i) {
        return Integer.toBinaryString((i & 255) + 256).substring(1);
    }

    public long getFirstDataTime() {
        return this.firstDataTime;
    }

    public long getLastDataTime() {
        return this.lastDataTime;
    }

    public String getMac() {
        return this.mac;
    }

    public boolean isEmpty() {
        return this.spo2StartUnix <= 0 || this.spo2Buffs == null || this.spo2BuffLen <= 0;
    }

    public void setFirstDataTime(long j2) {
        this.firstDataTime = j2;
    }

    public void setLastDataTime(long j2) {
        this.lastDataTime = j2;
    }

    @NonNull
    public String toString() {
        return "SnoreSpo2Bean{, firstDataTime=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.firstDataTime)) + ", lastDataTime=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.lastDataTime)) + ", spo2BuffLen=" + this.spo2BuffLen + '}';
    }
}
