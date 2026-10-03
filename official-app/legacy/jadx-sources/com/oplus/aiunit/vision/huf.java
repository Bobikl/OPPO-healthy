package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class huf<T> {
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12277c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f12278e;

    public int a() {
        return this.a;
    }

    public T b() {
        return this.f12278e;
    }

    public int c() {
        return this.f12277c;
    }

    public long d() {
        return this.d;
    }

    public void e(int i) {
        this.a = i;
    }

    public void f(T t) {
        this.f12278e = t;
    }

    public void g(String str) {
        this.b = str;
    }

    public void h(int i) {
        this.f12277c = i;
    }

    public void i(long j2) {
        this.d = j2;
    }

    public String toString() {
        return "ResponseResult{code=" + this.a + ", nodeId='" + gdb.a(this.b) + "', state=" + this.f12277c + ", timeStamp=" + this.d + ", data=" + this.f12278e + '}';
    }
}
