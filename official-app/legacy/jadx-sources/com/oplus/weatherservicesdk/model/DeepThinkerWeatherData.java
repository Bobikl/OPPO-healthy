package com.oplus.weatherservicesdk.model;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DeepThinkerWeatherData {
    public static final int WEATHER_TYPE_ACTUAL = 0;
    public static final int WEATHER_TYPE_DAILY_FORECAST = 1;
    public static final int WEATHER_TYPE_LIFE_INDEX = 2;
    public ActualWeatherData actualWeatherData;
    public List<DaliyForecastData> daliyForecastDataList;
    public List<LifeIndexData> lifeIndexDataList;

    public class ActualWeatherData {
        public String currentHumidity;
        public String currentTemp;
        public int currentUvIndex;
        public String currentWeather;
        public int currentWindDegrees;
        public String currentWindPower;
        public int currentWindSpeed;
        public long date;
        public String pm10;
        public String pressure;
        public String realFeelTemp;
        public String visibility;
        public int weatherId;

        public ActualWeatherData() {
        }

        public String toString() {
            return "ActualWeatherData{weatherId=" + this.weatherId + ", date=" + this.date + ", currentWeather='" + this.currentWeather + "', currentHumidity='" + this.currentHumidity + "', currentTemp='" + this.currentTemp + "', realFeelTemp='" + this.realFeelTemp + "', visibility='" + this.visibility + "', pressure='" + this.pressure + "', currentUvIndex=" + this.currentUvIndex + ", currentWindPower='" + this.currentWindPower + "', currentWindDegrees=" + this.currentWindDegrees + ", currentWindSpeed=" + this.currentWindSpeed + ", pm10='" + this.pm10 + "'}";
        }
    }

    public class DaliyForecastData {
        public String currentWeather;
        public long date;
        public int dayWeatherId;
        public int nightWeatherId;
        public String tempMax;
        public String tempMin;
        public int weather_index;

        public DaliyForecastData() {
        }

        public String toString() {
            return "DaliyForecastData{weather_index=" + this.weather_index + ", date=" + this.date + ", dayWeatherId=" + this.dayWeatherId + ", nightWeatherId=" + this.nightWeatherId + ", tempMin='" + this.tempMin + "', tempMax='" + this.tempMax + "', currentWeather='" + this.currentWeather + "'}";
        }
    }

    public class LifeIndexData {
        public String adUrl;
        public String desc;
        public String id;
        public String info;
        public String level;
        public String name;
        public String pos;
        public String type;

        public LifeIndexData() {
        }

        public String toString() {
            return "LifeIndexData{name='" + this.name + "', id='" + this.id + "', desc='" + this.desc + "', type='" + this.type + "', level='" + this.level + "', pos='" + this.pos + "', adUrl='" + this.adUrl + "', info='" + this.info + "'}";
        }
    }

    public String toString() {
        return "DeepThinkerWeatherData{actualWeatherData=" + this.actualWeatherData + ", daliyForecastDataList=" + this.daliyForecastDataList + ", lifeIndexDataList=" + this.lifeIndexDataList + '}';
    }
}
