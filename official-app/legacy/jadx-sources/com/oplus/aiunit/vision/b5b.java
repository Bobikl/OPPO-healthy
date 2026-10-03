package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.location.HMapLocation;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* JADX INFO: loaded from: classes16.dex */
public class b5b {
    public static final String COORD_TYPE_GCJ02 = "GCJ02";
    public static final String COORD_TYPE_WGS84 = "WGS84";
    public static final int LOCATION_SUCCESS = 0;
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9607c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9608e;
    public int f;
    public String g;
    public String h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9609j;
    public String k;

    public b5b() {
    }

    public String a(String str) {
        return str == null ? "" : str;
    }

    public String b() {
        return this.f9607c;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f9609j;
    }

    public String f() {
        return this.b;
    }

    public int g() {
        return this.i;
    }

    public String h() {
        return this.d;
    }

    public String i() {
        return this.f9608e;
    }

    public String j() {
        return this.g;
    }

    public void k(String str) {
        this.f9607c = str;
    }

    public void l(String str) {
        this.h = str;
    }

    public void m(String str) {
        this.a = str;
    }

    public void n(String str) {
        this.f9609j = str;
    }

    public void o(String str) {
        this.k = str;
    }

    public void p(String str) {
        this.b = str;
    }

    public void q(int i) {
        this.i = i;
    }

    public void r(String str) {
        this.d = str;
    }

    public void s(int i) {
        this.f = i;
    }

    public void t(String str) {
        this.f9608e = str;
    }

    @NonNull
    public String toString() {
        return "LocationData{ errCode='" + this.i + "', coordType='" + this.f9609j + "', mCity='" + this.a + "', mLocType=" + this.f + ", mLatitude='" + this.d + "', mLongitude='" + this.f9608e + "', mDistrict='" + this.b + "', mAdCode='" + this.f9607c + "', mProvince='" + this.g + "', mAddrStr='" + this.h + "', mDescription='" + this.k + "'}";
    }

    public void u(String str) {
        this.g = str;
    }

    public b5b(HMapLocation hMapLocation) {
        m(a(hMapLocation.getCity()));
        p(a(hMapLocation.getDistrict()));
        k(a(hMapLocation.getAdCode()));
        u(a(hMapLocation.getProvince()));
        l(a(hMapLocation.getAddrStr()));
        s(hMapLocation.getLocType());
        n(hMapLocation.getCoordType());
        DecimalFormatSymbols decimalFormatSymbols = x05.TIME_FORMAT_LOCALE_CN_SYMBOL;
        r(new DecimalFormat("0.00000", decimalFormatSymbols).format(hMapLocation.getLatitude()));
        t(new DecimalFormat("0.00000", decimalFormatSymbols).format(hMapLocation.getLongitude()));
        q(hMapLocation.getErrorCode());
        o(a(hMapLocation.getDescription()));
    }
}
