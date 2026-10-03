package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class uhm {
    public static final int a = 60;
    public static final int b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17470c = 10;
    public static final String d = "zh_CN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17471e = "CN";
    public static final int[] f = {121, 101, 101, 97, 98, 43, 62, 62, 100, 97, 118, 99, 112, 117, 116, 60, 101, 116, 98, 101, 63, 102, 112, 127, 104, 126, 125, 63, 114, 126, 124, 62, 126, 124, 98, 62, 103, 32, 62, 114, 126, 124, 115, 120, 127, 116, 82, 121, 116, 114, 122, 68, 97, 117, 112, 101, 116};
    public static final int[] g = {121, 101, 101, 97, 98, 43, 62, 62, 124, 117, 97, 60, 100, 97, 118, 99, 112, 117, 116, 60, 114, 127, 63, 121, 116, 104, 101, 112, 97, 124, 126, 115, 120, 63, 114, 126, 124, 62, 126, 124, 98, 62, 103, 32, 62, 114, 126, 124, 115, 120, 127, 116, 82, 121, 116, 114, 122, 68, 97, 117, 112, 101, 116};
    public static final int[] h = {121, 101, 101, 97, 98, 43, 62, 62, 124, 117, 97, 60, 100, 97, 118, 99, 112, 117, 116, 60, 118, 125, 63, 102, 112, 127, 104, 126, 125, 63, 114, 126, 124, 62, 126, 124, 98, 62, 103, 32, 62, 114, 126, 124, 115, 120, 127, 116, 82, 121, 116, 114, 122, 68, 97, 117, 112, 101, 116};
    public static final int[] i = {121, 101, 101, 97, 98, 43, 62, 62, 124, 117, 97, 60, 100, 97, 118, 99, 112, 117, 116, 60, 118, 125, 63, 121, 116, 104, 101, 112, 97, 124, 126, 115, 120, 125, 116, 63, 114, 126, 124, 62, 126, 124, 98, 62, 103, 32, 62, 114, 126, 124, 115, 120, 127, 116, 82, 121, 116, 114, 122, 68, 97, 117, 112, 101, 116};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile efd f17472j;

    public static String a(int i2) {
        if (i2 == 1) {
            return kum.a(f);
        }
        if (i2 == 2) {
            return kum.a(g);
        }
        if (i2 == 3) {
            return kum.a(h);
        }
        if (i2 != 4) {
            return null;
        }
        return kum.a(i);
    }

    public static String b(Context context) {
        return qbm.a(context);
    }

    public static String c() {
        String language = Locale.getDefault().getLanguage();
        return !TextUtils.isEmpty(language) ? language : "zh_CN";
    }

    public static efd d() {
        if (f17472j == null) {
            synchronized (uhm.class) {
                if (f17472j == null) {
                    efd.a aVarI = new efd().I();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    f17472j = aVarI.g(60L, timeUnit).b0(10L, timeUnit).X(10L, timeUnit).c();
                }
            }
        }
        return f17472j;
    }

    public static String e() {
        String country = Locale.getDefault().getCountry();
        return !TextUtils.isEmpty(country) ? country : "CN";
    }
}
