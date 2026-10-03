package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class z0j {
    public static final String DATA_FMT1 = "yyyy/MM/dd";
    public static final String DATA_FMT2 = "HH:mm:ss";
    public static final String TAG = "StringUtil";

    public static String a(String str) {
        return !i(str) ? str : ybb.a(str);
    }

    public static long b(Date date, Date date2) {
        return ChronoUnit.SECONDS.between(k(date2), k(date));
    }

    public static String c(long j2, String str) {
        return d(new Date(j2), str);
    }

    public static String d(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }

    public static String e(long j2) {
        return String.format("%.1f MB", Float.valueOf(j2 / 1048576.0f));
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        try {
            return String.format("%.2f", Double.valueOf(Double.parseDouble(str))).replaceAll("0*$", "").replaceAll("\\.$", "");
        } catch (Exception unused) {
            return "0";
        }
    }

    public static String g(int i, long j2) {
        float f = j2;
        return String.format("%.1f MB/%.1f MB", Float.valueOf((i * f) / 1.048576E8f), Float.valueOf(f / 1048576.0f));
    }

    public static String h(long j2) {
        return j2 < 104448 ? "0.1 MB" : String.format("%.1f MB", Double.valueOf(j2 / 1048576.0d));
    }

    public static boolean i(String str) {
        return BluetoothAdapter.checkBluetoothAddress(str);
    }

    public static boolean j(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.time.LocalDateTime] */
    public static LocalDateTime k(Date date) {
        ?? localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        ltl.a(TAG, "localDate " + date + " localDateTime " + ((Object) localDateTime));
        return localDateTime;
    }
}
