package com.platform.usercenter.account.ams.ipc.support;

import android.content.Intent;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcIpcResult {
    private String configJson;
    private Intent intent;
    private String responseJson;

    public String getConfigJson() {
        return this.configJson;
    }

    public Intent getIntent() {
        return this.intent;
    }

    public String getResponseJson() {
        return this.responseJson;
    }

    public void setConfigJson(String str) {
        this.configJson = str;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public void setResponseJson(String str) {
        this.responseJson = str;
    }
}
