package com.heytap.databaseengine.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class EcgDetail {
    private String aacData;
    private long aacStartTimestamp;
    private String appVersion;
    private int avgHeartrate;
    private String data;
    private int duration;
    private int ecgHeartRate;
    private String ecgId;
    private String ecgResultId;
    private String ecgResultName;
    private long ecgStartTimestamp;
    private int frequency;
    private int hand;
    private int id;
    private String listHeartrate;
    private String ppgData;
    private Integer source;
    private String symptoms;
    private int timeBegin;
    private int timeEnd;
    private String userId;
    private int version;

    public String getAacData() {
        return this.aacData;
    }

    public long getAacStartTimestamp() {
        return this.aacStartTimestamp;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public int getAvgHeartrate() {
        return this.avgHeartrate;
    }

    public String getData() {
        return this.data;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEcgHeartRate() {
        return this.ecgHeartRate;
    }

    public String getEcgId() {
        return this.ecgId;
    }

    public String getEcgResultId() {
        return this.ecgResultId;
    }

    public String getEcgResultName() {
        return this.ecgResultName;
    }

    public long getEcgStartTimestamp() {
        return this.ecgStartTimestamp;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public int getHand() {
        return this.hand;
    }

    public int getId() {
        return this.id;
    }

    public String getListHeartrate() {
        return this.listHeartrate;
    }

    public String getPpgData() {
        return this.ppgData;
    }

    public Integer getSource() {
        return this.source;
    }

    public String getSymptoms() {
        return this.symptoms;
    }

    public int getTimeBegin() {
        return this.timeBegin;
    }

    public int getTimeEnd() {
        return this.timeEnd;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAacData(String str) {
        this.aacData = str;
    }

    public void setAacStartTimestamp(long j2) {
        this.aacStartTimestamp = j2;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAvgHeartrate(int i) {
        this.avgHeartrate = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEcgHeartRate(int i) {
        this.ecgHeartRate = i;
    }

    public void setEcgId(String str) {
        this.ecgId = str;
    }

    public void setEcgResultId(String str) {
        this.ecgResultId = str;
    }

    public void setEcgResultName(String str) {
        this.ecgResultName = str;
    }

    public void setEcgStartTimestamp(long j2) {
        this.ecgStartTimestamp = j2;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public void setHand(int i) {
        this.hand = i;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setListHeartrate(String str) {
        this.listHeartrate = str;
    }

    public void setPpgData(String str) {
        this.ppgData = str;
    }

    public void setSource(Integer num) {
        this.source = num;
    }

    public void setSymptoms(String str) {
        this.symptoms = str;
    }

    public void setTimeBegin(int i) {
        this.timeBegin = i;
    }

    public void setTimeEnd(int i) {
        this.timeEnd = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return "EcgDetail{timeBegin=" + this.timeBegin + ", timeEnd=" + this.timeEnd + ", avgHeartrate=" + this.avgHeartrate + ", ecgStartTimestamp=" + this.ecgStartTimestamp + ", version=" + this.version + ", appVersion='" + this.appVersion + "', ecgResultId='" + this.ecgResultId + "', ecgResultName='" + this.ecgResultName + "', symptoms='" + this.symptoms + "', ecgHeartRate=" + this.ecgHeartRate + ", source=" + this.source + '}';
    }
}
