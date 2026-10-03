package com.heytap.health.wallet.service.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class QueryDeviceInfo {
    private String deviceModel;
    private String deviceName;
    private String manufacturer;

    public QueryDeviceInfo(String str, String str2, String str3) {
        this.deviceName = str;
        this.deviceModel = str2;
        this.manufacturer = str3;
    }
}
