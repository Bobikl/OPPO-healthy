package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;

/* JADX INFO: loaded from: classes16.dex */
public class ypf {

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String a;

    @SerializedName("deviceType")
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String f19097c;

    @SerializedName(e36.PARAM_FIRMWARE_VERSION)
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("hardwareVersion")
    private String f19098e;

    @SerializedName(HttpConst.OTA_VERSION)
    private String f;

    @SerializedName("manufacturer")
    private String g;

    @SerializedName("model")
    private String h;

    @SerializedName("deviceSn")
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("mac")
    private String f19099j;

    @SerializedName("microMac")
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("bleSecretMetadata")
    private String f19100l;

    @SerializedName("sku")
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName(e36.PARAM_SKU_CODE)
    private String f19101n;

    @SerializedName("bluetoothName")
    private String o;

    @SerializedName("projectId")
    private String p;

    @SerializedName("boardId")
    private String q;

    @SerializedName("subDeviceType")
    private int r;

    @SerializedName("deviceOsVersion")
    private String s;

    @SerializedName("deviceMarketName")
    private String t;

    @SerializedName("skuMarketName")
    private String u;

    @SerializedName("guid")
    private String v;

    @SerializedName("iwatchKey")
    private String w = "";

    @SerializedName("iwatchRandom")
    private String x = "";

    public void A(String str) {
        this.o = str;
    }

    public void B(String str) {
        this.q = str;
    }

    public void C(String str) {
        this.t = str;
    }

    public void D(String str) {
        this.a = str;
    }

    public void E(String str) {
        this.s = str;
    }

    public void F(String str) {
        this.i = str;
    }

    public void G(String str) {
        this.b = str;
    }

    public void H(String str) {
        this.f19097c = str;
    }

    public void I(String str) {
        this.d = str;
    }

    public void J(String str) {
        this.v = str;
    }

    public void K(String str) {
        this.f19098e = str;
    }

    public void L(String str) {
        this.w = str;
    }

    public void M(String str) {
        this.x = str;
    }

    public void N(String str) {
        this.f19099j = str;
    }

    public void O(String str) {
        this.g = str;
    }

    public void P(String str) {
        this.h = str;
    }

    public void Q(String str) {
        this.f = str;
    }

    public void R(String str) {
        this.p = str;
    }

    public void S(String str) {
        this.m = str;
    }

    public void T(String str) {
        this.f19101n = str;
    }

    public void U(String str) {
        this.u = str;
    }

    public void V(int i) {
        this.r = i;
    }

    public String a() {
        return this.k;
    }

    public String b() {
        return this.f19100l;
    }

    public String c() {
        return this.o;
    }

    public String d() {
        return this.q;
    }

    public String e() {
        return this.t;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.s;
    }

    public String h() {
        return this.i;
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.f19097c;
    }

    public String k() {
        return this.d;
    }

    public String l() {
        return this.v;
    }

    public String m() {
        return this.f19098e;
    }

    public String n() {
        return this.w;
    }

    public String o() {
        return this.x;
    }

    public String p() {
        return this.f19099j;
    }

    public String q() {
        return this.g;
    }

    public String r() {
        return this.h;
    }

    public String s() {
        return this.f;
    }

    public String t() {
        return this.p;
    }

    public String toString() {
        return "ReportDeviceInfoReq{deviceName='" + this.a + "', deviceType='" + this.b + "', deviceUniqueId='" + gdb.a(this.f19097c) + "', firmwareVersion='" + this.d + "', hardwareVersion='" + this.f19098e + "', otaVersion='" + this.f + "', manufacturer='" + this.g + "', model='" + this.h + "', deviceSn='" + this.i + "', mac='" + gdb.a(this.f19099j) + "', bleMac='" + gdb.a(this.k) + "', guid='" + this.v + "', bleSecretMetadata='" + this.f19100l + "', sku='" + this.m + "', skuCode='" + this.f19101n + "', bluetoothName='" + this.o + "', projectId='" + this.p + "', boardId='" + this.q + "', subDeviceType=" + this.r + ", deviceOsVersion='" + this.s + "', deviceMarketName=" + this.t + ", skuMarketName='" + this.u + "', iwatchKey='" + this.w + "', iwatchRandom='" + this.x + "'}";
    }

    public String u() {
        return this.m;
    }

    public String v() {
        return this.f19101n;
    }

    public String w() {
        return this.u;
    }

    public int x() {
        return this.r;
    }

    public void y(String str) {
        this.k = str;
    }

    public void z(String str) {
        this.f19100l = str;
    }
}
