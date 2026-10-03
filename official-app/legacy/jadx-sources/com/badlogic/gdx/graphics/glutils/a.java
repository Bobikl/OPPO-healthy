package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.k0c;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.x38;

/* JADX INFO: loaded from: classes13.dex */
public class a implements TextureData {
    public kb7 a;
    public ETC1.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1241c;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1242e = 0;
    public boolean f = false;

    public a(kb7 kb7Var, boolean z) {
        this.a = kb7Var;
        this.f1241c = z;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return this.f;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i) {
        if (!this.f) {
            throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
        }
        if (x38.graphics.a("GL_OES_compressed_ETC1_RGB8_texture")) {
            k18 k18Var = x38.gl;
            int i2 = ETC1.ETC1_RGB8_OES;
            int i3 = this.d;
            int i4 = this.f1242e;
            int iCapacity = this.b.k.capacity();
            ETC1.a aVar = this.b;
            k18Var.i(i, 0, i2, i3, i4, 0, iCapacity - aVar.f1235l, aVar.k);
            if (f()) {
                x38.gl20.L(k18.GL_TEXTURE_2D);
            }
        } else {
            Pixmap pixmapA = ETC1.a(this.b, Pixmap.Format.RGB565);
            x38.gl.t(i, 0, pixmapA.q(), pixmapA.u(), pixmapA.s(), 0, pixmapA.p(), pixmapA.r(), pixmapA.t());
            if (this.f1241c) {
                k0c.a(i, pixmapA, pixmapA.u(), pixmapA.s());
            }
            pixmapA.dispose();
            this.f1241c = false;
        }
        this.b.dispose();
        this.b = null;
        this.f = false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean f() {
        return this.f1241c;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return Pixmap.Format.RGB565;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f1242e;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.d;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        if (this.f) {
            throw new GdxRuntimeException("Already prepared");
        }
        kb7 kb7Var = this.a;
        if (kb7Var == null && this.b == null) {
            throw new GdxRuntimeException("Can only load once from ETC1Data");
        }
        if (kb7Var != null) {
            this.b = new ETC1.a(kb7Var);
        }
        ETC1.a aVar = this.b;
        this.d = aVar.i;
        this.f1242e = aVar.f1234j;
        this.f = true;
    }
}
