package com.heytap.store.base.core.util.calendar.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarBean implements Serializable {
    private String account_type;
    private String allDay;
    private String calendar_id;
    private String canOrganizerRespond;
    private String description;
    private String duration;
    private String endTime;
    private String eventTimezone;
    private String hasAlarm;
    private String id;
    private String lastDate;
    private String method;
    private String mutators;
    private String rrule;
    private String startTime;
    private String timeZone;
    private String title;

    public String getAccount_type() {
        return this.account_type;
    }

    public String getAllDay() {
        return this.allDay;
    }

    public String getCalendar_id() {
        return this.calendar_id;
    }

    public String getCanOrganizerRespond() {
        return this.canOrganizerRespond;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getEventTimezone() {
        return this.eventTimezone;
    }

    public String getHasAlarm() {
        return this.hasAlarm;
    }

    public String getId() {
        return this.id;
    }

    public String getLastDate() {
        return this.lastDate;
    }

    public String getMethod() {
        return this.method;
    }

    public String getMutators() {
        return this.mutators;
    }

    public String getRrule() {
        return this.rrule;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAccount_type(String str) {
        this.account_type = str;
    }

    public void setAllDay(String str) {
        this.allDay = str;
    }

    public void setCalendar_id(String str) {
        this.calendar_id = str;
    }

    public void setCanOrganizerRespond(String str) {
        this.canOrganizerRespond = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setEventTimezone(String str) {
        this.eventTimezone = str;
    }

    public void setHasAlarm(String str) {
        this.hasAlarm = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLastDate(String str) {
        this.lastDate = str;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setMutators(String str) {
        this.mutators = str;
    }

    public void setRrule(String str) {
        this.rrule = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setTimeZone(String str) {
        this.timeZone = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "CalendarBean{rrule='" + this.rrule + "', canOrganizerRespond='" + this.canOrganizerRespond + "', lastDate='" + this.lastDate + "', calendar_id='" + this.calendar_id + "', account_type='" + this.account_type + "', id='" + this.id + "', hasAlarm='" + this.hasAlarm + "', allDay='" + this.allDay + "', eventTimezone='" + this.eventTimezone + "', description='" + this.description + "', title='" + this.title + "', duration='" + this.duration + "', mutators='" + this.mutators + "', method='" + this.method + "', timeZone='" + this.timeZone + "', startTime='" + this.startTime + "', endTime='" + this.endTime + "'}";
    }
}
