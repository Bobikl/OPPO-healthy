package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class DetailPageListParam extends PageBaseParam {

    @Tag(102)
    private long authorId;

    @Tag(101)
    private long masterId;

    @Tag(103)
    private int type;

    public long getAuthorId() {
        return this.authorId;
    }

    public long getMasterId() {
        return this.masterId;
    }

    public int getType() {
        return this.type;
    }

    public void setAuthorId(long j2) {
        this.authorId = j2;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    @Override // com.heytap.theme.watch.domain.dto.request.PageBaseParam
    public String toString() {
        return "DetailPageListParam{masterId=" + this.masterId + ", authorId=" + this.authorId + ", type=" + this.type + "} " + super.toString();
    }
}
