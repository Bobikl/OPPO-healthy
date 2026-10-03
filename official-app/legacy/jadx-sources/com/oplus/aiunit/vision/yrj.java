package com.oplus.aiunit.vision;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/yrj;", "", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "Lcom/oplus/aiunit/vision/ane;", "rect", "", "array", "a", "b", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class yrj {
    public static final yrj INSTANCE = new yrj();

    @NotNull
    public final float[] a(int width, int height, @NotNull PointRect rect, @NotNull float[] array) {
        Intrinsics.checkParameterIsNotNull(rect, "rect");
        Intrinsics.checkParameterIsNotNull(array, "array");
        float f = width;
        array[0] = rect.getX() / f;
        float f2 = height;
        array[1] = rect.getY() / f2;
        array[2] = rect.getX() / f;
        array[3] = (rect.getY() + rect.getH()) / f2;
        array[4] = (rect.getX() + rect.getW()) / f;
        array[5] = rect.getY() / f2;
        array[6] = (rect.getX() + rect.getW()) / f;
        array[7] = (rect.getY() + rect.getH()) / f2;
        return array;
    }

    @NotNull
    public final float[] b(@NotNull float[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        float f = array[0];
        float f2 = array[1];
        array[0] = array[2];
        array[1] = array[3];
        array[2] = array[6];
        array[3] = array[7];
        array[6] = array[4];
        array[7] = array[5];
        array[4] = f;
        array[5] = f2;
        return array;
    }
}
