package com.google.android.gms.internal.mlkit_vision_barcode;

import com.oplus.aiunit.vision.g9n;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class zzec {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!g9n.a(unsafe, obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }
}
