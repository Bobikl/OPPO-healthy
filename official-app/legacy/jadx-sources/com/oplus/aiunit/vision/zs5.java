package com.oplus.aiunit.vision;

import android.util.Log;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes11.dex */
public final class zs5 extends d6 {
    public ExecutorService a;

    public static class a {
        public static final zs5 a = new zs5(null);
    }

    public /* synthetic */ zs5(ys5 ys5Var) {
        this();
    }

    public static zs5 b() {
        return a.a;
    }

    public void d(final Runnable runnable) {
        try {
            this.a.submit(new Runnable() { // from class: com.oplus.aiunit.vision.xs5
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            });
        } catch (Exception e2) {
            Log.e("DKF.SDK.DigitalKeyFramework", "RemoteException " + e2);
        }
    }

    public zs5() {
    }
}
