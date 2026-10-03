package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes13.dex */
public final class zzqb {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzqb zza(Long l2) {
        this.zzc = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzb(Long l2) {
        this.zzd = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzc(Long l2) {
        this.zza = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzd(Long l2) {
        this.zze = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zze(Long l2) {
        this.zzb = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzf(Long l2) {
        this.zzf = Long.valueOf(l2.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqd zzg() {
        return new zzqd(this, null);
    }
}
