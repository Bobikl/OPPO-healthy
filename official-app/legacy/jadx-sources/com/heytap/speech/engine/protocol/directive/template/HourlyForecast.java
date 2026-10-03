package com.heytap.speech.engine.protocol.directive.template;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010 \u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/HourlyForecast;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "hour", "Ljava/lang/Integer;", "getHour", "()Ljava/lang/Integer;", "setHour", "(Ljava/lang/Integer;)V", "", "timestamp", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "weatherCode", "getWeatherCode", "setWeatherCode", "", "weatherIcon", "Ljava/lang/String;", "getWeatherIcon", "()Ljava/lang/String;", "setWeatherIcon", "(Ljava/lang/String;)V", "darkWeatherIcon", "getDarkWeatherIcon", "setDarkWeatherIcon", "weatherDesc", "getWeatherDesc", "setWeatherDesc", "temperature", "getTemperature", "setTemperature", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class HourlyForecast extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("darkWeatherIcon")
    @Nullable
    private String darkWeatherIcon;

    @JsonProperty("hour")
    @Nullable
    private Integer hour;

    @JsonProperty("temperature")
    @Nullable
    private String temperature;

    @JsonProperty("timestamp")
    @Nullable
    private Long timestamp;

    @JsonProperty("weatherCode")
    @Nullable
    private Integer weatherCode;

    @JsonProperty("weatherDesc")
    @Nullable
    private String weatherDesc;

    @JsonProperty("weatherIcon")
    @Nullable
    private String weatherIcon;

    @Nullable
    public final String getDarkWeatherIcon() {
        return this.darkWeatherIcon;
    }

    @Nullable
    public final Integer getHour() {
        return this.hour;
    }

    @Nullable
    public final String getTemperature() {
        return this.temperature;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Integer getWeatherCode() {
        return this.weatherCode;
    }

    @Nullable
    public final String getWeatherDesc() {
        return this.weatherDesc;
    }

    @Nullable
    public final String getWeatherIcon() {
        return this.weatherIcon;
    }

    public final void setDarkWeatherIcon(@Nullable String str) {
        this.darkWeatherIcon = str;
    }

    public final void setHour(@Nullable Integer num) {
        this.hour = num;
    }

    public final void setTemperature(@Nullable String str) {
        this.temperature = str;
    }

    public final void setTimestamp(@Nullable Long l2) {
        this.timestamp = l2;
    }

    public final void setWeatherCode(@Nullable Integer num) {
        this.weatherCode = num;
    }

    public final void setWeatherDesc(@Nullable String str) {
        this.weatherDesc = str;
    }

    public final void setWeatherIcon(@Nullable String str) {
        this.weatherIcon = str;
    }
}
