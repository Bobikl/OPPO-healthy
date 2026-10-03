package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import com.heytap.epona.Request;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes15.dex */
public class fp6 {
    public static fp6 i;
    public Application d;
    public Context g;
    public static final Object h = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static AtomicBoolean f11453j = new AtomicBoolean(false);
    public final List<fea> a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wpf f11454c = new v2f();
    public tyf b = new tyf();
    public ysh f = new b8b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mp f11455e = new mp();

    public static void b() {
    }

    public static t76 c(String str) {
        return g().f11454c.a(str);
    }

    public static p2f d(String str) {
        return g().f11454c.b(str);
    }

    public static Application e() {
        return g().d;
    }

    public static Context f() {
        return g().g;
    }

    public static fp6 g() {
        synchronized (h) {
            if (i == null) {
                i = new fp6();
            }
        }
        return i;
    }

    public static List<fea> h() {
        return g().a;
    }

    public static void i(Context context) {
        if (f11453j.getAndSet(true)) {
            return;
        }
        g().a(context);
        s7b.e(context);
        b();
    }

    public static ccf j(Request request) {
        return g().b.i(request);
    }

    public final void a(Context context) {
        this.g = context;
        if (context instanceof Application) {
            this.d = (Application) context;
        } else {
            this.d = (Application) context.getApplicationContext();
        }
        this.f11455e.c(this.d);
    }
}
