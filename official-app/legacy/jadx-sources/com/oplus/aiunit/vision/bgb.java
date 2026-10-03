package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.oplus.drs.core.config.entity.DebugModeEntity;

/* JADX INFO: loaded from: classes19.dex */
public class bgb {

    @SerializedName("exitMarketMode")
    int a;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceModel")
    String f9745c;

    @SerializedName("imei")
    String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("demoMode")
    int f9746e;

    @SerializedName(DebugModeEntity.KEY_AREA)
    String f;

    public void a(String str) {
        this.f = str;
    }

    public void b(int i) {
        this.f9746e = i;
    }

    public void c(String str) {
        this.f9745c = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public void e(int i) {
        this.a = i;
    }

    public void f(String str) {
        this.d = str;
    }

    public String toString() {
        return "MarketModeInfo{exitMarketMode=" + this.a + ", deviceUniqueId='" + this.b + "', deviceModel='" + this.f9745c + "', imei='" + this.d + "', demoMode=" + this.f9746e + ", area='" + this.f + "'}";
    }
}
