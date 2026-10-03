package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class tge {
    public static final int CHOOSE_BIRTHDAY = 1;
    public static final int CHOOSE_GENDER = 0;
    public static final int CHOOSE_HEIGHT = 2;
    public static final int CHOOSE_NONE = -1;
    public static final int CHOOSE_WEIGHT = 3;
    public static int NONE = -1;
    public static int TYPE_FEMALE = 0;
    public static int TYPE_MALE = 1;
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16999c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17000e;

    public tge() {
        int i = NONE;
        this.a = i;
        this.f16999c = i;
        this.d = i;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.f17000e;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.f16999c;
    }

    public int e() {
        return this.d;
    }

    public void f(String str) {
        this.b = str;
    }

    public void g(int i) {
        this.f17000e = i;
    }

    public void h(int i) {
        this.a = i;
    }

    public void i(int i) {
        this.f16999c = i;
    }

    public void j(int i) {
        this.d = i;
    }
}
