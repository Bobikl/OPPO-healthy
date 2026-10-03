package com.oplus.aiunit.vision;

import android.app.UiModeManager;
import android.content.Context;
import android.text.TextUtils;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.platform.usercenter.tools.device.UCDeviceTypeFactory;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class lek {
    public static String a;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            e(op5.WATCH);
        } else if (d(context)) {
            e(DeviceInfoCompat.DeviceType.TV);
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
            e("pc");
        } else if (c(context)) {
            e(DeviceInfoCompat.DeviceType.PAD);
        } else if (b()) {
            e("foldPhone");
        } else {
            e("Mobile");
        }
        return a;
    }

    public static boolean b() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Method method = cls.getMethod("getInstance", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Method method2 = cls.getMethod("hasFeature", String.class);
            method2.setAccessible(true);
            return ((Boolean) method2.invoke(cls.cast(objInvoke), "oplus.hardware.type.fold")).booleanValue();
        } catch (Exception e2) {
            bn.c(UCDeviceTypeFactory.TAG, e2.toString());
            return false;
        }
    }

    public static boolean c(Context context) {
        String strA = blj.a("ro.build.characteristics", "");
        if (strA == null || strA.isEmpty()) {
            return false;
        }
        return strA.contains("tablet");
    }

    public static boolean d(Context context) {
        try {
            return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4;
        } catch (Exception e2) {
            bn.c(UCDeviceTypeFactory.TAG, e2.toString());
            return false;
        }
    }

    public static void e(String str) {
        a = str;
    }
}
