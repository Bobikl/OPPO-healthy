package com.heytap.health.watch.notification.impl.ui;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watch.notification.INotificationDataCallback;
import com.heytap.health.watch.notification.NotificationRoomBean;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/SafeNotificationDataCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/watch/notification/INotificationDataCallback$Stub;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "mapper", "Lkotlin/Function1;", "", "Lcom/heytap/health/watch/notification/NotificationRoomBean;", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)V", "guard", "Lcom/heytap/health/watch/notification/impl/ui/ContinuationGuard;", "onResult", "", "list", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SafeNotificationDataCallback<T> extends INotificationDataCallback.Stub {

    @NotNull
    private final ContinuationGuard<T> guard;

    @NotNull
    private final Function1<List<NotificationRoomBean>, T> mapper;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeNotificationDataCallback(@NotNull CancellableContinuation<? super T> continuation, @NotNull Function1<? super List<NotificationRoomBean>, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.guard = new ContinuationGuard<>(continuation);
    }

    @Override // com.heytap.health.watch.notification.INotificationDataCallback
    public void onResult(@NotNull List<NotificationRoomBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.guard.b(this.mapper.invoke(list));
    }
}
