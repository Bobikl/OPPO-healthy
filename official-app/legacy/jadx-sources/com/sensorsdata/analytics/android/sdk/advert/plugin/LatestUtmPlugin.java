package com.sensorsdata.analytics.android.sdk.advert.plugin;

import com.sensorsdata.analytics.android.sdk.advert.SAAdvertConstants;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;

/* JADX INFO: loaded from: classes10.dex */
public class LatestUtmPlugin extends SAPropertyPlugin {
    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public boolean isMatchedWithFilter(SAPropertyFilter sAPropertyFilter) {
        return (!sAPropertyFilter.getType().isTrack() || "$AppEnd".equals(sAPropertyFilter.getEvent()) || SAAdvertConstants.EventName.DEEPLINK_LAUNCH.equals(sAPropertyFilter.getEvent())) ? false : true;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public void properties(SAPropertiesFetcher sAPropertiesFetcher) {
        JSONUtils.mergeJSONObject(ChannelUtils.getLatestUtmProperties(), sAPropertiesFetcher.getProperties());
    }
}
