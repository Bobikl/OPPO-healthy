package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class nee {
    public static volatile nee f;
    public volatile boolean a = false;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gp6 f14481c;
    public n0k d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ofc f14482e;

    public static nee a() {
        if (f == null) {
            synchronized (nee.class) {
                if (f == null) {
                    f = new nee();
                }
            }
        }
        return f;
    }

    public final String b() {
        return hvk.b() ? q04.SYSTEM_CORE_PACKAGE_NAME : q04.a();
    }

    public synchronized void c(@NonNull Context context) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        this.b = context;
        if (context != null && TextUtils.equals(context.getPackageName(), b())) {
            kvg.b();
            j1e.e(this.b);
            w25.e().f(this.b);
        }
        this.f14481c = new gp6(this.b);
        this.d = new n0k(this.b);
        this.f14482e = new ofc(this.b);
    }

    public boolean d() {
        return !w25.e().g();
    }

    public boolean e(String str, int i) {
        return this.d.h(str, i);
    }
}
