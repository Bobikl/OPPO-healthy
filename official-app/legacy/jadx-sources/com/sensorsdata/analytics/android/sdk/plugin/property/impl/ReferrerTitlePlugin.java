package com.sensorsdata.analytics.android.sdk.plugin.property.impl;

import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class ReferrerTitlePlugin extends SAPropertyPlugin {
    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public boolean isMatchedWithFilter(SAPropertyFilter sAPropertyFilter) {
        return sAPropertyFilter.getType().isTrack() && DeviceInfoUtil.SYSTEM_NAME.equals(sAPropertyFilter.getEventJson(SAPropertyFilter.LIB).optString("$lib"));
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public void properties(SAPropertiesFetcher sAPropertiesFetcher) {
        String str = (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_GET_REFERRER_SCREEN_TITLE, new Object[0]);
        if (str != null) {
            try {
                if (sAPropertiesFetcher.getProperties().has("$referrer_title")) {
                    return;
                }
                sAPropertiesFetcher.getProperties().put("$referrer_title", str);
            } catch (JSONException e2) {
                SALog.printStackTrace(e2);
            }
        }
    }
}
