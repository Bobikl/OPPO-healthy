package com.oplus.aiunit.vision;

import com.oplus.drs.core.net.entity.UploadStateAware;
import java.util.Hashtable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class oh8 implements w8g {
    public static final byte[] h = {1};
    public static final Hashtable i;
    public ns5 a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f14941c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public no6 f14942e;
    public int f;
    public int g;

    static {
        Hashtable hashtable = new Hashtable();
        i = hashtable;
        hashtable.put(MessageDigestAlgorithms.SHA_1, kca.b(UploadStateAware.HTTP_DECRYPT_FAILED));
        hashtable.put(MessageDigestAlgorithms.SHA_224, kca.b(UploadStateAware.HTTP_DECRYPT_FAILED));
        hashtable.put(MessageDigestAlgorithms.SHA_256, kca.b(UploadStateAware.HTTP_DECRYPT_FAILED));
        hashtable.put(MessageDigestAlgorithms.SHA_512_256, kca.b(UploadStateAware.HTTP_DECRYPT_FAILED));
        hashtable.put(MessageDigestAlgorithms.SHA_512_224, kca.b(UploadStateAware.HTTP_DECRYPT_FAILED));
        hashtable.put(MessageDigestAlgorithms.SHA_384, kca.b(888));
        hashtable.put(MessageDigestAlgorithms.SHA_512, kca.b(888));
    }

    public oh8(ns5 ns5Var, int i2, no6 no6Var, byte[] bArr, byte[] bArr2) {
        if (i2 > irk.a(ns5Var)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (no6Var.b() < i2) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.a = ns5Var;
        this.f14942e = no6Var;
        this.f = i2;
        this.g = ((Integer) i.get(ns5Var.c())).intValue();
        byte[] bArrC = irk.c(this.a, eh0.k(e(), bArr2, bArr), this.g);
        this.b = bArrC;
        byte[] bArr3 = new byte[bArrC.length + 1];
        System.arraycopy(bArrC, 0, bArr3, 1, bArrC.length);
        this.f14941c = irk.c(this.a, bArr3, this.g);
        this.d = 1L;
    }

    @Override // com.oplus.aiunit.vision.w8g
    public int a(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.d > 140737488355328L) {
            return -1;
        }
        if (z) {
            b(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            byte[] bArr3 = this.b;
            byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
            bArr4[0] = 2;
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            System.arraycopy(bArr2, 0, bArr4, this.b.length + 1, bArr2.length);
            c(this.b, f(bArr4));
        }
        byte[] bArrG = g(this.b, length);
        byte[] bArr5 = this.b;
        byte[] bArr6 = new byte[bArr5.length + 1];
        System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
        bArr6[0] = 3;
        c(this.b, f(bArr6));
        c(this.b, this.f14941c);
        long j2 = this.d;
        c(this.b, new byte[]{(byte) (j2 >> 24), (byte) (j2 >> 16), (byte) (j2 >> 8), (byte) j2});
        this.d++;
        System.arraycopy(bArrG, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // com.oplus.aiunit.vision.w8g
    public void b(byte[] bArr) {
        byte[] bArrC = irk.c(this.a, eh0.l(h, this.b, e(), bArr), this.g);
        this.b = bArrC;
        byte[] bArr2 = new byte[bArrC.length + 1];
        bArr2[0] = 0;
        System.arraycopy(bArrC, 0, bArr2, 1, bArrC.length);
        this.f14941c = irk.c(this.a, bArr2, this.g);
        this.d = 1L;
    }

    public final void c(byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        for (int i3 = 1; i3 <= bArr2.length; i3++) {
            int i4 = (bArr[bArr.length - i3] & 255) + (bArr2[bArr2.length - i3] & 255) + i2;
            i2 = i4 > 255 ? 1 : 0;
            bArr[bArr.length - i3] = (byte) i4;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i5 = (bArr[bArr.length - length] & 255) + i2;
            i2 = i5 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i5;
        }
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        this.a.update(bArr, 0, bArr.length);
        this.a.a(bArr2, 0);
    }

    public final byte[] e() {
        byte[] bArrA = this.f14942e.a();
        if (bArrA.length >= (this.f + 7) / 8) {
            return bArrA;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[this.a.f()];
        d(bArr, bArr2);
        return bArr2;
    }

    public final byte[] g(byte[] bArr, int i2) {
        int i3 = i2 / 8;
        int iF = i3 / this.a.f();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i3];
        int iF2 = this.a.f();
        byte[] bArr4 = new byte[iF2];
        for (int i4 = 0; i4 <= iF; i4++) {
            d(bArr2, bArr4);
            int i5 = i4 * iF2;
            int i6 = i3 - i5;
            if (i6 > iF2) {
                i6 = iF2;
            }
            System.arraycopy(bArr4, 0, bArr3, i5, i6);
            c(bArr2, h);
        }
        return bArr3;
    }
}
