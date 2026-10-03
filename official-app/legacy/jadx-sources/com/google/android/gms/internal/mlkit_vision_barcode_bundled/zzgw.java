package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes13.dex */
final class zzgw extends zzgy {
    public zzgw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzc(Object obj, long j2, boolean z) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            zzgz.zzE(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzd(Object obj, long j2, byte b) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j2, b);
        } else {
            zzgz.zzE(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zze(Object obj, long j2, double d) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzf(Object obj, long j2, float f) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final boolean zzg(Object obj, long j2) {
        return zzgz.zzb ? zzgz.zzt(obj, j2) : zzgz.zzu(obj, j2);
    }
}
