package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class vcn extends scn {
    public final void c(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.contains("OUID")) {
            ConcurrentHashMap concurrentHashMap = ((scn) this).a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ThreadPoolExecutor threadPoolExecutor = qcn.s_a;
            concurrentHashMap.put("OUID", new kdn("", jCurrentTimeMillis + 7200000));
            arrayList.remove("OUID");
        }
        if (arrayList.contains("OUID_STATUS")) {
            ConcurrentHashMap concurrentHashMap2 = ((scn) this).a;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ThreadPoolExecutor threadPoolExecutor2 = qcn.s_a;
            concurrentHashMap2.put("OUID_STATUS", new kdn("FALSE", jCurrentTimeMillis2 + 7200000));
            arrayList.remove("OUID_STATUS");
        }
        bdn.s_a.c(context, arrayList, z);
    }
}
