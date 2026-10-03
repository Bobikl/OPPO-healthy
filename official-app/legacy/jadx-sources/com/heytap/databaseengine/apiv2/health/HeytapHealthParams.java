package com.heytap.databaseengine.apiv2.health;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.g8m;
import com.oplus.aiunit.vision.me8;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HeytapHealthParams {
    public static final String BODY = "BODY";
    public static final String DAILY_ACTIVITY = "DAILY_ACTIVITY";
    public static final String ECG = "ECG";
    public static final String HEART_RATE = "HEART_RATE";
    public static final int LOWEST_APP_VERSION = 3180000;
    public static final int NOT_SUPPORT_DATA_TYPE = -1;
    public static final String PRESSURE = "PRESSURE";
    public static final String SLEEP = "SLEEP";
    public static final String SPO2 = "SPO2";
    public static final String SPORT = "SPORT";
    private static final String TAG = "HeytapHealthParams";
    private static final Map<String, Integer> tableTypeMap;
    private String dataType;
    private long endTime;
    private MODE mode;
    public int sdkVersion = g8m.sdkVersion;
    private long startTime;

    public enum MODE {
        STAT("STAT"),
        DETAIL("DETAIL"),
        DEFAULT("DEFAULT");

        private String description;

        MODE(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }

    public static final class a {
        public static /* bridge */ /* synthetic */ String a(a aVar) {
            throw null;
        }

        public static /* bridge */ /* synthetic */ long b(a aVar) {
            throw null;
        }

        public static /* bridge */ /* synthetic */ MODE c(a aVar) {
            throw null;
        }

        public static /* bridge */ /* synthetic */ long d(a aVar) {
            throw null;
        }
    }

    static {
        HashMap map = new HashMap();
        tableTypeMap = map;
        StringBuilder sb = new StringBuilder();
        sb.append(DAILY_ACTIVITY);
        MODE mode = MODE.DETAIL;
        sb.append(mode.getDescription());
        map.put(sb.toString(), 1001);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(DAILY_ACTIVITY);
        MODE mode2 = MODE.STAT;
        sb2.append(mode2.getDescription());
        map.put(sb2.toString(), 1002);
        map.put(SPORT + mode.getDescription(), 1003);
        map.put(SPORT + mode2.getDescription(), 1005);
        map.put(HEART_RATE + mode.getDescription(), 1008);
        map.put(HEART_RATE + mode2.getDescription(), 1009);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(SLEEP);
        MODE mode3 = MODE.DEFAULT;
        sb3.append(mode3.getDescription());
        map.put(sb3.toString(), 1010);
        map.put("ECG" + mode3.getDescription(), 1012);
        map.put(SPO2 + mode3.getDescription(), 1014);
        map.put(PRESSURE + mode3.getDescription(), 1017);
        map.put(BODY + mode3.getDescription(), 1021);
    }

    private HeytapHealthParams(a aVar) {
        this.startTime = a.d(aVar);
        this.endTime = a.b(aVar);
        this.dataType = a.a(aVar);
        this.mode = a.c(aVar);
    }

    public static int getTableType(String str) {
        Integer num = tableTypeMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        me8.b(TAG, "error table type");
        return -1;
    }

    public String getDataType() {
        return this.dataType;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public MODE getMode() {
        return this.mode;
    }

    public long getStartTime() {
        return this.startTime;
    }
}
