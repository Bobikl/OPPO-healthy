package com.heytap.accessory.base;

import android.os.Handler;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2423e;
    public int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f2422c = com.heytap.accessory.base.thread.a.b().a("daemon");

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean a(Runnable runnable) {
        return this.f2422c.post(runnable);
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.f2423e;
    }

    public boolean a(Runnable runnable, long j2) {
        return this.f2422c.postDelayed(runnable, j2);
    }

    public void b(int i) {
        this.f2423e = i;
    }

    public String a() {
        return this.a;
    }

    public void a(int i) {
        this.d = i;
    }
}
