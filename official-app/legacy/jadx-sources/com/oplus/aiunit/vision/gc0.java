package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class gc0 {
    public static final String MD5 = "MD5";
    public static final String SHA1 = "SHA1";
    public static final String SHA256 = "SHA256";

    public static String a(Context context, String str) {
        ArrayList<String> arrayListB = b(context, str, SHA1);
        return (arrayListB == null || arrayListB.isEmpty()) ? "" : arrayListB.get(0);
    }

    public static ArrayList<String> b(Context context, String str, String str2) {
        String strC;
        if (context == null || str2 == null || str == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Signature[] signatureArrD = d(context, str);
        if (signatureArrD != null) {
            for (Signature signature : signatureArrD) {
                switch (str2) {
                    case "SHA256":
                        strC = c(signature, SHA256);
                        break;
                    case "MD5":
                        strC = c(signature, "MD5");
                        break;
                    case "SHA1":
                        strC = c(signature, SHA1);
                        break;
                    default:
                        strC = "error!";
                        break;
                }
                arrayList.add(strC);
            }
        }
        return arrayList;
    }

    public static String c(Signature signature, String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(str).digest(signature.toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (NoSuchAlgorithmException e2) {
            a7b.b("AppSigningUtils", e2.toString());
            return "error!";
        }
    }

    public static Signature[] d(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.b("AppSigningUtils", "getSignatures " + e2);
            return null;
        }
    }
}
