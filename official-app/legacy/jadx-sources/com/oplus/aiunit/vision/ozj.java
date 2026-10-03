package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public class ozj {
    public static final String DATE_FORMAT = "yyyyMMdd";
    public static final String DATE_TIME_FORMAT = "yyyyMMdd HH:mm:ss";
    public static final TimeZone TIME_ZONE = TimeZone.getDefault();
    public static final List<Integer> a = new ArrayList(7);
    public static SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    public static final String HOUR_FORMAT = "HH";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SimpleDateFormat f15126c = new SimpleDateFormat(HOUR_FORMAT, Locale.getDefault());

    static {
        int i = 0;
        while (i < 7) {
            i++;
            a.add(Integer.valueOf(i));
        }
    }

    public static String a(long j2) {
        return d(j2, DATE_TIME_FORMAT);
    }

    public static long b(long j2) {
        Calendar calendar = Calendar.getInstance(TIME_ZONE);
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static List<String> c(long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        for (long jB = b(j2); jB < j3; jB += 86400000) {
            int[] iArrI = i(jB);
            if (!arrayList.contains(String.valueOf(iArrI[0]))) {
                arrayList.add(String.valueOf(iArrI[0]));
            }
        }
        return arrayList;
    }

    public static String d(long j2, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(TIME_ZONE);
        return simpleDateFormat.format(new Date(j2));
    }

    public static boolean e(String str) {
        return TextUtils.equals(str, String.valueOf(i(System.currentTimeMillis())[0]));
    }

    public static long f(String str, String str2) {
        try {
            Date date = new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            if (date == null) {
                return -1L;
            }
            Calendar calendar = Calendar.getInstance(TIME_ZONE);
            calendar.setTime(date);
            return calendar.getTimeInMillis();
        } catch (ParseException e2) {
            lp2.b("TimeUtils", "ParseException : " + e2.getMessage());
            return -1L;
        }
    }

    public static long g(int i) {
        return f(String.valueOf(i), "yyyyMMdd");
    }

    public static String h(List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(" ");
        }
        return sb.toString();
    }

    @NonNull
    public static int[] i(long j2) {
        Date date = new Date(j2);
        return new int[]{Integer.parseInt(b.format(date)), Integer.parseInt(f15126c.format(date))};
    }
}
