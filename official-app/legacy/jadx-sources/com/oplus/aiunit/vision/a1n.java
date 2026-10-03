package com.oplus.aiunit.vision;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public class a1n {
    public static String a;

    public static String a(Context context) {
        String packageName;
        if (TextUtils.isEmpty(a)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                qrm.d(th);
                packageName = "";
            }
            a = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return a;
    }

    public static synchronized String b(qam qamVar, Context context, String str, String str2) {
        String strA;
        strA = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            strA = TextUtils.isEmpty(string) ? null : ssm.a(a(context), string, str);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(strA)) {
                l9m.h(qamVar, "cp", sgm.F, String.format("%s,%s", str, string));
            }
        } catch (Exception e2) {
            qrm.d(e2);
        }
        return strA;
    }

    public static synchronized void c(qam qamVar, Context context, String str, String str2) {
        try {
            String strC = ssm.c(a(context), str2, str);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strC)) {
                l9m.h(qamVar, "cp", sgm.G, String.format("%s,%s", str, str2));
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strC).apply();
        } catch (Throwable th) {
            qrm.d(th);
        }
    }
}
