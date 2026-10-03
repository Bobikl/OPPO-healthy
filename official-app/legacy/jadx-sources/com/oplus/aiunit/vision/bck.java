package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class bck {
    public static boolean a(byte[] bArr) {
        return b(bArr, dbk.SH_T3100H1) || b(bArr, dbk.YP_MINI) || b(bArr, dbk.LJJ_A3) || b(bArr, dbk.XQ_Q2S);
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(byte[] bArr) {
        nc1 nc1VarC = nc1.c(bArr);
        if (nc1VarC == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (nc1.a aVar : nc1VarC.b) {
            if (aVar.b == 22 && b(aVar.f14437c, new byte[]{38, 24})) {
                z = true;
            }
            if (aVar.b == 255 && a(aVar.f14437c)) {
                z2 = true;
            }
        }
        a7b.f("TreadmillUtils", "isSupportFTMSProtocol=" + z + " isOAFModel=" + z2);
        return z && z2;
    }
}
