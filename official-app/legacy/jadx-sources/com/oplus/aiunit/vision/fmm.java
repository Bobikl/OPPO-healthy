package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
public class fmm {
    public static jim a = null;
    public static boolean b = false;

    public static synchronized String a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            jim jimVar = a;
            if (jimVar != null) {
                try {
                    return jimVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void b(Context context) {
        if (a != null || b) {
            return;
        }
        synchronized (fmm.class) {
            if (a == null && !b) {
                a = pcm.a(context);
                b = true;
            }
        }
    }
}
