package com.oplus.aiunit.vision;

import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i48 implements nz6, gsb {
    public final byte[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12379c;

    public i48() {
        this.a = new byte[4];
        this.b = 0;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void b(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            l(bArr, 0);
            this.b = 0;
        }
        this.f12379c++;
    }

    @Override // com.oplus.aiunit.vision.nz6
    public int g() {
        return 64;
    }

    public void h(i48 i48Var) {
        byte[] bArr = i48Var.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = i48Var.b;
        this.f12379c = i48Var.f12379c;
    }

    public void i() {
        long j2 = this.f12379c << 3;
        b(ByteCompanionObject.MIN_VALUE);
        while (this.b != 0) {
            b((byte) 0);
        }
        k(j2);
        j();
    }

    public abstract void j();

    public abstract void k(long j2);

    public abstract void l(byte[] bArr, int i);

    @Override // com.oplus.aiunit.vision.ns5
    public void reset() {
        this.f12379c = 0L;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= iMax) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.a;
                int i5 = this.b;
                int i6 = i5 + 1;
                this.b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    l(bArr2, 0);
                    this.b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((iMax - i3) & (-4)) + i3;
        while (i3 < i8) {
            l(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < iMax) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.f12379c += (long) iMax;
    }

    public i48(i48 i48Var) {
        this.a = new byte[4];
        h(i48Var);
    }
}
