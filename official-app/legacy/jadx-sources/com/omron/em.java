package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class em {
    public static short b = 2047;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static short f8989c = 2048;
    public static short d = 2046;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static short f8990e = 2050;
    public static short f = 2049;
    private short a;

    public em(short s) {
        this.a = s;
    }

    private short b(short s) {
        return (short) ((s & 2048) != 0 ? (s & 4095) | 61440 : s & 4095);
    }

    public static em c(short s) {
        return new em(s);
    }

    public float a() {
        short s = this.a;
        if (s == b || s == f8989c) {
            return Float.NaN;
        }
        if (s == d) {
            return Float.POSITIVE_INFINITY;
        }
        if (s == f8990e) {
            return Float.NEGATIVE_INFINITY;
        }
        if (s == f) {
            return Float.NaN;
        }
        return (float) (((double) b(s)) * Math.pow(10.0d, a(this.a)));
    }

    private short a(short s) {
        int i = (s >> 12) & 15;
        return s < 0 ? (byte) (i | 240) : (short) i;
    }
}
