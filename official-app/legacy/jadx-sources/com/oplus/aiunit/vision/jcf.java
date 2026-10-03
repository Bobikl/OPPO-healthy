package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class jcf {
    public List<bu6> a;

    public jcf(List<bu6> list) {
        this.a = list;
    }

    public List<com.oplus.nearx.track.internal.db.ExceptionEntity> a(Thread thread, Throwable th) {
        HashMap map = new HashMap();
        for (bu6 bu6Var : this.a) {
            if (bu6Var.b(thread, th)) {
                com.oplus.nearx.track.internal.db.ExceptionEntity exceptionEntityD = bu6Var.d();
                long j2 = exceptionEntityD.moduleId;
                if (!map.containsKey(Long.valueOf(j2))) {
                    map.put(Long.valueOf(j2), exceptionEntityD);
                }
            }
        }
        return new ArrayList(map.values());
    }
}
