package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class i1n {
    public static i1n b;
    public Context a;

    public i1n(Context context) {
        this.a = context;
    }

    public static i1n a(Context context) {
        if (b == null) {
            synchronized (i1n.class) {
                if (b == null) {
                    b = new i1n(context);
                }
            }
        }
        return b;
    }

    public static String b() {
        return "";
    }
}
