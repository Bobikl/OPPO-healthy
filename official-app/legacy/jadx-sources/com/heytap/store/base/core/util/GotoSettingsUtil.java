package com.heytap.store.base.core.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.heytap.msp.push.a;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.heytap.store.base.core.ativitylifecycle.ActivityCollectionManager;

/* JADX INFO: loaded from: classes3.dex */
public class GotoSettingsUtil {
    public static void goIntentSetting(Context context) {
        com.heytap.store.platform.tools.GotoSettingsUtil.goIntentSetting(context);
    }

    public static void goToPermission(Context context) {
        com.heytap.store.platform.tools.GotoSettingsUtil.goToPermission(context);
    }

    public static void goToSettings(final Context context) {
        if (!DeviceInfoUtil.isThreeBrand() || !a.c(context)) {
            com.heytap.store.platform.tools.GotoSettingsUtil.goToSettings(context);
            return;
        }
        Activity topActivity = context instanceof Activity ? (Activity) context : ActivityCollectionManager.INSTANCE.getInstance().getTopActivity();
        if (topActivity == null) {
            com.heytap.store.platform.tools.GotoSettingsUtil.goToSettings(context);
            return;
        }
        try {
            a.f(topActivity, new INotificationPermissionCallback() { // from class: com.heytap.store.base.core.util.GotoSettingsUtil.1
                @Override // com.heytap.msp.push.callback.INotificationPermissionCallback
                public void onFail(int i, String str) {
                    Log.d("GotoSettingsUtil", "requestNotificationAdvance onFail code " + i + ",msg " + str);
                    a.a();
                    if (i == 1000 || i == 1001 || i == 2003) {
                        return;
                    }
                    com.heytap.store.platform.tools.GotoSettingsUtil.goToSettings(context);
                }

                @Override // com.heytap.msp.push.callback.INotificationPermissionCallback
                public void onSuccess() {
                    a.a();
                }
            }, 0);
        } catch (Throwable unused) {
            com.heytap.store.platform.tools.GotoSettingsUtil.goToSettings(context);
        }
    }
}
