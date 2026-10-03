package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class jn0 {

    @SerializedName("authorityName")
    String a;

    @SerializedName("authorityCode")
    String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("priority")
    int f12952c;

    @SerializedName("displayStatus")
    int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("settingUrl")
    String f12953e;

    public String a() {
        return this.b;
    }

    public String toString() {
        return "AuthoritySettingInfo{authorityName='" + this.a + "', authorityCode='" + this.b + "', priority=" + this.f12952c + ", displayStatus=" + this.d + ", settingUrl='" + this.f12953e + "'}";
    }
}
