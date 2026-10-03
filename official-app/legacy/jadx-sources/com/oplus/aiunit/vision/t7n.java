package com.oplus.aiunit.vision;

import android.content.Context;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes8.dex */
public final class t7n extends q7n {
    @Override // com.oplus.aiunit.vision.q7n
    public final void c(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.contains(OpenIDHelper.OUID)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ThreadPoolExecutor threadPoolExecutor = o7n.f14829s_a;
            concurrentHashMap.put(OpenIDHelper.OUID, new i8n("", jCurrentTimeMillis + 7200000));
            arrayList.remove(OpenIDHelper.OUID);
        }
        if (arrayList.contains("OUID_STATUS")) {
            ConcurrentHashMap concurrentHashMap2 = this.a;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ThreadPoolExecutor threadPoolExecutor2 = o7n.f14829s_a;
            concurrentHashMap2.put("OUID_STATUS", new i8n("FALSE", jCurrentTimeMillis2 + 7200000));
            arrayList.remove("OUID_STATUS");
        }
        z7n.f19313s_a.c(context, arrayList, z);
    }
}
