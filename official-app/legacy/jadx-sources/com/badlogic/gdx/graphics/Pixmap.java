package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.mk3;
import com.oplus.aiunit.vision.x38;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class Pixmap implements bv5 {
    public final Gdx2DPixmap k;
    public boolean m;
    public Blending i = Blending.SourceOver;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Filter f1212j = Filter.BiLinear;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1213l = 0;

    public enum Blending {
        None,
        SourceOver
    }

    public enum Filter {
        NearestNeighbour,
        BiLinear
    }

    public enum Format {
        Alpha,
        Intensity,
        LuminanceAlpha,
        RGB565,
        RGBA4444,
        RGB888,
        RGBA8888;

        public static Format fromGdx2DPixmapFormat(int i) {
            if (i == 1) {
                return Alpha;
            }
            if (i == 2) {
                return LuminanceAlpha;
            }
            if (i == 5) {
                return RGB565;
            }
            if (i == 6) {
                return RGBA4444;
            }
            if (i == 3) {
                return RGB888;
            }
            if (i == 4) {
                return RGBA8888;
            }
            throw new GdxRuntimeException("Unknown Gdx2DPixmap Format: " + i);
        }

        public static int toGdx2DPixmapFormat(Format format) {
            if (format == Alpha || format == Intensity) {
                return 1;
            }
            if (format == LuminanceAlpha) {
                return 2;
            }
            if (format == RGB565) {
                return 5;
            }
            if (format == RGBA4444) {
                return 6;
            }
            if (format == RGB888) {
                return 3;
            }
            if (format == RGBA8888) {
                return 4;
            }
            throw new GdxRuntimeException("Unknown Format: " + format);
        }

        public static int toGlFormat(Format format) {
            return Gdx2DPixmap.y(toGdx2DPixmapFormat(format));
        }

        public static int toGlType(Format format) {
            return Gdx2DPixmap.z(toGdx2DPixmapFormat(format));
        }
    }

    public Pixmap(int i, int i2, Format format) {
        this.k = new Gdx2DPixmap(i, i2, Format.toGdx2DPixmapFormat(format));
        w(0.0f, 0.0f, 0.0f, 0.0f);
        n();
    }

    public void b(Pixmap pixmap, int i, int i2, int i3, int i4, int i5, int i6) {
        this.k.n(pixmap.k, i3, i4, i, i2, i5, i6);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        if (this.m) {
            x38.app.error("Pixmap", "Pixmap already disposed!");
        } else {
            this.k.dispose();
            this.m = true;
        }
    }

    public void i(Pixmap pixmap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.k.o(pixmap.k, i, i2, i3, i4, i5, i6, i7, i8);
    }

    public void n() {
        this.k.b(this.f1213l);
    }

    public Format o() {
        return Format.fromGdx2DPixmapFormat(this.k.p());
    }

    public int p() {
        return this.k.r();
    }

    public int q() {
        return this.k.s();
    }

    public int r() {
        return this.k.t();
    }

    public int s() {
        return this.k.u();
    }

    public ByteBuffer t() {
        if (this.m) {
            throw new GdxRuntimeException("Pixmap already disposed");
        }
        return this.k.v();
    }

    public int u() {
        return this.k.w();
    }

    public void v(Blending blending) {
        this.i = blending;
        this.k.x(blending == Blending.None ? 0 : 1);
    }

    public void w(float f, float f2, float f3, float f4) {
        this.f1213l = mk3.b(f, f2, f3, f4);
    }

    public Pixmap(kb7 kb7Var) {
        try {
            byte[] bArrN = kb7Var.n();
            this.k = new Gdx2DPixmap(bArrN, 0, bArrN.length, 0);
        } catch (Exception e2) {
            throw new GdxRuntimeException("Couldn't load file: " + kb7Var, e2);
        }
    }
}
