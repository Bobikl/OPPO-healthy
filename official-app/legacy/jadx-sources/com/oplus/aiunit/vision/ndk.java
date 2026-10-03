package com.oplus.aiunit.vision;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes3.dex */
public class ndk {
    public static final String FONT_TYPE = "sys-sans-en";
    public static Typeface a;
    public static Typeface b;

    public static Typeface a(boolean z) {
        if (z) {
            if (b == null) {
                try {
                    b = Typeface.create("sys-sans-en", 1);
                } catch (RuntimeException unused) {
                    a7b.m("Utils", "Create Typeface from /system/fonts/SysSans-En-Medium.otf failed!");
                    b = Typeface.DEFAULT_BOLD;
                }
            }
            return b;
        }
        if (a == null) {
            try {
                a = Typeface.create("sys-sans-en", 0);
            } catch (RuntimeException unused2) {
                a7b.m("Utils", "Create Typeface from /system/fonts/SysSans-En-Regular.otf failed!");
                a = Typeface.DEFAULT;
            }
        }
        return a;
    }
}
