package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class xe {
    public static volatile SharedPreferences a;

    public static SharedPreferences a(Context context) {
        if (a == null) {
            synchronized (xe.class) {
                if (a == null && context != null) {
                    a = context.getApplicationContext().getSharedPreferences("ac_open_h5_url_sp", 0);
                }
            }
        }
        return a;
    }

    public static String b(Context context, String str) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String string = sharedPreferencesA.getString("url_" + str, null);
        StringBuilder sb = new StringBuilder();
        sb.append("getUrl: key=");
        sb.append(str);
        sb.append(", hasValue=");
        sb.append(!TextUtils.isEmpty(string));
        AcLogUtil.d("AcOpenH5UrlSpHelper", sb.toString());
        return string;
    }

    public static String c(Context context) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getString("key_h5_url_version", "-1") : "-1";
    }

    public static void d(Context context, String str, Map<String, String> map) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA == null) {
            AcLogUtil.e("AcOpenH5UrlSpHelper", "saveUrlConfig: sp is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        if (!TextUtils.isEmpty(str)) {
            editorEdit.putString("key_h5_url_version", str);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    editorEdit.putString("url_" + entry.getKey(), entry.getValue());
                }
            }
        }
        editorEdit.apply();
        StringBuilder sb = new StringBuilder();
        sb.append("saveUrlConfig: version=");
        sb.append(str);
        sb.append(", urlMap size=");
        sb.append(map != null ? map.size() : 0);
        AcLogUtil.i("AcOpenH5UrlSpHelper", sb.toString());
    }
}
