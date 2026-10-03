package com.google.mlkit.vision.common;

import android.media.Image;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final class zzb {
    private final Image zza;

    public zzb(Image image) {
        this.zza = image;
    }

    public final Image zza() {
        return this.zza;
    }

    public final Image.Plane[] zzb() {
        return this.zza.getPlanes();
    }
}
