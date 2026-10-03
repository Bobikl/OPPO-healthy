package com.heytap.msp.sdk.common.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.heytap.msp.sdk.base.common.log.MspLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ActivityLifeCallBack implements Application.ActivityLifecycleCallbacks {
    private static final String GET_ACTIVITY_REFLECT = "getActivityReflect: ";
    private static final String TAG = "ActivityLifeCallBack";
    private WeakReference<Activity> gcActivity;
    private Activity sActivity;

    public static class Holder {
        private static final ActivityLifeCallBack INSTANCE = new ActivityLifeCallBack();

        private Holder() {
        }
    }

    private ActivityLifeCallBack() {
    }

    private static Activity getActivityReflect() {
        StringBuilder sb;
        MspLog.d(TAG, "get activity from reflect");
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append(GET_ACTIVITY_REFLECT);
            sb.append(e.getMessage());
            MspLog.e(TAG, sb.toString());
        } catch (IllegalAccessException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append(GET_ACTIVITY_REFLECT);
            sb.append(e.getMessage());
            MspLog.e(TAG, sb.toString());
        } catch (NoSuchFieldException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append(GET_ACTIVITY_REFLECT);
            sb.append(e.getMessage());
            MspLog.e(TAG, sb.toString());
        } catch (NoSuchMethodException e5) {
            e = e5;
            sb = new StringBuilder();
            sb.append(GET_ACTIVITY_REFLECT);
            sb.append(e.getMessage());
            MspLog.e(TAG, sb.toString());
        } catch (InvocationTargetException e6) {
            e = e6;
            sb = new StringBuilder();
            sb.append(GET_ACTIVITY_REFLECT);
            sb.append(e.getMessage());
            MspLog.e(TAG, sb.toString());
        }
        return null;
    }

    public static ActivityLifeCallBack getInstance() {
        return Holder.INSTANCE;
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.gcActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        Activity activity = this.sActivity;
        return activity == null ? getActivityReflect() : activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.sActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.sActivity = activity;
        com.heytap.msp.sdk.core.a.M().U();
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

    public void setGcActivity(Activity activity) {
        this.gcActivity = new WeakReference<>(activity);
    }
}
