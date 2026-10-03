package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes17.dex */
public class x84 {
    public static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        if (a != null) {
            return;
        }
        a = context.getApplicationContext();
    }
}
