package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DownloadDto {

    @Tag(6)
    private long fileSize;

    @Tag(8)
    private int fileType;

    @Tag(5)
    private List<String> fileUrl;

    @Tag(4)
    private String headerMd5;

    @Tag(12)
    private String key;

    @Tag(1)
    private long masterId;

    @Tag(3)
    private String md5;

    @Tag(10)
    private String pkgName;

    @Tag(11)
    private String pkgNameMd5;

    @Tag(9)
    private int status;

    @Tag(7)
    private int type;

    @Tag(2)
    private long versionId;

    public long getFileSize() {
        return this.fileSize;
    }

    public int getFileType() {
        return this.fileType;
    }

    public List<String> getFileUrl() {
        return this.fileUrl;
    }

    public String getHeaderMd5() {
        return this.headerMd5;
    }

    public String getKey() {
        return this.key;
    }

    public long getMasterId() {
        return this.masterId;
    }

    public String getMd5() {
        return this.md5;
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

    public int getType() {
        return this.type;
    }

    public long getVersionId() {
        return this.versionId;
    }

    public void setFileSize(long j2) {
        this.fileSize = j2;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }

    public void setFileUrl(List<String> list) {
        this.fileUrl = list;
    }

    public void setHeaderMd5(String str) {
        this.headerMd5 = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setMd5(String str) {
        this.md5 = str;
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

    public void setType(int i) {
        this.type = i;
    }

    public void setVersionId(long j2) {
        this.versionId = j2;
    }

    public String toString() {
        return "DownloadDto{masterId=" + this.masterId + ", versionId=" + this.versionId + ", md5='" + this.md5 + "', headerMd5='" + this.headerMd5 + "', fileUrl=" + this.fileUrl + ", fileSize=" + this.fileSize + ", type=" + this.type + ", fileType=" + this.fileType + ", status=" + this.status + ", pkgName='" + this.pkgName + "', pkgNameMd5='" + this.pkgNameMd5 + "', key='" + this.key + "'}";
    }
}
