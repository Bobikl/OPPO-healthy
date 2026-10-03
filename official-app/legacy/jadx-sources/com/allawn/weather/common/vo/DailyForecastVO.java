package com.allawn.weather.common.vo;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DailyForecastVO extends DataVO {
    private String bottomUrl;
    private String dailyAdLink;
    private List<ForecastData> data;
    private Long forecastTime;
    private String sourceAdLink;

    public static class ForecastData {
        private String darkWeatherIcon;
        private int dayCode;
        private String dayWeatherDesc;
        private String dayWeatherIcon;
        private int dayWindDegree;
        private int dayWindPower;
        private int dayWindSpeed;
        private int nightCode;
        private String nightWeatherDesc;
        private String nightWeatherIcon;
        private int nightWindDegree;
        private int nightWindPower;
        private int nightWindSpeed;
        private long sunriseTime;
        private long sunsetTime;
        private double tempMax;
        private double tempMin;
        private long time;

        public String getDarkWeatherIcon() {
            return this.darkWeatherIcon;
        }

        public int getDayCode() {
            return this.dayCode;
        }

        public String getDayWeatherDesc() {
            return this.dayWeatherDesc;
        }

        public String getDayWeatherIcon() {
            return this.dayWeatherIcon;
        }

        public int getDayWindDegree() {
            return this.dayWindDegree;
        }

        public int getDayWindPower() {
            return this.dayWindPower;
        }

        public int getDayWindSpeed() {
            return this.dayWindSpeed;
        }

        public int getNightCode() {
            return this.nightCode;
        }

        public String getNightWeatherDesc() {
            return this.nightWeatherDesc;
        }

        public String getNightWeatherIcon() {
            return this.nightWeatherIcon;
        }

        public int getNightWindDegree() {
            return this.nightWindDegree;
        }

        public int getNightWindPower() {
            return this.nightWindPower;
        }

        public int getNightWindSpeed() {
            return this.nightWindSpeed;
        }

        public long getSunriseTime() {
            return this.sunriseTime;
        }

        public long getSunsetTime() {
            return this.sunsetTime;
        }

        public double getTempMax() {
            return this.tempMax;
        }

        public double getTempMin() {
            return this.tempMin;
        }

        public long getTime() {
            return this.time;
        }

        public void setDarkWeatherIcon(String str) {
            this.darkWeatherIcon = str;
        }

        public void setDayCode(int i) {
            this.dayCode = i;
        }

        public void setDayWeatherDesc(String str) {
            this.dayWeatherDesc = str;
        }

        public void setDayWeatherIcon(String str) {
            this.dayWeatherIcon = str;
        }

        public void setDayWindDegree(int i) {
            this.dayWindDegree = i;
        }

        public void setDayWindPower(int i) {
            this.dayWindPower = i;
        }

        public void setDayWindSpeed(int i) {
            this.dayWindSpeed = i;
        }

        public void setNightCode(int i) {
            this.nightCode = i;
        }

        public void setNightWeatherDesc(String str) {
            this.nightWeatherDesc = str;
        }

        public void setNightWeatherIcon(String str) {
            this.nightWeatherIcon = str;
        }

        public void setNightWindDegree(int i) {
            this.nightWindDegree = i;
        }

        public void setNightWindPower(int i) {
            this.nightWindPower = i;
        }

        public void setNightWindSpeed(int i) {
            this.nightWindSpeed = i;
        }

        public void setSunriseTime(long j2) {
            this.sunriseTime = j2;
        }

        public void setSunsetTime(long j2) {
            this.sunsetTime = j2;
        }

        public void setTempMax(double d) {
            this.tempMax = d;
        }

        public void setTempMin(double d) {
            this.tempMin = d;
        }

        public void setTime(long j2) {
            this.time = j2;
        }

        public String toString() {
            return "ForecastData{time=" + this.time + ", dayCode=" + this.dayCode + ", darkWeatherIcon='" + this.darkWeatherIcon + "', dayWeatherIcon='" + this.dayWeatherIcon + "', dayWeatherDesc='" + this.dayWeatherDesc + "', nightCode=" + this.nightCode + ", nightWeatherIcon='" + this.nightWeatherIcon + "', nightWeatherDesc='" + this.nightWeatherDesc + "', tempMin=" + this.tempMin + ", tempMax=" + this.tempMax + ", dayWindDegree=" + this.dayWindDegree + ", nightWindDegree=" + this.nightWindDegree + ", dayWindSpeed=" + this.dayWindSpeed + ", dayWindPower=" + this.dayWindPower + ", nightWindSpeed=" + this.nightWindSpeed + ", nightWindPower=" + this.nightWindPower + ", sunriseTime=" + this.sunriseTime + ", sunsetTime=" + this.sunsetTime + '}';
        }
    }

    public String getBottomUrl() {
        return this.bottomUrl;
    }

    public String getDailyAdLink() {
        return this.dailyAdLink;
    }

    public List<ForecastData> getData() {
        return this.data;
    }

    public Long getForecastTime() {
        return this.forecastTime;
    }

    public String getSourceAdLink() {
        return this.sourceAdLink;
    }

    public void setBottomUrl(String str) {
        this.bottomUrl = str;
    }

    public void setDailyAdLink(String str) {
        this.dailyAdLink = str;
    }

    public void setData(List<ForecastData> list) {
        this.data = list;
    }

    public void setForecastTime(Long l2) {
        this.forecastTime = l2;
    }

    public void setSourceAdLink(String str) {
        this.sourceAdLink = str;
    }

    @Override // com.allawn.weather.common.vo.DataVO
    public String toString() {
        return "DailyForecastVO{forecastTime=" + this.forecastTime + ", data=" + this.data.toString() + ", dailyAdLink='" + this.dailyAdLink + "', sourceAdLink='" + this.sourceAdLink + "', bottomUrl='" + this.bottomUrl + "'}";
    }
}
