package com.sensorsdata.analytics.android.sdk.advert.plugin;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkManager;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SAAdvertAppViewScreenPlugin extends SAPropertyPlugin {
    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public boolean isMatchedWithFilter(SAPropertyFilter sAPropertyFilter) {
        return "$AppViewScreen".equals(sAPropertyFilter.getEvent());
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public void properties(SAPropertiesFetcher sAPropertiesFetcher) {
        JSONObject jSONObject = new JSONObject();
        DeepLinkManager.mergeDeepLinkProperty(jSONObject);
        if (jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    sAPropertiesFetcher.getProperties().put(next, jSONObject.opt(next));
                } catch (JSONException e2) {
                    SALog.printStackTrace(e2);
                }
            }
            DeepLinkManager.resetDeepLinkProcessor();
        }
    }
}
