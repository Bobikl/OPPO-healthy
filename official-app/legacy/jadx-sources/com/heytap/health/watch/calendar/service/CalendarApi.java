package com.heytap.health.watch.calendar.service;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import com.heytap.health.watch.calendar.aidl.ICalendarSync;
import com.heytap.health.watch.calendar.aidl.ICalendarSyncListener;
import com.heytap.health.watch.calendar.manager.CalSyncDispatcher;
import com.heytap.health.watch.calendar.service.CalendarApi;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.jp2;
import com.oplus.health.apiprovider.ClientManager;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/watch/calendar/service/CalendarApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/calendar/aidl/ICalendarSync;", "Lcom/heytap/health/watch/calendar/aidl/ICalendarSync$Stub;", b2n.f, "Landroid/content/Context;", "context", "", "c", "b", "Landroid/os/RemoteCallbackList;", "Lcom/heytap/health/watch/calendar/aidl/ICalendarSyncListener;", "i", "Landroid/os/RemoteCallbackList;", "mCallbackList", "j", "Lkotlin/Lazy;", "f", "()Lcom/heytap/health/watch/calendar/aidl/ICalendarSync$Stub;", "mBinder", "<init>", "()V", "Companion", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CalendarApi implements cm9<ICalendarSync> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final RemoteCallbackList<ICalendarSyncListener> mCallbackList = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<CalendarApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.calendar.service.CalendarApi$mBinder$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.heytap.health.watch.calendar.service.CalendarApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            final CalendarApi calendarApi = this.this$0;
            return new ICalendarSync.Stub() { // from class: com.heytap.health.watch.calendar.service.CalendarApi$mBinder$2.1
                private final void onSyncing() {
                    try {
                        int iBeginBroadcast = calendarApi.mCallbackList.beginBroadcast();
                        a7b.f("CalHealth.CalendarApi", "onSyncing listener count " + iBeginBroadcast);
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            ((ICalendarSyncListener) calendarApi.mCallbackList.getBroadcastItem(i)).onSyncing();
                        }
                        calendarApi.mCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        a7b.b("CalHealth.CalendarApi", "onSyncing:" + e2.getMessage());
                    }
                }

                @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
                public void addSyncListener(@Nullable ICalendarSyncListener listener) {
                    if (listener != null) {
                        calendarApi.mCallbackList.register(listener);
                        if (CalSyncDispatcher.INSTANCE.h()) {
                            onSyncing();
                        }
                    }
                }

                @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
                public void onAction(int action) {
                    a7b.f("CalHealth.CalendarApi", "onAction action " + action);
                    if (action == 1) {
                        CalSyncDispatcher.INSTANCE.l();
                        return;
                    }
                    if (action == 2) {
                        CalSyncDispatcher.INSTANCE.m();
                        return;
                    }
                    if (action == 3) {
                        CalSyncDispatcher.INSTANCE.j();
                        return;
                    }
                    if (action == 4) {
                        onSyncing();
                        return;
                    }
                    if (action != 5) {
                        return;
                    }
                    try {
                        int iBeginBroadcast = calendarApi.mCallbackList.beginBroadcast();
                        a7b.f("CalHealth.CalendarApi", "CMD_SYNC_SUCCESS listener count " + iBeginBroadcast);
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            ((ICalendarSyncListener) calendarApi.mCallbackList.getBroadcastItem(i)).onSyncSuccess();
                        }
                        calendarApi.mCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        a7b.b("CalHealth.CalendarApi", "CMD_SYNC_SUCCESS:" + e2.getMessage());
                    }
                }

                @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
                public void onSyncFail(int errorCode) {
                    try {
                        int iBeginBroadcast = calendarApi.mCallbackList.beginBroadcast();
                        a7b.f("CalHealth.CalendarApi", "onSyncFail listener count " + iBeginBroadcast + " errorCode " + errorCode);
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            ((ICalendarSyncListener) calendarApi.mCallbackList.getBroadcastItem(i)).onSyncFail(errorCode);
                        }
                        calendarApi.mCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        a7b.b("CalHealth.CalendarApi", "onSyncFail:" + e2.getMessage());
                    }
                }

                @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
                public void removeSyncListener(@Nullable ICalendarSyncListener listener) {
                    if (listener != null) {
                        calendarApi.mCallbackList.unregister(listener);
                    }
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/watch/calendar/service/CalendarApi$Companion;", "", "Lcom/heytap/health/watch/calendar/aidl/ICalendarSync;", "b", "", "f", "", "errorCode", "d", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final ICalendarSync c(IBinder iBinder) {
            return ICalendarSync.Stub.asInterface(iBinder);
        }

        public static /* synthetic */ void e(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            companion.d(i);
        }

        @JvmStatic
        @Nullable
        public final ICalendarSync b() {
            return (ICalendarSync) ClientManager.getInstance().getBuildService("api_provider_calendar", new ClientManager.a() { // from class: com.oplus.aiunit.vision.up2
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return CalendarApi.Companion.c(iBinder);
                }
            });
        }

        @JvmStatic
        public final void d(int errorCode) {
            BuildersKt__Builders_commonKt.launch$default(jp2.INSTANCE, null, null, new CalendarApi$Companion$onSyncFail$1(errorCode, null), 3, null);
            CalSyncDispatcher.INSTANCE.n();
        }

        @JvmStatic
        public final void f() {
            BuildersKt__Builders_commonKt.launch$default(jp2.INSTANCE, null, null, new CalendarApi$Companion$onSyncSuccess$1(null), 3, null);
            CalSyncDispatcher.INSTANCE.n();
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ICalendarSync.Stub f() {
        return (ICalendarSync.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ICalendarSync.Stub d() {
        return f();
    }
}
