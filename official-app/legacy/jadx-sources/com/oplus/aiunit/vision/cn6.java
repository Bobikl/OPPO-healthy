package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes5.dex */
public class cn6 {
    public boolean a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f10159c;
    public String d;

    public cn6(boolean z, byte[] bArr, String str) {
        this.a = z;
        this.b = bArr;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public byte[] b() {
        return this.f10159c;
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

    public cn6(boolean z, byte[] bArr, byte[] bArr2, String str) {
        this.a = z;
        this.b = bArr;
        this.f10159c = bArr2;
        this.d = str;
    }
}
