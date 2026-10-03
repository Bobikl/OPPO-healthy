package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public final class cxm implements Closeable {
    public final Charset i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RandomAccessFile f10283j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[][] f10284l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10285n;
    public a o;
    public boolean p = false;

    public class a {
        public final long a;
        public final byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f10286c;
        public int d;

        public /* synthetic */ a(cxm cxmVar, long j2, int i) {
            this(j2, i, null);
        }

        public static String a(a aVar) {
            String str;
            byte[] bArr;
            int length;
            boolean z = aVar.a == 1;
            int i = aVar.d;
            while (true) {
                if (i > -1) {
                    if (z || i >= cxm.this.m) {
                        byte[] bArr2 = aVar.b;
                        byte[][] bArr3 = cxm.this.f10284l;
                        int length2 = bArr3.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                length = 0;
                                break;
                            }
                            byte[] bArr4 = bArr3[i2];
                            boolean z2 = true;
                            for (int length3 = bArr4.length - 1; length3 >= 0; length3--) {
                                int length4 = (i + length3) - (bArr4.length - 1);
                                z2 &= length4 >= 0 && bArr2[length4] == bArr4[length3];
                            }
                            if (z2) {
                                length = bArr4.length;
                                break;
                            }
                            i2++;
                        }
                        if (length > 0) {
                            int i3 = i + 1;
                            int i4 = (aVar.d - i3) + 1;
                            if (i4 < 0) {
                                throw new IllegalStateException("Unexpected negative line length=" + i4);
                            }
                            byte[] bArr5 = new byte[i4];
                            System.arraycopy(aVar.b, i3, bArr5, 0, i4);
                            str = new String(bArr5, cxm.this.i.name());
                            aVar.d = i - length;
                            break;
                        }
                        i -= cxm.this.f10285n;
                        if (i < 0) {
                            int i5 = aVar.d + 1;
                            if (i5 > 0) {
                                byte[] bArr6 = new byte[i5];
                                aVar.f10286c = bArr6;
                                System.arraycopy(aVar.b, 0, bArr6, 0, i5);
                            } else {
                                aVar.f10286c = null;
                            }
                            aVar.d = -1;
                        }
                    } else {
                        int i6 = aVar.d + 1;
                        if (i6 > 0) {
                            byte[] bArr7 = new byte[i6];
                            aVar.f10286c = bArr7;
                            System.arraycopy(aVar.b, 0, bArr7, 0, i6);
                        } else {
                            aVar.f10286c = null;
                        }
                        aVar.d = -1;
                    }
                }
                str = null;
                break;
            }
            if (!z || (bArr = aVar.f10286c) == null) {
                return str;
            }
            String str2 = new String(bArr, cxm.this.i.name());
            aVar.f10286c = null;
            return str2;
        }

        public a(long j2, int i, byte[] bArr) throws IOException {
            this.a = j2;
            int length = (bArr != null ? bArr.length : 0) + i;
            byte[] bArr2 = new byte[length];
            this.b = bArr2;
            long jA = (j2 - 1) * ((long) cxm.a(cxm.this));
            if (j2 > 0) {
                cxm.this.f10283j.seek(jA);
                if (cxm.this.f10283j.read(bArr2, 0, i) != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.d = length - 1;
            this.f10286c = null;
        }
    }

    public cxm(File file, Charset charset) throws IOException {
        Charset charsetA;
        this.i = charset;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f10283j = randomAccessFile;
        long length = randomAccessFile.length();
        int i = 4096;
        long j2 = 4096;
        int i2 = (int) (length % j2);
        if (i2 <= 0) {
            this.k = length / j2;
            if (length <= 0) {
            }
            this.o = new a(this, this.k, i);
            charsetA = wvm.a(charset);
            if (charsetA.newEncoder().maxBytesPerChar() != 1.0f || charsetA == wvm.feedbackd || charsetA == Charset.forName("Shift_JIS")) {
                this.f10285n = 1;
            } else {
                if (charsetA == wvm.feedbackb && charsetA != wvm.feedbackc) {
                    if (charsetA == wvm.feedbacka) {
                        throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                    }
                    throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
                }
                this.f10285n = 2;
            }
            byte[][] bArr = {"\r\n".getBytes(charset.name()), Weather.SEPARATOR.getBytes(charset.name()), "\r".getBytes(charset.name())};
            this.f10284l = bArr;
            this.m = bArr[0].length;
        }
        this.k = (length / j2) + 1;
        i = i2;
        this.o = new a(this, this.k, i);
        charsetA = wvm.a(charset);
        if (charsetA.newEncoder().maxBytesPerChar() != 1.0f) {
            this.f10285n = 1;
        } else {
            if (charsetA == wvm.feedbackb) {
            }
            this.f10285n = 2;
        }
        byte[][] bArr2 = {"\r\n".getBytes(charset.name()), Weather.SEPARATOR.getBytes(charset.name()), "\r".getBytes(charset.name())};
        this.f10284l = bArr2;
        this.m = bArr2[0].length;
    }

    public static /* synthetic */ int a(cxm cxmVar) {
        cxmVar.getClass();
        return 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10283j.close();
    }

    public final String g() {
        a aVar;
        String strA = a.a(this.o);
        while (strA == null) {
            a aVar2 = this.o;
            if (aVar2.d > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + aVar2.d);
            }
            long j2 = aVar2.a;
            if (j2 > 1) {
                cxm cxmVar = cxm.this;
                cxmVar.getClass();
                aVar = cxmVar.new a(j2 - 1, 4096, aVar2.f10286c);
            } else {
                if (aVar2.f10286c != null) {
                    throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=".concat(new String(aVar2.f10286c, cxm.this.i.name())));
                }
                aVar = null;
            }
            this.o = aVar;
            if (aVar == null) {
                break;
            }
            strA = a.a(aVar);
        }
        if (!"".equals(strA) || this.p) {
            return strA;
        }
        this.p = true;
        return g();
    }
}
