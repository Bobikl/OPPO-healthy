package com.sensorsdata.analytics.android.sdk.advert.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpConst;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.advert.SAAdvertConstants;
import com.sensorsdata.analytics.android.sdk.advert.oaid.SAOaidHelper;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.SAAdvertUtils;
import com.sensorsdata.analytics.android.sdk.core.SACoreHelper;
import com.sensorsdata.analytics.android.sdk.core.event.InputData;
import com.sensorsdata.analytics.android.sdk.core.eventbus.SAEventBus;
import com.sensorsdata.analytics.android.sdk.core.eventbus.SAEventBusConstants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.deeplink.SADeepLinkObject;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeferredDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.internal.beans.ServerUrl;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DeepLinkManager {
    public static final String IS_ANALYTICS_DEEPLINK = "is_analytics_deeplink";
    private static JSONObject mCacheProperties = null;
    private static SensorsDataDeepLinkCallback mDeepLinkCallback = null;
    private static DeepLinkProcessor mDeepLinkProcessor = null;
    private static SensorsDataDeferredDeepLinkCallback mDeferredDeepLinkCallback = null;
    private static boolean mEnableDeepLinkInstallSource = false;
    private static boolean mIsDeepLink = false;

    public enum DeepLinkType {
        CHANNEL,
        SENSORSDATA
    }

    public interface OnDeepLinkParseFinishCallback {
        void onFinish(DeepLinkType deepLinkType, String str, JSONObject jSONObject, boolean z, long j2);
    }

    private static void cacheProperties() {
        if (mCacheProperties == null) {
            mCacheProperties = new JSONObject();
        }
        mergeDeepLinkProperty(mCacheProperties);
    }

    private static DeepLinkProcessor createDeepLink(Intent intent, String str, String str2) {
        if (intent == null) {
            return null;
        }
        if (isSensorsDataDeepLink(intent, new ServerUrl(str).getHost(), NetworkUtils.getHost(str2))) {
            return new SensorsDataDeepLink(intent, str, str2);
        }
        if (isUtmDeepLink(intent)) {
            return new ChannelDeepLink(intent);
        }
        return null;
    }

    public static void enableDeepLinkInstallSource(boolean z) {
        mEnableDeepLinkInstallSource = z;
    }

    public static boolean isDeepLink(Intent intent) {
        return (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) ? false : true;
    }

    private static boolean isParsedDeepLink(Activity activity) {
        Intent intent;
        try {
            if ((!SensorsDataUtils.isUniApp() || !ChannelUtils.isDeepLinkBlackList(activity)) && (intent = activity.getIntent()) != null && intent.getData() != null) {
                return intent.getBooleanExtra(IS_ANALYTICS_DEEPLINK, false);
            }
        } catch (Throwable th) {
            SALog.i(SAAdvertConstants.TAG, th.getMessage());
        }
        return false;
    }

    private static boolean isSensorsDataDeepLink(Intent intent, String str, String str2) {
        Uri data;
        List<String> pathSegments;
        if (!isDeepLink(intent) || (pathSegments = (data = intent.getData()).getPathSegments()) == null || pathSegments.isEmpty()) {
            return false;
        }
        String host = data.getHost();
        if (pathSegments.get(0).equals("slink")) {
            if (TextUtils.isEmpty(host) || TextUtils.isEmpty(str2)) {
                return false;
            }
            return NetworkUtils.compareMainDomain(str2, host) || host.equals(DbParams.DATABASE_NAME);
        }
        if (!pathSegments.get(0).equals("sd") || TextUtils.isEmpty(str) || TextUtils.isEmpty(host)) {
            return false;
        }
        return host.equals(str) || host.equals(DbParams.DATABASE_NAME);
    }

    private static boolean isUtmDeepLink(Intent intent) {
        if (!isDeepLink(intent)) {
            return false;
        }
        Uri data = intent.getData();
        if (data.isOpaque()) {
            SALog.d("ChannelDeepLink", data + " isOpaque");
            return false;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.size() <= 0) {
            return false;
        }
        return ChannelUtils.hasLinkUtmProperties(queryParameterNames);
    }

    public static void mergeCacheProperties(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = mCacheProperties) == null || jSONObject2.length() == 0) {
            return;
        }
        JSONUtils.mergeJSONObject(mCacheProperties, jSONObject);
        mCacheProperties = null;
    }

    public static void mergeDeepLinkProperty(JSONObject jSONObject) {
        try {
            DeepLinkProcessor deepLinkProcessor = mDeepLinkProcessor;
            if (deepLinkProcessor != null) {
                deepLinkProcessor.mergeDeepLinkProperty(jSONObject);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void parseDeepLink(Activity activity, final boolean z) {
        try {
            if (isDeepLink(activity.getIntent()) && !isParsedDeepLink(activity)) {
                Intent intent = activity.getIntent();
                DeepLinkProcessor deepLinkProcessorCreateDeepLink = createDeepLink(intent, SensorsDataAPI.sharedInstance().getServerUrl(), AbstractSensorsDataAPI.getConfigOptions().getCustomADChannelUrl());
                mDeepLinkProcessor = deepLinkProcessorCreateDeepLink;
                if (deepLinkProcessorCreateDeepLink == null) {
                    return;
                }
                ChannelUtils.clearUtm();
                mIsDeepLink = true;
                mDeepLinkProcessor.setDeepLinkParseFinishCallback(new OnDeepLinkParseFinishCallback() { // from class: com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkManager.2
                    @Override // com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkManager.OnDeepLinkParseFinishCallback
                    public void onFinish(DeepLinkType deepLinkType, String str, JSONObject jSONObject, boolean z2, long j2) {
                        if (z) {
                            ChannelUtils.saveDeepLinkInfo();
                        }
                        SAEventBus.getInstance().post(SAEventBusConstants.Tag.DEEPLINK_LAUNCH, ChannelUtils.getLatestUtmProperties());
                        if (deepLinkType == DeepLinkType.SENSORSDATA) {
                            try {
                                if (DeepLinkManager.mDeferredDeepLinkCallback != null) {
                                    DeepLinkManager.mDeferredDeepLinkCallback.onReceive(new SADeepLinkObject(str, jSONObject, "", z2, j2));
                                } else if (DeepLinkManager.mDeepLinkCallback != null) {
                                    DeepLinkManager.mDeepLinkCallback.onReceive(str, z2, j2);
                                }
                            } catch (Exception e2) {
                                SALog.printStackTrace(e2);
                            }
                        }
                    }
                });
                mDeepLinkProcessor.parseDeepLink(intent);
                cacheProperties();
                trackDeepLinkLaunchEvent(activity.getApplicationContext(), mDeepLinkProcessor);
                activity.getIntent().putExtra(IS_ANALYTICS_DEEPLINK, true);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void requestDeferredDeepLink(Context context, JSONObject jSONObject, String str, String str2, JSONObject jSONObject2, String str3, boolean z) {
        String deviceInfo;
        if (mIsDeepLink) {
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            String openAdIdentifierByReflection = SAOaidHelper.getOpenAdIdentifierByReflection(context);
            if (jSONObject != null) {
                if (jSONObject.has("$oaid")) {
                    str2 = jSONObject.optString("$oaid");
                    openAdIdentifierByReflection = "";
                    jSONObject.remove("$oaid");
                }
                deviceInfo = ChannelUtils.getDeviceInfo(context, str, str2, openAdIdentifierByReflection);
                if (jSONObject.has("$gaid")) {
                    deviceInfo = String.format("%s##gaid=%s", deviceInfo, jSONObject.optString("$gaid"));
                    jSONObject.remove("$gaid");
                }
                if (jSONObject.has("$user_agent")) {
                    jSONObject3.put(HttpConst.UA, jSONObject.optString("$user_agent"));
                    jSONObject.remove("$user_agent");
                }
                jSONObject3.put("app_parameter", jSONObject.toString());
            } else {
                deviceInfo = ChannelUtils.getDeviceInfo(context, str, str2, openAdIdentifierByReflection);
            }
            jSONObject3.put("ids", Base64Coder.encodeString(deviceInfo));
            jSONObject3.put("model", jSONObject2.optString("$model"));
            jSONObject3.put("os", jSONObject2.optString("$os"));
            jSONObject3.put("os_version", jSONObject2.optString("$os_version"));
            jSONObject3.put("network", jSONObject2.optString("$network_type"));
            jSONObject3.put("app_id", jSONObject2.optString("$app_id"));
            jSONObject3.put("app_version", jSONObject2.optString("$app_version"));
            jSONObject3.put("timestamp", String.valueOf(System.currentTimeMillis()));
            jSONObject3.put("project", new ServerUrl(SensorsDataAPI.sharedInstance().getServerUrl()).getProject());
            DeferredDeepLinkHelper.request(jSONObject3, mDeferredDeepLinkCallback, str3, z);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void resetDeepLinkProcessor() {
        mDeepLinkProcessor = null;
    }

    public static void setDeepLinkCallback(SensorsDataDeepLinkCallback sensorsDataDeepLinkCallback) {
        mDeepLinkCallback = sensorsDataDeepLinkCallback;
    }

    public static void setDeferredDeepLinkCallback(SensorsDataDeferredDeepLinkCallback sensorsDataDeferredDeepLinkCallback) {
        mDeferredDeepLinkCallback = sensorsDataDeferredDeepLinkCallback;
    }

    private static void trackDeepLinkLaunchEvent(final Context context, DeepLinkProcessor deepLinkProcessor) {
        final JSONObject jSONObject = new JSONObject();
        final boolean z = (deepLinkProcessor instanceof SensorsDataDeepLink) && mEnableDeepLinkInstallSource;
        try {
            jSONObject.put(SAAdvertConstants.Properties.DEEPLINK_URL, deepLinkProcessor.getDeepLinkUrl());
            jSONObject.put("$time", new Date(System.currentTimeMillis()));
            jSONObject.put("$sat_has_installed_app", SAAdvertUtils.isInstallationTracked());
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
        JSONUtils.mergeJSONObject(ChannelUtils.getLatestUtmProperties(), jSONObject);
        JSONUtils.mergeJSONObject(ChannelUtils.getUtmProperties(), jSONObject);
        SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkManager.1
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    try {
                        JSONObject jSONObject2 = jSONObject;
                        Context context2 = context;
                        jSONObject2.put("$ios_install_source", ChannelUtils.getDeviceInfo(context2, SensorsDataUtils.getIdentifier(context2), SAOaidHelper.getOpenAdIdentifier(context), SAOaidHelper.getOpenAdIdentifierByReflection(context)));
                    } catch (JSONException e3) {
                        SALog.printStackTrace(e3);
                    }
                }
                SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.TRACK).setEventName(SAAdvertConstants.EventName.DEEPLINK_LAUNCH).setProperties(jSONObject));
            }
        });
    }
}
