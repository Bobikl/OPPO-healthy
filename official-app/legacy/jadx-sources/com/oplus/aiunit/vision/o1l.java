package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.Vector3;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o1l {
    public pv2 a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14737c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14738e;
    public int f;
    public int g;
    public final Vector3 h = new Vector3();

    public void a(boolean z) {
        rh8.a(this.d, this.f14738e, this.f, this.g);
        pv2 pv2Var = this.a;
        float f = this.b;
        pv2Var.f15513j = f;
        float f2 = this.f14737c;
        pv2Var.k = f2;
        if (z) {
            pv2Var.a.set(f / 2.0f, f2 / 2.0f, 0.0f);
        }
        this.a.a();
    }

    public pv2 b() {
        return this.a;
    }

    public float c() {
        return this.f14737c;
    }

    public float d() {
        return this.b;
    }

    public void e(pv2 pv2Var) {
        this.a = pv2Var;
    }

    public void f(int i, int i2, int i3, int i4) {
        this.d = i;
        this.f14738e = i2;
        this.f = i3;
        this.g = i4;
    }

    public void g(float f, float f2) {
        this.b = f;
        this.f14737c = f2;
    }
}
