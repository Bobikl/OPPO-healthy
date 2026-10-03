package com.oplus.weatherservicesdk.model;

/* JADX INFO: loaded from: classes5.dex */
public class SecureSettingsData {
    public static final String SEPARATOR = "::";
    public String cityCode;
    public String cityNameEn;
    public String cityNameLocal;
    public boolean isDayTime;
    public int locationResultCode;
    public String parentCityCode;
    public int period;
    public long sunriseTime;
    public long sunsetTime;
    public String temp;
    public String tempUnit;
    public String timeZone;
    public String timeZoneName;
    public String weatherDesc;
    public int weatherType;

    public String toString() {
        return this.temp + SEPARATOR + this.weatherType + SEPARATOR + this.weatherDesc + SEPARATOR + this.tempUnit + SEPARATOR + this.cityCode + SEPARATOR + this.cityNameLocal + SEPARATOR + this.cityNameEn + SEPARATOR + this.timeZone + SEPARATOR + this.timeZoneName + SEPARATOR + this.parentCityCode + SEPARATOR + this.locationResultCode + SEPARATOR + this.sunriseTime + SEPARATOR + this.sunsetTime + SEPARATOR + this.isDayTime + SEPARATOR + this.period;
    }
}
