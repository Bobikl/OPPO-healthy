package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/vsd;", "", "", "mac", "Lcom/oplus/aiunit/vision/tsd;", "a", "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final class vsd {

    @NotNull
    public static final vsd INSTANCE = new vsd();

    @JvmStatic
    @NotNull
    public static final tsd a(@Nullable String mac) {
        return new usd(rp5.b(mac));
    }
}
