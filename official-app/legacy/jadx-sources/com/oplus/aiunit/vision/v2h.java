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

/* JADX INFO: loaded from: classes19.dex */
public class v2h {
    public static final String a = Signature.class.getSimpleName();

    public static PublicKey a(byte[] bArr, String str) {
        try {
            return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            e2.printStackTrace();
            i1e.c("convertPublicKey get exception - " + e2.getMessage());
            return null;
        }
    }

    public static List<j3f> b() {
        ArrayList arrayList = new ArrayList();
        j3f j3fVar = new j3f();
        j3fVar.c("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEvE0DoqARwzQKOb/b0cx7B0BQ4Ux8mTdND8rX9KHproZAuOP/M049VdcJ53sjVujUF1URD4IGMtkId2QYwXoDHw==");
        j3fVar.d("OK");
        arrayList.add(j3fVar);
        return arrayList;
    }

    public static boolean c(Context context, String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        PublicKey publicKeyA;
        byte[] bArrB = b53.b(str, b53.d(context, str));
        byte[] bArr6 = new byte[bArrB.length + i + 10];
        boolean z = false;
        glj.a(bArr, 0, bArr6, 0, 1);
        glj.a(bArr2, 0, bArr6, 1, 1);
        glj.a(bArrB, 0, bArr6, 2, bArrB.length);
        glj.a(bArr3, 0, bArr6, bArrB.length + 2, 4);
        glj.a(bArr4, 0, bArr6, bArrB.length + 6, i);
        glj.a(glj.d(i), 0, bArr6, bArrB.length + i + 6, 4);
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            List<j3f> listB = b();
            boolean zVerify = false;
            for (int i2 = 0; i2 < listB.size(); i2++) {
                try {
                    if ("OK".equals(listB.get(i2).b()) && (publicKeyA = a(uy0.a(listB.get(i2).a()), apj.Thread_Type_Executor_Cached)) != null) {
                        signature.initVerify(publicKeyA);
                        signature.update(bArr6);
                        zVerify = signature.verify(bArr5);
                        if (zVerify) {
                            return zVerify;
                        }
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
                    e = e2;
                    z = zVerify;
                    e.printStackTrace();
                    i1e.c("Verify signing get an exception is " + e.getMessage());
                    return z;
                }
            }
            return zVerify;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e3) {
            e = e3;
        }
    }
}
