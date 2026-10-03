package com.heytap.health.watch.notification.impl.apiprovider;

import android.content.Context;
import com.heytap.health.watch.notification.INotificationAidl;
import com.oplus.aiunit.vision.in9;
import com.oplus.aiunit.vision.m8b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watch/notification/impl/apiprovider/NotificationTransportApisImpl;", "Lcom/oplus/aiunit/vision/in9;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "d", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/health/watch/notification/INotificationAidl$Stub;", "i", "Lcom/heytap/health/watch/notification/INotificationAidl$Stub;", "iBinder", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class NotificationTransportApisImpl implements in9<INotificationAidl> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final INotificationAidl.Stub iBinder = new NotificationTransportApisImpl$iBinder$1();

    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m8b.f("NTF_TransportApisImpl", "onDestroy: " + this);
    }

    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m8b.f("NTF_TransportApisImpl", "onCreate: " + this);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public INotificationAidl getService() {
        return this.iBinder;
    }
}
