package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.drs.base.util.SystemProperty;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;

/* JADX INFO: loaded from: classes19.dex */
public final class a07 {
    public static Context a(Context context) {
        TrackLogger.c("FBE", "currentBuildVersion is " + Build.VERSION.SDK_INT + ", isFBEVersion:" + b(), new Object[0]);
        return b() ? context.createDeviceProtectedStorageContext() : context;
    }

    public static boolean b() {
        return Const.Scheme.SCHEME_FILE.equals(SystemProperty.get("ro.crypto.type"));
    }
}
