package com.heytap.health.base.switchManager;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SwitchBean {
    private String config;
    private long endTimestamp;
    private int switchStatus;
    private long validTimestamp;

    public String getConfig() {
        return this.config;
    }

    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public int getSwitchStatus() {
        return this.switchStatus;
    }

    public long getValidTimestamp() {
        return this.validTimestamp;
    }

    public void setConfig(String str) {
        this.config = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    public void setValidTimestamp(long j2) {
        this.validTimestamp = j2;
    }

    @NonNull
    public String toString() {
        return "SwitchBean = { switchStatus=" + this.switchStatus + " config=" + this.config + " validTimestamp=" + this.validTimestamp + " endTimestamp=" + this.endTimestamp + "}";
    }
}
