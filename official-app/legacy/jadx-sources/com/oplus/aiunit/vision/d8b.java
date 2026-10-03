package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0003\"\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0003\"\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"", "", "message", "", "args", "", "a", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V", "b", "core"}, k = 2, mv = {1, 4, 0})
public final class d8b {
    public static final void a(@NotNull Object log, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkParameterIsNotNull(log, "$this$log");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(args, "args");
    }

    public static final void b(@NotNull Object warn, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkParameterIsNotNull(warn, "$this$warn");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(args, "args");
    }
}
