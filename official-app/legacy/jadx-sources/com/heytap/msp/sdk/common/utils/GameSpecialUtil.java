package com.heytap.msp.sdk.common.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.common.log.MspLog;

/* JADX INFO: loaded from: classes19.dex */
public class GameSpecialUtil {
    private static final String TAG = "GameSpecialUtil";

    private static void tryEvokeMspApp(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        MspLog.iIgnore(TAG, "tryEvokeMspApp");
        if (SdkUtil.isInstallTargetVersionApp(context)) {
            MspLog.iIgnore(TAG, "tryEvokeMspApp, has installed app");
        } else if (com.heytap.msp.sdk.core.a.M().t(false) == null) {
            MspLog.w(TAG, "tryEvokeMspApp binder == null -> tryConnectAppForce");
            com.heytap.msp.sdk.core.a.M().X();
        }
    }

    public int checkProvider(Context context) {
        if (SdkUtil.isInstallTargetVersionApp(context)) {
            return 0;
        }
        return BaseSdkAgent.getInstance().getProviderType();
    }

    public void setGcActivity(Activity activity) {
        ActivityLifeCallBack.getInstance().setGcActivity(activity);
    }
}
