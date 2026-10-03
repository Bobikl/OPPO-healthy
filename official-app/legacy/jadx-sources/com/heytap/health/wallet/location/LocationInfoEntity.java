package com.heytap.health.wallet.location;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.ika;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class LocationInfoEntity {
    private String adCode;
    private String address;
    private String city;
    private String cityCode;
    private String coorType;
    private String country;
    private String countryCode;
    private float direction;
    private String district;
    private String latitude;
    private String longitude;
    private String provice;
    private float radius;
    private String street;

    private String formatLatlng(double d) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        decimalFormat.setMaximumFractionDigits(6);
        return decimalFormat.format(d);
    }

    public static LocationInfoEntity parseFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (LocationInfoEntity) ika.c().b(str, LocationInfoEntity.class);
    }

    public String getAdCode() {
        return this.adCode;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCoorType() {
        return this.coorType;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public float getDirection() {
        return this.direction;
    }

    public String getDistrict() {
        return this.district;
    }

    public double getLatitude() {
        return drk.a(this.latitude);
    }

    public double getLongitude() {
        return drk.a(this.longitude);
    }

    public String getProvice() {
        return this.provice;
    }

    public float getRadius() {
        return this.radius;
    }

    public String getStreet() {
        return this.street;
    }

    public boolean isAvailable() {
        return (TextUtils.isEmpty(this.provice) || TextUtils.isEmpty(this.city) || TextUtils.isEmpty(this.latitude) || TextUtils.isEmpty(this.longitude)) ? false : true;
    }

    public LocationInfoEntity setAdCode(String str) {
        this.adCode = str;
        return this;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public LocationInfoEntity setCityCode(String str) {
        this.cityCode = str;
        return this;
    }

    public void setCoorType(String str) {
        this.coorType = str;
    }

    public LocationInfoEntity setCountry(String str) {
        this.country = str;
        return this;
    }

    public LocationInfoEntity setCountryCode(String str) {
        this.countryCode = str;
        return this;
    }

    public void setDirection(float f) {
        this.direction = f;
    }

    public LocationInfoEntity setDistrict(String str) {
        this.district = str;
        return this;
    }

    public void setLatitude(double d) {
        this.latitude = formatLatlng(d);
    }

    public void setLongitude(double d) {
        this.longitude = formatLatlng(d);
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setRadius(float f) {
        this.radius = f;
    }

    public void setStreet(String str) {
        this.street = str;
    }

    public LocationInfoEntity setLatitude(String str) {
        this.latitude = str;
        return this;
    }

    public LocationInfoEntity setLongitude(String str) {
        this.longitude = str;
        return this;
    }
}
