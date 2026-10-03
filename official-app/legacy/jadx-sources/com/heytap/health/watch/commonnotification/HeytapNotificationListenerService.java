package com.heytap.health.watch.commonnotification;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ls8;
import com.oplus.aiunit.vision.wq8;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;", "Landroid/service/notification/NotificationListenerService;", "()V", "onCreate", "", "onDestroy", "onListenerConnected", "onListenerDisconnected", "onNotificationPosted", "sbn", "Landroid/service/notification/StatusBarNotification;", "rankingMap", "Landroid/service/notification/NotificationListenerService$RankingMap;", "onNotificationRemoved", "Companion", "device_notification2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class HeytapNotificationListenerService extends NotificationListenerService {

    @NotNull
    private static final String TAG = "NTF_ListenerService";

    /* JADX INFO: renamed from: com.heytap.health.watch.commonnotification.HeytapNotificationListenerService$onCreate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.heytap.health.watch.commonnotification.HeytapNotificationListenerService$onCreate$1", f = "HeytapNotificationListenerService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeytapNotificationListenerService.this.new AnonymousClass1(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a7b.f(HeytapNotificationListenerService.TAG, "[onCreate] --> " + HeytapNotificationListenerService.this);
            ls8.INSTANCE.d(HeytapNotificationListenerService.this);
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ls8.INSTANCE.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        a7b.f(TAG, "[onListenerConnected] --> " + this);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        a7b.f(TAG, "[onListenerDisconnected] --> " + this);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(@NotNull StatusBarNotification sbn, @NotNull NotificationListenerService.RankingMap rankingMap) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        Intrinsics.checkNotNullParameter(rankingMap, "rankingMap");
        a7b.f(TAG, "service=" + this + " onNotificationPosted: key=" + sbn.getKey() + ", pkg=" + sbn.getPackageName() + ", flag=" + sbn.getNotification().flags + ", time=" + sbn.getPostTime());
        HealthNotificationBean healthNotificationBeanB = HealthNotificationBean.INSTANCE.b(sbn, rankingMap);
        boolean zIsSilent = healthNotificationBeanB.isSilent();
        int importance = healthNotificationBeanB.getImportance();
        StringBuilder sb = new StringBuilder();
        sb.append("onNotificationPosted: isSilent=");
        sb.append(zIsSilent);
        sb.append(", importance=");
        sb.append(importance);
        a7b.f(TAG, sb.toString());
        ls8.INSTANCE.e(healthNotificationBeanB);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(@NotNull StatusBarNotification sbn) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        a7b.f(TAG, "onNotificationRemoved: key=" + sbn.getKey() + ", flag=" + sbn.getNotification().flags);
        ls8.INSTANCE.f(HealthNotificationBean.Companion.c(HealthNotificationBean.INSTANCE, sbn, null, 2, null));
    }
}
