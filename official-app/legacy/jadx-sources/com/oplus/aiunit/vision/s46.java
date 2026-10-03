package com.oplus.aiunit.vision;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a&\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¨\u0006\f"}, d2 = {"", "radius", "", "number", "", "b", "pointX", "pointY", "c", "halfWidth", "halfHeight", "a", "gdx_ui_release"}, k = 2, mv = {1, 8, 0})
public final class s46 {
    @NotNull
    public static final float[] a(float f, float f2) {
        float f3 = -f;
        float f4 = -f2;
        return new float[]{f3, f4, f, f4, f, f2, f3, f2};
    }

    @NotNull
    public static final float[] b(float f, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            double d = (((double) (i2 * 2)) * 3.141592653589793d) / ((double) i);
            float fSin = ((float) Math.sin(d)) * f;
            float fCos = ((float) Math.cos(d)) * f;
            arrayList.add(Float.valueOf(fSin));
            arrayList.add(Float.valueOf(fCos));
        }
        return CollectionsKt___CollectionsKt.toFloatArray(arrayList);
    }

    @NotNull
    public static final float[] c(float f, int i, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            double d = (((double) (i2 * 2)) * 3.141592653589793d) / ((double) i);
            float fSin = (((float) Math.sin(d)) * f) + f2;
            float fCos = (((float) Math.cos(d)) * f) + f3;
            arrayList.add(Float.valueOf(fSin));
            arrayList.add(Float.valueOf(fCos));
        }
        return CollectionsKt___CollectionsKt.toFloatArray(arrayList);
    }
}
