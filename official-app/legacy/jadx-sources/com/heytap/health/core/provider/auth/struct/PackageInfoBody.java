package com.heytap.health.core.provider.auth.struct;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class PackageInfoBody {
    private String appPackage;
    private String clientId;
    private int clientOrder;
    private int clientShowApp;
    private String clientUrl;
    private List<String> sha1sums;

    public String getAppPackage() {
        return this.appPackage;
    }

    public String getClientId() {
        return this.clientId;
    }

    public int getClientOrder() {
        return this.clientOrder;
    }

    public int getClientShowApp() {
        return this.clientShowApp;
    }

    public String getClientUrl() {
        return this.clientUrl;
    }

    public List<String> getSha1sums() {
        return this.sha1sums;
    }

    public void setAppPackage(String str) {
        this.appPackage = str;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setClientOrder(int i) {
        this.clientOrder = i;
    }

    public void setClientShowApp(int i) {
        this.clientShowApp = i;
    }

    public void setClientUrl(String str) {
        this.clientUrl = str;
    }

    public void setSha1sums(List<String> list) {
        this.sha1sums = list;
    }

    public String toString() {
        return "PackageInfoBody{appPackage='" + this.appPackage + "', clientId='" + this.clientId + "', sha1sums=" + this.sha1sums + ", clientUrl='" + this.clientUrl + "', clientOrder=" + this.clientOrder + ", clientShowApp=" + this.clientShowApp + '}';
    }
}
