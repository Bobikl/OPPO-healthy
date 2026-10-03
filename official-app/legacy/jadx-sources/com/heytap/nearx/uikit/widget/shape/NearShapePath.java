package com.heytap.nearx.uikit.widget.shape;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class NearShapePath {
    private static void drawBLRadiusPath(Path path, RectF rectF, float f) {
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = rectF.top;
        float f6 = f3 - f2;
        float f7 = f4 - f5;
        if (f <= 0.0f) {
            path.lineTo(f2, f4);
            return;
        }
        float vertexRatio = getVertexRatio(f, f6, f7);
        float controlRatio = getControlRatio(f, f6, f7);
        float f8 = f / 100.0f;
        float f9 = 128.19f * f8 * vertexRatio;
        float f10 = f5 + f7;
        path.lineTo(Math.min(f6 / 2.0f, f9) + f2, f10);
        float f11 = 83.62f * f8 * controlRatio;
        float f12 = f8 * 67.45f;
        float f13 = f8 * 4.64f;
        float f14 = f8 * 51.16f;
        float f15 = f8 * 13.36f;
        path.cubicTo(f2 + f11, f10, f2 + f12, f10 - f13, f2 + f14, f10 - f15);
        float f16 = 34.86f * f8;
        float f17 = f8 * 22.07f;
        path.cubicTo(f2 + f16, f10 - f17, f2 + f17, f10 - f16, f2 + f15, f10 - f14);
        path.cubicTo(f2 + f13, f10 - f12, f2, f10 - f11, f2, f5 + Math.max(f7 / 2.0f, f7 - f9));
    }

    private static void drawBRRadiusPath(Path path, RectF rectF, float f) {
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = rectF.top;
        float f6 = f3 - f2;
        float f7 = f4 - f5;
        if (f <= 0.0f) {
            path.lineTo(f3, f4);
            return;
        }
        float vertexRatio = getVertexRatio(f, f6, f7);
        float controlRatio = getControlRatio(f, f6, f7);
        float f8 = f2 + f6;
        float f9 = f / 100.0f;
        float f10 = 128.19f * f9 * vertexRatio;
        path.lineTo(f8, Math.max(f7 / 2.0f, f7 - f10) + f5);
        float f11 = f5 + f7;
        float f12 = 83.62f * f9 * controlRatio;
        float f13 = f9 * 4.64f;
        float f14 = f9 * 67.45f;
        float f15 = f9 * 13.36f;
        float f16 = f9 * 51.16f;
        path.cubicTo(f8, f11 - f12, f8 - f13, f11 - f14, f8 - f15, f11 - f16);
        float f17 = 22.07f * f9;
        float f18 = f9 * 34.86f;
        path.cubicTo(f8 - f17, f11 - f18, f8 - f18, f11 - f17, f8 - f16, f11 - f15);
        path.cubicTo(f8 - f14, f11 - f13, f8 - f12, f11, f2 + Math.max(f6 / 2.0f, f6 - f10), f11);
    }

    private static void drawTLRadiusPath(Path path, RectF rectF, float f) {
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = rectF.top;
        float f6 = f3 - f2;
        float f7 = f4 - f5;
        if (f <= 0.0f) {
            path.lineTo(f2, f5);
            return;
        }
        float vertexRatio = getVertexRatio(f, f6, f7);
        float controlRatio = getControlRatio(f, f6, f7);
        float f8 = f / 100.0f;
        float f9 = 128.19f * f8 * vertexRatio;
        path.lineTo(f2, Math.min(f7 / 2.0f, f9) + f5);
        float f10 = 83.62f * f8 * controlRatio;
        float f11 = f8 * 4.64f;
        float f12 = f8 * 67.45f;
        float f13 = f8 * 13.36f;
        float f14 = f8 * 51.16f;
        path.cubicTo(f2, f5 + f10, f2 + f11, f5 + f12, f2 + f13, f5 + f14);
        float f15 = 22.07f * f8;
        float f16 = f8 * 34.86f;
        path.cubicTo(f2 + f15, f5 + f16, f2 + f16, f5 + f15, f2 + f14, f5 + f13);
        path.cubicTo(f2 + f12, f5 + f11, f2 + f10, f5, f2 + Math.min(f6 / 2.0f, f9), f5);
    }

    private static void drawTRRadiusPath(Path path, RectF rectF, float f) {
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = rectF.top;
        float f6 = f3 - f2;
        float f7 = f4 - f5;
        if (f <= 0.0f) {
            path.moveTo(f3, f5);
            return;
        }
        float controlRatio = getControlRatio(f, f6, f7);
        float f8 = f / 100.0f;
        float vertexRatio = 128.19f * f8 * getVertexRatio(f, f6, f7);
        path.moveTo(Math.max(f6 / 2.0f, f6 - vertexRatio) + f2, f5);
        float f9 = f2 + f6;
        float f10 = 83.62f * f8 * controlRatio;
        float f11 = f8 * 67.45f;
        float f12 = f8 * 4.64f;
        float f13 = f8 * 51.16f;
        float f14 = f8 * 13.36f;
        path.cubicTo(f9 - f10, f5, f9 - f11, f5 + f12, f9 - f13, f5 + f14);
        float f15 = 34.86f * f8;
        float f16 = f8 * 22.07f;
        path.cubicTo(f9 - f15, f5 + f16, f9 - f16, f5 + f15, f9 - f14, f5 + f13);
        path.cubicTo(f9 - f12, f5 + f11, f9, f5 + f10, f9, f5 + Math.min(f7 / 2.0f, vertexRatio));
    }

    private static float getControlRatio(float f, float f2, float f3) {
        float fMin = f / Math.min(f2 / 2.0f, f3 / 2.0f);
        if (fMin > 0.6f) {
            return (Math.min(1.0f, (fMin - 0.6f) / 0.3f) * 0.042454004f) + 1.0f;
        }
        return 1.0f;
    }

    @NonNull
    public static Path getRoundRectPath(@NonNull Path path, RectF rectF, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        float f2;
        float f3 = f < 0.0f ? 0.0f : f;
        path.reset();
        float f4 = rectF.left;
        float f5 = rectF.right;
        float f6 = rectF.bottom;
        float f7 = rectF.top;
        float f8 = f5 - f4;
        float f9 = f6 - f7;
        float f10 = f8 / 2.0f;
        float f11 = f9 / 2.0f;
        float fMin = f3 / Math.min(f10, f11);
        float fMin2 = ((double) fMin) > 0.5d ? 1.0f - (Math.min(1.0f, (fMin - 0.5f) / 0.4f) * 0.13877845f) : 1.0f;
        float fMin3 = fMin > 0.6f ? 1.0f + (Math.min(1.0f, (fMin - 0.6f) / 0.3f) * 0.042454004f) : 1.0f;
        path.moveTo(f4 + f10, f7);
        if (z2) {
            float f12 = f3 / 100.0f;
            float f13 = f12 * 128.19f * fMin2;
            path.lineTo(Math.max(f10, f8 - f13) + f4, f7);
            float f14 = f4 + f8;
            float f15 = f12 * 83.62f * fMin3;
            float f16 = f12 * 67.45f;
            float f17 = f12 * 4.64f;
            float f18 = f12 * 51.16f;
            float f19 = f12 * 13.36f;
            path.cubicTo(f14 - f15, f7, f14 - f16, f7 + f17, f14 - f18, f7 + f19);
            float f20 = f12 * 34.86f;
            float f21 = f12 * 22.07f;
            path.cubicTo(f14 - f20, f7 + f21, f14 - f21, f7 + f20, f14 - f19, f7 + f18);
            path.cubicTo(f14 - f17, f7 + f16, f14, f7 + f15, f14, f7 + Math.min(f11, f13));
        } else {
            path.lineTo(f4 + f8, f7);
        }
        if (z4) {
            float f22 = f4 + f8;
            float f23 = f3 / 100.0f;
            float f24 = f23 * 128.19f * fMin2;
            path.lineTo(f22, Math.max(f11, f9 - f24) + f7);
            float f25 = f7 + f9;
            float f26 = f23 * 83.62f * fMin3;
            float f27 = f23 * 4.64f;
            float f28 = f23 * 67.45f;
            float f29 = f23 * 13.36f;
            float f30 = f23 * 51.16f;
            path.cubicTo(f22, f25 - f26, f22 - f27, f25 - f28, f22 - f29, f25 - f30);
            float f31 = f23 * 22.07f;
            float f32 = f23 * 34.86f;
            path.cubicTo(f22 - f31, f25 - f32, f22 - f32, f25 - f31, f22 - f30, f25 - f29);
            path.cubicTo(f22 - f28, f25 - f27, f22 - f26, f25, f4 + Math.max(f2, f8 - f24), f25);
        } else {
            path.lineTo(f8 + f4, f7 + f9);
        }
        if (z3) {
            f2 = f10;
            float f33 = f3 / 100.0f;
            float f34 = f33 * 128.19f * fMin2;
            float f35 = f7 + f9;
            path.lineTo(Math.min(f2, f34) + f4, f35);
            float f36 = f33 * 83.62f * fMin3;
            float f37 = f33 * 67.45f;
            float f38 = f33 * 4.64f;
            float f39 = f33 * 51.16f;
            float f40 = f33 * 13.36f;
            path.cubicTo(f4 + f36, f35, f4 + f37, f35 - f38, f4 + f39, f35 - f40);
            float f41 = f33 * 34.86f;
            float f42 = f33 * 22.07f;
            path.cubicTo(f4 + f41, f35 - f42, f4 + f42, f35 - f41, f4 + f40, f35 - f39);
            path.cubicTo(f4 + f38, f35 - f37, f4, f35 - f36, f4, f7 + Math.max(f11, f9 - f34));
        } else {
            f2 = f10;
            path.lineTo(f4, f9 + f7);
        }
        if (z) {
            f2 = f10;
            f2 = f10;
            float f43 = f3 / 100.0f;
            float f44 = 128.19f * f43 * fMin2;
            path.lineTo(f4, Math.min(f11, f44) + f7);
            float f45 = 83.62f * f43 * fMin3;
            float f46 = 4.64f * f43;
            float f47 = 67.45f * f43;
            float f48 = 13.36f * f43;
            float f49 = 51.16f * f43;
            path.cubicTo(f4, f7 + f45, f4 + f46, f7 + f47, f4 + f48, f7 + f49);
            float f50 = 22.07f * f43;
            float f51 = f43 * 34.86f;
            path.cubicTo(f4 + f50, f7 + f51, f4 + f51, f7 + f50, f4 + f49, f7 + f48);
            path.cubicTo(f4 + f47, f7 + f46, f4 + f45, f7, f4 + Math.min(f2, f44), f7);
        } else {
            f2 = f10;
            f2 = f10;
            path.lineTo(f4, f7);
        }
        path.close();
        return path;
    }

    private static float getVertexRatio(float f, float f2, float f3) {
        float fMin = f / Math.min(f2 / 2.0f, f3 / 2.0f);
        if (fMin > 0.5d) {
            return 1.0f - (Math.min(1.0f, (fMin - 0.5f) / 0.4f) * 0.13877845f);
        }
        return 1.0f;
    }

    @NonNull
    public static Path getRoundRectPath(@NonNull Path path, RectF rectF, float f) {
        return getRoundRectPath(path, rectF, f, true, true, true, true);
    }

    public static Path getRoundRectPath(@NonNull Path path, RectF rectF, float f, float f2) {
        float f3 = f < 0.0f ? 0.0f : f;
        float f4 = f2 < 0.0f ? 0.0f : f2;
        path.reset();
        float f5 = rectF.left;
        float f6 = rectF.right;
        float f7 = rectF.bottom;
        float f8 = rectF.top;
        float f9 = f6 - f5;
        float f10 = f7 - f8;
        float f11 = f9 / 2.0f;
        float f12 = f10 / 2.0f;
        float fMin = f3 / Math.min(f11, f12);
        float fMin2 = ((double) fMin) > 0.5d ? 1.0f - (Math.min(1.0f, (fMin - 0.5f) / 0.4f) * 0.13877845f) : 1.0f;
        float fMin3 = f4 / Math.min(f11, f12);
        float fMin4 = ((double) fMin3) > 0.5d ? 1.0f - (Math.min(1.0f, (fMin3 - 0.5f) / 0.4f) * 0.13877845f) : 1.0f;
        float fMin5 = fMin > 0.6f ? (Math.min(1.0f, (fMin - 0.6f) / 0.3f) * 0.042454004f) + 1.0f : 1.0f;
        float fMin6 = fMin3 > 0.6f ? 1.0f + (Math.min(1.0f, (fMin3 - 0.6f) / 0.3f) * 0.042454004f) : 1.0f;
        path.moveTo(f5 + f11, f8);
        float f13 = f3 / 100.0f;
        float f14 = f13 * 128.19f * fMin2;
        path.lineTo(Math.max(f11, f9 - f14) + f5, f8);
        float f15 = f5 + f9;
        float f16 = f13 * 83.62f * fMin5;
        float f17 = f13 * 67.45f;
        float f18 = f13 * 4.64f;
        float f19 = f8 + f18;
        float f20 = f13 * 51.16f;
        float f21 = f13 * 13.36f;
        float f22 = f8 + f21;
        path.cubicTo(f15 - f16, f8, f15 - f17, f19, f15 - f20, f22);
        float f23 = f13 * 34.86f;
        float f24 = f13 * 22.07f;
        float f25 = f8 + f24;
        float f26 = f8 + f23;
        float f27 = f8 + f20;
        path.cubicTo(f15 - f23, f25, f15 - f24, f26, f15 - f21, f27);
        float f28 = f8 + f17;
        float f29 = f8 + f16;
        path.cubicTo(f15 - f18, f28, f15, f29, f15, f8 + Math.min(f12, f14));
        float f30 = f4 / 100.0f;
        float f31 = fMin4 * 128.19f * f30;
        float f32 = f10 - f31;
        path.lineTo(f15, Math.max(f12, f32) + f8);
        float f33 = f10 + f8;
        float f34 = 83.62f * f30 * fMin6;
        float f35 = f33 - f34;
        float f36 = 4.64f * f30;
        float f37 = 67.45f * f30;
        float f38 = f33 - f37;
        float f39 = 13.36f * f30;
        float f40 = 51.16f * f30;
        float f41 = f33 - f40;
        path.cubicTo(f15, f35, f15 - f36, f38, f15 - f39, f41);
        float f42 = 22.07f * f30;
        float f43 = f30 * 34.86f;
        float f44 = f33 - f43;
        float f45 = f33 - f42;
        float f46 = f33 - f39;
        path.cubicTo(f15 - f42, f44, f15 - f43, f45, f15 - f40, f46);
        float f47 = f33 - f36;
        path.cubicTo(f15 - f37, f47, f15 - f34, f33, f5 + Math.max(f11, f9 - f31), f33);
        path.lineTo(f5 + Math.min(f11, f31), f33);
        path.cubicTo(f5 + f34, f33, f5 + f37, f47, f5 + f40, f46);
        path.cubicTo(f5 + f43, f45, f5 + f42, f44, f5 + f39, f41);
        path.cubicTo(f5 + f36, f38, f5, f35, f5, f8 + Math.max(f12, f32));
        path.lineTo(f5, Math.min(f12, f14) + f8);
        path.cubicTo(f5, f29, f5 + f18, f28, f5 + f21, f27);
        path.cubicTo(f5 + f24, f26, f5 + f23, f25, f5 + f20, f22);
        path.cubicTo(f5 + f17, f19, f5 + f16, f8, f5 + Math.min(f11, f14), f8);
        path.close();
        return path;
    }

    public static Path getRoundRectPath(@NonNull Path path, RectF rectF, float f, float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        path.reset();
        drawTRRadiusPath(path, rectF, f2);
        drawBRRadiusPath(path, rectF, f3);
        drawBLRadiusPath(path, rectF, f4);
        drawTLRadiusPath(path, rectF, f);
        path.close();
        return path;
    }
}
