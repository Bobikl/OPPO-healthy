package io.protostuff;

/* JADX INFO: loaded from: classes10.dex */
public final class NumberParser {
    private NumberParser() {
    }

    public static int parseInt(byte[] bArr, int i, int i2, int i3) throws NumberFormatException {
        if (i2 == 0) {
            throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
        }
        if (bArr[i] != 45) {
            return parseInt(bArr, i, i2, i3, true);
        }
        if (i2 != 1) {
            return parseInt(bArr, i + 1, i2 - 1, i3, false);
        }
        throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
    }

    public static long parseLong(byte[] bArr, int i, int i2, int i3) throws NumberFormatException {
        if (i2 == 0) {
            throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
        }
        if (bArr[i] != 45) {
            return parseLong(bArr, i, i2, i3, true);
        }
        if (i2 != 1) {
            return parseLong(bArr, i + 1, i2 - 1, i3, false);
        }
        throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
    }

    public static int parseInt(byte[] bArr, int i, int i2, int i3, boolean z) throws NumberFormatException {
        int i4 = Integer.MIN_VALUE / i3;
        int i5 = i + i2;
        int i6 = 0;
        int i7 = i;
        while (i7 < i5) {
            int i8 = i7 + 1;
            int iDigit = Character.digit(bArr[i7], i3);
            if (iDigit == -1) {
                throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
            }
            if (i4 > i6) {
                throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
            }
            int i9 = (i6 * i3) - iDigit;
            if (i9 > i6) {
                throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
            }
            i6 = i9;
            i7 = i8;
        }
        if (!z || (i6 = -i6) >= 0) {
            return i6;
        }
        throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
    }

    public static long parseLong(byte[] bArr, int i, int i2, int i3, boolean z) throws NumberFormatException {
        long j2 = i3;
        long j3 = Long.MIN_VALUE / j2;
        int i4 = i + i2;
        int i5 = i;
        long j4 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int iDigit = Character.digit(bArr[i5], i3);
            if (iDigit == -1) {
                throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
            }
            if (j3 > j4) {
                throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
            }
            long j5 = (j4 * j2) - ((long) iDigit);
            if (j5 > j4) {
                throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
            }
            i5 = i6;
            j4 = j5;
        }
        if (z) {
            j4 = -j4;
            if (j4 < 0) {
                throw new NumberFormatException(StringSerializer.STRING.deser(bArr, i, i2));
            }
        }
        return j4;
    }
}
