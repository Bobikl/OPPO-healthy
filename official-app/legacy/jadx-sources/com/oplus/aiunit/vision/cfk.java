package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class cfk<K> {
    public float a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f10067c;
    public final nuk d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nuk f10068e;
    public final nuk f;
    public final nuk g;
    public final s9k h;

    public cfk() {
        this(null);
    }

    public s9k a() {
        return this.h;
    }

    public cfk b(float f, float f2) {
        this.a = f;
        this.b = f2;
        return this;
    }

    public cfk c(float f, float f2) {
        this.f10068e.d(f, f2);
        return this;
    }

    public cfk d(float f, float f2) {
        this.f.d(f, f2);
        return this;
    }

    public void e(float f, float f2) {
        this.g.d(f, f2);
    }

    public void f(float f, float f2) {
        s9k s9kVar = this.h;
        s9kVar.a = f;
        s9kVar.b = f2;
    }

    public String toString() {
        return "UIItem{mTarget=" + this.f10067c + ", size=( " + this.a + "," + this.b + "), startPos =:" + this.f10068e + ", startVel =:" + this.g + ", mMoveTarget =:" + this.d + ", mStartScale =:" + this.f + ", mStartVelocity =:" + this.g + ", mTransform =:" + this.h + "}@" + hashCode();
    }

    public cfk(K k) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.d = new nuk();
        this.f10068e = new nuk();
        this.f = new nuk(1.0f, 1.0f);
        this.g = new nuk();
        this.h = new s9k();
        this.f10067c = k;
    }
}
