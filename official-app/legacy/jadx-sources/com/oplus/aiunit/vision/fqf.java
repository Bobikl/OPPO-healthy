package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class fqf<T> {
    public int a;
    public T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11466c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11467e;

    public fqf(int i, T t, int i2, int i3) {
        this.a = i;
        this.b = t;
        this.d = i2;
        this.f11467e = i3;
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.f11467e;
    }

    public long d() {
        return this.f11466c;
    }

    public int e() {
        return this.d;
    }

    public String toString() {
        return "RequestBean{data=" + this.b + ", timeStamp=" + this.f11466c + ", timeout=" + this.d + ", retry=" + this.f11467e + '}';
    }

    public fqf(int i, T t, long j2, int i2, int i3) {
        this.a = i;
        this.b = t;
        this.f11466c = j2;
        this.d = i2;
        this.f11467e = i3;
    }
}
