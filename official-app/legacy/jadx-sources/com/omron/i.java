package com.omron;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public class i {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS");
    public static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f9002c = new SimpleDateFormat("yyyy-MM-dd");

    public static long a(String str) {
        try {
            return b.parse(str).getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String a(Date date) {
        return b.format(date);
    }

    public static Date a(long j2) {
        return new Date(j2);
    }
}
