package com.heytap.accessory.base;

import android.os.Handler;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public final String a;
    public final String b;
    public int e;
    public int d = 0;
    public Handler c = com.heytap.accessory.base.thread.a.b().a("daemon");

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean a(Runnable runnable) {
        return this.c.post(runnable);
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.e;
    }

    public boolean a(Runnable runnable, long j) {
        return this.c.postDelayed(runnable, j);
    }

    public void b(int i) {
        this.e = i;
    }

    public String a() {
        return this.a;
    }

    public void a(int i) {
        this.d = i;
    }
}
