package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class kcf {
    public List<cu6> a;

    public kcf(List<cu6> list) {
        this.a = list;
    }

    public List<ExceptionEntity> a(Thread thread, Throwable th) {
        HashMap map = new HashMap();
        for (cu6 cu6Var : this.a) {
            if (cu6Var.b(thread, th)) {
                ExceptionEntity exceptionEntityC = cu6Var.c();
                long j2 = exceptionEntityC.b;
                if (!map.containsKey(Long.valueOf(j2))) {
                    map.put(Long.valueOf(j2), exceptionEntityC);
                }
            }
        }
        return new ArrayList(map.values());
    }
}
