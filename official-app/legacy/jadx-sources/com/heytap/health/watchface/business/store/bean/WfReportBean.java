package com.heytap.health.watchface.business.store.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WfReportBean {
    private long masterId;
    private long versionId;

    public long getMasterId() {
        return this.masterId;
    }

    public long getVersionId() {
        return this.versionId;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setVersionId(long j2) {
        this.versionId = j2;
    }
}
