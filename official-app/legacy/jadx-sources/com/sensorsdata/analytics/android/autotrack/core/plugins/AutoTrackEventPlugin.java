package com.sensorsdata.analytics.android.autotrack.core.plugins;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertiesFetcher;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AutoTrackEventPlugin extends SAPropertyPlugin {
    private String mEventName;

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public boolean isMatchedWithFilter(SAPropertyFilter sAPropertyFilter) {
        this.mEventName = sAPropertyFilter.getEvent();
        return "$AppStart".equals(sAPropertyFilter.getEvent()) || "$AppEnd".equals(sAPropertyFilter.getEvent());
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin, com.sensorsdata.analytics.android.sdk.plugin.property.ISAPropertyPlugin
    public void properties(SAPropertiesFetcher sAPropertiesFetcher) {
        try {
            JSONObject properties = sAPropertiesFetcher.getProperties();
            JSONObject eventJson = sAPropertiesFetcher.getEventJson(SAPropertyFilter.LIB);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ("$AppEnd".equals(this.mEventName)) {
                long jOptLong = properties.optLong("event_time");
                if (jOptLong > 2000) {
                    jCurrentTimeMillis = jOptLong;
                }
                String strOptString = properties.optString("$lib_version");
                if (TextUtils.isEmpty(strOptString)) {
                    properties.remove("$lib_version");
                } else {
                    eventJson.put("$lib_version", strOptString);
                }
                String strOptString2 = properties.optString("$app_version");
                if (TextUtils.isEmpty(strOptString2)) {
                    properties.remove("$app_version");
                } else {
                    eventJson.put("$app_version", strOptString2);
                }
                properties.remove("event_time");
            } else if ("$AppStart".equals(this.mEventName)) {
                long jOptLong2 = properties.optLong("event_time");
                if (jOptLong2 > 0) {
                    jCurrentTimeMillis = jOptLong2;
                }
                properties.remove("event_time");
            }
            properties.put("$time", new Date(jCurrentTimeMillis));
            sAPropertiesFetcher.setProperties(properties);
            sAPropertiesFetcher.setEventJson(SAPropertyFilter.LIB, eventJson);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
