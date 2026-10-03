package com.oplus.aiunit.vision;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/fyj;", "", "", "interval", "Lkotlin/Function0;", "", "operation", "a", "Ljava/util/concurrent/TimeUnit;", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "b", "J", "lastOperateTime", "<init>", "(Ljava/util/concurrent/TimeUnit;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class fyj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TimeUnit timeUnit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long lastOperateTime;

    public fyj(@NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.timeUnit = timeUnit;
    }

    public final void a(int interval, @NotNull Function0<Unit> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (System.nanoTime() - this.lastOperateTime > this.timeUnit.toNanos(interval)) {
            operation.invoke();
            this.lastOperateTime = System.nanoTime();
        }
    }
}
