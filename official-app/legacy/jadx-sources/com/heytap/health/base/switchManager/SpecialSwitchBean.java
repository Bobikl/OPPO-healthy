package com.heytap.health.base.switchManager;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SpecialSwitchBean {
    private String customConfig;
    private int switchStatus;

    public String getCustomConfig() {
        return this.customConfig;
    }

    public int getSwitchStatus() {
        return this.switchStatus;
    }

    public void setCustomConfig(String str) {
        this.customConfig = str;
    }

    public void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    public String toString() {
        return "QuerySpecialSwitchBean{switchStatus=" + this.switchStatus + ", customConfig='" + this.customConfig + "'}";
    }
}
