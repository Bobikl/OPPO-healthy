package com.heytap.mspsdk.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.heytap.mspsdk.log.MspLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    public Activity i;

    public static class b {
        public static final a a = new a();
    }

    public a() {
    }

    public static Activity b() {
        MspLog.d("ActivityLifeCallBack", "get activity from reflect");
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
            MspLog.e("ActivityLifeCallBack", "getActivityReflect: " + e2.getMessage());
        } catch (IllegalAccessException e3) {
            MspLog.e("ActivityLifeCallBack", "getActivityReflect: " + e3.getMessage());
        } catch (NoSuchFieldException e4) {
            MspLog.e("ActivityLifeCallBack", "getActivityReflect: " + e4.getMessage());
        } catch (NoSuchMethodException e5) {
            MspLog.e("ActivityLifeCallBack", "getActivityReflect: " + e5.getMessage());
        } catch (InvocationTargetException e6) {
            MspLog.e("ActivityLifeCallBack", "getActivityReflect: " + e6.getMessage());
        }
        return null;
    }

    public static a c() {
        return b.a;
    }

    public Activity a() {
        Activity activity = this.i;
        return activity == null ? b() : activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        MspLog.iIgnore("ActivityLifeCallBack", "onActivityCreated " + activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.i = null;
        MspLog.iIgnore("ActivityLifeCallBack", "onActivityPaused " + activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.i = activity;
        MspLog.iIgnore("ActivityLifeCallBack", "onActivityResumed " + activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        MspLog.iIgnore("ActivityLifeCallBack", "onActivityStopped " + activity.getClass().getSimpleName());
    }
}
