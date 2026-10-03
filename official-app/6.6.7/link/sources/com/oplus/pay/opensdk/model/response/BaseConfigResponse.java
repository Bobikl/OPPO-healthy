package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.o38;
import com.oplus.aiunit.vision.pce;
import java.io.Serializable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class BaseConfigResponse implements Serializable {
    public String payServerDomain;

    public static BaseConfigResponse fromJson(String str) {
        try {
            return (BaseConfigResponse) new Gson().fromJson(str, BaseConfigResponse.class);
        } catch (Throwable th) {
            pce.i("BaseConfigResponse:" + th.getMessage());
            return null;
        }
    }

    public String toJson() {
        return o38.a(this);
    }
}
