package com.heytap.omas.a.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(((char) b) & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static String b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        Signature[] signatureArrA = a(context, str);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            for (Signature signature : signatureArrA) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                try {
                    String strB = b(a(((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getEncoded()));
                    if (!arrayList.contains(strB)) {
                        arrayList.add(strB);
                    }
                    byteArrayInputStream.close();
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    throw th;
                }
            }
            if (arrayList.isEmpty()) {
                return "";
            }
            Collections.sort(arrayList);
            String strA = a((String[]) arrayList.toArray(new String[0]), ",");
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            return strA.length() > 32 ? strA.substring(0, 32) : strA;
        } catch (IOException | CertificateException unused) {
            return "";
        }
    }

    private static String a(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append(str);
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    private static String b(String str) throws IOException {
        MessageDigest messageDigestA = a("MD5");
        messageDigestA.update(str.getBytes());
        return b(messageDigestA.digest());
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2.getMessage());
        }
    }

    private static String b(byte[] bArr) {
        return String.format("%032x", new BigInteger(1, bArr));
    }

    private static Signature[] a(Context context, String str) {
        if (str != null && context != null && str.length() != 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo == null) {
                    return null;
                }
                return packageInfo.signatures;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }
}
