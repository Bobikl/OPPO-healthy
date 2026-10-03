package com.oplus.accountsdk.service.sdk;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.account.net.beans.AcCheckUpgradeResponse;
import com.oplus.aiunit.vision.qi;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcCheckUpgradeUtil {
    private static final String TAG = "AcCheckUpgradeUtil";
    public static final String TYPE_CHILD = "child";
    public static final String TYPE_NORMAL = "normal";
    private static final String UPGRADE_GUDIE_REF_CLASS_NAME = "com.oplus.usercenter.util.AcLaunchUpgradeGuideUtil";
    private static final String UPGRADE_GUDIE_REF_METHOD_NAME = "intentToUpgradeGuideActivity";

    public static Method findIntentUpgradeGuideMethod() {
        try {
            return qi.c(UPGRADE_GUDIE_REF_CLASS_NAME, UPGRADE_GUDIE_REF_METHOD_NAME, Context.class, String.class, String.class, String.class, String.class, String.class, String.class);
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "findIntentUpgradeGuideMethod error  = " + e2);
            return null;
        }
    }

    public static void intentToUpgradeGuideActivity(Method method, @NonNull Context context, AcCheckUpgradeResponse acCheckUpgradeResponse) {
        if (method != null) {
            try {
                method.invoke(null, context, acCheckUpgradeResponse.getMainTitle(), acCheckUpgradeResponse.getSubTitle(), acCheckUpgradeResponse.getUpgradeContent(), acCheckUpgradeResponse.getButContent(), acCheckUpgradeResponse.getJumpLink(), acCheckUpgradeResponse.getOverseaJumpLink());
            } catch (Exception e2) {
                AcLogUtil.w(TAG, "intentToUpgradeGuideActivity error  = " + e2);
                return;
            }
        }
        AcLogUtil.i(TAG, "intentToUpgradeGuideActivity, method = " + method);
    }
}
