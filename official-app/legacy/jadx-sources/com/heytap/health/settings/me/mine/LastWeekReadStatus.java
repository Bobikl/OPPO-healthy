package com.heytap.health.settings.me.mine;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class LastWeekReadStatus {
    private String endTime;
    private String startTime;
    private int status;
    private String weekCode;

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public int getStatus() {
        return this.status;
    }

    public String getWeekCode() {
        return this.weekCode;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setWeekCode(String str) {
        this.weekCode = str;
    }

    public String toString() {
        return "LastWeekReadStatus{startTime='" + this.startTime + "', endTime='" + this.endTime + "', weekCode='" + this.weekCode + "', status=" + this.status + '}';
    }
}
