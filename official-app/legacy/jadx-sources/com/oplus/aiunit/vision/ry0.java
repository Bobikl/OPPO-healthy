package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.OutputStream;
import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes11.dex */
public class ry0 implements hm6 {
    public final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public byte b = Base64.padSymbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16399c = new byte[128];

    public ry0() {
        e();
    }

    @Override // com.oplus.aiunit.vision.hm6
    public int a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3;
        int i4 = i2 % 3;
        int i5 = i2 - i4;
        int i6 = i;
        while (true) {
            i3 = i + i5;
            if (i6 >= i3) {
                break;
            }
            int i7 = bArr[i6] & 255;
            int i8 = bArr[i6 + 1] & 255;
            int i9 = bArr[i6 + 2] & 255;
            outputStream.write(this.a[(i7 >>> 2) & 63]);
            outputStream.write(this.a[((i7 << 4) | (i8 >>> 4)) & 63]);
            outputStream.write(this.a[((i8 << 2) | (i9 >>> 6)) & 63]);
            outputStream.write(this.a[i9 & 63]);
            i6 += 3;
        }
        if (i4 == 1) {
            int i10 = bArr[i3] & 255;
            outputStream.write(this.a[(i10 >>> 2) & 63]);
            outputStream.write(this.a[(i10 << 4) & 63]);
            outputStream.write(this.b);
            outputStream.write(this.b);
        } else if (i4 == 2) {
            int i11 = bArr[i3] & 255;
            int i12 = bArr[i3 + 1] & 255;
            outputStream.write(this.a[(i11 >>> 2) & 63]);
            outputStream.write(this.a[((i11 << 4) | (i12 >>> 4)) & 63]);
            outputStream.write(this.a[(i12 << 2) & 63]);
            outputStream.write(this.b);
        }
        return ((i5 / 3) * 4) + (i4 == 0 ? 0 : 4);
    }

    @Override // com.oplus.aiunit.vision.hm6
    public int b(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && d(str.charAt(length - 1))) {
            length--;
        }
        int i = length - 4;
        int i2 = 0;
        int iF = f(str, 0, i);
        while (iF < i) {
            int i3 = iF + 1;
            byte b = this.f16399c[str.charAt(iF)];
            int iF2 = f(str, i3, i);
            int i4 = iF2 + 1;
            byte b2 = this.f16399c[str.charAt(iF2)];
            int iF3 = f(str, i4, i);
            int i5 = iF3 + 1;
            byte b3 = this.f16399c[str.charAt(iF3)];
            int iF4 = f(str, i5, i);
            int i6 = iF4 + 1;
            byte b4 = this.f16399c[str.charAt(iF4)];
            if ((b | b2 | b3 | b4) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i2 += 3;
            iF = f(str, i6, i);
        }
        return i2 + c(outputStream, str.charAt(i), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    public final int c(OutputStream outputStream, char c2, char c3, char c4, char c5) throws IOException {
        char c6 = this.b;
        if (c4 == c6) {
            if (c5 != c6) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.f16399c;
            byte b = bArr[c2];
            byte b2 = bArr[c3];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b2 >> 4) | (b << 2));
            return 1;
        }
        if (c5 == c6) {
            byte[] bArr2 = this.f16399c;
            byte b3 = bArr2[c2];
            byte b4 = bArr2[c3];
            byte b5 = bArr2[c4];
            if ((b3 | b4 | b5) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b3 << 2) | (b4 >> 4));
            outputStream.write((b5 >> 2) | (b4 << 4));
            return 2;
        }
        byte[] bArr3 = this.f16399c;
        byte b6 = bArr3[c2];
        byte b7 = bArr3[c3];
        byte b8 = bArr3[c4];
        byte b9 = bArr3[c5];
        if ((b6 | b7 | b8 | b9) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b6 << 2) | (b7 >> 4));
        outputStream.write((b7 << 4) | (b8 >> 2));
        outputStream.write(b9 | (b8 << 6));
        return 3;
    }

    public final boolean d(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    public void e() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f16399c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i >= bArr2.length) {
                return;
            }
            this.f16399c[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public final int f(String str, int i, int i2) {
        while (i < i2 && d(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
