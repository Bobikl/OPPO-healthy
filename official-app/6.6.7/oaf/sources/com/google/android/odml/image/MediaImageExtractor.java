package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RequiresApi(19)
public class MediaImageExtractor {
    private MediaImageExtractor() {
    }

    @NonNull
    public static Image extract(@NonNull MlImage mlImage) {
        zzg zzgVarZza = mlImage.zza();
        if (zzgVarZza.zzb().getStorageType() == 3) {
            return ((zzi) zzgVarZza).zza();
        }
        throw new IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }
}
