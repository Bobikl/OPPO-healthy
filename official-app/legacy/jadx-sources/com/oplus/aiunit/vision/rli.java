package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.core.upload.upload.UploadPipelineV2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class rli {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static volatile int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f16250c = false;
    public static volatile long d = 0;

    public class a implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ Context i;

        public a(Context context) {
            this.i = context;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            rli.b++;
            if (rli.f16250c || rli.b <= 0) {
                return;
            }
            rli.f16250c = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            rli.b--;
            if (rli.b <= 0) {
                rli.b = 0;
                if (rli.f16250c) {
                    rli.f16250c = false;
                    rli.g(this.i);
                }
            }
        }
    }

    public static void f(Context context) {
        if (context != null && w56.a() == ChannelMode.STANDALONE && a.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Application)) {
                z6b.u("StandaloneBgFlush", "registerIfNeeded failed: appCtx is not Application");
            } else {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new a(applicationContext));
                z6b.q("StandaloneBgFlush", "StandaloneBackgroundFlushMonitor registered");
            }
        }
    }

    public static void g(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - d < 5000) {
            return;
        }
        d = jCurrentTimeMillis;
        try {
            z6b.q("StandaloneBgFlush", "triggerFlush: app moved to background, invoke UploadPipelineV2.onHostAppBackgrounded()");
            UploadPipelineV2.getInstance(context).onHostAppBackgrounded();
        } catch (Throwable th) {
            z6b.u("StandaloneBgFlush", "triggerFlush error: " + th);
        }
    }
}
