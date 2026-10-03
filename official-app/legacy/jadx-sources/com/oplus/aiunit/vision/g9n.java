package com.oplus.aiunit.vision;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g9n {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }
}
