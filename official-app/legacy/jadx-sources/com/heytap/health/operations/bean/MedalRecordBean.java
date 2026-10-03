package com.heytap.health.operations.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MedalRecordBean {
    private int ackStatus;
    private int breakRecordTimes;
    private String code;
    private int flag;
    private int logicStatus;
    private int obtainStatus;
    private long obtainTime;
    private int recordDuration;
    private String remark;
    private String ssoid;
    private String target;
    private String typeCode;

    public int getAckStatus() {
        return this.ackStatus;
    }

    public long getAcquisitionDate() {
        return this.obtainTime;
    }

    public int getBreakRecordTimes() {
        return this.breakRecordTimes;
    }

    public String getCode() {
        return this.code;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getGetResult() {
        return this.obtainStatus;
    }

    public int getLogicStatus() {
        return this.logicStatus;
    }

    public int getObtainStatus() {
        return this.obtainStatus;
    }

    public long getObtainTime() {
        return this.obtainTime;
    }

    public int getRecordDuration() {
        return this.recordDuration;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getTarget() {
        return this.target;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public void setAckStatus(int i) {
        this.ackStatus = i;
    }

    public void setAcquisitionDate(long j2) {
        this.obtainTime = j2;
    }

    public void setBreakRecordTimes(int i) {
        this.breakRecordTimes = i;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setGetResult(int i) {
        this.obtainStatus = i;
    }

    public void setLogicStatus(int i) {
        this.logicStatus = i;
    }

    public void setObtainStatus(int i) {
        this.obtainStatus = i;
    }

    public void setObtainTime(long j2) {
        this.obtainTime = j2;
    }

    public void setRecordDuration(int i) {
        this.recordDuration = i;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public void setTypeCode(String str) {
        this.typeCode = str;
    }

    public String toString() {
        return "MedalRecordBean{code='" + this.code + "', recordDuration='" + this.recordDuration + "', target='" + this.target + "', obtainStatus=" + this.obtainStatus + ", flag=" + this.flag + ", remark='" + this.remark + "', obtainTime=" + this.obtainTime + ", logicStatus=" + this.logicStatus + '}';
    }
}
