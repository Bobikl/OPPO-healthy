package com.sensorsdata.analytics.android.sdk.monitor;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(14)
public class SensorsDataActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final CopyOnWriteArraySet<SAActivityLifecycleCallbacks> mActivityCallbacks = new CopyOnWriteArraySet<>();

    public interface SAActivityLifecycleCallbacks extends Application.ActivityLifecycleCallbacks {
        void onNewIntent(Intent intent);
    }

    public void addActivityLifecycleCallbacks(SAActivityLifecycleCallbacks sAActivityLifecycleCallbacks) {
        if (sAActivityLifecycleCallbacks != null) {
            this.mActivityCallbacks.add(sAActivityLifecycleCallbacks);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator<SAActivityLifecycleCallbacks> it = this.mActivityCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityCreated(activity, bundle);
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator<SAActivityLifecycleCallbacks> it = this.mActivityCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityDestroyed(activity);
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Iterator<SAActivityLifecycleCallbacks> it = this.mActivityCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityPaused(activity);
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Iterator<SAActivityLifecycleCallbacks> it = this.mActivityCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResumed(activity);
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator<SAActivityLifecycleCallbacks> it = this.mActivityCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivitySaveInstanceState(activity, bundle);
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator<SAActivityLifecycleCallbacks> it = this.mActivityCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityStarted(activity);
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator<SAActivityLifecycleCallbacks> it = this.mActivityCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityStopped(activity);
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    public void removeActivityLifecycleCallbacks(SAActivityLifecycleCallbacks sAActivityLifecycleCallbacks) {
        if (sAActivityLifecycleCallbacks != null) {
            this.mActivityCallbacks.remove(sAActivityLifecycleCallbacks);
        }
    }
}
