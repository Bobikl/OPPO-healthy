package com.heytap.theme.watch.domain.dto.request.order;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class CreateOrderParam implements Serializable {
    private static final long serialVersionUID = 1102749371499641525L;

    @Tag(1)
    private Long masterId;

    @Tag(2)
    private Long versionId;

    public Long getMasterId() {
        return this.masterId;
    }

    public Long getVersionId() {
        return this.versionId;
    }

    public void setMasterId(Long l2) {
        this.masterId = l2;
    }

    public void setVersionId(Long l2) {
        this.versionId = l2;
    }

    public String toString() {
        return "CreateOrderParam{masterId=" + this.masterId + ", versionId=" + this.versionId + '}';
    }
}
