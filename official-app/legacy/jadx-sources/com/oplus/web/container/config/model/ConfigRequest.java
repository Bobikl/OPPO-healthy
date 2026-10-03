package com.oplus.web.container.config.model;

import androidx.annotation.Keep;
import com.oplus.webcontainer.net.req.BaseRequest;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class ConfigRequest extends BaseRequest {
    public String country;

    public ConfigRequest(String str) {
        this.country = str;
    }
}
