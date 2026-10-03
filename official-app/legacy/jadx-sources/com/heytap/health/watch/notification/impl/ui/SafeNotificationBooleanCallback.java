package com.heytap.health.watch.notification.impl.ui;

import com.heytap.health.watch.notification.INotificationBooleanCallback;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/SafeNotificationBooleanCallback;", "Lcom/heytap/health/watch/notification/INotificationBooleanCallback$Stub;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "mapper", "Lkotlin/Function1;", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)V", "guard", "Lcom/heytap/health/watch/notification/impl/ui/ContinuationGuard;", "onResult", "", "result", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SafeNotificationBooleanCallback extends INotificationBooleanCallback.Stub {

    @NotNull
    private final ContinuationGuard<Boolean> guard;

    @NotNull
    private final Function1<Boolean, Boolean> mapper;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeNotificationBooleanCallback(@NotNull CancellableContinuation<? super Boolean> continuation, @NotNull Function1<? super Boolean, Boolean> mapper) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.guard = new ContinuationGuard<>(continuation);
    }

    @Override // com.heytap.health.watch.notification.INotificationBooleanCallback
    public void onResult(boolean result) {
        this.guard.b(this.mapper.invoke(Boolean.valueOf(result)));
    }
}
