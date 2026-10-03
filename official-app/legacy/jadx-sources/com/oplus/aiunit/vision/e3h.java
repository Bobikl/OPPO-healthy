package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class e3h {
    public static List<String> a = Collections.singletonList("B0:A9:BB:FC:05:EE:E5:E7:D0:A2:C9:7C:03:05:86:E1:5B:B3:30:11:52:07:8F:54:47:3B:B8:2D:F6:D8:C8:18");

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static X509Certificate b(Signature signature) {
        if (signature == null) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e2) {
            w7i.b("SignatureValidator", "Cannot decode certificate.", e2);
            return null;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static Signature[] c(Context context) {
        if (context == null) {
            return new Signature[0];
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo.getApkContentsSigners();
        } catch (PackageManager.NameNotFoundException unused) {
            w7i.i("SignatureValidator", "getAppSignature NameNotFoundException", new Object[0]);
            return new Signature[0];
        }
    }

    public static String d(String str, String str2) {
        try {
            X509Certificate[][] x509CertificateArrA = com.oplus.oms.split.full.signature.b.a(str);
            if (x509CertificateArrA == null || x509CertificateArrA.length == 0) {
                return null;
            }
            try {
                return a(MessageDigest.getInstance(str2).digest(x509CertificateArrA[0][0].getEncoded()));
            } catch (NoSuchAlgorithmException | CertificateEncodingException e2) {
                w7i.c("SignatureValidator", e2.getMessage(), new Object[0]);
                return "";
            }
        } catch (IOException e3) {
            w7i.b("SignatureValidator", "split " + str + " is not signed.", e3);
            return null;
        }
    }

    public static boolean e(Context context, File file) {
        Signature[] signatureArrC;
        if (context != null && !pd7.g(file) && (signatureArrC = c(context)) != null && signatureArrC.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArrC) {
                X509Certificate x509CertificateB = b(signature);
                if (x509CertificateB != null) {
                    arrayList.add(x509CertificateB);
                }
            }
            if (!arrayList.isEmpty() && f(file.getAbsolutePath(), arrayList)) {
                return true;
            }
            String strD = d(file.getAbsolutePath(), gc0.SHA256);
            if (TextUtils.isEmpty(strD)) {
                w7i.e("SignatureValidator", "get split apk sha256 error", new Object[0]);
                return false;
            }
            if (a.contains(strD)) {
                w7i.a("SignatureValidator", "the split apk use default oplus signature", new Object[0]);
                return true;
            }
        }
        return false;
    }

    public static boolean f(String str, List<X509Certificate> list) {
        boolean z;
        try {
            X509Certificate[][] x509CertificateArrA = com.oplus.oms.split.full.signature.b.a(str);
            if (x509CertificateArrA == null || x509CertificateArrA.length == 0 || x509CertificateArrA[0].length == 0) {
                w7i.c("SignatureValidator", "Downloaded split " + str + " is not signed.", new Object[0]);
            } else if (list.isEmpty()) {
                w7i.c("SignatureValidator", "No certificates found for app.", new Object[0]);
            } else {
                Iterator<X509Certificate> it = list.iterator();
                do {
                    z = true;
                    if (!it.hasNext()) {
                        return true;
                    }
                    X509Certificate next = it.next();
                    int length = x509CertificateArrA.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        if (x509CertificateArrA[i][0].equals(next)) {
                            break;
                        }
                        i++;
                    }
                } while (z);
                w7i.c("SignatureValidator", "There's an app certificate that doesn't sign the split.", new Object[0]);
            }
            return false;
        } catch (Exception e2) {
            w7i.b("SignatureValidator", "split " + str + " is not signed.", e2);
            return false;
        }
    }
}
