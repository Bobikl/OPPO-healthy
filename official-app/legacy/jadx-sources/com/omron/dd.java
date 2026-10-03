package com.omron;

import android.support.annotation.NonNull;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public class dd {
    private static final float[] f = {0.005f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f, 0.005f};
    private static final float[] g = {0.01f, 1.0f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
    private static final float[] h = {0.001f, 0.01f, 0.005f, 0.001f};
    private static final float[] i = {0.1f, 1.0f, 0.5f, 0.1f};

    @NonNull
    private final EnumSet<a> a;
    private final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f8874c;
    private final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f8875e;

    public enum a {
        TimeStamp(1),
        MultipleUsers(2),
        BasalMetabolism(4),
        MusclePercentage(8),
        MuscleMass(16),
        FatFreeMass(32),
        SoftLeanMass(64),
        BodyWaterMass(128),
        Impedance(256),
        Weight(512),
        Height(1024);

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

    public dd(@NonNull byte[] bArr) {
        int iE = ek.e(bArr, 0, true);
        this.a = a.b(iE);
        int i2 = (iE >> 11) & 15;
        this.b = f[i2];
        this.f8874c = g[i2];
        int i3 = (iE >> 15) & 7;
        this.d = h[i3];
        this.f8875e = i[i3];
    }

    public float a() {
        return this.f8875e;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.f8874c;
    }

    public String toString() {
        return "BodyCompositionFeature{mSupportedFlags=" + this.a + ", mWeightMeasurementResolutionKG=" + this.b + ", mWeightMeasurementResolutionLB=" + this.f8874c + ", mHeightMeasurementResolutionM=" + this.d + ", mHeightMeasurementResolutionIn=" + this.f8875e + '}';
    }
}
