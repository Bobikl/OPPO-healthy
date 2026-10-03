package com.sensorsdata.analytics.android.sdk.plugin.property;

import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SAPropertyPlugin implements ISAPropertyPlugin {
    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public String getName() {
        return getClass().getName();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public boolean isMatchedWithFilter(SAPropertyFilter sAPropertyFilter) {
        return sAPropertyFilter.getType().isTrack();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public SAPropertyPluginPriority priority() {
        return SAPropertyPluginPriority.DEFAULT;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public abstract void properties(SAPropertiesFetcher sAPropertiesFetcher);
}
