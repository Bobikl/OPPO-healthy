package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class zzxa {

    @Nullable
    private static zzwz zza;

    public static synchronized zzwp zza(zzwh zzwhVar) {
        if (zza == null) {
            zza = new zzwz(null);
        }
        return (zzwp) zza.get(zzwhVar);
    }

    public static synchronized zzwp zzb(String str) {
        return zza(zzwh.zzd(str).zzd());
    }
}
