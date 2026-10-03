package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class to6 {
    public int a = 1;
    public Context b;

    public to6(Context context) {
        this.b = context;
    }

    public static String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr2[i3] = cArr[i2 >>> 4];
            cArr2[i3 + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public static String c(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(gc0.SHA1);
        messageDigest.update(bArr);
        return a(messageDigest.digest());
    }

    public static to6 d(Context context) {
        return new to6(context);
    }

    public final void b() {
        a7b.m("EnvChecker", "doOnCheckFailed...");
        gxe.o("doOnCheckFailed");
    }

    public String e(String str) {
        int i = this.a;
        this.a = i - 1;
        if (i <= 0) {
            throw new RuntimeException("You can only use EnvChecker once, do not cache or reuse EnvChecker.");
        }
        f(this.b);
        return g7m.e(str, new boa().b());
    }

    public final void f(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.signingInfo == null) {
            a7b.m("EnvChecker", "p p.s null");
            b();
            return;
        }
        String strE = g7m.e(y80.APP_SIGNATURE, new boa().b());
        String strE2 = g7m.e(y80.APP_SIGNATURE_R, new boa().b());
        String strE3 = g7m.e(y80.APP_SIGNATURE_R_N, new boa().b());
        if (strE == null || strE2 == null || strE3 == null) {
            a7b.m("EnvChecker", "sig null");
            b();
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        boolean z = false;
        for (Signature signature : packageInfo.signingInfo.getSigningCertificateHistory()) {
            try {
                arrayList.add(c(signature.toByteArray()));
            } catch (NoSuchAlgorithmException unused2) {
                a7b.m("EnvChecker", "nsae");
                b();
                return;
            }
        }
        boolean z2 = Build.VERSION.SDK_INT >= 33;
        if (arrayList.size() != 2 && z2) {
            a7b.m("EnvChecker", "sig count");
            b();
            return;
        }
        if (z2) {
            boolean z3 = false;
            for (String str : arrayList) {
                if (strE3.equals(str)) {
                    z = true;
                }
                if (strE.equals(str) || strE2.equals(str)) {
                    z3 = true;
                }
            }
            if (z && z3) {
                return;
            }
        } else if (strE.equals(arrayList.get(0)) || strE2.equals(arrayList.get(0))) {
            return;
        }
        b();
    }
}
