package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UsageAppDetail {

    @SerializedName("startTime")
    long startTimestamp;

    @SerializedName("useTime")
    int useTime;

    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getUseTime() {
        return this.useTime;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setUseTime(int i) {
        this.useTime = i;
    }
}
