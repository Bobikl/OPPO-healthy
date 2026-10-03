package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class ce extends ca {
    private final int f;
    private transient byte[] g;
    private transient byte[] h;
    private transient String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient String f8864j;
    private transient String k;

    public ce(int i, int i2, byte[] bArr) {
        super(i, i2, bArr, ca.a.UID);
        this.f = a(bArr);
    }

    private int a(byte[] bArr) {
        if (4 <= bArr.length) {
            return bArr[3];
        }
        return 0;
    }

    public byte[] d() {
        if (this.h == null) {
            this.h = cv.a(a(), 14, 20);
        }
        return this.h;
    }

    public String e() {
        if (this.f8864j == null) {
            this.f8864j = cv.a(d(), true);
        }
        return this.f8864j;
    }

    public byte[] f() {
        if (this.g == null) {
            this.g = cv.a(a(), 4, 14);
        }
        return this.g;
    }

    public String g() {
        if (this.i == null) {
            this.i = cv.a(f(), true);
        }
        return this.i;
    }

    @Override // com.omron.cq, com.omron.by
    public String toString() {
        String str = this.k;
        if (str != null) {
            return str;
        }
        String str2 = String.format("EddyStoneUID(TxPower=%d,NamespaceId=%s,InstanceId=%s)", Integer.valueOf(this.f), g(), e());
        this.k = str2;
        return str2;
    }
}
