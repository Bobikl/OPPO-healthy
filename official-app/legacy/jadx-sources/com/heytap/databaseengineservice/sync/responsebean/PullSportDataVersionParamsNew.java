package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullSportDataVersionParamsNew {

    @SerializedName("modifiedTime")
    private long modifiedTime;

    @SerializedName("queryFlag")
    private int queryFlag;

    public PullSportDataVersionParamsNew(long j2, int i) {
        this.modifiedTime = j2;
        this.queryFlag = i;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public String toString() {
        return "PullHealthDataVersionParamsNew{modifiedTime=" + this.modifiedTime + ", queryFlag=" + this.queryFlag + '}';
    }
}
