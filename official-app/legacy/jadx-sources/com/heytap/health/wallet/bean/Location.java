package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u;
import com.platform.usercenter.network.header.HeaderConstant;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Location {
    String address;
    String cityCode;
    String latitude;
    String longitude;
    String showName;
    long timestamp;

    public Location() {
    }

    public Location(String str, String str2, String str3, long j2) {
        t6b.b(HeaderConstant.HEAD_K_302_LOCATION, "Constructor, longitude: " + str + "  latitude: " + str2 + " cityCode: " + str3);
        this.longitude = str;
        this.latitude = str2;
        this.cityCode = str3;
        this.timestamp = j2;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getEncryptLocation(String str, String str2) {
        String str3 = "{\"longitude\":\"" + this.longitude + "\",\"latitude\":\"" + this.latitude + "\",\"cityCode\":\"" + this.cityCode + "\",\"timestamp\":\"" + this.timestamp + "\"}";
        t6b.b(HeaderConstant.HEAD_K_302_LOCATION, "getEncryptLocation, key: " + str + "  iv: " + str2 + " entity: " + str3);
        return u.a(str3, str.getBytes(), str2.getBytes());
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getShowName() {
        return this.showName;
    }

    public Long getTimestamp() {
        return Long.valueOf(this.timestamp);
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setShowName(String str) {
        this.showName = str;
    }

    public void setTimestamp(Long l2) {
        this.timestamp = l2.longValue();
    }

    public Location(String str, String str2, String str3, long j2, String str4, String str5) {
        t6b.b(HeaderConstant.HEAD_K_302_LOCATION, "Constructor, longitude: " + str + "  latitude: " + str2 + " cityCode: " + str3);
        this.longitude = str;
        this.latitude = str2;
        this.cityCode = str3;
        this.timestamp = j2;
        this.showName = str4;
        this.address = str5;
    }
}
