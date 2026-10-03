package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class kpm {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        if (vam.c(str) || vam.c(str2) || context == null) {
            return;
        }
        try {
            String strB = alm.b(alm.a(), str3);
            HashMap map = new HashMap();
            map.put(str2, strB);
            hsm.b(context, str, map);
        } catch (Throwable unused) {
        }
    }
}
