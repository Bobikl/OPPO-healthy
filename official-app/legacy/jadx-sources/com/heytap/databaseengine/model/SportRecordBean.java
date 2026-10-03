package com.heytap.databaseengine.model;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportRecordBean {
    private int achievePercent;
    private int avgFrequency;
    private int avgHeartRate;
    private int avgSpeed;
    private List<DetailBean> detailData;
    private long endTime;
    private String extra;
    private List<GpsBean> gpsData;
    private int maxSpeed;
    private String sportId;
    private int sportType;
    private long startTime;
    private String timeZone;
    private int totalCalories;
    private int totalDistance;
    private int totalHeight;
    private int totalSteps;
    private int totalTime;

    public int getAchievePercent() {
        return this.achievePercent;
    }

    public int getAvgFrequency() {
        return this.avgFrequency;
    }

    public int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public int getAvgSpeed() {
        return this.avgSpeed;
    }

    public List<DetailBean> getDetailData() {
        return this.detailData;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<GpsBean> getGpsData() {
        return this.gpsData;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getSportId() {
        return this.sportId;
    }

    public int getSportType() {
        return this.sportType;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public int getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalDistance() {
        return this.totalDistance;
    }

    public int getTotalHeight() {
        return this.totalHeight;
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    public int getTotalTime() {
        return this.totalTime;
    }

    public void setAchievePercent(int i) {
        this.achievePercent = i;
    }

    public void setAvgFrequency(int i) {
        this.avgFrequency = i;
    }

    public void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public void setAvgSpeed(int i) {
        this.avgSpeed = i;
    }

    public void setDetailData(List<DetailBean> list) {
        this.detailData = list;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setGpsData(List<GpsBean> list) {
        this.gpsData = list;
    }

    public void setMaxSpeed(int i) {
        this.maxSpeed = i;
    }

    public void setSportId(String str) {
        this.sportId = str;
    }

    public void setSportType(int i) {
        this.sportType = i;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setTimeZone(String str) {
        this.timeZone = str;
    }

    public void setTotalCalories(int i) {
        this.totalCalories = i;
    }

    public void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public void setTotalHeight(int i) {
        this.totalHeight = i;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public void setTotalTime(int i) {
        this.totalTime = i;
    }
}
