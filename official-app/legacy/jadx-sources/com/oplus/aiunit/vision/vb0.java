package com.oplus.aiunit.vision;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class vb0 {
    public static final List<a> a = new CopyOnWriteArrayList();
    public static long sAppModuleId;

    public interface a {
        void a(long j2);
    }

    static {
        a();
    }

    public static void a() {
    }

    public static void addOnAppModuleIdReadyListener(a aVar) {
        if (aVar == null) {
            return;
        }
        long j2 = sAppModuleId;
        if (j2 != 0) {
            aVar.a(j2);
        } else {
            a.add(aVar);
        }
    }

    public static void b(long j2) {
        List<a> list = a;
        if (list.isEmpty()) {
            return;
        }
        a[] aVarArr = (a[]) list.toArray(new a[0]);
        list.clear();
        for (a aVar : aVarArr) {
            if (aVar != null) {
                aVar.a(j2);
            }
        }
    }

    public static void c(long j2) {
        sAppModuleId = j2;
        if (j2 == 0) {
            return;
        }
        b(j2);
    }

    public static void removeOnAppModuleIdReadyListener(a aVar) {
        if (aVar == null) {
            return;
        }
        a.remove(aVar);
    }
}
