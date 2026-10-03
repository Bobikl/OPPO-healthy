package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/iy6;", "", "", "b", "", "a", "J", "exposureStartTime", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class iy6 {

    @NotNull
    public static final iy6 INSTANCE = new iy6();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static long exposureStartTime;

    public final long a() {
        return exposureStartTime;
    }

    public final void b() {
        exposureStartTime = System.currentTimeMillis();
    }
}
