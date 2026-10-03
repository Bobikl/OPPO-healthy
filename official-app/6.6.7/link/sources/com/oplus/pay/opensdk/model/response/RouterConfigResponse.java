package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.o38;
import com.oplus.aiunit.vision.pce;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
            pce.i("RouterConfigResponse:" + th.getMessage());
            return null;
        }
    }

    public String toJson() {
        return o38.a(this);
    }
}
