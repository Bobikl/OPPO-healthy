package com.oplus.aiunit.vision;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class drk {
    public static double a(String str) {
        if (str == null) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public static int b(int i, String str, int i2) {
        if (str == null) {
            return i2;
        }
        try {
            return (int) Long.parseLong(str.trim(), i);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static void c(Activity activity) {
        View viewPeekDecorView;
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (!inputMethodManager.isActive() || (viewPeekDecorView = activity.getWindow().peekDecorView()) == null || viewPeekDecorView.getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
    }

    public static boolean d(String str) {
        return TextUtils.isEmpty(str);
    }

    public static <T> boolean e(List<T> list) {
        return list == null || list.isEmpty() || list.size() == 0;
    }

    public static boolean f(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static String g(Object obj) {
        return ika.c().a(obj);
    }
}
