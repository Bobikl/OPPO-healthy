package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
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
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class xf {
    public static final String a = "xf";

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(((char) b) & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString.toUpperCase());
        }
        return sb.toString();
    }

    public static void b(List<String> list, CertificateFactory certificateFactory, Signature signature) throws IOException, CertificateException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
            try {
                String strH = h(a(((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getEncoded()));
                if (!list.contains(strH)) {
                    list.add(strH);
                }
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            AcLogUtil.e(a, "generateCertificate Exception ");
        }
    }

    public static MessageDigest c(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            AcLogUtil.e(a, "error =" + e2.getMessage());
            return null;
        }
    }

    public static String d(byte[] bArr) {
        return String.format("%032x", new BigInteger(1, bArr));
    }

    public static Signature[] e(Context context, String str) {
        if (str != null && context != null && str.length() != 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo == null) {
                    return null;
                }
                return packageInfo.signatures;
            } catch (Exception e2) {
                AcLogUtil.e(a, "getRawSignature: " + e2.getMessage());
            }
        }
        return null;
    }

    public static String f(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        Signature[] signatureArrE = e(context, str);
        if (signatureArrE == null) {
            AcLogUtil.e(a, "signatures is null ");
            return "";
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            for (Signature signature : signatureArrE) {
                b(arrayList, certificateFactory, signature);
            }
            if (arrayList.isEmpty()) {
                return "";
            }
            Collections.sort(arrayList);
            String strG = g((String[]) arrayList.toArray(new String[0]), ",");
            if (TextUtils.isEmpty(strG)) {
                return "";
            }
            return strG.length() > 32 ? strG.substring(0, 32) : strG;
        } catch (IOException unused) {
            AcLogUtil.e(a, "CertificateException IOException ");
            return "";
        } catch (CertificateException unused2) {
            AcLogUtil.e(a, "getSignFormPackage CertificateException ");
            return "";
        }
    }

    public static String g(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append(str);
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static String h(String str) {
        MessageDigest messageDigestC = c("MD5");
        if (messageDigestC == null) {
            return "";
        }
        messageDigestC.update(str.getBytes());
        return d(messageDigestC.digest());
    }
}
