package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jum {
    public static final String b = Signature.class.getSimpleName();
    public static final List<rhm> a = new ArrayList();

    public static boolean a(String str, String str2, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        List<rhm> list;
        PublicKey publicKeyA;
        boolean z2;
        byte[] bArrE = mbm.e(str, str2);
        byte[] bArr6 = z ? new byte[bArrE.length + 10] : new byte[bArrE.length + 6];
        boolean z3 = false;
        fpm.a(bArr, 0, bArr6, 0, 1);
        fpm.a(bArr2, 0, bArr6, 1, 1);
        fpm.a(bArrE, 0, bArr6, 2, bArrE.length);
        fpm.a(bArr3, 0, bArr6, bArrE.length + 2, 4);
        if (z) {
            fpm.a(bArr4, 0, bArr6, bArrE.length + 6, 4);
        }
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            List<rhm> list2 = a;
            if (list2.size() > 0) {
                Iterator<rhm> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    rhm next = it.next();
                    if (TextUtils.isEmpty(next.b) || TextUtils.isEmpty(next.a)) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    list = a;
                } else {
                    a.clear();
                    rhm rhmVar = new rhm();
                    rhmVar.a = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEQ3t4qmdVu6Ko/bhfPaXAFrVzTcfT+OsIePcI71rU/Pm64jzFgSYFmF647c1d6n6/L1B07cqSRt0KcuYMB3haFw==";
                    rhmVar.b = "OK";
                    List<rhm> list3 = a;
                    list3.add(rhmVar);
                    list = list3;
                }
            } else {
                rhm rhmVar2 = new rhm();
                rhmVar2.a = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEQ3t4qmdVu6Ko/bhfPaXAFrVzTcfT+OsIePcI71rU/Pm64jzFgSYFmF647c1d6n6/L1B07cqSRt0KcuYMB3haFw==";
                rhmVar2.b = "OK";
                List<rhm> list4 = a;
                list4.add(rhmVar2);
                list = list4;
            }
            boolean zVerify = false;
            for (int i = 0; i < list.size(); i++) {
                try {
                    if ("OK".equals(list.get(i).b) && (publicKeyA = urm.a(Base64.getDecoder().decode(list.get(i).a), apj.Thread_Type_Executor_Cached)) != null) {
                        signature.initVerify(publicKeyA);
                        signature.update(bArr6);
                        zVerify = signature.verify(bArr5);
                        Log.d(b, String.format("current pub verify result %b", Boolean.valueOf(zVerify)));
                        if (zVerify) {
                            return zVerify;
                        }
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
                    e = e2;
                    z3 = zVerify;
                    e.printStackTrace();
                    Log.e(b, String.format("verify signing get an exception is %s", e.getMessage()));
                    return z3;
                }
            }
            return zVerify;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e3) {
            e = e3;
        }
    }

    public static boolean b(String str, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, String[] strArr) {
        boolean zA = false;
        for (String str2 : strArr) {
            zA = a(str, str2, z, bArr, bArr2, bArr3, bArr4, bArr5);
            if (zA) {
                break;
            }
        }
        return zA;
    }
}
