package com.oplus.weatherservicesdk.model;

/* JADX INFO: loaded from: classes5.dex */
public class WatchAttendCity {
    public String aqiLevelStr;
    public String cityCode;
    public String cityName;
    public String cityNameEn;
    public String countryEn;
    public String currentTemp;
    public String currentWeather;
    public int isLocalCity;
    public String local;
    public String parentCityCode;
    public String provinceCn;
    public String provinceEn;
    public int sort;
    public String timeZone;
    public String unit;
    public String weatherId;

    public WatchAttendCity fillValueByAttendCity(AttendCity attendCity) {
        this.cityCode = attendCity.cityCode;
        this.cityName = attendCity.cityName;
        this.cityNameEn = attendCity.cityNameEn;
        this.countryEn = attendCity.countryEn;
        this.provinceCn = attendCity.provinceCn;
        this.provinceEn = attendCity.provinceEn;
        this.parentCityCode = attendCity.parentCityCode;
        this.timeZone = attendCity.timeZone;
        this.isLocalCity = Integer.parseInt(attendCity.location);
        this.sort = attendCity.sort;
        return this;
    }

    public String toString() {
        return "WatchAttendCity{local='" + this.local + "', cityCode='" + this.cityCode + "', cityName='" + this.cityName + "', cityNameEn='" + this.cityNameEn + "', countryEn='" + this.countryEn + "', provinceCn='" + this.provinceCn + "', provinceEn='" + this.provinceEn + "', parentCityCode='" + this.parentCityCode + "', timeZone='" + this.timeZone + "', unit='" + this.unit + "', currentWeather='" + this.currentWeather + "', weatherId='" + this.weatherId + "', currentTemp='" + this.currentTemp + "', isLocalCity=" + this.isLocalCity + ", aqiLevelStr='" + this.aqiLevelStr + "', sort=" + this.sort + '}';
    }
}
