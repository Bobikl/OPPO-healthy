package com.oplus.aiunit.vision;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/svk;", "", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "Lcom/oplus/aiunit/vision/ane;", "rect", "", "array", "a", "", "x", "b", "y", "c", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class svk {
    public static final svk INSTANCE = new svk();

    @NotNull
    public final float[] a(int width, int height, @NotNull PointRect rect, @NotNull float[] array) {
        Intrinsics.checkParameterIsNotNull(rect, "rect");
        Intrinsics.checkParameterIsNotNull(array, "array");
        float f = width;
        array[0] = b(rect.getX() / f);
        float f2 = height;
        array[1] = c(rect.getY() / f2);
        array[2] = b(rect.getX() / f);
        array[3] = c((rect.getY() + rect.getH()) / f2);
        array[4] = b((rect.getX() + rect.getW()) / f);
        array[5] = c(rect.getY() / f2);
        array[6] = b((rect.getX() + rect.getW()) / f);
        array[7] = c((rect.getY() + rect.getH()) / f2);
        return array;
    }

    public final float b(float x) {
        return (x * 2.0f) - 1.0f;
    }

    public final float c(float y) {
        return (((y * 2.0f) - 2.0f) * (-1.0f)) - 1.0f;
    }
}
