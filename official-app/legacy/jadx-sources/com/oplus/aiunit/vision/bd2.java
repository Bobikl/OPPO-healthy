package com.oplus.aiunit.vision;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes12.dex */
public class bd2 {
    public byte[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9680c;

    public bd2(int i) {
        this.f9680c = null;
        this.a = new byte[i];
        this.b = 0;
    }

    public void a(byte b) {
        e(this.b + 1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    public void b(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void c(byte[] bArr, int i, int i2) {
        e(this.b + i2);
        System.arraycopy(bArr, i, this.a, this.b, i2);
        this.b += i2;
    }

    public int d(int i) {
        if (i < this.b) {
            return this.a[i] & 255;
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    public final void e(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            this.a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public InputStream f() {
        return new ByteArrayInputStream(this.a, 0, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    public String g() {
        String str;
        if (this.f9680c == null) {
            int i = this.b;
            if (i >= 2) {
                byte[] bArr = this.a;
                byte b = bArr[0];
                if (b == 0) {
                    if (i < 4 || bArr[1] != 0) {
                        str = CharEncoding.UTF_16BE;
                    } else if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                        str = "UTF-32BE";
                    } else {
                        this.f9680c = "UTF-32";
                    }
                    this.f9680c = str;
                } else {
                    if ((b & 255) < 128) {
                        if (bArr[1] == 0) {
                            str = (i < 4 || bArr[2] != 0) ? CharEncoding.UTF_16LE : "UTF-32LE";
                            this.f9680c = str;
                        }
                    } else if ((b & 255) != 239) {
                        if ((b & 255) != 254 && i >= 4 && bArr[2] == 0) {
                            this.f9680c = "UTF-32";
                        } else {
                            this.f9680c = CharEncoding.UTF_16;
                        }
                    }
                    this.f9680c = "UTF-8";
                }
            } else {
                this.f9680c = "UTF-8";
            }
        }
        return this.f9680c;
    }

    public int h() {
        return this.b;
    }

    public bd2(InputStream inputStream) throws IOException {
        this.f9680c = null;
        this.b = 0;
        this.a = new byte[16384];
        while (true) {
            int i = inputStream.read(this.a, this.b, 16384);
            if (i <= 0) {
                return;
            }
            int i2 = this.b + i;
            this.b = i2;
            if (i != 16384) {
                return;
            } else {
                e(i2 + 16384);
            }
        }
    }

    public bd2(byte[] bArr) {
        this.f9680c = null;
        this.a = bArr;
        this.b = bArr.length;
    }
}
