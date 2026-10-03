package com.oplus.aiunit.vision;

import com.amap.api.services.district.DistrictSearchQuery;
import com.google.gson.annotations.SerializedName;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;

/* JADX INFO: loaded from: classes16.dex */
public class fe1 {

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String a;

    @SerializedName("appTerminalId")
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String f11308c;

    @SerializedName("deviceType")
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("model")
    private String f11309e;

    @SerializedName("bleSecretMetadata")
    private String f;

    @SerializedName("sku")
    private String g;

    @SerializedName(e36.PARAM_SKU_CODE)
    private String h;

    @SerializedName("bluetoothName")
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("mac")
    private String f11310j;

    @SerializedName("microMac")
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("subDeviceType")
    private int f11311l;

    @SerializedName("deviceMarketName")
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("skuMarketName")
    private String f11312n;

    @SerializedName(dj8.KEY_SN)
    private String o;

    @SerializedName("imei")
    private String p;

    @SerializedName("mobileVaid")
    private String q;

    @SerializedName("bindKey")
    private String r;

    @SerializedName("sign")
    private String s;

    @SerializedName(DistrictSearchQuery.KEYWORDS_PROVINCE)
    private String t;

    @SerializedName(DistrictSearchQuery.KEYWORDS_CITY)
    private String u;

    @SerializedName(DistrictSearchQuery.KEYWORDS_DISTRICT)
    private String v;

    public String a() {
        return this.f11309e;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.r = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void f(String str) {
        this.f11308c = str;
    }

    public void g(String str) {
        this.o = str;
    }

    public void h(String str) {
        this.d = str;
    }

    public void i(String str) {
        this.a = str;
    }

    public void j(String str) {
        this.p = str;
    }

    public void k(String str) {
        this.f11310j = str;
    }

    public void l(String str) {
        this.k = str;
    }

    public void m(String str) {
        this.f11309e = str;
    }

    public void n(String str) {
        this.s = str;
    }

    public void o(String str) {
        this.g = str;
    }

    public void p(String str) {
        this.h = str;
    }

    public void q(int i) {
        this.f11311l = i;
    }

    public void r(String str) {
        this.q = str;
    }
}
