package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/d6b;", "", "", "tag", "msg", "", "a", "c", "d", "b", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class d6b {

    @NotNull
    public static final d6b INSTANCE = new d6b();

    public final void a(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        df8.a(tag, msg);
    }

    public final void b(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        df8.b(tag, msg);
    }

    public final void c(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        df8.c(tag, msg);
    }

    public final void d(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        df8.d(tag, msg);
    }
}
