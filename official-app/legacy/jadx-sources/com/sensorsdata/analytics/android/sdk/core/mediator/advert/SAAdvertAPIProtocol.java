package com.sensorsdata.analytics.android.sdk.core.mediator.advert;

import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeferredDeepLinkCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface SAAdvertAPIProtocol {
    void enableDeepLinkInstallSource(boolean z);

    void requestDeferredDeepLink(JSONObject jSONObject);

    @Deprecated
    void setDeepLinkCallback(SensorsDataDeepLinkCallback sensorsDataDeepLinkCallback);

    void setDeepLinkCompletion(SensorsDataDeferredDeepLinkCallback sensorsDataDeferredDeepLinkCallback);

    void trackAppInstall();

    void trackAppInstall(JSONObject jSONObject);

    void trackAppInstall(JSONObject jSONObject, boolean z);

    void trackChannelEvent(String str);

    void trackChannelEvent(String str, JSONObject jSONObject);

    void trackDeepLinkLaunch(String str);

    void trackDeepLinkLaunch(String str, String str2);

    void trackInstallation(String str);

    void trackInstallation(String str, JSONObject jSONObject);

    void trackInstallation(String str, JSONObject jSONObject, boolean z);
}
