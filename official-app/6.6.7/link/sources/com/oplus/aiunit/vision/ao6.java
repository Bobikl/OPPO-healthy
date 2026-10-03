package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ao6 {
    public boolean a;
    public byte[] b;
    public byte[] c;
    public String d;

    public ao6(boolean z, byte[] bArr, String str) {
        this.a = z;
        this.b = bArr;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public byte[] b() {
        return this.c;
    }

    public byte[] c() {
        return this.b;
    }

    public boolean d() {
        return this.a;
    }

    public void e(byte[] bArr) {
        this.b = bArr;
    }

    public String toString() {
        return "EncryptConfig{mSupportEncrypt=" + this.a + ", encryptType='" + this.d + "'}";
    }

    public ao6(boolean z, byte[] bArr, byte[] bArr2, String str) {
        this.a = z;
        this.b = bArr;
        this.c = bArr2;
        this.d = str;
    }
}
