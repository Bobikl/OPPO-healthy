package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class PointF3D {
    @NonNull
    public static PointF3D from(float f, float f2, float f3) {
        return new zza(f, f2, f3);
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
