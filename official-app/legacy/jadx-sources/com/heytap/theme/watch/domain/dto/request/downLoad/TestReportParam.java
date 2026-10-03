package com.heytap.theme.watch.domain.dto.request.downLoad;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class TestReportParam implements Serializable {
    private static final long serialVersionUID = -9078489340718545157L;

    @Tag(1)
    private Long masterId;

    public Long getMasterId() {
        return this.masterId;
    }

    public void setMasterId(Long l2) {
        this.masterId = l2;
    }

    public String toString() {
        return "TestReportParam{masterId=" + this.masterId + '}';
    }
}
