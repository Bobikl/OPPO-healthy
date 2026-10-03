package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PushSportHealthDataRspBody {
    private long modifiedTime;

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public String toString() {
        return "PushSportHealthDataRspBody{modifiedTime=" + this.modifiedTime + '}';
    }
}
