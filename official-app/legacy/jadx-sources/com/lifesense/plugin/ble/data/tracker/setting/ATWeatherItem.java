package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public class ATWeatherItem {
    private int aqi;
    private int temperature1;
    private int temperature2;
    private ATWeatherType weatherState;

    public int getAqi() {
        return this.aqi;
    }

    public int getTemperature1() {
        return this.temperature1;
    }

    public int getTemperature2() {
        return this.temperature2;
    }

    public ATWeatherType getWeatherState() {
        return this.weatherState;
    }

    public void setAqi(int i) {
        this.aqi = i;
    }

    public void setTemperature1(int i) {
        this.temperature1 = i;
    }

    public void setTemperature2(int i) {
        this.temperature2 = i;
    }

    public void setWeatherState(ATWeatherType aTWeatherType) {
        this.weatherState = aTWeatherType;
    }

    public String toString() {
        return "WeatherFuture [weatherState=" + this.weatherState + ", temperature1=" + this.temperature1 + ", temperature2=" + this.temperature2 + ", aqi=" + this.aqi + "]";
    }
}
