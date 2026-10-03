package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class re8 implements w8g {
    public byte[] a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16173c;
    public no6 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public edb f16174e;
    public int f;

    public re8(edb edbVar, int i, no6 no6Var, byte[] bArr, byte[] bArr2) {
        if (i > irk.b(edbVar)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (no6Var.b() < i) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f = i;
        this.d = no6Var;
        this.f16174e = edbVar;
        byte[] bArrK = eh0.k(c(), bArr2, bArr);
        byte[] bArr3 = new byte[edbVar.d()];
        this.a = bArr3;
        byte[] bArr4 = new byte[bArr3.length];
        this.b = bArr4;
        eh0.n(bArr4, (byte) 1);
        d(bArrK);
        this.f16173c = 1L;
    }

    @Override // com.oplus.aiunit.vision.w8g
    public int a(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f16173c > 140737488355328L) {
            return -1;
        }
        if (z) {
            b(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            d(bArr2);
        }
        int length2 = bArr.length;
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length / this.b.length;
        this.f16174e.e(new eoa(this.a));
        for (int i = 0; i < length3; i++) {
            edb edbVar = this.f16174e;
            byte[] bArr4 = this.b;
            edbVar.update(bArr4, 0, bArr4.length);
            this.f16174e.a(this.b, 0);
            byte[] bArr5 = this.b;
            System.arraycopy(bArr5, 0, bArr3, bArr5.length * i, bArr5.length);
        }
        byte[] bArr6 = this.b;
        if (bArr6.length * length3 < length2) {
            this.f16174e.update(bArr6, 0, bArr6.length);
            this.f16174e.a(this.b, 0);
            byte[] bArr7 = this.b;
            System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
        }
        d(bArr2);
        this.f16173c++;
        System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // com.oplus.aiunit.vision.w8g
    public void b(byte[] bArr) {
        d(eh0.j(c(), bArr));
        this.f16173c = 1L;
    }

    public final byte[] c() {
        byte[] bArrA = this.d.a();
        if (bArrA.length >= (this.f + 7) / 8) {
            return bArrA;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final void d(byte[] bArr) {
        e(bArr, (byte) 0);
        if (bArr != null) {
            e(bArr, (byte) 1);
        }
    }

    public final void e(byte[] bArr, byte b) {
        this.f16174e.e(new eoa(this.a));
        edb edbVar = this.f16174e;
        byte[] bArr2 = this.b;
        edbVar.update(bArr2, 0, bArr2.length);
        this.f16174e.b(b);
        if (bArr != null) {
            this.f16174e.update(bArr, 0, bArr.length);
        }
        this.f16174e.a(this.a, 0);
        this.f16174e.e(new eoa(this.a));
        edb edbVar2 = this.f16174e;
        byte[] bArr3 = this.b;
        edbVar2.update(bArr3, 0, bArr3.length);
        this.f16174e.a(this.b, 0);
    }
}
