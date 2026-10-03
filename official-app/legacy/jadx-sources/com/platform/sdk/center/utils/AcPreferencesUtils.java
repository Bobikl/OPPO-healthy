package com.platform.sdk.center.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class AcPreferencesUtils {
    public static final String LOGIN_POP_VIEW_COUNT = "login_pop_view_count";
    public static final String LOGIN_POP_VIEW_TIME = "login_pop_view_time";
    private static final String SHARED_PREFERENCES_NAME_USER = "user_info";
    public static final String TIPS_VIEW_SHOW_TIME = "tips_view_show_time";
    public static final String TIPS_VIEW_STATUS = "tips_view_status";
    public static final String UN_LOGIN_POP_VIEW_COUNT = "un_login_pop_view_count";
    public static final String UN_LOGIN_POP_VIEW_TIME = "un_login_pop_view_time";
    private static SharedPreferences.Editor mEditor;
    private static SharedPreferences mSharedPreferences;
    private static SharedPreferences mSp;

    public static void clear(Context context) {
        getUpdateSharedPreferences(context).edit().clear().apply();
    }

    private static boolean getBooleanValue(Context context, String str, boolean z) {
        return getUpdateSharedPreferences(context).getBoolean(str, z);
    }

    private static SharedPreferences.Editor getEditor(Context context) {
        if (mEditor == null) {
            mEditor = getPackageSharedPreferences(context).edit();
        }
        return mEditor;
    }

    private static int getIntValue(Context context, String str, int i) {
        return getUpdateSharedPreferences(context).getInt(str, i);
    }

    public static int getLoginPopViewCount(Context context) {
        return getIntValue(context, LOGIN_POP_VIEW_COUNT, 0);
    }

    public static long getLoginPopViewTime(Context context) {
        return getLongValue(context, LOGIN_POP_VIEW_TIME, 0L).longValue();
    }

    private static Long getLongValue(Context context, String str, long j2) {
        return Long.valueOf(getUpdateSharedPreferences(context).getLong(str, j2));
    }

    private static SharedPreferences getPackageSharedPreferences(Context context) {
        if (mSp == null) {
            mSp = context.getApplicationContext().getSharedPreferences(context.getApplicationContext().getPackageName() + "_suffix_usercenter_sharepreference", 0);
        }
        return mSp;
    }

    public static String getString(Context context, String str) {
        return getString(context, str, null);
    }

    private static String getStringValue(Context context, String str, String str2) {
        return getUpdateSharedPreferences(context).getString(str, str2);
    }

    public static long getTipsViewShowTime(Context context) {
        return getLongValue(context, TIPS_VIEW_SHOW_TIME, 0L).longValue();
    }

    public static boolean getTipsViewStatus(Context context) {
        return getBooleanValue(context, TIPS_VIEW_STATUS, false);
    }

    public static int getUnLoginPopViewCount(Context context) {
        return getIntValue(context, UN_LOGIN_POP_VIEW_COUNT, 0);
    }

    public static long getUnLoginPopViewTime(Context context) {
        return getLongValue(context, UN_LOGIN_POP_VIEW_TIME, 0L).longValue();
    }

    private static SharedPreferences getUpdateSharedPreferences(Context context) {
        Context applicationContext;
        if (mSharedPreferences == null && context != null && (applicationContext = context.getApplicationContext()) != null) {
            mSharedPreferences = applicationContext.getSharedPreferences(SHARED_PREFERENCES_NAME_USER, 0);
        }
        return mSharedPreferences;
    }

    private static void putBooleanValue(Context context, String str, boolean z) {
        getUpdateSharedPreferences(context).edit().putBoolean(str, z).apply();
    }

    private static void putIntValue(Context context, String str, int i) {
        getUpdateSharedPreferences(context).edit().putInt(str, i).apply();
    }

    private static void putLongValue(Context context, String str, long j2) {
        getUpdateSharedPreferences(context).edit().putLong(str, j2).apply();
    }

    private static void putStringValue(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = getUpdateSharedPreferences(context).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    private static void removeValue(Context context, String str) {
        getUpdateSharedPreferences(context).edit().remove(str).apply();
    }

    public static void setLoginPopViewCount(Context context, int i) {
        putIntValue(context, LOGIN_POP_VIEW_COUNT, i);
    }

    public static void setLoginPopViewTime(Context context, long j2) {
        putLongValue(context, LOGIN_POP_VIEW_TIME, j2);
    }

    public static void setString(Context context, String str, String str2) {
        getEditor(context).putString(str, str2).apply();
    }

    public static void setTipsViewShowTime(Context context, long j2) {
        putLongValue(context, TIPS_VIEW_SHOW_TIME, j2);
    }

    public static void setTipsViewStatus(Context context, boolean z) {
        putBooleanValue(context, TIPS_VIEW_STATUS, z);
    }

    public static void setUnLoginPopViewCount(Context context, int i) {
        putIntValue(context, UN_LOGIN_POP_VIEW_COUNT, i);
    }

    public static void setUnLoginPopViewTime(Context context, long j2) {
        putLongValue(context, UN_LOGIN_POP_VIEW_TIME, j2);
    }

    public static String getString(Context context, String str, String str2) {
        if (context != null) {
            return getPackageSharedPreferences(context).getString(str, str2);
        }
        UCLogUtil.i(" param: context is null");
        return "";
    }
}
