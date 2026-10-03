package com.heytap.accessory.platform;

import android.content.Context;
import android.content.Intent;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.base.logging.a;
import com.heytap.accessory.logging.LogSwitch;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FrameworkInitializer {
    private static final String TAG = "FrameworkInitializer";
    public static final /* synthetic */ int a = 0;
    private static boolean mSupportOaf = true;

    public static void init(Context context) {
        init(context, Boolean.TRUE);
    }

    public static boolean isSupportOaf() {
        return mSupportOaf;
    }

    public static void setSupportOaf(boolean z) {
        mSupportOaf = z;
    }

    public static void init(Context context, Boolean bool) {
        String str = TAG;
        a.c(str, "FrameworkInitializer init");
        LogSwitch.init(context);
        PlatformUtils.setContext(context);
        if (Initializer.useOAFApp(context) || !bool.booleanValue()) {
            a.c(str, "FS not support.");
        } else {
            context.startService(new Intent(context, (Class<?>) FrameworkService.class));
        }
    }
}
