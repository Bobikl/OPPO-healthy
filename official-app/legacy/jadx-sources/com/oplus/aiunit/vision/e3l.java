package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/e3l;", "", "", "tag", "msg", "", "a", "c", "b", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class e3l {
    public static final int $stable = 0;

    @NotNull
    public static final e3l INSTANCE = new e3l();

    public final void a(@NotNull String tag, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public final void b(@NotNull String tag, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (qe0.z()) {
            z7b.c(tag, msg);
        } else {
            a7b.b(tag, msg);
        }
    }

    public final void c(@NotNull String tag, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (qe0.z()) {
            z7b.f(tag, msg);
        } else {
            a7b.f(tag, msg);
        }
    }
}
