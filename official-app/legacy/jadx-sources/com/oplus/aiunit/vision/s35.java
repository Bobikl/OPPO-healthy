package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
public class s35 {

    @SerializedName("packageName")
    private String a;

    @SerializedName("iconUrl")
    private String b;

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "GetDeviceIconRes{packageName='" + this.a + "', iconUrl='" + this.b + "'}";
    }
}
