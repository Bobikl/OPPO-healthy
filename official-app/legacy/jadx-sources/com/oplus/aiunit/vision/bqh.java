package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengineservice.db.table.DBSleep;
import com.heytap.databaseengineservice.db.table.DBSleepDataStat;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToLongFunction;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class bqh {
    public final DBSleepDataStat a(String str, String str2, int i, long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str3, int i2) {
        DBSleepDataStat dBSleepDataStat = new DBSleepDataStat();
        dBSleepDataStat.setSsoid(str);
        dBSleepDataStat.setDeviceUniqueId(str2);
        dBSleepDataStat.setDate(i);
        dBSleepDataStat.setFallAsleep(j2);
        dBSleepDataStat.setSleepOut(j3);
        dBSleepDataStat.setTotalSleepTime(j4);
        dBSleepDataStat.setTotalDeepSleepTime(j5);
        dBSleepDataStat.setTotalRemTime(j7);
        dBSleepDataStat.setTotalLightlySleepTime(j6);
        dBSleepDataStat.setTotalWakeUpTime(j8);
        dBSleepDataStat.setSleepScore(0);
        dBSleepDataStat.setCheckedSleepScore(0);
        dBSleepDataStat.setSyncStatus(i2);
        dBSleepDataStat.setTimezone(str3);
        return dBSleepDataStat;
    }

    public final int b(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("state") ? i & tvi.x(jSONObject.getString("state")) : i;
        } catch (Throwable th) {
            cj4.b("SleepStat", "jsonObject exception e = " + th.getMessage());
            return 0;
        }
    }

    public DBSleepDataStat c(List<DBSleep> list) {
        if (hz.b(list)) {
            cj4.d("SleepStat", "statDaySleep dbSleeps is null or empty!");
            return new DBSleepDataStat();
        }
        cj4.c("SleepStat", "statDaySleep dbSleeps = " + list.size());
        list.sort(Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.aqh
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((DBSleep) obj).getStartTimestamp();
            }
        }));
        long timestamp = 0;
        long startTimestamp = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        boolean z = true;
        long timestamp2 = 0;
        boolean z2 = false;
        for (DBSleep dBSleep : list) {
            int sleepState = dBSleep.getSleepState();
            String metadata = dBSleep.getMetadata();
            int iB = 111;
            if (TextUtils.isEmpty(metadata)) {
                z2 = true;
            } else {
                iB = b(metadata, 111);
            }
            if (sleepState != 5 && sleepState != 0) {
                if (z) {
                    startTimestamp = dBSleep.getStartTimestamp();
                    z = false;
                } else {
                    long startTimestamp2 = ((dBSleep.getStartTimestamp() - timestamp2) / 60) / 1000;
                    cj4.a("SleepStat", "statDaySleep two sleep state time interval minutes is: " + startTimestamp2);
                    if ((startTimestamp2 >= 120 && z2) || (startTimestamp2 >= 20 && iB > 0)) {
                        j2 += startTimestamp2;
                        cj4.c("SleepStat", String.format("statDaySleep needSubWakeUp:%s", Long.valueOf(j2)));
                    }
                }
                timestamp2 = dBSleep.getTimestamp();
                timestamp = dBSleep.getTimestamp();
                j4 = 0;
            }
            switch (sleepState) {
                case 1:
                    startTimestamp = dBSleep.getStartTimestamp();
                    break;
                case 2:
                    j5++;
                    break;
                case 3:
                    j7++;
                    break;
                case 4:
                    j6++;
                    break;
                case 5:
                    j3++;
                    if (dBSleep.getStartTimestamp() >= timestamp) {
                        j4++;
                    }
                    break;
                case 6:
                    timestamp = dBSleep.getTimestamp();
                    break;
            }
        }
        long j8 = j5 + j6 + j7;
        long jMax = Math.max(((((timestamp - startTimestamp) / 60) / 1000) - j8) - j2, 0L);
        if (j3 > 0) {
            jMax = Math.min(jMax, j3 - j4);
        }
        long j9 = jMax;
        return j8 > 0 ? a(list.get(0).getSsoid(), list.get(0).getDeviceUniqueId(), v05.i(v05.o(list.get(0).getStartTimestamp())), tvi.g(startTimestamp, true), tvi.g(timestamp, false), j8, j5, j6, j7, j9, v05.r(null), list.get(0).getSyncStatus()) : new DBSleepDataStat();
    }
}
