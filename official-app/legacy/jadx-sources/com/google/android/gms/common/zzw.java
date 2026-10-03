package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
class zzw {
    private static final zzw zze = new zzw(true, 3, 1, null, null);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzw(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzw zzb() {
        return zze;
    }

    public static zzw zzc(@NonNull String str) {
        return new zzw(false, 1, 5, str, null);
    }

    public static zzw zzd(@NonNull String str, @NonNull Throwable th) {
        return new zzw(false, 1, 5, str, th);
    }

    public static zzw zzf(int i) {
        return new zzw(true, i, 1, null, null);
    }

    public static zzw zzg(int i, int i2, @NonNull String str, @Nullable Throwable th) {
        return new zzw(false, i, i2, str, th);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
