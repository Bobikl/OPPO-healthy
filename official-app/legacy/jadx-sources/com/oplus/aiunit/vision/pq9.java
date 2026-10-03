package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.health.watch.commonnotification.HeytapNotificationListenerService;
import com.heytap.health.watch.notification.HealthNotificationBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0004H&¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/pq9;", "", "Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;", "listenerService", "", "d", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", MapSchema.FIELD_NAME_ENTRY, "b", "Landroid/os/Bundle;", "watchPush", b2n.f, "a", b2n.g, "f", "c", "onDestroy", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public interface pq9 {
    void a(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush);

    void b(@NotNull HealthNotificationBean hnb);

    void c(@NotNull HealthNotificationBean hnb);

    void d(@NotNull HeytapNotificationListenerService listenerService);

    void e(@NotNull HealthNotificationBean hnb);

    void f(@NotNull HealthNotificationBean hnb);

    void g(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush);

    void h(@NotNull HealthNotificationBean hnb);

    void onDestroy();
}
