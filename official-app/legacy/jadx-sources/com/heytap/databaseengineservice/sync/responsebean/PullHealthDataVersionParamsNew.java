package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullHealthDataVersionParamsNew {

    @SerializedName("modifiedTimestamp")
    private long modifiedTimestamp;

    @SerializedName("queryFlag")
    private int queryFlag;

    public PullHealthDataVersionParamsNew(long j2, int i) {
        this.modifiedTimestamp = j2;
        this.queryFlag = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setQueryFlag(int i) {
        this.queryFlag = i;
    }

    public String toString() {
        return "PullHealthDataVersionParamsNew{modifiedTimestamp=" + this.modifiedTimestamp + ", queryFlag=" + this.queryFlag + '}';
    }
}
