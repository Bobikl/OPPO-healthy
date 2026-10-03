package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

/* JADX INFO: loaded from: classes13.dex */
public class trd extends pv2 {
    public float o = 1.0f;
    public final Vector3 p = new Vector3();

    public trd() {
        this.h = 0.0f;
    }

    @Override // com.oplus.aiunit.vision.pv2
    public void a() {
        b(true);
    }

    public void b(boolean z) {
        Matrix4 matrix4 = this.d;
        float f = this.o;
        float f2 = this.f15513j;
        float f3 = this.k;
        matrix4.setToOrtho(((-f2) * f) / 2.0f, (f2 / 2.0f) * f, (-(f3 / 2.0f)) * f, (f * f3) / 2.0f, this.h, this.i);
        this.f15512e.setToLookAt(this.b, this.f15511c);
        Matrix4 matrix5 = this.f15512e;
        Vector3 vector3 = this.a;
        matrix5.translate(-vector3.x, -vector3.y, -vector3.z);
        this.f.set(this.d);
        Matrix4.mul(this.f.val, this.f15512e.val);
        if (z) {
            this.g.set(this.f);
            Matrix4.inv(this.g.val);
            this.f15514l.a(this.g);
        }
    }
}
