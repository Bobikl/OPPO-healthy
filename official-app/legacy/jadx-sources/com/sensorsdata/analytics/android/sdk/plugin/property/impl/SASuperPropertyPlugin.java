package com.sensorsdata.analytics.android.sdk.plugin.property.impl;

import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;

/* JADX INFO: loaded from: classes10.dex */
public class SASuperPropertyPlugin extends SAPropertyPlugin {
    private final SensorsDataAPI mSensorsDataAPI;

    public SASuperPropertyPlugin(SensorsDataAPI sensorsDataAPI) {
        this.mSensorsDataAPI = sensorsDataAPI;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public void properties(SAPropertiesFetcher sAPropertiesFetcher) {
        JSONUtils.mergeJSONObject(JSONUtils.mergeSuperJSONObject(this.mSensorsDataAPI.getDynamicProperty(), this.mSensorsDataAPI.getSuperProperties()), sAPropertiesFetcher.getProperties());
    }
}
