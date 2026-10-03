package com.heytap.accessory;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.platform.FrameworkInitializer;
import com.heytap.accessory.utils.SdkConfig;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class Initializer {
    private static final String CONFIG_USE_SYSTEM_OAF = "ConfigUseSystemOAF";
    private static final boolean DEFAULT_USE_SYSTEM_OAF = true;
    private static final String FW_SERVICE = "com.heytap.accessory.action.FRAMEWORK_MANAGER";
    private static final String INIT_CLASS = "com.heytap.accessory.platform.FrameworkInitializer";
    private static final String INIT_METHOD = "init";
    private static final int OAF_FEATURE_11_2_SUPPORT_WATCH_VERION = 20214;
    private static final int OAF_FEATURE_11_3_MIN_VERION = 20300;
    private static final int OAF_FEATURE_11_3_SUPPORT_WATCH_VERION = 20307;
    private static final int OAF_FEATURE_12_1_1_MIN_VERSION = 20600;
    private static final int OAF_FEATURE_12_1_1_SUPPORT_SWITCH_VERSION = 20605;
    private static final int OAF_FEATURE_12_1_MIN_VERSION = 20500;
    private static final int OAF_FEATURE_12_1_SUPPORT_SWITCH_VERSION = 20525;
    private static final int OAF_FEATURE_12_SUPPORT_SWITCH_VERSION = 20438;
    private static final int OAF_FEATURE_12_SUPPORT_WATCH_VERSION = 20400;
    private static final String TAG = "Initializer";
    private static volatile boolean hasInitFramework = false;
    private static SdkConfig mSdkConfig = null;
    private static Context sContext = null;
    private static volatile boolean sUseOAFApp = false;

    private Initializer() {
    }

    public static void clearSdkConfig() {
        if (mSdkConfig != null) {
            mSdkConfig = null;
        }
    }

    private static boolean getAppsOafSwitchFromMetaData(Context context) {
        String oafSwitchMetaData = getOafSwitchMetaData(context);
        if (oafSwitchMetaData == null) {
            SdkLog.e(TAG, "oafSwitchMetaDataImpl is null");
            return DEFAULT_USE_SYSTEM_OAF;
        }
        String[] strArrSplit = oafSwitchMetaData.split("#");
        if (strArrSplit.length != 2) {
            SdkLog.e(TAG, "wrong configs with length:" + strArrSplit.length);
            return DEFAULT_USE_SYSTEM_OAF;
        }
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SdkLog.e(TAG, "wrong configs impl or function");
            return DEFAULT_USE_SYSTEM_OAF;
        }
        try {
            String str3 = TAG;
            SdkLog.i(str3, "implClass:" + str + ",function:" + str2);
            Boolean bool = (Boolean) Class.forName(str).getDeclaredMethod(str2, Context.class).invoke(null, context);
            if (bool != null) {
                SdkLog.i(str3, "getAppsOafSwitchFromMetaData by reflection:" + bool);
                hasInitFramework = DEFAULT_USE_SYSTEM_OAF;
                sUseOAFApp = bool.booleanValue();
                return bool.booleanValue();
            }
        } catch (Exception e) {
            SdkLog.e(TAG, "invoke failed! " + e, e);
        }
        return DEFAULT_USE_SYSTEM_OAF;
    }

    private static String getOafSwitchMetaData(Context context) {
        Bundle bundle;
        if (context == null) {
            return null;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), Barcode.FORMAT_ITF).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            SdkLog.e(TAG, "NameNotFoundException:" + e);
            bundle = null;
        }
        if (bundle == null) {
            SdkLog.e(TAG, "no meta data");
            return null;
        }
        String string = bundle.getString(CONFIG_USE_SYSTEM_OAF);
        if (string != null) {
            return string;
        }
        SdkLog.e(TAG, "No meta data found with key: ConfigUseSystemOAF in " + context.getPackageName());
        return null;
    }

    public static boolean hasOAFSwitchFeature(Context context) {
        try {
            int i = context.getPackageManager().getPackageInfo("com.heytap.accessory", 0).versionCode;
            boolean z = ((i < OAF_FEATURE_12_SUPPORT_SWITCH_VERSION || i >= OAF_FEATURE_12_1_MIN_VERSION) && (i < OAF_FEATURE_12_1_SUPPORT_SWITCH_VERSION || i >= OAF_FEATURE_12_1_1_MIN_VERSION) && i < OAF_FEATURE_12_1_1_SUPPORT_SWITCH_VERSION) ? false : DEFAULT_USE_SYSTEM_OAF;
            SdkLog.i(TAG, "hasOAFSwitchFeature:" + z + " versionCode:" + i);
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.w(TAG, "useSystemOAF: not find OAF");
            return false;
        }
    }

    public static void initAFMAccessory(Context context) throws SdkUnsupportedException {
        if (!useOAFApp(context)) {
            SdkLog.w(TAG, "is not AppMode,ignore");
            return;
        }
        if (context == null) {
            throw new IllegalArgumentException("Illegal argument: context");
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.accessory", 0);
            int i = packageInfo == null ? -1 : packageInfo.versionCode;
            SdkLog.i(TAG, "AF version: " + i);
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.e(TAG, "AF not installed");
            throw new SdkUnsupportedException("AF not installed", 2);
        }
    }

    public static void initBufferPool(Context context) throws SdkUnsupportedException {
        if (context == null) {
            throw new IllegalArgumentException("Illegal argument: context");
        }
        if (mSdkConfig == null) {
            try {
                mSdkConfig = new SdkConfig(context);
                SdkLog.d(TAG, "Initializing AF");
                BufferPool.initialise(context);
            } catch (GeneralException e) {
                throw new SdkUnsupportedException(e.getMessage(), e.getErrorCode());
            }
        }
    }

    @RequiresApi(api = 19)
    public static void initFramework(Context context, boolean z) {
        initFramework(context, z, DEFAULT_USE_SYSTEM_OAF);
    }

    public static boolean useOAFApp(Context context) {
        return hasInitFramework ? sUseOAFApp : getAppsOafSwitchFromMetaData(context);
    }

    public static boolean useSystemOAF4Watch(Context context) {
        try {
            int i = context.getPackageManager().getPackageInfo("com.heytap.accessory", 0).versionCode;
            boolean z = ((i <= OAF_FEATURE_11_2_SUPPORT_WATCH_VERION || i >= OAF_FEATURE_11_3_MIN_VERION) && i < OAF_FEATURE_11_3_SUPPORT_WATCH_VERION) ? false : DEFAULT_USE_SYSTEM_OAF;
            SdkLog.i(TAG, "useSystemOAF: versionCode=" + i + " support=" + z);
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.w(TAG, "useSystemOAF: not find OAF");
            return false;
        }
    }

    @RequiresApi(api = 19)
    public static void initFramework(Context context, boolean z, boolean z2) {
        SdkLog.i(TAG, context.getPackageName() + " is useOAFApp:" + z);
        sContext = context.getApplicationContext();
        sUseOAFApp = z;
        hasInitFramework = DEFAULT_USE_SYSTEM_OAF;
        if (z) {
            return;
        }
        try {
            int i = FrameworkInitializer.a;
            FrameworkInitializer.class.getDeclaredMethod(INIT_METHOD, Context.class, Boolean.class).invoke(FrameworkInitializer.class, sContext, Boolean.valueOf(z2));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            SdkLog.w(TAG, "initFramework Exception," + e);
        }
    }
}
