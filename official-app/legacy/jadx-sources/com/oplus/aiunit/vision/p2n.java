package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class p2n {
    public static HashMap<String, String> a = new HashMap<>();

    public static String a(Context context, v0n v0nVar, String str) {
        if (v0nVar == null || TextUtils.isEmpty(v0nVar.a())) {
            return null;
        }
        String str2 = a.get(v0nVar.a() + str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = str + v0nVar.a();
        return (context == null || TextUtils.isEmpty(str3)) ? "" : w0n.g(m0n.e(w0n.x(context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).getString(str3, ""))));
    }

    public static void b(Context context, v0n v0nVar, String str, String str2) {
        if (v0nVar == null || TextUtils.isEmpty(v0nVar.a())) {
            return;
        }
        String str3 = str + v0nVar.a();
        a.put(v0nVar.a() + str, str2);
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty("d7afbc6a38848a6801f6e449f3ec8e53") || TextUtils.isEmpty(str2)) {
            return;
        }
        String strD = w0n.D(m0n.c(w0n.n(str2)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).edit();
        editorEdit.putString(str3, strD);
        editorEdit.commit();
    }
}
