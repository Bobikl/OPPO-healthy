package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class zzmw {

    @Nullable
    private static zzmw zza;

    private zzmw() {
    }

    public static synchronized zzmw zza() {
        if (zza == null) {
            zza = new zzmw();
        }
        return zza;
    }

    public static final boolean zzb() {
        return zzmv.zza("mlkit-dev-profiling");
    }
}
