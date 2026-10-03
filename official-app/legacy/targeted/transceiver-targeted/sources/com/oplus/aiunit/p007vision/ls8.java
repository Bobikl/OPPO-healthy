package com.oplus.aiunit.p007vision;

import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.heytap.health.watch.commonnotification.HeytapNotificationListenerService;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0015\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/ls8;", "Lcom/oplus/aiunit/vision/pq9;", "listener", "", "k", "Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;", "listenerService", "d", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "e", "b", "Landroid/os/Bundle;", "watchPush", "g", "a", "h", "f", "c", "onDestroy", "", "Landroid/service/notification/StatusBarNotification;", "i", "()[Landroid/service/notification/StatusBarNotification;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "mListeners", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mCreateStatus", "Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;", "j", "()Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;", "setMListenerService", "(Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;)V", "mListenerService", "<init>", "()V", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public final class ls8 implements pq9 {

    @NotNull
    public static final ls8 INSTANCE = new ls8();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentLinkedQueue<pq9> mListeners = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean mCreateStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static HeytapNotificationListenerService mListenerService;

    @Override // com.oplus.aiunit.p007vision.pq9
    public void a(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().a(hnb, watchPush);
        }
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void b(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().b(hnb);
        }
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void c(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().c(hnb);
        }
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void d(@NotNull HeytapNotificationListenerService listenerService) {
        Intrinsics.checkNotNullParameter(listenerService, "listenerService");
        mListenerService = listenerService;
        mCreateStatus.set(true);
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().d(listenerService);
        }
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void e(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().e(hnb);
        }
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void f(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().f(hnb);
        }
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void g(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().g(hnb, watchPush);
        }
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void h(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().h(hnb);
        }
    }

    @Nullable
    public final StatusBarNotification[] i() {
        HeytapNotificationListenerService heytapNotificationListenerService;
        try {
            twc.Companion companion = twc.INSTANCE;
            Context contextA = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            if (!companion.f(contextA) || (heytapNotificationListenerService = mListenerService) == null) {
                return null;
            }
            return heytapNotificationListenerService.getActiveNotifications();
        } catch (Exception e) {
            a7b.b("NTF_RegisterCenter", "getActiveNotifications: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public final HeytapNotificationListenerService j() {
        return mListenerService;
    }

    public final void k(@NotNull pq9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        a7b.f("NTF_RegisterCenter", "register: " + listener);
        ConcurrentLinkedQueue<pq9> concurrentLinkedQueue = mListeners;
        if (!concurrentLinkedQueue.contains(listener)) {
            concurrentLinkedQueue.add(listener);
        }
        HeytapNotificationListenerService heytapNotificationListenerService = mListenerService;
        if (heytapNotificationListenerService == null || !mCreateStatus.get()) {
            return;
        }
        listener.d(heytapNotificationListenerService);
    }

    @Override // com.oplus.aiunit.p007vision.pq9
    public void onDestroy() {
        Iterator<pq9> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        mCreateStatus.set(false);
    }
}
