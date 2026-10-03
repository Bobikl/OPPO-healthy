package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class dgb {

    @SerializedName("status")
    int a;

    @SerializedName("endTimestamp")
    long b;

    public long a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "MarketModeInfo{status=" + this.a + ", endTimestamp=" + this.b + '}';
    }
}
