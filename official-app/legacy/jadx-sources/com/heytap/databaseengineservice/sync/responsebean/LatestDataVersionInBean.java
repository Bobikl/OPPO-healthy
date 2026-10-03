package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class LatestDataVersionInBean {
    private int dataType;
    private long modifyTimeStamp;

    public LatestDataVersionInBean(int i, long j2) {
        this.dataType = i;
        this.modifyTimeStamp = j2;
    }

    public int getDataType() {
        return this.dataType;
    }

    public long getModifyTimeStamp() {
        return this.modifyTimeStamp;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setModifyTimeStamp(long j2) {
        this.modifyTimeStamp = j2;
    }

    @NonNull
    public String toString() {
        return "LatestDataVersionInBean{dataType=" + this.dataType + ", modifyTimeStamp=" + this.modifyTimeStamp + '}';
    }
}
