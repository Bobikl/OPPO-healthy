package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class sr0 {
    public byte[] a;
    public boolean b = false;
    public boolean c;
    public int d;
    public lt2<Void> e;

    public sr0(byte[] bArr) {
        this.a = bArr;
    }

    public void a(Throwable th, int i, String str) {
        uml.k("BTCommand", "failed: errorCode=" + i + " msg=" + str);
        lt2<Void> lt2Var = this.e;
        if (lt2Var != null) {
            lt2Var.a(th, i);
        }
    }

    public lt2<Void> b() {
        return this.e;
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
        return this.c;
    }

    public void g(lt2<Void> lt2Var) {
        this.e = lt2Var;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i) {
        this.d = i;
    }
}
