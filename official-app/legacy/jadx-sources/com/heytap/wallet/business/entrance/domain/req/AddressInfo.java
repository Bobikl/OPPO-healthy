package com.heytap.wallet.business.entrance.domain.req;

import androidx.annotation.Keep;
import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AddressInfo implements Serializable {

    @Tag(3)
    private String cityCode;

    @Tag(2)
    private String latitude;

    @Tag(4)
    private String locale;

    @Tag(1)
    private String longitude;

    public AddressInfo(String str, String str2, String str3, String str4) {
        this.longitude = str;
        this.latitude = str2;
        this.locale = str3;
        this.cityCode = str4;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }
}
