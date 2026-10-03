package com.heytap.health.watch.notification.impl.ui;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watch.notification.INotificationBundleCallback;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/SafeNotificationBundleCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/watch/notification/INotificationBundleCallback$Stub;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "mapper", "Lkotlin/Function1;", "Landroid/os/Bundle;", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)V", "guard", "Lcom/heytap/health/watch/notification/impl/ui/ContinuationGuard;", "onResult", "", "result", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SafeNotificationBundleCallback<T> extends INotificationBundleCallback.Stub {

    @NotNull
    private final ContinuationGuard<T> guard;

    @NotNull
    private final Function1<Bundle, T> mapper;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeNotificationBundleCallback(@NotNull CancellableContinuation<? super T> continuation, @NotNull Function1<? super Bundle, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.guard = new ContinuationGuard<>(continuation);
    }

    @Override // com.heytap.health.watch.notification.INotificationBundleCallback
    public void onResult(@Nullable Bundle result) {
        this.guard.b(this.mapper.invoke(result));
    }
}
