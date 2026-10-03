package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/s43;", "", "", "duid", "", "a", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class s43 {

    @NotNull
    public static final s43 INSTANCE = new s43();

    public final int a(@NotNull String duid) {
        int hash;
        Intrinsics.checkNotNullParameter(duid, "duid");
        try {
            hash = ph8.INSTANCE.a().a(duid.hashCode()).getHash() % 100000;
        } catch (Exception unused) {
            hash = 0;
        }
        return Math.abs(hash);
    }
}
