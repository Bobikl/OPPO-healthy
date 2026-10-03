package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u0000 92\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b7\u00108R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR$\u00104\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\b¨\u0006;"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/DailyForecast;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "highTemperature", "Ljava/lang/String;", "getHighTemperature", "()Ljava/lang/String;", "setHighTemperature", "(Ljava/lang/String;)V", "lowTemperature", "getLowTemperature", "setLowTemperature", "weekDay", "getWeekDay", "setWeekDay", "date", "getDate", "setDate", "weatherCondition", "getWeatherCondition", "setWeatherCondition", "windCondition", "getWindCondition", "setWindCondition", "temperature", "getTemperature", "setTemperature", "pm25", "getPm25", "setPm25", "airQuality", "getAirQuality", "setAirQuality", "weatherIcon", "getWeatherIcon", "setWeatherIcon", "", "weatherCode", "Ljava/lang/Integer;", "getWeatherCode", "()Ljava/lang/Integer;", "setWeatherCode", "(Ljava/lang/Integer;)V", "darkWeatherIcon", "getDarkWeatherIcon", "setDarkWeatherIcon", "presentKey", "getPresentKey", "setPresentKey", "presentValue", "getPresentValue", "setPresentValue", "presentValueUnit", "getPresentValueUnit", "setPresentValueUnit", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DailyForecast extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("airQuality")
    @Nullable
    private String airQuality;

    @JsonProperty("darkWeatherIcon")
    @Nullable
    private String darkWeatherIcon;

    @JsonProperty("date")
    @Nullable
    private String date;

    @JsonProperty("highTemperature")
    @Nullable
    private String highTemperature;

    @JsonProperty("lowTemperature")
    @Nullable
    private String lowTemperature;

    @JsonProperty("pm25")
    @Nullable
    private String pm25;

    @Nullable
    private String presentKey;

    @Nullable
    private String presentValue;

    @Nullable
    private String presentValueUnit;

    @JsonProperty("temperature")
    @Nullable
    private String temperature;

    @JsonProperty("weatherCode")
    @Nullable
    private Integer weatherCode;

    @JsonProperty("weatherCondition")
    @Nullable
    private String weatherCondition;

    @JsonProperty("weatherIcon")
    @Nullable
    private String weatherIcon;

    @JsonProperty("weekDay")
    @Nullable
    private String weekDay;

    @JsonProperty("windCondition")
    @Nullable
    private String windCondition;

    @Nullable
    public final String getAirQuality() {
        return this.airQuality;
    }

    @Nullable
    public final String getDarkWeatherIcon() {
        return this.darkWeatherIcon;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getHighTemperature() {
        return this.highTemperature;
    }

    @Nullable
    public final String getLowTemperature() {
        return this.lowTemperature;
    }

    @Nullable
    public final String getPm25() {
        return this.pm25;
    }

    @Nullable
    public final String getPresentKey() {
        return this.presentKey;
    }

    @Nullable
    public final String getPresentValue() {
        return this.presentValue;
    }

    @Nullable
    public final String getPresentValueUnit() {
        return this.presentValueUnit;
    }

    @Nullable
    public final String getTemperature() {
        return this.temperature;
    }

    @Nullable
    public final Integer getWeatherCode() {
        return this.weatherCode;
    }

    @Nullable
    public final String getWeatherCondition() {
        return this.weatherCondition;
    }

    @Nullable
    public final String getWeatherIcon() {
        return this.weatherIcon;
    }

    @Nullable
    public final String getWeekDay() {
        return this.weekDay;
    }

    @Nullable
    public final String getWindCondition() {
        return this.windCondition;
    }

    public final void setAirQuality(@Nullable String str) {
        this.airQuality = str;
    }

    public final void setDarkWeatherIcon(@Nullable String str) {
        this.darkWeatherIcon = str;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setHighTemperature(@Nullable String str) {
        this.highTemperature = str;
    }

    public final void setLowTemperature(@Nullable String str) {
        this.lowTemperature = str;
    }

    public final void setPm25(@Nullable String str) {
        this.pm25 = str;
    }

    public final void setPresentKey(@Nullable String str) {
        this.presentKey = str;
    }

    public final void setPresentValue(@Nullable String str) {
        this.presentValue = str;
    }

    public final void setPresentValueUnit(@Nullable String str) {
        this.presentValueUnit = str;
    }

    public final void setTemperature(@Nullable String str) {
        this.temperature = str;
    }

    public final void setWeatherCode(@Nullable Integer num) {
        this.weatherCode = num;
    }

    public final void setWeatherCondition(@Nullable String str) {
        this.weatherCondition = str;
    }

    public final void setWeatherIcon(@Nullable String str) {
        this.weatherIcon = str;
    }

    public final void setWeekDay(@Nullable String str) {
        this.weekDay = str;
    }

    public final void setWindCondition(@Nullable String str) {
        this.windCondition = str;
    }
}
