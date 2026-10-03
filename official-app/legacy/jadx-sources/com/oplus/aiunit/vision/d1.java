package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class d1 extends r1 {
    public final byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f10329j = {-1};
    public static final byte[] k = {0};
    public static final d1 FALSE = new d1(false);
    public static final d1 TRUE = new d1(true);

    public d1(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b = bArr[0];
        if (b == 0) {
            this.i = k;
        } else if ((b & 255) == 255) {
            this.i = f10329j;
        } else {
            this.i = eh0.e(bArr);
        }
    }

    public static d1 m(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        if (b == 0) {
            return FALSE;
        }
        return (b & 255) == 255 ? TRUE : new d1(bArr);
    }

    public static d1 n(Object obj) {
        if (obj == null || (obj instanceof d1)) {
            return (d1) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (d1) r1.i((byte[]) obj);
        } catch (IOException e2) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e2.getMessage());
        }
    }

    public static d1 o(boolean z) {
        return z ? TRUE : FALSE;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        return (r1Var instanceof d1) && this.i[0] == ((d1) r1Var).i[0];
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.g(1, this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        return 3;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        return this.i[0];
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }

    public boolean p() {
        return this.i[0] != 0;
    }

    public String toString() {
        return this.i[0] != 0 ? "TRUE" : "FALSE";
    }

    public d1(boolean z) {
        this.i = z ? f10329j : k;
    }
}
