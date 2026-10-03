package com.lifesense.device.scale.device.dto.device;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class ActiveDeviceInfo {
    public String deviceId;
    public int id;
    public int isActive;
    public Date lastDataTime;
    public int userId;

    public String getDeviceId() {
        return this.deviceId;
    }

    public int getId() {
        return this.id;
    }

    public int getIsActive() {
        return this.isActive;
    }

    public Date getLastDataTime() {
        return this.lastDataTime;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setIsActive(int i) {
        this.isActive = i;
    }

    public void setLastDataTime(Date date) {
        this.lastDataTime = date;
    }

    public void setUserId(int i) {
        this.userId = i;
    }
}
