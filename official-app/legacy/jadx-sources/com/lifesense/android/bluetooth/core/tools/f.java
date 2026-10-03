package com.lifesense.android.bluetooth.core.tools;

import android.annotation.SuppressLint;
import com.oplus.aiunit.vision.v05;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"SimpleDateFormat"})
public class f {
    public static final SimpleDateFormat defaultDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat dayDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat hourDateFormat = new SimpleDateFormat("HH:mm:ss:sss");
    public static final SimpleDateFormat fileDateFormat = new SimpleDateFormat("yyyyMMdd");

    public static int a() {
        return Calendar.getInstance().get(5);
    }

    public static int b() {
        return Calendar.getInstance().get(11);
    }

    public static int c() {
        return Calendar.getInstance().get(12);
    }

    public static int d() {
        return Calendar.getInstance().get(2) + 1;
    }

    public static int e() {
        return Calendar.getInstance().get(13);
    }

    public static String f() {
        int iG = g();
        String str = String.format("%02d:%02d", Integer.valueOf(Math.abs(iG / 3600000)), Integer.valueOf(Math.abs((iG / 60000) % 60)));
        StringBuilder sb = new StringBuilder();
        sb.append(v05.TIME_ZONE_0);
        sb.append(iG >= 0 ? "+" : "-");
        sb.append(str);
        return sb.toString();
    }

    public static int g() {
        TimeZone timeZone = TimeZone.getDefault();
        return timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis());
    }

    public static int h() {
        return Calendar.getInstance().get(1);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            boolean zContains = str.contains("-");
            int i = Integer.parseInt(str.substring(4, 6));
            int i2 = Integer.parseInt(str.substring(7));
            if (zContains) {
                i2 = -i2;
                i = -i;
            }
            int i3 = (((i * 60) + i2) / 15) + 48;
            if (i3 < 0) {
                return null;
            }
            String hexString = Integer.toHexString(i3);
            if (hexString.length() >= 2) {
                return hexString;
            }
            return "0" + hexString;
        } catch (Exception unused) {
            return null;
        }
    }
}
