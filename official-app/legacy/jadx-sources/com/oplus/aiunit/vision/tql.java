package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class tql {

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String a;

    @SerializedName("deviceIcon")
    private Bitmap b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceIconPath")
    private String f17120c;

    @SerializedName("deviceType")
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String f17121e;

    @SerializedName("manufacturer")
    private String f;

    @SerializedName("model")
    private String g;

    @SerializedName("deviceSn")
    private String h;

    @SerializedName("mac")
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("sku")
    private String f17122j;

    @SerializedName(e36.PARAM_SKU_CODE)
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("id")
    private String f17123l;
    public boolean m;

    public final String a(String str) {
        return BluetoothUtil.INSTANCE.f(str);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f17123l;
    }

    public String d() {
        return this.i;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tql tqlVar = (tql) obj;
        return this.d == tqlVar.d && this.m == tqlVar.m && Objects.equals(this.a, tqlVar.a) && Objects.equals(this.b, tqlVar.b) && Objects.equals(this.f17120c, tqlVar.f17120c) && Objects.equals(this.f17121e, tqlVar.f17121e) && Objects.equals(this.f, tqlVar.f) && Objects.equals(this.g, tqlVar.g) && Objects.equals(this.h, tqlVar.h) && Objects.equals(this.i, tqlVar.i) && Objects.equals(this.f17122j, tqlVar.f17122j) && Objects.equals(this.k, tqlVar.k) && Objects.equals(this.f17123l, tqlVar.f17123l);
    }

    public boolean f() {
        return this.m;
    }

    public void g(boolean z) {
        this.m = z;
    }

    public void h(String str) {
        this.f17120c = str;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.f17120c, Integer.valueOf(this.d), this.f17121e, this.f, this.g, this.h, this.i, this.f17122j, this.k, this.f17123l, Boolean.valueOf(this.m));
    }

    public void i(String str) {
        this.a = str;
    }

    public void j(int i) {
        this.d = i;
    }

    public void k(String str) {
        this.f17121e = a(str);
    }

    public void l(String str) {
        this.f17123l = str;
    }

    public void m(String str) {
        this.i = a(str);
    }

    public String toString() {
        return "WeightScaleDeviceInfo{deviceName='" + this.a + "', deviceIcon=" + this.b + ", deviceIconPath='" + this.f17120c + "', deviceType=" + this.d + ", deviceUniqueId='" + gdb.a(this.f17121e) + "', manufacturer='" + this.f + "', model='" + this.g + "', deviceSn='" + this.h + "', mac='" + gdb.a(this.i) + "', sku='" + this.f17122j + "', skuCode='" + this.k + "', id='" + this.f17123l + "', isConnected=" + this.m + '}';
    }
}
