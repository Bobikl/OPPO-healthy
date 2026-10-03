package com.google.android.play.core.splitinstall;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SplitInstallHelper {
    public static final String a = "SplitInstallHelper";

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static void loadLibrary(@NonNull Context context, @NonNull String str) {
        OplusSplitInstallHelper.loadLibrary(context, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void loadResources(@NonNull Activity activity, @NonNull Resources resources) throws RuntimeException {
        OplusSplitInstallHelper.loadResources(activity, resources);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void loadResources(@NonNull Service service) {
        OplusSplitInstallHelper.loadResources(service);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void loadResources(@NonNull BroadcastReceiver broadcastReceiver, @NonNull Context context) {
        OplusSplitInstallHelper.loadResources(broadcastReceiver, context);
    }
}
