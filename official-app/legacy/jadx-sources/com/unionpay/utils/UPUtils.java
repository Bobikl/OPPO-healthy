package com.unionpay.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.aiunit.vision.f1n;
import com.oplus.aiunit.vision.scm;
import com.oplus.aiunit.vision.xpm;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes10.dex */
public class UPUtils {
    public static String a(int i) {
        try {
            return f(forUrl(i, true));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String b(int i, String str) {
        try {
            return f(forConfig(i, str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return null;
        }
        String strI = i(context.getSharedPreferences("UnionPayPluginEx.pref", 0).getString(str, ""), ("0000000023456789abcdef12123456786789abcd").substring(0, 32));
        return (strI != null && strI.endsWith("00000000")) ? strI.substring(0, strI.length() - 8) : "";
    }

    public static String d(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.reset();
            messageDigest.update(bytes);
            return scm.a(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String e(String str, String str2) {
        try {
            return scm.a(xpm.b(scm.b(str2), str.getBytes("utf-8")));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "utf-8");
        } catch (Throwable unused) {
            f1n.d("uppay", "convert byteMsg to utf-8 String error!!!!");
            return "";
        }
    }

    public static native synchronized byte[] forCallingAppUrl(int i, boolean z);

    public static native synchronized byte[] forConfig(int i, String str);

    public static native synchronized byte[] forUrl(int i, boolean z);

    public static native synchronized byte[] forWap(int i, String str);

    public static void g(Context context, String str, String str2) {
        if (context != null) {
            String strE = e(str + "00000000", ("0000000023456789abcdef12123456786789abcd").substring(0, 32));
            if (strE == null) {
                strE = "";
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            editorEdit.putString(str2, strE);
            editorEdit.commit();
        }
    }

    public static String h(int i, String str) {
        try {
            return f(forWap(i, str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String i(String str, String str2) {
        try {
            return new String(xpm.c(scm.b(str2), scm.b(str)), "utf-8").trim();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void j(Context context, String str) {
        if (context != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            editorEdit.remove(str);
            editorEdit.commit();
        }
    }

    public static String k(int i) {
        try {
            return f(forCallingAppUrl(i, true));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
