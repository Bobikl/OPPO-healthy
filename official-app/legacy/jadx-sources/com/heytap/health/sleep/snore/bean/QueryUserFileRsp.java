package com.heytap.health.sleep.snore.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.nearx.tangramconfig.strategy.Fields;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class QueryUserFileRsp {

    @SerializedName("clientFileId")
    private String clientFileId;

    @SerializedName(LogSenderConst.FILENAME)
    private String fileName;

    @SerializedName("fileRemark")
    private String fileRemark;

    @SerializedName("fileSizeInBytes")
    private int fileSizeInBytes;

    @SerializedName("fileSource")
    private int fileSource;

    @SerializedName(Fields.FILE_TYPE)
    private int fileType;

    @SerializedName("fileUrl")
    private String fileUrl;

    @SerializedName("key")
    private String key;

    @SerializedName("md5")
    private String md5;

    @SerializedName("version")
    private int version;

    public String getClientDataId() {
        return this.clientFileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileRemark() {
        return this.fileRemark;
    }

    public int getFileSizeInBytes() {
        return this.fileSizeInBytes;
    }

    public int getFileSource() {
        return this.fileSource;
    }

    public int getFileType() {
        return this.fileType;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public String getKey() {
        return this.key;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getVersion() {
        return this.version;
    }

    public void setClientDataId(String str) {
        this.clientFileId = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileRemark(String str) {
        this.fileRemark = str;
    }

    public void setFileSizeInBytes(int i) {
        this.fileSizeInBytes = i;
    }

    public void setFileSource(int i) {
        this.fileSource = i;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return "QueryUserFileRsp{fileName='" + this.fileName + "',clientFileId='" + this.clientFileId + "', fileSizeInBytes=" + this.fileSizeInBytes + ", fileUrl=" + this.fileUrl + ", key=" + this.key + '}';
    }
}
