package com.oplus.weatherservicesdk.data;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Weather implements Serializable {
    public static final String SEPARATOR = "\n";
    private static final long serialVersionUID = 1;
    public AirQuality airQuality;
    public ArrayList<Alert> alert;
    public City city;
    public ArrayList<DailyForecast> dailyForecastArrayList;
    public ArrayList<HourlyForecast> hourlyForecastWeatherArrayList;
    public ArrayList<LifeIndex> lifeIndexArrayList;
    public ObserveWeather observeWeather;
    public ShortRain shortRain;
    public int status = -1;
    public ArrayList<WeatherTips> weatherTipsArrayList;

    public static class AirQuality implements Serializable {
        private static final long serialVersionUID = 1;
        public String adLink;
        public String aqi;
        public String aqiDesc;
        public String co;
        public String no;
        public String no2;
        public String o3;
        public String pm10;
        public String pm25;
        public String so;

        public AirQuality(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.aqi = str;
            this.aqiDesc = str2;
            this.pm25 = str3;
            this.pm10 = str4;
            this.o3 = str5;
            this.co = str6;
            this.no = str7;
            this.no2 = str8;
            this.so = str9;
            this.adLink = str10;
        }

        public String toString() {
            return "AirQuality{aqi='" + this.aqi + "', aqiDesc='" + this.aqiDesc + "', pm25='" + this.pm25 + "', pm10='" + this.pm10 + "', o3='" + this.o3 + "', co='" + this.co + "', no='" + this.no + "', no2='" + this.no2 + "', so='" + this.so + "', adLink='" + this.adLink + "'}";
        }
    }

    public static class Alert implements Serializable {
        private static final long serialVersionUID = 1;
        public String defenseGuide;
        public String description;
        public int level;
        public String link;
        public String source;
        public String title;

        public Alert() {
        }

        public Alert(String str, String str2, String str3, int i, String str4, String str5) {
            this.title = str;
            this.description = str2;
            this.source = str3;
            this.level = i;
            this.defenseGuide = str4;
            this.link = str5;
        }

        public String toString() {
            return Weather.SEPARATOR + this.title + Weather.SEPARATOR + this.description + Weather.SEPARATOR + this.source + Weather.SEPARATOR + this.level + Weather.SEPARATOR + this.defenseGuide + Weather.SEPARATOR + this.link;
        }
    }

    public static class City implements Serializable {
        private static final long serialVersionUID = 1;
        public String cityCode;
        public String cityName;
        public int locationResultCode;
        public String provinceName;
        public String timeZone;
        public String timeZoneName;

        public City() {
        }

        public City(String str, String str2, String str3, String str4, String str5, int i) {
            this.cityCode = str;
            this.cityName = str2;
            this.provinceName = str3;
            this.timeZone = str4;
            this.timeZoneName = str5;
            this.locationResultCode = i;
        }

        public String toString() {
            return "City{cityCode='" + this.cityCode + "', cityName='" + this.cityName + "', provinceName='" + this.provinceName + "', timeZone='" + this.timeZone + "', timeZoneName='" + this.timeZoneName + "', locationResultCode=" + this.locationResultCode + '}';
        }
    }

    public static class DailyForecast implements Serializable {
        private static final long serialVersionUID = 1;
        public String dailyAdLink;
        public String dailyDetailAdLink;
        public long date;
        public String dayWeather;
        public int dayWeatherId;
        public String nightWeather;
        public int nightWeatherId;
        public String precipitationProbability;
        public String sunriseTime;
        public String sunsetTime;
        public int tempMax;
        public int tempMin;
        public String tempUnit;
        public int weather_index;

        public DailyForecast(int i, long j, int i2, int i3, String str, String str2, int i4, int i5, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.weather_index = i;
            this.date = j;
            this.dayWeatherId = i2;
            this.nightWeatherId = i3;
            this.dayWeather = str;
            this.nightWeather = str2;
            this.tempMin = i4;
            this.tempMax = i5;
            this.sunriseTime = str3;
            this.sunsetTime = str4;
            this.precipitationProbability = str5;
            this.dailyAdLink = str6;
            this.dailyDetailAdLink = str7;
            this.tempUnit = str8;
        }

        public String toString() {
            return "DailyForecast{weather_index=" + this.weather_index + ", date=" + this.date + ", dayWeatherId=" + this.dayWeatherId + ", nightWeatherId=" + this.nightWeatherId + ", dayWeather=" + this.dayWeather + ", nightWeather=" + this.nightWeather + ", tempMin='" + this.tempMin + "', tempMax='" + this.tempMax + "', sunriseTime='" + this.sunriseTime + "', sunsetTime='" + this.sunsetTime + "', precipitationProbability='" + this.precipitationProbability + "', dailyAdLink='" + this.dailyAdLink + "', dailyDetailAdLink='" + this.dailyDetailAdLink + "', tempUnit='" + this.tempUnit + "'}";
        }
    }

    public static class HourlyForecast implements Serializable {
        private static final long serialVersionUID = 1;
        public int hourth;
        public int precipitationProbability;
        public int rainProbability;
        public int relativeHumidity;
        public double temp;
        public String tempUnit;
        public long time;
        public String uvDesc;
        public int uvIndex;
        public int weatherCode;
        public String weatherDesc;
        public int windDegrees;
        public int windSpeed;

        public HourlyForecast(int i, long j, int i2, String str, double d, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3) {
            this.hourth = i;
            this.time = j;
            this.weatherCode = i2;
            this.weatherDesc = str;
            this.temp = d;
            this.rainProbability = i3;
            this.windDegrees = i4;
            this.windSpeed = i5;
            this.relativeHumidity = i6;
            this.precipitationProbability = i7;
            this.uvIndex = i8;
            this.uvDesc = str2;
            this.tempUnit = str3;
        }

        public String toString() {
            return "HourlyForecast{hourth=" + this.hourth + ", time=" + this.time + ", weatherCode=" + this.weatherCode + ", weatherDesc='" + this.weatherDesc + "', temp=" + this.temp + ", rainProbability=" + this.rainProbability + ", windDegrees=" + this.windDegrees + ", windSpeed=" + this.windSpeed + ", relativeHumidity=" + this.relativeHumidity + ", precipitationProbability=" + this.precipitationProbability + ", uvIndex=" + this.uvIndex + ", uvDesc='" + this.uvDesc + "', tempUnit='" + this.tempUnit + "'}";
        }
    }

    public static class LifeIndex implements Serializable {
        private static final long serialVersionUID = 1;
        public String adUrl;
        public String desc;
        public String grayIcon;
        public String icon;
        public String info;
        public String level;
        public int lifeId;
        public String name;
        public int pos;
        public int type;

        public LifeIndex(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, String str7) {
            this.grayIcon = str;
            this.icon = str2;
            this.info = str3;
            this.adUrl = str4;
            this.pos = i;
            this.level = str5;
            this.type = i2;
            this.desc = str6;
            this.lifeId = i3;
            this.name = str7;
        }

        public String toString() {
            return "LifeIndex{name='" + this.name + "', lifeId='" + this.lifeId + "', desc='" + this.desc + "', type='" + this.type + "', level='" + this.level + "', pos='" + this.pos + "', adUrl='" + this.adUrl + "', info='" + this.info + "', icon='" + this.icon + "', grayIcon='" + this.grayIcon + "'}";
        }
    }

    public static class ObserveWeather implements Serializable {
        private static final long serialVersionUID = 1;
        public String bodyTemp;
        public String humidity;
        public boolean isDayTime;
        public String link;
        public int period;
        public String pressure;
        public String sourceAdLink;
        public String sunriseTime;
        public String sunsetTime;
        public String temp;
        public String tempUnit;
        public String uvDesc;
        public int uvIndex;
        public String visibility;
        public int weatherCode;
        public String weatherDesc;
        public int windDegree;
        public String windDirect;
        public String windPower;
        public String windSpeed;

        public ObserveWeather() {
        }

        public ObserveWeather(String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, int i3, String str7, String str8, String str9, String str10, String str11, boolean z, int i4, String str12, String str13, String str14, String str15) {
            this.temp = str;
            this.weatherCode = i;
            this.weatherDesc = str2;
            this.tempUnit = str3;
            this.humidity = str4;
            this.pressure = str5;
            this.uvIndex = i2;
            this.visibility = str6;
            this.windDegree = i3;
            this.windDirect = str7;
            this.windPower = str8;
            this.link = str9;
            this.sunriseTime = str10;
            this.sunsetTime = str11;
            this.isDayTime = z;
            this.period = i4;
            this.bodyTemp = str12;
            this.windSpeed = str13;
            this.uvDesc = str14;
            this.sourceAdLink = str15;
        }

        public String toString() {
            return "ObserveWeather{temp='" + this.temp + "', weatherCode=" + this.weatherCode + ", weatherDesc='" + this.weatherDesc + "', tempUnit='" + this.tempUnit + "', humidity='" + this.humidity + "', pressure='" + this.pressure + "', uvIndex=" + this.uvIndex + ", visibility='" + this.visibility + "', windDegree=" + this.windDegree + ", windDirect='" + this.windDirect + "', windPower='" + this.windPower + "', link='" + this.link + "', sunriseTime='" + this.sunriseTime + "', sunsetTime='" + this.sunsetTime + "', isDayTime=" + this.isDayTime + ", period=" + this.period + ", bodyTemp='" + this.bodyTemp + "', windSpeed='" + this.windSpeed + "', uvDesc='" + this.uvDesc + "', sourceAdLink='" + this.sourceAdLink + "'}";
        }
    }

    public static class ShortRain implements Serializable {
        private static final long serialVersionUID = 1;
        public int descId;
        public String notice;
        public long timestamp;

        public ShortRain(String str, int i, long j) {
            this.notice = str;
            this.descId = i;
            this.timestamp = j;
        }

        public String toString() {
            return "ShortRain{notice='" + this.notice + "', descId=" + this.descId + ", timestamp=" + this.timestamp + '}';
        }
    }

    public static class WeatherTips implements Serializable {
        private static final long serialVersionUID = 1;
        public String desc;
        public String detailLink;
        public long priority;
        public long timestamp;
        public String title;
        public String type;

        public WeatherTips(String str, long j, String str2, String str3, String str4, long j2) {
            this.type = str;
            this.timestamp = j;
            this.title = str2;
            this.desc = str3;
            this.detailLink = str4;
            this.priority = j2;
        }

        public String toString() {
            return "WeatherTipsExport{type='" + this.type + "', timestamp=" + this.timestamp + ", title='" + this.title + "', desc='" + this.desc + "', detailLink='" + this.detailLink + "', priority=" + this.priority + '}';
        }
    }

    public String toString() {
        return "Weather{status=" + this.status + ", city=" + this.city + ", observeWeather=" + this.observeWeather + ", airQuality=" + this.airQuality + ", alert=" + this.alert + ", lifeIndexArrayList=" + this.lifeIndexArrayList + ", dailyForecastArrayList=" + this.dailyForecastArrayList + ", hourlyForecastWeatherArrayList=" + this.hourlyForecastWeatherArrayList + ", shortRain=" + this.shortRain + ", weatherTipsExport=" + this.weatherTipsArrayList + '}';
    }
}
