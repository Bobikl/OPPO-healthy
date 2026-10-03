package com.heytap.health.base.resource;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class ResourceBean {

    @SerializedName("fileUrl")
    private String fileUrl;

    @SerializedName("md5String")
    private String md5String;

    @SerializedName("updateTime")
    private long updateTime;

    public String getFileUrl() {
        return this.fileUrl;
    }

    public String getMd5String() {
        return this.md5String;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setMd5String(String str) {
        this.md5String = str;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }
}
