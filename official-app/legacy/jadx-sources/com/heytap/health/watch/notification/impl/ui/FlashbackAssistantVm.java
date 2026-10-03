package com.heytap.health.watch.notification.impl.ui;

import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.watch.notification.NotificationRoomBean;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rsk;
import com.oplus.aiunit.vision.vik;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/FlashbackAssistantVm;", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "Lcom/heytap/health/watch/notification/NotificationRoomBean;", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "state", "c0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "Companion", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlashbackAssistantActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlashbackAssistantActivity.kt\ncom/heytap/health/watch/notification/impl/ui/FlashbackAssistantVm\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,218:1\n314#2,11:219\n314#2,11:230\n*S KotlinDebug\n*F\n+ 1 FlashbackAssistantActivity.kt\ncom/heytap/health/watch/notification/impl/ui/FlashbackAssistantVm\n*L\n38#1:219,11\n45#1:230,11\n*E\n"})
public final class FlashbackAssistantVm extends BasicStateViewModel<NotificationRoomBean> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String o = "NTF_FlashbackAssistantActivity";

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.impl.ui.FlashbackAssistantVm$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/FlashbackAssistantVm$a;", "", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return FlashbackAssistantVm.o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashbackAssistantVm(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super NotificationRoomBean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        com.heytap.health.watch.notification.b.INSTANCE.h("flashback", new SafeNotificationDataCallback(cancellableContinuationImpl, new Function1<List<NotificationRoomBean>, NotificationRoomBean>() { // from class: com.heytap.health.watch.notification.impl.ui.FlashbackAssistantVm$loadData$2$callback$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final NotificationRoomBean invoke(@NotNull List<NotificationRoomBean> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                NotificationRoomBean notificationRoomBean = (NotificationRoomBean) CollectionsKt___CollectionsKt.firstOrNull((List) list);
                return notificationRoomBean == null ? new NotificationRoomBean("", null, 0, null, false) : notificationRoomBean;
            }
        }));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public final Object c0(final boolean z, @NotNull Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        com.heytap.health.watch.notification.b.INSTANCE.k("flashback", z, true, new SafeNotificationBooleanCallback(cancellableContinuationImpl, new Function1<Boolean, Boolean>() { // from class: com.heytap.health.watch.notification.impl.ui.FlashbackAssistantVm$switch$2$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            @NotNull
            public final Boolean invoke(boolean z2) {
                boolean z3;
                a7b.f(FlashbackAssistantVm.INSTANCE.a(), "onResult: " + z2 + ", to status=" + z);
                if (z2) {
                    FlashbackAssistantVm flashbackAssistantVm = this;
                    final boolean z4 = z;
                    flashbackAssistantVm.Y(new Function1<NotificationRoomBean, NotificationRoomBean>() { // from class: com.heytap.health.watch.notification.impl.ui.FlashbackAssistantVm$switch$2$callback$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        @NotNull
                        public final NotificationRoomBean invoke(@NotNull NotificationRoomBean update) {
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return new NotificationRoomBean(update.getPackageName(), update.getAppName(), update.getViewType(), update.getAppNamePy(), z4);
                        }
                    });
                    z3 = true;
                    com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("switchnames", rsk.VAD_TYPE_BREENO).a("switchstatus", Boolean.valueOf(z)).b();
                    if (!z) {
                        com.heytap.health.watch.notification.impl.flashback.a.INSTANCE.j();
                    }
                } else {
                    if (z) {
                        rg7.l(R$string.settings_sync_notification_enable_fail);
                    } else {
                        rg7.l(R$string.settings_sync_notification_disable_fail);
                    }
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
