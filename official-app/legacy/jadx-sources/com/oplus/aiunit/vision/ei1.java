package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ei1 extends di1 {
    public final wh1[] a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10941c = -1;
    public boolean d = false;

    public ei1(wh1... wh1VarArr) {
        this.a = wh1VarArr;
    }

    @Override // com.oplus.aiunit.vision.di1
    public di1 a(int i) {
        this.f10941c = i;
        return this;
    }

    @Override // com.oplus.aiunit.vision.di1
    public di1 b(int i) {
        this.b = i;
        return this;
    }

    @Override // com.oplus.aiunit.vision.di1
    public di1 e() {
        this.d = true;
        return this;
    }

    public wh1[] f() {
        return this.a;
    }

    public int g() {
        return this.f10941c;
    }

    public int h() {
        return this.b;
    }

    public boolean i() {
        return this.d;
    }
}
