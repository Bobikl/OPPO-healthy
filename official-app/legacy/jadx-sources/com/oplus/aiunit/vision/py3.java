package com.oplus.aiunit.vision;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000e\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/py3;", "", "Lcom/oplus/aiunit/vision/gq;", "address", "", "a", "", "host", "b", "Lcom/oplus/aiunit/vision/gcf;", "Lcom/oplus/aiunit/vision/gcf;", "c", "()Lcom/oplus/aiunit/vision/gcf;", "delegate", "<init>", "(Lcom/oplus/aiunit/vision/gcf;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class py3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gcf delegate;

    public py3(@NotNull gcf delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public final void a(@Nullable gq address) {
        this.delegate.d(address);
    }

    public final void b(@Nullable String host) {
        this.delegate.e(host);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final gcf getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public py3(int i, long j2, @NotNull TimeUnit timeUnit) {
        this(new gcf(yoj.INSTANCE, i, j2, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public py3() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
