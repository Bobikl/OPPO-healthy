package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullSportHealthDataTimeParams {

    @SerializedName("endTimestamp")
    private long endTimestamp;

    @SerializedName("startTimestamp")
    private long startTimestamp;

    public PullSportHealthDataTimeParams(long j2, long j3) {
        this.startTimestamp = j2;
        this.endTimestamp = j3;
    }
}
