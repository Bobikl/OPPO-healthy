package com.oplus.aiunit.vision;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.heytap.connect.cipher.AESUtil;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes15.dex */
public class fs4 {
    public static final int FORMAT_FLOAT = 52;
    public static final int FORMAT_SFLOAT = 50;
    public static final int FORMAT_SINT16 = 34;
    public static final int FORMAT_SINT24 = 35;
    public static final int FORMAT_SINT32 = 36;
    public static final int FORMAT_SINT8 = 33;
    public static final int FORMAT_UINT16 = 18;
    public static final int FORMAT_UINT24 = 19;
    public static final int FORMAT_UINT32 = 20;
    public static final int FORMAT_UINT8 = 17;
    public static char[] b = AESUtil.HEX.toCharArray();
    public byte[] a;

    public fs4(@Nullable byte[] bArr) {
        this.a = bArr;
    }

    public boolean a(int i, int i2) {
        return i + 1 <= d() && ((this.a[i] >> i2) & 1) == 1;
    }

    @Nullable
    public Integer b(int i, @IntRange(from = 0) int i2) {
        if (c(i) + i2 > d()) {
            return null;
        }
        switch (i) {
            case 17:
                return Integer.valueOf(qd2.h(this.a[i2]));
            case 18:
                byte[] bArr = this.a;
                return Integer.valueOf(qd2.i(bArr[i2], bArr[i2 + 1]));
            case 19:
                byte[] bArr2 = this.a;
                return Integer.valueOf(qd2.j(bArr2[i2], bArr2[i2 + 1], bArr2[i2 + 2], (byte) 0));
            case 20:
                byte[] bArr3 = this.a;
                return Integer.valueOf(qd2.j(bArr3[i2], bArr3[i2 + 1], bArr3[i2 + 2], bArr3[i2 + 3]));
            default:
                switch (i) {
                    case 33:
                        return Integer.valueOf(qd2.k(qd2.h(this.a[i2]), 8));
                    case 34:
                        byte[] bArr4 = this.a;
                        return Integer.valueOf(qd2.k(qd2.i(bArr4[i2], bArr4[i2 + 1]), 16));
                    case 35:
                        byte[] bArr5 = this.a;
                        return Integer.valueOf(qd2.k(qd2.j(bArr5[i2], bArr5[i2 + 1], bArr5[i2 + 2], (byte) 0), 24));
                    case 36:
                        byte[] bArr6 = this.a;
                        return Integer.valueOf(qd2.k(qd2.j(bArr6[i2], bArr6[i2 + 1], bArr6[i2 + 2], bArr6[i2 + 3]), 32));
                    default:
                        return null;
                }
        }
    }

    public final int c(int i) {
        return i & 15;
    }

    public int d() {
        byte[] bArr = this.a;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public String toString() {
        if (d() == 0) {
            return "";
        }
        char[] cArr = new char[(this.a.length * 3) - 1];
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return "(0x) " + new String(cArr);
            }
            int i2 = bArr[i] & 255;
            int i3 = i * 3;
            char[] cArr2 = b;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
            if (i != bArr.length - 1) {
                cArr[i3 + 2] = Soundex.SILENT_MARKER;
            }
            i++;
        }
    }
}
