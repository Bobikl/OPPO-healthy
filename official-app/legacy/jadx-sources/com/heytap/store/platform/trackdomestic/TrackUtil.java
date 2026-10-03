package com.heytap.store.platform.trackdomestic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.oplus.aiunit.vision.ilj;
import com.oplus.nearx.track.TrackApi;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TrackUtil {
    public static final String EVENT_GROUP = "$preset_event";
    public static final String PROFILE = "$profile";
    public static final String SA_ANONYMOUS_ID = "_sa_anonymous_id";
    private static final String SA_APP_NAME = "_sa_app_name";
    public static final String SA_DEVICE_ID = "_sa_device_id";
    public static final String SA_DISTINCT_ID = "_sa_distinct_id";
    public static final String SA_IDENTITY_ANDROID_ID = "_sa_identity_android_id";
    public static final String SA_IS_FIRST_DAY = "_sa_is_first_day";
    public static final String SA_LIB = "_sa_lib";
    public static final String SA_LIB_METHOD = "_sa_lib_method";
    private static final String SA_MANUFACTURER = "_sa_manufacturer";
    public static final String SA_ORIGINAL_ID = "_sa_original_id";
    private static final String SA_OS = "_sa_os";
    private static final String SA_SCREEN_HEIGHT = "_sa_screen_height";
    private static final String SA_SCREEN_WIDTH = "_sa_screen_width";
    private static final String SA_TIMEZONE_OFFSET = "_sa_timezone_offset";
    public static final String SA_TRACK_ID = "_sa_track_id";
    public static final String SA_TYPE = "_sa_type";
    private static String mCacheFirstDay;
    private static final List<String> mInvalidAndroidId = new ArrayList<String>() { // from class: com.heytap.store.platform.trackdomestic.TrackUtil.1
        {
            add("9774d56d682e549c");
            add("0123456789abcdef");
            add(ilj.DEFAULT_ANDROID_ID);
        }
    };
    private static String mAndroidID = "";

    public static JSONObject buildCustomHead(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (isHarmonyOs()) {
                jSONObject.put(SA_OS, "HarmonyOS");
            } else {
                jSONObject.put(SA_OS, DeviceInfoUtil.SYSTEM_NAME);
            }
            jSONObject.put(SA_APP_NAME, getAppName(context));
            jSONObject.put(SA_MANUFACTURER, getManufacturer());
            Integer zoneOffset = getZoneOffset();
            if (zoneOffset != null) {
                jSONObject.put(SA_TIMEZONE_OFFSET, zoneOffset);
            }
            int[] deviceSize = getDeviceSize(context);
            jSONObject.put(SA_SCREEN_WIDTH, deviceSize[0]);
            jSONObject.put(SA_SCREEN_HEIGHT, deviceSize[1]);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @SuppressLint({"HardwareIds"})
    public static String getAndroidId(Context context) {
        if (TextUtils.isEmpty(mAndroidID)) {
            try {
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                mAndroidID = string;
                if (mInvalidAndroidId.contains(string)) {
                    mAndroidID = "";
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return mAndroidID;
    }

    public static String getAnonymousId(Context context) {
        String string = "";
        try {
            string = context.getSharedPreferences("com.sensorsdata.analytics.android.sdk.SensorsDataAPI", 0).getString(DbParams.PersistentName.DISTINCT_ID, "");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (string != null && !string.isEmpty()) {
            return string;
        }
        String androidId = getAndroidId(context);
        return TextUtils.isEmpty(androidId) ? UUID.randomUUID().toString() : androidId;
    }

    public static CharSequence getAppName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 128).loadLabel(packageManager);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int[] getDeviceSize(Context context) {
        int[] iArr = new int[2];
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            int rotation = defaultDisplay.getRotation();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i = point.x;
            int i2 = point.y;
            iArr[0] = getNaturalWidth(rotation, i, i2);
            iArr[1] = getNaturalHeight(rotation, i, i2);
        } catch (Exception unused) {
            if (context.getResources() != null) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                iArr[0] = displayMetrics.widthPixels;
                iArr[1] = displayMetrics.heightPixels;
            }
        }
        return iArr;
    }

    public static String getDistinctId(Context context) {
        String loginId = getLoginId(context);
        return !TextUtils.isEmpty(loginId) ? loginId : getAnonymousId(context);
    }

    public static String getLoginId(Context context) {
        try {
            return context.getSharedPreferences("com.sensorsdata.analytics.android.sdk.SensorsDataAPI", 0).getString(DbParams.PersistentName.LOGIN_ID, "");
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            return str != null ? str.trim().toUpperCase() : LanConstants.OPERATOR_UNKNOWN;
        } catch (Exception unused) {
            return LanConstants.OPERATOR_UNKNOWN;
        }
    }

    private static int getNaturalHeight(int i, int i2, int i3) {
        return (i == 0 || i == 2) ? i3 : i2;
    }

    private static int getNaturalWidth(int i, int i2, int i3) {
        return (i == 0 || i == 2) ? i2 : i3;
    }

    private static Integer getZoneOffset() {
        try {
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            return Integer.valueOf((-(calendar.get(15) + calendar.get(16))) / 60000);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isHarmonyOs() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void login(Context context, long j2, String str) {
        if (str.equals(getAnonymousId(context)) || TextUtils.equals(str, TrackApi.t(j2).C())) {
            return;
        }
        TrackApi.t(j2).J(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SA_ORIGINAL_ID, getAnonymousId(context));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        TrackApi.t(j2).N(EVENT_GROUP, "$SignUp", jSONObject);
    }

    public static void mergeJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
        } catch (Exception unused) {
        }
    }
}
