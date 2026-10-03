package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PackageStat {

    @SerializedName("appName")
    String appName;

    @SerializedName("packageName")
    String packageName;

    @SerializedName("useTotalTime")
    int useTotalTime;

    public String getAppName() {
        return this.appName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getUseTotalTime() {
        return this.useTotalTime;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setUseTotalTime(int i) {
        this.useTotalTime = i;
    }
}
