package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n81 implements Runnable {
    public k6f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f14390j;
    public volatile boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f14391l = ct2.b().a();

    public n81(Context context, k6f k6fVar) {
        this.f14390j = context;
        this.i = k6fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        c(3);
    }

    public void c(int i) {
        if (this.i == null || this.k) {
            return;
        }
        this.i.a(i);
        this.k = true;
    }

    public abstract void d();

    public void e() {
        this.f14391l.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.m81
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b();
            }
        }, 3000L);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            d();
        } catch (Exception e2) {
            w7i.c("BaseQuery", "query error, message = " + e2.getMessage() + ", Trace = " + Log.getStackTraceString(e2), new Object[0]);
            c(3);
        }
    }
}
