package com.oplus.aiunit.vision;

import com.heytap.connect.TapConst;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes15.dex */
public class mzj {
    public static String a(long j2) {
        return b(j2, "yyyy-MM-dd HH:mm:ss");
    }

    public static String b(long j2, String str) {
        return new SimpleDateFormat(str).format(new Date(j2));
    }

    public static String c(long j2) {
        long j3 = j2 / 1000;
        int i = (int) (j3 / TapConst.IP_TTL_DEFAULT);
        int i2 = ((int) (j3 - ((long) (i * 3600)))) / 60;
        int i3 = (int) (j3 % 60);
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            if (i < 10) {
                sb.append(0);
            }
            sb.append(i);
            sb.append(":");
        }
        if (i2 < 10) {
            sb.append(0);
        }
        sb.append(i2);
        sb.append(":");
        if (i3 < 10) {
            sb.append(0);
        }
        sb.append(i3);
        return sb.toString();
    }

    public static String d(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(j2));
    }

    public static String e(long j2, String str) {
        return new SimpleDateFormat(str).format(new Date(j2));
    }

    public static int f(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / 1000);
    }

    public static int g() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / 1000);
    }
}
