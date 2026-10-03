package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class q1 {
    public OutputStream a;

    public class a extends q1 {
        public boolean b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.b = true;
        }

        @Override // com.oplus.aiunit.vision.q1
        public void c(int i) throws IOException {
            if (this.b) {
                this.b = false;
            } else {
                super.c(i);
            }
        }
    }

    public q1(OutputStream outputStream) {
        this.a = outputStream;
    }

    public q1 a() {
        return new vj4(this.a);
    }

    public q1 b() {
        return new rk4(this.a);
    }

    public void c(int i) throws IOException {
        this.a.write(i);
    }

    public void d(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    public void e(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    public void f(int i, int i2, byte[] bArr) throws IOException {
        k(i, i2);
        i(bArr.length);
        d(bArr);
    }

    public void g(int i, byte[] bArr) throws IOException {
        c(i);
        i(bArr.length);
        d(bArr);
    }

    public void h(r1 r1Var) throws IOException {
        if (r1Var == null) {
            throw new IOException("null object detected");
        }
        r1Var.g(new a(this.a));
    }

    public void i(int i) throws IOException {
        if (i <= 127) {
            c((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        c((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            c((byte) (i >> i4));
        }
    }

    public void j(f1 f1Var) throws IOException {
        if (f1Var == null) {
            throw new IOException("null object detected");
        }
        f1Var.c().g(this);
    }

    public void k(int i, int i2) throws IOException {
        if (i2 < 31) {
            c(i | i2);
            return;
        }
        c(i | 31);
        if (i2 < 128) {
            c(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        e(bArr, i3, 5 - i3);
    }
}
