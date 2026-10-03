package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullHealthDataVersionParams {

    @SerializedName("modifiedTimestamp")
    private long modifiedTimestamp;

    public PullHealthDataVersionParams(long j2) {
        this.modifiedTimestamp = j2;
    }
}
