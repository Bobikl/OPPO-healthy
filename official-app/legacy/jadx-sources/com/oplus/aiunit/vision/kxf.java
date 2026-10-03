package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public class kxf {
    public static String a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return l7a.f().e(context);
        }
        v6b.b("cannot run on main thread");
        return null;
    }
}
