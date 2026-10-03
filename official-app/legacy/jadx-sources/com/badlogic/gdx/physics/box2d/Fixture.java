package com.badlogic.gdx.physics.box2d;

import com.oplus.aiunit.vision.de7;

/* JADX INFO: loaded from: classes13.dex */
public class Fixture {
    public Body a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Shape f1269c;
    public Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de7 f1270e = new de7();
    public boolean f = true;
    public final short[] g = new short[3];

    public Fixture(Body body, long j2) {
        this.a = body;
        this.b = j2;
    }

    private native void jniGetFilterData(long j2, short[] sArr);

    private native void jniSetFriction(long j2, float f);

    private native void jniSetRestitution(long j2, float f);

    private native void jniSetSensor(long j2, boolean z);

    public Body a() {
        return this.a;
    }

    public de7 b() {
        if (this.f) {
            jniGetFilterData(this.b, this.g);
            de7 de7Var = this.f1270e;
            short[] sArr = this.g;
            de7Var.b = sArr[0];
            de7Var.a = sArr[1];
            de7Var.f10524c = sArr[2];
            this.f = false;
        }
        return this.f1270e;
    }

    public void c(Body body, long j2) {
        this.a = body;
        this.b = j2;
        this.f1269c = null;
        this.d = null;
        this.f = true;
    }

    public void d(float f) {
        jniSetFriction(this.b, f);
    }

    public void e(float f) {
        jniSetRestitution(this.b, f);
    }

    public void f(boolean z) {
        jniSetSensor(this.b, z);
    }

    public void g(Object obj) {
        this.d = obj;
    }
}
