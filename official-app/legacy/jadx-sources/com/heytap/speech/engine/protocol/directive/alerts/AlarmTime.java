package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "apm", "", "getApm", "()Ljava/lang/String;", "setApm", "(Ljava/lang/String;)V", "day", "getDay", "setDay", "extraHour", "getExtraHour", "setExtraHour", "hour", "getHour", "setHour", "minute", "getMinute", "setMinute", "month", "getMonth", "setMonth", "week", "getWeek", "setWeek", "year", "getYear", "setYear", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlarmTime extends DirectivePayload {

    @JsonProperty("apm")
    @Nullable
    private String apm;

    @JsonProperty("day")
    @Nullable
    private String day;

    @JsonProperty("extraHour")
    @Nullable
    private String extraHour;

    @JsonProperty("hour")
    @Nullable
    private String hour;

    @JsonProperty("minute")
    @Nullable
    private String minute;

    @JsonProperty("month")
    @Nullable
    private String month;

    @JsonProperty("week")
    @Nullable
    private String week;

    @JsonProperty("year")
    @Nullable
    private String year;

    @Nullable
    public final String getApm() {
        return this.apm;
    }

    @Nullable
    public final String getDay() {
        return this.day;
    }

    @Nullable
    public final String getExtraHour() {
        return this.extraHour;
    }

    @Nullable
    public final String getHour() {
        return this.hour;
    }

    @Nullable
    public final String getMinute() {
        return this.minute;
    }

    @Nullable
    public final String getMonth() {
        return this.month;
    }

    @Nullable
    public final String getWeek() {
        return this.week;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }

    public final void setApm(@Nullable String str) {
        this.apm = str;
    }

    public final void setDay(@Nullable String str) {
        this.day = str;
    }

    public final void setExtraHour(@Nullable String str) {
        this.extraHour = str;
    }

    public final void setHour(@Nullable String str) {
        this.hour = str;
    }

    public final void setMinute(@Nullable String str) {
        this.minute = str;
    }

    public final void setMonth(@Nullable String str) {
        this.month = str;
    }

    public final void setWeek(@Nullable String str) {
        this.week = str;
    }

    public final void setYear(@Nullable String str) {
        this.year = str;
    }
}
