package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Debug;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.monitor.storage.HeadSizeDataStore;

/* JADX INFO: loaded from: classes17.dex */
public class vh8 implements a3c {
    public final wh8 a;
    public final HeadSizeDataStore b;

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            vh8.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            d3c.a().post(new Runnable() { // from class: com.oplus.aiunit.vision.uh8
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.b();
                }
            });
        }
    }

    public vh8(Application application) {
        this.b = new HeadSizeDataStore(application);
        this.a = new wh8(application);
        application.registerActivityLifecycleCallbacks(new a());
    }

    @Override // com.oplus.aiunit.vision.a3c
    public long a() {
        return nlk.MIN_DELAY_MS;
    }

    @Override // com.oplus.aiunit.vision.a3c
    public void b() {
        try {
            this.b.j(c());
            this.a.a();
        } catch (Exception e2) {
            a7b.c("HeadSizeMonitor", "HeadSizeMonitor trigger saveHeadSize error", e2);
        }
    }

    public final Debug.MemoryInfo c() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.oplus.aiunit.vision.a3c
    public void start() {
    }
}
