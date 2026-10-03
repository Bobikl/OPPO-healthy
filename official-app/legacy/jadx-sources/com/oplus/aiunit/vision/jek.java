package com.oplus.aiunit.vision;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class jek {
    public static int a() {
        try {
            Class<?> cls = Class.forName(iek.a());
            return ((Integer) cls.getDeclaredMethod(iek.h(), new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Exception e2) {
            bn.c("UCDeviceInfoUtil", e2.toString());
            return 0;
        }
    }

    public static String b() {
        String strA = blj.a(d7m.b("zg&j}adl&~mz{agf&gxd}{zge"), "");
        return "".equals(strA) ? blj.a(d7m.b("zg&j}adl&~mz{agf&gxxgzge"), "") : strA;
    }

    public static boolean c(@Nullable Context context) {
        if (context == null) {
            bn.f("UCDeviceInfoUtil", "getTalkBackState getTalkBackState context == null");
            return false;
        }
        if (!(Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled", 0) == 1)) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList.isEmpty()) {
            bn.f("UCDeviceInfoUtil", "getTalkBackState getTalkBackState accessibilityServices isEmpty");
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if ("com.google.android.marvin.talkback".equals(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName) && "com.google.android.marvin.talkback.TalkBackService".equals(accessibilityServiceInfo.getResolveInfo().serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d() {
        String strD = iek.d();
        return strD.equalsIgnoreCase(Build.BRAND) || strD.equalsIgnoreCase(blj.a("ro.product.brand.sub", iek.b()));
    }

    public static boolean e(Context context) {
        String strF = iek.f();
        if (!context.getPackageManager().hasSystemFeature(nek.a())) {
            String str = Build.BRAND;
            if (!strF.equalsIgnoreCase(str) && !"Kepler".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
