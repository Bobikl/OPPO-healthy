package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class po6 {
    public static byte[] a(no6 no6Var, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= no6Var.b()) {
            System.arraycopy(no6Var.a(), 0, bArr, 0, i);
        } else {
            int iB = no6Var.b() / 8;
            for (int i2 = 0; i2 < i; i2 += iB) {
                byte[] bArrA = no6Var.a();
                int i3 = i - i2;
                if (bArrA.length <= i3) {
                    System.arraycopy(bArrA, 0, bArr, i2, bArrA.length);
                } else {
                    System.arraycopy(bArrA, 0, bArr, i2, i3);
                }
            }
        }
        return bArr;
    }
}
