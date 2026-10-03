package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0000H\u0000¨\u0006\b"}, d2 = {"", "Lcom/oplus/aiunit/vision/ra5;", "role", "", "a", "d", "c", "b", "device_manager_release"}, k = 2, mv = {1, 8, 0})
public final class sa5 {
    public static final boolean a(int i, @NotNull ra5 role) {
        Intrinsics.checkNotNullParameter(role, "role");
        return (i & role.getValue()) == role.getValue();
    }

    public static final boolean b(int i) {
        return i == 0;
    }

    public static final int c(int i, @NotNull ra5 role) {
        Intrinsics.checkNotNullParameter(role, "role");
        return i & (~role.getValue());
    }

    public static final int d(int i, @NotNull ra5 role) {
        Intrinsics.checkNotNullParameter(role, "role");
        return i & role.getValue();
    }
}
