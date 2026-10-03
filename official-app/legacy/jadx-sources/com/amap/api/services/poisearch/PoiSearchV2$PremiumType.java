package com.amap.api.services.poisearch;

/* JADX INFO: loaded from: classes12.dex */
public enum PoiSearchV2$PremiumType {
    DEFAULT(""),
    ENTIRETY("entirety_poi");

    private final String a;

    PoiSearchV2$PremiumType(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public static PoiSearchV2$PremiumType a(String str) {
        PoiSearchV2$PremiumType poiSearchV2$PremiumType = DEFAULT;
        if (str.equals(poiSearchV2$PremiumType.a())) {
            return poiSearchV2$PremiumType;
        }
        PoiSearchV2$PremiumType poiSearchV2$PremiumType2 = ENTIRETY;
        return str.equals(poiSearchV2$PremiumType2.a()) ? poiSearchV2$PremiumType2 : poiSearchV2$PremiumType;
    }
}
