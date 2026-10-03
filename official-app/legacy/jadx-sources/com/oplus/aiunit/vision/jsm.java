package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.unionpay.utils.UPUtils;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class jsm {
    public static String a() {
        String str = Build.VERSION.RELEASE;
        return !TextUtils.isEmpty(str) ? str.trim() : "";
    }

    public static String b(Context context) {
        try {
            String packageName = context instanceof Activity ? ((Activity) context).getPackageName() : "";
            return packageName == null ? "" : packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context, String str, String str2) {
        PackageInfo packageInfo;
        CertificateFactory certificateFactory;
        String strD;
        String str3 = "";
        try {
            X509Certificate x509Certificate = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                packageInfo = null;
            }
            if (packageInfo == null) {
                return "";
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
            try {
                certificateFactory = CertificateFactory.getInstance("X509");
            } catch (CertificateException e3) {
                e3.printStackTrace();
                certificateFactory = null;
            }
            if (certificateFactory != null) {
                try {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                    if (certificateGenerateCertificate instanceof X509Certificate) {
                        x509Certificate = (X509Certificate) certificateGenerateCertificate;
                    }
                } catch (CertificateException e4) {
                    e4.printStackTrace();
                }
            }
            try {
                strD = x509Certificate != null ? d(MessageDigest.getInstance(str2).digest(x509Certificate.getEncoded())) : "";
            } catch (NoSuchAlgorithmException | CertificateEncodingException e5) {
                e5.printStackTrace();
            }
            if (strD == null) {
                return strD;
            }
            try {
                return strD.replaceAll(":", "");
            } catch (Exception e6) {
                str3 = strD;
                e = e6;
            }
        } catch (Exception e7) {
            e = e7;
        }
        e.printStackTrace();
        return str3;
    }

    public static String d(byte[] bArr) {
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

    public static String e() {
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (!TextUtils.isEmpty(strTrim)) {
                return strTrim.replace(" ", "");
            }
        }
        return "";
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String strC = UPUtils.c(context, "merchant_id");
            if (TextUtils.isEmpty(strC)) {
                strC = UUID.randomUUID().toString();
                if (!TextUtils.isEmpty(strC)) {
                    strC = strC.replaceAll("-", "");
                    UPUtils.g(context, strC, "merchant_id");
                }
            }
            return strC;
        } catch (Exception unused) {
            return "";
        }
    }
}
