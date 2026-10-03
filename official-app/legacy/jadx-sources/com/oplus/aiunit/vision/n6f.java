package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class n6f {

    @SerializedName("model")
    private String a;

    @SerializedName(e36.PARAM_SKU_CODE)
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceType")
    private int f14362c;

    @SerializedName("subDeviceType")
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("generation")
    private String f14363e;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String f;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f;
    }

    public String toString() {
        return "QueryUserDeviceRecordRsp{deviceModel='" + this.a + "', skuCode='" + this.b + "', deviceType=" + this.f14362c + ", subDeviceType='" + this.d + "', generation='" + this.f14363e + "', deviceUniqueId=" + this.f + "'}";
    }
}
