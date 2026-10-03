package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.f04;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u0016R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010\u0016R\u001c\u0010B\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0014\"\u0004\bD\u0010\u0016R\u001c\u0010E\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0014\"\u0004\bG\u0010\u0016R\u001e\u0010H\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010N\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0014\"\u0004\bP\u0010\u0016R\u001c\u0010Q\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0014\"\u0004\bS\u0010\u0016R\u001c\u0010T\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0014\"\u0004\bV\u0010\u0016R\u001c\u0010W\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0014\"\u0004\bY\u0010\u0016¨\u0006Z"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Schedule;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", HrvHistoryActivity.ALL_DAY, "", "getAllDay", "()Ljava/lang/Boolean;", "setAllDay", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "calendarId", "", "getCalendarId", "()Ljava/lang/Long;", "setCalendarId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "endDate", "", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "endTime", "getEndTime", "setEndTime", "eventTimezone", "getEventTimezone", "setEventTimezone", "forceReminder", "getForceReminder", "setForceReminder", "lunarCalendar", "getLunarCalendar", "setLunarCalendar", "lunarDate", "getLunarDate", "setLunarDate", "minutesAgoReminder", "Ljava/util/ArrayList;", "", "getMinutesAgoReminder", "()Ljava/util/ArrayList;", "setMinutesAgoReminder", "(Ljava/util/ArrayList;)V", "remindRoles", "getRemindRoles", "setRemindRoles", "repeatRule", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;", "getRepeatRule", "()Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;", "setRepeatRule", "(Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;)V", "scheduleId", "getScheduleId", "setScheduleId", "scheduleLocation", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleLocation;", "getScheduleLocation", "()Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleLocation;", "setScheduleLocation", "(Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleLocation;)V", "scheduleSource", "getScheduleSource", "setScheduleSource", "scheduledSubject", "getScheduledSubject", "setScheduledSubject", "scheduledTime", "getScheduledTime", "setScheduledTime", "scheduledType", "getScheduledType", "()Ljava/lang/Integer;", "setScheduledType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "getStartDate", "setStartDate", "startTime", "getStartTime", "setStartTime", "syncId", "getSyncId", "setSyncId", "weekDate", "getWeekDate", "setWeekDate", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Schedule extends DirectivePayload {

    @Nullable
    private Boolean allDay;

    @Nullable
    private Long calendarId;

    @Nullable
    private String endDate;

    @Nullable
    private String endTime;

    @Nullable
    private String eventTimezone;

    @Nullable
    private Boolean forceReminder;

    @Nullable
    private Boolean lunarCalendar;

    @Nullable
    private String lunarDate;

    @Nullable
    private ArrayList<Integer> minutesAgoReminder;

    @Nullable
    private ArrayList<String> remindRoles;

    @Nullable
    private ScheduleRepeatRule repeatRule;

    @Nullable
    private String scheduleId;

    @Nullable
    private ScheduleLocation scheduleLocation;

    @Nullable
    private String scheduleSource;

    @Nullable
    private String scheduledSubject;

    @Nullable
    private String scheduledTime;

    @Nullable
    private Integer scheduledType;

    @Nullable
    private String startDate;

    @Nullable
    private String startTime;

    @Nullable
    private String syncId;

    @Nullable
    private String weekDate;

    @Nullable
    public final Boolean getAllDay() {
        return this.allDay;
    }

    @Nullable
    public final Long getCalendarId() {
        return this.calendarId;
    }

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getEventTimezone() {
        return this.eventTimezone;
    }

    @Nullable
    public final Boolean getForceReminder() {
        return this.forceReminder;
    }

    @Nullable
    public final Boolean getLunarCalendar() {
        return this.lunarCalendar;
    }

    @Nullable
    public final String getLunarDate() {
        return this.lunarDate;
    }

    @Nullable
    public final ArrayList<Integer> getMinutesAgoReminder() {
        return this.minutesAgoReminder;
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
    public final String getScheduleId() {
        return this.scheduleId;
    }

    @Nullable
    public final ScheduleLocation getScheduleLocation() {
        return this.scheduleLocation;
    }

    @Nullable
    public final String getScheduleSource() {
        return this.scheduleSource;
    }

    @Nullable
    public final String getScheduledSubject() {
        return this.scheduledSubject;
    }

    @Nullable
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    @Nullable
    public final Integer getScheduledType() {
        return this.scheduledType;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getSyncId() {
        return this.syncId;
    }

    @Nullable
    public final String getWeekDate() {
        return this.weekDate;
    }

    public final void setAllDay(@Nullable Boolean bool) {
        this.allDay = bool;
    }

    public final void setCalendarId(@Nullable Long l2) {
        this.calendarId = l2;
    }

    public final void setEndDate(@Nullable String str) {
        this.endDate = str;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setEventTimezone(@Nullable String str) {
        this.eventTimezone = str;
    }

    public final void setForceReminder(@Nullable Boolean bool) {
        this.forceReminder = bool;
    }

    public final void setLunarCalendar(@Nullable Boolean bool) {
        this.lunarCalendar = bool;
    }

    public final void setLunarDate(@Nullable String str) {
        this.lunarDate = str;
    }

    public final void setMinutesAgoReminder(@Nullable ArrayList<Integer> arrayList) {
        this.minutesAgoReminder = arrayList;
    }

    public final void setRemindRoles(@Nullable ArrayList<String> arrayList) {
        this.remindRoles = arrayList;
    }

    public final void setRepeatRule(@Nullable ScheduleRepeatRule scheduleRepeatRule) {
        this.repeatRule = scheduleRepeatRule;
    }

    public final void setScheduleId(@Nullable String str) {
        this.scheduleId = str;
    }

    public final void setScheduleLocation(@Nullable ScheduleLocation scheduleLocation) {
        this.scheduleLocation = scheduleLocation;
    }

    public final void setScheduleSource(@Nullable String str) {
        this.scheduleSource = str;
    }

    public final void setScheduledSubject(@Nullable String str) {
        this.scheduledSubject = str;
    }

    public final void setScheduledTime(@Nullable String str) {
        this.scheduledTime = str;
    }

    public final void setScheduledType(@Nullable Integer num) {
        this.scheduledType = num;
    }

    public final void setStartDate(@Nullable String str) {
        this.startDate = str;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setSyncId(@Nullable String str) {
        this.syncId = str;
    }

    public final void setWeekDate(@Nullable String str) {
        this.weekDate = str;
    }
}
