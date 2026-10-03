package com.oplus.aiunit.vision;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class xni {

    public static class a {
        public static final String ROM_MIUI = "xiaomi";
        public static final String a = "OPPO";

        public static synchronized boolean a() {
            return "meizu".equalsIgnoreCase(Build.BRAND);
        }

        public static synchronized boolean b() {
            return ROM_MIUI.equalsIgnoreCase(Build.BRAND);
        }

        public static synchronized boolean c() {
            return a.equalsIgnoreCase(Build.BRAND);
        }
    }

    public static boolean a(Window window, boolean z) {
        if (!a.a()) {
            return false;
        }
        g(window, z);
        WindowManager.LayoutParams attributes = window.getAttributes();
        try {
            Class<?> cls = Class.forName("android.view.WindowManager$LayoutParams");
            int i = cls.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON").getInt(attributes);
            Field declaredField = cls.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(attributes);
            if (z) {
                declaredField.set(attributes, Integer.valueOf(i2 | i));
            } else {
                declaredField.set(attributes, Integer.valueOf((~i) & i2));
            }
            return true;
        } catch (Exception e2) {
            a7b.b("StatusBarUtil", "FlymeSetStatusBarLightMode" + e2);
            return false;
        }
    }

    public static boolean b(Window window, boolean z) {
        if (!a.b() || window == null) {
            return false;
        }
        Class<?> cls = window.getClass();
        if (z) {
            try {
                window.addFlags(Integer.MIN_VALUE);
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            } catch (Exception unused) {
                return false;
            }
        }
        Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
        int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
        Class<?> cls3 = Integer.TYPE;
        Method method = cls.getMethod("setExtraFlags", cls3, cls3);
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(z ? i : 0);
        objArr[1] = Integer.valueOf(i);
        method.invoke(window, objArr);
        return true;
    }

    public static void c(Window window, boolean z) {
        if (a.c() || !(b(window, z) || a(window, z))) {
            g(window, z);
        }
    }

    public static int d() {
        return ejg.h();
    }

    public static void e(Window window) {
        c(window, true);
    }

    public static void f(Window window) {
        c(window, false);
    }

    public static void g(Window window, boolean z) {
        window.addFlags(Integer.MIN_VALUE);
        if (z) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        } else {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        }
    }
}
