package com.google.android.odml.image;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class BitmapExtractor {
    private BitmapExtractor() {
    }

    @NonNull
    public static Bitmap extract(@NonNull MlImage mlImage) {
        zzg zzgVarZza = mlImage.zza();
        if (zzgVarZza.zzb().getStorageType() == 1) {
            return ((zze) zzgVarZza).zza();
        }
        throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }
}
