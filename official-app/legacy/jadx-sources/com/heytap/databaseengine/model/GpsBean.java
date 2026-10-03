package com.heytap.databaseengine.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class GpsBean {
    private double latitude;
    private double longitude;
    private int speed;
    private int state;
    private long timeStamp;

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getState() {
        return this.state;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setSpeed(int i) {
        this.speed = i;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }
}
