package com.heytap.health.watchface.business.store.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WfJsStatusBean {
    public static final int STATUS_SUCCESS = 0;
    private String status;

    public WfJsStatusBean(String str) {
        this.status = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
