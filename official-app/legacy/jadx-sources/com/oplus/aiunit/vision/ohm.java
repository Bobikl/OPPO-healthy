package com.oplus.aiunit.vision;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes.dex */
public class ohm {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public static String a(PackageManager packageManager, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = packageManager.getPackageInfo(str, 64);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        try {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr.length > 0) {
                return b(signatureArr[0].toByteArray());
            }
        } catch (Exception e2) {
            Log.w("PackageUtil", "getNativeAppSignMd5 error", e2);
        }
        return null;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[bArrDigest.length * 2];
            for (int i = 0; i < bArrDigest.length; i++) {
                int i2 = bArrDigest[i] & 255;
                int i3 = i * 2;
                char[] cArr2 = a;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
            }
            return new String(cArr);
        } catch (Exception e2) {
            Log.w("PackageUtil", "getSha256 error", e2);
            return null;
        }
    }
}
