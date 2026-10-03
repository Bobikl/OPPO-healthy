package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.mydevices.sdk.Constants;
import com.oplus.mydevices.sdk.DeviceSdk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class yxa {
    public static final String TAG = "LA.";
    public static List<Runnable> a = new CopyOnWriteArrayList();

    public static void b(Runnable runnable) {
        if (DeviceSdk.mApplicationContext != null) {
            runnable.run();
        } else {
            a.add(runnable);
        }
    }

    public static boolean c(Context context) {
        a7b.f(TAG, "[init]");
        if (!x94.b.a(context)) {
            a7b.b(TAG, "DeviceSdk ComponentEnabled is false!!!!");
            return false;
        }
        if (!d()) {
            a7b.f(TAG, "init: not install");
            return false;
        }
        if (DeviceSdk.mApplicationContext == null) {
            DeviceSdk.init(context, "com.heytap.health.WatchProvider");
            if (!a.isEmpty()) {
                ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.xxa
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxa.f();
                    }
                });
            }
        }
        if (e(context)) {
            a7b.f(TAG, "init: not support LinkageApp");
            return false;
        }
        jya.a();
        return true;
    }

    public static boolean d() {
        boolean z = false;
        try {
            if (b78.a().getPackageManager().getPackageInfo(Constants.PACKAGE_NAME_MY_DEVICE, 0) != null) {
                z = true;
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("not install ");
            sb.append(e2.getMessage());
        }
        a7b.f(TAG, "DeviceApp isInstalled:" + z);
        return z;
    }

    public static boolean e(Context context) {
        return !DeviceSdk.isMyDevicesSupportAudioLinkage();
    }

    public static /* synthetic */ void f() {
        Iterator<Runnable> it = a.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public static void g(Runnable runnable) {
        a.remove(runnable);
    }
}
