package com.heytap.health.device_app_store.impl.appstore.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class WaJsStatusBean {
    public static final int STATUS_FAIL = -1;
    public static final int STATUS_INSTALLING = 1;
    public static final int STATUS_SUCCESS = 0;
    private String status;

    public WaJsStatusBean(String str) {
        this.status = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
