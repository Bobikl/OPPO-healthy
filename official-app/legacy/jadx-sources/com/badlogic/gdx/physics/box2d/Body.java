package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.oplus.aiunit.vision.br7;
import com.oplus.aiunit.vision.de7;
import com.oplus.aiunit.vision.ehb;
import com.oplus.aiunit.vision.t9k;
import com.oplus.aiunit.vision.via;
import com.oplus.aiunit.vision.wg0;

/* JADX INFO: loaded from: classes13.dex */
public class Body {
    public long a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final World f1255c;
    public Object f;
    public final float[] b = new float[4];
    public wg0<Fixture> d = new wg0<>(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wg0<via> f1256e = new wg0<>(2);
    public final t9k g = new t9k();
    public final Vector2 h = new Vector2();
    public final Vector2 i = new Vector2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Vector2 f1257j = new Vector2();
    public final Vector2 k = new Vector2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ehb f1258l = new ehb();
    public final Vector2 m = new Vector2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Vector2 f1259n = new Vector2();
    public final Vector2 o = new Vector2();
    public final Vector2 p = new Vector2();
    public final Vector2 q = new Vector2();
    public final Vector2 r = new Vector2();

    public Body(World world, long j2) {
        this.f1255c = world;
        this.a = j2;
    }

    private native long jniCreateFixture(long j2, long j3, float f);

    private native long jniCreateFixture(long j2, long j3, float f, float f2, float f3, boolean z, short s, short s2, short s3);

    private native float jniGetAngle(long j2);

    private native void jniGetLinearVelocity(long j2, float[] fArr);

    private native void jniGetPosition(long j2, float[] fArr);

    private native boolean jniIsAwake(long j2);

    private native void jniSetAngularVelocity(long j2, float f);

    private native void jniSetAwake(long j2, boolean z);

    public Fixture a(Shape shape, float f) {
        long jJniCreateFixture = jniCreateFixture(this.a, shape.i, f);
        Fixture fixtureD = this.f1255c.f1276j.d();
        fixtureD.c(this, jJniCreateFixture);
        this.f1255c.m.f(fixtureD.b, fixtureD);
        this.d.a(fixtureD);
        return fixtureD;
    }

    public Fixture b(br7 br7Var) {
        long j2 = this.a;
        long j3 = br7Var.a.i;
        float f = br7Var.b;
        float f2 = br7Var.f9825c;
        float f3 = br7Var.d;
        boolean z = br7Var.f9826e;
        de7 de7Var = br7Var.f;
        long jJniCreateFixture = jniCreateFixture(j2, j3, f, f2, f3, z, de7Var.a, de7Var.b, de7Var.f10524c);
        Fixture fixtureD = this.f1255c.f1276j.d();
        fixtureD.c(this, jJniCreateFixture);
        this.f1255c.m.f(fixtureD.b, fixtureD);
        this.d.a(fixtureD);
        return fixtureD;
    }

    public float c() {
        return jniGetAngle(this.a);
    }

    public wg0<Fixture> d() {
        return this.d;
    }

    public wg0<via> e() {
        return this.f1256e;
    }

    public Vector2 f() {
        jniGetLinearVelocity(this.a, this.b);
        Vector2 vector2 = this.k;
        float[] fArr = this.b;
        vector2.x = fArr[0];
        vector2.y = fArr[1];
        return vector2;
    }

    public Vector2 g() {
        jniGetPosition(this.a, this.b);
        Vector2 vector2 = this.h;
        float[] fArr = this.b;
        vector2.x = fArr[0];
        vector2.y = fArr[1];
        return vector2;
    }

    public Object h() {
        return this.f;
    }

    public boolean i() {
        return jniIsAwake(this.a);
    }

    public void j(long j2) {
        this.a = j2;
        this.f = null;
        int i = 0;
        while (true) {
            wg0<Fixture> wg0Var = this.d;
            if (i >= wg0Var.f18241j) {
                wg0Var.clear();
                this.f1256e.clear();
                return;
            } else {
                this.f1255c.f1276j.b(wg0Var.get(i));
                i++;
            }
        }
    }

    public void k(float f) {
        jniSetAngularVelocity(this.a, f);
    }

    public void l(boolean z) {
        jniSetAwake(this.a, z);
    }

    public void m(Object obj) {
        this.f = obj;
    }
}
