package com.oplus.aiunit.vision;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.StringUtils;
import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes19.dex */
public abstract class jhm implements BinaryDecoder, BinaryEncoder {
    public static final int b = 76;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12909c = 64;
    public final byte a = Base64.padSymbol;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12910e;
    public final int f;
    public final int g;
    public byte[] h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12911j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12912l;
    public int m;

    public jhm(int i, int i2, int i3, int i4) {
        this.d = i;
        this.f12910e = i2;
        this.f = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.g = i4;
    }

    public final void a() {
        byte[] bArr = this.h;
        if (bArr == null) {
            this.h = new byte[i()];
            this.i = 0;
            this.f12911j = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.h = bArr2;
        }
    }

    public void b(int i) {
        byte[] bArr = this.h;
        if (bArr == null || bArr.length < this.i + i) {
            a();
        }
    }

    public abstract void c(byte[] bArr, int i, int i2);

    public abstract void d(byte[] bArr, int i, int i2);

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return h((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract boolean e(byte b2);

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public int f() {
        if (this.h != null) {
            return this.i - this.f12911j;
        }
        return 0;
    }

    public int g(byte[] bArr, int i, int i2) {
        if (this.h == null) {
            return this.k ? -1 : 0;
        }
        int iMin = Math.min(f(), i2);
        System.arraycopy(this.h, this.f12911j, bArr, i, iMin);
        int i3 = this.f12911j + iMin;
        this.f12911j = i3;
        if (i3 >= this.i) {
            this.h = null;
        }
        return iMin;
    }

    public byte[] h(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    public int i() {
        return 8192;
    }

    public final void j() {
        this.h = null;
        this.i = 0;
        this.f12911j = 0;
        this.f12912l = 0;
        this.m = 0;
        this.k = false;
    }

    public boolean k(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b2 : bArr) {
            if (61 == b2 || e(b2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        j();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        d(bArr, 0, bArr.length);
        d(bArr, 0, -1);
        int i = this.i;
        byte[] bArr2 = new byte[i];
        g(bArr2, 0, i);
        return bArr2;
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        j();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        c(bArr, 0, bArr.length);
        c(bArr, 0, -1);
        int i = this.i - this.f12911j;
        byte[] bArr2 = new byte[i];
        g(bArr2, 0, i);
        return bArr2;
    }
}
