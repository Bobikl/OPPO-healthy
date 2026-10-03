package com.oplus.aiunit.vision;

import com.heytap.health.protocol.dm.DMProto$WearingStatus;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\bH\u0002J \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002R\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/oplus/aiunit/vision/bjl;", "Lcom/oplus/aiunit/vision/tl4$a;", "", "f", "", "useCache", "", "c", "Lcom/heytap/health/protocol/dm/DMProto$WearingStatus;", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/ajl;", "listener", "a", b2n.g, "Lcom/oplus/aiunit/vision/ra5$c;", "role", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "onMessageReceived", "status", b2n.f, "oldStatus", "newStatus", "b", "i", "Ljava/lang/String;", "TAG", "", "j", "Ljava/util/Set;", "listeners", MapSchema.FIELD_NAME_KEY, "I", "currentStatus", "", LogFieldKey.LEVEL_KEY, "J", "statusUpdateTime", LogFieldKey.MESSAGE_KEY, "recentWearingTime", "n", "Z", "isLoadingStatus", "Ljava/lang/Object;", "o", "Ljava/lang/Object;", "statusSyncObj", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWearingStatusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearingStatusManager.kt\ncom/heytap/device/data/WearingStatusManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1855#2,2:148\n*S KotlinDebug\n*F\n+ 1 WearingStatusManager.kt\ncom/heytap/device/data/WearingStatusManager\n*L\n66#1:148,2\n*E\n"})
public final class bjl implements tl4.a {

    @NotNull
    public static final bjl INSTANCE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final String TAG;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<ajl> listeners;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static volatile int currentStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static volatile long statusUpdateTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static volatile int recentWearingTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isLoadingStatus;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final Object statusSyncObj;

    static {
        bjl bjlVar = new bjl();
        INSTANCE = bjlVar;
        TAG = "WearingStatusManager";
        listeners = new LinkedHashSet();
        currentStatus = 2;
        statusSyncObj = new Object();
        gl4.deviceMultiple.messageApi.l(ra5.a.INSTANCE, 1, 56, bjlVar);
    }

    public static /* synthetic */ int d(bjl bjlVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return bjlVar.c(z);
    }

    public final void a(@NotNull ajl listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        a7b.f(TAG, "Add wearing status listener");
        synchronized (listener) {
            listeners.add(listener);
        }
    }

    public final void b(String mac, int oldStatus, int newStatus) {
        List list;
        if (oldStatus == newStatus) {
            return;
        }
        Set<ajl> set = listeners;
        synchronized (set) {
            list = CollectionsKt___CollectionsKt.toList(set);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ajl) it.next()).a(mac, newStatus);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x001c, B:8:0x0020, B:11:0x003a, B:13:0x003e, B:15:0x004b, B:18:0x006a, B:20:0x0072, B:25:0x00a2, B:24:0x0099, B:21:0x008b), top: B:38:0x001c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    public final int c(boolean useCache) {
        String str;
        String str2 = TAG;
        a7b.f(str2, "Start getWearingStatus useCache=" + useCache);
        Object obj = statusSyncObj;
        synchronized (obj) {
            if (!useCache) {
                if (currentStatus == 2) {
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!isLoadingStatus) {
                    isLoadingStatus = true;
                    a7b.f(str2, "Send msg for wearing status");
                    gl4.deviceMultiple.messageApi.k(ra5.a.INSTANCE, new MessageEvent(1, 56, null));
                }
                Result.Companion companion = Result.INSTANCE;
                obj.wait(5000L);
                Result.m5287constructorimpl(Unit.INSTANCE);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                str = TAG;
                a7b.f(str, "Get wearing status cost=" + jCurrentTimeMillis2);
                Unit unit = Unit.INSTANCE;
                if (currentStatus == 2) {
                    return currentStatus;
                }
                a7b.f(str, "Get wearing status timeout, status is unknown");
                isLoadingStatus = false;
                return hbi.a(gl4.managerApi.getCurrentConnectId()).h4();
            }
            if (currentStatus != 2) {
                a7b.f(str2, "Return status from cache, status=" + currentStatus);
                return currentStatus;
            }
            if (currentStatus == 2 && System.currentTimeMillis() - statusUpdateTime < 2000) {
                a7b.f(str2, "Return status from cache, status=" + currentStatus + ", update time < 2s");
                return currentStatus;
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (!isLoadingStatus) {
                isLoadingStatus = true;
                a7b.f(str2, "Send msg for wearing status");
                gl4.deviceMultiple.messageApi.k(ra5.a.INSTANCE, new MessageEvent(1, 56, null));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                obj.wait(5000L);
                Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
            str = TAG;
            a7b.f(str, "Get wearing status cost=" + jCurrentTimeMillis4);
            Unit unit2 = Unit.INSTANCE;
            if (currentStatus == 2) {
                return currentStatus;
            }
            a7b.f(str, "Get wearing status timeout, status is unknown");
            isLoadingStatus = false;
            return hbi.a(gl4.managerApi.getCurrentConnectId()).h4();
            throw th;
        }
    }

    @NotNull
    public final DMProto$WearingStatus e() {
        a7b.f(TAG, "Get wearing status and time");
        DMProto$WearingStatus dMProto$WearingStatusBuild = DMProto$WearingStatus.newBuilder().setState(d(this, false, 1, null)).setRecentWearingTime(recentWearingTime).build();
        Intrinsics.checkNotNullExpressionValue(dMProto$WearingStatusBuild, "newBuilder().setState(st…ecentWearingTime).build()");
        return dMProto$WearingStatusBuild;
    }

    public final void f() {
        a7b.f(TAG, "Init WearingStatusManager");
    }

    public final void g(String mac, DMProto$WearingStatus status) {
        int i = currentStatus;
        currentStatus = status.getState();
        statusUpdateTime = System.currentTimeMillis();
        recentWearingTime = status.getRecentWearingTime();
        a7b.f(TAG, "On wearing status received, status=" + currentStatus);
        Object obj = statusSyncObj;
        synchronized (obj) {
            isLoadingStatus = false;
            obj.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        b(mac, i, currentStatus);
    }

    public final void h(@NotNull ajl listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        a7b.f(TAG, "Remove wearing status listener");
        Set<ajl> set = listeners;
        synchronized (set) {
            set.remove(listener);
        }
    }

    @Override // com.oplus.aiunit.vision.tl4.a
    public void onMessageReceived(@NotNull ra5.c role, @NotNull String mac, @NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        a7b.f(TAG, "On wear status msg, msg=" + event);
        if (event.getServiceId() == 1 && event.getCommandId() == 56) {
            try {
                Result.Companion companion = Result.INSTANCE;
                DMProto$WearingStatus from = DMProto$WearingStatus.parseFrom(event.getData());
                if (from != null) {
                    INSTANCE.g(mac, from);
                }
                Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
