package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class pn0 {
    @NonNull
    public static gn0 a(Context context, String str) {
        String strB = f5e.b(context, str);
        if (!f(str) || !e(strB)) {
            return new gn0("", 1004, new byte[0], null);
        }
        try {
            Iterator<String> it = fpj.c(strB, d14.SEMICOLON_REGEX).iterator();
            while (it.hasNext()) {
                byte[][] bArrB = b(str, it.next(), context);
                if (bArrB[0][0] == 1) {
                    return new gn0(str, 1001, bArrB[1], strB);
                }
            }
            return new gn0(str, 1002, new byte[0], null);
        } catch (Exception e) {
            e3e.c("Check key get exception " + e.getMessage());
            return new gn0(str, 1002, new byte[0], null);
        }
    }

    public static byte[][] b(String str, String str2, Context context) {
        byte[][] bArr = {new byte[]{0}};
        try {
            if (g(str, str2, context)) {
                return new byte[][]{new byte[]{1}, d(str2), c(str2)};
            }
            e3e.d("Signature verify failed.");
            return bArr;
        } catch (Exception e) {
            e3e.c("Check key get exception " + e.getMessage());
            return bArr;
        }
    }

    public static byte[] c(String str) {
        byte[] bArrA = hz0.a(str);
        return bae.b(bArrA, fpj.b(bae.d(bArrA)));
    }

    public static byte[] d(String str) {
        byte[] bArrA = hz0.a(str);
        return bae.c(bArrA, fpj.b(bae.d(bArrA)));
    }

    public static boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        e3e.c("Get target application authCode is empty");
        return false;
    }

    public static boolean f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        e3e.c("Get target packageName is empty");
        return false;
    }

    public static boolean g(String str, String str2, Context context) {
        byte[] bArrA = hz0.a(str2);
        byte[] bArrE = bae.e(bArrA);
        byte[] bArr = {8};
        int iB = fpj.b(bae.d(bArrA));
        return m6h.e(context, str, bArrE, iB, bArr, bae.b(bArrA, iB), bae.c(bArrA, iB), bae.a(bArrA, iB));
    }
}
