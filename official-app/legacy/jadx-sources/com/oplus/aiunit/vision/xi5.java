package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class xi5 {
    public static String a(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "oplus_system_folding_mode");
        } catch (Exception e2) {
            q7b.f("DeviceInfoUtil", "getFoldMode failed!", e2);
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
        String strA = clj.a("ro.build.time.fix", "");
        if (TextUtils.isEmpty(strA)) {
            strA = clj.a("sys.build.display.full_id", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = clj.a(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = clj.a(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        return TextUtils.isEmpty(strA) ? Build.DISPLAY : strA;
    }

    public static String e() {
        return clj.a(nkj.a(), "");
    }

    public static String f() {
        return clj.a(nkj.b(), "");
    }

    public static boolean g(Context context) {
        return cvk.d() && context.getPackageManager().hasSystemFeature("oplus.feature.largescreen");
    }
}
