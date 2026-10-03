package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class w9f {
    public boolean a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18175c = yxj.d(6, 0);
    public int d = yxj.d(23, 0);

    public static w9f a() {
        w9f w9fVar = new w9f();
        w9fVar.a = true;
        w9fVar.b = false;
        w9fVar.f18175c = yxj.d(6, 0);
        w9fVar.d = yxj.d(23, 0);
        return w9fVar;
    }

    public w9f b() {
        w9f w9fVar = new w9f();
        w9fVar.a = this.a;
        w9fVar.b = this.b;
        w9fVar.f18175c = this.f18175c;
        w9fVar.d = this.d;
        return w9fVar;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return sc8.g(this);
    }

    public int e() {
        return this.f18175c;
    }

    public boolean f() {
        return this.b;
    }

    public boolean g() {
        return this.a;
    }

    public void h(w9f w9fVar) {
        this.a = w9fVar.a;
        this.b = w9fVar.b;
        this.f18175c = w9fVar.f18175c;
        this.d = w9fVar.d;
    }

    public void i(boolean z) {
        this.b = z;
        if (z) {
            this.f18175c = yxj.d(0, 0);
            this.d = yxj.d(23, 59);
        } else {
            this.f18175c = yxj.d(6, 0);
            this.d = yxj.d(23, 0);
        }
    }

    public void j(int i) {
        this.d = i;
    }

    public void k(boolean z) {
        this.a = z;
    }

    public void l(int i) {
        this.f18175c = i;
    }
}
