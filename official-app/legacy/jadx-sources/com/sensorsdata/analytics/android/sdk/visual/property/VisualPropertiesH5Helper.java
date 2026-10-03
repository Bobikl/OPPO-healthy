package com.sensorsdata.analytics.android.sdk.visual.property;

import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import com.sensorsdata.analytics.android.sdk.util.visual.ViewNode;
import com.sensorsdata.analytics.android.sdk.util.visual.ViewTreeStatusObservable;
import com.sensorsdata.analytics.android.sdk.visual.bridge.JSBridgeHelper;
import com.sensorsdata.analytics.android.sdk.visual.bridge.OnBridgeCallback;
import com.sensorsdata.analytics.android.sdk.visual.bridge.WebViewJavascriptBridge;
import com.sensorsdata.analytics.android.sdk.visual.constant.VisualConstants;
import com.sensorsdata.analytics.android.sdk.visual.model.VisualConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class VisualPropertiesH5Helper implements WebViewJavascriptBridge {
    private SAEventListener mSAEventListener;
    private SparseArray<JSONArray> mSparseArray = new SparseArray<>();
    private JSBridgeHelper mJSBridgeHelper = new JSBridgeHelper();

    private static String Base642string(String str) {
        return new String(Base64.decode(str.getBytes(), 0));
    }

    private void addSAEventListener() {
        if (this.mSAEventListener == null) {
            this.mSAEventListener = new SAEventListener() { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesH5Helper.2
                @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
                public void identify() {
                }

                @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
                public void login() {
                }

                @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
                public void logout() {
                }

                @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
                public void resetAnonymousId() {
                }

                @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
                public void trackEvent(JSONObject jSONObject) {
                    JSONObject jSONObjectOptJSONObject;
                    try {
                        if (TextUtils.equals(VisualConstants.WEB_CLICK_EVENT_NAME, jSONObject.optString("event")) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(SAPropertyFilter.PROPERTIES)) != null) {
                            if (jSONObjectOptJSONObject.has("sensorsdata_web_visual_eventName")) {
                                VisualPropertiesH5Helper.this.mSparseArray.put(jSONObject.hashCode(), jSONObjectOptJSONObject.optJSONArray("sensorsdata_web_visual_eventName"));
                                jSONObjectOptJSONObject.remove("sensorsdata_web_visual_eventName");
                            }
                            String strOptString = jSONObjectOptJSONObject.optString("sensorsdata_app_visual_properties");
                            jSONObjectOptJSONObject.remove("sensorsdata_app_visual_properties");
                            if (!TextUtils.isEmpty(strOptString) && AbstractSensorsDataAPI.getConfigOptions().isVisualizedPropertiesEnabled()) {
                                String strDecodeString = Base64Coder.decodeString(strOptString);
                                if (TextUtils.isEmpty(strDecodeString)) {
                                    return;
                                }
                                try {
                                    JSONArray jSONArray = new JSONArray(strDecodeString);
                                    ViewTreeStatusObservable.getInstance().clearViewNodeCache();
                                    if (jSONArray.length() > 0) {
                                        for (int i = 0; i < jSONArray.length(); i++) {
                                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                            VisualConfig.VisualProperty visualProperty = new VisualConfig.VisualProperty();
                                            visualProperty.elementPath = jSONObject2.optString("element_path");
                                            visualProperty.elementPosition = jSONObject2.optString("element_position");
                                            visualProperty.screenName = jSONObject2.optString("screen_name");
                                            visualProperty.name = jSONObject2.optString("name");
                                            visualProperty.regular = jSONObject2.optString("regular");
                                            visualProperty.isH5 = jSONObject2.optBoolean("h5");
                                            visualProperty.type = jSONObject2.optString("type");
                                            visualProperty.webViewElementPath = jSONObject2.optString("webview_element_path");
                                            VisualPropertiesManager.getInstance().mergeAppVisualProperty(visualProperty, null, jSONObjectOptJSONObject, null);
                                        }
                                    }
                                } catch (JSONException e2) {
                                    SALog.printStackTrace(e2);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        SALog.printStackTrace(e3);
                    }
                }
            };
            SensorsDataAPI.sharedInstance().addEventListener(this.mSAEventListener);
        }
    }

    private void getJSVisualProperties(View view, String str, String str2, OnBridgeCallback onBridgeCallback) {
        try {
            JSONArray h5JsonArrayFromCache = VisualPropertiesManager.getInstance().getVisualPropertiesCache().getH5JsonArrayFromCache(str2, str);
            if (h5JsonArrayFromCache == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sensorsdata_js_visual_properties", h5JsonArrayFromCache);
            } catch (JSONException e2) {
                SALog.printStackTrace(e2);
            }
            sendToWeb(view, "getJSVisualProperties", jSONObject, onBridgeCallback);
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }

    public void clearCache(int i) {
        try {
            this.mSparseArray.remove(i);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public JSONArray getEventName(int i) {
        try {
            return this.mSparseArray.get(i);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public void mergeJSVisualProperties(final JSONObject jSONObject, HashSet<String> hashSet, String str) {
        View view;
        if (hashSet != null) {
            try {
                if (hashSet.size() == 0) {
                    return;
                }
                Iterator<String> it = hashSet.iterator();
                final CountDownLatch countDownLatch = new CountDownLatch(hashSet.size());
                while (it.hasNext()) {
                    ViewNode viewNode = ViewTreeStatusObservable.getInstance().getViewNode(it.next());
                    if (viewNode != null && viewNode.getView() != null && (view = viewNode.getView().get()) != null) {
                        getJSVisualProperties(view, viewNode.getViewPath(), str, new OnBridgeCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesH5Helper.1
                            @Override // com.sensorsdata.analytics.android.sdk.visual.bridge.OnBridgeCallback
                            public void onCallBack(String str2) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject(str2);
                                    Iterator<String> itKeys = jSONObject2.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        String strOptString = jSONObject2.optString(next);
                                        if (!TextUtils.isEmpty(next)) {
                                            jSONObject.put(next, strOptString);
                                        }
                                    }
                                } catch (JSONException e2) {
                                    SALog.printStackTrace(e2);
                                } finally {
                                    countDownLatch.countDown();
                                }
                            }
                        });
                    }
                }
                try {
                    countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    SALog.printStackTrace(e2);
                }
            } catch (Exception e3) {
                SALog.printStackTrace(e3);
            }
        }
    }

    public void registerListeners() {
        try {
            this.mJSBridgeHelper.addSAJSListener();
            addSAEventListener();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.bridge.WebViewJavascriptBridge
    public void sendToWeb(View view, String str, Object obj, OnBridgeCallback onBridgeCallback) {
        this.mJSBridgeHelper.sendToWeb(view, str, obj, onBridgeCallback);
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.bridge.WebViewJavascriptBridge
    public void sendToWeb(View view, String str, Object obj) {
        this.mJSBridgeHelper.sendToWeb(view, str, obj);
    }
}
