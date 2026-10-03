package com.heytap.log.collect;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.heytap.log.Logger;
import com.heytap.log.collect.auto.ActivityInfoCollect;
import com.heytap.log.collect.auto.IAutoCollect;
import com.heytap.log.log.ICollectLog;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.util.AppUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ActivityLifeMonitor {
    private Logger logger;
    private List<IAutoCollect> mDataCollects;
    private SimpleLog mSimpleLog;
    private int foregroundCount = 0;
    private boolean isFlush = false;
    private Application.ActivityLifecycleCallbacks mCallBacks = new Application.ActivityLifecycleCallbacks() { // from class: com.heytap.log.collect.ActivityLifeMonitor.1
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
            if (ActivityLifeMonitor.this.mDataCollects == null || ActivityLifeMonitor.this.mDataCollects.size() <= 0) {
                return;
            }
            Iterator it = ActivityLifeMonitor.this.mDataCollects.iterator();
            while (it.hasNext()) {
                ((IAutoCollect) it.next()).onActivityStart(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ActivityLifeMonitor.access$008(ActivityLifeMonitor.this);
            ActivityLifeMonitor.this.isFlush = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (ActivityLifeMonitor.this.mDataCollects == null || ActivityLifeMonitor.this.mDataCollects.size() <= 0) {
                return;
            }
            Iterator it = ActivityLifeMonitor.this.mDataCollects.iterator();
            while (it.hasNext()) {
                ((IAutoCollect) it.next()).onActivityStop(activity);
            }
            ActivityLifeMonitor.access$010(ActivityLifeMonitor.this);
            if (ActivityLifeMonitor.this.logger == null || ActivityLifeMonitor.this.isForeground() || ActivityLifeMonitor.this.isFlush) {
                return;
            }
            ActivityLifeMonitor.this.isFlush = true;
            ActivityLifeMonitor.this.logger.debug("HLog", "onActivityStopped : flush ...");
            ActivityLifeMonitor.this.logger.flush(false);
        }
    };

    public ActivityLifeMonitor() {
    }

    public static /* synthetic */ int access$008(ActivityLifeMonitor activityLifeMonitor) {
        int i = activityLifeMonitor.foregroundCount;
        activityLifeMonitor.foregroundCount = i + 1;
        return i;
    }

    public static /* synthetic */ int access$010(ActivityLifeMonitor activityLifeMonitor) {
        int i = activityLifeMonitor.foregroundCount;
        activityLifeMonitor.foregroundCount = i - 1;
        return i;
    }

    public void destroy(Context context) {
        if (AppUtil.getAppContext() != null) {
            ((Application) AppUtil.getAppContext()).unregisterActivityLifecycleCallbacks(this.mCallBacks);
        }
    }

    public void init(Context context, ICollectLog iCollectLog) {
        if (AppUtil.getAppContext() != null) {
            ((Application) AppUtil.getAppContext()).registerActivityLifecycleCallbacks(this.mCallBacks);
            ArrayList arrayList = new ArrayList();
            this.mDataCollects = arrayList;
            arrayList.add(new ActivityInfoCollect(iCollectLog));
            return;
        }
        if (context != null) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.mCallBacks);
            ArrayList arrayList2 = new ArrayList();
            this.mDataCollects = arrayList2;
            arrayList2.add(new ActivityInfoCollect(iCollectLog));
        }
    }

    public boolean isForeground() {
        return this.foregroundCount > 0;
    }

    public ActivityLifeMonitor(SimpleLog simpleLog) {
        this.mSimpleLog = simpleLog;
    }

    public void init(Context context, ICollectLog iCollectLog, SimpleLog simpleLog, Logger logger) {
        this.logger = logger;
        if (AppUtil.getAppContext() != null) {
            ((Application) AppUtil.getAppContext()).registerActivityLifecycleCallbacks(this.mCallBacks);
            ArrayList arrayList = new ArrayList();
            this.mDataCollects = arrayList;
            arrayList.add(new ActivityInfoCollect(iCollectLog, simpleLog));
        }
    }
}
