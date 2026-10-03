package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Size;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Box {
    private final float[] mCenter;
    private final float[] mHalfExtent;

    public Box() {
        this.mCenter = new float[3];
        this.mHalfExtent = new float[3];
    }

    @NonNull
    @Size(min = 3)
    public float[] getCenter() {
        return this.mCenter;
    }

    @NonNull
    @Size(min = 3)
    public float[] getHalfExtent() {
        return this.mHalfExtent;
    }

    public void setCenter(float f, float f2, float f3) {
        float[] fArr = this.mCenter;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    public void setHalfExtent(float f, float f2, float f3) {
        float[] fArr = this.mHalfExtent;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    public Box(float f, float f2, float f3, float f4, float f5, float f6) {
        this.mCenter = new float[]{f, f2, f3};
        this.mHalfExtent = new float[]{f4, f5, f6};
    }

    public Box(@NonNull @Size(min = 3) float[] fArr, @NonNull @Size(min = 3) float[] fArr2) {
        this.mCenter = new float[]{fArr[0], fArr[1], fArr[2]};
        this.mHalfExtent = new float[]{fArr2[0], fArr2[1], fArr2[2]};
    }
}
