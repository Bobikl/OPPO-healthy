package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.gl.RenderObject;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgram;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D;
import com.heytap.wearable.support.watchface.gl.material.Texture;

/* JADX INFO: loaded from: classes2.dex */
public class es extends kzk {
    public static final int AI_SHADER_TYPE_0 = 0;
    public static final int AI_SHADER_TYPE_1 = 1;
    public static final int AI_SHADER_TYPE_2 = 2;
    public static final int AI_SHADER_TYPE_3 = 3;
    public static final int AI_SHADER_TYPE_MAX = 3;
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_VIDEO = 0;
    public float[] E;
    public float[] F;
    public float[] G;
    public float[] H;
    public int I;
    public boolean J;
    public Bitmap K;
    public ShaderProgram L;
    public Texture[] M;
    public RenderObject N;
    public String O;
    public boolean P;
    public boolean Q;

    public es(Context context, com.heytap.wearable.support.watchface.engine.gl.a aVar, kzk.a aVar2, String str, String str2) {
        super(context, aVar, aVar2, str, str2);
        this.E = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        this.F = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.G = new float[]{0.0f, 1.0f, 0.0f, 1.0f};
        this.H = new float[]{0.0f, 0.0f, 1.0f, 1.0f};
        this.I = 0;
        this.J = false;
        this.L = new ShaderProgram3D();
        this.N = new RenderObject();
        this.P = false;
        this.Q = false;
    }

    public static void B(float[] fArr, int i) {
        fArr[3] = (((-16777216) & i) >> 24) / 255.0f;
        fArr[0] = ((16711680 & i) >> 16) / 255.0f;
        fArr[1] = ((65280 & i) >> 8) / 255.0f;
        fArr[2] = (i & 255) / 255.0f;
    }

    public static float F(float f, float f2) {
        return f2 > f ? 1.0f : 0.0f;
    }

    public static Bitmap t(Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        float[] fArr4 = new float[4];
        float[] fArr5 = new float[4];
        B(fArr2, i);
        B(fArr3, i2);
        B(fArr4, i3);
        B(fArr5, i4);
        if (i5 == 0) {
            for (int i6 = 0; i6 < bitmap.getWidth(); i6++) {
                for (int i7 = 0; i7 < bitmap.getHeight(); i7++) {
                    B(fArr, bitmap.getPixel(i6, i7));
                    bitmapCreateBitmap.setPixel(i6, i7, u(fArr, fArr2, fArr3, fArr4, fArr5));
                }
            }
        } else if (i5 == 1) {
            for (int i8 = 0; i8 < bitmap.getWidth(); i8++) {
                for (int i9 = 0; i9 < bitmap.getHeight(); i9++) {
                    B(fArr, bitmap.getPixel(i8, i9));
                    bitmapCreateBitmap.setPixel(i8, i9, v(fArr, fArr2, fArr3, fArr4, fArr5));
                }
            }
        } else if (i5 == 2) {
            for (int i10 = 0; i10 < bitmap.getWidth(); i10++) {
                for (int i11 = 0; i11 < bitmap.getHeight(); i11++) {
                    B(fArr, bitmap.getPixel(i10, i11));
                    bitmapCreateBitmap.setPixel(i10, i11, w(fArr, fArr2, fArr3, fArr4, fArr5));
                }
            }
        } else if (i5 == 3) {
            for (int i12 = 0; i12 < bitmap.getWidth(); i12++) {
                for (int i13 = 0; i13 < bitmap.getHeight(); i13++) {
                    B(fArr, bitmap.getPixel(i12, i13));
                    bitmapCreateBitmap.setPixel(i12, i13, x(fArr, fArr2, fArr3, fArr4, fArr5));
                }
            }
        }
        return bitmapCreateBitmap;
    }

    public static int u(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        float F = F(0.99f, fArr[0]) * F(0.99f, fArr[1]) * F(0.99f, fArr[2]);
        float F2 = F(0.99f, 1.0f - fArr[0]) * F(0.99f, 1.0f - fArr[1]) * F(0.99f, 1.0f - fArr[2]);
        float[] fArr6 = {F, F, F, 1.0f};
        float[] fArr7 = {fArr2[0] * F2, fArr2[1] * F2, fArr2[2] * F2, 1.0f};
        float f = fArr[0] * fArr3[0];
        float f2 = fArr[1];
        float f3 = f + (fArr4[0] * f2);
        float f4 = fArr[2];
        float f5 = f3 + (fArr5[0] * f4);
        float f6 = fArr[0];
        float f7 = (1.0f - F) - F2;
        return (((int) (1.0f * 255.0f)) << 24) + 0 + (((int) (((fArr6[0] + (f5 * f7)) + fArr7[0]) * 255.0f)) << 16) + (((int) (((fArr6[1] + ((((fArr3[1] * f6) + (f2 * fArr4[1])) + (fArr5[1] * f4)) * f7)) + fArr7[1]) * 255.0f)) << 8) + ((int) ((fArr6[2] + (f7 * ((f6 * fArr3[2]) + (fArr[1] * fArr4[2]) + (f4 * fArr5[2]))) + fArr7[2]) * 255.0f));
    }

    public static int v(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        float F = F(0.99f, fArr[0]) * F(0.99f, fArr[1]) * F(0.99f, fArr[2]);
        float F2 = F(0.99f, 1.0f - fArr[0]) * F(0.99f, 1.0f - fArr[1]) * F(0.99f, 1.0f - fArr[2]);
        float[] fArr6 = {F, F, F, 1.0f};
        float[] fArr7 = {fArr2[0] * F2, fArr2[1] * F2, fArr2[2] * F2, 1.0f};
        float fMin = Math.min(Math.min(fArr[0], Math.min(fArr[1], fArr[2])), 0.2f);
        fArr[0] = Math.max(fArr[0] - fMin, 0.0f);
        fArr[1] = Math.max(fArr[1] - fMin, 0.0f);
        float fMax = Math.max(fArr[2] - fMin, 0.0f);
        fArr[2] = fMax;
        float fMax2 = Math.max(fArr[0] + fArr[1] + fMax, 0.001f);
        float f = fArr[0] / fMax2;
        fArr[0] = f;
        float f2 = fArr[1] / fMax2;
        fArr[1] = f2;
        float f3 = fArr[2] / fMax2;
        fArr[2] = f3;
        float f4 = (f * fArr3[0]) + (fArr4[0] * f2) + (fArr5[0] * f3);
        float f5 = fArr[0];
        float f6 = (1.0f - F) - F2;
        return (((int) (1.0f * 255.0f)) << 24) + 0 + (((int) (((fArr6[0] + (f4 * f6)) + fArr7[0]) * 255.0f)) << 16) + (((int) (((fArr6[1] + ((((fArr3[1] * f5) + (f2 * fArr4[1])) + (fArr5[1] * f3)) * f6)) + fArr7[1]) * 255.0f)) << 8) + ((int) ((fArr6[2] + (f6 * ((f5 * fArr3[2]) + (fArr[1] * fArr4[2]) + (f3 * fArr5[2]))) + fArr7[2]) * 255.0f));
    }

    public static int w(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        float F = F(0.92f, 1.0f - fArr[0]) * F(0.92f, 1.0f - fArr[1]) * F(0.92f, 1.0f - fArr[2]);
        float[] fArr6 = {fArr2[0] * F, fArr2[1] * F, fArr2[2] * F, 1.0f};
        float fMin = Math.min(Math.min(fArr[0], Math.min(fArr[1], fArr[2])), 0.2f);
        float fMax = Math.max(fArr[0], Math.max(fArr[1], fArr[2]));
        float fMax2 = Math.max(fArr[2] - fMin, 0.0f);
        float[] fArr7 = {Math.max(fArr[0] - fMin, 0.0f), Math.max(fArr[1] - fMin, 0.0f), fMax2, 0.0f};
        float fMax3 = Math.max(fArr7[0] + fArr7[1] + fMax2, 0.001f);
        fArr7[0] = fArr7[0] / fMax3;
        fArr7[1] = fArr7[1] / fMax3;
        fArr7[2] = fArr7[2] / fMax3;
        float F2 = F(0.7f, 1.0f - fArr[0]);
        float F3 = F(0.7f, 1.0f - fArr[1]);
        float F4 = F(0.7f, 1.0f - fArr[2]);
        float f = F3 * F4;
        float f2 = F4 * F2;
        float f3 = F2 * F3;
        float fZ = z(fArr7[0], F(fMax, fArr[0] + 0.001f) * fArr[0], f);
        float fZ2 = z(fArr7[1], F(fMax, fArr[1] + 0.001f) * fArr[1], f2);
        float fZ3 = z(fArr7[2], F(fMax, fArr[2] + 0.001f) * fArr[2], f3);
        float f4 = 1.0f - F;
        return (((int) (1.0f * 255.0f)) << 24) + 0 + (((int) ((((((fArr3[0] * fZ) + (fArr4[0] * fZ2)) + (fArr5[0] * fZ3)) * f4) + fArr6[0]) * 255.0f)) << 16) + (((int) ((((((fArr3[1] * fZ) + (fArr4[1] * fZ2)) + (fArr5[1] * fZ3)) * f4) + fArr6[1]) * 255.0f)) << 8) + ((int) (((f4 * ((fZ * fArr3[2]) + (fZ2 * fArr4[2]) + (fZ3 * fArr5[2]))) + fArr6[2]) * 255.0f));
    }

    public static int x(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        float F = F(0.99f, 1.0f - fArr[0]) * F(0.99f, 1.0f - fArr[1]) * F(0.99f, 1.0f - fArr[2]);
        float[] fArr6 = {fArr2[0] * F, fArr2[1] * F, fArr2[2] * F, 1.0f};
        float fMax = Math.max(fArr[0], Math.max(fArr[1], fArr[2]));
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float[] fArr7 = {f, f2, f3, 0.0f};
        float fMax2 = Math.max(f + f2 + f3, 0.001f);
        float f4 = fArr7[0] / fMax2;
        fArr7[0] = f4;
        fArr7[1] = fArr7[1] / fMax2;
        fArr7[2] = fArr7[2] / fMax2;
        float F2 = F(0.7f, 1.0f - f4);
        float F3 = F(0.7f, 1.0f - fArr7[1]);
        float F4 = F(0.7f, 1.0f - fArr7[2]);
        float f5 = F3 * F4;
        float f6 = F4 * F2;
        float f7 = F2 * F3;
        float fZ = z(fArr7[0], F(fMax, fArr[0] + 0.01f) * fArr[0], f5);
        float fZ2 = z(fArr7[1], F(fMax, fArr[1] + 0.01f) * fArr[1], f6);
        float fZ3 = z(fArr7[2], F(fMax, fArr[2] + 0.01f) * fArr[2], f7);
        float f8 = 1.0f - F;
        return (((int) (1.0f * 255.0f)) << 24) + 0 + (((int) ((((((fArr3[0] * fZ) + (fArr4[0] * fZ2)) + (fArr5[0] * fZ3)) * f8) + fArr6[0]) * 255.0f)) << 16) + (((int) ((((((fArr3[1] * fZ) + (fArr4[1] * fZ2)) + (fArr5[1] * fZ3)) * f8) + fArr6[1]) * 255.0f)) << 8) + ((int) (((f8 * ((fZ * fArr3[2]) + (fZ2 * fArr4[2]) + (fZ3 * fArr5[2]))) + fArr6[2]) * 255.0f));
    }

    public static float z(float f, float f2, float f3) {
        return (f * (1.0f - f3)) + (f2 * f3);
    }

    public void A(int i) {
        B(this.E, i);
    }

    public void C(int i) {
        B(this.F, i);
    }

    public void D(int i) {
        B(this.G, i);
    }

    public void E(int i) {
        B(this.H, i);
    }

    public final void G() {
        if (this.Q) {
            this.Q = false;
            GLES20.glDeleteProgram(this.q.getProgram());
            if (this.P) {
                this.q.create(g("shader/videoDisplay.vert"), this.O);
            } else {
                d(this.q, "shader/videoDisplay.vert", this.O);
            }
            this.q.getUniformLocation("uColorBG");
            this.q.getUniformLocation("uColorA");
            this.q.getUniformLocation("uColorB");
            this.q.getUniformLocation("uColorC");
        }
    }

    public void H() {
        if (!this.J || this.K == null) {
            return;
        }
        if (this.M == null) {
            this.M = new Texture[]{new Texture()};
        }
        e(this.M[0], this.K);
        this.J = false;
    }

    @Override // com.oplus.aiunit.vision.kzk, com.heytap.wearable.support.watchface.engine.gl.GLWatchFaceRenderer
    public void b() {
        G();
        int i = this.I;
        if (i == 0) {
            this.q.useProgram();
            this.q.setUniform("uColorBG", this.E);
            this.q.setUniform("uColorA", this.F);
            this.q.setUniform("uColorB", this.G);
            this.q.setUniform("uColorC", this.H);
            super.b();
            return;
        }
        if (i == 1) {
            GLES20.glEnable(k18.GL_BLEND);
            GLES20.glBlendFunc(k18.GL_SRC_ALPHA, k18.GL_ONE_MINUS_SRC_ALPHA);
            y();
            o();
        }
    }

    @Override // com.oplus.aiunit.vision.kzk, com.heytap.wearable.support.watchface.engine.gl.GLWatchFaceRenderer
    public void c() {
        super.c();
        this.q.getUniformLocation("uColorBG");
        this.q.getUniformLocation("uColorA");
        this.q.getUniformLocation("uColorB");
        this.q.getUniformLocation("uColorC");
        d(this.L, "shader/ai/imageDisplay.vert", "shader/ai/imageDisplay.frag");
        this.L.getUniformLocation("uColorBG");
        this.L.getUniformLocation("uColorA");
        this.L.getUniformLocation("uColorB");
        this.L.getUniformLocation("uColorC");
    }

    @Override // com.oplus.aiunit.vision.kzk
    public void r() {
        super.r();
        H();
    }

    public boolean s(String str) {
        this.O = str;
        this.P = false;
        this.Q = true;
        return d(this.q, "shader/videoDisplay.vert", str);
    }

    public void y() {
        this.L.useProgram();
        this.L.setUniform("uColorBG", this.E);
        this.L.setUniform("uColorA", this.F);
        this.L.setUniform("uColorB", this.G);
        this.L.setUniform("uColorC", this.H);
        this.N.setMesh(this.s);
        this.N.setShaderProgram(this.L);
        this.N.setTexture(this.M);
        this.N.draw();
    }
}
