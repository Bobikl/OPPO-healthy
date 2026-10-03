package com.allawn.weather.common.vo;

/* JADX INFO: loaded from: classes12.dex */
public class ObserveVO extends DataVO {
    private String adLink;
    private double bodyTemp;
    private String darkWeatherIcon;
    private Long forecastTime;
    private double humidity;
    private double pressure;
    private double temp;
    private Long todayDate;
    private int uvIndex;
    private int visibility;
    private int weatherCode;
    private String weatherDesc;
    private String weatherIcon;
    private int windDegree;
    private int windPower;
    private int windSpeed;

    public String getAdLink() {
        return this.adLink;
    }

    public double getBodyTemp() {
        return this.bodyTemp;
    }

    public String getDarkWeatherIcon() {
        return this.darkWeatherIcon;
    }

    public Long getForecastTime() {
        return this.forecastTime;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public double getPressure() {
        return this.pressure;
    }

    public double getTemp() {
        return this.temp;
    }

    public Long getTodayDate() {
        return this.todayDate;
    }

    public int getUvIndex() {
        return this.uvIndex;
    }

    public int getVisibility() {
        return this.visibility;
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

    public int getWindDegree() {
        return this.windDegree;
    }

    public int getWindPower() {
        return this.windPower;
    }

    public int getWindSpeed() {
        return this.windSpeed;
    }

    public void setAdLink(String str) {
        this.adLink = str;
    }

    public void setBodyTemp(double d) {
        this.bodyTemp = d;
    }

    public void setDarkWeatherIcon(String str) {
        this.darkWeatherIcon = str;
    }

    public void setForecastTime(Long l2) {
        this.forecastTime = l2;
    }

    public void setHumidity(double d) {
        this.humidity = d;
    }

    public void setPressure(double d) {
        this.pressure = d;
    }

    public void setTemp(double d) {
        this.temp = d;
    }

    public void setTodayDate(Long l2) {
        this.todayDate = l2;
    }

    public void setUvIndex(int i) {
        this.uvIndex = i;
    }

    public void setVisibility(int i) {
        this.visibility = i;
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

    public void setWindDegree(int i) {
        this.windDegree = i;
    }

    public void setWindPower(int i) {
        this.windPower = i;
    }

    public void setWindSpeed(int i) {
        this.windSpeed = i;
    }

    @Override // com.allawn.weather.common.vo.DataVO
    public String toString() {
        return "ObserveVO{forecastTime=" + this.forecastTime + ", temp=" + this.temp + ", weatherCode=" + this.weatherCode + ", windDegree=" + this.windDegree + ", windSpeed=" + this.windSpeed + ", windPower=" + this.windPower + ", humidity=" + this.humidity + ", uvIndex=" + this.uvIndex + ", bodyTemp=" + this.bodyTemp + ", pressure=" + this.pressure + ", visibility=" + this.visibility + ", adLink='" + this.adLink + "', todayDate=" + this.todayDate + ", weatherIcon='" + this.weatherIcon + "', darkWeatherIcon='" + this.darkWeatherIcon + "', weatherDesc='" + this.weatherDesc + "'}";
    }
}
