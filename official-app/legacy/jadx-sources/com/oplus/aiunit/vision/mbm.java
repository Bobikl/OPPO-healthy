package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class mbm {
    public static final String a = "mbm";

    public static String a(byte b) {
        return Integer.toBinaryString((b & 255) + 256).substring(1);
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(hexString);
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
            return x509Certificate != null ? b(MessageDigest.getInstance(str).digest(x509Certificate.getEncoded())) : "";
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            return "";
        } catch (CertificateEncodingException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static boolean d(Context context, String[] strArr) {
        List listAsList = Arrays.asList(f(context, "android"));
        for (String str : strArr) {
            if (listAsList.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] e(String str, String str2) {
        if (str2.contains(":")) {
            str2 = str2.replaceAll(":", "");
        }
        return (str + str2).getBytes(StandardCharsets.UTF_8);
    }

    public static String[] f(Context context, String str) {
        SigningInfo signingInfoG = g(context, str);
        int i = 0;
        if (signingInfoG == null) {
            return new String[0];
        }
        if (!signingInfoG.hasMultipleSigners()) {
            Signature[] signingCertificateHistory = signingInfoG.getSigningCertificateHistory();
            String[] strArr = new String[signingCertificateHistory.length];
            while (i < signingCertificateHistory.length) {
                strArr[i] = c(signingCertificateHistory[i].toByteArray(), gc0.SHA1);
                i++;
            }
            return strArr;
        }
        Signature[] apkContentsSigners = signingInfoG.getApkContentsSigners();
        Log.i(a, "has multiple signers");
        int length = apkContentsSigners.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < apkContentsSigners.length; i2++) {
            strArr2[i2] = c(apkContentsSigners[i2].toByteArray(), gc0.SHA1);
        }
        Arrays.sort(strArr2);
        StringBuilder sb = new StringBuilder();
        while (i < length) {
            if (i != length - 1) {
                sb.append(strArr2[i]);
                sb.append(":");
            } else {
                sb.append(strArr2[i]);
            }
            i++;
        }
        return new String[]{sb.toString()};
    }

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
}
