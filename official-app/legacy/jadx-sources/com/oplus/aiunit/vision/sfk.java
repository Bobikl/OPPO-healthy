package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes13.dex */
public final class sfk extends Writer {
    public final ht9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OutputStream f16570j;
    public byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f16571l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16572n;

    public sfk(ht9 ht9Var, OutputStream outputStream) {
        this.i = ht9Var;
        this.f16570j = outputStream;
        byte[] bArrJ = ht9Var.j();
        this.k = bArrJ;
        this.f16571l = bArrJ.length - 4;
        this.m = 0;
    }

    public static void g(int i) throws IOException {
        throw new IOException(h(i));
    }

    public static String h(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
    }

    public int a(int i) throws IOException {
        int i2 = this.f16572n;
        this.f16572n = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - u48.SURR1_FIRST) << 10) + 65536 + (i - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f16570j;
        if (outputStream != null) {
            int i = this.m;
            if (i > 0) {
                outputStream.write(this.k, 0, i);
                this.m = 0;
            }
            OutputStream outputStream2 = this.f16570j;
            this.f16570j = null;
            byte[] bArr = this.k;
            if (bArr != null) {
                this.k = null;
                this.i.t(bArr);
            }
            outputStream2.close();
            int i2 = this.f16572n;
            this.f16572n = 0;
            if (i2 > 0) {
                g(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f16570j;
        if (outputStream != null) {
            int i = this.m;
            if (i > 0) {
                outputStream.write(this.k, 0, i);
                this.m = 0;
            }
            this.f16570j.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws IOException {
        write(c2);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.f16572n > 0) {
            i2--;
            write(a(cArr[i]));
            i++;
        }
        int i3 = this.m;
        byte[] bArr = this.k;
        int i4 = this.f16571l;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.f16570j.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char c2 = cArr[i];
            if (c2 < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) c2;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        continue;
                    } else {
                        i6 = i + 1;
                        c2 = cArr[i];
                        if (c2 < 128) {
                            i7 = i3 + 1;
                            bArr[i3] = (byte) c2;
                        }
                    }
                }
            }
            if (c2 < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((c2 >> 6) | 192);
                i3 = i11 + 1;
                bArr[i11] = (byte) ((c2 & '?') | 128);
                i = i6;
            } else if (c2 < 55296 || c2 > 57343) {
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((c2 >> '\f') | oei.TAI_CHI);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((c2 >> 6) & 63) | 128);
                bArr[i13] = (byte) ((c2 & '?') | 128);
                i = i6;
                i3 = i13 + 1;
            } else {
                if (c2 > 56319) {
                    this.m = i3;
                    g(c2);
                }
                this.f16572n = c2;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int iA = a(cArr[i6]);
                if (iA > 1114111) {
                    this.m = i3;
                    g(iA);
                }
                int i14 = i3 + 1;
                bArr[i3] = (byte) ((iA >> 18) | 240);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((iA >> 12) & 63) | 128);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((iA >> 6) & 63) | 128);
                i3 = i16 + 1;
                bArr[i16] = (byte) ((iA & 63) | 128);
            }
        }
        this.m = i3;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        if (this.f16572n > 0) {
            i = a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                g(i);
            }
            this.f16572n = i;
            return;
        }
        int i3 = this.m;
        if (i3 >= this.f16571l) {
            this.f16570j.write(this.k, 0, i3);
            this.m = 0;
        }
        if (i < 128) {
            byte[] bArr = this.k;
            int i4 = this.m;
            this.m = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.m;
        if (i < 2048) {
            byte[] bArr2 = this.k;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i6 + 1;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.k;
            int i7 = i5 + 1;
            bArr3[i5] = (byte) ((i >> 12) | oei.TAI_CHI);
            int i8 = i7 + 1;
            bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i8] = (byte) ((i & 63) | 128);
            i2 = i8 + 1;
        } else {
            if (i > 1114111) {
                g(i);
            }
            byte[] bArr4 = this.k;
            int i9 = i5 + 1;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            int i10 = i9 + 1;
            bArr4[i9] = (byte) (((i >> 12) & 63) | 128);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i >> 6) & 63) | 128);
            i2 = i11 + 1;
            bArr4[i11] = (byte) ((i & 63) | 128);
        }
        this.m = i2;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.f16572n > 0) {
            i2--;
            write(a(str.charAt(i)));
            i++;
        }
        int i3 = this.m;
        byte[] bArr = this.k;
        int i4 = this.f16571l;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.f16570j.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) cCharAt;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        continue;
                    } else {
                        i6 = i + 1;
                        cCharAt = str.charAt(i);
                        if (cCharAt < 128) {
                            i7 = i3 + 1;
                            bArr[i3] = (byte) cCharAt;
                        }
                    }
                }
            }
            if (cCharAt < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((cCharAt >> 6) | 192);
                i3 = i11 + 1;
                bArr[i11] = (byte) ((cCharAt & '?') | 128);
                i = i6;
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                if (cCharAt > 56319) {
                    this.m = i3;
                    g(cCharAt);
                }
                this.f16572n = cCharAt;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int iA = a(str.charAt(i6));
                if (iA > 1114111) {
                    this.m = i3;
                    g(iA);
                }
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((iA >> 18) | 240);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((iA >> 12) & 63) | 128);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((iA >> 6) & 63) | 128);
                i3 = i14 + 1;
                bArr[i14] = (byte) ((iA & 63) | 128);
            } else {
                int i15 = i3 + 1;
                bArr[i3] = (byte) ((cCharAt >> '\f') | oei.TAI_CHI);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i16] = (byte) ((cCharAt & '?') | 128);
                i = i6;
                i3 = i16 + 1;
            }
        }
        this.m = i3;
    }
}
