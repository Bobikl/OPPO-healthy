package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wzm implements Runnable {
    public static final String f = "SplitUnloadTask";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final npm f18457j;
    public f8i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f18458l;
    public int i = 1;
    public Handler m = new Handler(Looper.getMainLooper());

    public wzm(Context context, npm npmVar, f8i f8iVar) {
        this.f18458l = context;
        this.f18457j = npmVar;
        this.k = f8iVar;
    }

    public void a() {
        if (this.f18457j.a != null) {
            try {
                w7i.a(f, "Use split Application onTerminate(), Split name = " + this.f18457j.b, new Object[0]);
                this.f18457j.a.onTerminate();
            } catch (Throwable th) {
                w7i.i(f, "unloadSplit[%s] execute onTerminate error: %s", this.f18457j.b, th.getMessage());
                this.i = -52;
            }
        }
        bcm.f().i(this.f18457j.b);
    }

    public void b() {
        f8i f8iVar = this.k;
        if (f8iVar == null) {
            this.k = new f8i();
            return;
        }
        f8iVar.a(System.currentTimeMillis());
        this.k.d(this.f18457j.b);
        this.k.i(this.f18457j.d);
        this.k.f(this.i);
        e8i.a("unload", this.k);
    }

    public abstract void c();

    public void d() {
    }

    public final void e() {
        this.i = 1;
        a();
        c();
        d();
        b();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.m.post(new Runnable() { // from class: com.oplus.aiunit.vision.kzm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e();
                }
            });
        } else {
            e();
        }
    }
}
