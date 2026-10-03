package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.l28;
import com.oplus.aiunit.vision.qae;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class RouterConfigResponse implements Serializable {
    public List<RouterRule> generalRules;
    public List<RouterRule> merchantRules;

    @Keep
    public static class RouterRule implements Serializable {
        public String cashierHost;
        public String cashierLinkUrl;
        public String cashierType;
        public String countryCode;
        public String isSupportGlobal;
        public List<Integer> kitFilterVersion;
        public int kitMinVersion;
        public int priority;
        public String routeRuleType;
        public List<Integer> sdkFilterVersion;
        public int sdkMinVersion;
    }

    public static RouterConfigResponse fromJson(String str) {
        try {
            return (RouterConfigResponse) new Gson().fromJson(str, RouterConfigResponse.class);
        } catch (Throwable th) {
            qae.i("RouterConfigResponse:" + th.getMessage());
            return null;
        }
    }

    public String toJson() {
        return l28.a(this);
    }
}
