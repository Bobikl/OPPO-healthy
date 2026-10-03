package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes5.dex */
public class br0 {
    public byte[] a;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9821c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xs2<Void> f9822e;

    public br0(byte[] bArr) {
        this.a = bArr;
    }

    public void a(Throwable th, int i, String str) {
        wil.k("BTCommand", "failed: errorCode=" + i + " msg=" + str);
        xs2<Void> xs2Var = this.f9822e;
        if (xs2Var != null) {
            xs2Var.a(th, i);
        }
    }

    public xs2<Void> b() {
        return this.f9822e;
    }

    public byte[] c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.b;
    }

    public boolean f() {
        return this.f9821c;
    }

    public void g(xs2<Void> xs2Var) {
        this.f9822e = xs2Var;
    }

    public void h(boolean z) {
        this.f9821c = z;
    }

    public void i(int i) {
        this.d = i;
    }
}
