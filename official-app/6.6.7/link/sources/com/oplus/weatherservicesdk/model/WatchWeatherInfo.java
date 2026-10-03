package com.oplus.weatherservicesdk.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WatchWeatherInfo {
    public int cityId;
    public WatchAttendCity cityInfo;
    public long dateTimeInMills;
    public int dayWeatherId;
    public int nightWeatherId;
    public String sunriseTime;
    public String sunsetTime;
    public int weatherId;
    public int weatherIndex;
    public List<HourWeather> hoursTemp = new ArrayList();
    public CurrentInfo currentInfo = new CurrentInfo();
    public List<LifeIndexInfo> lifeIndex = new ArrayList();
    public AQI aqi = new AQI();
    public List<AlertInfo> alertInfo = new ArrayList();

    public static class AQI {
        public String aqiCO;
        public String aqiLevel;
        public String aqiNO;
        public String aqiNO2;
        public String aqiO3;
        public String aqiPm10;
        public String aqiSO;
        public String avgAqi;
        public String avgPm25;
        public long expiredTime;
    }

    public static class AlertInfo {
        public String alertsContent;
        public String alertsDescription;
        public String alertsHomeDescription;
        public int alertsLevel;
        public String alertsSource;
        public long expiredTime;
    }

    public static class CurrentInfo {
        public String currentHumidity;
        public String currentTemp;
        public String currentUVDesc;
        public int currentUVIndex;
        public String currentWeather;
        public int currentWeatherId = 0;
        public int currentWindDegrees;
        public String currentWindDirection;
        public String currentWindPower;
        public String dailyAdLink;
        public String dayTemp;
        public String dayWeather;
        public long expiredTime;
        public String logoUrl;
        public String nightTemp;
        public String nightWeather;
        public String observedAdLink;
        public String pressure;
        public String rainProbability;
        public String realFeelTemp;
        public String sourceAdLink;
        public String visibility;
    }

    public static class HourWeather {
        public String hour;
        public String rain;
        public String temp;
        public int weatherId;
    }

    public static class LifeIndexInfo {
        public String adLink;
        public String icon;
        public String level;
        public String name;
        public int pos;
        public int type;
    }
}
