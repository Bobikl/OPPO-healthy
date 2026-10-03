package com.heytap.omas.a.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final String a = "DeviceIdUtil";
    private static final String b = "android_guid";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7595c = "uuid_file";
    private static String d;

    public static String a(Context context) {
        if (TextUtils.isEmpty(d)) {
            String strB = b(context);
            d = strB;
            if (TextUtils.isEmpty(strB)) {
                i.c(a, "getRandomUuId: androidGuid is empty or null,generate a random uuid.");
                String strReplaceAll = UUID.randomUUID().toString().replaceAll("-", "");
                d = strReplaceAll;
                a(context, strReplaceAll);
            }
        }
        return d;
    }

    private static String b(Context context) {
        return context.getSharedPreferences(f7595c, 0).getString(b, null);
    }

    private static void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f7595c, 0).edit();
        editorEdit.putString(b, str);
        if (editorEdit.commit()) {
            return;
        }
        i.b(a, "saveUuId: commit return false.");
        editorEdit.putString(b, str);
        editorEdit.apply();
    }
}
