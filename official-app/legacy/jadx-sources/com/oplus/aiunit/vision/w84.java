package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class w84 {
    public static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        if (a != null) {
            return;
        }
        a = context;
    }
}
