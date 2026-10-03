package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class lvk implements rvk {
    public final nvk i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FloatBuffer f13851j;
    public final ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13852l = false;

    public lvk(int i, nvk nvkVar) {
        this.i = nvkVar;
        ByteBuffer byteBufferF = BufferUtils.f(nvkVar.f14665j * i);
        this.k = byteBufferF;
        FloatBuffer floatBufferAsFloatBuffer = byteBufferF.asFloatBuffer();
        this.f13851j = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.flip();
        byteBufferF.flip();
    }

    @Override // com.oplus.aiunit.vision.rvk
    public FloatBuffer a(boolean z) {
        return this.f13851j;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public nvk c() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public int d() {
        return (this.f13851j.limit() * 4) / this.i.f14665j;
    }

    @Override // com.oplus.aiunit.vision.rvk, com.oplus.aiunit.vision.bv5
    public void dispose() {
        BufferUtils.b(this.k);
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void e(wxg wxgVar, int[] iArr) {
        int size = this.i.size();
        this.k.limit(this.f13851j.limit() * 4);
        int i = 0;
        if (iArr == null) {
            while (i < size) {
                mvk mvkVarG = this.i.g(i);
                int iY = wxgVar.y(mvkVarG.f);
                if (iY >= 0) {
                    wxgVar.s(iY);
                    if (mvkVarG.d == 5126) {
                        this.f13851j.position(mvkVarG.f14250e / 4);
                        wxgVar.K(iY, mvkVarG.b, mvkVarG.d, mvkVarG.f14249c, this.i.f14665j, this.f13851j);
                    } else {
                        this.k.position(mvkVarG.f14250e);
                        wxgVar.K(iY, mvkVarG.b, mvkVarG.d, mvkVarG.f14249c, this.i.f14665j, this.k);
                    }
                }
                i++;
            }
        } else {
            while (i < size) {
                mvk mvkVarG2 = this.i.g(i);
                int i2 = iArr[i];
                if (i2 >= 0) {
                    wxgVar.s(i2);
                    if (mvkVarG2.d == 5126) {
                        this.f13851j.position(mvkVarG2.f14250e / 4);
                        wxgVar.K(i2, mvkVarG2.b, mvkVarG2.d, mvkVarG2.f14249c, this.i.f14665j, this.f13851j);
                    } else {
                        this.k.position(mvkVarG2.f14250e);
                        wxgVar.K(i2, mvkVarG2.b, mvkVarG2.d, mvkVarG2.f14249c, this.i.f14665j, this.k);
                    }
                }
                i++;
            }
        }
        this.f13852l = true;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void invalidate() {
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void l(wxg wxgVar, int[] iArr) {
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
        this.f13852l = false;
    }

    @Override // com.oplus.aiunit.vision.rvk
    public void m(float[] fArr, int i, int i2) {
        BufferUtils.a(fArr, this.k, i2, i);
        this.f13851j.position(0);
        this.f13851j.limit(i2);
    }
}
