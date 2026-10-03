package com.oplus.aiunit.vision;

import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes12.dex */
public class nym {
    public static volatile nym r;
    public boolean a = true;
    public boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14695c = true;
    public boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14696e = true;
    public boolean f = true;
    public boolean g = true;
    public int h = 25;
    public int i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14697j = 100;
    public int k = 100;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14698l = 6;
    public int m = 100;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14699n = 5000;
    public int o = 1200;
    public int p = 100000000;
    public int q = 16;

    public static nym a() {
        if (r == null) {
            synchronized (nym.class) {
                if (r == null) {
                    r = new nym();
                }
            }
        }
        return r;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(String str) throws AMapException {
        if (str != null && this.b && str.length() > this.i) {
            throw new AMapException(AMapException.AMAP_CLIENT_OVER_KEYWORD_LEN_MAX_COUNT_EXCEPTION);
        }
    }

    public final void d(boolean z) {
        this.a = z;
    }

    public final void e(int i) {
        this.i = i;
    }

    public final void f(boolean z) {
        this.f14695c = z;
    }

    public final void g(int i) {
        this.f14697j = i;
    }

    public final void h(boolean z) {
        this.d = z;
    }

    public final void i(int i) {
        this.k = i;
    }

    public final void j(boolean z) {
        this.f14696e = z;
    }

    public final void k(int i) {
        this.f14698l = i;
    }

    public final void l(boolean z) {
        this.f = z;
    }

    public final void m(int i) {
        this.m = i;
    }

    public final void n(boolean z) {
        this.g = z;
    }

    public final void o(int i) {
        this.f14699n = i;
    }

    public final void p(boolean z) {
        this.b = z;
    }

    public final void q(int i) {
        this.o = i;
    }

    public final void r(int i) {
        this.p = i;
    }

    public final void s(int i) {
        this.q = i;
    }

    public final int t(int i) {
        int i2;
        return (this.d && (i2 = this.m) < i) ? i2 : i;
    }

    public final int u(int i) {
        int i2;
        return (this.d && (i2 = this.h) < i) ? i2 : i;
    }
}
