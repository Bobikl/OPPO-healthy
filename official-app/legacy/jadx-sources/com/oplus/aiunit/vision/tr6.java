package com.oplus.aiunit.vision;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public class tr6 {
    public static final ExecutorService m = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17127e;
    public boolean g;
    public boolean h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<z2j> f17128j;
    public n7b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public teb f17129l;
    public boolean a = true;
    public boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17126c = true;
    public boolean d = true;
    public boolean f = true;
    public ExecutorService i = m;

    public Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public n7b b() {
        n7b n7bVar = this.k;
        if (n7bVar != null) {
            return n7bVar;
        }
        return (!n7b.a.c() || a() == null) ? new n7b.b() : new n7b.a("EventBus");
    }

    public teb c() {
        Object objA;
        teb tebVar = this.f17129l;
        if (tebVar != null) {
            return tebVar;
        }
        if (!n7b.a.c() || (objA = a()) == null) {
            return null;
        }
        return new teb.a((Looper) objA);
    }
}
