package com.oplus.aiunit.vision;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public class dmc {
    public static final int DIRECTION_BOTTOM = 3;
    public static final int DIRECTION_LEFT = 0;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_SIZE = 4;
    public static final int DIRECTION_TOP = 1;

    public static int a(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (i == 0) {
                    return ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                }
                if (i == 1) {
                    return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                }
                if (i == 2) {
                    return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                if (i != 3) {
                    return 0;
                }
                return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
        }
        return 0;
    }

    public static void b(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (i == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
                } else if (i == 1) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
                } else if (i == 2) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i2;
                } else if (i == 3) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
