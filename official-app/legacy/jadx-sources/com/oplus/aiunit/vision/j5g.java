package com.oplus.aiunit.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class j5g {
    public static final int ERR_NOT_CONNECT = 1;
    public static final int ERR_NO_READER = 2;
    public static final int ERR_OK = 0;
    public final int a;
    public final byte[] b;

    public j5g(byte[] bArr) {
        this.a = 0;
        this.b = bArr;
    }

    public int a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public boolean c() {
        return this.a == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j5g.class != obj.getClass()) {
            return false;
        }
        j5g j5gVar = (j5g) obj;
        if (this.a != j5gVar.a) {
            return false;
        }
        return Arrays.equals(this.b, j5gVar.b);
    }

    public int hashCode() {
        return (this.a * 31) + Arrays.hashCode(this.b);
    }

    public String toString() {
        return "SECryptoResult{code=" + this.a + '}';
    }

    public j5g(int i) {
        this.a = i;
        this.b = new byte[0];
    }
}
