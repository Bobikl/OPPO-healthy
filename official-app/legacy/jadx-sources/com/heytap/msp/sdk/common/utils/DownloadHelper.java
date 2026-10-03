package com.heytap.msp.sdk.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.heytap.msp.bean.GlobalConfig;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.common.util.DeviceUtils;
import com.heytap.msp.sdk.base.common.util.Md5Util;
import com.heytap.msp.sdk.base.common.util.SharedPreferencesHelper;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class DownloadHelper {
    private static final String APK_ID = "";
    private static final String APK_NAME = "Y29tLmhleXRhcC5odG1z";
    private static final String HN_BRAND = "fd976f550f84430dc88941effcf786ad";
    private static final String HN_BRAND_MK = "Y29tLmhpaG9ub3IuYXBwbWFya2V0";
    private static final String HW_BRAND = "950009e89a57b5dee074690688766694";
    private static final String HW_BRAND_ACTION_PREFIX = "Y29tLmh1YXdlaS5hcHBtYXJrZXQ=";
    private static final String HW_BRAND_MK = "Y29tLmh1YXdlaS5hcHBtYXJrZXQ=";
    private static final String KEY_COUNT_JUMP_TO_MARKET = "count_jump_to_market";
    private static final String KEY_LAST_DAY = "last_day";
    public static final int ONE_DAY_MILLIS = 86400000;
    private static final String OPL_BRAND = "5836b6c1f251363d1ebc8e1c2e1fb9b9";
    private static final String OP_BRAND = "67843bc0e7e7b09cc369beabf05e9d30";
    private static final String OP_BRAND_MK = "Y29tLm9wcG8ubWFya2V0";
    private static final String OP_BRAND_NEW_MK = "Y29tLmhleXRhcC5tYXJrZXQ=";
    private static final String SP_FILE_NAME = "daily_method_call_counter";
    private static final String TAG = "DownloadHelper";
    private static final String VV_BRAND = "5022f89fd23497721bcd12f8765bcece";
    private static final String VV_BRAND_MK = "Y29tLmJiay5hcHBzdG9yZQ==";
    private static final String XM_BRAND = "739edca6c608a36dcff13e3a737dd86f";
    private static final String XM_BRAND_MK = "YXBwLm1pLmNvbQ==";
    private static String intentUrl = "";
    private static boolean isSupporBrand = false;
    private static SharedPreferencesHelper mSharedPreferencesHelper = null;
    private static String marketPackage = "";
    private static DownloadHelper sInstance;

    private DownloadHelper(Context context) {
        mSharedPreferencesHelper = new SharedPreferencesHelper(context, SP_FILE_NAME, 0);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0098. Please report as an issue. */
    public static boolean checkSupportBrandAndDealIntentInfo() {
        String str;
        if (DeviceUtils.isOwnBrand()) {
            intentUrl = "market://details?id=" + new String(Base64.decode(APK_NAME, 2)) + "&atd=true";
            marketPackage = new String(Base64.decode(OP_BRAND_MK, 2));
            isSupporBrand = true;
            MspLog.e("DownloadHelper", "market: " + marketPackage);
            return true;
        }
        HashSet<String> hashSetUpdateBrandList = updateBrandList();
        if (hashSetUpdateBrandList == null) {
            isSupporBrand = false;
            return false;
        }
        String phoneBrand = getPhoneBrand();
        phoneBrand.hashCode();
        switch (phoneBrand) {
            case "739edca6c608a36dcff13e3a737dd86f":
                if (!hashSetUpdateBrandList.contains("739edca6c608a36dcff13e3a737dd86f")) {
                    isSupporBrand = false;
                    break;
                } else {
                    intentUrl = "https://" + new String(Base64.decode(XM_BRAND_MK, 2)) + "/details?id=" + new String(Base64.decode(APK_NAME, 2));
                    str = new String(Base64.decode(XM_BRAND_MK, 2));
                    marketPackage = str;
                    isSupporBrand = true;
                    break;
                }
                break;
            case "950009e89a57b5dee074690688766694":
                if (!hashSetUpdateBrandList.contains(HW_BRAND)) {
                    isSupporBrand = false;
                    break;
                } else {
                    str = new String(Base64.decode("Y29tLmh1YXdlaS5hcHBtYXJrZXQ=", 2));
                    marketPackage = str;
                    isSupporBrand = true;
                    break;
                }
                break;
            case "5022f89fd23497721bcd12f8765bcece":
                if (!hashSetUpdateBrandList.contains("5022f89fd23497721bcd12f8765bcece")) {
                    isSupporBrand = false;
                    break;
                } else {
                    intentUrl = "market://details?id=" + new String(Base64.decode(APK_NAME, 2)) + "&th_name=need_comment";
                    str = new String(Base64.decode(VV_BRAND_MK, 2));
                    marketPackage = str;
                    isSupporBrand = true;
                    break;
                }
                break;
            case "fd976f550f84430dc88941effcf786ad":
                if (!hashSetUpdateBrandList.contains(HN_BRAND)) {
                    isSupporBrand = false;
                    break;
                } else {
                    intentUrl = "honormarket://details?id=" + new String(Base64.decode(APK_NAME, 2));
                    str = new String(Base64.decode(HN_BRAND_MK, 2));
                    marketPackage = str;
                    isSupporBrand = true;
                    break;
                }
                break;
            default:
                intentUrl = "";
                marketPackage = "";
                isSupporBrand = false;
                break;
        }
        MspLog.e("DownloadHelper", "market: " + marketPackage);
        return isSupporBrand;
    }

    public static void downloadAppInMarketApp(Context context) {
        updateCount();
        if (DeviceUtils.isOwnBrand()) {
            gotoOPMarket(context);
        }
        String phoneBrand = getPhoneBrand();
        phoneBrand.hashCode();
        switch (phoneBrand) {
            case "739edca6c608a36dcff13e3a737dd86f":
                gotoXMMarket(context);
                break;
            case "950009e89a57b5dee074690688766694":
                gotoHWMarket(context);
                break;
            case "5022f89fd23497721bcd12f8765bcece":
                gotoVVmarket(context);
                break;
            case "fd976f550f84430dc88941effcf786ad":
                gotoHNMarket(context);
                break;
        }
    }

    public static int getCount() {
        return ((Integer) mSharedPreferencesHelper.getValue(KEY_COUNT_JUMP_TO_MARKET, 0)).intValue();
    }

    private static long getCurrentDayNumber() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / 86400000;
    }

    public static synchronized DownloadHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DownloadHelper(context.getApplicationContext());
        }
        refreshAndResetCount();
        return sInstance;
    }

    public static String getIntentUrl() {
        return intentUrl;
    }

    public static String getMarketPackage() {
        return marketPackage;
    }

    private static String getPhoneBrand() {
        try {
            return Md5Util.md5Digest(Build.BRAND.toUpperCase());
        } catch (IOException e2) {
            MspLog.e("DownloadHelper", "InvalidBrand cause: " + e2);
            return "";
        }
    }

    private static void gotoHNMarket(Context context) {
        Uri uri = Uri.parse(getIntentUrl());
        String marketPackage2 = getMarketPackage();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        intent.setPackage(marketPackage2);
        context.startActivity(intent);
    }

    private static void gotoHWMarket(Context context) {
        String marketPackage2 = getMarketPackage();
        Intent intent = new Intent(new String(Base64.decode("Y29tLmh1YXdlaS5hcHBtYXJrZXQ=", 2)) + ".intent.action.AppDetail");
        intent.putExtra("APP_PACKAGENAME", new String(Base64.decode(APK_NAME, 2)));
        intent.addFlags(268435456);
        intent.setPackage(marketPackage2);
        context.startActivity(intent);
    }

    private static void gotoOPMarket(Context context) {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                PackageManager packageManager = activity.getPackageManager();
                Uri uri = Uri.parse(getIntentUrl());
                String marketPackage2 = getMarketPackage();
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(marketPackage2, 0);
                    if (packageInfo != null && (applicationInfo2 = packageInfo.applicationInfo) != null && applicationInfo2.enabled) {
                        intent.setPackage(marketPackage2);
                    }
                } catch (Throwable th) {
                    try {
                        MspLog.d("DownloadHelper", "opMarketException" + th);
                        String str = new String(Base64.decode(OP_BRAND_NEW_MK, 2));
                        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
                        if (packageInfo2 != null && (applicationInfo = packageInfo2.applicationInfo) != null && applicationInfo.enabled) {
                            intent.setPackage(str);
                        }
                    } catch (Throwable th2) {
                        MspLog.d("DownloadHelper", "heytapMarketException" + th2);
                    }
                }
                activity.startActivityForResult(intent, 1);
                return;
            }
        }
        MspLog.d("DownloadHelper", "context's status cannot start Activity");
    }

    private static void gotoVVmarket(Context context) {
        Uri uri = Uri.parse(getIntentUrl());
        String marketPackage2 = getMarketPackage();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        intent.setPackage(marketPackage2);
        context.startActivity(intent);
    }

    private static void gotoXMMarket(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(getIntentUrl()));
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void refreshAndResetCount() {
        StringBuilder sb;
        String str;
        long currentDayNumber = getCurrentDayNumber();
        if (currentDayNumber - ((Long) mSharedPreferencesHelper.getValue(KEY_LAST_DAY, 0L)).longValue() >= 1) {
            mSharedPreferencesHelper.putValue(KEY_LAST_DAY, Long.valueOf(currentDayNumber)).putValue(KEY_COUNT_JUMP_TO_MARKET, 0);
            sb = new StringBuilder();
            str = " Reset count, new current day: ";
        } else {
            mSharedPreferencesHelper.putValue(KEY_LAST_DAY, Long.valueOf(currentDayNumber));
            sb = new StringBuilder();
            str = "Not reset count, just refresh current day: ";
        }
        sb.append(str);
        sb.append(currentDayNumber);
        MspLog.d("DownloadHelper", sb.toString());
        mSharedPreferencesHelper.apply();
    }

    private static HashSet<String> updateBrandList() {
        GlobalConfig globalConfig = BaseSdkAgent.getInstance().getGlobalConfig();
        HashSet hashSet = globalConfig != null ? (HashSet) globalConfig.getJump3rdAppStore() : new HashSet();
        HashSet<String> hashSet2 = new HashSet<>();
        if (hashSet != null) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    hashSet2.add(Md5Util.md5Digest(((String) it.next()).toUpperCase()));
                }
            } catch (IOException e2) {
                MspLog.e("DownloadHelper", "InvalidBrand cause: " + e2.getMessage());
            }
        }
        MspLog.d("DownloadHelper", "supportlist jump3rdAppStore contains: " + hashSet2);
        return hashSet2;
    }

    private static void updateCount() {
        if (getCount() > 0) {
            return;
        }
        mSharedPreferencesHelper.putValue(KEY_COUNT_JUMP_TO_MARKET, Integer.valueOf(((Integer) mSharedPreferencesHelper.getValue(KEY_COUNT_JUMP_TO_MARKET, 0)).intValue() + 1));
        mSharedPreferencesHelper.apply();
    }
}
