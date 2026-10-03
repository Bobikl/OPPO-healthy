package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullTumbleRecordReq {

    @SerializedName("timestamp")
    private long timestamp;

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }
}
