package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ege {
    public int[] a;

    public ege(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iE = j0b.e(bArr, 0);
        int iA = eca.a(iE - 1);
        if (bArr.length != (iE * iA) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.a = new int[iE];
        for (int i = 0; i < iE; i++) {
            this.a[i] = j0b.f(bArr, (i * iA) + 4, iA);
        }
        if (!b(this.a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public byte[] a() {
        int length = this.a.length;
        int iA = eca.a(length - 1);
        byte[] bArr = new byte[(length * iA) + 4];
        j0b.a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            j0b.b(this.a[i], bArr, (i * iA) + 4, iA);
        }
        return bArr;
    }

    public final boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ege) {
            return cca.b(this.a, ((ege) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = "[" + this.a[0];
        for (int i = 1; i < this.a.length; i++) {
            str = str + ", " + this.a[i];
        }
        return str + "]";
    }
}
