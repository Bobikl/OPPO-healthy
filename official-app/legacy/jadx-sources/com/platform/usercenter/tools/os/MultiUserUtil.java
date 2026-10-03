package com.platform.usercenter.tools.os;

import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.osdk.CompatUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class MultiUserUtil {
    private static final String TAG = "MultiUserUtil";

    @Deprecated
    public static long getSerialNumberForUser(Context context) {
        return 0L;
    }

    public static int getUserId() {
        return Process.myUid() / 100000;
    }

    public static String getUserType(Context context) {
        if (isPrimaryUser()) {
            return SecureGcmConstants.MESSAGE_KEY;
        }
        return isDemoUser(context) ? "D" : "S";
    }

    public static boolean isDemoUser(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null || !Version.hasNMR1()) {
            return false;
        }
        return userManager.isDemoUser();
    }

    public static boolean isGuestUser(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (CompatUtils.check(30, 1)) {
            try {
                return new com.oplus.wrapper.os.UserManager(userManager).isGuestUser();
            } catch (Throwable th) {
                UCLogUtil.e(UCBasicUtils.SDK_TAG, "MultiUserUtiladdon：" + th);
            }
        }
        if (userManager == null) {
            return false;
        }
        try {
            Method declaredMethod = userManager.getClass().getDeclaredMethod("isGuestUser", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(userManager, Integer.valueOf(getUserId()))).booleanValue();
        } catch (IllegalAccessException e2) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e2);
            return false;
        } catch (NoSuchMethodException e3) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e3);
            return false;
        } catch (InvocationTargetException e4) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e4);
            return false;
        }
    }

    public static boolean isPrimaryUser(Context context) {
        if (!Version.hasJellyBeanMR1()) {
            return true;
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (Version.hasM() && userManager != null) {
            return userManager.isSystemUser();
        }
        UserHandle userHandleMyUserHandle = Process.myUserHandle();
        if (CompatUtils.check(30, 1)) {
            try {
                return userHandleMyUserHandle.equals(com.oplus.wrapper.os.UserHandle.OWNER);
            } catch (Throwable th) {
                UCLogUtil.e(UCBasicUtils.SDK_TAG, "MultiUserUtiladdon：" + th);
            }
        }
        try {
            Field declaredField = UserHandle.class.getDeclaredField("OWNER");
            declaredField.setAccessible(true);
            return userHandleMyUserHandle.equals((UserHandle) declaredField.get(null));
        } catch (IllegalAccessException e2) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e2);
            return true;
        } catch (NoSuchFieldException e3) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e3);
            return true;
        }
    }

    public static boolean isSecondaryUser(Context context) {
        return !isPrimaryUser(context);
    }

    public static boolean isSecondaryUser() {
        return !isPrimaryUser();
    }

    public static boolean isPrimaryUser() {
        return getUserId() == 0;
    }
}
