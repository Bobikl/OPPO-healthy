package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes12.dex */
public class pcm {
    public static final String a = "ro.build.version.emui";
    public static final String b = "hw_sc.build.platform.version";

    public static jim a(Context context) {
        String str = Build.BRAND;
        ldm.c("Device", TombstoneParser.keyBrand, str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new com.alipay.sdk.m.c.b();
        }
        if (str.equalsIgnoreCase(xni.a.ROM_MIUI) || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new a0n();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new gzm();
        }
        if (str.equalsIgnoreCase(qbm.b) || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new cvm();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new ymm();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new osm();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new txm();
        }
        if (c()) {
            return new com.alipay.sdk.m.c.b();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new vpm();
        }
        return null;
    }

    public static String b(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean c() {
        return (TextUtils.isEmpty(b(a)) && TextUtils.isEmpty(b(b))) ? false : true;
    }
}
