package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class hh1 {
    public static int FAIL = 2;
    public static int STATE_ERROR = 4;
    public static int SUCCESS = 1;
    public static int TIMEOUT = 3;
    public final int a;
    public final byte[] b;

    public hh1(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static hh1 d(int i, byte[] bArr) {
        return new hh1(i, bArr);
    }

    public int a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public boolean c() {
        return this.a == SUCCESS;
    }
}
