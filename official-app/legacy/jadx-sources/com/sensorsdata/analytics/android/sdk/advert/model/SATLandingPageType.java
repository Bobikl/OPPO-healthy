package com.sensorsdata.analytics.android.sdk.advert.model;

/* JADX INFO: loaded from: classes10.dex */
public enum SATLandingPageType {
    INTELLIGENCE("intelligence"),
    OTHER("other");

    private String mTypeName;

    SATLandingPageType(String str) {
        this.mTypeName = str;
    }

    public String getTypeName() {
        return this.mTypeName;
    }
}
