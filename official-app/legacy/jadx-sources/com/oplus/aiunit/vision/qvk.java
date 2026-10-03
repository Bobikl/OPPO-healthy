package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class qvk implements rvk {
    public static final IntBuffer t = BufferUtils.e(1);
    public final nvk i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FloatBuffer f15967j;
    public final ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15968l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15969n;
    public final int o;
    public boolean p = false;
    public boolean q = false;
    public int r = -1;
    public aca s = new aca();

    public qvk(boolean z, int i, nvk nvkVar) {
        this.f15969n = z;
        this.i = nvkVar;
        ByteBuffer byteBufferF = BufferUtils.f(nvkVar.f14665j * i);
        this.k = byteBufferF;
        FloatBuffer floatBufferAsFloatBuffer = byteBufferF.asFloatBuffer();
        this.f15967j = floatBufferAsFloatBuffer;
        this.f15968l = true;
        floatBufferAsFloatBuffer.flip();
        byteBufferF.flip();
        this.m = x38.gl20.p();
        this.o = z ? k18.GL_STATIC_DRAW : k18.GL_DYNAMIC_DRAW;
        o();
    }

    @Override // com.oplus.aiunit.vision.rvk
    public FloatBuffer a(boolean z) {
        this.p = z | this.p;
        return this.f15967j;
    }

    public final void b(wxg wxgVar, int[] iArr) {
        boolean z = this.s.b != 0;
        int size = this.i.size();
        if (z) {
            if (iArr == null) {
                for (int i = 0; z && i < size; i++) {
                    z = wxgVar.y(this.i.g(i).f) == this.s.f(i);
                }
            } else {
                z = iArr.length == this.s.b;
                for (int i2 = 0; z && i2 < size; i2++) {
                    z = iArr[i2] == this.s.f(i2);
                }
            }
        }
        if (z) {
            return;
        }
        x38.gl.K(k18.GL_ARRAY_BUFFER, this.m);
        q(wxgVar);
        this.s.d();
        for (int i3 = 0; i3 < size; i3++) {
            mvk mvkVarG = this.i.g(i3);
            if (iArr == null) {
                this.s.a(wxgVar.y(mvkVarG.f));
            } else {
                this.s.a(iArr[i3]);
            }
            int iF = this.s.f(i3);
            if (iF >= 0) {
                wxgVar.s(iF);
                wxgVar.J(iF, mvkVarG.b, mvkVarG.d, mvkVarG.f14249c, this.i.f14665j, mvkVarG.f14250e);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.rvk
    public nvk c() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public int d() {
        return (this.f15967j.limit() * 4) / this.i.f14665j;
    }

    @Override // com.oplus.aiunit.vision.rvk, com.oplus.aiunit.vision.bv5
    public void dispose() {
        l18 l18Var = x38.gl30;
        l18Var.K(k18.GL_ARRAY_BUFFER, 0);
        l18Var.c(this.m);
        this.m = 0;
        if (this.f15968l) {
            BufferUtils.b(this.k);
        }
        p();
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void e(wxg wxgVar, int[] iArr) {
        l18 l18Var = x38.gl30;
        l18Var.e(this.r);
        b(wxgVar, iArr);
        i(l18Var);
        this.q = true;
    }

    public final void i(k18 k18Var) {
        if (this.p) {
            k18Var.K(k18.GL_ARRAY_BUFFER, this.m);
            this.k.limit(this.f15967j.limit() * 4);
            k18Var.y(k18.GL_ARRAY_BUFFER, this.k.limit(), this.k, this.o);
            this.p = false;
        }
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void invalidate() {
        this.m = x38.gl30.p();
        o();
        this.p = true;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void l(wxg wxgVar, int[] iArr) {
        x38.gl30.e(0);
        this.q = false;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void m(float[] fArr, int i, int i2) {
        this.p = true;
        BufferUtils.a(fArr, this.k, i2, i);
        this.f15967j.position(0);
        this.f15967j.limit(i2);
        n();
    }

    public final void n() {
        if (this.q) {
            x38.gl20.K(k18.GL_ARRAY_BUFFER, this.m);
            x38.gl20.y(k18.GL_ARRAY_BUFFER, this.k.limit(), this.k, this.o);
            this.p = false;
        }
    }

    public final void o() {
        IntBuffer intBuffer = t;
        intBuffer.clear();
        x38.gl30.x(1, intBuffer);
        this.r = intBuffer.get();
    }

    public final void p() {
        if (this.r != -1) {
            IntBuffer intBuffer = t;
            intBuffer.clear();
            intBuffer.put(this.r);
            intBuffer.flip();
            x38.gl30.F(1, intBuffer);
            this.r = -1;
        }
    }

    public final void q(wxg wxgVar) {
        if (this.s.b == 0) {
            return;
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            int iF = this.s.f(i);
            if (iF >= 0) {
                wxgVar.q(iF);
            }
        }
    }
}
