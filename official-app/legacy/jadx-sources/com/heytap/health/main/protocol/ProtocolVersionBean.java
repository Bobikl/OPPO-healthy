package com.heytap.health.main.protocol;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ProtocolVersionBean {
    private int contentType;
    private int maxAppVersion;
    private int minAppVersion;
    private long version;

    public int getMaxAppVersion() {
        return this.maxAppVersion;
    }

    public int getMinAppVersion() {
        return this.minAppVersion;
    }

    public long getVersion() {
        return this.version;
    }

    public void setVersion(long j2) {
        this.version = j2;
    }
}
