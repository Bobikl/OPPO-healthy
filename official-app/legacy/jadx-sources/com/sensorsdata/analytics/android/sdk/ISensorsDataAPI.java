package com.sensorsdata.analytics.android.sdk;

import android.webkit.WebView;
import com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol;
import com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol;
import com.sensorsdata.analytics.android.sdk.core.mediator.exposure.SAExposureAPIProtocol;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface ISensorsDataAPI extends IUserIdentityAPI, SAAdvertAPIProtocol, AutoTrackProtocol, SAExposureAPIProtocol {
    void addHeatMapActivities(List<Class<?>> list);

    void addHeatMapActivity(Class<?> cls);

    void addVisualizedAutoTrackActivities(List<Class<?>> list);

    void addVisualizedAutoTrackActivity(Class<?> cls);

    void clearGPSLocation();

    void clearSuperProperties();

    void clearTrackTimer();

    void deleteAll();

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    void enableDeepLinkInstallSource(boolean z);

    void enableLog(boolean z);

    void enableNetworkRequest(boolean z);

    void enableRemoteConfig(boolean z);

    void enableTrackScreenOrientation(boolean z);

    void flush();

    void flushScheduled();

    void flushSync();

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    String getAnonymousId();

    String getCookie(boolean z);

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    String getDistinctId();

    int getFlushBulkSize();

    int getFlushInterval();

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    String getLoginId();

    long getMaxCacheSize();

    JSONObject getPresetProperties();

    String getScreenOrientation();

    String getServerUrl();

    int getSessionIntervalTime();

    JSONObject getSuperProperties();

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    void identify(String str);

    boolean isDebugMode();

    boolean isHeatMapActivity(Class<?> cls);

    boolean isHeatMapEnabled();

    boolean isNetworkRequestEnable();

    boolean isVisualizedAutoTrackActivity(Class<?> cls);

    boolean isVisualizedAutoTrackEnabled();

    void itemDelete(String str, String str2);

    void itemSet(String str, String str2, JSONObject jSONObject);

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    void login(String str);

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    void login(String str, JSONObject jSONObject);

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    void logout();

    void profileAppend(String str, String str2);

    void profileAppend(String str, Set<String> set);

    void profileDelete();

    void profileIncrement(String str, Number number);

    void profileIncrement(Map<String, ? extends Number> map);

    void profilePushId(String str, String str2);

    void profileSet(String str, Object obj);

    void profileSet(JSONObject jSONObject);

    void profileSetOnce(String str, Object obj);

    void profileSetOnce(JSONObject jSONObject);

    void profileUnset(String str);

    void profileUnsetPushId(String str);

    void registerDynamicSuperProperties(SensorsDataDynamicSuperProperties sensorsDataDynamicSuperProperties);

    void registerLimitKeys(Map<String, String> map);

    void registerPropertyPlugin(SAPropertyPlugin sAPropertyPlugin);

    void registerSuperProperties(JSONObject jSONObject);

    void removeTimer(String str);

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    @Deprecated
    void resetAnonymousId();

    void resumeTrackScreenOrientation();

    void setCookie(String str, boolean z);

    void setFlushBulkSize(int i);

    void setFlushInterval(int i);

    void setFlushNetworkPolicy(int i);

    void setGPSLocation(double d, double d2);

    void setGPSLocation(double d, double d2, String str);

    void setMaxCacheSize(long j2);

    void setServerUrl(String str);

    void setServerUrl(String str, boolean z);

    void setSessionIntervalTime(int i);

    void setTrackEventCallBack(SensorsDataTrackEventCallBack sensorsDataTrackEventCallBack);

    @Deprecated
    void showUpWebView(WebView webView, JSONObject jSONObject, boolean z, boolean z2);

    void showUpWebView(WebView webView, boolean z);

    @Deprecated
    void showUpWebView(WebView webView, boolean z, JSONObject jSONObject);

    void showUpWebView(WebView webView, boolean z, boolean z2);

    void showUpX5WebView(Object obj);

    @Deprecated
    void showUpX5WebView(Object obj, JSONObject jSONObject, boolean z, boolean z2);

    void showUpX5WebView(Object obj, boolean z);

    void startTrackThread();

    void stopTrackScreenOrientation();

    void stopTrackThread();

    void track(String str);

    void track(String str, JSONObject jSONObject);

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    void trackDeepLinkLaunch(String str);

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    void trackDeepLinkLaunch(String str, String str2);

    @Deprecated
    void trackTimer(String str, TimeUnit timeUnit);

    void trackTimerEnd(String str);

    void trackTimerEnd(String str, JSONObject jSONObject);

    void trackTimerPause(String str);

    void trackTimerResume(String str);

    String trackTimerStart(String str);

    void unregisterPropertyPlugin(SAPropertyPlugin sAPropertyPlugin);

    void unregisterSuperProperty(String str);
}
