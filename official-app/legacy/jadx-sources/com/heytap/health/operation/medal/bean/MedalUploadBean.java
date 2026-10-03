package com.heytap.health.operation.medal.bean;

import androidx.annotation.Keep;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MedalUploadBean {
    private int ackStatus = 1;
    private int breakRecordTimes;
    private String clientDataId;
    private String code;
    private int flag;
    private int obtainStatus;
    private long obtainTime;
    private int recordDuration;
    private String remark;
    private String ssoid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.code, ((MedalUploadBean) obj).code);
    }

    public int getAckStatus() {
        return this.ackStatus;
    }

    public long getAcquisitionDate() {
        return this.obtainTime;
    }

    public int getBreakRecordTimes() {
        return this.breakRecordTimes;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getCode() {
        return this.code;
    }

    public int getGetResult() {
        return this.obtainStatus;
    }

    public int getMedalFlag() {
        return this.flag;
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

    public int hashCode() {
        return Objects.hash(this.code);
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

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setGetResult(int i) {
        this.obtainStatus = i;
    }

    public void setMedalFlag(int i) {
        this.flag = i;
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

    public String toString() {
        return "MedalUploadBean{code='" + this.code + "', obtainTime=" + this.obtainTime + ", remark='" + this.remark + "', recordDuration=" + this.recordDuration + ", clientDataId=" + this.clientDataId + '}';
    }
}
