package com.sensorsdata.analytics.android.sdk.visual;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.autotrack.core.beans.AutoTrackConstants;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.ThreadUtils;
import com.sensorsdata.analytics.android.sdk.visual.constant.VisualConstants;
import com.sensorsdata.analytics.android.sdk.visual.model.VisualConfig;
import com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class VisualDebugHelper {
    private static final String TAG = "SA.VP.VisualDebugHelper";
    private JSONArray mJsonArray;
    private TrackEventAdapter mEventListener = null;
    private final Object object = new Object();

    public static abstract class TrackEventAdapter implements SAEventListener {
        private TrackEventAdapter() {
        }

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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handlerEvent(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (VisualizedAutoTrackService.getInstance().isServiceRunning()) {
                String strOptString = jSONObject.optString("event");
                if (!TextUtils.equals("$AppClick", strOptString) && !TextUtils.equals(VisualConstants.WEB_CLICK_EVENT_NAME, strOptString)) {
                    SALog.i(TAG, "eventName is " + strOptString + " filter");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SAPropertyFilter.PROPERTIES);
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                if (VisualPropertiesManager.getInstance().checkAppIdAndProject()) {
                    VisualConfig visualConfig = VisualPropertiesManager.getInstance().getVisualConfig();
                    if (visualConfig == null) {
                        return;
                    }
                    List<VisualConfig.VisualPropertiesConfig> list = visualConfig.events;
                    if (list != null && list.size() != 0) {
                        if (TextUtils.equals("$AppClick", strOptString)) {
                            String strOptString2 = jSONObjectOptJSONObject.optString("$screen_name");
                            if (TextUtils.isEmpty(strOptString2)) {
                                SALog.i(TAG, "screenName is empty ");
                                return;
                            }
                            List<VisualConfig.VisualPropertiesConfig> matchEventConfigList = VisualPropertiesManager.getInstance().getMatchEventConfigList(list, VisualPropertiesManager.VisualEventType.getVisualEventType(strOptString), strOptString2, jSONObjectOptJSONObject.optString(VisualConstants.ELEMENT_PATH), jSONObjectOptJSONObject.optString(VisualConstants.ELEMENT_POSITION), jSONObjectOptJSONObject.optString(AutoTrackConstants.ELEMENT_CONTENT));
                            if (matchEventConfigList.size() > 0) {
                                synchronized (this.object) {
                                    for (VisualConfig.VisualPropertiesConfig visualPropertiesConfig : matchEventConfigList) {
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            JSONUtils.mergeJSONObject(jSONObject, jSONObject2);
                                            jSONObject2.put(DbParams.KEY_CHANNEL_EVENT_NAME, visualPropertiesConfig.eventName);
                                            if (this.mJsonArray == null) {
                                                this.mJsonArray = new JSONArray();
                                            }
                                            this.mJsonArray.put(jSONObject2);
                                        } catch (Exception e2) {
                                            SALog.printStackTrace(e2);
                                        }
                                    }
                                }
                            }
                        } else if (TextUtils.equals(VisualConstants.WEB_CLICK_EVENT_NAME, strOptString)) {
                            try {
                                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("sensorsdata_web_visual_eventName");
                                if (jSONArrayOptJSONArray == null) {
                                    int iHashCode = jSONObject.hashCode();
                                    JSONArray eventName = VisualPropertiesManager.getInstance().getVisualPropertiesH5Helper().getEventName(iHashCode);
                                    VisualPropertiesManager.getInstance().getVisualPropertiesH5Helper().clearCache(iHashCode);
                                    jSONArrayOptJSONArray = eventName;
                                }
                                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                    synchronized (this.object) {
                                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                            try {
                                                JSONObject jSONObject3 = new JSONObject();
                                                JSONUtils.mergeJSONObject(jSONObject, jSONObject3);
                                                jSONObject3.put(DbParams.KEY_CHANNEL_EVENT_NAME, jSONArrayOptJSONArray.optString(i));
                                                if (this.mJsonArray == null) {
                                                    this.mJsonArray = new JSONArray();
                                                }
                                                this.mJsonArray.put(jSONObject3);
                                            } catch (Exception e3) {
                                                SALog.printStackTrace(e3);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                SALog.printStackTrace(e4);
                            }
                        }
                        return;
                    }
                    SALog.i(TAG, "propertiesConfigs is empty ");
                }
            }
        } catch (Exception e5) {
            SALog.printStackTrace(e5);
        }
    }

    public String getDebugInfo() {
        synchronized (this.object) {
            JSONArray jSONArray = this.mJsonArray;
            if (jSONArray == null) {
                return null;
            }
            String string = jSONArray.toString();
            this.mJsonArray = null;
            return string;
        }
    }

    public void startMonitor() {
        try {
            if (this.mEventListener == null) {
                final ExecutorService singlePool = ThreadUtils.getSinglePool();
                this.mEventListener = new TrackEventAdapter() { // from class: com.sensorsdata.analytics.android.sdk.visual.VisualDebugHelper.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
                    public void trackEvent(final JSONObject jSONObject) {
                        singlePool.execute(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.visual.VisualDebugHelper.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                VisualDebugHelper.this.handlerEvent(jSONObject);
                            }
                        });
                    }
                };
            }
            SensorsDataAPI.sharedInstance().addEventListener(this.mEventListener);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void stopMonitor() {
        try {
            if (this.mEventListener != null) {
                SensorsDataAPI.sharedInstance().removeEventListener(this.mEventListener);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
