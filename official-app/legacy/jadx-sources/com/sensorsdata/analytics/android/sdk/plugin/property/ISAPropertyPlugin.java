package com.sensorsdata.analytics.android.sdk.plugin.property;

import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;

/* JADX INFO: loaded from: classes10.dex */
public interface ISAPropertyPlugin {
    String getName();

    boolean isMatchedWithFilter(SAPropertyFilter sAPropertyFilter);

    SAPropertyPluginPriority priority();

    void properties(SAPropertiesFetcher sAPropertiesFetcher);
}
