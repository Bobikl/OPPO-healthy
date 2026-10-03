package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k8n {

    /* JADX INFO: renamed from: s_a, reason: collision with root package name */
    public static boolean f13196s_a = false;

    public static void a(String str) {
        if (f13196s_a) {
            Log.d("IDHelper", str);
        }
    }

    public static void b(String str, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(exc.getMessage() != null ? exc.getMessage() : exc.getLocalizedMessage());
        Log.e("IDHelper", sb.toString());
    }
}
