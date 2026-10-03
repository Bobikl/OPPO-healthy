package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "mac", "", "a", "esim_impl_release"}, k = 2, mv = {1, 8, 0})
public final class ekf {
    public static final void a(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        dkf.INSTANCE.a("cleanRedTeaSp_" + gdb.a(mac));
        v9g.x("redtea_" + mac.hashCode()).k();
    }
}
