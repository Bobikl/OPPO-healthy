package com.heytap.theme.watch.domain.dto.request.downLoad;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class DownloadReportParam implements Serializable {
    private static final long serialVersionUID = -9078489340718545157L;

    @Tag(1)
    private Long masterId;

    @Tag(2)
    private String pkgNameMd5;

    @Tag(3)
    private Long versionId;

    public Long getMasterId() {
        return this.masterId;
    }

    public String getPkgNameMd5() {
        return this.pkgNameMd5;
    }

    public Long getVersionId() {
        return this.versionId;
    }

    public void setMasterId(Long l2) {
        this.masterId = l2;
    }

    public void setPkgNameMd5(String str) {
        this.pkgNameMd5 = str;
    }

    public void setVersionId(Long l2) {
        this.versionId = l2;
    }

    public String toString() {
        return "DownloadReportParam{masterId=" + this.masterId + ", pkgNameMd5='" + this.pkgNameMd5 + "', versionId=" + this.versionId + '}';
    }
}
