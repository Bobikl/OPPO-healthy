package com.heytap.health.watchface.business.store.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class PhoneLocalInfoBean {
    private boolean isSupportThemeStore;
    private String networkType;
    private String resAesKey;

    public PhoneLocalInfoBean() {
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String getResAesKey() {
        return this.resAesKey;
    }

    public boolean isSupportThemeStore() {
        return this.isSupportThemeStore;
    }

    public void setNetworkType(String str) {
        this.networkType = str;
    }

    public void setResAesKey(String str) {
        this.resAesKey = str;
    }

    public void setSupportThemeStore(boolean z) {
        this.isSupportThemeStore = z;
    }

    public PhoneLocalInfoBean(String str, boolean z) {
        this.networkType = str;
        this.isSupportThemeStore = z;
    }
}
