package com.accountcenter;

import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.zu9;
import com.platform.sdk.center.deprecated.AcDispatcherManager;
import com.platform.usercenter.BaseApp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements zu9 {
    @Override // com.oplus.aiunit.vision.zu9
    public final void parallelInterceptSuccess(String str, String str2) {
        HashMap map = new HashMap();
        map.put(of5.ARG_EVENT_ID, "10607100001");
        map.put("url", str2);
        map.put("business_code", "vip");
        map.put("method_id", "parallel_intercept_success");
        map.put("reqpkg", BaseApp.mContext.getPackageName());
        AcDispatcherManager.getInstance().onStatistics("3012", "106", "10607100001", map);
    }

    @Override // com.oplus.aiunit.vision.zu9
    public final void parallelInterceptorFailed(String str, String str2) {
        HashMap map = new HashMap();
        map.put(of5.ARG_EVENT_ID, "10607100001");
        map.put("url", str2);
        map.put("business_code", "vip");
        map.put("method_id", "parallel_intercept_failed");
        map.put("reqpkg", BaseApp.mContext.getPackageName());
        AcDispatcherManager.getInstance().onStatistics("3012", "106", "10607100001", map);
    }
}
