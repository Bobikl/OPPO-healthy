package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class egb {

    @SerializedName("seq")
    int a;

    @SerializedName("region")
    String b;

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "MarketRegionInfo{seq=" + this.a + ", region='" + this.b + "'}";
    }
}
