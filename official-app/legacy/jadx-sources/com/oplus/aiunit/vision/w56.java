package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.drs.base.ChannelMode;

/* JADX INFO: loaded from: classes6.dex */
public class w56 {
    public static Context a;
    public static Context b;
    public static volatile String d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ChannelMode f18124c = ChannelMode.STANDALONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f18125e = new Object();
    public static volatile String f = "";

    public static ChannelMode a() {
        return f18124c;
    }

    public static Context b() {
        return a;
    }

    public static String c(Context context) {
        String str;
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        synchronized (f18125e) {
            if (TextUtils.isEmpty(d)) {
                d = te0.c(context);
            }
            str = d;
        }
        return str;
    }

    public static String d() {
        Context context;
        if ((f18124c != ChannelMode.STANDALONE || TextUtils.isEmpty(f)) && (context = a) != null) {
            return te0.d(context);
        }
        return f;
    }

    public static void e(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        a = applicationContext;
        f(applicationContext);
        if (a() == ChannelMode.DRS) {
            b = dui.a(context);
        } else {
            b = context;
        }
    }

    public static void f(Context context) {
        try {
            if (te0.DRS_PACKAGE_NAME.equals(context.getPackageName())) {
                f18124c = ChannelMode.DRS;
            } else {
                f18124c = ChannelMode.STANDALONE;
            }
        } catch (Throwable unused) {
            f18124c = ChannelMode.STANDALONE;
        }
    }

    public static void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f = str;
    }

    public static Context h() {
        return b;
    }
}
