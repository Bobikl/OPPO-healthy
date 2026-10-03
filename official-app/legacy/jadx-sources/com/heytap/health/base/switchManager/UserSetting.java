package com.heytap.health.base.switchManager;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserSetting {

    @SerializedName("module")
    private String module;

    @SerializedName("settingKey")
    private String settingKey;

    @SerializedName("settingValue")
    private String settingValue;

    public String getModule() {
        return this.module;
    }

    public String getSettingKey() {
        return this.settingKey;
    }

    public String getSettingValue() {
        return this.settingValue;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setSettingKey(String str) {
        this.settingKey = str;
    }

    public void setSettingValue(String str) {
        this.settingValue = str;
    }
}
