package com.oplus.statistics.record;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public class AppLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20119j;

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
        if (!this.f20119j) {
            application.registerActivityLifecycleCallbacks(this);
            this.f20119j = true;
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
