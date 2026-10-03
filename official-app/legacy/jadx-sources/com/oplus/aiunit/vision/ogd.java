package com.oplus.aiunit.vision;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class ogd {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public static final ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();

    public static long a(String str, long j2) {
        Long l2 = str != null ? b.get(str) : null;
        if (l2 == null || Math.abs(l2.longValue()) < 60000) {
            return j2;
        }
        long jLongValue = j2 - l2.longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jLongValue > 300000 + jCurrentTimeMillis) {
            a7b.m("OmronTimeFix", "correctTime: corrected time is in future, skip. mac=" + str + ", raw=" + j2 + ", corrected=" + jLongValue + ", now=" + jCurrentTimeMillis);
            return j2;
        }
        if (jLongValue < jCurrentTimeMillis - 31536000000L) {
            a7b.m("OmronTimeFix", "correctTime: corrected time too old, skip. mac=" + str + ", raw=" + j2 + ", corrected=" + jLongValue);
            return j2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("correctTime: mac=");
        sb.append(str);
        sb.append(", raw=");
        sb.append(j2);
        sb.append(" -> corrected=");
        sb.append(jLongValue);
        sb.append(" (offset=");
        sb.append(l2);
        sb.append("ms)");
        return jLongValue;
    }

    public static void b(String str, long j2) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = b;
        Long l2 = concurrentHashMap.get(str);
        if (l2 == null || Math.abs(l2.longValue()) < 60000) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j2 > 300000 + jCurrentTimeMillis) {
                long j3 = j2 - jCurrentTimeMillis;
                concurrentHashMap.put(str, Long.valueOf(j3));
                StringBuilder sb = new StringBuilder();
                sb.append("ensureOffset: inferred from future measurement. mac=");
                sb.append(str);
                sb.append(", maxMeasureTime=");
                sb.append(j2);
                sb.append(", now=");
                sb.append(jCurrentTimeMillis);
                sb.append(", inferredOffset=");
                sb.append(j3);
                sb.append("ms (");
                sb.append(j3 / 1000);
                sb.append("s)");
            }
        }
    }

    public static void c(String str) {
        if (str != null) {
            b.remove(str);
            StringBuilder sb = new StringBuilder();
            sb.append("prepareSession: cleared offset for ");
            sb.append(str);
        }
    }

    public static void d(String str, String str2) {
        long time;
        if (str2 == null || str2.isEmpty()) {
            a7b.m("OmronTimeFix", "recordDeviceCurrentTime: deviceTimeStr is null or empty");
            return;
        }
        if (str == null || str.isEmpty()) {
            a7b.m("OmronTimeFix", "recordDeviceCurrentTime: mac is null or empty");
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = b;
        Long l2 = concurrentHashMap.get(str);
        if (l2 != null && Math.abs(l2.longValue()) >= 60000) {
            StringBuilder sb = new StringBuilder();
            sb.append("recordDeviceCurrentTime: skip, already have significant offset for ");
            sb.append(str);
            sb.append(" (");
            sb.append(l2);
            sb.append("ms)");
            return;
        }
        try {
            SimpleDateFormat simpleDateFormat = a;
            synchronized (simpleDateFormat) {
                time = simpleDateFormat.parse(str2).getTime();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = time - jCurrentTimeMillis;
            concurrentHashMap.put(str, Long.valueOf(j2));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("recordDeviceCurrentTime: mac=");
            sb2.append(str);
            sb2.append(", deviceTime=");
            sb2.append(str2);
            sb2.append(", phoneTime=");
            sb2.append(jCurrentTimeMillis);
            sb2.append(", offset=");
            sb2.append(j2);
            sb2.append("ms (");
            sb2.append(j2 / 1000);
            sb2.append("s)");
        } catch (Exception e2) {
            a7b.b("OmronTimeFix", "recordDeviceCurrentTime parse error: " + e2.getMessage());
        }
    }
}
