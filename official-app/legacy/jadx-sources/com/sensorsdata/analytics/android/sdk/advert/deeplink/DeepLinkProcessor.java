package com.sensorsdata.analytics.android.sdk.advert.deeplink;

import android.content.Intent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface DeepLinkProcessor {
    String getDeepLinkUrl();

    void mergeDeepLinkProperty(JSONObject jSONObject);

    void parseDeepLink(Intent intent);

    void setDeepLinkParseFinishCallback(DeepLinkManager.OnDeepLinkParseFinishCallback onDeepLinkParseFinishCallback);

    void setDeepLinkUrl(String str);
}
