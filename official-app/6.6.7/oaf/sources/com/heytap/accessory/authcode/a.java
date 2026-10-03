package com.heytap.accessory.authcode;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String a = "a";

    public static String a(Context context, String str) {
        return a(a(context, "MD5", str));
    }

    public static Signature[] b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            com.heytap.accessory.base.logging.a.b(a, "getPackageSignatures error," + e);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.signatures;
    }

    public static String a(Context context, String str, String str2) {
        Signature[] signatureArrB = b(context, str2);
        if (signatureArrB == null || signatureArrB.length == 0) {
            return "";
        }
        if (signatureArrB.length == 1) {
            return a(signatureArrB[0].toByteArray(), str);
        }
        com.heytap.accessory.base.logging.a.c(a, "has multiple signers");
        int length = signatureArrB.length;
        String[] strArr = new String[length];
        for (int i = 0; i < signatureArrB.length; i++) {
            strArr[i] = a(signatureArrB[i].toByteArray(), str);
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

    public static String a(byte[] bArr, String str) {
        CertificateFactory certificateFactory;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        X509Certificate x509Certificate = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(a, "CertificateFactory getInstance error," + e);
            certificateFactory = null;
        }
        if (certificateFactory != null) {
            try {
                x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.b(a, "generateCertificate error," + e2);
            }
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (x509Certificate != null) {
                return a(messageDigest.digest(x509Certificate.getEncoded()));
            }
        } catch (NoSuchAlgorithmException | CertificateEncodingException e3) {
            com.heytap.accessory.base.logging.a.b(a, "getCertAlgorithm error," + e3);
        }
        return "";
    }

    public static String a(String str) {
        return str.contains(":") ? str.replaceAll(":", "") : str;
    }

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
}
