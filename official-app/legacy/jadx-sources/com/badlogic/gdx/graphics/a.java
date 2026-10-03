package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.BufferUtils;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.k0c;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.onb;
import com.oplus.aiunit.vision.x38;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements bv5 {
    public static float p;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1214j;
    public Texture.TextureFilter k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Texture.TextureFilter f1215l;
    public Texture.TextureWrap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Texture.TextureWrap f1216n;
    public float o;

    public a(int i) {
        this(i, x38.gl.b());
    }

    public static float n() {
        float f = p;
        if (f > 0.0f) {
            return f;
        }
        if (!x38.graphics.a("GL_EXT_texture_filter_anisotropic")) {
            p = 1.0f;
            return 1.0f;
        }
        FloatBuffer floatBufferD = BufferUtils.d(16);
        floatBufferD.position(0);
        floatBufferD.limit(floatBufferD.capacity());
        x38.gl20.j(k18.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT, floatBufferD);
        float f2 = floatBufferD.get(0);
        p = f2;
        return f2;
    }

    public static void x(int i, TextureData textureData) {
        y(i, textureData, 0);
    }

    public static void y(int i, TextureData textureData, int i2) {
        if (textureData == null) {
            return;
        }
        if (!textureData.a()) {
            textureData.prepare();
        }
        if (textureData.getType() == TextureData.TextureDataType.Custom) {
            textureData.c(i);
            return;
        }
        Pixmap pixmapD = textureData.d();
        boolean zG = textureData.g();
        if (textureData.getFormat() != pixmapD.o()) {
            Pixmap pixmap = new Pixmap(pixmapD.u(), pixmapD.s(), textureData.getFormat());
            pixmap.v(Pixmap.Blending.None);
            pixmap.b(pixmapD, 0, 0, 0, 0, pixmapD.u(), pixmapD.s());
            if (textureData.g()) {
                pixmapD.dispose();
            }
            pixmapD = pixmap;
            zG = true;
        }
        x38.gl.h(k18.GL_UNPACK_ALIGNMENT, 1);
        if (textureData.f()) {
            k0c.a(i, pixmapD, pixmapD.u(), pixmapD.s());
        } else {
            x38.gl.t(i, i2, pixmapD.q(), pixmapD.u(), pixmapD.s(), 0, pixmapD.p(), pixmapD.r(), pixmapD.t());
        }
        if (zG) {
            pixmapD.dispose();
        }
    }

    public void b() {
        int i = this.f1214j;
        if (i != 0) {
            x38.gl.e0(i);
            this.f1214j = 0;
        }
    }

    public void bind() {
        x38.gl.Y(this.i, this.f1214j);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        b();
    }

    public Texture.TextureFilter i() {
        return this.f1215l;
    }

    public Texture.TextureFilter o() {
        return this.k;
    }

    public int p() {
        return this.f1214j;
    }

    public Texture.TextureWrap q() {
        return this.m;
    }

    public Texture.TextureWrap r() {
        return this.f1216n;
    }

    public void s(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2) {
        this.k = textureFilter;
        this.f1215l = textureFilter2;
        bind();
        x38.gl.n(this.i, k18.GL_TEXTURE_MIN_FILTER, textureFilter.getGLEnum());
        x38.gl.n(this.i, 10240, textureFilter2.getGLEnum());
    }

    public void t(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.m = textureWrap;
        this.f1216n = textureWrap2;
        bind();
        x38.gl.n(this.i, k18.GL_TEXTURE_WRAP_S, textureWrap.getGLEnum());
        x38.gl.n(this.i, k18.GL_TEXTURE_WRAP_T, textureWrap2.getGLEnum());
    }

    public float u(float f, boolean z) {
        float fN = n();
        if (fN == 1.0f) {
            return 1.0f;
        }
        float fMin = Math.min(f, fN);
        if (!z && onb.h(fMin, this.o, 0.1f)) {
            return this.o;
        }
        x38.gl20.w(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_MAX_ANISOTROPY_EXT, fMin);
        this.o = fMin;
        return fMin;
    }

    public void v(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z) {
        if (textureFilter != null && (z || this.k != textureFilter)) {
            x38.gl.n(this.i, k18.GL_TEXTURE_MIN_FILTER, textureFilter.getGLEnum());
            this.k = textureFilter;
        }
        if (textureFilter2 != null) {
            if (z || this.f1215l != textureFilter2) {
                x38.gl.n(this.i, 10240, textureFilter2.getGLEnum());
                this.f1215l = textureFilter2;
            }
        }
    }

    public void w(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2, boolean z) {
        if (textureWrap != null && (z || this.m != textureWrap)) {
            x38.gl.n(this.i, k18.GL_TEXTURE_WRAP_S, textureWrap.getGLEnum());
            this.m = textureWrap;
        }
        if (textureWrap2 != null) {
            if (z || this.f1216n != textureWrap2) {
                x38.gl.n(this.i, k18.GL_TEXTURE_WRAP_T, textureWrap2.getGLEnum());
                this.f1216n = textureWrap2;
            }
        }
    }

    public a(int i, int i2) {
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
        this.k = textureFilter;
        this.f1215l = textureFilter;
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        this.m = textureWrap;
        this.f1216n = textureWrap;
        this.o = 1.0f;
        this.i = i;
        this.f1214j = i2;
    }
}
