package com.sensorsdata.analytics.android.sdk.visual.property;

import android.text.TextUtils;
import android.view.View;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import com.sensorsdata.analytics.android.sdk.util.visual.ViewTreeStatusObservable;
import com.sensorsdata.analytics.android.sdk.visual.model.VisualConfig;
import com.sensorsdata.analytics.android.sdk.visual.utils.FlutterUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class VisualPropertiesCache {
    private static final String TAG = "SA.VP.VisualPropertiesCache";

    private void doOnSaveCache(String str) {
        try {
            List<View> currentWebView = ViewTreeStatusObservable.getInstance().getCurrentWebView();
            if (currentWebView != null && currentWebView.size() != 0) {
                Iterator<View> it = currentWebView.iterator();
                while (it.hasNext()) {
                    VisualPropertiesManager.getInstance().getVisualPropertiesH5Helper().sendToWeb(it.next(), "updateH5VisualConfig", str);
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public JSONArray getH5JsonArrayFromCache(String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        String str3 = PersistentLoader.getInstance().getVisualConfigPst().get();
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(DbParams.TABLE_EVENTS);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        VisualConfig.VisualPropertiesConfig visualPropertiesConfig = new VisualConfig.VisualPropertiesConfig();
                        String strOptString = jSONObjectOptJSONObject.optString(DbParams.KEY_CHANNEL_EVENT_NAME);
                        visualPropertiesConfig.eventName = strOptString;
                        if (TextUtils.equals(strOptString, str) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(SAPropertyFilter.PROPERTIES)) != null && jSONArrayOptJSONArray.length() > 0) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                                VisualConfig.VisualProperty visualProperty = new VisualConfig.VisualProperty();
                                String strOptString2 = jSONObjectOptJSONObject2.optString("webview_element_path");
                                visualProperty.webViewElementPath = strOptString2;
                                if (TextUtils.equals(strOptString2, str2)) {
                                    jSONArray.put(jSONObjectOptJSONObject2);
                                }
                            }
                        }
                    }
                }
                return jSONArray;
            }
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
        return null;
    }

    public String getVisualCache() {
        return PersistentLoader.getInstance().getVisualConfigPst().get();
    }

    public VisualConfig getVisualConfig() {
        String str = PersistentLoader.getInstance().getVisualConfigPst().get();
        SALog.i(TAG, "local visual config is :" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            VisualConfig visualConfig = new VisualConfig();
            JSONObject jSONObject = new JSONObject(str);
            visualConfig.appId = jSONObject.optString("app_id");
            visualConfig.os = jSONObject.optString("os");
            visualConfig.project = jSONObject.optString("project");
            visualConfig.version = jSONObject.optString("version");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(DbParams.TABLE_EVENTS);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        VisualConfig.VisualPropertiesConfig visualPropertiesConfig = new VisualConfig.VisualPropertiesConfig();
                        visualPropertiesConfig.eventName = jSONObjectOptJSONObject.optString(DbParams.KEY_CHANNEL_EVENT_NAME);
                        visualPropertiesConfig.eventType = jSONObjectOptJSONObject.optString("event_type");
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("event");
                        if (jSONObjectOptJSONObject2 != null) {
                            VisualConfig.VisualEvent visualEvent = new VisualConfig.VisualEvent();
                            visualEvent.elementPath = jSONObjectOptJSONObject2.optString("element_path");
                            visualEvent.elementPosition = jSONObjectOptJSONObject2.optString("element_position");
                            visualEvent.elementContent = jSONObjectOptJSONObject2.optString("element_content");
                            visualEvent.screenName = jSONObjectOptJSONObject2.optString("screen_name");
                            visualEvent.limitElementPosition = jSONObjectOptJSONObject2.optBoolean("limit_element_position");
                            visualEvent.limitElementContent = jSONObjectOptJSONObject2.optBoolean("limit_element_content");
                            visualEvent.isH5 = jSONObjectOptJSONObject2.optBoolean("h5");
                            visualPropertiesConfig.event = visualEvent;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(SAPropertyFilter.PROPERTIES);
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                VisualConfig.VisualProperty visualProperty = new VisualConfig.VisualProperty();
                                visualProperty.elementPath = jSONObjectOptJSONObject3.optString("element_path");
                                visualProperty.elementPosition = jSONObjectOptJSONObject3.optString("element_position");
                                visualProperty.screenName = jSONObjectOptJSONObject3.optString("screen_name");
                                visualProperty.name = jSONObjectOptJSONObject3.optString("name");
                                visualProperty.regular = jSONObjectOptJSONObject3.optString("regular");
                                visualProperty.isH5 = jSONObjectOptJSONObject3.optBoolean("h5");
                                visualProperty.type = jSONObjectOptJSONObject3.optString("type");
                                visualProperty.webViewElementPath = jSONObjectOptJSONObject3.optString("webview_element_path");
                                arrayList2.add(visualProperty);
                            }
                            visualPropertiesConfig.properties = arrayList2;
                        }
                        arrayList.add(visualPropertiesConfig);
                    }
                }
                visualConfig.events = arrayList;
            }
            return visualConfig;
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public void save2Cache(String str) {
        SALog.i(TAG, "save2Cache config is:" + str);
        PersistentLoader.getInstance().getVisualConfigPst().commit(str);
        doOnSaveCache(str);
        FlutterUtils.visualizedPropertiesConfigChanged();
    }
}
