package com.example.opponotificationrelay;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/** Changes task metadata only; never removes a task or stops a service. */
public final class RecentsVisibility extends Application implements Application.ActivityLifecycleCallbacks {
    private static final String KEY="hide_recent_task";
    public static boolean enabled(Context c) {return RelayConfig.getPrefs(c).getBoolean(KEY,false);}
    public static void set(Context c,boolean hide) {
        RelayConfig.getPrefs(c).edit().putBoolean(KEY,hide).apply();
        apply(c);
    }
    public static void apply(Context c) {
        try {
            ActivityManager manager=(ActivityManager)c.getSystemService(Context.ACTIVITY_SERVICE);
            if(manager!=null) for(ActivityManager.AppTask task:manager.getAppTasks())
                task.setExcludeFromRecents(enabled(c));
        } catch(RuntimeException e) {FileLogger.w("RecentsVisibility","系统未接受最近任务显示设置");}
    }
    @Override public void onCreate() {super.onCreate();registerActivityLifecycleCallbacks(this);AppLabelCache.install(this);}
    @Override public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if(level>=TRIM_MEMORY_UI_HIDDEN){AppLabelCache.clear();AppIconStore.trim();RelayStore.flush();}
    }
    @Override public void onActivityCreated(Activity a,Bundle b) {apply(a);}
    @Override public void onActivityResumed(Activity a) {apply(a);}
    @Override public void onActivityStopped(Activity a) {apply(a);RelayStore.flush();}
    @Override public void onActivityStarted(Activity a) { }
    @Override public void onActivityPaused(Activity a) { }
    @Override public void onActivitySaveInstanceState(Activity a,Bundle b) { }
    @Override public void onActivityDestroyed(Activity a) { }
}
