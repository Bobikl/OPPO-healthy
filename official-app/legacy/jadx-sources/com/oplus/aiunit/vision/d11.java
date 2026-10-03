package com.oplus.aiunit.vision;

import java.util.Arrays;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.EncoderException;
import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes16.dex */
public abstract class d11 implements BinaryEncoder, BinaryDecoder {

    @Deprecated
    public final byte a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10330c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10331e;

    public static class a {
        public int a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f10332c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10333e;
        public boolean f;
        public int g;
        public int h;

        public String toString() {
            return "[buffer=" + Arrays.toString(this.f10332c) + " currentLinePos=" + this.g + " eof=" + this.f + " ibitWorkArea=" + this.a + " lbitWorkArea=" + this.b + " modulus=" + this.h + " pos=" + this.d + " readPos=" + this.f10333e + "]";
        }
    }

    public d11(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, Base64.padSymbol);
    }

    public int a(a aVar) {
        if (aVar.f10332c != null) {
            return aVar.d - aVar.f10333e;
        }
        return 0;
    }

    public boolean b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.a == b || h(b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void c(byte[] bArr, int i, int i2, a aVar);

    public abstract void d(byte[] bArr, int i, int i2, a aVar);

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) {
        return null;
    }

    public byte[] e(int i, a aVar) {
        byte[] bArr = aVar.f10332c;
        return (bArr == null || bArr.length < aVar.d + i) ? j(aVar) : bArr;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        return null;
    }

    public int f() {
        return 8192;
    }

    public long g(byte[] bArr) {
        long length = bArr.length;
        long j2 = this.f10330c;
        long j3 = (((length + j2) - 1) / j2) * this.d;
        int i = this.b;
        return i > 0 ? j3 + ((((((long) i) + j3) - 1) / ((long) i)) * ((long) this.f10331e)) : j3;
    }

    public abstract boolean h(byte b);

    public int i(byte[] bArr, int i, int i2, a aVar) {
        if (aVar.f10332c == null) {
            return aVar.f ? -1 : 0;
        }
        int iMin = Math.min(a(aVar), i2);
        System.arraycopy(aVar.f10332c, aVar.f10333e, bArr, i, iMin);
        int i3 = aVar.f10333e + iMin;
        aVar.f10333e = i3;
        if (i3 >= aVar.d) {
            aVar.f10332c = null;
        }
        return iMin;
    }

    public final byte[] j(a aVar) {
        byte[] bArr = aVar.f10332c;
        if (bArr == null) {
            aVar.f10332c = new byte[f()];
            aVar.d = 0;
            aVar.f10333e = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f10332c = bArr2;
        }
        return aVar.f10332c;
    }

    public d11(int i, int i2, int i3, int i4, byte b) {
        this.f10330c = i;
        this.d = i2;
        this.b = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.f10331e = i4;
        this.a = b;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        c(bArr, 0, bArr.length, aVar);
        c(bArr, 0, -1, aVar);
        int i = aVar.d;
        byte[] bArr2 = new byte[i];
        i(bArr2, 0, i, aVar);
        return bArr2;
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        d(bArr, 0, bArr.length, aVar);
        d(bArr, 0, -1, aVar);
        int i = aVar.d - aVar.f10333e;
        byte[] bArr2 = new byte[i];
        i(bArr2, 0, i, aVar);
        return bArr2;
    }
}
