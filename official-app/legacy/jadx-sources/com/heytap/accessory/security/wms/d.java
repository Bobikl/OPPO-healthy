package com.heytap.accessory.security.wms;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public final SecretKey a;
    public final byte[] b;

    public d(SecretKey secretKey, byte[] bArr) {
        this.a = secretKey;
        this.b = bArr;
    }

    public SecretKey a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }
}
