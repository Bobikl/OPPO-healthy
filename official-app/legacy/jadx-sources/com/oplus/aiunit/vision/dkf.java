package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/dkf;", "", "", "msg", "", "a", "b", "TAG_ESIM_NET", "Ljava/lang/String;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class dkf {
    public static final int $stable = 0;

    @NotNull
    public static final dkf INSTANCE = new dkf();

    @NotNull
    public static final String TAG_ESIM_NET = "W_NSC";

    public final void a(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        a7b.f(TAG_ESIM_NET, msg);
    }

    public final void b(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
