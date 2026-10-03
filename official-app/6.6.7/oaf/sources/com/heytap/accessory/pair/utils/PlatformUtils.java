package com.heytap.accessory.pair.utils;

import android.content.Context;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PlatformUtils {
    public static final String SECURITY_PREFS = "fast_pair_sdk_preferences";

    public static Context getDefaultStorageContext() {
        return e88.a().createDeviceProtectedStorageContext();
    }

    public static fdg getPrivateSharedPreferences() {
        return fdg.x(SECURITY_PREFS);
    }
}
