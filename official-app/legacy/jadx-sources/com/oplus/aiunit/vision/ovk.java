package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class ovk implements rvk {
    public nvk i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FloatBuffer f15084j;
    public ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15085l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15086n;
    public boolean o = false;
    public boolean p = false;
    public int m = x38.gl20.p();

    public ovk(boolean z, int i, nvk nvkVar) {
        ByteBuffer byteBufferF = BufferUtils.f(nvkVar.f14665j * i);
        byteBufferF.limit(0);
        i(byteBufferF, true, nvkVar);
        n(z ? k18.GL_STATIC_DRAW : k18.GL_DYNAMIC_DRAW);
    }

    @Override // com.oplus.aiunit.vision.rvk
    public FloatBuffer a(boolean z) {
        this.o = z | this.o;
        return this.f15084j;
    }

    public final void b() {
        if (this.p) {
            x38.gl20.y(k18.GL_ARRAY_BUFFER, this.k.limit(), this.k, this.f15086n);
            this.o = false;
        }
    }

    @Override // com.oplus.aiunit.vision.rvk
    public nvk c() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public int d() {
        return (this.f15084j.limit() * 4) / this.i.f14665j;
    }

    @Override // com.oplus.aiunit.vision.rvk, com.oplus.aiunit.vision.bv5
    public void dispose() {
        k18 k18Var = x38.gl20;
        k18Var.K(k18.GL_ARRAY_BUFFER, 0);
        k18Var.c(this.m);
        this.m = 0;
        if (this.f15085l) {
            BufferUtils.b(this.k);
        }
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void e(wxg wxgVar, int[] iArr) {
        k18 k18Var = x38.gl20;
        k18Var.K(k18.GL_ARRAY_BUFFER, this.m);
        int i = 0;
        if (this.o) {
            this.k.limit(this.f15084j.limit() * 4);
            k18Var.y(k18.GL_ARRAY_BUFFER, this.k.limit(), this.k, this.f15086n);
            this.o = false;
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
        this.p = true;
    }

    public void i(Buffer buffer, boolean z, nvk nvkVar) {
        ByteBuffer byteBuffer;
        if (this.p) {
            throw new GdxRuntimeException("Cannot change attributes while VBO is bound");
        }
        if (this.f15085l && (byteBuffer = this.k) != null) {
            BufferUtils.b(byteBuffer);
        }
        this.i = nvkVar;
        if (!(buffer instanceof ByteBuffer)) {
            throw new GdxRuntimeException("Only ByteBuffer is currently supported");
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) buffer;
        this.k = byteBuffer2;
        this.f15085l = z;
        int iLimit = byteBuffer2.limit();
        ByteBuffer byteBuffer3 = this.k;
        byteBuffer3.limit(byteBuffer3.capacity());
        this.f15084j = this.k.asFloatBuffer();
        this.k.limit(iLimit);
        this.f15084j.limit(iLimit / 4);
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void invalidate() {
        this.m = x38.gl20.p();
        this.o = true;
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
        this.p = false;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void m(float[] fArr, int i, int i2) {
        this.o = true;
        BufferUtils.a(fArr, this.k, i2, i);
        this.f15084j.position(0);
        this.f15084j.limit(i2);
        b();
    }

    public void n(int i) {
        if (this.p) {
            throw new GdxRuntimeException("Cannot change usage while VBO is bound");
        }
        this.f15086n = i;
    }
}
