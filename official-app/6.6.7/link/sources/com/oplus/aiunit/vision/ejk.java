package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ejk<K> {
    public float a;
    public float b;
    public K c;
    public final lyk d;
    public final lyk e;
    public final lyk f;
    public final lyk g;
    public final udk h;

    public ejk() {
        this(null);
    }

    public udk a() {
        return this.h;
    }

    public ejk b(float f, float f2) {
        this.a = f;
        this.b = f2;
        return this;
    }

    public ejk c(float f, float f2) {
        this.e.d(f, f2);
        return this;
    }

    public ejk d(float f, float f2) {
        this.f.d(f, f2);
        return this;
    }

    public void e(float f, float f2) {
        this.g.d(f, f2);
    }

    public void f(float f, float f2) {
        udk udkVar = this.h;
        udkVar.a = f;
        udkVar.b = f2;
    }

    public String toString() {
        return "UIItem{mTarget=" + this.c + ", size=( " + this.a + d14.COMMA_REGEX + this.b + "), startPos =:" + this.e + ", startVel =:" + this.g + ", mMoveTarget =:" + this.d + ", mStartScale =:" + this.f + ", mStartVelocity =:" + this.g + ", mTransform =:" + this.h + "}@" + hashCode();
    }

    public ejk(K k) {
        this.a = vr3.UNSET;
        this.b = vr3.UNSET;
        this.d = new lyk();
        this.e = new lyk();
        this.f = new lyk(1.0f, 1.0f);
        this.g = new lyk();
        this.h = new udk();
        this.c = k;
    }
}
