package com.oplus.aiunit.vision;

import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/vyf;", "", "Lcom/oplus/aiunit/vision/syf;", "failedRoute", "", "b", "route", "a", "", "c", "", "Ljava/util/Set;", "failedRoutes", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class vyf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Set<syf> failedRoutes = new LinkedHashSet();

    public final synchronized void a(@NotNull syf route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void b(@NotNull syf failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean c(@NotNull syf route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.failedRoutes.contains(route);
    }
}
