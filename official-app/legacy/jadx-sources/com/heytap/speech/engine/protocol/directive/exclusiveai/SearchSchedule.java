package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bB\u0010CR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR$\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR$\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR$\u0010)\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR$\u0010,\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR$\u0010/\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010\u000fR$\u00102\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u000fR*\u00106\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b=\u0010\r\"\u0004\b>\u0010\u000fR$\u0010?\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u000b\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010\u000f¨\u0006F"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/SearchSchedule;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;)V", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;", "repeatRule", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;", "getRepeatRule", "()Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;", "setRepeatRule", "(Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;)V", "week", "getWeek", "setWeek", "year", "getYear", "setYear", "month", "getMonth", "setMonth", "day", "getDay", "setDay", "hour", "getHour", "setHour", "minute", "getMinute", "setMinute", "apm", "getApm", "setApm", "startTime", "getStartTime", "setStartTime", "endTime", "getEndTime", "setEndTime", "scheduledSubject", "getScheduledSubject", "setScheduledSubject", "Ljava/util/ArrayList;", "remindRoles", "Ljava/util/ArrayList;", "getRemindRoles", "()Ljava/util/ArrayList;", "setRemindRoles", "(Ljava/util/ArrayList;)V", "reply", "getReply", "setReply", "fallbackReply", "getFallbackReply", "setFallbackReply", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SearchSchedule extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String apm;

    @Nullable
    private String day;

    @Nullable
    private String endTime;

    @Nullable
    private String fallbackReply;

    @Nullable
    private Header header;

    @Nullable
    private String hour;

    @Nullable
    private String minute;

    @Nullable
    private String month;

    @Nullable
    private ArrayList<String> remindRoles;

    @Nullable
    private ScheduleRepeatRule repeatRule;

    @Nullable
    private String reply;

    @Nullable
    private String scheduledSubject;

    @Nullable
    private String startTime;

    @Nullable
    private String type;

    @Nullable
    private String week;

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
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getFallbackReply() {
        return this.fallbackReply;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
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
    public final ArrayList<String> getRemindRoles() {
        return this.remindRoles;
    }

    @Nullable
    public final ScheduleRepeatRule getRepeatRule() {
        return this.repeatRule;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getScheduledSubject() {
        return this.scheduledSubject;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getType() {
        return this.type;
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

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setFallbackReply(@Nullable String str) {
        this.fallbackReply = str;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
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

    public final void setRemindRoles(@Nullable ArrayList<String> arrayList) {
        this.remindRoles = arrayList;
    }

    public final void setRepeatRule(@Nullable ScheduleRepeatRule scheduleRepeatRule) {
        this.repeatRule = scheduleRepeatRule;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setScheduledSubject(@Nullable String str) {
        this.scheduledSubject = str;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setWeek(@Nullable String str) {
        this.week = str;
    }

    public final void setYear(@Nullable String str) {
        this.year = str;
    }
}
