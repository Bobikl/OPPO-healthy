package io.netty.buffer;

/* JADX INFO: loaded from: classes10.dex */
final class LongLongHashMap {
    private static final int MASK_TEMPLATE = -2;
    private final long emptyVal;
    private int maxProbe;
    private long zeroVal;
    private long[] array = new long[32];
    private int mask = 31;

    public LongLongHashMap(long j2) {
        this.emptyVal = j2;
        this.zeroVal = j2;
        computeMaskAndProbe();
    }

    private void computeMaskAndProbe() {
        int length = this.array.length;
        this.mask = (length - 1) & (-2);
        this.maxProbe = (int) Math.log(length);
    }

    private void expand() {
        long[] jArr = this.array;
        this.array = new long[jArr.length * 2];
        computeMaskAndProbe();
        for (int i = 0; i < jArr.length; i += 2) {
            long j2 = jArr[i];
            if (j2 != 0) {
                put(j2, jArr[i + 1]);
            }
        }
    }

    private int index(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return this.mask & ((int) (j4 ^ (j4 >>> 33)));
    }

    public long get(long j2) {
        if (j2 == 0) {
            return this.zeroVal;
        }
        int iIndex = index(j2);
        for (int i = 0; i < this.maxProbe; i++) {
            long[] jArr = this.array;
            if (jArr[iIndex] == j2) {
                return jArr[iIndex + 1];
            }
            iIndex = (iIndex + 2) & this.mask;
        }
        return this.emptyVal;
    }

    public long put(long j2, long j3) {
        int iIndex;
        int i;
        long[] jArr;
        long j4;
        if (j2 == 0) {
            long j5 = this.zeroVal;
            this.zeroVal = j3;
            return j5;
        }
        loop0: while (true) {
            iIndex = index(j2);
            i = 0;
            while (i < this.maxProbe) {
                jArr = this.array;
                j4 = jArr[iIndex];
                if (j4 == j2 || j4 == 0) {
                    break loop0;
                }
                iIndex = (iIndex + 2) & this.mask;
                i++;
            }
            expand();
        }
        long j6 = j4 == 0 ? this.emptyVal : jArr[iIndex + 1];
        jArr[iIndex] = j2;
        jArr[iIndex + 1] = j3;
        while (i < this.maxProbe) {
            iIndex = (iIndex + 2) & this.mask;
            long[] jArr2 = this.array;
            if (jArr2[iIndex] == j2) {
                jArr2[iIndex] = 0;
                return jArr2[iIndex + 1];
            }
            i++;
        }
        return j6;
    }

    public void remove(long j2) {
        if (j2 == 0) {
            this.zeroVal = this.emptyVal;
            return;
        }
        int iIndex = index(j2);
        for (int i = 0; i < this.maxProbe; i++) {
            long[] jArr = this.array;
            if (jArr[iIndex] == j2) {
                jArr[iIndex] = 0;
                return;
            }
            iIndex = (iIndex + 2) & this.mask;
        }
    }
}
