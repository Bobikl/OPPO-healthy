package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class flk {
    public final int a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11429c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11430e;
    public final boolean f;
    public final int g;

    public flk(int i, long j2, int i2, long j3, int i3, boolean z, int i4) {
        if (i <= 0) {
            throw new IllegalArgumentException("batchSize必须大于0");
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException("uploadInterval必须大于0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxRetryCount必须大于0");
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException("maxCacheSize必须大于0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxCacheCount必须大于0");
        }
        this.a = i;
        this.b = j2;
        this.f11429c = i2;
        this.d = j3;
        this.f11430e = i3;
        this.f = z;
        this.g = i4;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.f11430e;
    }

    public long c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flk)) {
            return false;
        }
        flk flkVar = (flk) obj;
        return this.a == flkVar.a && this.b == flkVar.b && this.f11429c == flkVar.f11429c && this.d == flkVar.d && this.f11430e == flkVar.f11430e && this.f == flkVar.f && this.g == flkVar.g;
    }

    public int hashCode() {
        int i = this.a * 31;
        long j2 = this.b;
        int i2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f11429c) * 31;
        long j3 = this.d;
        return ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f11430e) * 31) + (this.f ? 1 : 0)) * 31) + this.g;
    }

    public String toString() {
        return "UploadConfig{batchSize=" + this.a + ", uploadInterval=" + this.b + ", maxRetryCount=" + this.f11429c + ", maxCacheSize=" + this.d + ", maxCacheCount=" + this.f11430e + ", enableCompress=" + this.f + ", expiredDays=" + this.g + '}';
    }

    public flk() {
        this(100, 15000L, 3, 10485760L, 10000, true, 7);
    }
}
