package com.heytap.health.base.calendar;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class CalendarBean implements Serializable {
    private String accountType;
    private String calendAccountName;
    private String calendarDisplayName;
    private int calendarId;
    private String deleteFlag;
    private String eventDescription;
    private String eventDtEnd;
    private String eventDtStart;
    private String eventLocation;
    private String eventTitle;
    private String id;

    public String getAccountType() {
        return this.accountType;
    }

    public String getCalendAccountName() {
        return this.calendAccountName;
    }

    public String getCalendarDisplayName() {
        return this.calendarDisplayName;
    }

    public int getCalendarId() {
        return this.calendarId;
    }

    public String getDeleteFlag() {
        return this.deleteFlag;
    }

    public String getEventDescription() {
        return this.eventDescription;
    }

    public String getEventDtEnd() {
        return this.eventDtEnd;
    }

    public String getEventDtStart() {
        return this.eventDtStart;
    }

    public String getEventLocation() {
        return this.eventLocation;
    }

    public String getEventTitle() {
        return this.eventTitle;
    }

    public String getId() {
        return this.id;
    }

    public void setAccountType(String str) {
        this.accountType = str;
    }

    public void setCalendAccountName(String str) {
        this.calendAccountName = str;
    }

    public void setCalendarDisplayName(String str) {
        this.calendarDisplayName = str;
    }

    public void setCalendarId(int i) {
        this.calendarId = i;
    }

    public void setDeleteFlag(String str) {
        this.deleteFlag = str;
    }

    public void setEventDescription(String str) {
        this.eventDescription = str;
    }

    public void setEventDtEnd(String str) {
        this.eventDtEnd = str;
    }

    public void setEventDtStart(String str) {
        this.eventDtStart = str;
    }

    public void setEventLocation(String str) {
        this.eventLocation = str;
    }

    public void setEventTitle(String str) {
        this.eventTitle = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String toString() {
        return "CalendarBean{calendarId=" + this.calendarId + ", calendAccountName='" + this.calendAccountName + "', calendarDisplayName='" + this.calendarDisplayName + "', accountType='" + this.accountType + "', id='" + this.id + "', eventTitle='" + this.eventTitle + "', eventDescription='" + this.eventDescription + "', eventLocation='" + this.eventLocation + "', eventDtStart='" + this.eventDtStart + "', eventDtEnd='" + this.eventDtEnd + "', deleteFlag='" + this.deleteFlag + "'}";
    }
}
