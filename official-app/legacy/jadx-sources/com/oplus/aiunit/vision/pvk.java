package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class pvk implements rvk {
    public final nvk i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FloatBuffer f15520j;
    public final ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15521l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15522n;
    public final int o;
    public boolean p = false;
    public boolean q = false;

    public pvk(boolean z, int i, nvk nvkVar) {
        this.f15522n = z;
        this.i = nvkVar;
        ByteBuffer byteBufferC = BufferUtils.c(nvkVar.f14665j * i);
        this.k = byteBufferC;
        this.m = true;
        this.o = z ? k18.GL_STATIC_DRAW : k18.GL_DYNAMIC_DRAW;
        FloatBuffer floatBufferAsFloatBuffer = byteBufferC.asFloatBuffer();
        this.f15520j = floatBufferAsFloatBuffer;
        this.f15521l = i();
        floatBufferAsFloatBuffer.flip();
        byteBufferC.flip();
    }

    @Override // com.oplus.aiunit.vision.rvk
    public FloatBuffer a(boolean z) {
        this.p = z | this.p;
        return this.f15520j;
    }

    public final void b() {
        if (this.q) {
            x38.gl20.s(k18.GL_ARRAY_BUFFER, 0, this.k.limit(), this.k);
            this.p = false;
        }
    }

    @Override // com.oplus.aiunit.vision.rvk
    public nvk c() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public int d() {
        return (this.f15520j.limit() * 4) / this.i.f14665j;
    }

    @Override // com.oplus.aiunit.vision.rvk, com.oplus.aiunit.vision.bv5
    public void dispose() {
        k18 k18Var = x38.gl20;
        k18Var.K(k18.GL_ARRAY_BUFFER, 0);
        k18Var.c(this.f15521l);
        this.f15521l = 0;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void e(wxg wxgVar, int[] iArr) {
        k18 k18Var = x38.gl20;
        k18Var.K(k18.GL_ARRAY_BUFFER, this.f15521l);
        int i = 0;
        if (this.p) {
            this.k.limit(this.f15520j.limit() * 4);
            k18Var.y(k18.GL_ARRAY_BUFFER, this.k.limit(), this.k, this.o);
            this.p = false;
        }
        int size = this.i.size();
        if (iArr == null) {
            while (i < size) {
                mvk mvkVarG = this.i.g(i);
                int iY = wxgVar.y(mvkVarG.f);
                if (iY >= 0) {
                    wxgVar.s(iY);
                    wxgVar.J(iY, mvkVarG.b, mvkVarG.d, mvkVarG.f14249c, this.i.f14665j, mvkVarG.f14250e);
                }
                i++;
            }
        } else {
            while (i < size) {
                mvk mvkVarG2 = this.i.g(i);
                int i2 = iArr[i];
                if (i2 >= 0) {
                    wxgVar.s(i2);
                    wxgVar.J(i2, mvkVarG2.b, mvkVarG2.d, mvkVarG2.f14249c, this.i.f14665j, mvkVarG2.f14250e);
                }
                i++;
            }
        }
        this.q = true;
    }

    public final int i() {
        int iP = x38.gl20.p();
        x38.gl20.K(k18.GL_ARRAY_BUFFER, iP);
        x38.gl20.y(k18.GL_ARRAY_BUFFER, this.k.capacity(), null, this.o);
        x38.gl20.K(k18.GL_ARRAY_BUFFER, 0);
        return iP;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void invalidate() {
        this.f15521l = i();
        this.p = true;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void l(wxg wxgVar, int[] iArr) {
        k18 k18Var = x38.gl20;
        int size = this.i.size();
        if (iArr == null) {
            for (int i = 0; i < size; i++) {
                wxgVar.r(this.i.g(i).f);
            }
        } else {
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    wxgVar.q(i3);
                }
            }
        }
        k18Var.K(k18.GL_ARRAY_BUFFER, 0);
        this.q = false;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void m(float[] fArr, int i, int i2) {
        this.p = true;
        if (this.m) {
            BufferUtils.a(fArr, this.k, i2, i);
            this.f15520j.position(0);
            this.f15520j.limit(i2);
        } else {
            this.f15520j.clear();
            this.f15520j.put(fArr, i, i2);
            this.f15520j.flip();
            this.k.position(0);
            this.k.limit(this.f15520j.limit() << 2);
        }
        b();
    }
}
