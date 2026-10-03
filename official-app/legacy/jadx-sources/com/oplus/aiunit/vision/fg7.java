package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class fg7 {
    public static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] a;

    public fg7(byte[] bArr) {
        this.a = a(bArr);
    }

    public static byte[] a(byte[] bArr) {
        e6g e6gVar = new e6g(160);
        e6gVar.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[e6gVar.f()];
        e6gVar.a(bArr2, 0);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fg7) {
            return eh0.a(((fg7) obj).a, this.a);
        }
        return false;
    }

    public int hashCode() {
        return eh0.p(this.a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.a.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(b[(this.a[i] >>> 4) & 15]);
            stringBuffer.append(b[this.a[i] & 15]);
        }
        return stringBuffer.toString();
    }
}
