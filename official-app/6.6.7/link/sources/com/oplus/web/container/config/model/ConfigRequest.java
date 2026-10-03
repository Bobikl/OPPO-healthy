package com.oplus.web.container.config.model;

import androidx.annotation.Keep;
import com.oplus.webcontainer.net.req.BaseRequest;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class ConfigRequest extends BaseRequest {
    public String country;

    public ConfigRequest(String str) {
        this.country = str;
    }
}
