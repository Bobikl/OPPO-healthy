package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class TreadmillBleLimitBean {
    String deviceType;
    String model;

    public TreadmillBleLimitBean(String str, String str2) {
        this.model = str;
        this.deviceType = str2;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getModel() {
        return this.model;
    }
}
