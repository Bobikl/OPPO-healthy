package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class hca {
    public int a;
    public long b;

    public hca(long j2, int i) {
        this.b = j2;
        this.a = i;
    }

    public static hca b(String str, int i, int i2) {
        long j2;
        int i3;
        if (i >= i2) {
            return null;
        }
        long j3 = 0;
        int i4 = i;
        while (i4 < i2) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j2 = j3 * 16;
                    i3 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j2 = j3 * 16;
                    i3 = cCharAt - 'a';
                }
                j3 = j2 + ((long) i3) + 10;
            } else {
                j3 = (j3 * 16) + ((long) (cCharAt - '0'));
            }
            if (j3 > 4294967295L) {
                return null;
            }
            i4++;
        }
        if (i4 == i) {
            return null;
        }
        return new hca(j3, i4);
    }

    public static hca c(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '+') {
                i++;
            } else if (cCharAt == '-') {
                z2 = true;
                i++;
            }
        }
        long j2 = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            if (z2) {
                j2 = (j2 * 10) - ((long) (cCharAt2 - '0'));
                if (j2 < -2147483648L) {
                    return null;
                }
            } else {
                j2 = (j2 * 10) + ((long) (cCharAt2 - '0'));
                if (j2 > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new hca(j2, i3);
    }

    public int a() {
        return this.a;
    }

    public int d() {
        return (int) this.b;
    }
}
