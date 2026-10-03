package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes13.dex */
final class zzda extends zzde {
    private final int zzc;
    private final int zzd;

    public zzda(byte[] bArr, int i, int i2) {
        super(bArr);
        zzdf.zzo(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i) {
        zzdf.zzu(i, this.zzd);
        return ((zzde) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zzb(int i) {
        return ((zzde) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzde) this).zza, this.zzc + i, bArr, i2, i3);
    }
}
