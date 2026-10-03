package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/yhl;", "", "Lcom/oplus/aiunit/vision/i4l;", "a", "Lcom/oplus/aiunit/vision/i4l;", "()Lcom/oplus/aiunit/vision/i4l;", "c", "(Lcom/oplus/aiunit/vision/i4l;)V", "eventListener", "Lcom/oplus/aiunit/vision/j4l;", "b", "Lcom/oplus/aiunit/vision/j4l;", "()Lcom/oplus/aiunit/vision/j4l;", "d", "(Lcom/oplus/aiunit/vision/j4l;)V", "interceptor", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class yhl {

    @NotNull
    public static final yhl INSTANCE = new yhl();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static i4l eventListener = i4l.NONE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static j4l interceptor = j4l.NONE;

    @NotNull
    public final i4l a() {
        return eventListener;
    }

    @NotNull
    public final j4l b() {
        return interceptor;
    }

    public final void c(@NotNull i4l i4lVar) {
        Intrinsics.checkNotNullParameter(i4lVar, "<set-?>");
        eventListener = i4lVar;
    }

    public final void d(@NotNull j4l j4lVar) {
        Intrinsics.checkNotNullParameter(j4lVar, "<set-?>");
        interceptor = j4lVar;
    }
}
