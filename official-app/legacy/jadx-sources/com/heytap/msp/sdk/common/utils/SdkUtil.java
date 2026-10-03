package com.heytap.msp.sdk.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.msp.bean.CommonRequestInfo;
import com.heytap.msp.bean.GlobalConfig;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.BuildConfig;
import com.heytap.msp.sdk.base.common.BrandConstant;
import com.heytap.msp.sdk.base.common.Constants;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.common.util.AppUtils;
import com.heytap.msp.sdk.base.common.util.DeviceUtils;
import com.heytap.msp.sdk.base.common.util.SensitiveInfoUtils;
import com.heytap.msp.sdk.base.common.util.SharedPreferencesHelper;
import com.heytap.msp.sdk.bean.CompatibleInfo;
import com.heytap.store.base.core.util.OSUtils;
import com.oplus.aiunit.vision.ooi;
import com.oplus.aiunit.vision.poi;
import com.oplus.smartenginehelper.ParserTag;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class SdkUtil {
    private static final String ANONYMOUS_ID = "anonymousID";
    private static String CACHE_OUID = "";
    private static final int FIRST_VERSION_CODE_HAS_CORE_ACTIVITY = 208;
    private static final String OUID = "ouid";
    private static final String SP_FILE_NAME_OPENID = "openid";
    private static final String TAG = "SdkUtil";

    /* JADX INFO: renamed from: com.heytap.msp.sdk.common.utils.SdkUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$heytap$msp$sdk$base$common$Constants$CompatibleInfo$KeyType;

        static {
            int[] iArr = new int[Constants.CompatibleInfo.KeyType.values().length];
            $SwitchMap$com$heytap$msp$sdk$base$common$Constants$CompatibleInfo$KeyType = iArr;
            try {
                iArr[Constants.CompatibleInfo.KeyType.Record.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$heytap$msp$sdk$base$common$Constants$CompatibleInfo$KeyType[Constants.CompatibleInfo.KeyType.Record_Time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$heytap$msp$sdk$base$common$Constants$CompatibleInfo$KeyType[Constants.CompatibleInfo.KeyType.Expire.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$heytap$msp$sdk$base$common$Constants$CompatibleInfo$KeyType[Constants.CompatibleInfo.KeyType.Route.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    private static String getAnonymousId(Context context) {
        String applicationAnonymousId = "";
        try {
            SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(context, "openid", 0);
            String str = (String) sharedPreferencesHelper.getValue(ANONYMOUS_ID, "");
            try {
                if (str.matches("^[0-9a-zA-Z]+$")) {
                    return str;
                }
                applicationAnonymousId = getApplicationAnonymousId();
                sharedPreferencesHelper.putValue(ANONYMOUS_ID, applicationAnonymousId).apply();
            } catch (Exception e2) {
                applicationAnonymousId = str;
                e = e2;
                MspLog.e(TAG, "getAnonymousId:", e);
            }
        } catch (Exception e3) {
            e = e3;
        }
        return applicationAnonymousId;
    }

    public static String getAppVersionByPackageName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Throwable th) {
            MspLog.e(TAG, th.getMessage());
            return "";
        }
    }

    public static String getApplicationAnonymousId() {
        return new SimpleDateFormat("yyMMddHH", Locale.US).format(new Date()) + DeviceUtils.getUuid();
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static CommonRequestInfo getCommonRequestInfo(Context context, boolean z) {
        CommonRequestInfo commonRequestInfo = new CommonRequestInfo();
        commonRequestInfo.setAppPackage(context.getPackageName());
        commonRequestInfo.setSdkVersion(BuildConfig.VERSION_NAME);
        if (z) {
            commonRequestInfo.setMspVersion(AppUtils.getMspAppVersionName(context));
        }
        commonRequestInfo.setBrand(getBrand());
        commonRequestInfo.setModel(getModel());
        commonRequestInfo.setAndroidVersion(getAndroidVersion());
        return commonRequestInfo;
    }

    public static CompatibleInfo getCompatibleInfo(Context context) {
        CompatibleInfo compatibleInfo = new CompatibleInfo();
        compatibleInfo.setBrand(getBrand());
        compatibleInfo.setAndroidVersion(getAndroidVersion());
        compatibleInfo.setOsVersion(getOsVersion());
        compatibleInfo.setRomVersion(getRomVersion());
        compatibleInfo.setMspVersion(isInstallTargetVersionApp(context) ? AppUtils.getMspAppVersionName(context) : "");
        compatibleInfo.setSdkVersion(BuildConfig.VERSION_NAME);
        compatibleInfo.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        compatibleInfo.setModel(getModel());
        compatibleInfo.setAppPackage(context.getPackageName());
        return compatibleInfo;
    }

    public static String getGuid(Context context) {
        return getAnonymousId(context);
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getOsVersion() {
        return DeviceUtils.isOwnBrand() ? getProperty(DeviceUtils.isBrand(BrandConstant.OP_BRAND) ? OSUtils.KEY_ONEPLUS_OS_VERSION : new String(Base64.decode("cm8uYnVpbGQudmVyc2lvbi5vcHBvcm9t", 0)), "") : "";
    }

    public static String getOuid(Context context) {
        if (!TextUtils.isEmpty(CACHE_OUID)) {
            return CACHE_OUID;
        }
        String anonymousId = "";
        try {
            if (poi.k()) {
                poi.j(context);
                anonymousId = poi.i(context, ooi.Type_OUID).b();
                poi.a(context);
                MspLog.d(TAG, "HeytapID,ouid:" + SensitiveInfoUtils.currencyReplace(anonymousId));
            }
            if (TextUtils.isEmpty(anonymousId)) {
                anonymousId = getAnonymousId(context);
                MspLog.d(TAG, "anonymousID,ouid:" + SensitiveInfoUtils.currencyReplace(anonymousId));
            }
            CACHE_OUID = anonymousId;
        } catch (Exception e2) {
            MspLog.e(TAG, "getOuid: " + e2.getMessage());
        }
        return anonymousId;
    }

    private static String getProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            MspLog.e(TAG, "getProperty: " + e2.getMessage());
            return str2;
        }
    }

    public static String getRegion(boolean z) {
        String country;
        if (z) {
            country = getProperty("ro.oplus.pipeline.region", "");
            if (TextUtils.isEmpty(country)) {
                country = getProperty("ro.vendor.oplus.regionmark", "");
            }
            if (TextUtils.isEmpty(country)) {
                country = getProperty("ro.oppo.regionmark", "");
            }
            if (TextUtils.isEmpty(country)) {
                country = getProperty("persist.sys.oplus.region", "");
                if (TextUtils.isEmpty(country)) {
                    country = getProperty("persist.sys.oppo.region", "");
                }
            }
        } else {
            country = "";
        }
        if (TextUtils.isEmpty(country)) {
            country = Locale.getDefault().getCountry();
        }
        return TextUtils.isEmpty(country) ? getProperty("ro.product.locale", "") : country;
    }

    public static String getRomVersion() {
        return Build.VERSION.CODENAME;
    }

    public static String getSsoId() {
        return BaseSdkAgent.getInstance().getSsoId();
    }

    public static boolean isInstallAppCustom(Context context) {
        boolean zIsInstallWithoutForceUpgrade = isInstallWithoutForceUpgrade(context);
        boolean zMustDownloadDestVersionApp = mustDownloadDestVersionApp(context);
        MspLog.iIgnore(TAG, "isInstallAppCustom, isInstalled = " + zIsInstallWithoutForceUpgrade + ", forceUpgrade = " + zMustDownloadDestVersionApp);
        if (!zIsInstallWithoutForceUpgrade && !zMustDownloadDestVersionApp) {
            zIsInstallWithoutForceUpgrade = com.heytap.msp.sdk.core.a.M().t(false) != null;
            MspLog.iIgnore(TAG, "isInstallAppCustom, after checking IPC, isInstalled = " + zIsInstallWithoutForceUpgrade);
        }
        return zIsInstallWithoutForceUpgrade ? !zMustDownloadDestVersionApp : zIsInstallWithoutForceUpgrade;
    }

    public static boolean isInstallTargetVersionApp(Context context) {
        return isInstallWithoutForceUpgrade(context) && !mustDownloadDestVersionApp(context);
    }

    public static boolean isInstallWithoutForceUpgrade(Context context) {
        int i;
        try {
            i = context.getPackageManager().getPackageInfo("com.heytap.htms", 16384).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            MspLog.e(TAG, "getPackageInfo Error, not install mspService");
            i = 0;
        }
        return i >= 208 && isVersionValid(context);
    }

    private static boolean isVersionValid(Context context) {
        return true;
    }

    public static String keyOfCompatible(String str, Constants.CompatibleInfo.KeyType keyType) {
        int i = AnonymousClass1.$SwitchMap$com$heytap$msp$sdk$base$common$Constants$CompatibleInfo$KeyType[keyType.ordinal()];
        if (i == 1) {
            return String.format(Constants.CompatibleInfo.KEY_COMPATIBLE_RECORD, str);
        }
        if (i == 2) {
            return String.format(Constants.CompatibleInfo.KEY_COMPATIBLE_RECORD_TIME, str);
        }
        if (i == 3) {
            return String.format(Constants.CompatibleInfo.KEY_COMPATIBLE_EXPIRE, str);
        }
        if (i != 4) {
            return null;
        }
        return String.format(Constants.CompatibleInfo.KEY_COMPATIBLE_ROUTE, str);
    }

    public static boolean mustDownloadDestVersionApp(Context context) {
        if (context == null) {
            context = BaseSdkAgent.getInstance().getContext();
        }
        GlobalConfig globalConfig = BaseSdkAgent.getInstance().getGlobalConfig();
        if (globalConfig != null) {
            return AppUtils.getMspAppVersionCode(context) < globalConfig.getFixedMspVersionCode();
        }
        return false;
    }
}
