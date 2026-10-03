package com.platform.usercenter.tools.sim;

import android.content.Context;
import com.oplus.wrapper.telephony.SubscriptionManager;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;
import com.platform.usercenter.tools.osdk.CompatUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes9.dex */
class SubscriptionManagerUtils {
    private static final String TAG = "SubscriptionManagerUtils";

    public static long[] getSubId21(Context context, int i) {
        if (CompatUtils.check(30, 1)) {
            try {
                return intConvertLong(SubscriptionManager.getSubId(i));
            } catch (Exception e2) {
                UCLogUtil.e(UCBasicUtils.SDK_TAG, "SubscriptionManagerUtilsaddon：" + e2);
            }
        }
        try {
            Constructor<?> constructor = Class.forName("android.telephony.SubscriptionManager").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            return (long[]) objNewInstance.getClass().getDeclaredMethod("getSubId", Integer.TYPE).invoke(objNewInstance, Integer.valueOf(i));
        } catch (Exception e3) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e3);
            return null;
        }
    }

    public static int[] getSubIdAfter21(Context context, int i) {
        if (!Version.hasL_MR1()) {
            return null;
        }
        if (CompatUtils.check(30, 1)) {
            try {
                return SubscriptionManager.getSubId(i);
            } catch (Throwable th) {
                UCLogUtil.e(UCBasicUtils.SDK_TAG, "SubscriptionManagerUtilsaddon：" + th);
            }
        }
        try {
            android.telephony.SubscriptionManager subscriptionManager = (android.telephony.SubscriptionManager) context.getSystemService("telephony_subscription_service");
            if (subscriptionManager != null && Version.hasL_MR1()) {
                return Version.hasQ() ? subscriptionManager.getSubscriptionIds(i) : (int[]) subscriptionManager.getClass().getDeclaredMethod("getSubId", Integer.TYPE).invoke(subscriptionManager, Integer.valueOf(i));
            }
            return null;
        } catch (Exception e2) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e2);
            return null;
        }
    }

    private static long[] intConvertLong(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return new long[0];
        }
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }
}
