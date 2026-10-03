package com.heytap.weather.constant;

import com.heytap.store.base.core.util.deeplink.DeepLinkUrlPath;

/* JADX INFO: loaded from: classes3.dex */
public enum BusinessConstants$RequestMethodEnum {
    LOCATION("location"),
    SEARCH(DeepLinkUrlPath.URL_SEARCH),
    WEATHERDATA("weatherData"),
    CHINACITY("chinaCityInfo"),
    HOTCITY("hotcity"),
    KEYCONVERT("keyConvert"),
    HOTCITY_V0("hotcityV0"),
    INDEX_AD_DATA("indexAdData"),
    RAIN_FALL_V1("radarChart"),
    RAIN_FALL_V2("radarChartV2"),
    WEATHER_LIGHT_DATA("weatherLightData");

    private String value;

    BusinessConstants$RequestMethodEnum(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
