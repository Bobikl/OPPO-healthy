package com.lifesense.android.bluetooth.core.business.ota;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class e extends FilterInputStream {
    public final byte[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8599c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8600e;
    public int f;
    public int g;
    public final int h;

    public e(InputStream inputStream, int i) {
        super(new BufferedInputStream(inputStream, inputStream.available()));
        this.a = new byte[128];
        this.b = 128;
        this.d = 128;
        this.f8600e = 0;
        this.h = i;
        this.f = b(i);
    }

    public final int a() throws IOException {
        int iA;
        int i;
        long j2;
        long jSkip;
        if (this.f8599c == -1) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        while (true) {
            int i2 = inputStream.read();
            this.f8599c++;
            if (i2 != 10 && i2 != 13) {
                c(i2);
                int iB = b(inputStream);
                this.f8599c += 2;
                int iA2 = a(inputStream);
                this.f8599c += 4;
                int iB2 = b(inputStream);
                int i3 = this.f8599c + 2;
                this.f8599c = i3;
                if (iB2 != 0) {
                    if (iB2 == 1) {
                        this.f8599c = -1;
                        return 0;
                    }
                    if (iB2 != 2) {
                        if (iB2 != 4) {
                            j2 = i3;
                            jSkip = inputStream.skip((iB * 2) + 2);
                        } else {
                            int iA3 = a(inputStream);
                            i = this.f8599c + 4;
                            this.f8599c = i;
                            if (this.g > 0 && iA3 != (this.f8600e >> 16) + 1) {
                                return 0;
                            }
                            iA = iA3 << 16;
                        }
                        this.f8599c = (int) (j2 + jSkip);
                    } else {
                        iA = a(inputStream) << 4;
                        i = this.f8599c + 4;
                        this.f8599c = i;
                        if (this.g > 0 && (iA >> 16) != (this.f8600e >> 16) + 1) {
                            return 0;
                        }
                    }
                    this.f8600e = iA;
                    j2 = i;
                    jSkip = inputStream.skip(2L);
                    this.f8599c = (int) (j2 + jSkip);
                } else if (this.f8600e + iA2 < this.h) {
                    this.f8599c = (int) (((long) i3) + inputStream.skip((iB * 2) + 2));
                    iB2 = -1;
                }
                if (iB2 == 0) {
                    for (int i4 = 0; i4 < this.a.length && i4 < iB; i4++) {
                        int iB3 = b(inputStream);
                        this.f8599c += 2;
                        this.a[i4] = (byte) iB3;
                    }
                    this.f8599c = (int) (((long) this.f8599c) + inputStream.skip(2L));
                    this.b = 0;
                    return iB;
                }
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.f - this.g;
    }

    public final int b(int i) throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        inputStream.mark(inputStream.available());
        try {
            int i2 = inputStream.read();
            int i3 = 0;
            String str = null;
            int i4 = 0;
            while (true) {
                c(i2);
                int iB = b(inputStream);
                int iA = a(inputStream);
                int iB2 = b(inputStream);
                if (iB2 != 0) {
                    if (iB2 == 1) {
                        return i4;
                    }
                    if (iB2 == 2) {
                        int iA2 = a(inputStream) << 4;
                        if (i4 > 0 && (iA2 >> 16) != (i3 >> 16) + 1) {
                            return i4;
                        }
                        inputStream.skip(2L);
                        i3 = iA2;
                    } else if (iB2 == 4) {
                        int iA3 = a(inputStream);
                        if (i4 > 0 && iA3 != (i3 >> 16) + 1) {
                            return i4;
                        }
                        i3 = iA3 << 16;
                        inputStream.skip(2L);
                    }
                    while (true) {
                        i2 = inputStream.read();
                        if (i2 != 10 || i2 == 13) {
                        }
                    }
                } else if (iA + i3 >= i) {
                    i4 += iB;
                }
                long j2 = (iB * 2) + 2;
                long jSkip = inputStream.skip(j2);
                if (jSkip != j2 && str == null) {
                    str = "failed to calculate file bin size >> [" + j2 + "," + jSkip + "]";
                    Log.e("LS-BLE", str);
                    com.lifesense.android.bluetooth.core.business.log.d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Program_Exception, true, str, null);
                }
                while (true) {
                    i2 = inputStream.read();
                    if (i2 != 10) {
                    }
                }
            }
        } finally {
            inputStream.reset();
        }
    }

    public final void c(int i) throws d {
        if (i != 58) {
            throw new d("Not a HEX file");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f8599c = 0;
        this.g = 0;
        this.b = 0;
    }

    public final int a(int i) {
        if (i >= 65) {
            return i - 55;
        }
        if (i >= 48) {
            return i - 48;
        }
        return -1;
    }

    public final int b(InputStream inputStream) {
        return a(inputStream.read()) | (a(inputStream.read()) << 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return a(bArr);
    }

    public final int a(InputStream inputStream) {
        return b(inputStream) | (b(inputStream) << 8);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }

    public int a(byte[] bArr) throws IOException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = this.b;
            if (i2 < this.d) {
                byte[] bArr2 = this.a;
                this.b = i2 + 1;
                bArr[i] = bArr2[i2];
                i++;
            } else {
                int i3 = this.g;
                int iA = a();
                this.d = iA;
                this.g = i3 + iA;
                if (iA == 0) {
                    break;
                }
            }
        }
        return i;
    }
}
