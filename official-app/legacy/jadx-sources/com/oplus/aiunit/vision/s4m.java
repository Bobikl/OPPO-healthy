package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class s4m extends gh1 {
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16470j = 0;
    public int k;

    @Override // com.oplus.aiunit.vision.gh1
    public void c(int i, byte[] bArr) {
        if (u()) {
            return;
        }
        super.c(i, bArr);
    }

    public byte[] t(int i) {
        if (this.k == 0) {
            this.k = i;
        }
        byte[] bArr = this.i;
        if (bArr.length <= i) {
            return bArr;
        }
        int i2 = this.f16470j;
        int length = i + i2;
        if (length > bArr.length) {
            length = bArr.length;
        }
        int i3 = length - i2;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f16470j = length;
        return bArr2;
    }

    public boolean u() {
        byte[] bArr = this.i;
        return (bArr == null || bArr.length > this.k) && this.k > 0 && bArr != null && this.f16470j < bArr.length;
    }
}
