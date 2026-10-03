package com.oplus.aiunit.vision;

import android.app.UiModeManager;
import android.content.Context;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class oi5 {
    public static String a = "";
    public static String b = "";

    @NotNull
    public static String c(@NotNull Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "Watch";
        }
        if (i(context)) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
            return "pc";
        }
        return g() ? "pad" : "Mobile";
    }

    public static String d(final Context context) {
        if (!TextUtils.isEmpty(a) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(a)) {
            return a;
        }
        String string = context.getSharedPreferences("SP_PAY_SDK_OPEN_ID_DATA", 0).getString("key_guid", null);
        if (!TextUtils.isEmpty(string) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(a)) {
            a = string;
        }
        xa0.a().b().execute(new Runnable() { // from class: com.oplus.aiunit.vision.ni5
            @Override // java.lang.Runnable
            public final void run() {
                oi5.j(context);
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
        xa0.a().b().execute(new Runnable() { // from class: com.oplus.aiunit.vision.li5
            @Override // java.lang.Runnable
            public final void run() {
                oi5.k(context);
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
        String strA = noj.a("ro.build.characteristics");
        return strA.length() != 0 && strA.toLowerCase().contains("tablet");
    }

    public static boolean i(Context context) {
        Object systemService = context.getSystemService("uimode");
        return (systemService instanceof UiModeManager) && ((UiModeManager) systemService).getCurrentModeType() == 4;
    }

    public static /* synthetic */ void j(Context context) {
        try {
            String strF = f(hsi.f(context), "");
            if (TextUtils.isEmpty(strF)) {
                pce.c("Std_ID_SDK getGUID isEmpty");
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
            String strF = f(hsi.g(context), "");
            if (TextUtils.isEmpty(strF)) {
                pce.c("Std_ID_SDK getOUID isEmpty");
            }
            if (TextUtils.isEmpty(strF) || "0000000000000000000000000000000000000000000000000000000000000000".equals(strF)) {
                return;
            }
            context.getSharedPreferences("SP_PAY_SDK_OPEN_ID_DATA", 0).edit().putString("key_ouid", strF).apply();
        } catch (Throwable unused) {
        }
    }
}
