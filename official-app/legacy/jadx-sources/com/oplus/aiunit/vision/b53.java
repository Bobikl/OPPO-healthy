package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class b53 {
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
        return (str + h(str2)).getBytes(StandardCharsets.UTF_8);
    }

    public static String c(byte[] bArr, String str) {
        CertificateFactory certificateFactory;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        X509Certificate x509Certificate = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (Exception e2) {
            e2.printStackTrace();
            certificateFactory = null;
        }
        if (certificateFactory != null) {
            try {
                x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            return x509Certificate != null ? a(MessageDigest.getInstance(str).digest(x509Certificate.getEncoded())) : "";
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            return "";
        } catch (CertificateEncodingException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String d(Context context, String str) {
        return f(context, gc0.SHA1, str);
    }

    public static String e(Context context, String str) {
        return f(context, gc0.SHA256, str);
    }

    public static String f(Context context, String str, String str2) {
        SigningInfo signingInfoG = g(context, str2);
        if (signingInfoG == null) {
            return "";
        }
        Signature[] apkContentsSigners = signingInfoG.getApkContentsSigners();
        if (apkContentsSigners.length != 1 && signingInfoG.hasMultipleSigners()) {
            i1e.d("has multiple signers");
            int length = apkContentsSigners.length;
            String[] strArr = new String[length];
            for (int i = 0; i < apkContentsSigners.length; i++) {
                strArr[i] = c(apkContentsSigners[i].toByteArray(), str);
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
        return c(apkContentsSigners[0].toByteArray(), str);
    }

    @SuppressLint({"NewApi"})
    public static SigningInfo g(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 134217728);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.signingInfo;
    }

    public static String h(String str) {
        return str.contains(":") ? str.replaceAll(":", "") : str;
    }
}
