package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes6.dex */
public final class qzj {
    public final int a;
    public final int b;

    public qzj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static qzj b(int i, int i2) {
        if (i < 0 || i > 1440) {
            throw new IllegalArgumentException("startInclusiveMinute out of range: " + i);
        }
        if (i2 < 0 || i2 > 1440) {
            throw new IllegalArgumentException("endExclusiveMinute out of range: " + i2);
        }
        if (i2 > i) {
            return new qzj(i, i2);
        }
        throw new IllegalArgumentException("endExclusiveMinute must be > startInclusiveMinute, start=" + i + ", end=" + i2);
    }

    public boolean a(int i) {
        return i >= this.a && i < this.b;
    }

    public String toString() {
        return "TimeWindow{" + this.a + "-" + this.b + "}";
    }
}
