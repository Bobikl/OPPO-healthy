package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class g3a {
    public boolean a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11612c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11613e;

    public g3a(boolean z) {
        this.a = z;
    }

    public String a() {
        return this.f11613e;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f11612c;
    }

    public boolean e() {
        return this.a;
    }

    public void f(String str) {
        this.f11613e = str;
    }

    public void g(String str) {
        this.d = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(String str) {
        this.f11612c = str;
    }

    public String toString() {
        return "ImageBean{is3D=" + this.a + ", icon2DUrl='" + this.b + "', icon3DUrl='" + this.f11612c + "', file3DPath='" + this.d + "', file3DMd5='" + this.f11613e + "'}";
    }
}
