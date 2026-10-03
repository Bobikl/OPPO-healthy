package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class DownloadParam {

    @Tag(4)
    private boolean isTrail;

    @Tag(5)
    private boolean isUpdate;

    @Tag(6)
    private String key;

    @Tag(3)
    private String token;

    @Tag(1)
    private int type;

    @Tag(2)
    private long versionId;

    public boolean getIsTrail() {
        return this.isTrail;
    }

    public boolean getIsUpdate() {
        return this.isUpdate;
    }

    public String getKey() {
        return this.key;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public long getVersionId() {
        return this.versionId;
    }

    public void setIsTrail(boolean z) {
        this.isTrail = z;
    }

    public void setIsUpdate(boolean z) {
        this.isUpdate = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVersionId(long j2) {
        this.versionId = j2;
    }

    public String toString() {
        return "DownloadParam{type=" + this.type + ", versionId=" + this.versionId + ", token='" + this.token + "', isTrail=" + this.isTrail + ", isUpdate=" + this.isUpdate + ", key='" + this.key + "'}";
    }
}
