package com.lifesense.weidong.lzsimplenetlibs.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ApplicationHolder {
    public static final String TAG = "ApplicationHolder";
    public static String appVersionFullName;
    public static String appVersionName;
    public static Context mApplication;
    public static String mCurrentUserName;
    public static int mMaxBitmapHeight;
    public static int mMaxBitmapWidth;
    public static Handler mainHanlder = new Handler(Looper.getMainLooper());
    public static String sChannel = null;
    public static Handler threadHandler;

    public static String getAppMetaData(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return bundle.getString(str);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getAppVersionFullName() {
        return getmApplication() == null ? "" : getPackageInfo(getmApplication(), getmApplication().getPackageName()).versionName;
    }

    public static String getAppVersionName() {
        String appVersionFullName2 = getAppVersionFullName();
        return appVersionFullName2.contains("(") ? appVersionFullName2.split("\\(")[0] : appVersionFullName2;
    }

    public static String getApplicationId() {
        return getmApplication() != null ? getmApplication().getPackageName() : "null";
    }

    public static Handler getMainHandler() {
        return mainHanlder;
    }

    public static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Handler getWorkerRunnable() {
        return threadHandler;
    }

    public static Context getmApplication() {
        return mApplication;
    }

    public static String getmCurrentUserName() {
        return mCurrentUserName;
    }

    public static int getmMaxBitmapHeight() {
        return mMaxBitmapHeight;
    }

    public static int getmMaxBitmapWidth() {
        return mMaxBitmapWidth;
    }

    public static void postMainRunner(Runnable runnable) {
        mainHanlder.post(runnable);
    }

    public static void postWorkerRunnable(Runnable runnable) {
        threadHandler.post(runnable);
    }

    public static void setmApplication(Context context) {
        if (context == null) {
            return;
        }
        if (context != mApplication) {
            mApplication = context;
        }
        if (threadHandler == null) {
            HandlerThread handlerThread = new HandlerThread(ApplicationHolder.class.getName());
            handlerThread.start();
            threadHandler = new Handler(handlerThread.getLooper());
        }
    }

    public static void setmCurrentUserName(String str) {
        mCurrentUserName = str;
    }

    public static void setmMaxBitmapHeight(int i) {
        if (mMaxBitmapHeight != i) {
            mMaxBitmapHeight = i;
        }
    }

    public static void setmMaxBitmapWidth(int i) {
        if (mMaxBitmapWidth != i) {
            mMaxBitmapWidth = i;
        }
    }

    public static PackageInfo getPackageInfo(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
