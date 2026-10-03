package com.oplus.aiunit.vision;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class u6n {
    public static final Charset o = Charset.forName("UTF-8");
    public static final /* synthetic */ boolean p = true;
    public ByteBuffer a;
    public int b;
    public int h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f17331n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17327c = 1;
    public int[] d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17328e = 0;
    public boolean f = false;
    public boolean g = false;
    public int[] i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17329j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17330l = false;
    public CharsetEncoder m = o.newEncoder();

    public u6n(ByteBuffer byteBuffer) {
        c(byteBuffer);
    }

    public static ByteBuffer B(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferAllocate;
    }

    public static ByteBuffer o(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i = iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferB = B(i);
        byteBufferB.position(i - iCapacity);
        byteBufferB.put(byteBuffer);
        return byteBufferB;
    }

    public final int A() {
        return this.a.capacity() - this.b;
    }

    public final byte[] C(int i, int i2) {
        D();
        byte[] bArr = new byte[i2];
        this.a.position(i);
        this.a.get(bArr);
        return bArr;
    }

    public final void D() {
        if (!this.g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public final void E(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.a;
            int i3 = this.b - 1;
            this.b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public final void F() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void G(int i) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void H(int i) {
        x(4, 0);
        G(i);
    }

    public final void I(int i) {
        this.d[i] = A();
    }

    public final int a() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        G(this.k);
        return A();
    }

    public int b(CharSequence charSequence) {
        int length = (int) (charSequence.length() * this.m.maxBytesPerChar());
        ByteBuffer byteBuffer = this.f17331n;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            this.f17331n = ByteBuffer.allocate(Math.max(128, length));
        }
        this.f17331n.clear();
        CoderResult coderResultEncode = this.m.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), this.f17331n, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e2) {
                throw new Error(e2);
            }
        }
        this.f17331n.flip();
        return v(this.f17331n);
    }

    public final u6n c(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.clear();
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.f17327c = 1;
        this.b = this.a.capacity();
        this.f17328e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.f17329j = 0;
        this.k = 0;
        return this;
    }

    public final void d(byte b) {
        x(1, 0);
        p(b);
    }

    public final void e(int i) {
        x(4, 0);
        if (!p && i > A()) {
            throw new AssertionError();
        }
        G((A() - i) + 4);
    }

    public final void f(int i, byte b) {
        if (this.f17330l || b != 0) {
            d(b);
            I(i);
        }
    }

    public final void g(int i, int i2) {
        if (this.f17330l || i2 != 0) {
            H(i2);
            I(i);
        }
    }

    public final void h(int i, int i2, int i3) {
        F();
        this.k = i2;
        int i4 = i * i2;
        x(4, i4);
        x(i3, i4);
        this.f = true;
    }

    public final void i(int i, long j2) {
        if (this.f17330l || j2 != 0) {
            s(j2);
            I(i);
        }
    }

    public final void j(int i, short s) {
        if (this.f17330l || s != 0) {
            t(s);
            I(i);
        }
    }

    public final void k(long j2) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 8;
        this.b = i;
        byteBuffer.putLong(i, j2);
    }

    public final void l(short s) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void m(boolean z) {
        if (this.f17330l || z) {
            y(z);
            I(0);
        }
    }

    public final int n() {
        int i;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endObject called without startObject");
        }
        H(0);
        int iA = A();
        for (int i2 = this.f17328e - 1; i2 >= 0; i2--) {
            int i3 = this.d[i2];
            t((short) (i3 != 0 ? iA - i3 : 0));
        }
        t((short) (iA - this.h));
        t((short) ((this.f17328e + 2) * 2));
        int i4 = 0;
        loop1: while (true) {
            if (i4 >= this.f17329j) {
                i = 0;
                break;
            }
            int iCapacity = this.a.capacity() - this.i[i4];
            int i5 = this.b;
            short s = this.a.getShort(iCapacity);
            if (s == this.a.getShort(i5)) {
                int i6 = 2;
                while (true) {
                    if (i6 >= s) {
                        i = this.i[i4];
                        break loop1;
                    }
                    if (this.a.getShort(iCapacity + i6) != this.a.getShort(i5 + i6)) {
                        break;
                    }
                    i6 += 2;
                }
            }
            i4++;
        }
        if (i != 0) {
            int iCapacity2 = this.a.capacity() - iA;
            this.b = iCapacity2;
            this.a.putInt(iCapacity2, i - iA);
        } else {
            int i7 = this.f17329j;
            int[] iArr = this.i;
            if (i7 == iArr.length) {
                this.i = Arrays.copyOf(iArr, i7 * 2);
            }
            int[] iArr2 = this.i;
            int i8 = this.f17329j;
            this.f17329j = i8 + 1;
            iArr2[i8] = A();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - iA, A() - iA);
        }
        this.f = false;
        return iA;
    }

    public final void p(byte b) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, b);
    }

    public final void q(int i) {
        F();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.f17328e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.h = A();
    }

    public final void r(int i, int i2) {
        if (this.f17330l || i2 != 0) {
            e(i2);
            I(i);
        }
    }

    public final void s(long j2) {
        x(8, 0);
        k(j2);
    }

    public final void t(short s) {
        x(2, 0);
        l(s);
    }

    public final void u(boolean z) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public final int v(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        d((byte) 0);
        h(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i = this.b - iRemaining;
        this.b = i;
        byteBuffer2.position(i);
        this.a.put(byteBuffer);
        return a();
    }

    public final void w(int i) {
        x(this.f17327c, 4);
        e(i);
        this.a.position(this.b);
        this.g = true;
    }

    public final void x(int i, int i2) {
        if (i > this.f17327c) {
            this.f17327c = i;
        }
        int i3 = ((~((this.a.capacity() - this.b) + i2)) + 1) & (i - 1);
        while (this.b < i3 + i + i2) {
            int iCapacity = this.a.capacity();
            ByteBuffer byteBufferO = o(this.a);
            this.a = byteBufferO;
            this.b += byteBufferO.capacity() - iCapacity;
        }
        E(i3);
    }

    public final void y(boolean z) {
        x(1, 0);
        u(z);
    }

    public final byte[] z() {
        return C(this.b, this.a.capacity() - this.b);
    }
}
