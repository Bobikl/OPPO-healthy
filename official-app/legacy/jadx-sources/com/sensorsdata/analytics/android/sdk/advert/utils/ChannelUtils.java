package com.sensorsdata.analytics.android.sdk.advert.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.store.base.core.util.statistics.bean.UtmBean;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.SAOaidHelper;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.plugin.encrypt.SAStoreManager;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ChannelUtils {
    private static final String SHARED_PREF_CORRECT_TRACK_INSTALLATION = "sensorsdata.correct.track.installation";
    private static final String SHARED_PREF_UTM = "sensorsdata.utm";
    private static final String UTM_CAMPAIGN_KEY = "SENSORS_ANALYTICS_UTM_CAMPAIGN";
    private static final String UTM_CONTENT_KEY = "SENSORS_ANALYTICS_UTM_CONTENT";
    private static final String UTM_MEDIUM_KEY = "SENSORS_ANALYTICS_UTM_MEDIUM";
    private static final String UTM_SOURCE_KEY = "SENSORS_ANALYTICS_UTM_SOURCE";
    private static final String UTM_TERM_KEY = "SENSORS_ANALYTICS_UTM_TERM";
    private static HashSet<String> sChannelSourceKeySet = new HashSet<>();
    private static final HashMap<String, String> UTM_MAP = new HashMap<String, String>() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils.1
        {
            put(ChannelUtils.UTM_SOURCE_KEY, "$utm_source");
            put(ChannelUtils.UTM_MEDIUM_KEY, "$utm_medium");
            put(ChannelUtils.UTM_TERM_KEY, "$utm_term");
            put(ChannelUtils.UTM_CONTENT_KEY, "$utm_content");
            put(ChannelUtils.UTM_CAMPAIGN_KEY, "$utm_campaign");
        }
    };
    private static final List<String> mDeepLinkBlackList = new ArrayList() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils.2
        {
            add("io.dcloud.PandoraEntryActivity");
        }
    };
    private static final HashMap<String, String> UTM_LINK_MAP = new HashMap<String, String>() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils.3
        {
            put(ChannelUtils.UTM_SOURCE_KEY, "utm_source");
            put(ChannelUtils.UTM_MEDIUM_KEY, "utm_medium");
            put(ChannelUtils.UTM_TERM_KEY, UtmBean.UTM_TERM);
            put(ChannelUtils.UTM_CONTENT_KEY, "utm_content");
            put(ChannelUtils.UTM_CAMPAIGN_KEY, UtmBean.UTM_CAMPAIGN);
        }
    };
    private static final Map<String, String> LATEST_UTM_MAP = new HashMap<String, String>() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils.4
        {
            put(ChannelUtils.UTM_SOURCE_KEY, "$latest_utm_source");
            put(ChannelUtils.UTM_MEDIUM_KEY, "$latest_utm_medium");
            put(ChannelUtils.UTM_TERM_KEY, "$latest_utm_term");
            put(ChannelUtils.UTM_CONTENT_KEY, "$latest_utm_content");
            put(ChannelUtils.UTM_CAMPAIGN_KEY, "$latest_utm_campaign");
        }
    };
    private static Map<String, String> sUtmProperties = new HashMap();
    private static Map<String, String> sLatestUtmProperties = new HashMap();

    public static boolean checkDeviceInfo(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("##");
        HashMap map = new HashMap();
        if (strArrSplit.length == 0) {
            return false;
        }
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.trim().split(HttpUtils.EQUAL_SIGN);
            if (strArrSplit2.length == 2) {
                map.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
        if (map.isEmpty()) {
            return false;
        }
        return (map.containsKey("oaid") && TextUtils.equals((CharSequence) map.get("oaid"), SAOaidHelper.getOpenAdIdentifier(context))) || (map.containsKey("android_id") && TextUtils.equals((CharSequence) map.get("android_id"), SensorsDataUtils.getIdentifier(context)));
    }

    public static JSONObject checkOrSetChannelCallbackEvent(String str, JSONObject jSONObject, Context context) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("$is_channel_callback_event", isFirstChannelEvent(str));
            if (context != null && !hasUtmProperties(jSONObject)) {
                mergeUtmByMetaData(context, jSONObject);
            }
            jSONObject.put("$channel_device_info", "1");
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
        return jSONObject;
    }

    public static void clearLocalUtm() {
        try {
            SAStoreManager.getInstance().setString(SHARED_PREF_UTM, "");
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void clearMemoryUtm() {
        sUtmProperties.clear();
        sLatestUtmProperties.clear();
    }

    public static void clearUtm() {
        clearMemoryUtm();
        clearLocalUtm();
    }

    public static void commitRequestDeferredDeeplink(boolean z) {
        SAStoreManager.getInstance().setBool(DbParams.PersistentName.REQUEST_DEFERRER_DEEPLINK, z);
    }

    private static String getApplicationMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128);
            String string = applicationInfo.metaData.getString(str);
            int i = string == null ? applicationInfo.metaData.getInt(str, -1) : -1;
            return i != -1 ? String.valueOf(i) : string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getDeviceInfo(Context context, String str, String str2, String str3) {
        return String.format("android_id=%s##imei=%s##imei_old=%s##imei_slot1=%s##imei_slot2=%s##imei_meid=%s##mac=%s##oaid=%s##oaid_reflection=%s", str, "", "", "", "", "", "", str2, str3);
    }

    public static JSONObject getLatestUtmProperties() {
        return sLatestUtmProperties.size() > 0 ? new JSONObject(sLatestUtmProperties) : new JSONObject();
    }

    public static JSONObject getUtmProperties() {
        return sUtmProperties.size() > 0 ? new JSONObject(sUtmProperties) : new JSONObject();
    }

    public static boolean hasLinkUtmProperties(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            for (Map.Entry<String, String> entry : UTM_LINK_MAP.entrySet()) {
                if (entry != null && set.contains(entry.getValue())) {
                    return true;
                }
            }
            for (String str : sChannelSourceKeySet) {
                if (!TextUtils.isEmpty(str) && sChannelSourceKeySet.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasUtmByMetaData(Context context) {
        if (context == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : UTM_MAP.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(getApplicationMetaData(context, entry.getKey()))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasUtmProperties(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : UTM_MAP.entrySet()) {
            if (entry != null && jSONObject.has(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCorrectTrackInstallation() {
        try {
            return SAStoreManager.getInstance().getBool(SHARED_PREF_CORRECT_TRACK_INSTALLATION, false);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    public static boolean isDeepLinkBlackList(Activity activity) {
        if (activity == null) {
            return false;
        }
        Iterator<String> it = mDeepLinkBlackList.iterator();
        while (it.hasNext()) {
            try {
                if (Class.forName(it.next()).isAssignableFrom(activity.getClass())) {
                    return true;
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
        return false;
    }

    public static boolean isExistRequestDeferredDeeplink() {
        return SAStoreManager.getInstance().isExists(DbParams.PersistentName.REQUEST_DEFERRER_DEEPLINK);
    }

    public static boolean isFirstChannelEvent(String str) {
        String str2 = AbstractSensorsDataAPI.getConfigOptions().getStorePlugins() == null || AbstractSensorsDataAPI.getConfigOptions().getStorePlugins().isEmpty() ? str : (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_ENCRYPT_AES, str);
        boolean zIsFirstChannelEvent = DbAdapter.getInstance().isFirstChannelEvent(new String[]{str2, str});
        if (zIsFirstChannelEvent) {
            DbAdapter.getInstance().addChannelEvent(str2);
        }
        return zIsFirstChannelEvent;
    }

    public static boolean isGetDeviceInfo(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) ? false : true;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    public static boolean isRequestDeferredDeeplink() {
        return SAStoreManager.getInstance().getBool(DbParams.PersistentName.REQUEST_DEFERRER_DEEPLINK, true);
    }

    public static boolean isTrackInstallation() {
        try {
            return SAStoreManager.getInstance().isExists(SHARED_PREF_CORRECT_TRACK_INSTALLATION);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    public static void loadUtmByLocal() {
        try {
            sLatestUtmProperties.clear();
            String string = SAStoreManager.getInstance().getString(SHARED_PREF_UTM, "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            Iterator<Map.Entry<String, String>> it = LATEST_UTM_MAP.entrySet().iterator();
            while (it.hasNext()) {
                String value = it.next().getValue();
                if (jSONObject.has(value)) {
                    sLatestUtmProperties.put(value, jSONObject.optString(value));
                }
            }
            Iterator<String> it2 = sChannelSourceKeySet.iterator();
            while (it2.hasNext()) {
                String str = "_latest_" + it2.next();
                if (jSONObject.has(str)) {
                    sLatestUtmProperties.put(str, jSONObject.optString(str));
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void mergeUtmByMetaData(Context context, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, String> entry : UTM_MAP.entrySet()) {
            if (entry != null) {
                String applicationMetaData = getApplicationMetaData(context, entry.getKey());
                if (!TextUtils.isEmpty(applicationMetaData)) {
                    jSONObject.put(entry.getValue(), applicationMetaData);
                }
            }
        }
    }

    public static void parseParams(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry : UTM_LINK_MAP.entrySet()) {
            String str = map.get(entry.getValue());
            if (!TextUtils.isEmpty(str)) {
                sUtmProperties.put(UTM_MAP.get(entry.getKey()), str);
                sLatestUtmProperties.put(LATEST_UTM_MAP.get(entry.getKey()), str);
            }
        }
        for (String str2 : sChannelSourceKeySet) {
            try {
                if (SADataHelper.assertPropertyKey(str2)) {
                    String str3 = map.get(str2);
                    if (!TextUtils.isEmpty(str3)) {
                        sUtmProperties.put(str2, str3);
                        sLatestUtmProperties.put("_latest_" + str2, str3);
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    public static void removeDeepLinkInfo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("$latest") || next.startsWith("_latest")) {
                    itKeys.remove();
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void saveCorrectTrackInstallation(boolean z) {
        try {
            SAStoreManager.getInstance().setBool(SHARED_PREF_CORRECT_TRACK_INSTALLATION, z);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void saveDeepLinkInfo() {
        try {
            if (sLatestUtmProperties.size() > 0) {
                SAStoreManager.getInstance().setString(SHARED_PREF_UTM, sLatestUtmProperties.toString());
            } else {
                clearLocalUtm();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void setSourceChannelKeys(String... strArr) {
        sChannelSourceKeySet.clear();
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                sChannelSourceKeySet.add(str);
            }
        }
    }
}
