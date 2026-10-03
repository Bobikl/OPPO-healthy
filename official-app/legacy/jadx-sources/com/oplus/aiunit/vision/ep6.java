package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.epona.Request;
import com.oplus.epona.interceptor.IPCInterceptor;
import com.oplus.epona.provider.ProviderInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ep6 {
    public static ep6 m;
    public Application h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f11003j;
    public static final uof DEFAULT_CONTROLLER = new g75();
    public static final fv9 k = new mee();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f10999l = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static AtomicBoolean f11000n = new AtomicBoolean(false);
    public Map<String, u66> a = new ConcurrentHashMap();
    public final List<iea> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uof f11001c = DEFAULT_CONTROLLER;
    public fv9 d = k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public iea f11002e = new IPCInterceptor();
    public vpf g = new u2f();
    public ryf f = new ryf();
    public np i = new np();

    public static boolean a(@NonNull u66 u66Var) {
        Map<String, u66> map = j().a;
        if (u66Var == null || map.containsKey(u66Var.key())) {
            return false;
        }
        map.put(u66Var.key(), u66Var);
        return true;
    }

    public static void c() {
    }

    public static void d(PrintWriter printWriter) {
        j().g.c(printWriter);
    }

    public static s76 e(String str) {
        return j().g.a(str);
    }

    public static ProviderInfo f(String str) {
        return j().g.b(str);
    }

    public static Context g() {
        return j().f11003j;
    }

    public static u66 h(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return j().a.get(str);
    }

    public static iea i() {
        return j().f11002e;
    }

    public static ep6 j() {
        synchronized (f10999l) {
            if (m == null) {
                m = new ep6();
            }
        }
        return m;
    }

    public static List<iea> k() {
        return j().b;
    }

    public static fv9 l() {
        return j().d;
    }

    public static uof m() {
        return j().f11001c;
    }

    public static void n(Context context) {
        if (f11000n.getAndSet(true)) {
            return;
        }
        j().b(context);
        a(nu5.d());
        l7b.g().h(context);
        c();
    }

    public static ecf o(Request request) {
        return j().f.i(request);
    }

    public static void p(iea ieaVar) {
        j().f11002e = ieaVar;
    }

    public static void q(fv9 fv9Var) {
        j().d = fv9Var;
    }

    public static void r(uof uofVar) {
        j().f11001c = uofVar;
    }

    public final void b(Context context) {
        this.f11003j = context;
        if (context instanceof Application) {
            this.h = (Application) context;
        } else {
            this.h = (Application) context.getApplicationContext();
        }
        this.i.c(this.h);
    }
}
