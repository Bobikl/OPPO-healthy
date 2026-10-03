package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullSportDataVersionParams {

    @SerializedName("modifiedTime")
    private long modifiedTime;

    public PullSportDataVersionParams(long j2) {
        this.modifiedTime = j2;
    }
}
