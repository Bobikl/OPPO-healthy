package com.heytap.health.watchface.business.legacy.main.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ResourceResultBean {

    @SerializedName("packageName")
    private String mPackageName;

    @SerializedName("resPackageMd5")
    private String mResPackageMd5;

    @SerializedName("resPackageUrl")
    private String mResPackageUrl;

    @SerializedName("version")
    private int mVersion;

    @SerializedName("versionTime")
    private long mVersionTime;

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getResPackageMd5() {
        return this.mResPackageMd5;
    }

    public String getResPackageUrl() {
        return this.mResPackageUrl;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public long getVersionTime() {
        return this.mVersionTime;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setResPackageMd5(String str) {
        this.mResPackageMd5 = str;
    }

    public void setResPackageUrl(String str) {
        this.mResPackageUrl = str;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public void setVersionTime(long j2) {
        this.mVersionTime = j2;
    }
}
