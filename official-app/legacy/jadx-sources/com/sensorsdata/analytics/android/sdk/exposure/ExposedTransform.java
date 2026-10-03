package com.sensorsdata.analytics.android.sdk.exposure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.monitor.SensorsDataActivityLifecycleCallbacks;
import com.sensorsdata.analytics.android.sdk.util.WindowHelper;
import com.sensorsdata.analytics.android.sdk.util.visual.ViewUtil;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public class ExposedTransform implements SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks {
    private boolean isResumedLayoutChanged;
    private WeakReference<Activity> mActivityWeakReference;
    private final AppPageChange mAppPageChange;
    private final SAExposedProcess.CallBack mCallBack;
    private final String TAG = "SA.ExposedTransform";
    private volatile boolean isMonitor = false;
    private volatile int windowCount = -1;

    public interface LayoutCallBack {
        void viewLayoutChange();
    }

    public ExposedTransform(final SAExposedProcess.CallBack callBack) {
        this.mCallBack = callBack;
        this.mAppPageChange = new AppPageChange(new LayoutCallBack() { // from class: com.sensorsdata.analytics.android.sdk.exposure.ExposedTransform.1
            @Override // com.sensorsdata.analytics.android.sdk.exposure.ExposedTransform.LayoutCallBack
            public void viewLayoutChange() {
                Activity activity;
                if (ExposedTransform.this.mActivityWeakReference == null || (activity = (Activity) ExposedTransform.this.mActivityWeakReference.get()) == null || !ExposedTransform.this.isViewChanged(activity)) {
                    return;
                }
                ExposedTransform.this.isResumedLayoutChanged = false;
                callBack.viewLayoutChange(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isViewChanged(Activity activity) {
        try {
            Collection<ExposureView> exposureViews = this.mCallBack.getExposureViews(activity);
            if (exposureViews != null && !exposureViews.isEmpty()) {
                boolean z = false;
                for (ExposureView exposureView : exposureViews) {
                    try {
                        View view = exposureView.getView();
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int i = R.id.sensors_analytics_tag_view_exposure_key;
                        String str = (String) view.getTag(i);
                        String str2 = iArr[0] + "," + iArr[1] + "," + ViewUtil.viewVisibilityInParents(view);
                        if (!str2.equals(str) || this.isResumedLayoutChanged) {
                            SALog.i("SA.ExposedTransform", str + ", newSize = " + str2 + ",view = " + view);
                            try {
                                exposureView.setViewLayoutChange(true);
                                z = true;
                            } catch (Exception e2) {
                                e = e2;
                                z = true;
                                SALog.printStackTrace(e);
                            }
                        }
                        view.setTag(i, str2);
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                return z;
            }
            return false;
        } catch (Exception e4) {
            SALog.printStackTrace(e4);
            return true;
        }
    }

    private View[] processViews() {
        try {
            WindowHelper.init();
            View[] sortedWindowViews = WindowHelper.getSortedWindowViews();
            if (sortedWindowViews.length > 0) {
                this.windowCount = sortedWindowViews.length;
            } else {
                this.windowCount = 0;
            }
            return sortedWindowViews;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    private void viewRemoveTreeObserver(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.removeGlobalOnLayoutListener(this.mAppPageChange);
        viewTreeObserver.removeOnWindowFocusChangeListener(this.mAppPageChange);
        viewTreeObserver.removeOnScrollChangedListener(this.mAppPageChange);
        viewTreeObserver.removeOnGlobalFocusChangeListener(this.mAppPageChange);
    }

    private void viewTreeObserver(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(this.mAppPageChange);
        viewTreeObserver.addOnWindowFocusChangeListener(this.mAppPageChange);
        viewTreeObserver.addOnScrollChangedListener(this.mAppPageChange);
        viewTreeObserver.addOnGlobalFocusChangeListener(this.mAppPageChange);
    }

    private void viewsAddTreeObserver(Activity activity) {
        SALog.i("SA.ExposedTransform", "viewsAddTreeObserver:" + this.isMonitor);
        if (this.isMonitor || this.mCallBack.getExposureViewSize(activity) <= 0) {
            return;
        }
        processViews();
        View[] sortedWindowViews = WindowHelper.getSortedWindowViews();
        View decorView = activity.getWindow().getDecorView();
        if (sortedWindowViews == null || sortedWindowViews.length <= 0) {
            viewTreeObserver(activity.getWindow().getDecorView());
        } else {
            boolean z = true;
            for (View view : sortedWindowViews) {
                if (decorView == view) {
                    z = false;
                }
                viewTreeObserver(view);
            }
            if (z) {
                viewTreeObserver(decorView);
            }
        }
        this.isMonitor = true;
    }

    private void viewsRemoveTreeObserver(Activity activity, View[] viewArr) {
        SALog.i("SA.ExposedTransform", "viewsRemoveTreeObserver:" + this.isMonitor);
        if (this.isMonitor) {
            this.isMonitor = false;
            if (viewArr == null) {
                viewArr = WindowHelper.getSortedWindowViews();
            }
            if (viewArr == null || viewArr.length <= 0) {
                viewRemoveTreeObserver(activity.getWindow().getDecorView());
                return;
            }
            for (View view : viewArr) {
                viewRemoveTreeObserver(view);
            }
        }
    }

    public synchronized void observerWindow(Activity activity) {
        int i = this.windowCount;
        View[] viewArrProcessViews = processViews();
        SALog.i("SA.ExposedTransform", "originWindowCount:" + i + ",windowCount:" + this.windowCount);
        if (i != this.windowCount) {
            viewsRemoveTreeObserver(activity, viewArrProcessViews);
            onActivityResumed(activity);
        } else {
            if (!this.isMonitor) {
                onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.mActivityWeakReference = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        SALog.i("SA.ExposedTransform", "onActivityPaused");
        synchronized (this) {
            viewsRemoveTreeObserver(activity, null);
            this.mCallBack.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mActivityWeakReference = new WeakReference<>(activity);
        this.isResumedLayoutChanged = true;
        SALog.i("SA.ExposedTransform", "onActivityResumed:" + activity);
        synchronized (this) {
            viewsAddTreeObserver(activity);
            this.mCallBack.onActivityResumed(activity);
        }
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

    @Override // com.sensorsdata.analytics.android.sdk.monitor.SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks
    public void onNewIntent(Intent intent) {
    }
}
