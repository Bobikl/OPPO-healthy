package com.oplus.aiunit.vision;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public class s06 {
    public static long a;

    public static boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - a < 1000;
        a = jCurrentTimeMillis;
        return z;
    }

    public static /* synthetic */ void c(WeakReference weakReference) {
        if (weakReference.get() != null) {
            ((View) weakReference.get()).setClickable(true);
        }
    }

    public static void d(View view) {
        if (view == null) {
            return;
        }
        view.setClickable(false);
        final WeakReference weakReference = new WeakReference(view);
        view.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.r06
            @Override // java.lang.Runnable
            public final void run() {
                s06.c(weakReference);
            }
        }, 1000L);
    }
}
