package com.allawn.weather.common.vo;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class HourlyForecastVO extends DataVO {
    private List<ForecastData> data;
    private Long forecastTime;

    public static class ForecastData {
        private String darkWeatherIcon;
        private int hourth;
        private int rainProbability;
        private double temp;
        private long time;
        private int weatherCode;
        private String weatherDesc;
        private String weatherIcon;

        public String getDarkWeatherIcon() {
            return this.darkWeatherIcon;
        }

        public int getHourth() {
            return this.hourth;
        }

        public int getRainProbability() {
            return this.rainProbability;
        }

        public double getTemp() {
            return this.temp;
        }

        public long getTime() {
            return this.time;
        }

        public int getWeatherCode() {
            return this.weatherCode;
        }

        public String getWeatherDesc() {
            return this.weatherDesc;
        }

        public String getWeatherIcon() {
            return this.weatherIcon;
        }

        public void setDarkWeatherIcon(String str) {
            this.darkWeatherIcon = str;
        }

        public void setHourth(int i) {
            this.hourth = i;
        }

        public void setRainProbability(int i) {
            this.rainProbability = i;
        }

        public void setTemp(double d) {
            this.temp = d;
        }

        public void setTime(long j2) {
            this.time = j2;
        }

        public void setWeatherCode(int i) {
            this.weatherCode = i;
        }

        public void setWeatherDesc(String str) {
            this.weatherDesc = str;
        }

        public void setWeatherIcon(String str) {
            this.weatherIcon = str;
        }

        public String toString() {
            return "ForecastData{hourth=" + this.hourth + ", time=" + this.time + ", weatherCode=" + this.weatherCode + ", weatherIcon='" + this.weatherIcon + "', darkWeatherIcon='" + this.darkWeatherIcon + "', weatherDesc='" + this.weatherDesc + "', temp=" + this.temp + ", rainProbability=" + this.rainProbability + '}';
        }
    }

    public List<ForecastData> getData() {
        return this.data;
    }

    public Long getForecastTime() {
        return this.forecastTime;
    }

    public void setData(List<ForecastData> list) {
        this.data = list;
    }

    public void setForecastTime(Long l2) {
        this.forecastTime = l2;
    }

    @Override // com.allawn.weather.common.vo.DataVO
    public String toString() {
        return "HourlyForecastVO{forecastTime=" + this.forecastTime + ", data=" + this.data + '}';
    }
}
