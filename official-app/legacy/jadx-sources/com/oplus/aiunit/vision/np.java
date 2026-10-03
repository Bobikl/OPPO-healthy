package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public class np {
    public final Stack<WeakReference<Activity>> a = new Stack<>();
    public final Application.ActivityLifecycleCallbacks b = new a();

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            np.this.d(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            np.this.e(activity);
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
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public void c(Application application) {
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.b);
        }
    }

    public final synchronized void d(Activity activity) {
        if (activity == null) {
            return;
        }
        this.a.push(new WeakReference<>(activity));
    }

    public final synchronized void e(Activity activity) {
        Activity activity2;
        if (activity == null) {
            return;
        }
        for (int size = this.a.size() - 1; size >= 0; size--) {
            try {
                WeakReference<Activity> weakReference = this.a.get(size);
                if (weakReference != null && (activity2 = weakReference.get()) != null && activity2.getClass().getSimpleName().equals(activity.getClass().getSimpleName())) {
                    this.a.remove(size);
                    break;
                }
            } catch (Exception unused) {
            }
        }
    }
}
