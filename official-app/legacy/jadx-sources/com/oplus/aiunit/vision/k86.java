package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/k86;", "", "", "mac", "Lcom/oplus/aiunit/vision/i86;", "a", "<init>", "()V", "ecg_release"}, k = 1, mv = {1, 8, 0})
public final class k86 {

    @NotNull
    public static final k86 INSTANCE = new k86();

    @JvmStatic
    @NotNull
    public static final i86 a(@Nullable String mac) {
        return new j86(rp5.b(mac));
    }
}
