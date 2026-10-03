package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/so2;", "Ljava/util/concurrent/RejectedExecutionHandler;", "Ljava/lang/Runnable;", "r", "Ljava/util/concurrent/ThreadPoolExecutor;", MapSchema.FIELD_NAME_ENTRY, "", "rejectedExecution", "<init>", "()V", "Companion", "a", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class so2 implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(@Nullable Runnable r, @Nullable ThreadPoolExecutor e2) {
        boolean z = false;
        if (e2 != null && !e2.isShutdown()) {
            z = true;
        }
        if (z) {
            bs9.a.b(t6e.INSTANCE, "CaCheDiscardOldestPolicy", "rejectedExecution r:" + r, false, null, false, 0, false, null, 252, null);
            e2.getQueue().poll();
            e2.execute(r);
        }
    }
}
