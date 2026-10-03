package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.drs.base.util.SystemPropertiesCompat;

/* JADX INFO: loaded from: classes6.dex */
public class dui {
    public static Context a(Context context) {
        boolean zB = b();
        z6b.q("StorageContextUtils", "isFbe:" + zB);
        return zB ? context.createDeviceProtectedStorageContext() : context;
    }

    public static boolean b() {
        return Const.Scheme.SCHEME_FILE.equals(SystemPropertiesCompat.get("ro.crypto.type"));
    }
}
