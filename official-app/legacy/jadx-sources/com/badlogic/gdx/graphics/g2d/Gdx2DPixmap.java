package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.k18;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class Gdx2DPixmap implements bv5 {
    public static final int GDX2D_BLEND_NONE = 0;
    public static final int GDX2D_BLEND_SRC_OVER = 1;
    public static final int GDX2D_FORMAT_ALPHA = 1;
    public static final int GDX2D_FORMAT_LUMINANCE_ALPHA = 2;
    public static final int GDX2D_FORMAT_RGB565 = 5;
    public static final int GDX2D_FORMAT_RGB888 = 3;
    public static final int GDX2D_FORMAT_RGBA4444 = 6;
    public static final int GDX2D_FORMAT_RGBA8888 = 4;
    public static final int GDX2D_SCALE_LINEAR = 1;
    public static final int GDX2D_SCALE_NEAREST = 0;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1217j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1218l;
    public ByteBuffer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f1219n;

    public Gdx2DPixmap(byte[] bArr, int i, int i2, int i3) throws IOException {
        long[] jArr = new long[4];
        this.f1219n = jArr;
        ByteBuffer byteBufferLoad = load(jArr, bArr, i, i2);
        this.m = byteBufferLoad;
        if (byteBufferLoad == null) {
            throw new IOException("Error loading pixmap: " + getFailureReason());
        }
        long[] jArr2 = this.f1219n;
        this.i = jArr2[0];
        this.f1217j = (int) jArr2[1];
        this.k = (int) jArr2[2];
        int i4 = (int) jArr2[3];
        this.f1218l = i4;
        if (i3 == 0 || i3 == i4) {
            return;
        }
        i(i3);
    }

    private static native void clear(long j2, int i);

    private static native void drawPixmap(long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private static native void free(long j2);

    public static native String getFailureReason();

    private static native ByteBuffer load(long[] jArr, byte[] bArr, int i, int i2);

    private static native ByteBuffer newPixmap(long[] jArr, int i, int i2, int i3);

    public static String q(int i) {
        switch (i) {
            case 1:
                return "alpha";
            case 2:
                return "luminance alpha";
            case 3:
                return "rgb888";
            case 4:
                return "rgba8888";
            case 5:
                return "rgb565";
            case 6:
                return "rgba4444";
            default:
                return "unknown";
        }
    }

    private static native void setBlend(long j2, int i);

    public static int y(int i) {
        switch (i) {
            case 1:
                return k18.GL_ALPHA;
            case 2:
                return k18.GL_LUMINANCE_ALPHA;
            case 3:
            case 5:
                return k18.GL_RGB;
            case 4:
            case 6:
                return k18.GL_RGBA;
            default:
                throw new GdxRuntimeException("unknown format: " + i);
        }
    }

    public static int z(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 5121;
            case 5:
                return k18.GL_UNSIGNED_SHORT_5_6_5;
            case 6:
                return k18.GL_UNSIGNED_SHORT_4_4_4_4;
            default:
                throw new GdxRuntimeException("unknown format: " + i);
        }
    }

    public void b(int i) {
        clear(this.i, i);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        free(this.i);
    }

    public final void i(int i) {
        Gdx2DPixmap gdx2DPixmap = new Gdx2DPixmap(this.f1217j, this.k, i);
        gdx2DPixmap.x(0);
        gdx2DPixmap.n(this, 0, 0, 0, 0, this.f1217j, this.k);
        dispose();
        this.i = gdx2DPixmap.i;
        this.f1218l = gdx2DPixmap.f1218l;
        this.k = gdx2DPixmap.k;
        this.f1219n = gdx2DPixmap.f1219n;
        this.m = gdx2DPixmap.m;
        this.f1217j = gdx2DPixmap.f1217j;
    }

    public void n(Gdx2DPixmap gdx2DPixmap, int i, int i2, int i3, int i4, int i5, int i6) {
        drawPixmap(gdx2DPixmap.i, this.i, i, i2, i5, i6, i3, i4, i5, i6);
    }

    public void o(Gdx2DPixmap gdx2DPixmap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        drawPixmap(gdx2DPixmap.i, this.i, i, i2, i3, i4, i5, i6, i7, i8);
    }

    public int p() {
        return this.f1218l;
    }

    public int r() {
        return s();
    }

    public int s() {
        return y(this.f1218l);
    }

    public int t() {
        return z(this.f1218l);
    }

    public int u() {
        return this.k;
    }

    public ByteBuffer v() {
        return this.m;
    }

    public int w() {
        return this.f1217j;
    }

    public void x(int i) {
        setBlend(this.i, i);
    }

    public Gdx2DPixmap(int i, int i2, int i3) throws GdxRuntimeException {
        long[] jArr = new long[4];
        this.f1219n = jArr;
        ByteBuffer byteBufferNewPixmap = newPixmap(jArr, i, i2, i3);
        this.m = byteBufferNewPixmap;
        if (byteBufferNewPixmap != null) {
            long[] jArr2 = this.f1219n;
            this.i = jArr2[0];
            this.f1217j = (int) jArr2[1];
            this.k = (int) jArr2[2];
            this.f1218l = (int) jArr2[3];
            return;
        }
        throw new GdxRuntimeException("Unable to allocate memory for pixmap: " + i + "x" + i2 + ", " + q(i3));
    }
}
