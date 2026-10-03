package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class o97 {
    public static final int RESULT_ERROR = 3;
    public static final int RESULT_SUCCESS_N = 2;
    public static final int RESULT_SUCCESS_Y = 1;
    public final n97 a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14847c;
    public int d;

    public o97(n97 n97Var, int i) {
        this.a = n97Var;
        this.b = i;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f14847c;
    }

    public boolean c() {
        return this.b != 3;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(int i) {
        this.f14847c = i;
    }
}
