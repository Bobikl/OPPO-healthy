package com.autonavi.aps.amapapi.utils;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes13.dex */
public final class d {
    public static long a(long j2, long j3, int i) {
        if (i <= 0) {
            return j2;
        }
        try {
            return Math.abs(j2 - j3) > ((long) i) * 31536000000L ? a(j2, j3) : j2;
        } catch (Throwable unused) {
            return j2;
        }
    }

    private static long b(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j2));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private static long a(long j2, long j3) {
        long jB = b(j3) + a(j2);
        long jAbs = Math.abs(jB - j3);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(jB));
        int i = calendar.get(11);
        if (i == 23 && jAbs >= 82800000) {
            jB -= 86400000;
        }
        return (i != 0 || jAbs < 82800000) ? jB : jB + 86400000;
    }

    private static long a(long j2) {
        return j2 - b(j2);
    }
}
