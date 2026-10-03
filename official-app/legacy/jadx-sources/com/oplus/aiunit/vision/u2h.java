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

/* JADX INFO: loaded from: classes8.dex */
public class u2h {
    public static PublicKey a(byte[] bArr, String str) {
        try {
            return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            e2.printStackTrace();
            j1e.c("convertPublicKey get exception - " + e2.getMessage());
            return null;
        }
    }

    public static List<i3f> b() {
        ArrayList arrayList = new ArrayList();
        i3f i3fVar = new i3f();
        i3fVar.c("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEvE0DoqARwzQKOb/b0cx7B0BQ4Ux8mTdND8rX9KHproZAuOP/M049VdcJ53sjVujUF1URD4IGMtkId2QYwXoDHw==");
        i3fVar.d("OK");
        arrayList.add(i3fVar);
        return arrayList;
    }

    public static byte[] c(Context context, String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArrB = a53.b(str, a53.e(context, str));
        byte[] bArr5 = new byte[bArrB.length + i + 2 + 4 + 4];
        hlj.a(bArr, 0, bArr5, 0, 1);
        hlj.a(bArr2, 0, bArr5, 1, 1);
        hlj.a(bArrB, 0, bArr5, 2, bArrB.length);
        hlj.a(bArr3, 0, bArr5, bArrB.length + 2, 4);
        hlj.a(bArr4, 0, bArr5, bArrB.length + 6, i);
        hlj.a(hlj.d(i), 0, bArr5, bArrB.length + i + 6, 4);
        return bArr5;
    }

    public static boolean d(String str, Signature signature, byte[] bArr, byte[] bArr2) throws SignatureException, InvalidKeyException {
        PublicKey publicKeyA = a(ty0.a(str), apj.Thread_Type_Executor_Cached);
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
            List<i3f> listB = b();
            boolean zD = false;
            for (int i2 = 0; i2 < listB.size(); i2++) {
                try {
                    if ("OK".equals(listB.get(i2).b()) && (zD = d(listB.get(i2).a(), signature, bArrC, bArr5))) {
                        return true;
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
                    e = e2;
                    z = zD;
                    e.printStackTrace();
                    j1e.c("Verify signing get an exception is " + e.getMessage());
                    return z;
                }
            }
            return zD;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e3) {
            e = e3;
        }
    }
}
