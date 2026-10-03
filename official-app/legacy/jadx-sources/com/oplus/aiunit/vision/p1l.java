package com.oplus.aiunit.vision;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public class p1l {
    public static <T extends View> T a(Activity activity, int i) {
        return (T) woe.b(activity.findViewById(i));
    }

    public static <T extends View> T b(View view, int i) {
        return (T) woe.b(view.findViewById(i));
    }

    public static boolean c(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i < 0) {
            i = marginLayoutParams.leftMargin;
        }
        if (i2 < 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if (i3 < 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if (i4 < 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        return true;
    }
}
