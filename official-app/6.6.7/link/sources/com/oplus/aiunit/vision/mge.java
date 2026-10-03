package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class mge {
    public static volatile mge f;
    public volatile boolean a = false;
    public Context b;
    public gq6 c;
    public p4k d;
    public ghc e;

    public static mge a() {
        if (f == null) {
            synchronized (mge.class) {
                if (f == null) {
                    f = new mge();
                }
            }
        }
        return f;
    }

    public final String b() {
        return fzk.b() ? d14.SYSTEM_CORE_PACKAGE_NAME : d14.a();
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
            bzg.b();
            e3e.e(this.b);
            p35.e().f(this.b);
        }
        this.c = new gq6(this.b);
        this.d = new p4k(this.b);
        this.e = new ghc(this.b);
    }

    public boolean d() {
        return !p35.e().g();
    }

    public boolean e(String str, int i) {
        return this.d.h(str, i);
    }
}
