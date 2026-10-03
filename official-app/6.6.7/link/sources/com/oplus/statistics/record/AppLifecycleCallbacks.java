package com.oplus.statistics.record;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AppLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public int i;
    public boolean j;

    public static class Holder {
        public static final AppLifecycleCallbacks a = new AppLifecycleCallbacks();
    }

    public static AppLifecycleCallbacks getInstance() {
        return Holder.a;
    }

    public final boolean a() {
        return this.i == 1;
    }

    public final boolean b() {
        return this.i == 0;
    }

    public synchronized void init(Application application) {
        if (!this.j) {
            application.registerActivityLifecycleCallbacks(this);
            this.j = true;
        }
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
        if (a()) {
            StatIdManager.getInstance().refreshAppSessionIdIfNeed(activity.getApplicationContext());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.i++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.i--;
        if (b()) {
            StatIdManager.getInstance().onAppExit(activity.getApplicationContext());
        }
    }

    public AppLifecycleCallbacks() {
        this.i = 0;
    }
}
