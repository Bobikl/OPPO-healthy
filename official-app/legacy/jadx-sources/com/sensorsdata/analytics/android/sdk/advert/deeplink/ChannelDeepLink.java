package com.sensorsdata.analytics.android.sdk.advert.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.SAAdvertConstants;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class ChannelDeepLink extends AbsDeepLink {
    public ChannelDeepLink(Intent intent) {
        super(intent);
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkProcessor
    public void mergeDeepLinkProperty(JSONObject jSONObject) {
        try {
            jSONObject.put(SAAdvertConstants.Properties.DEEPLINK_URL, getDeepLinkUrl());
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
        JSONUtils.mergeJSONObject(ChannelUtils.getUtmProperties(), jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkProcessor
    public void parseDeepLink(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return;
        }
        Uri data = intent.getData();
        if (data.isOpaque()) {
            SALog.d("ChannelDeepLink", data.toString() + " isOpaque");
            return;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.size() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : queryParameterNames) {
            String queryParameter = data.getQueryParameter(str);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "";
            }
            map.put(str, queryParameter);
        }
        ChannelUtils.parseParams(map);
        DeepLinkManager.OnDeepLinkParseFinishCallback onDeepLinkParseFinishCallback = this.mCallBack;
        if (onDeepLinkParseFinishCallback != null) {
            onDeepLinkParseFinishCallback.onFinish(DeepLinkManager.DeepLinkType.CHANNEL, null, null, true, 0L);
        }
    }
}
