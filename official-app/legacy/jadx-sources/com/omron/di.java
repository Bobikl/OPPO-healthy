package com.omron;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
public class di {

    @NonNull
    private a a;

    @Nullable
    private BigDecimal b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private BigDecimal f8905c;

    @Nullable
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8906e;
    private long f;

    @Nullable
    private BigDecimal g;

    public class a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8907c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8908e;

        public a(int i) {
            this.a = (i >> 0) & 1;
            this.b = (i >> 1) & 1;
            this.f8907c = (i >> 2) & 1;
            this.d = (i >> 3) & 1;
            this.f8908e = (i >> 4) & 1;
        }
    }

    public di(@NonNull byte[] bArr) {
        this.a = new a(bArr[0]);
        this.b = new BigDecimal(ek.c(bArr, 1, true).a()).setScale(3, RoundingMode.HALF_UP);
        this.f8905c = new BigDecimal(ek.c(bArr, 3, true).a()).setScale(3, RoundingMode.HALF_UP);
        int i = 5;
        if (this.a.a == 1) {
            this.d = ek.g(bArr, 5, true);
            i = 12;
        } else {
            this.d = null;
        }
        if (this.a.b == 1) {
            this.f8906e = ek.b(bArr, i, true);
            i += 2;
        } else {
            this.f8906e = 0;
        }
        if (this.a.f8907c == 1) {
            byte[] bArr2 = new byte[4];
            for (int i2 = 0; i2 < 3; i2++) {
                bArr2[i2] = bArr[i + i2];
            }
            bArr2[3] = 0;
            this.f = ek.f(bArr2, 0, true);
            i += 3;
        } else {
            this.f = 0L;
        }
        if (this.a.d == 1) {
            this.g = new BigDecimal(ek.c(bArr, i, true).a()).setScale(3, RoundingMode.HALF_UP);
        } else {
            this.g = null;
        }
    }

    @Nullable
    public BigDecimal a() {
        return this.f8905c;
    }

    @NonNull
    public BigDecimal b() {
        return this.b;
    }

    @Nullable
    public String c() {
        return this.d;
    }

    @Nullable
    public boolean d() {
        return this.a.f8908e == 1;
    }

    @Nullable
    public boolean e() {
        return this.a.a == 1;
    }

    public String toString() {
        return "PulseOximeterSpotCheckMeasurement{mFlags=" + this.a + ", mSpO2=" + this.b + ", mPulseRate=" + this.f8905c + ", mTimeStamp='" + this.d + "', mMeasurementStatus=" + this.f8906e + ", mDeviceAndSensorStatus=" + this.f + ", mPulseAmplitudeIndex=" + this.g + '}';
    }
}
