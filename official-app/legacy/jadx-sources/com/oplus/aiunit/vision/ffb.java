package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes19.dex */
public class ffb {
    public static String a(Context context, String str) {
        return String.valueOf(b(context, str));
    }

    public static Object b(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(rqk.j(context), 128).metaData.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
