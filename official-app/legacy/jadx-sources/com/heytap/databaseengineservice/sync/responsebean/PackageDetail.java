package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PackageDetail {

    @SerializedName("appName")
    String appName;

    @SerializedName("packageName")
    String packageName;

    @SerializedName("usages")
    List<UsageAppDetail> usages;

    public String getAppName() {
        return this.appName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<UsageAppDetail> getUsages() {
        return this.usages;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setUsages(List<UsageAppDetail> list) {
        this.usages = list;
    }
}
