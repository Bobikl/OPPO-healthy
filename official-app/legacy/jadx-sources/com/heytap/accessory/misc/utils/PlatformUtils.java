package com.heytap.accessory.misc.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.heytap.accessory.utils.HexUtils;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes14.dex */
public class PlatformUtils {
    public static final String ACCESSORY_PREFS = "AccessoryPreferences";
    private static final int ANDROID_M_VERSION = 23;
    private static final String BUILD_TYPE_USER = "user";
    public static final String CURRENT_VERSION = "current_version";
    public static final String DATABASE_NAME = "Accessory.db";
    private static final int HEADER_BIT_MASK_DEVICEID = 1;
    public static final String KEY_DATA_MIGRATED = "data_migrated";
    public static final int MAX_AFP_FOOTER_LEN = 2;
    public static final int MAX_AFP_HEADER_LEN = 8;
    private static final int NETWORK_TYPE_DEFAULT = 0;
    private static final int NETWORK_TYPE_WIFI = 0;
    public static final String OPLUS_PEERID_PREFIX = "OPLUS_ACCESSARY_";
    public static final String PEERID_PREFIX = "OAFP_";
    public static final String PERMISSION_PREFS = "PermissionPreferences";
    public static final String PREFERENCES_FILES = "RemoteAddressPreferences";
    public static final String SECURITY_PREFS = "SecurityPreferences";
    public static final String STREAM_PREFS = "StreamPreferences";
    private static final int SUB_LENGTH = 5;
    private static final String TAG = "PlatformUtils";
    public static final String VERSION_PREFS = "VersionPreferences";
    public static int sBuildVersion = 0;
    public static Context sContext = null;
    public static String sMyUniqueId = null;
    private static String sSapProcessName = null;
    private static String sSapSharedUserId = null;
    private static long sSapSocketAccessTime = -1;
    private static int sSapVersionCode;
    private static String sSapVersionName;

    public interface a {
        void a();

        void b();
    }

    public static boolean checkCurrentVersion(Context context) {
        int i;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            com.heytap.accessory.base.logging.a.e(TAG, "checkCurrentVersion Exception:" + e2);
            i = 0;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(VERSION_PREFS, 0);
        if (sharedPreferences.getInt(CURRENT_VERSION, 0) >= i) {
            return false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(CURRENT_VERSION, i);
        editorEdit.apply();
        return true;
    }

    public static String getAddrforLog(String str) {
        return TextUtils.isEmpty(str) ? "empty_addr" : HexUtils.hideAddress(str);
    }

    public static byte[] getApplicationCertificate(String str) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                com.heytap.accessory.base.logging.a.e(TAG, "PackageInfo was null!");
                return null;
            }
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray())).getPublicKey().getEncoded();
            }
            com.heytap.accessory.base.logging.a.e(TAG, "Signature obtained was null!");
            return null;
        } catch (PackageManager.NameNotFoundException | CertificateException e2) {
            com.heytap.accessory.base.logging.a.e(TAG, "getApplicationCertificate Exception:" + e2);
            return null;
        }
    }

    public static Context getContext() {
        return sContext;
    }

    public static int getCurrentVersion() {
        return getSharedPreferences(VERSION_PREFS, 0).getInt(CURRENT_VERSION, 0);
    }

    public static Context getDefaultStorageContext() {
        Context context = sContext;
        return context != null ? context.createDeviceProtectedStorageContext() : context;
    }

    public static byte getDevCategory() {
        return (byte) 8;
    }

    public static String getMyUniqueId() {
        String str = sMyUniqueId;
        if (str == null || str.isEmpty()) {
            String strC = f.c();
            sMyUniqueId = strC;
            if (strC == null || strC.isEmpty()) {
                sMyUniqueId = f.a();
                f.e();
            }
            if (!isUserBinary()) {
                com.heytap.accessory.base.logging.a.c(TAG, "Unique PeerId generated: " + sMyUniqueId);
            }
        }
        return sMyUniqueId;
    }

    public static String getPeerId(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            com.heytap.accessory.base.logging.a.e(TAG, "peerId is empty.");
            return null;
        }
        if (isPeerIdValid(str)) {
            return str;
        }
        com.heytap.accessory.sdp.endpoint.d.a aVarB = e.b(str, i, i2);
        com.heytap.accessory.base.logging.a.a(TAG, "peerId is invalid. create a new id:" + aVarB + ", peerId:" + str);
        if (aVarB != null) {
            return aVarB.a();
        }
        return null;
    }

    public static com.heytap.accessory.sdp.endpoint.d.a getPeerParams(String str, int i, int i2) {
        if (str != null) {
            return e.b(str, i, i2);
        }
        com.heytap.accessory.base.logging.a.e(TAG, "NULL address received!");
        return null;
    }

    public static SharedPreferences getSharedPreferences(String str, int i) {
        return getDefaultStorageContext().getSharedPreferences(str, i);
    }

    public static String getUniqueClientVal(int i, String str) {
        return i + "_" + str;
    }

    public static int getsBuildVersion() {
        return sBuildVersion;
    }

    public static String getsSapVersionName() {
        return sSapVersionName;
    }

    public static void initialise(Context context) {
        sContext = context;
        sBuildVersion = Build.VERSION.SDK_INT;
        migrateToDeviceProtectedStorage();
        f.d();
        e.b();
        PlatformPermissionUtils.f();
        try {
            if (sSapProcessName == null) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo == null) {
                    com.heytap.accessory.base.logging.a.e(TAG, "initialise(): AFP package info is null!");
                    return;
                }
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo == null) {
                    com.heytap.accessory.base.logging.a.e(TAG, "initialise(): AFP package app info is null!");
                    return;
                }
                sSapProcessName = applicationInfo.processName;
                sSapSharedUserId = packageInfo.sharedUserId;
                sSapVersionCode = packageInfo.versionCode;
                sSapVersionName = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            com.heytap.accessory.base.logging.a.e(TAG, "initialise Exception:" + e2);
        }
    }

    public static boolean isApiLevelBelowMarshMallow() {
        return false;
    }

    public static boolean isApiLevelBelowNougat() {
        return false;
    }

    public static boolean isClientInAFPProcess(int i) {
        return i == Process.myPid();
    }

    public static boolean isOplusDevice() {
        return f.a;
    }

    public static boolean isPackageEnabled(String str) {
        try {
            int applicationEnabledSetting = getContext().getPackageManager().getApplicationEnabledSetting(str);
            return applicationEnabledSetting == 0 || applicationEnabledSetting == 1;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean isPeerIdValid(String str) {
        return str.contains(OPLUS_PEERID_PREFIX) || str.contains(PEERID_PREFIX);
    }

    public static boolean isRuntimePermissionAcquired() {
        Context context = getContext();
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 31) {
            if (context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == -1) {
                com.heytap.accessory.base.logging.a.e(TAG, "Lack of runtime permission: BLUETOOTH_CONNECT");
                z = false;
            }
            if (context.checkSelfPermission("android.permission.BLUETOOTH_SCAN") == -1) {
                com.heytap.accessory.base.logging.a.e(TAG, "Lack of runtime permission: BLUETOOTH_SCAN");
                z = false;
            }
            if (context.checkSelfPermission("android.permission.BLUETOOTH_ADVERTISE") == -1) {
                com.heytap.accessory.base.logging.a.e(TAG, "Lack of runtime permission: BLUETOOTH_ADVERTISE");
                return false;
            }
        } else {
            if (context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1) {
                com.heytap.accessory.base.logging.a.e(TAG, "Lack of runtime permission: ACCESS_FINE_LOCATION");
                z = false;
            }
            if (context.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == -1) {
                com.heytap.accessory.base.logging.a.e(TAG, "Lack of runtime permission: ACCESS_BACKGROUND_LOCATION");
                return false;
            }
        }
        return z;
    }

    public static boolean isUserBinary() {
        return BUILD_TYPE_USER.equals(Build.TYPE);
    }

    @RequiresApi(api = 24)
    private static void migrateToDeviceProtectedStorage() {
        if (getSharedPreferences(ACCESSORY_PREFS, 0).getBoolean(KEY_DATA_MIGRATED, false)) {
            return;
        }
        com.heytap.accessory.base.logging.a.a(TAG, "Migrating data to device protected storage");
        Context defaultStorageContext = getDefaultStorageContext();
        defaultStorageContext.moveSharedPreferencesFrom(sContext, ACCESSORY_PREFS);
        defaultStorageContext.moveSharedPreferencesFrom(sContext, PERMISSION_PREFS);
        defaultStorageContext.moveSharedPreferencesFrom(sContext, SECURITY_PREFS);
        defaultStorageContext.moveSharedPreferencesFrom(sContext, PREFERENCES_FILES);
        defaultStorageContext.moveDatabaseFrom(sContext, DATABASE_NAME);
        SharedPreferences.Editor editorEdit = getSharedPreferences(ACCESSORY_PREFS, 0).edit();
        editorEdit.putBoolean(KEY_DATA_MIGRATED, true);
        editorEdit.apply();
    }

    public static void printStackTrace(Throwable th) {
        com.heytap.accessory.base.logging.a.b(TAG, th.getClass().getName() + ": " + th.getMessage());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            com.heytap.accessory.base.logging.a.b(TAG, "at " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")");
        }
    }

    public static void setContext(Context context) {
        sContext = context;
    }

    public static void updateSapSocketAccessTime() {
        sSapSocketAccessTime = System.currentTimeMillis();
    }
}
