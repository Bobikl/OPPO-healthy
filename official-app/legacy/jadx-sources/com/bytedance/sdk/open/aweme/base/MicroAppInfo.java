package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.iim;

/* JADX INFO: loaded from: classes13.dex */
public class MicroAppInfo {

    @SerializedName("appId")
    private String appId;

    @SerializedName("appTitle")
    private String appTitle;

    @SerializedName("appUrl")
    private String appUrl;

    @SerializedName(iim.a.f)
    private String description;

    public static MicroAppInfo unserialize(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("_aweme_open_sdk_params_micro_app_info");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (MicroAppInfo) new Gson().fromJson(string, MicroAppInfo.class);
            }
        } catch (JsonSyntaxException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppTitle() {
        return this.appTitle;
    }

    public String getAppUrl() {
        return this.appUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public void serialize(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putString("_aweme_open_sdk_params_micro_app_info", new Gson().toJson(this));
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppTitle(String str) {
        this.appTitle = str;
    }

    public void setAppUrl(String str) {
        this.appUrl = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }
}
