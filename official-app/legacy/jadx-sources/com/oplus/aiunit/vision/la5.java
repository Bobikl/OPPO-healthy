package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class la5 {
    public static File a() {
        return new File(b78.b().getExternalCacheDir(), "glyphix_log");
    }

    public static void b(Context context, String str, String str2) {
        x0.d().b("/device_app_store/WatchAppCenterActivity").withString("OPERATE_MAC_ADDRESS", str).withString("OPERATE_BLE_MAC_ADDRESS", str2).navigation(context);
    }
}
