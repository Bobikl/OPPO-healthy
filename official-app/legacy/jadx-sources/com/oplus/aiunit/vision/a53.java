package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class a53 {
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

    public static byte[] b(String str, String str2) {
        return (str + l(str2)).getBytes(StandardCharsets.UTF_8);
    }

    public static CertificateFactory c() {
        try {
            return CertificateFactory.getInstance("X509");
        } catch (Exception e2) {
            j1e.c("get instance of CertificateFactory exception " + e2.getMessage());
            return null;
        }
    }

    public static X509Certificate d(CertificateFactory certificateFactory, InputStream inputStream) {
        if (certificateFactory == null) {
            return null;
        }
        try {
            return (X509Certificate) certificateFactory.generateCertificate(inputStream);
        } catch (Exception e2) {
            j1e.c("get X509Certificate from CertificateFactory exception " + e2.getMessage());
            return null;
        }
    }

    public static String e(Context context, String str) {
        return g(context, gc0.SHA1, str);
    }

    public static String f(Context context, String str) {
        return g(context, gc0.SHA256, str);
    }

    public static String g(Context context, String str, String str2) {
        SigningInfo signingInfoI = i(context, str2);
        if (signingInfoI == null) {
            return "";
        }
        Signature[] apkContentsSigners = signingInfoI.getApkContentsSigners();
        if (apkContentsSigners.length != 1 && signingInfoI.hasMultipleSigners()) {
            return k(apkContentsSigners, str);
        }
        return j(apkContentsSigners[0].toByteArray(), str);
    }

    public static String h(X509Certificate x509Certificate, String str) {
        try {
            return x509Certificate != null ? a(MessageDigest.getInstance(str).digest(x509Certificate.getEncoded())) : "";
        } catch (NoSuchAlgorithmException | CertificateEncodingException e2) {
            j1e.c("getHexStringCertificate from X509Certificate exception " + e2.getMessage());
            return "";
        }
    }

    @SuppressLint({"NewApi"})
    public static SigningInfo i(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 134217728);
        } catch (PackageManager.NameNotFoundException e2) {
            j1e.c("get packageInfo exception " + e2.getMessage());
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.signingInfo;
    }

    public static String j(byte[] bArr, String str) {
        return h(d(c(), new ByteArrayInputStream(bArr)), str);
    }

    public static String k(Signature[] signatureArr, String str) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < signatureArr.length; i++) {
            strArr[i] = j(signatureArr[i].toByteArray(), str);
        }
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != length - 1) {
                sb.append(strArr[i2]);
                sb.append(":");
            } else {
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }

    public static String l(String str) {
        return str.contains(":") ? str.replaceAll(":", "") : str;
    }
}
