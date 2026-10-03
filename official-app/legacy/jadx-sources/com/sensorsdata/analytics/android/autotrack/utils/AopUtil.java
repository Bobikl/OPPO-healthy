package com.sensorsdata.analytics.android.autotrack.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.ToggleButton;
import com.sensorsdata.analytics.android.autotrack.R;
import com.sensorsdata.analytics.android.autotrack.core.beans.AutoTrackConstants;
import com.sensorsdata.analytics.android.autotrack.core.beans.ViewContext;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.ScreenAutoTracker;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.SAFragmentUtils;
import com.sensorsdata.analytics.android.sdk.util.SAPageInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.SAViewUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AopUtil {
    private static final String TAG = "SA.AopUtil";

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject buildTitleNoAutoTrackerProperties(Activity activity) {
        JSONObject trackProperties;
        try {
            JSONObject jSONObjectBuildTitleAndScreenName = SAViewUtils.buildTitleAndScreenName(activity);
            if ((activity instanceof ScreenAutoTracker) && (trackProperties = ((ScreenAutoTracker) activity).getTrackProperties()) != null) {
                if (trackProperties.has("$screen_name")) {
                    jSONObjectBuildTitleAndScreenName.put("$screen_name", trackProperties.optString("$screen_name"));
                }
                if (trackProperties.has("$title")) {
                    jSONObjectBuildTitleAndScreenName.put("$title", trackProperties.optString("$title"));
                }
            }
            return jSONObjectBuildTitleAndScreenName;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return new JSONObject();
        }
    }

    public static JSONObject injectClickInfo(ViewContext viewContext, JSONObject jSONObject, boolean z) {
        View view = viewContext.view;
        if (view == null) {
            return jSONObject;
        }
        try {
            if (!isTrackEvent(view, z)) {
                return null;
            }
            Context context = viewContext.view.getContext();
            JSONObject jSONObject2 = new JSONObject();
            String viewId = SAViewUtils.getViewId(viewContext.view);
            if (!TextUtils.isEmpty(viewId)) {
                jSONObject2.put(AutoTrackConstants.ELEMENT_ID, viewId);
            }
            String viewContent = SAViewUtils.getViewContent(viewContext.view);
            if (!TextUtils.isEmpty(viewContent)) {
                jSONObject2.put(AutoTrackConstants.ELEMENT_CONTENT, viewContent);
            }
            jSONObject2.put(AutoTrackConstants.ELEMENT_TYPE, SAViewUtils.getViewType(viewContext.view));
            Activity activityOfView = viewContext.activity;
            if (activityOfView == null) {
                activityOfView = SAViewUtils.getActivityOfView(context, viewContext.view);
            }
            if (activityOfView != null) {
                JSONUtils.mergeJSONObject(SAPageInfoUtils.getActivityPageInfo(activityOfView), jSONObject2);
            }
            Object fragmentFromView = viewContext.fragment;
            if (fragmentFromView == null) {
                fragmentFromView = SAFragmentUtils.getFragmentFromView(viewContext.view, activityOfView);
            }
            if (fragmentFromView != null) {
                JSONUtils.mergeJSONObject(SAPageInfoUtils.getFragmentPageInfo(activityOfView, fragmentFromView), jSONObject2);
            }
            JSONObject jSONObject3 = (JSONObject) viewContext.view.getTag(R.id.sensors_analytics_tag_view_properties);
            if (jSONObject3 != null) {
                JSONUtils.mergeJSONObject(jSONObject3, jSONObject2);
            }
            JSONUtils.mergeDistinctProperty(jSONObject2, jSONObject);
            return jSONObject;
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
            return jSONObject;
        }
    }

    public static boolean isTrackEvent(View view, boolean z) {
        if (view instanceof CheckBox) {
            if (!z) {
                return false;
            }
        } else if (view instanceof RadioButton) {
            if (!z) {
                return false;
            }
        } else if (view instanceof ToggleButton) {
            if (!z) {
                return false;
            }
        } else if ((view instanceof CompoundButton) && !z) {
            return false;
        }
        if (view instanceof RatingBar) {
            return z;
        }
        return true;
    }
}
