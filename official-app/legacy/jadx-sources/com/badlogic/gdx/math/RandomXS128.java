package com.badlogic.gdx.math;

import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public class RandomXS128 extends Random {
    private static final double NORM_DOUBLE = 1.1102230246251565E-16d;
    private static final double NORM_FLOAT = 5.9604644775390625E-8d;
    private long seed0;
    private long seed1;

    public RandomXS128() {
        setSeed(new Random().nextLong());
    }

    private static final long murmurHash3(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    public long getState(int i) {
        return i == 0 ? this.seed0 : this.seed1;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return (int) (((1 << i) - 1) & nextLong());
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return (nextLong() & 1) != 0;
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        while (length != 0) {
            int i = length < 8 ? length : 8;
            long jNextLong = nextLong();
            while (true) {
                int i2 = i - 1;
                if (i != 0) {
                    length--;
                    bArr[length] = (byte) jNextLong;
                    jNextLong >>= 8;
                    i = i2;
                }
            }
        }
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (nextLong() >>> 11) * NORM_DOUBLE;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (float) ((nextLong() >>> 40) * NORM_FLOAT);
    }

    @Override // java.util.Random
    public int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public long nextLong() {
        long j2 = this.seed0;
        long j3 = this.seed1;
        this.seed0 = j3;
        long j4 = j2 ^ (j2 << 23);
        long j5 = ((j4 >>> 17) ^ (j4 ^ j3)) ^ (j3 >>> 26);
        this.seed1 = j5;
        return j5 + j3;
    }

    @Override // java.util.Random
    public void setSeed(long j2) {
        if (j2 == 0) {
            j2 = Long.MIN_VALUE;
        }
        long jMurmurHash3 = murmurHash3(j2);
        setState(jMurmurHash3, murmurHash3(jMurmurHash3));
    }

    public void setState(long j2, long j3) {
        this.seed0 = j2;
        this.seed1 = j3;
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return (int) nextLong(i);
    }

    public RandomXS128(long j2) {
        setSeed(j2);
    }

    public RandomXS128(long j2, long j3) {
        setState(j2, j3);
    }

    public long nextLong(long j2) {
        long jNextLong;
        long j3;
        if (j2 <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        do {
            jNextLong = nextLong() >>> 1;
            j3 = jNextLong % j2;
        } while ((jNextLong - j3) + (j2 - 1) < 0);
        return j3;
    }
}
