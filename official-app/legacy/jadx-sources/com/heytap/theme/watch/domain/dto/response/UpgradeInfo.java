package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class UpgradeInfo {

    @Tag(9)
    private long fileSize;

    @Tag(1)
    private boolean isNew;

    @Tag(3)
    private long masterId;

    @Tag(6)
    private String pkgName;

    @Tag(7)
    private String pkgNameMd5;

    @Tag(2)
    private int status;

    @Tag(8)
    private String updateDesc;

    @Tag(4)
    private int versionCode;

    @Tag(5)
    private long versionId;

    public long getFileSize() {
        return this.fileSize;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public long getMasterId() {
        return this.masterId;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getPkgNameMd5() {
        return this.pkgNameMd5;
    }

    public int getStatus() {
        return this.status;
    }

    public String getUpdateDesc() {
        return this.updateDesc;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public long getVersionId() {
        return this.versionId;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setFileSize(long j2) {
        this.fileSize = j2;
    }

    public void setIsNew(boolean z) {
        this.isNew = z;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setNew(boolean z) {
        this.isNew = z;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setPkgNameMd5(String str) {
        this.pkgNameMd5 = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUpdateDesc(String str) {
        this.updateDesc = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionId(long j2) {
        this.versionId = j2;
    }

    public String toString() {
        return "UpgradeInfo{isNew=" + this.isNew + ", status=" + this.status + ", masterId=" + this.masterId + ", versionCode=" + this.versionCode + ", versionId=" + this.versionId + ", pkgName='" + this.pkgName + "', pkgNameMd5='" + this.pkgNameMd5 + "', updateDesc='" + this.updateDesc + "', fileSize=" + this.fileSize + '}';
    }
}
