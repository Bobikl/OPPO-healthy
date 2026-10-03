package com.heytap.health.watch.notification.impl.ui;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.watch.notification.NotificationRoomBean;
import com.heytap.health.watch.notification.impl.R$drawable;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.health.watch.oaf.wrapper.AbsFtAgent;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.log.nx.obus.Constants;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.oplus.aiunit.p007vision.cxc;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.exc;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mb5;
import com.oplus.aiunit.vision.swf;
import com.oplus.aiunit.vision.th7;
import com.oplus.aiunit.vision.wl4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J#\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\fR\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/NotificationSyncVm;", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "", "Lcom/heytap/health/watch/notification/impl/ui/j$a;", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "Lkotlinx/coroutines/Deferred;", "Landroid/graphics/drawable/Drawable;", "e0", "(Lcom/heytap/health/watch/notification/impl/ui/j$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f0", "d0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beans", "", Constants.EVENT_STATUS_FIELD, "g0", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bean", "b0", "", "o", "Lkotlin/Lazy;", "D", "()Ljava/lang/String;", AbsFtAgent.KEY_MAC, "Lcom/oplus/aiunit/vision/cxc;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/cxc;", "c0", "()Lcom/oplus/aiunit/vision/cxc;", "ability", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationSyncVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSyncVm.kt\ncom/heytap/health/watch/notification/impl/ui/NotificationSyncVm\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,216:1\n766#2:217\n857#2,2:218\n1549#2:220\n1620#2,3:221\n1855#2,2:224\n1855#2,2:257\n314#3,11:226\n314#3,11:237\n314#3,9:248\n323#3,2:259\n314#3,11:261\n*S KotlinDebug\n*F\n+ 1 NotificationSyncVm.kt\ncom/heytap/health/watch/notification/impl/ui/NotificationSyncVm\n*L\n37#1:217\n37#1:218,2\n39#1:220\n39#1:221,3\n41#1:224,2\n169#1:257,2\n53#1:226,11\n63#1:237,11\n167#1:248,9\n167#1:259,2\n194#1:261,11\n*E\n"})
public final class NotificationSyncVm extends BasicStateViewModel<List<? extends j.Item>> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy mac;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final cxc ability;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/impl/ui/NotificationSyncVm$a", "Lcom/heytap/health/watch/notification/impl/ui/i$a;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements i.a {
        public final /* synthetic */ j.Item a;
        public final /* synthetic */ ContinuationGuard<Drawable> b;

        public a(j.Item item, ContinuationGuard<Drawable> continuationGuard) {
            this.a = item;
            this.b = continuationGuard;
        }

        @Override // com.heytap.health.watch.notification.impl.ui.i.a
        public void a(@NotNull Drawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.a.g(drawable);
            this.b.b(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSyncVm(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
        this.mac = LazyKt.lazy(new Function0<String>() { // from class: com.heytap.health.watch.notification.impl.ui.NotificationSyncVm$mac$2
            @NotNull
            public final String invoke() {
                return wl4.managerApi.q(mb5.a.INSTANCE);
            }
        });
        this.ability = exc.a(D());
    }

    @NotNull
    public String D() {
        return (String) this.mac.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cb -> B:37:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public java.lang.Object J(@org.jetbrains.annotations.NotNull androidx.lifecycle.SavedStateHandle r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.heytap.health.watch.notification.impl.ui.j.Item>> r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.watch.notification.impl.ui.NotificationSyncVm.J(androidx.lifecycle.SavedStateHandle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object b0(@NotNull final j.Item item, @NotNull Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        com.heytap.health.watch.notification.b.INSTANCE.k(item.getPackageName(), !item.getSwitchStatus(), true, new SafeNotificationBooleanCallback(cancellableContinuationImpl, new Function1<Boolean, Boolean>() { // from class: com.heytap.health.watch.notification.impl.ui.NotificationSyncVm$appSwitch$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }

            @NotNull
            public final Boolean invoke(boolean z) {
                if (z) {
                    j.Item item2 = item;
                    item2.h(!item2.getSwitchStatus());
                    this.Y(new Function1<List<? extends j.Item>, List<? extends j.Item>>() { // from class: com.heytap.health.watch.notification.impl.ui.NotificationSyncVm$appSwitch$2$1.1
                        @NotNull
                        public final List<j.Item> invoke(@NotNull List<j.Item> list) {
                            Intrinsics.checkNotNullParameter(list, "$this$update");
                            return list;
                        }
                    });
                } else if (item.getSwitchStatus()) {
                    th7.l(R$string.settings_sync_notification_disable_fail);
                } else {
                    th7.l(R$string.settings_sync_notification_enable_fail);
                }
                return Boolean.valueOf(z);
            }
        }));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @NotNull
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final cxc getAbility() {
        return this.ability;
    }

    @Nullable
    public final Object d0(@NotNull Continuation<? super List<j.Item>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        com.heytap.health.watch.notification.b.INSTANCE.e(new SafeNotificationDataCallback(cancellableContinuationImpl, new Function1<List<NotificationRoomBean>, List<? extends j.Item>>() { // from class: com.heytap.health.watch.notification.impl.ui.NotificationSyncVm$loadAllSwitches$2$1
            {
                super(1);
            }

            @NotNull
            public final List<j.Item> invoke(@NotNull List<NotificationRoomBean> list) {
                j.Item item;
                Intrinsics.checkNotNullParameter(list, "list");
                boolean zV4 = this.this$0.getAbility().v4();
                ArrayList arrayList = new ArrayList();
                for (NotificationRoomBean notificationRoomBean : list) {
                    if (!Intrinsics.areEqual(notificationRoomBean.getPackageName(), "breeno") || (this.this$0.getAbility().r0() && !zV4)) {
                        if (!Intrinsics.areEqual(notificationRoomBean.getPackageName(), "flashback") || (this.this$0.getAbility().Y4() && !zV4)) {
                            if (!Intrinsics.areEqual(notificationRoomBean.getPackageName(), "cloud_msg") || this.this$0.getAbility().t2()) {
                                if (!Intrinsics.areEqual(notificationRoomBean.getPackageName(), "light_up") || this.this$0.getAbility().Z5()) {
                                    if (!Intrinsics.areEqual(notificationRoomBean.getPackageName(), "com.heytap.health.push")) {
                                        int viewType = notificationRoomBean.getViewType();
                                        if (viewType == 0) {
                                            int viewType2 = notificationRoomBean.getViewType();
                                            String packageName = notificationRoomBean.getPackageName();
                                            String appName = notificationRoomBean.getAppName();
                                            boolean zIsOpen = notificationRoomBean.isOpen();
                                            Drawable drawable = null;
                                            String appName2 = notificationRoomBean.getAppName();
                                            if (appName2 == null) {
                                                appName2 = "";
                                            }
                                            item = new j.Item(viewType2, packageName, appName, zIsOpen, drawable, appName2, null, 80, null);
                                        } else if (viewType == 950) {
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), swf.h(R$drawable.settings_flashback_icon), swf.l(R$string.settings_flashback_assistant), null, 64, null);
                                        } else if (viewType == 960) {
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), swf.h(R$drawable.settings_breeno_icon), swf.l(R$string.settings_breeno_advice), null, 64, null);
                                        } else if (viewType == 970) {
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), null, swf.l(R$string.settings_light_up), swf.l(R$string.settings_light_up_tips), 16, null);
                                        } else if (viewType == 980) {
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), null, swf.l(R$string.settings_sync_notification_no_push_screen_on_title), swf.l(R$string.settings_sync_notification_no_push_screen_on_message), 16, null);
                                        } else if (viewType == 990) {
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), null, swf.l(R$string.settings_sync_notification_no_push_wrist_off_title), swf.l(R$string.settings_sync_notification_no_push_wrist_off_message), 16, null);
                                        } else if (viewType == 995) {
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), null, swf.l(com.heytap.health.watch.notification.R$string.settings_cloud_notification), null, 80, null);
                                        } else if (viewType != 1000) {
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), null, null, null, 112, null);
                                        } else {
                                            String string = e88.a().getString(R$string.settings_sync_notification_help);
                                            Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getStrin…s_sync_notification_help)");
                                            String string2 = e88.a().getString(R$string.settings_sync_notification_main_message, string);
                                            Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getStrin…ation_main_message, help)");
                                            SpannableString spannableString = new SpannableString(string2);
                                            int iIndexOf$default = StringsKt.indexOf$default(string2, string, 0, false, 6, (Object) null);
                                            spannableString.setSpan(new j.Item.C0012a(), iIndexOf$default, string.length() + iIndexOf$default, 17);
                                            item = new j.Item(notificationRoomBean.getViewType(), notificationRoomBean.getPackageName(), notificationRoomBean.getAppName(), notificationRoomBean.isOpen(), null, swf.l(com.heytap.health.watch.notification.R$string.settings_sync_notification), spannableString, 16, null);
                                        }
                                        arrayList.add(item);
                                    }
                                }
                            }
                        }
                    }
                }
                return CollectionsKt.toList(arrayList);
            }
        }));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public final Object e0(@NotNull j.Item item, @NotNull Continuation<? super Deferred<? extends Drawable>> continuation) {
        return CoroutineScopeKt.coroutineScope(new NotificationSyncVm$loadAppIcon$2(this, item, null), continuation);
    }

    @Nullable
    public final Object f0(@NotNull j.Item item, @NotNull Continuation<? super Drawable> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        i.INSTANCE.d(item.getPackageName(), new a(item, new ContinuationGuard(cancellableContinuationImpl)));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public final Object g0(@NotNull final List<j.Item> list, final boolean z, @NotNull Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j.Item) it.next()).getPackageName());
        }
        com.heytap.health.watch.notification.b.INSTANCE.a(arrayList, z, true, new SafeNotificationBooleanCallback(cancellableContinuationImpl, new Function1<Boolean, Boolean>() { // from class: com.heytap.health.watch.notification.impl.ui.NotificationSyncVm$switchAll$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }

            @NotNull
            public final Boolean invoke(boolean z2) {
                m8b.f(j.TAG, "[switchAll]--> status: " + z + ", result: " + z2);
                if (z2) {
                    for (j.Item item : list) {
                        item.h(!item.getSwitchStatus());
                    }
                    this.Y(new Function1<List<? extends j.Item>, List<? extends j.Item>>() { // from class: com.heytap.health.watch.notification.impl.ui.NotificationSyncVm$switchAll$2$2.2
                        @NotNull
                        public final List<j.Item> invoke(@NotNull List<j.Item> list2) {
                            Intrinsics.checkNotNullParameter(list2, "$this$update");
                            return list2;
                        }
                    });
                } else if (z) {
                    th7.l(R$string.settings_sync_notification_enable_fail);
                } else {
                    th7.l(R$string.settings_sync_notification_disable_fail);
                }
                return Boolean.valueOf(z2);
            }
        }));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
