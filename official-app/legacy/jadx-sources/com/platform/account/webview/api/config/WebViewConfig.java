package com.platform.account.webview.api.config;

import android.os.Bundle;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class WebViewConfig {
    private Bundle extras;
    private boolean isPanel;
    private String traceId;
    private String url;

    public Bundle getExtras() {
        return this.extras;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPanel() {
        return this.isPanel;
    }

    public void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public void setIsPanel(boolean z) {
        this.isPanel = z;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
