package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/hbi;", "", "", "mac", "Lcom/oplus/aiunit/vision/fbi;", "a", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class hbi {

    @NotNull
    public static final hbi INSTANCE = new hbi();

    @JvmStatic
    @NotNull
    public static final fbi a(@Nullable String mac) {
        return new gbi(rp5.b(mac));
    }
}
