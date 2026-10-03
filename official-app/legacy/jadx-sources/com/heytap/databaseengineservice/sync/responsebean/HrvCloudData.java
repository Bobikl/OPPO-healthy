package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HrvCloudData {
    private String clientDataId;
    private long dataCreatedTimestamp;
    private String deviceUniqueId;
    private int display;
    private long endTimestamp;
    private int heartRateVarValue;
    private String metadata;
    private long modifiedTimestamp;
    private long startTimestamp;
    private int updated;

    public String getClientDataId() {
        return this.clientDataId;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public int getHeartRateVarValue() {
        return this.heartRateVarValue;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setHeartRateVarValue(int i) {
        this.heartRateVarValue = i;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }
}
