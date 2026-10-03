package com.oplus.aiunit.vision;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class pi5 {
    public static volatile String a = "";
    public static volatile String b = "";

    public static String c(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "Watch";
        }
        if (l(context)) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
            return "pc";
        }
        return j() ? "pad" : "Mobile";
    }

    public static String d() {
        if (!TextUtils.isEmpty(a) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(a)) {
            return a;
        }
        String strC = mp2.b().c("key_guid", null);
        if (!TextUtils.isEmpty(strC) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(a)) {
            a = strC;
        }
        o0k.i(new Runnable() { // from class: com.oplus.aiunit.vision.mi5
            @Override // java.lang.Runnable
            public final void run() {
                pi5.m();
            }
        });
        return a;
    }

    public static String e() {
        if (!TextUtils.isEmpty(b) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(b)) {
            return b;
        }
        String strC = mp2.b().c("key_ouid", null);
        if (!TextUtils.isEmpty(strC) && !"0000000000000000000000000000000000000000000000000000000000000000".equals(b)) {
            b = strC;
        }
        o0k.i(new Runnable() { // from class: com.oplus.aiunit.vision.ki5
            @Override // java.lang.Runnable
            public final void run() {
                pi5.n();
            }
        });
        return b;
    }

    public static String f() {
        return h();
    }

    @Deprecated
    public static String g() {
        return "OC".equalsIgnoreCase(f()) ? gqe.DEFAULT_LANGUAGE : f();
    }

    public static String h() {
        String strA = yoj.a(o(), gqe.DEFAULT_LANGUAGE);
        return strA.length() == 0 ? yoj.a(p(), gqe.DEFAULT_LANGUAGE) : strA;
    }

    public static String i(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static boolean j() {
        return k();
    }

    public static boolean k() {
        String strA = yoj.a("ro.build.characteristics", "");
        return strA.length() != 0 && strA.toLowerCase().contains("tablet");
    }

    public static boolean l(Context context) {
        Object systemService = context.getSystemService("uimode");
        return (systemService instanceof UiModeManager) && ((UiModeManager) systemService).getCurrentModeType() == 4;
    }

    public static /* synthetic */ void m() {
        try {
            String strI = i(hsi.f(q94.b()), "");
            if (TextUtils.isEmpty(strI) || "0000000000000000000000000000000000000000000000000000000000000000".equals(strI)) {
                return;
            }
            mp2.b().d("key_guid", strI);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void n() {
        try {
            String strI = i(hsi.g(q94.b()), "");
            if (TextUtils.isEmpty(strI) || "0000000000000000000000000000000000000000000000000000000000000000".equals(strI)) {
                return;
            }
            mp2.b().d("key_ouid", strI);
        } catch (Throwable unused) {
        }
    }

    public static String o() {
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            return "";
        }
        return i == 30 ? nt5.a("zg&~mflgz&gxd}{&zmoagfeizc") : nt5.a("zg&gxxg&zmoagfeizc");
    }

    public static String p() {
        return nt5.a("zg&gxxg&in|mz{idm&zmoagf");
    }
}
