package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class cd extends ca {
    private final int f;
    private final int g;
    private final float h;
    private final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f8863j;
    private transient String k;

    public cd(int i, int i2, byte[] bArr) {
        super(i, i2, bArr, ca.a.TLM);
        this.f = e(bArr);
        this.g = b(bArr);
        this.h = c(bArr);
        this.i = a(bArr);
        this.f8863j = d(bArr);
    }

    private long a(byte[] bArr) {
        if (bArr.length < 12) {
            return 0L;
        }
        return cv.c(bArr, 8);
    }

    private int b(byte[] bArr) {
        if (bArr.length < 6) {
            return 0;
        }
        return cv.b(bArr, 4);
    }

    private float c(byte[] bArr) {
        if (bArr.length < 8) {
            return -128.0f;
        }
        return cv.a(bArr, 6);
    }

    private long d(byte[] bArr) {
        if (bArr.length < 16) {
            return 0L;
        }
        return cv.c(bArr, 12) * 100;
    }

    private int e(byte[] bArr) {
        if (bArr.length < 4) {
            return 0;
        }
        return bArr[3] & 255;
    }

    @Override // com.omron.cq, com.omron.by
    public String toString() {
        String str = this.k;
        if (str != null) {
            return str;
        }
        String str2 = String.format("EddystoneTLM(Version=%d,BatteryVoltage=%d,BeaconTemperature=%f,AdvertisementCount=%d,ElapsedTime=%d)", Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Long.valueOf(this.i), Long.valueOf(this.f8863j));
        this.k = str2;
        return str2;
    }
}
