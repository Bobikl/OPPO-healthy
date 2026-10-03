package com.heytap.weather.exception;

/* JADX INFO: loaded from: classes3.dex */
public class CustomWeatherSdkException extends Exception {
    private int cityInfoCode;
    private int httpCode;

    public CustomWeatherSdkException() {
        this.httpCode = -1;
        this.cityInfoCode = -1;
    }

    public int getCityInfoCode() {
        return this.cityInfoCode;
    }

    public int getHttpCode() {
        return this.httpCode;
    }

    public void setCityInfoCode(int i) {
        this.cityInfoCode = i;
    }

    public void setHttpCode(int i) {
        this.httpCode = i;
    }

    public CustomWeatherSdkException(String str) {
        super(str);
        this.httpCode = -1;
        this.cityInfoCode = -1;
    }

    public CustomWeatherSdkException(String str, Throwable th) {
        super(str, th);
        this.httpCode = -1;
        this.cityInfoCode = -1;
    }

    public CustomWeatherSdkException(Throwable th) {
        super(th);
        this.httpCode = -1;
        this.cityInfoCode = -1;
    }
}
