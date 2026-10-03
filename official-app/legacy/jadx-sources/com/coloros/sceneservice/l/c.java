package com.coloros.sceneservice.l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.setting.SettingConstant;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static final int Gc = 100;
    public static final String Hc = "coloros.intent.action.sceneservice.LOCATION_SELECTOR";
    public static final String Ic = "coloros.intent.action.sceneservice.WLAN_SELECTOR";
    public static final String Jc = "coloros.intent.action.PERSONAL_INFORMATION_SETTINGS";
    public static final String Kc = "intent_wlan_key";
    public static final String Lc = "intent_address_key";
    public static final String Mc = "from_type";
    public static final String Nc = "theme_type";
    public static final String RESULT_EXTRA_ADDRESS = "address";
    public static final String RESULT_EXTRA_WIFI_NAME = "wifi_name";
    public static final String TAG = "UserProfileHelper";

    public static Intent getLocationSelectorIntent(SettingConstant.Scene scene, Context context) {
        Intent intent = new Intent(Hc);
        intent.setPackage("com.coloros.sceneservice");
        intent.putExtra(Lc, scene.mAddressKey);
        intent.putExtra(Mc, context.getPackageName());
        return intent;
    }

    public static Intent getUserProfileSettingIntent(Context context) {
        Intent intent = new Intent(Jc);
        intent.setPackage("com.coloros.sceneservice");
        intent.putExtra(Mc, context.getPackageName());
        return intent;
    }

    public static Intent getWlanSelectorIntent(SettingConstant.Scene scene, Context context) {
        Intent intent = new Intent(Ic);
        intent.setPackage("com.coloros.sceneservice");
        intent.putExtra(Kc, scene.mWlanKey);
        intent.putExtra(Mc, context.getPackageName());
        return intent;
    }

    public static boolean startLocationSelectorActivity(SettingConstant.Scene scene, int i, Activity activity) {
        try {
            activity.startActivityForResult(getLocationSelectorIntent(scene, activity), i);
            return true;
        } catch (Exception e2) {
            f.e(TAG, "startLocationSelectorActivity: exception " + e2);
            return false;
        }
    }

    public static boolean startLocationSelectorActivityWithTheme(SettingConstant.Scene scene, int i, Activity activity, int i2) {
        try {
            Intent locationSelectorIntent = getLocationSelectorIntent(scene, activity);
            locationSelectorIntent.putExtra(Nc, i2);
            activity.startActivityForResult(locationSelectorIntent, i);
            return true;
        } catch (Exception e2) {
            f.e(TAG, "startLocationSelectorActivity: exception " + e2);
            return false;
        }
    }

    public static boolean startUserProfileSettingActivity(int i, Activity activity) {
        try {
            activity.startActivityForResult(getUserProfileSettingIntent(activity), i);
            return true;
        } catch (Exception e2) {
            f.e(TAG, "startUserProfileSettingActivity: exception " + e2);
            return false;
        }
    }

    public static boolean startWLanSelectorActivityWithTheme(SettingConstant.Scene scene, int i, Activity activity, int i2) {
        try {
            Intent wlanSelectorIntent = getWlanSelectorIntent(scene, activity);
            wlanSelectorIntent.putExtra(Nc, i2);
            activity.startActivityForResult(wlanSelectorIntent, i);
            return true;
        } catch (Exception e2) {
            f.e(TAG, "startLocationSelectorActivity: exception " + e2);
            return false;
        }
    }

    public static boolean startWlanSelectorActivity(SettingConstant.Scene scene, int i, Activity activity) {
        try {
            activity.startActivityForResult(getWlanSelectorIntent(scene, activity), i);
            return true;
        } catch (Exception e2) {
            f.e(TAG, "startLocationSelectorActivity: exception " + e2);
            return false;
        }
    }
}
