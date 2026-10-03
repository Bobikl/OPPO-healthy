package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class ax<T> {
    private int a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8830c = 0;
    private T d;

    public int a() {
        return this.a;
    }

    public void b(int i) {
        this.f8830c = i;
    }

    public boolean c() {
        return this.a == 200;
    }

    public String toString() {
        return "BaseResponse{code=" + this.a + ", message='" + this.b + "', flag=" + this.f8830c + ", data=" + this.d + '}';
    }

    public void a(int i) {
        this.a = i;
    }

    public boolean b() {
        return this.a == 509;
    }

    public void a(String str) {
        this.b = str;
    }
}
