package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class xm0 {
    @NonNull
    public static om0 a(Context context, String str) {
        String strB = i3e.b(context, str);
        if (!f(str) || !e(strB)) {
            return new om0("", 1004, new byte[0], null);
        }
        try {
            Iterator<String> it = hlj.c(strB, ";").iterator();
            while (it.hasNext()) {
                byte[][] bArrB = b(str, it.next(), context);
                if (bArrB[0][0] == 1) {
                    return new om0(str, 1001, bArrB[1], strB);
                }
            }
            return new om0(str, 1002, new byte[0], null);
        } catch (Exception e2) {
            j1e.c("Check key get exception " + e2.getMessage());
            return new om0(str, 1002, new byte[0], null);
        }
    }

    public static byte[][] b(String str, String str2, Context context) {
        byte[][] bArr = {new byte[]{0}};
        try {
            if (g(str, str2, context)) {
                return new byte[][]{new byte[]{1}, d(str2), c(str2)};
            }
            j1e.d("Signature verify failed.");
            return bArr;
        } catch (Exception e2) {
            j1e.c("Check key get exception " + e2.getMessage());
            return bArr;
        }
    }

    public static byte[] c(String str) {
        byte[] bArrA = ty0.a(str);
        return c8e.b(bArrA, hlj.b(c8e.d(bArrA)));
    }

    public static byte[] d(String str) {
        byte[] bArrA = ty0.a(str);
        return c8e.c(bArrA, hlj.b(c8e.d(bArrA)));
    }

    public static boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        j1e.c("Get target application authCode is empty");
        return false;
    }

    public static boolean f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        j1e.c("Get target packageName is empty");
        return false;
    }

    public static boolean g(String str, String str2, Context context) {
        byte[] bArrA = ty0.a(str2);
        byte[] bArrE = c8e.e(bArrA);
        byte[] bArr = {8};
        int iB = hlj.b(c8e.d(bArrA));
        return u2h.e(context, str, bArrE, iB, bArr, c8e.b(bArrA, iB), c8e.c(bArrA, iB), c8e.a(bArrA, iB));
    }
}
