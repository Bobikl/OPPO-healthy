package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.amap.api.services.district.DistrictSearchQuery;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bK\u0010LR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR$\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR*\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010B¨\u0006O"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/Weather;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "country", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", DistrictSearchQuery.KEYWORDS_PROVINCE, "getProvince", "setProvince", DistrictSearchQuery.KEYWORDS_CITY, "getCity", "setCity", "weatherDesc", "getWeatherDesc", "setWeatherDesc", ConnectIdLogic.PARAM_TIMEZONE, "getTimeZone", "setTimeZone", "", "needLocationPrivacy", "Ljava/lang/Boolean;", "getNeedLocationPrivacy", "()Ljava/lang/Boolean;", "setNeedLocationPrivacy", "(Ljava/lang/Boolean;)V", "date", "getDate", "setDate", "dateDesc", "getDateDesc", "setDateDesc", "hour", "getHour", "setHour", "hourDesc", "getHourDesc", "setHourDesc", "weekDay", "getWeekDay", "setWeekDay", "datePeriod", "getDatePeriod", "setDatePeriod", "bgVideo", "getBgVideo", "setBgVideo", "bgSound", "getBgSound", "setBgSound", "", "bgSoundVolume", "Ljava/lang/Float;", "getBgSoundVolume", "()Ljava/lang/Float;", "setBgSoundVolume", "(Ljava/lang/Float;)V", "", "Lcom/heytap/speech/engine/protocol/directive/template/DailyForecast;", "dailyForecasts", "Ljava/util/List;", "getDailyForecasts", "()Ljava/util/List;", "setDailyForecasts", "(Ljava/util/List;)V", "Lcom/heytap/speech/engine/protocol/directive/template/HourlyForecast;", "hourlyForecasts", "getHourlyForecasts", "setHourlyForecasts", "Lcom/heytap/speech/engine/protocol/directive/template/Index;", "indexes", "getIndexes", "setIndexes", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Weather extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @JsonProperty("bgSound")
    @Nullable
    private String bgSound;

    @JsonProperty("bgSoundVolume")
    @Nullable
    private Float bgSoundVolume;

    @JsonProperty("bgVideo")
    @Nullable
    private String bgVideo;

    @JsonProperty(DistrictSearchQuery.KEYWORDS_CITY)
    @Nullable
    private String city;

    @JsonProperty("country")
    @Nullable
    private String country;

    @JsonProperty("dailyForecasts")
    @Nullable
    private List<DailyForecast> dailyForecasts;

    @JsonProperty("date")
    @Nullable
    private String date;

    @JsonProperty("dateDesc")
    @Nullable
    private String dateDesc;

    @JsonProperty("datePeriod")
    @Nullable
    private String datePeriod;

    @JsonProperty("hour")
    @Nullable
    private String hour;

    @JsonProperty("hourDesc")
    @Nullable
    private String hourDesc;

    @JsonProperty("hourlyForecasts")
    @Nullable
    private List<HourlyForecast> hourlyForecasts;

    @JsonProperty("indexes")
    @Nullable
    private List<Index> indexes;

    @JsonProperty("needLocationPrivacy")
    @Nullable
    private Boolean needLocationPrivacy;

    @JsonProperty(DistrictSearchQuery.KEYWORDS_PROVINCE)
    @Nullable
    private String province;

    @JsonProperty(ConnectIdLogic.PARAM_TIMEZONE)
    @Nullable
    private String timeZone;

    @JsonProperty("weatherDesc")
    @Nullable
    private String weatherDesc;

    @JsonProperty("weekDay")
    @Nullable
    private String weekDay;

    @Nullable
    public final String getBgSound() {
        return this.bgSound;
    }

    @Nullable
    public final Float getBgSoundVolume() {
        return this.bgSoundVolume;
    }

    @Nullable
    public final String getBgVideo() {
        return this.bgVideo;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final List<DailyForecast> getDailyForecasts() {
        return this.dailyForecasts;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getDateDesc() {
        return this.dateDesc;
    }

    @Nullable
    public final String getDatePeriod() {
        return this.datePeriod;
    }

    @Nullable
    public final String getHour() {
        return this.hour;
    }

    @Nullable
    public final String getHourDesc() {
        return this.hourDesc;
    }

    @Nullable
    public final List<HourlyForecast> getHourlyForecasts() {
        return this.hourlyForecasts;
    }

    @Nullable
    public final List<Index> getIndexes() {
        return this.indexes;
    }

    @Nullable
    public final Boolean getNeedLocationPrivacy() {
        return this.needLocationPrivacy;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    @Nullable
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    public final String getWeatherDesc() {
        return this.weatherDesc;
    }

    @Nullable
    public final String getWeekDay() {
        return this.weekDay;
    }

    public final void setBgSound(@Nullable String str) {
        this.bgSound = str;
    }

    public final void setBgSoundVolume(@Nullable Float f) {
        this.bgSoundVolume = f;
    }

    public final void setBgVideo(@Nullable String str) {
        this.bgVideo = str;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setDailyForecasts(@Nullable List<DailyForecast> list) {
        this.dailyForecasts = list;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setDateDesc(@Nullable String str) {
        this.dateDesc = str;
    }

    public final void setDatePeriod(@Nullable String str) {
        this.datePeriod = str;
    }

    public final void setHour(@Nullable String str) {
        this.hour = str;
    }

    public final void setHourDesc(@Nullable String str) {
        this.hourDesc = str;
    }

    public final void setHourlyForecasts(@Nullable List<HourlyForecast> list) {
        this.hourlyForecasts = list;
    }

    public final void setIndexes(@Nullable List<Index> list) {
        this.indexes = list;
    }

    public final void setNeedLocationPrivacy(@Nullable Boolean bool) {
        this.needLocationPrivacy = bool;
    }

    public final void setProvince(@Nullable String str) {
        this.province = str;
    }

    public final void setTimeZone(@Nullable String str) {
        this.timeZone = str;
    }

    public final void setWeatherDesc(@Nullable String str) {
        this.weatherDesc = str;
    }

    public final void setWeekDay(@Nullable String str) {
        this.weekDay = str;
    }
}
