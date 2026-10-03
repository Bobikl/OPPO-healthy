package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.aiunit.vision.alm;
import com.oplus.aiunit.vision.hsm;
import com.oplus.aiunit.vision.vam;

/* JADX INFO: loaded from: classes12.dex */
public final class g {
    public static synchronized String a(Context context, String str) {
        String strA = hsm.a(context, "openapi_file_pri", "openApi" + str, "");
        if (vam.c(strA)) {
            return "";
        }
        String strE = alm.e(alm.a(), strA);
        return vam.c(strE) ? "" : strE;
    }

    public static synchronized void a() {
    }

    public static synchronized void a(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
        if (editorEdit != null) {
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("openApi" + str, alm.b(alm.a(), str2));
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
