package com.oplus.aiunit.vision;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.heytap.health.base.task.ThreadUtils;

/* JADX INFO: loaded from: classes15.dex */
public class kwa {
    public static void c(final Lifecycle lifecycle, final LifecycleObserver lifecycleObserver) {
        if (lifecycle == null) {
            throw new NullPointerException("LifecycleUtils lifecycle is null");
        }
        if (lifecycleObserver == null) {
            throw new NullPointerException("LifecycleUtils lifecycleObserver is null");
        }
        if (d()) {
            lifecycle.addObserver(lifecycleObserver);
            return;
        }
        if (qe0.s()) {
            throw new RuntimeException("addObserver must in main thread");
        }
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.jwa
            @Override // java.lang.Runnable
            public final void run() {
                lifecycle.addObserver(lifecycleObserver);
            }
        });
        a7b.b("LifecycleUtils", "addLifecycleObeserver: lifecycle is " + lifecycle + " lifecycleObserver is " + lifecycleObserver);
        StringBuilder sb = new StringBuilder();
        sb.append("getStackTraceString ");
        sb.append(a7b.e(new Throwable()));
        a7b.f("LifecycleUtils", sb.toString());
    }

    public static boolean d() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void g(final Lifecycle lifecycle, final LifecycleObserver lifecycleObserver) {
        if (lifecycle == null) {
            throw new NullPointerException("LifecycleUtils lifecycle is null");
        }
        if (lifecycleObserver == null) {
            throw new NullPointerException("LifecycleUtils lifecycleObserver is null");
        }
        if (d()) {
            lifecycle.removeObserver(lifecycleObserver);
            return;
        }
        if (qe0.s()) {
            throw new RuntimeException("removeObserver must in main thread");
        }
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.iwa
            @Override // java.lang.Runnable
            public final void run() {
                lifecycle.removeObserver(lifecycleObserver);
            }
        });
        a7b.b("LifecycleUtils", "removeLifecycleObeserver: lifecycle is " + lifecycle + " lifecycleObserver is " + lifecycleObserver);
    }
}
