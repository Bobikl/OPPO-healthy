package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class wi5 {
    public static String a(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "oplus_system_folding_mode");
        } catch (Exception e2) {
            m7b.f("DeviceInfoUtil", "getFoldMode failed!", e2);
            string = null;
        }
        return string == null ? "" : string;
    }

    public static String b() {
        return Locale.getDefault().getLanguage();
    }

    public static String c() {
        String str = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
        return "id-ID".equalsIgnoreCase(str) ? "in-ID" : str;
    }

    public static String d() {
        String strA = alj.a("ro.build.time.fix", "");
        if (TextUtils.isEmpty(strA)) {
            strA = alj.a("sys.build.display.full_id", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = alj.a(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = alj.a(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        return TextUtils.isEmpty(strA) ? Build.DISPLAY : strA;
    }

    public static String e() {
        return alj.a(mkj.a(), "");
    }

    public static String f() {
        return alj.a(mkj.b(), "");
    }

    public static boolean g() {
        return SpeechConstant.TRUE_STR.equalsIgnoreCase(alj.a("persist.sys.assert.panic", "")) || SpeechConstant.TRUE_STR.equalsIgnoreCase(alj.a(SystemSettingsUtilsKt.LOG_ON_MKT, ""));
    }

    public static boolean h(Context context) {
        return avk.a() && context.getPackageManager().hasSystemFeature("oplus.feature.largescreen");
    }
}
