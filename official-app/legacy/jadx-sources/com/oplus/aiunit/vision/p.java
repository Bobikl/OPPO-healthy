package com.oplus.aiunit.vision;

import com.oplus.wearable.crypto.AESCipher;

/* JADX INFO: loaded from: classes15.dex */
public class p implements vn9 {
    public final AESCipher a = new AESCipher();

    @Override // com.oplus.aiunit.vision.vn9
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.a.e(bArr, bArr2, bArr3);
    }

    @Override // com.oplus.aiunit.vision.vn9
    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.a.d(bArr, bArr2, bArr3);
    }

    @Override // com.oplus.aiunit.vision.vn9
    public byte[] c(long j2, long j3) {
        return this.a.c(j2, j3);
    }
}
