package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public class tpe {
    public static final String CACHE_DUID = "cache_duid";
    public static final String CACHE_OUID = "cache_ouid";
    public static final String LAST_UPDATE_TIME = "lastUpdateTime";
    public static final byte[] a = {79, 112, 108, 117, 115, 68, 82, 83, 79, 112, 101, 110, 73, 68, 75, 101};
    public static volatile opa b;

    public static void a(Context context, String str) {
        g(context).putString(CACHE_DUID, d(str));
    }

    public static void b(Context context, String str) {
        g(context).putString(CACHE_OUID, d(str));
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("ENC:")) {
            return str;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(4), 2);
            byte[] bArr = new byte[bArrDecode.length];
            for (int i = 0; i < bArrDecode.length; i++) {
                byte b2 = bArrDecode[i];
                byte[] bArr2 = a;
                bArr[i] = (byte) (b2 ^ bArr2[i % bArr2.length]);
            }
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            byte[] bArr = new byte[bytes.length];
            for (int i = 0; i < bytes.length; i++) {
                byte b2 = bytes[i];
                byte[] bArr2 = a;
                bArr[i] = (byte) (b2 ^ bArr2[i % bArr2.length]);
            }
            return "ENC:" + Base64.encodeToString(bArr, 2);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String e(Context context) {
        opa opaVarG = g(context);
        String string = opaVarG.getString(CACHE_DUID, "");
        String strC = c(string);
        if (!TextUtils.isEmpty(string) && !string.startsWith("ENC:")) {
            opaVarG.putString(CACHE_DUID, d(strC));
        }
        return strC;
    }

    public static String f(Context context) {
        opa opaVarG = g(context);
        String string = opaVarG.getString(CACHE_OUID, "");
        String strC = c(string);
        if (!TextUtils.isEmpty(string) && !string.startsWith("ENC:")) {
            opaVarG.putString(CACHE_OUID, d(strC));
        }
        return strC;
    }

    public static opa g(Context context) {
        if (b == null) {
            synchronized (tpe.class) {
                if (b == null) {
                    b = opa.a(context, "drs_sdk_storage");
                }
            }
        }
        return b;
    }

    public static opa h(Context context, String str) {
        return opa.a(context, str);
    }
}
