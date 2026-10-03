package com.accountcenter;

import com.oplus.aiunit.vision.mv9;
import com.oplus.aiunit.vision.of5;
import com.platform.sdk.center.deprecated.AcDispatcherManager;
import com.platform.usercenter.BaseApp;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements mv9 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public static void a(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("log_tag", "106");
        map.put(of5.ARG_EVENT_ID, "10607100001");
        map.put("product_code", "3012");
        map.put(str, str3);
        map.put("method_id", str2);
        map.put("reqpkg", BaseApp.mContext.getPackageName());
        AcDispatcherManager.getInstance().onStatistics("3012", "106", "10607100001", map);
    }

    @Override // com.oplus.aiunit.vision.mv9
    public final void preloadResInterceptorFailed(String str) {
        Integer num = (Integer) this.b.get(str);
        this.b.put(str, (num == null || num.intValue() == 0) ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.oplus.aiunit.vision.mv9
    public final void preloadResInterceptorSuccess(String str) {
        Integer num = (Integer) this.a.get(str);
        this.a.put(str, (num == null || num.intValue() == 0) ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.oplus.aiunit.vision.mv9
    public final void upload(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("log_tag", "106");
        map2.put(of5.ARG_EVENT_ID, "10607100001");
        map2.put("product_code", "3012");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        map2.put("reqpkg", BaseApp.mContext.getPackageName());
        AcDispatcherManager.getInstance().onStatistics("3012", "106", "10607100001", map2);
    }
}
