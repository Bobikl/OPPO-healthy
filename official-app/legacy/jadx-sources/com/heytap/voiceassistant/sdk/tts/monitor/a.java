package com.heytap.voiceassistant.sdk.tts.monitor;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static boolean a = true;

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replaceAll("((imei|imsi|mac)=)[^,]+", "$1xxx");
        } catch (Throwable th) {
            Logger.error("LogMask", "", th);
            return null;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replaceAll("\"key\":\"\\w+\"", "\"key\":\"xxx\"").replaceAll("key=\\w+", "key=xxx");
        } catch (Exception e2) {
            Logger.error("LogMask", "", e2);
            return str;
        }
    }
}
