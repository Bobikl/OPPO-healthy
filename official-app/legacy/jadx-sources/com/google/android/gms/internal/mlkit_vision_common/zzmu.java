package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes13.dex */
public final class zzmu {
    @WorkerThread
    public static void zza(zzmj zzmjVar, int i, int i2, long j2, int i3, int i4, int i5, int i6) {
        zzmjVar.zzc(zzc(i, i2, j2, i3, i4, i5, i6), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    @WorkerThread
    public static void zzb(zzmj zzmjVar, int i, int i2, long j2, int i3, int i4, int i5, int i6) {
        zzmjVar.zzc(zzc(i, i2, j2, i3, i4, i5, i6), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i, int i2, long j2, int i3, int i4, int i5, int i6) {
        return new zzmt(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j2, i6);
    }
}
