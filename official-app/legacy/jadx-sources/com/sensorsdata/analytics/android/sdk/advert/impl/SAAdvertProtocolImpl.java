package com.sensorsdata.analytics.android.sdk.advert.impl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SAAdvertisingConfig;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.advert.SAAdvertConstants;
import com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkManager;
import com.sensorsdata.analytics.android.sdk.advert.monitor.SensorsDataAdvertActivityLifeCallback;
import com.sensorsdata.analytics.android.sdk.advert.oaid.SAOaidHelper;
import com.sensorsdata.analytics.android.sdk.advert.plugin.LatestUtmPlugin;
import com.sensorsdata.analytics.android.sdk.advert.plugin.SAAdvertAppStartPlugin;
import com.sensorsdata.analytics.android.sdk.advert.plugin.SAAdvertAppViewScreenPlugin;
import com.sensorsdata.analytics.android.sdk.advert.scan.SAAdvertScanHelper;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.SAAdvertMarketHelper;
import com.sensorsdata.analytics.android.sdk.advert.utils.SAAdvertUtils;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.SACoreHelper;
import com.sensorsdata.analytics.android.sdk.core.event.InputData;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeferredDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.monitor.SensorsDataLifecycleMonitorManager;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import java.util.Date;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SAAdvertProtocolImpl {
    private SAPropertyPlugin mAdEventId;
    private final SAAdvertisingConfig mAdvertOptions;
    private final Context mContext;
    private boolean mEnableDeepLinkInstallSource;
    private LatestUtmPlugin mLatestUtmPlugin;
    private SensorsDataAdvertActivityLifeCallback mLifecycleCallback;
    private final SAConfigOptions mOptions;
    private final SAContextManager mSAContextManager;
    private SAAdvertAppStartPlugin mStartPlugin;
    private SAAdvertAppViewScreenPlugin mViewScreenPlugin;

    public SAAdvertProtocolImpl(SAContextManager sAContextManager) {
        this.mSAContextManager = sAContextManager;
        this.mContext = sAContextManager.getContext();
        SAConfigOptions sAConfigOptions = sAContextManager.getInternalConfigs().saConfigOptions;
        this.mOptions = sAConfigOptions;
        this.mAdvertOptions = sAConfigOptions.getAdvertConfig();
        init();
    }

    private void enableDeepLinkInstallSource(boolean z) {
        this.mEnableDeepLinkInstallSource = z;
        DeepLinkManager.enableDeepLinkInstallSource(z);
    }

    private void init() {
        this.mStartPlugin = new SAAdvertAppStartPlugin();
        this.mViewScreenPlugin = new SAAdvertAppViewScreenPlugin();
        this.mLatestUtmPlugin = new LatestUtmPlugin();
        this.mAdEventId = new SAPropertyPlugin() { // from class: com.sensorsdata.analytics.android.sdk.advert.impl.SAAdvertProtocolImpl.1
            @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
            public boolean isMatchedWithFilter(SAPropertyFilter sAPropertyFilter) {
                return (SAAdvertProtocolImpl.this.mAdvertOptions == null || TextUtils.isEmpty(SAAdvertProtocolImpl.this.mAdvertOptions.serverUrl) || SAAdvertProtocolImpl.this.mAdvertOptions.eventNames.isEmpty() || TextUtils.isEmpty(sAPropertyFilter.getEvent()) || !SAAdvertProtocolImpl.this.mAdvertOptions.eventNames.contains(sAPropertyFilter.getEvent())) ? false : true;
            }

            @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
            public void properties(SAPropertiesFetcher sAPropertiesFetcher) {
                try {
                    sAPropertiesFetcher.getProperties().put("$sat_event_track_id", UUID.randomUUID().toString());
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        };
        ChannelUtils.setSourceChannelKeys(this.mOptions.channelSourceKeys);
        if (AppInfoUtils.isMainProcess(this.mContext, null)) {
            ChannelUtils.commitRequestDeferredDeeplink(!ChannelUtils.isExistRequestDeferredDeeplink());
        }
    }

    private JSONObject mergeChannelEventProperties(String str, JSONObject jSONObject) {
        return this.mOptions.isAutoAddChannelCallbackEvent() ? ChannelUtils.checkOrSetChannelCallbackEvent(str, jSONObject, this.mContext) : jSONObject;
    }

    private void requestDeferredDeepLink(final JSONObject jSONObject) {
        SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.impl.SAAdvertProtocolImpl.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (ChannelUtils.isRequestDeferredDeeplink()) {
                        SALog.i(SAAdvertConstants.TAG, "do requestDeferredDeepLink");
                        DeepLinkManager.requestDeferredDeepLink(SAAdvertProtocolImpl.this.mContext, jSONObject, SAAdvertUtils.getIdentifier(SAAdvertProtocolImpl.this.mContext), SAOaidHelper.getOpenAdIdentifier(SAAdvertProtocolImpl.this.mContext), SensorsDataAPI.sharedInstance().getPresetProperties(), SAAdvertProtocolImpl.this.mOptions.getCustomADChannelUrl(), SAAdvertProtocolImpl.this.mOptions.isSaveDeepLinkInfo());
                        ChannelUtils.commitRequestDeferredDeeplink(false);
                    }
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    private void trackChannelEvent(final String str, JSONObject jSONObject) {
        if (this.mOptions.isAutoAddChannelCallbackEvent()) {
            SensorsDataAPI.sharedInstance().track(str, jSONObject);
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        JSONUtils.mergeJSONObject(jSONObject, jSONObject2);
        SADataHelper.addTimeProperty(jSONObject2);
        SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.impl.SAAdvertProtocolImpl.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        jSONObject2.put("$is_channel_callback_event", ChannelUtils.isFirstChannelEvent(str));
                        if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                            ChannelUtils.mergeUtmByMetaData(SAAdvertProtocolImpl.this.mContext, jSONObject2);
                        }
                        if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                            if (jSONObject2.has("$oaid")) {
                                String strOptString = jSONObject2.optString("$oaid");
                                jSONObject2.put("$channel_device_info", ChannelUtils.getDeviceInfo(SAAdvertProtocolImpl.this.mContext, SAAdvertUtils.getIdentifier(SAAdvertProtocolImpl.this.mContext), strOptString, ""));
                                SALog.i(SAAdvertConstants.TAG, "properties has oaid " + strOptString);
                            } else {
                                jSONObject2.put("$channel_device_info", ChannelUtils.getDeviceInfo(SAAdvertProtocolImpl.this.mContext, SAAdvertUtils.getIdentifier(SAAdvertProtocolImpl.this.mContext), SAOaidHelper.getOpenAdIdentifier(SAAdvertProtocolImpl.this.mContext), SAOaidHelper.getOpenAdIdentifierByReflection(SAAdvertProtocolImpl.this.mContext)));
                            }
                        }
                        if (jSONObject2.has("$oaid")) {
                            jSONObject2.remove("$oaid");
                        }
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                    SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.TRACK).setEventName(str).setProperties(jSONObject2));
                } catch (Exception e3) {
                    SALog.printStackTrace(e3);
                }
            }
        });
    }

    private void trackDeepLinkLaunch(String str, final String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SAAdvertConstants.Properties.DEEPLINK_URL, str);
            jSONObject.put("$time", new Date(System.currentTimeMillis()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.impl.SAAdvertProtocolImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (SAAdvertProtocolImpl.this.mEnableDeepLinkInstallSource) {
                    try {
                        String openAdIdentifier = str2;
                        String openAdIdentifierByReflection = "";
                        if (TextUtils.isEmpty(openAdIdentifier)) {
                            openAdIdentifier = SAOaidHelper.getOpenAdIdentifier(SAAdvertProtocolImpl.this.mContext);
                            openAdIdentifierByReflection = SAOaidHelper.getOpenAdIdentifierByReflection(SAAdvertProtocolImpl.this.mContext);
                        }
                        jSONObject.put("$ios_install_source", ChannelUtils.getDeviceInfo(SAAdvertProtocolImpl.this.mContext, SAAdvertUtils.getIdentifier(SAAdvertProtocolImpl.this.mContext), openAdIdentifier, openAdIdentifierByReflection));
                    } catch (JSONException e3) {
                        SALog.printStackTrace(e3);
                    }
                }
                SACoreHelper.getInstance().trackEvent(new InputData().setEventName(SAAdvertConstants.EventName.DEEPLINK_LAUNCH).setProperties(jSONObject));
            }
        });
    }

    private void trackInstallation(final String str, JSONObject jSONObject, final boolean z) {
        try {
            if (AppInfoUtils.isMainProcess(this.mContext, null)) {
                final JSONObject jSONObject2 = new JSONObject();
                JSONUtils.mergeJSONObject(jSONObject, jSONObject2);
                SADataHelper.addTimeProperty(jSONObject2);
                SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.impl.SAAdvertProtocolImpl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        String openAdIdentifier;
                        String deviceInfo;
                        try {
                            if (SAAdvertUtils.isFirstTrackInstallation(z)) {
                                boolean zIsGetDeviceInfo = false;
                                try {
                                    if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                                        ChannelUtils.mergeUtmByMetaData(SAAdvertProtocolImpl.this.mContext, jSONObject2);
                                    }
                                    if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                                        String identifier = SAAdvertUtils.getIdentifier(SAAdvertProtocolImpl.this.mContext);
                                        if (jSONObject2.has("$oaid")) {
                                            openAdIdentifier = jSONObject2.optString("$oaid");
                                            deviceInfo = ChannelUtils.getDeviceInfo(SAAdvertProtocolImpl.this.mContext, identifier, openAdIdentifier, "");
                                            SALog.i(SAAdvertConstants.TAG, "properties has oaid " + openAdIdentifier);
                                        } else {
                                            openAdIdentifier = SAOaidHelper.getOpenAdIdentifier(SAAdvertProtocolImpl.this.mContext);
                                            deviceInfo = ChannelUtils.getDeviceInfo(SAAdvertProtocolImpl.this.mContext, identifier, openAdIdentifier, SAOaidHelper.getOpenAdIdentifierByReflection(SAAdvertProtocolImpl.this.mContext));
                                        }
                                        if (jSONObject2.has("$gaid")) {
                                            deviceInfo = String.format("%s##gaid=%s", deviceInfo, jSONObject2.optString("$gaid"));
                                        }
                                        zIsGetDeviceInfo = ChannelUtils.isGetDeviceInfo(identifier, openAdIdentifier);
                                        jSONObject2.put("$ios_install_source", deviceInfo);
                                    }
                                    if (jSONObject2.has("$oaid")) {
                                        jSONObject2.remove("$oaid");
                                    }
                                    if (jSONObject2.has("$gaid")) {
                                        jSONObject2.remove("$gaid");
                                    }
                                    boolean z2 = z;
                                    if (z2) {
                                        jSONObject2.put("$ios_install_disable_callback", z2);
                                    }
                                } catch (Exception e2) {
                                    SALog.printStackTrace(e2);
                                }
                                SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.TRACK).setEventName(str).setProperties(jSONObject2));
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject2.remove("$ios_install_disable_callback");
                                JSONUtils.mergeJSONObject(jSONObject2, jSONObject3);
                                jSONObject3.put("$first_visit_time", new Date());
                                SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.PROFILE_SET_ONCE).setProperties(jSONObject3));
                                SAAdvertUtils.setTrackInstallation(z);
                                ChannelUtils.saveCorrectTrackInstallation(zIsGetDeviceInfo);
                            }
                            SensorsDataAPI.sharedInstance().flush();
                        } catch (Exception e3) {
                            SALog.printStackTrace(e3);
                        }
                    }
                });
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void delayExecution() {
        SensorsDataAdvertActivityLifeCallback sensorsDataAdvertActivityLifeCallback;
        try {
            if (this.mOptions.getDeeplinkCallback() != null) {
                DeepLinkManager.setDeferredDeepLinkCallback(this.mOptions.getDeeplinkCallback());
                if ((this.mSAContextManager.getInternalConfigs().context instanceof Activity) && (sensorsDataAdvertActivityLifeCallback = this.mLifecycleCallback) != null) {
                    sensorsDataAdvertActivityLifeCallback.onActivityStarted((Activity) this.mSAContextManager.getInternalConfigs().context);
                }
            }
            if (this.mSAContextManager.getInternalConfigs().context instanceof Activity) {
                SAAdvertMarketHelper.handleAdMarket((Activity) this.mSAContextManager.getInternalConfigs().context, this.mOptions.getAdvertConfig());
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void delayInitTask() {
        SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.impl.SAAdvertProtocolImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (SAAdvertProtocolImpl.this.mOptions.isSaveDeepLinkInfo()) {
                        ChannelUtils.loadUtmByLocal();
                    } else {
                        ChannelUtils.clearLocalUtm();
                    }
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public <T> T invokeModuleFunction(String str, Object... objArr) throws Throwable {
        str.hashCode();
        switch (str) {
            case "setDeepLinkCallback":
                DeepLinkManager.setDeepLinkCallback((SensorsDataDeepLinkCallback) objArr[0]);
                return null;
            case "trackInstallation":
                if (objArr.length == 3) {
                    trackInstallation((String) objArr[0], (JSONObject) objArr[1], ((Boolean) objArr[2]).booleanValue());
                } else if (objArr.length == 2) {
                    trackInstallation((String) objArr[0], (JSONObject) objArr[1], false);
                } else {
                    trackInstallation((String) objArr[0], null, false);
                }
                return null;
            case "commitRequestDeferredDeeplink":
                ChannelUtils.commitRequestDeferredDeeplink(((Boolean) objArr[0]).booleanValue());
                return null;
            case "removeDeepLinkInfo":
                ChannelUtils.removeDeepLinkInfo((JSONObject) objArr[0]);
                return null;
            case "trackDeepLinkLaunch":
                if (objArr.length == 2) {
                    trackDeepLinkLaunch((String) objArr[0], (String) objArr[1]);
                } else {
                    trackDeepLinkLaunch((String) objArr[0], null);
                }
                return null;
            case "sendEvent":
                SAAdvertisingConfig sAAdvertisingConfig = this.mAdvertOptions;
                if (sAAdvertisingConfig != null && !TextUtils.isEmpty(sAAdvertisingConfig.serverUrl) && !this.mAdvertOptions.eventNames.isEmpty()) {
                    JSONObject jSONObject = (JSONObject) objArr[0];
                    String strOptString = jSONObject.optString("event");
                    if (!TextUtils.isEmpty(strOptString) && this.mAdvertOptions.eventNames.contains(strOptString)) {
                        SAAdvertUtils.sendData(this.mContext, this.mAdvertOptions.serverUrl, (JSONObject) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_ENCRYPT_EVENT_DATA_WITH_KEY, jSONObject, this.mAdvertOptions.secreteKey), jSONObject.toString());
                    }
                }
                return null;
            case "mergeChannelEventProperties":
                return (T) mergeChannelEventProperties((String) objArr[0], (JSONObject) objArr[1]);
            case "trackChannelEvent":
                if (objArr.length == 2) {
                    trackChannelEvent((String) objArr[0], (JSONObject) objArr[1]);
                } else {
                    trackChannelEvent((String) objArr[0], null);
                }
                return null;
            case "getLatestUtmProperties":
                return (T) ChannelUtils.getLatestUtmProperties();
            case "requestDeferredDeepLink":
                requestDeferredDeepLink((JSONObject) objArr[0]);
                return null;
            case "handlerScanUri":
                SAAdvertScanHelper.scanHandler((Activity) objArr[0], (Uri) objArr[1]);
                return null;
            case "setDeepLinkCompletion":
                DeepLinkManager.setDeferredDeepLinkCallback((SensorsDataDeferredDeepLinkCallback) objArr[0]);
                return null;
            case "enableDeepLinkInstallSource":
                enableDeepLinkInstallSource(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                return null;
        }
    }

    public void registerLifeCallback() {
        if (this.mLifecycleCallback == null) {
            this.mLifecycleCallback = new SensorsDataAdvertActivityLifeCallback(this.mOptions);
        }
        SensorsDataLifecycleMonitorManager.getInstance().addActivityLifeCallback(this.mLifecycleCallback);
    }

    public void registerPropertyPlugin() {
        this.mSAContextManager.getPluginManager().registerPropertyPlugin(this.mStartPlugin);
        this.mSAContextManager.getPluginManager().registerPropertyPlugin(this.mViewScreenPlugin);
        this.mSAContextManager.getPluginManager().registerPropertyPlugin(this.mLatestUtmPlugin);
        this.mSAContextManager.getPluginManager().registerPropertyPlugin(this.mAdEventId);
    }

    public void unregisterLifecycleCallback() {
        if (this.mLifecycleCallback != null) {
            SensorsDataLifecycleMonitorManager.getInstance().removeActivityLifeCallback(this.mLifecycleCallback);
        }
    }

    public void unregisterPropertyPlugin() {
        this.mSAContextManager.getPluginManager().unregisterPropertyPlugin(this.mStartPlugin);
        this.mSAContextManager.getPluginManager().unregisterPropertyPlugin(this.mViewScreenPlugin);
        this.mSAContextManager.getPluginManager().unregisterPropertyPlugin(this.mLatestUtmPlugin);
        this.mSAContextManager.getPluginManager().unregisterPropertyPlugin(this.mAdEventId);
    }
}
