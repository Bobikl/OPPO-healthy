package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class iba {
    @SuppressLint({"PrivateApi"})
    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class).invoke(null, str);
        } catch (Exception e2) {
            me8.b("InstallUtils", "Unable to read prop " + str + "," + e2);
            return null;
        }
    }

    public static boolean b(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                context.getApplicationContext().getPackageManager().getApplicationInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException e2) {
                me8.b("InstallUtils", "Do not install Health app. e: " + e2.getMessage());
            }
        }
        return false;
    }

    public static boolean c() {
        return Objects.equals(a("ro.oplus.nfc.tap_to_share_v2"), SpeechConstant.TRUE_STR);
    }
}
