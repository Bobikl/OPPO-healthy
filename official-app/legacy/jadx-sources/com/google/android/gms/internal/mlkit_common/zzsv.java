package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class zzsv {

    @Nullable
    private static zzsv zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        if (zza == null) {
            zza = new zzsv();
        }
        return zza;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
