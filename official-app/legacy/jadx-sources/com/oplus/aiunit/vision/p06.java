package com.oplus.aiunit.vision;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class p06 {
    public static long a;

    public static void b() {
        a = 0L;
    }

    public static boolean c() {
        return d(500L);
    }

    public static boolean d(long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - a < j2;
        a = jCurrentTimeMillis;
        return z;
    }

    public static /* synthetic */ void e(WeakReference weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) weakReference.get()).setClickable(true);
    }

    public static void f(View view) {
        if (view != null) {
            view.setClickable(false);
            final WeakReference weakReference = new WeakReference(view);
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                view2.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.o06
                    @Override // java.lang.Runnable
                    public final void run() {
                        p06.e(weakReference);
                    }
                }, 500L);
            }
        }
    }
}
