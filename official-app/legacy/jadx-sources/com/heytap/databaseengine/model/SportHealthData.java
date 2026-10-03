package com.heytap.databaseengine.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public abstract class SportHealthData {
    public String getDeviceUniqueId() {
        return "";
    }

    public long getEndTimestamp() {
        return 0L;
    }

    public String getSsoid() {
        return "";
    }

    public long getStartTimestamp() {
        return 0L;
    }

    public abstract String toString();
}
