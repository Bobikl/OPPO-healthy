package com.xingin.xhssharesdk.a;

import com.oplus.aiunit.vision.jmm;
import com.oplus.aiunit.vision.q9m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g extends jmm {
    public static final Logger a = Logger.getLogger(g.class.getName());
    public static final boolean b = q9m.f15694c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f20421c = q9m.d;

    public static abstract class a extends g {
        public final byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20422e;
        public int f;

        public a() {
            super(0);
            int iMax = Math.max(4096, 20);
            this.d = new byte[iMax];
            this.f20422e = iMax;
        }

        public final void B(long j2) {
            if (g.b) {
                long j3 = g.f20421c + ((long) this.f);
                long j4 = j3;
                while ((j2 & (-128)) != 0) {
                    q9m.d(this.d, j4, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                    j4 = 1 + j4;
                }
                q9m.d(this.d, j4, (byte) j2);
                this.f += (int) ((1 + j4) - j3);
                return;
            }
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr2[i2] = (byte) j2;
        }

        public final void C(int i) {
            if (g.b) {
                long j2 = g.f20421c + ((long) this.f);
                long j3 = j2;
                while ((i & (-128)) != 0) {
                    q9m.d(this.d, j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                    j3 = 1 + j3;
                }
                q9m.d(this.d, j3, (byte) i);
                this.f += (int) ((1 + j3) - j2);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            bArr2[i3] = (byte) i;
        }
    }

    public static class b extends g {
        public final byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20423e;
        public int f;

        public b(byte[] bArr, int i) {
            super(0);
            int i2 = i + 0;
            if ((i | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.d = bArr;
            this.f = 0;
            this.f20423e = i2;
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void A(int i) throws c {
            if (g.b) {
                int i2 = this.f20423e;
                int i3 = this.f;
                if (i2 - i3 >= 10) {
                    long j2 = g.f20421c + ((long) i3);
                    while ((i & (-128)) != 0) {
                        q9m.d(this.d, j2, (byte) ((i & 127) | 128));
                        this.f++;
                        i >>>= 7;
                        j2 = 1 + j2;
                    }
                    q9m.d(this.d, j2, (byte) i);
                    this.f++;
                    return;
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i4 = this.f;
                    this.f = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f20423e), 1), e2);
                }
            }
            byte[] bArr2 = this.d;
            int i5 = this.f;
            this.f = i5 + 1;
            bArr2[i5] = (byte) i;
        }

        @Override // com.oplus.aiunit.vision.jmm
        public final void a(byte[] bArr, int i, int i2) throws c {
            u(bArr, i, i2);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void h() {
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void i(byte b) throws c {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f20423e), 1), e2);
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void j(int i, int i2) throws c {
            A(c0.a(i, 0));
            z(i2);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void k(int i, k kVar) throws c {
            A(c0.a(i, 2));
            A(kVar.b());
            kVar.a(this);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void m(byte[] bArr, int i) throws c {
            A(i);
            u(bArr, 0, i);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void o(int i, int i2) throws c {
            A(c0.a(i, i2));
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void p(int i, String str) throws c {
            A(c0.a(i, 2));
            t(str);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void q(long j2) throws c {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j2) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j2 >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j2 >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j2 >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j2 >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j2 >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j2 >> 48)) & 255);
                this.f = i8 + 1;
                bArr[i8] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f20423e), 1), e2);
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void r(e eVar) throws c {
            A(eVar.size());
            eVar.a(this);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void s(l lVar) throws c {
            A(lVar.b());
            lVar.a(this);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void t(String str) throws c {
            int i = this.f;
            try {
                int iV = g.v(str.length() * 3);
                int iV2 = g.v(str.length());
                if (iV2 == iV) {
                    int i2 = i + iV2;
                    this.f = i2;
                    int iA = b0.a.a(str, this.d, i2, this.f20423e - i2);
                    this.f = i;
                    A((iA - i) - iV2);
                    this.f = iA;
                } else {
                    A(b0.c(str));
                    byte[] bArr = this.d;
                    int i3 = this.f;
                    this.f = b0.a.a(str, bArr, i3, this.f20423e - i3);
                }
            } catch (b0.c e2) {
                this.f = i;
                l(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(e3);
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void u(byte[] bArr, int i, int i2) throws c {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f20423e), Integer.valueOf(i2)), e2);
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void w(long j2) throws c {
            A(c0.a(8, 0));
            y(j2);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void x(int i) throws c {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f20423e), 1), e2);
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void y(long j2) throws c {
            if (g.b) {
                int i = this.f20423e;
                int i2 = this.f;
                if (i - i2 >= 10) {
                    long j3 = g.f20421c + ((long) i2);
                    while ((j2 & (-128)) != 0) {
                        q9m.d(this.d, j3, (byte) ((((int) j2) & 127) | 128));
                        this.f++;
                        j2 >>>= 7;
                        j3 = 1 + j3;
                    }
                    q9m.d(this.d, j3, (byte) j2);
                    this.f++;
                    return;
                }
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr[i3] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f20423e), 1), e2);
                }
            }
            byte[] bArr2 = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr2[i4] = (byte) j2;
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void z(int i) throws c {
            if (i >= 0) {
                A(i);
            } else {
                y(i);
            }
        }
    }

    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, indexOutOfBoundsException);
        }
    }

    public static final class d extends a {
        public final OutputStream g;

        public d(ByteArrayOutputStream byteArrayOutputStream) {
            this.g = byteArrayOutputStream;
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void A(int i) throws IOException {
            D(10);
            C(i);
        }

        public final void D(int i) throws IOException {
            int i2 = this.f20422e;
            int i3 = this.f;
            if (i2 - i3 < i) {
                this.g.write(this.d, 0, i3);
                this.f = 0;
            }
        }

        @Override // com.oplus.aiunit.vision.jmm
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            u(bArr, i, i2);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void h() throws IOException {
            int i = this.f;
            if (i > 0) {
                this.g.write(this.d, 0, i);
                this.f = 0;
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void i(byte b) throws IOException {
            int i = this.f;
            if (i == this.f20422e) {
                this.g.write(this.d, 0, i);
                this.f = 0;
            }
            byte[] bArr = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = b;
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void j(int i, int i2) throws IOException {
            D(20);
            C(c0.a(i, 0));
            if (i2 >= 0) {
                C(i2);
            } else {
                B(i2);
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void k(int i, k kVar) throws IOException {
            A(c0.a(i, 2));
            A(kVar.b());
            kVar.a(this);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void m(byte[] bArr, int i) throws IOException {
            A(i);
            u(bArr, 0, i);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void o(int i, int i2) throws IOException {
            A(c0.a(i, i2));
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void p(int i, String str) throws IOException {
            A(c0.a(i, 2));
            t(str);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void q(long j2) throws IOException {
            D(8);
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            bArr[i] = (byte) (j2 & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((j2 >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((j2 >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((j2 >> 24) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j2 >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j2 >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j2 >> 48)) & 255);
            this.f = i8 + 1;
            bArr[i8] = (byte) (((int) (j2 >> 56)) & 255);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void r(e eVar) throws IOException {
            A(eVar.size());
            eVar.a(this);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void s(l lVar) throws IOException {
            A(lVar.b());
            lVar.a(this);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void t(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iV = g.v(length);
                int i = iV + length;
                int i2 = this.f20422e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iA = b0.a.a(str, bArr, 0, length);
                    A(iA);
                    u(bArr, 0, iA);
                    return;
                }
                int i3 = this.f;
                if (i > i2 - i3) {
                    this.g.write(this.d, 0, i3);
                    this.f = 0;
                }
                int iV2 = g.v(str.length());
                int i4 = this.f;
                try {
                    try {
                        if (iV2 == iV) {
                            int i5 = i4 + iV2;
                            this.f = i5;
                            int iA2 = b0.a.a(str, this.d, i5, this.f20422e - i5);
                            this.f = i4;
                            C((iA2 - i4) - iV2);
                            this.f = iA2;
                        } else {
                            int iC = b0.c(str);
                            C(iC);
                            this.f = b0.a.a(str, this.d, this.f, iC);
                        }
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw new c(e2);
                    }
                } catch (b0.c e3) {
                    this.f = i4;
                    throw e3;
                }
            } catch (b0.c e4) {
                l(str, e4);
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void u(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f20422e;
            int i4 = this.f;
            int i5 = i3 - i4;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, this.d, i4, i2);
                this.f += i2;
                return;
            }
            System.arraycopy(bArr, i, this.d, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            int i8 = this.f20422e;
            this.f = i8;
            this.g.write(this.d, 0, i8);
            this.f = 0;
            if (i7 > this.f20422e) {
                this.g.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, this.d, 0, i7);
                this.f = i7;
            }
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void w(long j2) throws IOException {
            D(20);
            C(c0.a(8, 0));
            B(j2);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void x(int i) throws IOException {
            D(4);
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void y(long j2) throws IOException {
            D(10);
            B(j2);
        }

        @Override // com.xingin.xhssharesdk.a.g
        public final void z(int i) throws IOException {
            if (i >= 0) {
                A(i);
            } else {
                y(i);
            }
        }
    }

    public g() {
    }

    public /* synthetic */ g(int i) {
        this();
    }

    public static int b(int i) {
        if (i >= 0) {
            return v(i);
        }
        return 10;
    }

    public static int c(int i, String str) {
        return g(str) + n(i);
    }

    public static int d(long j2) {
        int i;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i + 1 : i;
    }

    public static int e(e eVar) {
        int size = eVar.size();
        return v(size) + size;
    }

    public static int f(l lVar) {
        int iB = lVar.b();
        return v(iB) + iB;
    }

    public static int g(String str) {
        int length;
        try {
            length = b0.c(str);
        } catch (b0.c unused) {
            length = str.getBytes(f.a).length;
        }
        return v(length) + length;
    }

    public static int n(int i) {
        return v(c0.a(i, 0));
    }

    public static int v(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public abstract void A(int i);

    public abstract void h();

    public abstract void i(byte b2);

    public abstract void j(int i, int i2);

    public abstract void k(int i, k kVar);

    public final void l(String str, b0.c cVar) throws c {
        a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(f.a);
        try {
            A(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new c(e3);
        }
    }

    public abstract void m(byte[] bArr, int i);

    public abstract void o(int i, int i2);

    public abstract void p(int i, String str);

    public abstract void q(long j2);

    public abstract void r(e eVar);

    public abstract void s(l lVar);

    public abstract void t(String str);

    public abstract void u(byte[] bArr, int i, int i2);

    public abstract void w(long j2);

    public abstract void x(int i);

    public abstract void y(long j2);

    public abstract void z(int i);
}
