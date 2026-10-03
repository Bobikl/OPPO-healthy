package com.omron;

import android.support.annotation.NonNull;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public class dm {
    private static final float[] f = {0.005f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f, 0.005f};
    private static final float[] g = {0.01f, 1.0f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
    private static final float[] h = {0.001f, 0.01f, 0.005f, 0.001f};
    private static final float[] i = {0.1f, 1.0f, 0.5f, 0.1f};

    @NonNull
    private final EnumSet<a> a;
    private final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f8933c;
    private final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f8934e;

    public enum a {
        TimeStamp(1),
        MultipleUsers(2),
        BMI(4);

        private int a;

        a(int i) {
            this.a = i;
        }

        private boolean a(int i) {
            int i2 = this.a;
            return i2 == (i & i2);
        }

        @NonNull
        public static EnumSet<a> b(int i) {
            EnumSet<a> enumSetNoneOf = EnumSet.noneOf(a.class);
            for (a aVar : values()) {
                if (aVar.a(i)) {
                    enumSetNoneOf.add(aVar);
                }
            }
            return enumSetNoneOf;
        }
    }

    public dm(@NonNull byte[] bArr) {
        int iE = ek.e(bArr, 0, true);
        this.a = a.b(iE);
        int i2 = (iE >> 3) & 15;
        this.b = f[i2];
        this.f8933c = g[i2];
        int i3 = (iE >> 7) & 7;
        this.d = h[i3];
        this.f8934e = i[i3];
    }

    public float a() {
        return this.f8934e;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.f8933c;
    }

    public String toString() {
        return "WeightScaleFeature{mSupportedFlags=" + this.a + ", mWeightMeasurementResolutionKG=" + this.b + ", mWeightMeasurementResolutionLB=" + this.f8933c + ", mHeightMeasurementResolutionM=" + this.d + ", mHeightMeasurementResolutionIn=" + this.f8934e + '}';
    }
}
