package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes10.dex */
public final class yim {
    public static volatile a a;

    public static class a extends Handler {
        public a() {
            super(Looper.getMainLooper());
        }
    }

    public static class b implements Runnable {
        public final SoftReference<Runnable> i;

        public b(Runnable runnable) {
            this.i = new SoftReference<>(runnable);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = this.i.get();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void a(Runnable runnable) {
        if (a == null) {
            a = new a();
        }
        a.post(new b(runnable));
    }
}
