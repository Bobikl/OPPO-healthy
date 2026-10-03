package com.heytap.log.dto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class TraceConfigDto implements Serializable {
    public static final int KIT_SRC = 1;
    public static final int OPUSH_SRC = 2;
    public static final int SDK_SRC = 0;
    private long beginTime;
    private String business;
    private String commons;
    private int console;
    private String encryClientId;
    private long endTime;
    private int exactMatchTracePkg;
    private int force;
    private String keyWords;
    private int level;
    private int maxLogSize;
    private String openid;
    private String phyid;
    private int queueSize;
    private int sample;
    private int timesPerDay;
    private long traceId;
    private String tracePkg;
    private int isUploaded = 0;
    private int src = 0;

    public long getBeginTime() {
        return this.beginTime;
    }

    public String getBusiness() {
        return this.business;
    }

    public String getCommons() {
        return this.commons;
    }

    public int getConsole() {
        return this.console;
    }

    public String getEncryClientId() {
        return this.encryClientId;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getExactMatchTracePkg() {
        return this.exactMatchTracePkg;
    }

    public int getForce() {
        return this.force;
    }

    public int getIsUploaded() {
        return this.isUploaded;
    }

    public String getKeyWords() {
        return this.keyWords;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMaxLogSize() {
        return this.maxLogSize;
    }

    public String getOpenid() {
        return this.openid;
    }

    public String getPhyid() {
        return this.phyid;
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getSample() {
        return this.sample;
    }

    public int getSrc() {
        return this.src;
    }

    public int getTimesPerDay() {
        return this.timesPerDay;
    }

    public long getTraceId() {
        return this.traceId;
    }

    public String getTracePkg() {
        return this.tracePkg;
    }

    public boolean isEffort() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis >= this.beginTime && jCurrentTimeMillis <= this.endTime;
    }

    public void setBeginTime(long j2) {
        this.beginTime = j2;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public void setCommons(String str) {
        this.commons = str;
    }

    public void setConsole(int i) {
        this.console = i;
    }

    public void setEncryClientId(String str) {
        this.encryClientId = str;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setExactMatchTracePkg(int i) {
        this.exactMatchTracePkg = i;
    }

    public void setForce(int i) {
        this.force = i;
    }

    public void setIsUploaded(int i) {
        this.isUploaded = i;
    }

    public void setKeyWords(String str) {
        this.keyWords = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setMaxLogSize(int i) {
        this.maxLogSize = i;
    }

    public void setOpenid(String str) {
        this.openid = str;
    }

    public void setPhyid(String str) {
        this.phyid = str;
    }

    public void setQueueSize(int i) {
        this.queueSize = i;
    }

    public void setSample(int i) {
        this.sample = i;
    }

    public void setSrc(int i) {
        this.src = i;
    }

    public void setTimesPerDay(int i) {
        this.timesPerDay = i;
    }

    public void setTraceId(long j2) {
        this.traceId = j2;
    }

    public void setTracePkg(String str) {
        this.tracePkg = str;
    }

    public String toString() {
        return "TraceConfigDto{business='" + this.business + "', traceId=" + this.traceId + ", encryClientId='" + this.encryClientId + "', force=" + this.force + ", tracePkg='" + this.tracePkg + "', beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", exactMatchTracePkg=" + this.exactMatchTracePkg + ", level=" + this.level + ", console=" + this.console + ", maxLogSize=" + this.maxLogSize + ", timesPerDay=" + this.timesPerDay + ", queueSize=" + this.queueSize + ", sample=" + this.sample + ", openid='" + this.openid + "', phyid='" + this.phyid + "', keyWords='" + this.keyWords + "', commons='" + this.commons + "', isUploaded=" + this.isUploaded + ", src=" + this.src + '}';
    }
}
