package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ac5;", "", "", "model", "Lcom/oplus/aiunit/vision/xb5;", "b", "mac", "Lcom/oplus/aiunit/vision/wb5;", "a", "<init>", "()V", "linkage_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ac5 {
    public static final int $stable = 0;

    @NotNull
    public static final ac5 INSTANCE = new ac5();

    @JvmStatic
    @NotNull
    public static final wb5 a(@Nullable String mac) {
        return new yb5(rp5.b(mac));
    }

    @JvmStatic
    @NotNull
    public static final xb5 b(@Nullable String model) {
        return new zb5(model);
    }
}
