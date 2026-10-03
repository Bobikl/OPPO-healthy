package com.sensorsdata.analytics.android.sdk.util;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.sensorsdata.analytics.android.sdk.R;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.ScreenAutoTracker;
import com.sensorsdata.analytics.android.sdk.SensorsDataFragmentTitle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SAPageInfoUtils {
    public static final String SCREEN_NAME = "$screen_name";
    public static final String TITLE = "$title";

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject getActivityPageInfo(Activity activity) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$screen_name", activity.getClass().getCanonicalName());
            String activityTitle = SensorsDataUtils.getActivityTitle(activity);
            if (!TextUtils.isEmpty(activityTitle)) {
                jSONObject.put("$title", activityTitle);
            }
            if (activity instanceof ScreenAutoTracker) {
                JSONUtils.mergeJSONObject(((ScreenAutoTracker) activity).getTrackProperties(), jSONObject);
            }
            return jSONObject;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return new JSONObject();
        }
    }

    public static JSONObject getFragmentPageInfo(Activity activity, Object obj) {
        String canonicalName;
        SensorsDataFragmentTitle sensorsDataFragmentTitle;
        JSONObject trackProperties;
        JSONObject jSONObject = new JSONObject();
        try {
            String activityTitle = null;
            if (!(obj instanceof ScreenAutoTracker) || (trackProperties = ((ScreenAutoTracker) obj).getTrackProperties()) == null) {
                canonicalName = null;
            } else {
                canonicalName = trackProperties.has("$screen_name") ? trackProperties.optString("$screen_name") : null;
                activityTitle = trackProperties.has("$title") ? trackProperties.optString("$title") : null;
                JSONUtils.mergeJSONObject(trackProperties, jSONObject);
            }
            boolean zIsEmpty = TextUtils.isEmpty(activityTitle);
            boolean zIsEmpty2 = TextUtils.isEmpty(canonicalName);
            if (zIsEmpty && obj.getClass().isAnnotationPresent(SensorsDataFragmentTitle.class) && (sensorsDataFragmentTitle = (SensorsDataFragmentTitle) obj.getClass().getAnnotation(SensorsDataFragmentTitle.class)) != null) {
                activityTitle = sensorsDataFragmentTitle.title();
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(activityTitle);
            if (zIsEmpty3 || zIsEmpty2) {
                if (activity == null) {
                    activity = SAFragmentUtils.getActivityFromFragment(obj);
                }
                if (activity != null) {
                    if (zIsEmpty3) {
                        activityTitle = SensorsDataUtils.getActivityTitle(activity);
                    }
                    if (zIsEmpty2) {
                        canonicalName = String.format(TimeUtils.SDK_LOCALE, "%s|%s", activity.getClass().getCanonicalName(), obj.getClass().getCanonicalName());
                    }
                }
            }
            if (!TextUtils.isEmpty(activityTitle)) {
                jSONObject.put("$title", activityTitle);
            }
            if (TextUtils.isEmpty(canonicalName)) {
                canonicalName = obj.getClass().getCanonicalName();
            }
            jSONObject.put("$screen_name", canonicalName);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return jSONObject;
    }

    public static JSONObject getRNPageInfo() {
        return getRNPageInfo(null);
    }

    public static JSONObject getRNPageInfo(View view) {
        Object tag;
        try {
            String str = (String) ReflectUtil.callStaticMethod(ReflectUtil.getCurrentClass(new String[]{"com.sensorsdata.analytics.utils.RNViewUtils"}), "getVisualizeProperties", new Object[0]);
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (view != null && jSONObject.optBoolean("isSetRNViewTag", false) && ((tag = view.getTag(R.id.sensors_analytics_tag_view_rn_key)) == null || !((Boolean) tag).booleanValue())) {
                    return null;
                }
                String strOptString = jSONObject.optString("$screen_name");
                String strOptString2 = jSONObject.optString("$title");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("$screen_name", strOptString);
                jSONObject2.put("$title", strOptString2);
                return jSONObject2;
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return null;
    }
}
