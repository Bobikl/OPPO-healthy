package com.heytap.databaseengineservice.sync.syncdata.relax;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class CloudRelaxPOVO {
    private String clientDataId;
    private long dataCreatedTimestamp;
    private String deviceUniqueId;
    private int display;
    private String extension;
    private String heartRateDetail;
    private int maxHeartRate;
    private int minHeartRate;
    private long modifiedTimestamp;
    private Integer physicalMental;
    private Integer physicalMentalState;
    private int relaxStressTotalTime;
    private int relaxSubType;
    private int relaxType;
    private int stressValue;
    private int syncStatus;

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

    public String getExtension() {
        return this.extension;
    }

    public String getHeartRateDetail() {
        return this.heartRateDetail;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public Integer getPhysicalMental() {
        return this.physicalMental;
    }

    public Integer getPhysicalMentalState() {
        return this.physicalMentalState;
    }

    public int getRelaxStressTotalTime() {
        return this.relaxStressTotalTime;
    }

    public int getRelaxSubType() {
        return this.relaxSubType;
    }

    public int getRelaxType() {
        return this.relaxType;
    }

    public int getStressValue() {
        return this.stressValue;
    }

    public int getSyncStatus() {
        return this.syncStatus;
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

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setHeartRateDetail(String str) {
        this.heartRateDetail = str;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setPhysicalMental(Integer num) {
        this.physicalMental = num;
    }

    public void setPhysicalMentalState(Integer num) {
        this.physicalMentalState = num;
    }

    public void setRelaxStressTotalTime(int i) {
        this.relaxStressTotalTime = i;
    }

    public void setRelaxSubType(int i) {
        this.relaxSubType = i;
    }

    public void setRelaxType(int i) {
        this.relaxType = i;
    }

    public void setStressValue(int i) {
        this.stressValue = i;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }
}
