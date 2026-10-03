package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class zzxb {

    @Nullable
    private static zzxb zza;

    private zzxb() {
    }

    public static synchronized zzxb zza() {
        if (zza == null) {
            zza = new zzxb();
        }
        return zza;
    }
}
