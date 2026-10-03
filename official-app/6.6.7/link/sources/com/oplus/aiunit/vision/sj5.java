package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import java.util.Locale;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class sj5 {
    public static String a(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "oplus_system_folding_mode");
        } catch (Exception e) {
            y8b.f("DeviceInfoUtil", "getFoldMode failed!", e);
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
        String strA = yoj.a("ro.build.time.fix", "");
        if (TextUtils.isEmpty(strA)) {
            strA = yoj.a("sys.build.display.full_id", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = yoj.a("ro.build.display.id", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = yoj.a("ro.build.display.id", "");
        }
        return TextUtils.isEmpty(strA) ? Build.DISPLAY : strA;
    }

    public static String e() {
        return yoj.a(ioj.a(), "");
    }

    public static String f() {
        return yoj.a(ioj.b(), "");
    }

    public static boolean g() {
        return "true".equalsIgnoreCase(yoj.a("persist.sys.assert.panic", "")) || "true".equalsIgnoreCase(yoj.a(SystemSettingsUtilsKt.LOG_ON_MKT, ""));
    }

    public static boolean h(Context context) {
        return yyk.a() && context.getPackageManager().hasSystemFeature("oplus.feature.largescreen");
    }
}
