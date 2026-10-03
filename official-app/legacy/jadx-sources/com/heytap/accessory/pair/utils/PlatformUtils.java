package com.heytap.accessory.pair.utils;

import android.content.Context;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.v9g;

/* JADX INFO: loaded from: classes14.dex */
public class PlatformUtils {
    public static final String SECURITY_PREFS = "fast_pair_sdk_preferences";

    public static Context getDefaultStorageContext() {
        return b78.a().createDeviceProtectedStorageContext();
    }

    public static v9g getPrivateSharedPreferences() {
        return v9g.x(SECURITY_PREFS);
    }
}
