package com.heytap.accessory.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.heytap.accessory.Config;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: classes14.dex */
public final class SdkConfig {
    public static final String ACCESSORY_FRAMEWORK_PACKAGE = "com.heytap.accessory";
    public static final String ACCESSORY_FRAMEWORK_REQUEST_PACKAGE = "accessory_framework_request_package";
    public static final String EXTRA_KEY_FRAMEWORK_COMPATIBLE_VERSION = "framework_compatible_version";
    public static final int FRAMEWORK_COMPATIBLE_VERSION = 1;
    public static final String INTENT_BASE_FRAMEWORK_SERVICE = "com.heytap.accessory.action.BASE_FRAMEWORK_MANAGER";
    public static final String INTENT_FRAMEWORK_SERVICE = "com.heytap.accessory.action.FRAMEWORK_MANAGER";
    static final int PEER_FWK_FEATURE_NOT_AVAILABLE = 2;
    public static final String PERMISSION_ACCESSORY_FRAMEWORK = "com.heytap.accessory.permission.ACCESSORY_FRAMEWORK";
    private static final String STRING_ENCODING = "UTF-8";
    private static final String TAG = "SdkConfig";
    private static int sCompatibleFrameworkVersion = 1;
    private static int sFrameworkMaxFooterLen = 0;
    private static int sFrameworkMaxHeaderLen = 0;
    private static int sFrameworkMaxMsgHeaderLen = 0;
    private static int sFrameworkProcessId = 0;
    private static int sFrameworkVersion = 1;
    private static String sFrameworkVersionName = "";

    public SdkConfig(Context context) throws GeneralException {
        if (context == null) {
            throw new IllegalArgumentException("Invalid Context");
        }
        PackageManager packageManager = context.getPackageManager();
        if (!Initializer.useOAFApp(context)) {
            SdkLog.w(TAG, "is not AppMode,ignore");
            return;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.heytap.accessory", 0);
            if (packageInfo == null) {
                SdkLog.e(TAG, "Accessory Framework Not installed");
                throw new GeneralException(2, "Accessory Framework Not installed");
            }
            sFrameworkVersion = packageInfo.versionCode;
            sFrameworkVersionName = packageInfo.versionName;
            SdkLog.i(TAG, "Accessory Framework: " + packageInfo.versionName + " Accessory SDK: " + Config.getSdkVersionName());
            logCommitMessage();
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.e(TAG, "Accessory Framework Not installed");
            throw new GeneralException(2, "Accessory Framework Not installed");
        }
    }

    public static boolean checkAccessoryPermission(Context context) {
        String packageName = context.getPackageName();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                SdkLog.w(TAG, "Package Manager is null");
                return false;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 4096);
            if (packageInfo == null) {
                SdkLog.w(TAG, "PackageInfo is null");
                return false;
            }
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr == null) {
                return false;
            }
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    i = -1;
                    break;
                }
                if (PERMISSION_ACCESSORY_FRAMEWORK.equals(strArr[i])) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                SdkLog.w(TAG, "Accessory service permission not granted for Package" + packageName);
                return false;
            }
            SdkLog.i(TAG, "Accessory service permission available for Package" + packageName);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.e(TAG, "Admin Permission check failed for Package" + packageName);
            return false;
        }
    }

    public static int getCompatibleFrameworkVersion() {
        return sCompatibleFrameworkVersion;
    }

    public static int getFrameworkMaxFooterLength() {
        return sFrameworkMaxFooterLen;
    }

    public static int getFrameworkMaxHeaderLength() {
        return sFrameworkMaxHeaderLen;
    }

    public static int getFrameworkMaxMsgHeaderLength() {
        return sFrameworkMaxMsgHeaderLen;
    }

    public static int getFrameworkProcessId() {
        return sFrameworkProcessId;
    }

    public static int getFrameworkVersion() {
        return sFrameworkVersion;
    }

    public static String getFrameworkVersionName() {
        return sFrameworkVersionName;
    }

    public static String getStringEncoding() {
        return "UTF-8";
    }

    public static boolean isMexSupported() {
        return true;
    }

    public static void logCommitMessage() {
        SdkLog.i(TAG, "sdk version: commit id is 7a644c7 time is250930");
    }

    public static void setCompatibleFrameworkVersion(int i) {
        sCompatibleFrameworkVersion = i;
    }

    public static void setFrameworkMaxFooterLength(int i) {
        sFrameworkMaxFooterLen = i;
    }

    public static void setFrameworkMaxHeaderLength(int i) {
        sFrameworkMaxHeaderLen = i;
    }

    public static void setFrameworkMaxMsgHeaderLength(int i) {
        sFrameworkMaxMsgHeaderLen = i;
    }

    public static void setFrameworkProcessId(int i) {
        sFrameworkProcessId = i;
    }
}
