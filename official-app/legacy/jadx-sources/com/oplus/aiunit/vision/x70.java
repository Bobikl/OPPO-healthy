package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.core.app.NotificationCompat;
import androidx.core.content.pm.PackageInfoCompat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes18.dex */
public class x70 {
    public static String a(MessageDigest messageDigest) {
        StringBuilder sb = new StringBuilder();
        for (byte b : messageDigest.digest()) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return a(messageDigest);
        } catch (NoSuchAlgorithmException e2) {
            t6b.d("ApkInfoHelper", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    public static String c(Context context) {
        String str = "0";
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            n7a.INSTANCE.a(21, 6, v0j.a(str, 3, 0));
            return str;
        } catch (Exception e2) {
            t6b.d(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return str;
        }
    }

    public static String d(String str, Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length <= 0) {
                return "";
            }
            for (Signature signature : signatureArr) {
                if (signature != null) {
                    return b(signature.toByteArray());
                }
            }
        } catch (Exception e2) {
            t6b.d("ApkInfoHelper", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
        return "";
    }

    public static int e(Context context) {
        int longVersionCode = 0;
        try {
            longVersionCode = (int) PackageInfoCompat.getLongVersionCode(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
            n7a.INSTANCE.a(22, 6, v0j.a(String.valueOf(longVersionCode), 2, 1));
            return longVersionCode;
        } catch (Exception e2) {
            t6b.d(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return longVersionCode;
        }
    }

    public static int f(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return (int) PackageInfoCompat.getLongVersionCode(packageInfo);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }
}
