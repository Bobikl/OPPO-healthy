package com.oplus.aiunit.vision;

import com.oplus.wearable.crypto.AESCipher;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class o implements bp9 {
    public final AESCipher a = new AESCipher();

    @Override // com.oplus.aiunit.vision.bp9
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.a.a(bArr, bArr2, bArr3);
    }

    @Override // com.oplus.aiunit.vision.bp9
    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.a.b(bArr, bArr2, bArr3);
    }

    @Override // com.oplus.aiunit.vision.bp9
    public byte[] c(long j, long j2) {
        return this.a.c(j, j2);
    }
}
