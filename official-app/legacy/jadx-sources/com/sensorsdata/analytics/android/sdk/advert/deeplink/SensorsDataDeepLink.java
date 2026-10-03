package com.sensorsdata.analytics.android.sdk.advert.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.health.esim.nec.NecBrowserActivity;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.SAAdvertConstants;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.core.SACoreHelper;
import com.sensorsdata.analytics.android.sdk.core.event.InputData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.internal.beans.ServerUrl;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class SensorsDataDeepLink extends AbsDeepLink {
    private String adSlinkId;
    private String adSlinkTemplateId;
    private String adSlinkType;
    private final String customADChannelUrl;
    private JSONObject customParams;
    private String errorMsg;
    private String pageParams;
    private final String project;
    private final String serverUrl;
    private boolean success;

    public SensorsDataDeepLink(Intent intent, String str, String str2) {
        super(intent);
        this.serverUrl = str;
        this.customADChannelUrl = str2;
        this.project = new ServerUrl(str).getProject();
    }

    private String getSlinkRequestUrl() {
        return !TextUtils.isEmpty(this.customADChannelUrl) ? NetworkUtils.getRequestUrl(this.customADChannelUrl, "slink/config/query") : "";
    }

    private boolean isSlink(Uri uri, String str) {
        List<String> pathSegments;
        if (TextUtils.isEmpty(str) || (pathSegments = uri.getPathSegments()) == null || pathSegments.isEmpty() || !pathSegments.get(0).equals("slink")) {
            return false;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        return NetworkUtils.compareMainDomain(str, host) || host.equals(DbParams.DATABASE_NAME);
    }

    public String getRequestUrl() {
        int iLastIndexOf;
        if (TextUtils.isEmpty(this.serverUrl) || (iLastIndexOf = this.serverUrl.lastIndexOf("/")) == -1) {
            return "";
        }
        return this.serverUrl.substring(0, iLastIndexOf) + "/sdk/deeplink/param";
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkProcessor
    public void mergeDeepLinkProperty(JSONObject jSONObject) {
        try {
            jSONObject.put(SAAdvertConstants.Properties.DEEPLINK_URL, getDeepLinkUrl());
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkProcessor
    public void parseDeepLink(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return;
        }
        Uri data = intent.getData();
        String lastPathSegment = data.getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("key", lastPathSegment);
        map.put("system_type", "ANDROID");
        map.put("project", this.project);
        new RequestHelper.Builder(HttpMethod.GET, isSlink(data, NetworkUtils.getHost(this.customADChannelUrl)) ? getSlinkRequestUrl() : getRequestUrl()).params(map).callback(new HttpCallback.JsonCallback() { // from class: com.sensorsdata.analytics.android.sdk.advert.deeplink.SensorsDataDeepLink.1
            @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback.JsonCallback, com.sensorsdata.analytics.android.sdk.network.HttpCallback
            public void onAfter() {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                final JSONObject jSONObject = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(SensorsDataDeepLink.this.pageParams)) {
                        jSONObject.put(SAAdvertConstants.Properties.DEEPLINK_OPTIONS, SensorsDataDeepLink.this.pageParams);
                    }
                    if (!TextUtils.isEmpty(SensorsDataDeepLink.this.errorMsg)) {
                        jSONObject.put(SAAdvertConstants.Properties.MATCH_FAIL_REASON, SensorsDataDeepLink.this.errorMsg);
                    }
                    if (!TextUtils.isEmpty(SensorsDataDeepLink.this.adSlinkId)) {
                        jSONObject.put(SAAdvertConstants.Properties.SLINK_ID, SensorsDataDeepLink.this.adSlinkId);
                    }
                    jSONObject.put(SAAdvertConstants.Properties.DEEPLINK_URL, SensorsDataDeepLink.this.getDeepLinkUrl());
                    jSONObject.put("$event_duration", TimeUtils.duration(jCurrentTimeMillis2));
                    if (!TextUtils.isEmpty(SensorsDataDeepLink.this.adSlinkTemplateId)) {
                        jSONObject.put(SAAdvertConstants.Properties.SLINK_TEMPLATE_ID, SensorsDataDeepLink.this.adSlinkTemplateId);
                    }
                    if (!TextUtils.isEmpty(SensorsDataDeepLink.this.adSlinkType)) {
                        jSONObject.put(SAAdvertConstants.Properties.SLINK_TYPE, SensorsDataDeepLink.this.adSlinkType);
                    }
                    if (SensorsDataDeepLink.this.customParams != null && SensorsDataDeepLink.this.customParams.length() > 0) {
                        jSONObject.put(SAAdvertConstants.Properties.SLINK_CUSTOM_PARAMS, SensorsDataDeepLink.this.customParams.toString());
                    }
                } catch (JSONException e2) {
                    SALog.printStackTrace(e2);
                }
                JSONUtils.mergeJSONObject(ChannelUtils.getUtmProperties(), jSONObject);
                SensorsDataDeepLink sensorsDataDeepLink = SensorsDataDeepLink.this;
                DeepLinkManager.OnDeepLinkParseFinishCallback onDeepLinkParseFinishCallback = sensorsDataDeepLink.mCallBack;
                if (onDeepLinkParseFinishCallback != null) {
                    onDeepLinkParseFinishCallback.onFinish(DeepLinkManager.DeepLinkType.SENSORSDATA, sensorsDataDeepLink.pageParams, SensorsDataDeepLink.this.customParams, SensorsDataDeepLink.this.success, jCurrentTimeMillis2);
                }
                SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.deeplink.SensorsDataDeepLink.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.TRACK).setEventName(SAAdvertConstants.EventName.MATCH_RESULT).setProperties(jSONObject));
                    }
                });
            }

            @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
            public void onFailure(int i, String str) {
                SensorsDataDeepLink.this.errorMsg = str;
                SensorsDataDeepLink.this.success = false;
            }

            @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
            public void onResponse(JSONObject jSONObject) {
                if (jSONObject == null) {
                    SensorsDataDeepLink.this.success = false;
                    return;
                }
                SensorsDataDeepLink.this.success = true;
                ChannelUtils.parseParams(JSONUtils.json2Map(jSONObject.optJSONObject("channel_params")));
                SensorsDataDeepLink.this.pageParams = jSONObject.optString("page_params");
                SensorsDataDeepLink.this.errorMsg = jSONObject.optString("errorMsg");
                if (TextUtils.isEmpty(SensorsDataDeepLink.this.errorMsg)) {
                    SensorsDataDeepLink.this.errorMsg = jSONObject.optString(NecBrowserActivity.ERROR_MSG);
                }
                SensorsDataDeepLink.this.adSlinkId = jSONObject.optString("ad_slink_id");
                SensorsDataDeepLink.this.adSlinkTemplateId = jSONObject.optString("slink_template_id");
                SensorsDataDeepLink.this.adSlinkType = jSONObject.optString("slink_type");
                SensorsDataDeepLink.this.customParams = jSONObject.optJSONObject("custom_params");
                if (TextUtils.isEmpty(SensorsDataDeepLink.this.errorMsg)) {
                    return;
                }
                SensorsDataDeepLink.this.success = false;
            }
        }).execute();
    }
}
