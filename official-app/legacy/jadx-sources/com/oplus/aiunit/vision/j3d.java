package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/j3d;", "", "", "tag", "msg", "", "a", "c", "b", "Ljava/lang/String;", "prefix", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class j3d {

    @NotNull
    public static final j3d INSTANCE = new j3d();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String prefix = "OSetUp.";

    public final void a(@NotNull String tag, @NotNull Object msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        String str = prefix;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(tag);
        msg.toString();
    }

    public final void b(@NotNull String tag, @NotNull Object msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a7b.b(prefix + tag, msg.toString());
    }

    public final void c(@NotNull String tag, @NotNull Object msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a7b.f(prefix + tag, msg.toString());
    }
}
