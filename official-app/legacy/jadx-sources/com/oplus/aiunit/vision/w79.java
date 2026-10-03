package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class w79 implements hm6 {
    public final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public final byte[] b = new byte[128];

    public w79() {
        d();
    }

    public static boolean c(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    @Override // com.oplus.aiunit.vision.hm6
    public int a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            outputStream.write(this.a[i4 >>> 4]);
            outputStream.write(this.a[i4 & 15]);
        }
        return i2 * 2;
    }

    @Override // com.oplus.aiunit.vision.hm6
    public int b(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && c(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && c(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b = this.b[str.charAt(i)];
            while (i3 < length && c(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b2 = this.b[str.charAt(i3)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write((b << 4) | b2);
            i2++;
            i = i4;
        }
        return i2;
    }

    public void d() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.b[bArr2[i]] = (byte) i;
            i++;
        }
    }
}
