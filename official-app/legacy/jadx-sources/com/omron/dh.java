package com.omron;

import android.support.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class dh {
    public a a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8902c;

    public class a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8903c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8904e;
        public int f;
        public int g;
        public int h;

        public a(int i) {
            this.a = (i >> 0) & 1;
            this.b = (i >> 1) & 1;
            this.f8903c = (i >> 2) & 1;
            this.d = (i >> 3) & 1;
            this.f8904e = (i >> 4) & 1;
            this.f = (i >> 5) & 1;
            this.g = (i >> 6) & 1;
            this.h = (i >> 7) & 1;
        }
    }

    public dh(@NonNull byte[] bArr) {
        int i;
        a aVar = new a(ek.b(bArr, 0, true));
        this.a = aVar;
        if (aVar.a == 1) {
            this.b = ek.b(bArr, 0, true);
            i = 2;
        } else {
            i = 0;
        }
        if (this.a.b == 1) {
            byte[] bArr2 = new byte[4];
            for (int i2 = 0; i2 < 3; i2++) {
                bArr2[i2] = bArr[i + i2];
            }
            bArr2[3] = 0;
            this.f8902c = ek.f(bArr2, 0, true);
        }
    }

    @NonNull
    public boolean a() {
        return this.a.f8903c == 1;
    }

    @NonNull
    public boolean b() {
        return this.a.d == 1;
    }

    public String toString() {
        return "PulseOximeterFeatures{mSupportedFlags=" + this.a + "mMeasurementStatusSupport=" + this.b + "mDeviceAndSensorStatusSupport=" + this.f8902c + '}';
    }
}
