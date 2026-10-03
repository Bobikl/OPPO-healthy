package com.heytap.health.watchpair.family.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class CreateFamilyAccountBean {
    private String virtualSsoid;

    public String getVirtualSsoid() {
        return this.virtualSsoid;
    }

    public void setVirtualSsoid(String str) {
        this.virtualSsoid = str;
    }

    public String toString() {
        return "CreateFamilyAccountBean{virtualSsoid='" + this.virtualSsoid + "'}";
    }
}
