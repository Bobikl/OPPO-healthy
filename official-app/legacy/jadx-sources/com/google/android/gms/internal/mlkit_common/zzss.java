package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class zzss {

    @Nullable
    private static zzsr zza;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        if (zza == null) {
            zza = new zzsr(null);
        }
        return (zzsh) zza.get(zzsbVar);
    }

    public static synchronized zzsh zzb(String str) {
        return zza(zzsb.zzd("common").zzd());
    }
}
