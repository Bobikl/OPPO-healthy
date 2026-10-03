package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ykm {
    public static final String a = "00:00:00:00:00:00";
    public static ykm b;

    public ykm(Context context) {
    }

    public static ykm a(Context context) {
        if (b == null) {
            b = new ykm(context);
        }
        return b;
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static com.alipay.sdk.m.u.g e(Context context) {
        try {
            NetworkInfo networkInfoA = fgm.a(null, context);
            if (networkInfoA == null || networkInfoA.getType() != 0) {
                return (networkInfoA == null || networkInfoA.getType() != 1) ? com.alipay.sdk.m.u.g.NONE : com.alipay.sdk.m.u.g.WIFI;
            }
            return com.alipay.sdk.m.u.g.a(networkInfoA.getSubtype());
        } catch (Exception unused) {
            return com.alipay.sdk.m.u.g.NONE;
        }
    }

    public String b() {
        return "000000000000000";
    }

    public String c() {
        return "000000000000000";
    }

    public String f() {
        return a;
    }
}
