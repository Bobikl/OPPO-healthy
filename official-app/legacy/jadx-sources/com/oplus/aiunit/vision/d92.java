package com.oplus.aiunit.vision;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/os/Bundle;", "", "a", "foundation-internal_release"}, k = 2, mv = {1, 8, 0})
public final class d92 {
    @NotNull
    public static final String a(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return "[key:" + bundle.keySet() + "]";
    }
}
