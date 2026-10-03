package com.heytap.msp.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class GlobalConfig implements Serializable {
    long expireIn;
    int fixedMspVersionCode = 0;
    String keyPathCost = "";
    String netCost = "";
    private Set<String> jump3rdAppStore = new HashSet();
    long startBizFrequency = 1;
    long performanceFrequency = 1;
    long accountFrequency = 1;
    boolean compatibleAuthEnabled = false;

    public GlobalConfig() {
        this.expireIn = 0L;
        this.expireIn = 0L;
    }

    public long getAccountFrequency() {
        return this.accountFrequency;
    }

    public long getExpireIn() {
        return this.expireIn;
    }

    public int getFixedMspVersionCode() {
        return this.fixedMspVersionCode;
    }

    public Set<String> getJump3rdAppStore() {
        return this.jump3rdAppStore == null ? new HashSet() : new HashSet(this.jump3rdAppStore);
    }

    public String getKeyPathCost() {
        return this.keyPathCost;
    }

    public String getNetCost() {
        return this.netCost;
    }

    public long getPerformanceFrequency() {
        return this.performanceFrequency;
    }

    public long getStartBizFrequency() {
        return this.startBizFrequency;
    }

    public boolean isCompatibleAuthEnabled() {
        return this.compatibleAuthEnabled;
    }

    public void setAccountFrequency(long j2) {
        this.accountFrequency = j2;
    }

    public void setCompatibleAuthEnabled(boolean z) {
        this.compatibleAuthEnabled = z;
    }

    public void setExpireIn(long j2) {
        this.expireIn = j2;
    }

    public void setFixedMspVersionCode(int i) {
        this.fixedMspVersionCode = i;
    }

    public void setJump3rdAppStore(Set<String> set) {
        this.jump3rdAppStore = new HashSet(set);
    }

    public void setKeyPathCost(String str) {
        this.keyPathCost = str;
    }

    public void setNetCost(String str) {
        this.netCost = str;
    }

    public void setPerformanceFrequency(long j2) {
        this.performanceFrequency = j2;
    }

    public void setStartBizFrequency(long j2) {
        this.startBizFrequency = j2;
    }

    public String toString() {
        return "GlobalConfig{expireIn='" + this.expireIn + "', compatibleAuthEnabled='" + this.compatibleAuthEnabled + "', fixedMspVersionCode=" + this.fixedMspVersionCode + ", startBizFrequency=" + this.startBizFrequency + ", accountFrequency=" + this.accountFrequency + ", performanceFrequency=" + this.performanceFrequency + ", NetCost=" + this.netCost + ", keyPathCost=" + this.keyPathCost + ", jump3rdAppStore=" + this.jump3rdAppStore + '}';
    }
}
