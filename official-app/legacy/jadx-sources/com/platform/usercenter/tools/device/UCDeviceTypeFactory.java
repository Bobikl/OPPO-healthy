package com.platform.usercenter.tools.device;

import android.app.UiModeManager;
import android.content.Context;
import android.text.TextUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.SystemPropertyUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class UCDeviceTypeFactory {
    private static String CUR_DEVICE_TYPE = null;
    private static final String DEVICE_TYPE_FOLD_PHONE = "foldPhone";
    private static final String DEVICE_TYPE_MOBILE = "Mobile";
    private static final String DEVICE_TYPE_PAD = "pad";
    private static final String DEVICE_TYPE_PC = "pc";
    private static final String DEVICE_TYPE_TV = "tv";
    private static final String DEVICE_TYPE_WATCH = "Watch";
    public static final String TAG = "UCDeviceTypeFactory";

    public static String getDeviceType(Context context) {
        if (!TextUtils.isEmpty(CUR_DEVICE_TYPE)) {
            return CUR_DEVICE_TYPE;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            set("Watch");
        } else if (isTv(context)) {
            set("tv");
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
            set(DEVICE_TYPE_PC);
        } else if (isPad(context)) {
            set("pad");
        } else if (isFoldPhone()) {
            set(DEVICE_TYPE_FOLD_PHONE);
        } else {
            set(DEVICE_TYPE_MOBILE);
        }
        return CUR_DEVICE_TYPE;
    }

    private static boolean isFoldPhone() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Method method = cls.getMethod("getInstance", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Method method2 = cls.getMethod("hasFeature", String.class);
            method2.setAccessible(true);
            return ((Boolean) method2.invoke(cls.cast(objInvoke), "oplus.hardware.type.fold")).booleanValue();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return false;
        }
    }

    public static boolean isPad(Context context) {
        String str = SystemPropertyUtils.get("ro.build.characteristics", "");
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.contains("tablet");
    }

    public static boolean isTv(Context context) {
        try {
            return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return false;
        }
    }

    private static void set(String str) {
        CUR_DEVICE_TYPE = str;
    }
}
