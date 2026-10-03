package com.google.android.odml.image;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final class zzf implements zzg {
    private final ByteBuffer zza;
    private final ImageProperties zzb;

    public zzf(ByteBuffer byteBuffer, int i) {
        this.zza = byteBuffer;
        zzb zzbVar = new zzb();
        zzbVar.zzb(2);
        zzbVar.zza(i);
        this.zzb = zzbVar.zzc();
    }

    public final ByteBuffer zza() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.zzb;
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
    }
}
