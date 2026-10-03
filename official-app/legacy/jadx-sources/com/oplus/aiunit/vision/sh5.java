package com.oplus.aiunit.vision;

import android.app.UiModeManager;
import android.content.Context;
import android.text.TextUtils;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class sh5 {
    public static String a = "";
    public static String b = "";

    @NotNull
    public static String c(@NotNull Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return op5.WATCH;
        }
        if (i(context)) {
            return DeviceInfoCompat.DeviceType.TV;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
            return "pc";
        }
        return g() ? DeviceInfoCompat.DeviceType.PAD : "Mobile";
    }

    public static String d(final Context context) {
        if (!TextUtils.isEmpty(a) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(a)) {
            return a;
        }
        String string = context.getSharedPreferences("SP_PAY_SDK_OPEN_ID_DATA", 0).getString("key_guid", null);
        if (!TextUtils.isEmpty(string) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(a)) {
            a = string;
        }
        na0.a().b().execute(new Runnable() { // from class: com.oplus.aiunit.vision.rh5
            @Override // java.lang.Runnable
            public final void run() {
                sh5.j(context);
            }
        });
        return a;
    }

    public static String e(final Context context) {
        if (!TextUtils.isEmpty(b) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(b)) {
            return b;
        }
        String string = context.getSharedPreferences("SP_PAY_SDK_OPEN_ID_DATA", 0).getString("key_ouid", null);
        if (!TextUtils.isEmpty(string) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(b)) {
            b = string;
        }
        na0.a().b().execute(new Runnable() { // from class: com.oplus.aiunit.vision.ph5
            @Override // java.lang.Runnable
            public final void run() {
                sh5.k(context);
            }
        });
        return b;
    }

    public static String f(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static boolean g() {
        return h();
    }

    public static boolean h() {
        String strA = rkj.a("ro.build.characteristics");
        return strA.length() != 0 && strA.toLowerCase().contains("tablet");
    }

    public static boolean i(Context context) {
        Object systemService = context.getSystemService("uimode");
        return (systemService instanceof UiModeManager) && ((UiModeManager) systemService).getCurrentModeType() == 4;
    }

    public static /* synthetic */ void j(Context context) {
        try {
            String strF = f(poi.f(context), "");
            if (TextUtils.isEmpty(strF)) {
                qae.c("Std_ID_SDK getGUID isEmpty");
            }
            if (TextUtils.isEmpty(strF) || "0000000000000000000000000000000000000000000000000000000000000000".equals(strF)) {
                return;
            }
            context.getSharedPreferences("SP_PAY_SDK_OPEN_ID_DATA", 0).edit().putString("key_guid", strF).apply();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void k(Context context) {
        try {
            String strF = f(poi.g(context), "");
            if (TextUtils.isEmpty(strF)) {
                qae.c("Std_ID_SDK getOUID isEmpty");
            }
            if (TextUtils.isEmpty(strF) || "0000000000000000000000000000000000000000000000000000000000000000".equals(strF)) {
                return;
            }
            context.getSharedPreferences("SP_PAY_SDK_OPEN_ID_DATA", 0).edit().putString("key_ouid", strF).apply();
        } catch (Throwable unused) {
        }
    }
}
