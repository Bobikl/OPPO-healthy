package com.oplus.aiunit.vision;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes18.dex */
public class l0l {
    public static final boolean a = true;
    public static String b;

    public static boolean a() {
        try {
            Class.forName("com.oplus.inner.view.ViewWrapper");
            return true;
        } catch (Exception e2) {
            Log.d("ViewNative", e2.toString());
            return false;
        }
    }

    public static void b(View view, int i) {
        String strG = a() ? "com.oplus.inner.view.ViewWrapper" : khc.c().g();
        b = strG;
        try {
            if (a) {
                Class.forName(strG).getDeclaredMethod("setScrollXForColor", View.class, Integer.TYPE).invoke(null, view, Integer.valueOf(i));
            } else {
                Field declaredField = View.class.getDeclaredField("mScrollX");
                declaredField.setAccessible(true);
                declaredField.setInt(view, i);
            }
        } catch (Exception e2) {
            Log.d("ViewNative", e2.toString());
        }
    }

    public static void c(View view, int i) {
        String strG = a() ? "com.oplus.inner.view.ViewWrapper" : khc.c().g();
        b = strG;
        try {
            if (a) {
                Class.forName(strG).getDeclaredMethod("setScrollYForColor", View.class, Integer.TYPE).invoke(null, view, Integer.valueOf(i));
            } else {
                Field declaredField = View.class.getDeclaredField("mScrollY");
                declaredField.setAccessible(true);
                declaredField.setInt(view, i);
            }
        } catch (Exception e2) {
            Log.d("ViewNative", e2.toString());
        }
    }
}
