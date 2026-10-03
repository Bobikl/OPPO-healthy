package com.sensorsdata.analytics.android.sdk.visual.property;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.AppStateTools;
import com.sensorsdata.analytics.android.sdk.util.SADisplayUtil;
import com.sensorsdata.analytics.android.sdk.util.SAViewUtils;
import com.sensorsdata.analytics.android.sdk.util.visual.ViewNode;
import com.sensorsdata.analytics.android.sdk.util.visual.ViewTreeStatusObservable;
import com.sensorsdata.analytics.android.sdk.visual.R;
import com.sensorsdata.analytics.android.sdk.visual.constant.VisualConstants;
import com.sensorsdata.analytics.android.sdk.visual.model.VisualConfig;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class VisualPropertiesManager {
    private static final String PROPERTY_TYPE_NUMBER = "NUMBER";
    private static final String TAG = "SA.VP.VisualPropertiesManager";
    private CollectLogListener mCollectLogListener;
    private final VisualPropertiesCache mConfigCache;
    private final VisualConfigRequestHelper mRequestHelper;
    private VisualConfig mVisualConfig;
    private final VisualPropertiesH5Helper mVisualPropertiesH5Helper;

    public interface CollectLogListener {
        void onCheckEventConfigFailure();

        void onCheckVisualConfigFailure(String str);

        void onFindPropertyElementFailure(String str, String str2, String str3);

        void onOtherError(String str);

        void onParsePropertyContentFailure(String str, String str2, String str3, String str4);

        void onStart(String str, String str2, ViewNode viewNode);

        void onSwitchClose();
    }

    public static class SingletonHolder {
        private static final VisualPropertiesManager INSTANCE = new VisualPropertiesManager();

        private SingletonHolder() {
        }
    }

    public enum VisualEventType {
        APP_CLICK("appclick", "$AppClick"),
        WEB_CLICK("appclick", VisualConstants.WEB_CLICK_EVENT_NAME);

        private final String trackEventType;
        private final String visualEventType;

        VisualEventType(String str, String str2) {
            this.visualEventType = str;
            this.trackEventType = str2;
        }

        public String getVisualEventType() {
            return this.visualEventType;
        }

        public static VisualEventType getVisualEventType(String str) {
            for (VisualEventType visualEventType : values()) {
                if (TextUtils.equals(visualEventType.trackEventType, str)) {
                    return visualEventType;
                }
            }
            return null;
        }
    }

    public static VisualPropertiesManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private void mergeVisualProperty(List<VisualConfig.VisualProperty> list, VisualConfig.VisualEvent visualEvent, JSONObject jSONObject, ViewNode viewNode, String str) {
        try {
            HashSet<String> hashSet = new HashSet<>();
            ViewTreeStatusObservable.getInstance().clearViewNodeCache();
            for (VisualConfig.VisualProperty visualProperty : list) {
                if (!visualProperty.isH5 || TextUtils.isEmpty(visualProperty.webViewElementPath)) {
                    mergeAppVisualProperty(visualProperty, visualEvent, jSONObject, viewNode);
                } else {
                    hashSet.add(visualProperty.webViewElementPath + visualProperty.screenName);
                }
            }
            if (hashSet.size() > 0) {
                this.mVisualPropertiesH5Helper.mergeJSVisualProperties(jSONObject, hashSet, str);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public boolean checkAppIdAndProject() {
        String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
        if (TextUtils.isEmpty(serverUrl)) {
            SALog.i(TAG, "serverUrl is empty and return");
            return false;
        }
        String queryParameter = Uri.parse(serverUrl).getQueryParameter("project");
        String processName = AppInfoUtils.getProcessName(SensorsDataAPI.sharedInstance().getSAContextManager().getContext());
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(processName)) {
            SALog.i(TAG, "project or app_id is empty and return");
            return false;
        }
        VisualConfig visualConfig = this.mVisualConfig;
        if (visualConfig == null) {
            SALog.i(TAG, "VisualConfig is null and return");
            return false;
        }
        if (!TextUtils.equals(processName, visualConfig.appId)) {
            SALog.i(TAG, String.format("app_id is not equals: current app_id is %s, config app_id is %s ", processName, this.mVisualConfig.appId));
            return false;
        }
        if (TextUtils.equals(queryParameter, this.mVisualConfig.project)) {
            return true;
        }
        SALog.i(TAG, String.format("project is not equals: current project is %s, config project is %s ", queryParameter, this.mVisualConfig.project));
        return false;
    }

    public List<VisualConfig.VisualPropertiesConfig> getMatchEventConfigList(List<VisualConfig.VisualPropertiesConfig> list, VisualEventType visualEventType, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        try {
            for (VisualConfig.VisualPropertiesConfig visualPropertiesConfig : list) {
                if (TextUtils.equals(visualPropertiesConfig.eventType, visualEventType.getVisualEventType())) {
                    VisualConfig.VisualEvent visualEvent = visualPropertiesConfig.event;
                    if (TextUtils.isEmpty(str) || TextUtils.equals(visualEvent.screenName, str)) {
                        if (visualEventType == VisualEventType.APP_CLICK || visualEventType == VisualEventType.WEB_CLICK) {
                            if (!TextUtils.equals(visualEvent.elementPath, str2)) {
                                SALog.i(TAG, String.format("event element_path is not match: current element_path is %s, config element_path is %s ", str2, visualEvent.elementPath));
                            } else if (visualEvent.limitElementPosition && !TextUtils.equals(visualEvent.elementPosition, str3)) {
                                SALog.i(TAG, String.format("event element_position is not match: current element_position is %s, config element_position is %s ", str3, visualEvent.elementPosition));
                            } else if (visualEvent.limitElementContent && !TextUtils.equals(visualEvent.elementContent, str4)) {
                                SALog.i(TAG, String.format("event element_content is not match: current element_content is %s, config element_content is %s ", str4, visualEvent.elementContent));
                            }
                        }
                        arrayList.add(visualPropertiesConfig);
                    }
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return arrayList;
    }

    public VisualConfig getVisualConfig() {
        return this.mVisualConfig;
    }

    public String getVisualConfigVersion() {
        VisualConfig visualConfig = this.mVisualConfig;
        if (visualConfig != null) {
            return visualConfig.version;
        }
        return null;
    }

    public VisualPropertiesCache getVisualPropertiesCache() {
        return this.mConfigCache;
    }

    public VisualPropertiesH5Helper getVisualPropertiesH5Helper() {
        return this.mVisualPropertiesH5Helper;
    }

    public void mergeAppVisualProperty(VisualConfig.VisualProperty visualProperty, VisualConfig.VisualEvent visualEvent, JSONObject jSONObject, ViewNode viewNode) {
        String viewContent;
        try {
            if (TextUtils.isEmpty(visualProperty.name)) {
                SALog.i(TAG, "config visual property name is empty");
                return;
            }
            if (TextUtils.isEmpty(visualProperty.elementPath)) {
                SALog.i(TAG, "config visual property elementPath is empty");
                return;
            }
            if (viewNode != null && !TextUtils.isEmpty(viewNode.getViewPosition()) && visualEvent != null && !TextUtils.isEmpty(visualEvent.elementPosition) && !visualEvent.limitElementPosition && !TextUtils.isEmpty(visualProperty.elementPosition) && TextUtils.equals(visualProperty.elementPath.split("-")[0], visualEvent.elementPath.split("-")[0])) {
                visualProperty.elementPosition = viewNode.getViewPosition();
                SALog.i(TAG, "visualProperty elementPosition replace: " + viewNode.getViewPosition());
            }
            String strGroup = null;
            try {
                ViewNode viewNode2 = ViewTreeStatusObservable.getInstance().getViewNode(viewNode != null ? viewNode.getView() : null, visualProperty.elementPath, visualProperty.elementPosition, visualProperty.screenName);
                if (viewNode2 == null || !TextUtils.equals(visualProperty.elementPath, viewNode2.getViewPath()) || (!TextUtils.isEmpty(visualProperty.elementPosition) && !TextUtils.equals(visualProperty.elementPosition, viewNode2.getViewPosition()))) {
                    viewContent = null;
                } else {
                    viewContent = viewNode2.getViewContent();
                    try {
                        WeakReference<View> view = viewNode2.getView() != null ? viewNode2.getView() : null;
                        if (view != null && view.get() != null) {
                            viewContent = SAViewUtils.getViewContent(view.get(), true);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        SALog.printStackTrace(e);
                    }
                }
            } catch (Exception e3) {
                e = e3;
                viewContent = null;
            }
            if (viewContent != null && !TextUtils.isEmpty(viewContent)) {
                SALog.i(TAG, String.format("find property target view success, property element_path: %s,element_position: %s,element_content: %s", visualProperty.elementPath, visualProperty.elementPosition, viewContent));
                if (!TextUtils.isEmpty(visualProperty.regular)) {
                    try {
                        Matcher matcher = Pattern.compile(visualProperty.regular, 40).matcher(viewContent);
                        if (!matcher.find()) {
                            SALog.i(TAG, "matcher not find continue");
                            CollectLogListener collectLogListener = this.mCollectLogListener;
                            if (collectLogListener != null) {
                                collectLogListener.onParsePropertyContentFailure(visualProperty.name, visualProperty.type, viewContent, visualProperty.regular);
                                return;
                            }
                            return;
                        }
                        strGroup = matcher.group();
                        SALog.i(TAG, String.format("propertyValue is: %s", strGroup));
                    } catch (Exception e4) {
                        CollectLogListener collectLogListener2 = this.mCollectLogListener;
                        if (collectLogListener2 != null) {
                            collectLogListener2.onParsePropertyContentFailure(visualProperty.name, visualProperty.type, viewContent, visualProperty.regular);
                        }
                        SALog.printStackTrace(e4);
                        return;
                    }
                }
                if (TextUtils.isEmpty(strGroup)) {
                    return;
                }
                if (!TextUtils.equals(PROPERTY_TYPE_NUMBER, visualProperty.type)) {
                    try {
                        jSONObject.put(visualProperty.name, strGroup);
                        return;
                    } catch (JSONException e5) {
                        CollectLogListener collectLogListener3 = this.mCollectLogListener;
                        if (collectLogListener3 != null) {
                            collectLogListener3.onOtherError(e5.getMessage());
                            return;
                        }
                        return;
                    }
                }
                if (strGroup != null) {
                    try {
                        jSONObject.put(visualProperty.name, NumberFormat.getInstance().parse(strGroup));
                        return;
                    } catch (Exception e6) {
                        CollectLogListener collectLogListener4 = this.mCollectLogListener;
                        if (collectLogListener4 != null) {
                            collectLogListener4.onOtherError(e6.getMessage());
                            return;
                        }
                        return;
                    }
                }
                return;
                SALog.printStackTrace(e);
            }
            CollectLogListener collectLogListener5 = this.mCollectLogListener;
            if (collectLogListener5 != null) {
                collectLogListener5.onFindPropertyElementFailure(visualProperty.name, visualProperty.elementPath, visualProperty.elementPosition);
            }
        } catch (Exception e7) {
            SALog.printStackTrace(e7);
        }
    }

    public void mergeVisualProperties(VisualEventType visualEventType, JSONObject jSONObject, ViewNode viewNode) {
        String viewPath;
        String viewPosition;
        String viewContent;
        WeakReference<View> view;
        try {
            String strOptString = jSONObject.optString("$screen_name");
            CollectLogListener collectLogListener = this.mCollectLogListener;
            if (collectLogListener != null) {
                collectLogListener.onStart(visualEventType.visualEventType, strOptString, viewNode);
            }
            SALog.i(TAG, String.format("mergeVisualProperties eventType: %s, screenName:%s ", visualEventType.getVisualEventType(), strOptString));
            if (TextUtils.isEmpty(strOptString)) {
                SALog.i(TAG, "screenName is empty and return");
                return;
            }
            if (!SensorsDataAPI.sharedInstance().isVisualizedAutoTrackEnabled()) {
                SALog.i(TAG, "you should call 'enableVisualizedAutoTrack(true)' first");
                CollectLogListener collectLogListener2 = this.mCollectLogListener;
                if (collectLogListener2 != null) {
                    collectLogListener2.onSwitchClose();
                    return;
                }
                return;
            }
            Activity activityOfView = (viewNode == null || (view = viewNode.getView()) == null || view.get() == null) ? null : SAViewUtils.getActivityOfView(view.get().getContext(), view.get());
            if (activityOfView == null) {
                activityOfView = AppStateTools.getInstance().getForegroundActivity();
            }
            if (activityOfView != null && SensorsDataAPI.sharedInstance().isVisualizedAutoTrackActivity(activityOfView.getClass())) {
                if (this.mVisualConfig == null) {
                    SALog.i(TAG, "visual properties is empty and return");
                    CollectLogListener collectLogListener3 = this.mCollectLogListener;
                    if (collectLogListener3 != null) {
                        collectLogListener3.onCheckVisualConfigFailure(SADisplayUtil.getStringResource(SensorsDataAPI.sharedInstance().getSAContextManager().getContext(), R.string.sensors_analytics_visual_cache_no_property_error));
                        return;
                    }
                    return;
                }
                if (!checkAppIdAndProject()) {
                    CollectLogListener collectLogListener4 = this.mCollectLogListener;
                    if (collectLogListener4 != null) {
                        collectLogListener4.onCheckVisualConfigFailure(SADisplayUtil.getStringResource(SensorsDataAPI.sharedInstance().getSAContextManager().getContext(), R.string.sensors_analytics_visual_appid_error));
                        return;
                    }
                    return;
                }
                List<VisualConfig.VisualPropertiesConfig> list = this.mVisualConfig.events;
                if (list != null && list.size() != 0) {
                    if (viewNode != null) {
                        viewPath = viewNode.getViewPath();
                        viewPosition = viewNode.getViewPosition();
                        viewContent = viewNode.getViewContent();
                    } else {
                        viewPath = null;
                        viewPosition = null;
                        viewContent = null;
                    }
                    List<VisualConfig.VisualPropertiesConfig> matchEventConfigList = getMatchEventConfigList(list, visualEventType, strOptString, viewPath, viewPosition, viewContent);
                    if (matchEventConfigList.size() == 0) {
                        SALog.i(TAG, "event config is empty and return");
                        CollectLogListener collectLogListener5 = this.mCollectLogListener;
                        if (collectLogListener5 != null) {
                            collectLogListener5.onCheckEventConfigFailure();
                            return;
                        }
                        return;
                    }
                    for (VisualConfig.VisualPropertiesConfig visualPropertiesConfig : matchEventConfigList) {
                        VisualConfig.VisualEvent visualEvent = visualPropertiesConfig.event;
                        if (visualEvent == null || !visualEvent.isH5) {
                            List<VisualConfig.VisualProperty> list2 = visualPropertiesConfig.properties;
                            if (list2 == null || list2.size() == 0) {
                                SALog.i(TAG, "properties is empty ");
                            } else {
                                mergeVisualProperty(list2, visualEvent, jSONObject, viewNode, visualPropertiesConfig.eventName);
                            }
                        }
                    }
                    return;
                }
                SALog.i(TAG, "propertiesConfigs is empty");
                CollectLogListener collectLogListener6 = this.mCollectLogListener;
                if (collectLogListener6 != null) {
                    collectLogListener6.onOtherError("propertiesConfigs is empty");
                    return;
                }
                return;
            }
            SALog.i(TAG, "activity is null or not in white list and return");
            CollectLogListener collectLogListener7 = this.mCollectLogListener;
            if (collectLogListener7 != null) {
                collectLogListener7.onOtherError("activity is null or not in white list and return");
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void registerCollectLogListener(CollectLogListener collectLogListener) {
        this.mCollectLogListener = collectLogListener;
    }

    public void requestVisualConfig(SAContextManager sAContextManager) {
        if (sAContextManager != null) {
            try {
                if (sAContextManager.getSensorsDataAPI().isNetworkRequestEnable() && !AbstractSensorsDataAPI.isSDKDisabled()) {
                    if (sAContextManager.getInternalConfigs().saConfigOptions.isVisualizedPropertiesEnabled()) {
                        SALog.i(TAG, Modules.Visual.METHOD_REQUEST_VISUAL_CONFIG);
                        this.mRequestHelper.requestVisualConfig(sAContextManager.getContext(), getVisualConfigVersion(), new VisualConfigRequestHelper.IApiCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager.1
                            @Override // com.sensorsdata.analytics.android.sdk.visual.property.VisualConfigRequestHelper.IApiCallback
                            public void onSuccess(String str) {
                                VisualPropertiesManager.this.save2Cache(str);
                            }
                        });
                        return;
                    }
                    return;
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return;
            }
        }
        SALog.i(TAG, "Close network request");
    }

    public void save2Cache(String str) {
        this.mConfigCache.save2Cache(str);
        this.mVisualConfig = this.mConfigCache.getVisualConfig();
    }

    public void unRegisterCollectLogListener() {
        this.mCollectLogListener = null;
    }

    private VisualPropertiesManager() {
        VisualPropertiesCache visualPropertiesCache = new VisualPropertiesCache();
        this.mConfigCache = visualPropertiesCache;
        this.mVisualConfig = visualPropertiesCache.getVisualConfig();
        this.mRequestHelper = new VisualConfigRequestHelper();
        this.mVisualPropertiesH5Helper = new VisualPropertiesH5Helper();
    }
}
