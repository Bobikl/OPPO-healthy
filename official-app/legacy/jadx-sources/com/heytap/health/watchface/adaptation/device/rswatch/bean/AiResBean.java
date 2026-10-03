package com.heytap.health.watchface.adaptation.device.rswatch.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AiResBean {
    private String resPackageMd5;
    private String resPackageUrl;
    private long updateTime;

    public String getResPackageMd5() {
        return this.resPackageMd5;
    }

    public String getResPackageUrl() {
        return this.resPackageUrl;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setResPackageMd5(String str) {
        this.resPackageMd5 = str;
    }

    public void setResPackageUrl(String str) {
        this.resPackageUrl = str;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }
}
