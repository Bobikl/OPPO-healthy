package com.oplus.aiunit.vision;

import android.content.Context;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class m6h {
    public static PublicKey a(byte[] bArr, String str) {
        try {
            return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            e3e.c("convertPublicKey get exception - " + e.getMessage());
            return null;
        }
    }

    public static List<u5f> b() {
        ArrayList arrayList = new ArrayList();
        u5f u5fVar = new u5f();
        u5fVar.c(d14.OPLUS_PUBLIC_CODE);
        u5fVar.d(d14.PUBLIC_KEY_STATUS_OK);
        arrayList.add(u5fVar);
        return arrayList;
    }

    public static byte[] c(Context context, String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArrB = o53.b(str, o53.e(context, str));
        byte[] bArr5 = new byte[bArrB.length + i + 2 + 4 + 4];
        fpj.a(bArr, 0, bArr5, 0, 1);
        fpj.a(bArr2, 0, bArr5, 1, 1);
        fpj.a(bArrB, 0, bArr5, 2, bArrB.length);
        fpj.a(bArr3, 0, bArr5, bArrB.length + 2, 4);
        fpj.a(bArr4, 0, bArr5, bArrB.length + 6, i);
        fpj.a(fpj.d(i), 0, bArr5, bArrB.length + i + 6, 4);
        return bArr5;
    }

    public static boolean d(String str, Signature signature, byte[] bArr, byte[] bArr2) throws SignatureException, InvalidKeyException {
        PublicKey publicKeyA = a(hz0.a(str), "EC");
        if (publicKeyA == null) {
            return false;
        }
        signature.initVerify(publicKeyA);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    public static boolean e(Context context, String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArrC = c(context, str, bArr, i, bArr2, bArr3, bArr4);
        boolean z = false;
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            List<u5f> listB = b();
            boolean zD = false;
            for (int i2 = 0; i2 < listB.size(); i2++) {
                try {
                    if (d14.PUBLIC_KEY_STATUS_OK.equals(listB.get(i2).b()) && (zD = d(listB.get(i2).a(), signature, bArrC, bArr5))) {
                        return true;
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
                    e = e;
                    z = zD;
                    e.printStackTrace();
                    e3e.c("Verify signing get an exception is " + e.getMessage());
                    return z;
                }
            }
            return zD;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
            e = e2;
        }
    }
}
