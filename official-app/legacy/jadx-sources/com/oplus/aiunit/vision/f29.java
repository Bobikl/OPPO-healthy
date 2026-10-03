package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class f29 {
    public static float INTERVAL_TIME = 1440000.0f;

    public static List<TimeStampedData> b(List<HeartRate> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HeartRate heartRate : list) {
            TimeStampedData timeStampedData = new TimeStampedData();
            timeStampedData.setTimestamp(heartRate.getDataCreatedTimestamp());
            timeStampedData.setY(heartRate.getHeartRateValue());
            timeStampedData.setHeartRateType(heartRate.getHeartRateType());
            timeStampedData.setDisconnect(heartRate.getSyncStatus() == 100000);
            arrayList.add(timeStampedData);
        }
        return arrayList;
    }

    public static List<TimeStampedData> c(@NonNull List<HeartRate> list, long j2) {
        if (list.size() <= 2 || j2 <= 0) {
            return b(list);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HeartRate heartRate = list.get(0);
        HeartRate heartRate2 = new HeartRate(heartRate.getDataCreatedTimestamp(), heartRate.getHeartRateValue());
        HeartRate heartRate3 = new HeartRate(heartRate.getDataCreatedTimestamp(), heartRate.getHeartRateValue());
        arrayList2.add(heartRate);
        long dataCreatedTimestamp = heartRate.getDataCreatedTimestamp();
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (i < list.size()) {
            HeartRate heartRate4 = list.get(i);
            if (e(heartRate4.getDataCreatedTimestamp(), heartRate.getDataCreatedTimestamp())) {
                if (heartRate4.getHeartRateValue() > heartRate2.getHeartRateValue()) {
                    heartRate2.setHeartRateValue(heartRate4.getHeartRateValue());
                    heartRate2.setDataCreatedTimestamp(heartRate4.getDataCreatedTimestamp());
                    z = true;
                } else if (heartRate4.getHeartRateValue() < heartRate3.getHeartRateValue()) {
                    heartRate3.setHeartRateValue(heartRate4.getHeartRateValue());
                    heartRate3.setDataCreatedTimestamp(heartRate4.getDataCreatedTimestamp());
                    z2 = true;
                }
                if (Math.abs(heartRate4.getDataCreatedTimestamp() - dataCreatedTimestamp) >= j2) {
                    if (heartRate4.getDataCreatedTimestamp() - heartRate.getDataCreatedTimestamp() >= INTERVAL_TIME) {
                        heartRate4.setSyncStatus(100000);
                    }
                    arrayList2.add(heartRate4);
                    dataCreatedTimestamp = heartRate4.getDataCreatedTimestamp();
                    if (heartRate4.getHeartRateValue() >= heartRate2.getHeartRateValue()) {
                        z = false;
                    }
                    if (heartRate4.getHeartRateValue() <= heartRate3.getHeartRateValue()) {
                    }
                }
                i++;
                heartRate = heartRate4;
            } else {
                arrayList.addAll(d(arrayList2, heartRate2, heartRate3, z, z2, "1"));
                arrayList2.clear();
                heartRate4.setSyncStatus(100000);
                arrayList2.add(heartRate4);
                long dataCreatedTimestamp2 = heartRate4.getDataCreatedTimestamp();
                dataCreatedTimestamp = dataCreatedTimestamp2;
                heartRate2 = new HeartRate(heartRate4.getDataCreatedTimestamp(), heartRate4.getHeartRateValue());
                heartRate3 = new HeartRate(heartRate4.getDataCreatedTimestamp(), heartRate4.getHeartRateValue());
                z = false;
            }
            z2 = false;
            i++;
            heartRate = heartRate4;
        }
        arrayList.addAll(d(arrayList2, heartRate2, heartRate3, z, z2, "2"));
        HeartRate heartRate5 = list.get(list.size() - 1);
        HeartRate heartRate6 = (HeartRate) arrayList.get(arrayList.size() - 1);
        if (heartRate5.getDataCreatedTimestamp() != heartRate6.getDataCreatedTimestamp() || heartRate5.getHeartRateValue() != heartRate6.getHeartRateValue()) {
            arrayList.add(heartRate5);
        }
        return b(arrayList);
    }

    public static List<HeartRate> d(List<HeartRate> list, HeartRate heartRate, HeartRate heartRate2, boolean z, boolean z2, String str) {
        a7b.f("HeartRateAlgorithm", "extractMaxAndMin " + list.size() + "/" + str + "/max" + x05.a(heartRate.getDataCreatedTimestamp(), "yyyy-MM-dd HH:mm:ss") + "/" + heartRate.getHeartRateType() + "/" + heartRate.getHeartRateValue() + "/min" + x05.a(heartRate2.getDataCreatedTimestamp(), "yyyy-MM-dd HH:mm:ss") + "/" + heartRate2.getHeartRateType() + "/" + heartRate2.getHeartRateValue() + "/" + z + "/" + z2);
        if (!z && !z2) {
            return list;
        }
        if (z) {
            list.add(heartRate);
        }
        if (z2) {
            list.add(heartRate2);
        }
        Collections.sort(list, new Comparator() { // from class: com.oplus.aiunit.vision.e29
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f29.f((HeartRate) obj, (HeartRate) obj2);
            }
        });
        return list;
    }

    public static boolean e(long j2, long j3) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate().getDayOfMonth() == LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), zoneIdSystemDefault).toLocalDate().getDayOfMonth();
    }

    public static /* synthetic */ int f(HeartRate heartRate, HeartRate heartRate2) {
        return (int) (heartRate.getDataCreatedTimestamp() - heartRate2.getDataCreatedTimestamp());
    }
}
