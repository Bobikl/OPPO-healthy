package com.oplus.aiunit.vision;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public class yta {
    public static bd2 a(bd2 bd2Var) {
        if (!"UTF-8".equals(bd2Var.g())) {
            return bd2Var;
        }
        byte[] bArr = new byte[8];
        bd2 bd2Var2 = new bd2((bd2Var.h() * 4) / 3);
        int i = 0;
        char c2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < bd2Var.h()) {
            int iD = bd2Var.d(i);
            if (c2 == 11) {
                if (i2 <= 0 || (iD & 192) != 128) {
                    bd2Var2.b(b(bArr[0]));
                    i -= i3;
                } else {
                    int i4 = i3 + 1;
                    bArr[i3] = (byte) iD;
                    i2--;
                    if (i2 == 0) {
                        bd2Var2.c(bArr, 0, i4);
                    } else {
                        i3 = i4;
                    }
                }
                c2 = 0;
                i3 = 0;
            } else if (iD < 127) {
                bd2Var2.a((byte) iD);
            } else if (iD >= 192) {
                i2 = -1;
                for (int i5 = iD; i2 < 8 && (i5 & 128) == 128; i5 <<= 1) {
                    i2++;
                }
                bArr[i3] = (byte) iD;
                i3++;
                c2 = 11;
            } else {
                bd2Var2.b(b((byte) iD));
            }
            i++;
        }
        if (c2 == 11) {
            for (int i6 = 0; i6 < i3; i6++) {
                bd2Var2.b(b(bArr[i6]));
            }
        }
        return bd2Var2;
    }

    public static byte[] b(byte b) {
        int i = b & 255;
        if (i >= 128) {
            try {
                return (i == 129 || i == 141 || i == 143 || i == 144 || i == 157) ? new byte[]{32} : new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b};
    }
}
