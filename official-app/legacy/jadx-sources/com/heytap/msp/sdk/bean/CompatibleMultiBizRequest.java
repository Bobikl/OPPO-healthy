package com.heytap.msp.sdk.bean;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class CompatibleMultiBizRequest extends CompatibleInfo {
    private static final long serialVersionUID = 8423132898397427149L;
    private List<CompatibleBizInfo> items;

    public CompatibleMultiBizRequest() {
    }

    public CompatibleMultiBizRequest(CompatibleInfo compatibleInfo) {
        this.androidVersion = compatibleInfo.androidVersion;
        this.brand = compatibleInfo.brand;
        this.osVersion = compatibleInfo.osVersion;
        this.romVersion = compatibleInfo.romVersion;
        this.sdkVersion = compatibleInfo.sdkVersion;
        this.mspVersion = compatibleInfo.mspVersion;
        this.timestamp = compatibleInfo.timestamp;
        this.model = compatibleInfo.model;
        this.appPackage = compatibleInfo.appPackage;
    }

    public List<CompatibleBizInfo> getItems() {
        return this.items;
    }

    public void setItems(List<CompatibleBizInfo> list) {
        this.items = list;
    }

    public String toString() {
        return "CompatibleMultiBizRequest{, androidVersion='" + this.androidVersion + "', brand='" + this.brand + "', osVersion='" + this.osVersion + "', romVersion='" + this.romVersion + "', sdkVersion='" + this.sdkVersion + "', mspVersion='" + this.mspVersion + "', timestamp='" + this.timestamp + "', model='" + this.model + "', appPackage=" + this.appPackage + '}';
    }
}
