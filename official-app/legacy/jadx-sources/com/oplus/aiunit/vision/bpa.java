package com.oplus.aiunit.vision;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.oplus.anim.parser.moshi.JsonReader;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class bpa {
    public static SparseArrayCompat<WeakReference<Interpolator>> b;
    public static final Interpolator a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static JsonReader.a f9808c = JsonReader.a.a("t", "s", MapSchema.FIELD_NAME_ENTRY, "o", "i", b2n.g, TypedValues.TransitionType.S_TO, "ti");
    public static JsonReader.a d = JsonReader.a.a("x", "y");

    @Nullable
    public static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (bpa.class) {
            weakReference = g().get(i);
        }
        return weakReference;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorCreate;
        pointF.x = l0c.b(pointF.x, -1.0f, 1.0f);
        pointF.y = l0c.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = l0c.b(pointF2.x, -1.0f, 1.0f);
        float fB = l0c.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int iJ = prk.j(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = a(iJ);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA == null || interpolator == null) {
            try {
                interpolatorCreate = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                interpolatorCreate = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorCreate;
            try {
                h(iJ, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    public static <T> xoa<T> c(JsonReader jsonReader, wg6 wg6Var, float f, guk<T> gukVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return e(wg6Var, jsonReader, f, gukVar);
        }
        return z ? d(wg6Var, jsonReader, f, gukVar) : f(jsonReader, f, gukVar);
    }

    public static <T> xoa<T> d(wg6 wg6Var, JsonReader jsonReader, float f, guk<T> gukVar) throws IOException {
        Interpolator interpolatorB;
        T t;
        jsonReader.h();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fO = 0.0f;
        boolean z = false;
        PointF pointFE4 = null;
        while (jsonReader.m()) {
            switch (jsonReader.x(f9808c)) {
                case 0:
                    fO = (float) jsonReader.o();
                    break;
                case 1:
                    tA2 = gukVar.a(jsonReader, f);
                    break;
                case 2:
                    tA = gukVar.a(jsonReader, f);
                    break;
                case 3:
                    pointFE = kma.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFE4 = kma.e(jsonReader, 1.0f);
                    break;
                case 5:
                    z = jsonReader.p() == 1;
                    break;
                case 6:
                    pointFE2 = kma.e(jsonReader, f);
                    break;
                case 7:
                    pointFE3 = kma.e(jsonReader, f);
                    break;
                default:
                    jsonReader.z();
                    break;
            }
        }
        jsonReader.l();
        if (z) {
            interpolatorB = a;
            t = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? a : b(pointFE, pointFE4);
            t = tA;
        }
        xoa<T> xoaVar = new xoa<>(wg6Var, tA2, t, interpolatorB, fO, null);
        xoaVar.o = pointFE2;
        xoaVar.p = pointFE3;
        return xoaVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    public static <T> xoa<T> e(wg6 wg6Var, JsonReader jsonReader, float f, guk<T> gukVar) throws IOException {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t;
        xoa<T> xoaVar;
        PointF pointF;
        float f2;
        PointF pointF2;
        jsonReader.h();
        PointF pointFE = null;
        boolean z = false;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        PointF pointF3 = null;
        T tA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fO = 0.0f;
        PointF pointFE4 = null;
        T tA2 = null;
        while (jsonReader.m()) {
            switch (jsonReader.x(f9808c)) {
                case 0:
                    pointF = pointFE;
                    fO = (float) jsonReader.o();
                    pointFE = pointF;
                    break;
                case 1:
                    pointF = pointFE;
                    tA = gukVar.a(jsonReader, f);
                    pointFE = pointF;
                    break;
                case 2:
                    pointF = pointFE;
                    tA2 = gukVar.a(jsonReader, f);
                    pointFE = pointF;
                    break;
                case 3:
                    pointF = pointFE;
                    f2 = fO;
                    PointF pointF7 = pointFE4;
                    if (jsonReader.v() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.h();
                        float fO2 = 0.0f;
                        float fO3 = 0.0f;
                        float fO4 = 0.0f;
                        float fO5 = 0.0f;
                        while (jsonReader.m()) {
                            int iX = jsonReader.x(d);
                            if (iX == 0) {
                                JsonReader.Token tokenV = jsonReader.v();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenV == token) {
                                    fO4 = (float) jsonReader.o();
                                    fO2 = fO4;
                                } else {
                                    jsonReader.g();
                                    fO2 = (float) jsonReader.o();
                                    fO4 = jsonReader.v() == token ? (float) jsonReader.o() : fO2;
                                    jsonReader.i();
                                }
                            } else if (iX != 1) {
                                jsonReader.z();
                            } else {
                                JsonReader.Token tokenV2 = jsonReader.v();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenV2 == token2) {
                                    fO5 = (float) jsonReader.o();
                                    fO3 = fO5;
                                } else {
                                    jsonReader.g();
                                    fO3 = (float) jsonReader.o();
                                    fO5 = jsonReader.v() == token2 ? (float) jsonReader.o() : fO3;
                                    jsonReader.i();
                                }
                            }
                        }
                        PointF pointF8 = new PointF(fO2, fO3);
                        PointF pointF9 = new PointF(fO4, fO5);
                        jsonReader.l();
                        pointF4 = pointF9;
                        pointF3 = pointF8;
                        pointFE4 = pointF7;
                        fO = f2;
                    } else {
                        pointFE2 = kma.e(jsonReader, f);
                        fO = f2;
                        pointFE4 = pointF7;
                    }
                    pointFE = pointF;
                    break;
                case 4:
                    if (jsonReader.v() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.h();
                        float fO6 = 0.0f;
                        float f3 = 0.0f;
                        float fO7 = 0.0f;
                        float fO8 = 0.0f;
                        while (jsonReader.m()) {
                            pointFE4 = pointFE4;
                            int iX2 = jsonReader.x(d);
                            if (iX2 != 0) {
                                pointF2 = pointFE;
                                if (iX2 != 1) {
                                    jsonReader.z();
                                } else {
                                    JsonReader.Token tokenV3 = jsonReader.v();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenV3 == token3) {
                                        fO8 = (float) jsonReader.o();
                                        fO = fO;
                                        f3 = fO8;
                                    } else {
                                        float f4 = fO;
                                        jsonReader.g();
                                        float fO9 = (float) jsonReader.o();
                                        float fO10 = jsonReader.v() == token3 ? (float) jsonReader.o() : fO9;
                                        jsonReader.i();
                                        fO = f4;
                                        pointFE = pointF2;
                                        fO8 = fO10;
                                        f3 = fO9;
                                    }
                                }
                            } else {
                                pointF2 = pointFE;
                                float f5 = fO;
                                JsonReader.Token tokenV4 = jsonReader.v();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenV4 == token4) {
                                    fO7 = (float) jsonReader.o();
                                    fO = f5;
                                    fO6 = fO7;
                                } else {
                                    jsonReader.g();
                                    fO6 = (float) jsonReader.o();
                                    fO7 = jsonReader.v() == token4 ? (float) jsonReader.o() : fO6;
                                    jsonReader.i();
                                    fO = f5;
                                }
                            }
                            pointFE = pointF2;
                        }
                        pointF = pointFE;
                        f2 = fO;
                        PointF pointF10 = new PointF(fO6, f3);
                        PointF pointF11 = new PointF(fO7, fO8);
                        jsonReader.l();
                        pointF6 = pointF11;
                        pointF5 = pointF10;
                        fO = f2;
                    } else {
                        pointF = pointFE;
                        pointFE3 = kma.e(jsonReader, f);
                    }
                    pointFE = pointF;
                    break;
                case 5:
                    z = jsonReader.p() == 1;
                    break;
                case 6:
                    pointFE4 = kma.e(jsonReader, f);
                    break;
                case 7:
                    pointFE = kma.e(jsonReader, f);
                    break;
                default:
                    pointF = pointFE;
                    jsonReader.z();
                    pointFE = pointF;
                    break;
            }
        }
        PointF pointF12 = pointFE;
        float f6 = fO;
        PointF pointF13 = pointFE4;
        jsonReader.l();
        if (z) {
            interpolatorB = a;
            t = tA;
        } else {
            if (pointFE2 == null || pointFE3 == null) {
                if (pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    interpolatorB = a;
                } else {
                    interpolatorB2 = b(pointF3, pointF5);
                    interpolatorB3 = b(pointF4, pointF6);
                    t = tA2;
                    interpolatorB = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    xoaVar = new xoa<>(wg6Var, tA, t, interpolatorB, f6, null);
                } else {
                    xoaVar = new xoa<>(wg6Var, tA, t, interpolatorB2, interpolatorB3, f6, null);
                }
                xoaVar.o = pointF13;
                xoaVar.p = pointF12;
                return xoaVar;
            }
            interpolatorB = b(pointFE2, pointFE3);
            t = tA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            xoaVar = new xoa<>(wg6Var, tA, t, interpolatorB, f6, null);
        } else {
            xoaVar = new xoa<>(wg6Var, tA, t, interpolatorB, f6, null);
        }
        xoaVar.o = pointF13;
        xoaVar.p = pointF12;
        return xoaVar;
    }

    public static <T> xoa<T> f(JsonReader jsonReader, float f, guk<T> gukVar) throws IOException {
        return new xoa<>(gukVar.a(jsonReader, f));
    }

    public static SparseArrayCompat<WeakReference<Interpolator>> g() {
        if (b == null) {
            b = new SparseArrayCompat<>();
        }
        return b;
    }

    public static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (bpa.class) {
            b.put(i, weakReference);
        }
    }
}
