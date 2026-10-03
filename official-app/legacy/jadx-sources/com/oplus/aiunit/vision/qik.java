package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/qik;", "", "", "value", "", "f", MapSchema.FIELD_NAME_ENTRY, "b", b2n.f, "c", "d", "a", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class qik {

    @NotNull
    public static final qik INSTANCE = new qik();

    @JvmStatic
    public static final double a(int value) {
        return ((double) value) / 100.0d;
    }

    @JvmStatic
    public static final double b(int value) {
        return ((double) value) / 10.0d;
    }

    @JvmStatic
    public static final double c(int value) {
        return ((double) value) / 1000000.0d;
    }

    @JvmStatic
    public static final double d(int value) {
        return ((double) value) / 1000000.0d;
    }

    @JvmStatic
    public static final double e(int value) {
        return ((double) value) / 60.0d;
    }

    @JvmStatic
    public static final double f(int value) {
        return (((double) value) / 10.0d) / 3.6d;
    }

    @JvmStatic
    public static final double g(int value) {
        return ((double) value) / 100.0d;
    }
}
