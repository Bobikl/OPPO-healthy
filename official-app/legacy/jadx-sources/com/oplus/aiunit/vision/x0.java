package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.template.ILogger;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 {
    public static final String AUTO_INJECT = "wmHzgD4lOj5o4241";
    public static final String RAW_URI = "NTeRQWvye18AkPd6G";
    public static volatile x0 a = null;
    public static volatile boolean b = false;
    public static ILogger logger;

    public static boolean c() {
        return d8m.i();
    }

    public static x0 d() {
        e(b78.b());
        if (!b) {
            throw new InitException("ARouter::Init::Invoke init(context) first!");
        }
        if (a == null) {
            synchronized (x0.class) {
                if (a == null) {
                    a = new x0();
                }
            }
        }
        return a;
    }

    public static void e(Application application) {
        if (b) {
            return;
        }
        ILogger iLogger = d8m.a;
        logger = iLogger;
        iLogger.info(ILogger.defaultTag, "ARouter init start.");
        b = d8m.l(application);
        if (b) {
            d8m.e();
        }
        d8m.a.info(ILogger.defaultTag, "ARouter init over.");
    }

    public static synchronized void i() {
        d8m.p();
    }

    public static synchronized void j() {
        d8m.q();
    }

    public Postcard a(Uri uri) {
        return d8m.k().f(uri);
    }

    public Postcard b(String str) {
        return d8m.k().g(str);
    }

    public void f(Object obj) {
        d8m.m(obj);
    }

    public Object g(Context context, Postcard postcard, int i, NavigationCallback navigationCallback) {
        return d8m.k().n(context, postcard, i, navigationCallback);
    }

    public <T> T h(Class<? extends T> cls) {
        return (T) d8m.k().o(cls);
    }
}
