package com.heytap.health.home.todocard.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class TodoData {
    private String cardCode;
    private String eventIcon;
    private String eventId;
    private String eventLink;
    private Integer eventSubType;
    private String eventTitle;
    private Integer eventType;
    private String pageCode;
    private int showRedPoint;

    public String getCardCode() {
        return this.cardCode;
    }

    public String getEventIcon() {
        return this.eventIcon;
    }

    public String getEventId() {
        return this.eventId;
    }

    public String getEventLink() {
        return this.eventLink;
    }

    public Integer getEventSubType() {
        return this.eventSubType;
    }

    public String getEventTitle() {
        return this.eventTitle;
    }

    public Integer getEventType() {
        return this.eventType;
    }

    public String getPageCode() {
        return this.pageCode;
    }

    public int getShowRedPoint() {
        return this.showRedPoint;
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setEventIcon(String str) {
        this.eventIcon = str;
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public void setEventLink(String str) {
        this.eventLink = str;
    }

    public void setEventSubType(Integer num) {
        this.eventSubType = num;
    }

    public void setEventTitle(String str) {
        this.eventTitle = str;
    }

    public void setEventType(Integer num) {
        this.eventType = num;
    }

    public void setPageCode(String str) {
        this.pageCode = str;
    }

    public void setShowRedPoint(int i) {
        this.showRedPoint = i;
    }

    public String toString() {
        return "TodoData{eventType=" + this.eventType + ", eventSubType=" + this.eventSubType + ", eventTitle='" + this.eventTitle + "', eventId='" + this.eventId + "', eventLink='" + this.eventLink + "', eventIcon='" + this.eventIcon + "', pageCode='" + this.pageCode + "', cardCode='" + this.cardCode + "', showRedPoint=" + this.showRedPoint + '}';
    }
}
