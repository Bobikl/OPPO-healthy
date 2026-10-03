package com.heytap.store.platform.location.base.entity;

import androidx.autofill.HintConstants;
import com.amap.api.services.district.DistrictSearchQuery;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010<\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\b¨\u0006="}, d2 = {"Lcom/heytap/store/platform/location/base/entity/LocationInfo;", "Ljava/io/Serializable;", "()V", "adCode", "", "getAdCode", "()Ljava/lang/String;", "setAdCode", "(Ljava/lang/String;)V", "address", "getAddress", "setAddress", DistrictSearchQuery.KEYWORDS_CITY, "getCity", "setCity", "cityCode", "getCityCode", "setCityCode", "country", "getCountry", "setCountry", "countryCode", "getCountryCode", "setCountryCode", "direction", "", "getDirection", "()F", "setDirection", "(F)V", DistrictSearchQuery.KEYWORDS_DISTRICT, "getDistrict", "setDistrict", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "name", "getName", "setName", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "getPostalCode", "setPostalCode", DistrictSearchQuery.KEYWORDS_PROVINCE, "getProvince", "setProvince", "street", "getStreet", "setStreet", "streetNumber", "getStreetNumber", "setStreetNumber", "town", "getTown", "setTown", "toString", "location_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LocationInfo implements Serializable {

    @Nullable
    private String adCode;

    @Nullable
    private String address;

    @Nullable
    private String city;

    @Nullable
    private String cityCode;

    @Nullable
    private String country;

    @Nullable
    private String countryCode;
    private float direction;

    @Nullable
    private String district;
    private double latitude;
    private double longitude;

    @Nullable
    private String name;

    @Nullable
    private String postalCode;

    @Nullable
    private String province;

    @Nullable
    private String street;

    @Nullable
    private String streetNumber;

    @Nullable
    private String town;

    @Nullable
    public final String getAdCode() {
        return this.adCode;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCityCode() {
        return this.cityCode;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final float getDirection() {
        return this.direction;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    @Nullable
    public final String getStreet() {
        return this.street;
    }

    @Nullable
    public final String getStreetNumber() {
        return this.streetNumber;
    }

    @Nullable
    public final String getTown() {
        return this.town;
    }

    public final void setAdCode(@Nullable String str) {
        this.adCode = str;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setCityCode(@Nullable String str) {
        this.cityCode = str;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setCountryCode(@Nullable String str) {
        this.countryCode = str;
    }

    public final void setDirection(float f) {
        this.direction = f;
    }

    public final void setDistrict(@Nullable String str) {
        this.district = str;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPostalCode(@Nullable String str) {
        this.postalCode = str;
    }

    public final void setProvince(@Nullable String str) {
        this.province = str;
    }

    public final void setStreet(@Nullable String str) {
        this.street = str;
    }

    public final void setStreetNumber(@Nullable String str) {
        this.streetNumber = str;
    }

    public final void setTown(@Nullable String str) {
        this.town = str;
    }

    @NotNull
    public String toString() {
        return "LocationInfo(latitude=" + this.latitude + ", longitude=" + this.longitude + ", province=" + ((Object) this.province) + ", name=" + ((Object) this.name) + ", city=" + ((Object) this.city) + ", address=" + ((Object) this.address) + ", direction=" + this.direction + ", cityCode=" + ((Object) this.cityCode) + ", district=" + ((Object) this.district) + ", country=" + ((Object) this.country) + ", countryCode=" + ((Object) this.countryCode) + ", street=" + ((Object) this.street) + ", streetNumber=" + ((Object) this.streetNumber) + ", town=" + ((Object) this.town) + ", adCode=" + ((Object) this.adCode) + ", postalCode=" + ((Object) this.postalCode) + ')';
    }
}
