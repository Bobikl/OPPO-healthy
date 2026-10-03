package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/qc6;", "", "", "model", "Lcom/oplus/aiunit/vision/oc6;", "a", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class qc6 {
    public static final int $stable = 0;

    @NotNull
    public static final qc6 INSTANCE = new qc6();

    @JvmStatic
    @NotNull
    public static final oc6 a(@Nullable String model) {
        return new pc6(model);
    }
}
