package com.heytap.health.base.download.resource;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class ResourceBean {

    @SerializedName("fileUrl")
    private String fileUrl;
    private boolean isUpdate;
    private String mUuid;
    private String md5String;

    @Keep
    private String resPackageMd5;

    @Keep
    private String resPackageUrl;

    @Keep
    private long updateTime;

    public String getFileUrl() {
        return this.fileUrl;
    }

    public String getMd5String() {
        return this.md5String;
    }

    public String getResPackageMd5() {
        return this.resPackageMd5;
    }

    public String getResPackageUrl() {
        return this.resPackageUrl;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getUuid() {
        return this.mUuid;
    }

    public boolean isUpdate() {
        return this.isUpdate;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setMd5String(String str) {
        this.md5String = str;
    }

    public void setResPackageMd5(String str) {
        this.resPackageMd5 = str;
    }

    public void setResPackageUrl(String str) {
        this.resPackageUrl = str;
    }

    public void setUpdate(boolean z) {
        this.isUpdate = z;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public void setUuid(String str) {
        this.mUuid = str;
    }
}
