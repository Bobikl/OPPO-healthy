package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public class tzm {
    public static final String a = "pref_trade_token";
    public static final String b = ";";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17224c = "result={";
    public static final String d = "}";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17225e = "trade_token=\"";
    public static final String f = "\"";
    public static final String g = "trade_token=";

    public static String a(qam qamVar, Context context) {
        String strB = a1n.b(qamVar, context, a, "");
        qrm.f(ham.A, "get trade token: " + strB);
        return strB;
    }

    public static String b(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith(f17224c) && strArrSplit[i].endsWith("}")) {
                String str2 = strArrSplit[i];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split("&");
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    if (strArrSplit2[i2].startsWith(f17225e) && strArrSplit2[i2].endsWith("\"")) {
                        String str3 = strArrSplit2[i2];
                        strSubstring = str3.substring(13, str3.length() - 1);
                        break;
                    }
                    if (strArrSplit2[i2].startsWith(g)) {
                        strSubstring = strArrSplit2[i2].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    public static void c(qam qamVar, Context context, String str) {
        try {
            String strB = b(str);
            qrm.f(ham.A, "trade token: " + strB);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            a1n.c(qamVar, context, a, strB);
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, sgm.I, th);
            qrm.d(th);
        }
    }
}
