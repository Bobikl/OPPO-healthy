package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.l28;
import com.oplus.aiunit.vision.qae;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class BaseConfigResponse implements Serializable {
    public String payServerDomain;

    public static BaseConfigResponse fromJson(String str) {
        try {
            return (BaseConfigResponse) new Gson().fromJson(str, BaseConfigResponse.class);
        } catch (Throwable th) {
            qae.i("BaseConfigResponse:" + th.getMessage());
            return null;
        }
    }

    public String toJson() {
        return l28.a(this);
    }
}
