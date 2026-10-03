package com.heytap.health.watch.notification.impl.module;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.service.notification.StatusBarNotification;
import android.util.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleCompat;
import com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.NTFCmdId;
import com.heytap.health.watch.notification.NotificationCloudStatusBean;
import com.heytap.health.watch.notification.NotificationRemoved;
import com.heytap.health.watch.notification.ScreenStatus;
import com.heytap.health.watch.notification.impl.cloud.CloudPushManager;
import com.heytap.health.watch.notification.impl.fluid.FluidConfigCenter;
import com.heytap.health.watch.notification.impl.fluid.FluidManager;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watch.notification.impl.push.WatchPushManager;
import com.heytap.health.watch.notification.impl.quickreply.QuickReplySyncHelper;
import com.heytap.health.watch.notification.impl.sms.SatelliteSmsManager;
import com.heytap.health.watch.notification.impl.sms.VerifyCodeManager;
import com.heytap.health.watch.notification.impl.transceiver.NotificationTransceiverManager;
import com.heytap.health.watch.notification.impl.whitelist.NotificationRoom;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.p007vision.acl;
import com.oplus.aiunit.p007vision.c0d;
import com.oplus.aiunit.p007vision.c72;
import com.oplus.aiunit.p007vision.ezc;
import com.oplus.aiunit.p007vision.ixc;
import com.oplus.aiunit.p007vision.lyc;
import com.oplus.aiunit.p007vision.pt8;
import com.oplus.aiunit.p007vision.qbm;
import com.oplus.aiunit.p007vision.yxc;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.el5;
import com.oplus.aiunit.vision.exc;
import com.oplus.aiunit.vision.jm4;
import com.oplus.aiunit.vision.kdb;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mb5;
import com.oplus.aiunit.vision.mm4;
import com.oplus.aiunit.vision.rj5;
import com.oplus.aiunit.vision.svc;
import com.oplus.aiunit.vision.veb;
import com.oplus.aiunit.vision.vgf;
import com.oplus.aiunit.vision.vnk;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.wv8;
import com.oplus.aiunit.vision.yml;
import com.oplus.aiunit.vision.zr8;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\rJ\u0010\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fR\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u001aR\"\u0010I\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010N\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001a\u001a\u0004\bK\u0010L\"\u0004\b2\u0010MR\u001b\u0010R\u001a\u00020O8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010TR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020A0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010W¨\u0006["}, d2 = {"Lcom/heytap/health/watch/notification/impl/module/NotificationModule;", "", "Ljava/lang/Runnable;", "runnable", "", LogFieldKey.PROCESS_NAME_KEY, acl.KEY_B, LogFieldKey.LEVEL_KEY, "k", acl.KEY_A, "F", "L", "K", "", "linkage", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "n", "G", "", "x", "q", "H", "", "nodeId", "open", "J", "Landroid/service/notification/StatusBarNotification;", "sbn", LogFieldKey.MESSAGE_KEY, "E", "Lcom/heytap/health/watch/notification/NotificationRemoved;", "dismiss", "o", "Ljava/util/concurrent/ExecutorService;", "a", "Lkotlin/Lazy;", LogFieldKey.TAG_KEY, "()Ljava/util/concurrent/ExecutorService;", "mExecutor", "Lkotlinx/coroutines/CoroutineScope;", "b", "y", "()Lkotlinx/coroutines/CoroutineScope;", "userPresentScope", "Lkotlinx/coroutines/Job;", "c", "Lkotlinx/coroutines/Job;", "userPresentDebounceJob", "d", "I", "mPhoneScreenStatus", "e", "Z", "mVerifyCodeEnable", "Lcom/heytap/health/watch/notification/impl/sms/VerifyCodeManager;", "f", "w", "()Lcom/heytap/health/watch/notification/impl/sms/VerifyCodeManager;", "mVerifyCodeManager", "Lcom/heytap/health/watch/notification/impl/sms/SatelliteSmsManager;", "g", "v", "()Lcom/heytap/health/watch/notification/impl/sms/SatelliteSmsManager;", "mSatelliteSmsManager", "", "h", "mThreadId", "i", "z", "()I", "setWearStatus", "(I)V", "wearStatus", "j", "s", "()J", "(J)V", "lastDisConnectSnap", "Lcom/heytap/health/watch/notification/impl/fluid/FluidManager;", "u", "()Lcom/heytap/health/watch/notification/impl/fluid/FluidManager;", "mFluidManager", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mFluidStatus", "", "Ljava/util/Map;", "fluidCloudRefreshTimeMap", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class NotificationModule {

    @NotNull
    public static final NotificationModule INSTANCE = new NotificationModule();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mExecutor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mExecutor$2
        public final ExecutorService invoke() {
            return cs8.d("NTF_Module");
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy userPresentScope = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$userPresentScope$2
        @NotNull
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(zr8.INSTANCE.b("NTF_Module").plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static volatile Job userPresentDebounceJob;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static int mPhoneScreenStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static boolean mVerifyCodeEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mVerifyCodeManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mSatelliteSmsManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static long mThreadId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static int wearStatus;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static long lastDisConnectSnap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mFluidManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static AtomicBoolean mFluidStatus;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Long> fluidCloudRefreshTimeMap;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/watch/notification/impl/module/NotificationModule$a", "Lcom/oplus/aiunit/vision/rj5;", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "list", "Lcom/oplus/aiunit/vision/vnk;", "updateType", "", "I2", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements rj5 {
        public final /* synthetic */ IDeviceWearStatusService i;
        public final /* synthetic */ yml j;

        public a(IDeviceWearStatusService iDeviceWearStatusService, yml ymlVar) {
            this.i = iDeviceWearStatusService;
            this.j = ymlVar;
        }

        public static final void b() {
            NotificationModule.INSTANCE.A();
        }

        public void I2(@NotNull List<? extends UserDeviceInfo> list, @NotNull vnk updateType) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(updateType, "updateType");
            m8b.f("NTF_Module", "notifyUpdateDeviceInfo: " + list.size());
            Context contextA = e88.a();
            if (!list.isEmpty()) {
                lyc.INSTANCE.o(contextA);
                this.i.db(this.j);
                NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.uyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationModule.a.b();
                    }
                });
            } else {
                this.i.m7(this.j);
                lyc.Companion companion = lyc.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(contextA, "context");
                companion.p(contextA);
                NotificationModule.INSTANCE.u().J(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¨\u0006\u000e"}, d2 = {"com/heytap/health/watch/notification/impl/module/NotificationModule$b", "Lcom/oplus/aiunit/vision/mm4$b;", "Lcom/oplus/aiunit/vision/mb5$c;", "role", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "Lcom/oplus/aiunit/vision/svc;", "nodeStatus", "", "onNodeStatusChanged", "Landroid/util/ArraySet;", "interests", "Lcom/oplus/aiunit/vision/mb5;", "getInterestingStatus", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements mm4.b {
        public static final void b(svc svcVar, Node node) {
            Intrinsics.checkNotNullParameter(svcVar, "$nodeStatus");
            Intrinsics.checkNotNullParameter(node, "$node");
            m8b.f("NTF_Module", "onNodeStatusChanged: " + svcVar);
            NotificationModule notificationModule = NotificationModule.INSTANCE;
            notificationModule.F();
            if (svcVar != svc.a.INSTANCE) {
                if (svcVar != svc.f.INSTANCE) {
                    if (svcVar == svc.k.INSTANCE) {
                        NotificationHolder.INSTANCE.a();
                        c0d.INSTANCE.a();
                        return;
                    }
                    return;
                }
                NotificationHolder.INSTANCE.a();
                c0d.INSTANCE.a();
                yxc.INSTANCE.N(0);
                notificationModule.n(false, node);
                notificationModule.L();
                notificationModule.I(System.currentTimeMillis());
                notificationModule.u().G();
                return;
            }
            yxc yxcVar = yxc.INSTANCE;
            yxcVar.M(node);
            NotificationTransceiverManager.INSTANCE.b(node);
            NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
            String nodeId = node.getNodeId();
            Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
            notificationHolder.m(nodeId);
            com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.s();
            yxcVar.K();
            WatchPushManager.INSTANCE.d();
            notificationModule.H();
            notificationModule.n(true, node);
            notificationModule.K();
            qbm.INSTANCE.j();
            notificationModule.u().J(node.getNodeId());
        }

        @NotNull
        public mb5 getInterestingStatus(@NotNull ArraySet<svc> interests) {
            Intrinsics.checkNotNullParameter(interests, "interests");
            interests.add(svc.a.INSTANCE);
            interests.add(svc.f.INSTANCE);
            interests.add(svc.k.INSTANCE);
            return mb5.a.INSTANCE;
        }

        public void onNodeStatusChanged(@NotNull mb5.c role, @NotNull final Node node, @NotNull final svc nodeStatus) {
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
            NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.vyc
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationModule.b.b(nodeStatus, node);
                }
            });
        }
    }

    static {
        ezc ezcVar = ezc.INSTANCE;
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        mPhoneScreenStatus = ezcVar.c(contextA) ? 1 : 0;
        mVerifyCodeManager = LazyKt.lazy(new Function0<VerifyCodeManager>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mVerifyCodeManager$2
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final VerifyCodeManager m63invoke() {
                return new VerifyCodeManager();
            }
        });
        mSatelliteSmsManager = LazyKt.lazy(new Function0<SatelliteSmsManager>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mSatelliteSmsManager$2
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SatelliteSmsManager m62invoke() {
                return new SatelliteSmsManager();
            }
        });
        mFluidManager = LazyKt.lazy(new Function0<FluidManager>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mFluidManager$2
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FluidManager m61invoke() {
                return new FluidManager();
            }
        });
        mFluidStatus = new AtomicBoolean(false);
        fluidCloudRefreshTimeMap = new LinkedHashMap();
    }

    @JvmStatic
    public static final void B() {
        INSTANCE.t().execute(new Runnable() { // from class: com.oplus.aiunit.vision.qyc
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                NotificationModule.C();
            }
        });
    }

    public static final void C() throws Throwable {
        mThreadId = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.u();
        QuickReplySyncHelper.INSTANCE.f();
        el5 el5Var = wl4.deviceMultiple;
        jm4 jm4Var = el5Var.b;
        mb5.a aVar = mb5.a.INSTANCE;
        jm4Var.m(aVar, 2, "/ntf/TransceiverManager");
        el5Var.b.i(aVar, 2, "/ntf/TransceiverManager");
        pt8.INSTANCE.k(yxc.INSTANCE);
        qbm.INSTANCE.g();
        NotificationModule notificationModule = INSTANCE;
        notificationModule.v().d();
        yml ymlVar = new yml() { // from class: com.oplus.aiunit.vision.ryc
            public final void a(String str, int i) {
                NotificationModule.D(str, i);
            }
        };
        Object objNavigation = e1.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService");
        wl4.managerApi.h(new a((IDeviceWearStatusService) objNavigation, ymlVar));
        el5Var.a.e(new b());
        notificationModule.l();
        notificationModule.k();
        m8b.f("NTF_Module", "initInTransport: cost=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    public static final void D(String str, int i) {
        if (Intrinsics.areEqual(wl4.managerApi.q(mb5.a.INSTANCE), str)) {
            m8b.f("NTF_Module", "onWearingStatusChanged:" + veb.a(str) + "=" + i);
            wearStatus = i;
        }
    }

    public static final void r(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        INSTANCE.p(runnable);
    }

    public final void A() {
        if (mFluidStatus.get()) {
            return;
        }
        if (!u().B()) {
            c72.INSTANCE.a();
            com.heytap.health.watch.notification.impl.flashback.a.INSTANCE.h();
        } else {
            c72.INSTANCE.b();
            com.heytap.health.watch.notification.impl.flashback.a.INSTANCE.n();
            mFluidStatus.set(true);
        }
    }

    public final boolean E() {
        return mVerifyCodeEnable;
    }

    public final void F() {
        String strQ = wl4.managerApi.q(mb5.a.INSTANCE);
        if (strQ.length() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, Long> map = fluidCloudRefreshTimeMap;
            Long l = map.get(strQ);
            if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) >= 7200000) {
                map.put(strQ, Long.valueOf(jCurrentTimeMillis));
                FluidConfigCenter.L(FluidConfigCenter.INSTANCE, false, 1, null);
            }
        }
    }

    public final void G() {
        Job job = userPresentDebounceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        userPresentDebounceJob = BuildersKt.launch$default(y(), (CoroutineContext) null, (CoroutineStart) null, new NotificationModule$sendPresentDebounced$1(null), 3, (Object) null);
    }

    public final void H() {
        int iU = yxc.INSTANCE.u();
        boolean z = true;
        if (iU == 1 ? com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.k("screen_on_push") : iU != 2) {
            z = false;
        }
        int iX = x();
        m8b.f("NTF_Module", "sendScreenStatus: " + iU + " " + iX + " " + z);
        if (z) {
            wl4.deviceMultiple.b.k(wl4.managerApi.n(), new MessageEvent(2, NTFCmdId.CID_NTF_SYNC_PHONE_SCREEN_VALUE, ((ScreenStatus) ScreenStatus.newBuilder().setStatus(iX).build()).toByteArray()));
        }
    }

    public final void I(long j) {
        lastDisConnectSnap = j;
    }

    public final void J(@NotNull String nodeId, int open) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        ixc ixcVarE = NotificationRoom.INSTANCE.a().e();
        String strD = kdb.d(nodeId);
        Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(nodeId)");
        m8b.f("NTF_Module", "updateDeviceStatus: " + open);
        boolean z = open == 1;
        NotificationCloudStatusBean notificationCloudStatusBeanQuery = ixcVarE.query(strD);
        if (notificationCloudStatusBeanQuery == null) {
            ixcVarE.a(new NotificationCloudStatusBean(strD, false, z, null, 10, null));
        } else {
            notificationCloudStatusBeanQuery.setSetPassword(z);
            ixcVarE.b(notificationCloudStatusBeanQuery);
        }
    }

    public final void K() {
        boolean zI = w().i();
        mVerifyCodeEnable = zI;
        if (!zI) {
            w().m();
        } else {
            w().l();
            w().k();
        }
    }

    public final void L() {
        if (mVerifyCodeEnable) {
            w().g();
        }
        w().m();
    }

    public final void k() {
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        vgf.b(contextA, new BroadcastReceiver() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$addCarLinkResultBroadcastReceiver$receiver$1

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements b24 {
                public final /* synthetic */ Intent i;

                public a(Intent intent) {
                    this.i = intent;
                }

                public final void a(boolean z) {
                    Bundle extras = this.i.getExtras();
                    if (extras != null) {
                        m8b.f("NTF_Module", "onReceive: extras data");
                        int i = extras.getInt("notify_id");
                        Bitmap bitmap = (Bitmap) BundleCompat.getParcelable(extras, acl.KEY_ICON, Bitmap.class);
                        String string = extras.getString("title", "");
                        String string2 = extras.getString("content", "");
                        StringBuilder sb = new StringBuilder();
                        sb.append("onReceive: ");
                        sb.append(i);
                        sb.append(", ");
                        sb.append(string);
                        sb.append(", ");
                        sb.append(string2);
                        sb.append(", ");
                        sb.append(bitmap);
                        NotificationCompat.Builder contentText = new NotificationCompat.Builder(e88.a()).setLargeIcon(bitmap).setContentTitle(string).setContentText(string2);
                        Intrinsics.checkNotNullExpressionValue(contentText, "Builder(GlobalApplicatio… .setContentText(content)");
                        Notification notificationBuild = contentText.build();
                        Intrinsics.checkNotNullExpressionValue(notificationBuild, "notificationBuilder.build()");
                        StatusBarNotification statusBarNotification = new StatusBarNotification("com.heytap.health.push", "com.heytap.health.push", i, "push_tag", Process.myUid(), 0, 0, notificationBuild, Process.myUserHandle(), System.currentTimeMillis());
                        HealthNotificationBean healthNotificationBeanC = HealthNotificationBean.Companion.c(HealthNotificationBean.INSTANCE, statusBarNotification, null, 2, null);
                        String string3 = statusBarNotification.getNotification().extras.getString("push_mock_app_name");
                        if (string3 == null || string3.length() == 0) {
                            string3 = "健康";
                        }
                        healthNotificationBeanC.setAppName(string3);
                        pt8.INSTANCE.g(healthNotificationBeanC, null);
                    }
                }

                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    a(((Boolean) obj).booleanValue());
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            public static final class b<T> implements b24 {
                public static final b<T> INSTANCE = new b<>();

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "it");
                    m8b.b("NTF_Module", "addCarLinkResultBroadcastReceiver");
                }
            }

            @Override // android.content.BroadcastReceiver
            @SuppressLint({"CheckResult"})
            public void onReceive(@Nullable Context context, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                m8b.f("NTF_Module", "onReceive: CarLinkResultBroadcast");
                ddd.h0(Boolean.TRUE).K0(wv8.c()).n0(wv8.c()).b(new a(intent), b.INSTANCE);
            }
        }, new IntentFilter("com.heytap.health.CAR_LINK_RESULT"), "com.oplus.permission.safe.CAR_LINK", (Handler) null, 2);
    }

    public final void l() {
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$addScreenOnBroadcastReceiver$receiver$1

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "b", "(Z)V"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements b24 {
                public final /* synthetic */ Intent i;

                public a(Intent intent) {
                    this.i = intent;
                }

                public static final void c() {
                    com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.v();
                }

                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    b(((Boolean) obj).booleanValue());
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                public final void b(boolean z) {
                    String action = this.i.getAction();
                    if (action != null) {
                        switch (action.hashCode()) {
                            case -2128145023:
                                if (action.equals("android.intent.action.SCREEN_OFF")) {
                                    m8b.f("NTF_Module", "onReceive: SCREEN_OFF");
                                    NotificationModule.mPhoneScreenStatus = 0;
                                    NotificationModule.INSTANCE.H();
                                    break;
                                }
                                break;
                            case -1454123155:
                                if (action.equals("android.intent.action.SCREEN_ON")) {
                                    m8b.f("NTF_Module", "onReceive: SCREEN_ON");
                                    NotificationModule.mPhoneScreenStatus = 1;
                                    NotificationModule.INSTANCE.H();
                                }
                                break;
                            case -19011148:
                                if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                                    m8b.f("NTF_Module", "onReceive: LOCALE_CHANGED");
                                    NotificationModule.INSTANCE.q(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: INVOKE 
                                          (wrap com.heytap.health.watch.notification.impl.module.NotificationModule:0x0034: SGET  A[WRAPPED] com.heytap.health.watch.notification.impl.module.NotificationModule.INSTANCE com.heytap.health.watch.notification.impl.module.NotificationModule)
                                          (wrap java.lang.Runnable:0x0038: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: com.oplus.aiunit.vision.tyc.<init>():void type: CONSTRUCTOR)
                                         VIRTUAL call: com.heytap.health.watch.notification.impl.module.NotificationModule.q(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] in method: com.heytap.health.watch.notification.impl.module.NotificationModule$addScreenOnBroadcastReceiver$receiver$1.a.b(boolean):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes19.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.tyc, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 35 more
                                        */
                                    /*
                                        this = this;
                                        android.content.Intent r1 = r1.i
                                        java.lang.String r1 = r1.getAction()
                                        if (r1 == 0) goto L6d
                                        int r2 = r1.hashCode()
                                        java.lang.String r0 = "NTF_Module"
                                        switch(r2) {
                                            case -2128145023: goto L56;
                                            case -1454123155: goto L3f;
                                            case -19011148: goto L26;
                                            case 823795052: goto L12;
                                            default: goto L11;
                                        }
                                    L11:
                                        goto L6d
                                    L12:
                                        java.lang.String r2 = "android.intent.action.USER_PRESENT"
                                        boolean r1 = r1.equals(r2)
                                        if (r1 != 0) goto L1b
                                        goto L6d
                                    L1b:
                                        java.lang.String r1 = "onReceive: ACTION_USER_PRESENT"
                                        com.oplus.aiunit.vision.m8b.f(r0, r1)
                                        com.heytap.health.watch.notification.impl.module.NotificationModule r1 = com.heytap.health.watch.notification.impl.module.NotificationModule.INSTANCE
                                        com.heytap.health.watch.notification.impl.module.NotificationModule.g(r1)
                                        goto L6d
                                    L26:
                                        java.lang.String r2 = "android.intent.action.LOCALE_CHANGED"
                                        boolean r1 = r1.equals(r2)
                                        if (r1 != 0) goto L2f
                                        goto L6d
                                    L2f:
                                        java.lang.String r1 = "onReceive: LOCALE_CHANGED"
                                        com.oplus.aiunit.vision.m8b.f(r0, r1)
                                        com.heytap.health.watch.notification.impl.module.NotificationModule r1 = com.heytap.health.watch.notification.impl.module.NotificationModule.INSTANCE
                                        com.oplus.aiunit.vision.tyc r2 = new com.oplus.aiunit.vision.tyc
                                        r2.<init>()
                                        r1.q(r2)
                                        goto L6d
                                    L3f:
                                        java.lang.String r2 = "android.intent.action.SCREEN_ON"
                                        boolean r1 = r1.equals(r2)
                                        if (r1 == 0) goto L6d
                                        java.lang.String r1 = "onReceive: SCREEN_ON"
                                        com.oplus.aiunit.vision.m8b.f(r0, r1)
                                        r1 = 1
                                        com.heytap.health.watch.notification.impl.module.NotificationModule.h(r1)
                                        com.heytap.health.watch.notification.impl.module.NotificationModule r1 = com.heytap.health.watch.notification.impl.module.NotificationModule.INSTANCE
                                        r1.H()
                                        goto L6d
                                    L56:
                                        java.lang.String r2 = "android.intent.action.SCREEN_OFF"
                                        boolean r1 = r1.equals(r2)
                                        if (r1 != 0) goto L5f
                                        goto L6d
                                    L5f:
                                        java.lang.String r1 = "onReceive: SCREEN_OFF"
                                        com.oplus.aiunit.vision.m8b.f(r0, r1)
                                        r1 = 0
                                        com.heytap.health.watch.notification.impl.module.NotificationModule.h(r1)
                                        com.heytap.health.watch.notification.impl.module.NotificationModule r1 = com.heytap.health.watch.notification.impl.module.NotificationModule.INSTANCE
                                        r1.H()
                                    L6d:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.watch.notification.impl.module.NotificationModule$addScreenOnBroadcastReceiver$receiver$1.a.b(boolean):void");
                                }
                            }

                            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
                            public static final class b<T> implements b24 {
                                public static final b<T> INSTANCE = new b<>();

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final void accept(@NotNull Throwable th) {
                                    Intrinsics.checkNotNullParameter(th, "it");
                                    m8b.b("NTF_Module", "onReceive: SCREEN EVENT");
                                }
                            }

                            @Override // android.content.BroadcastReceiver
                            @SuppressLint({"CheckResult"})
                            public void onReceive(@Nullable Context context, @NotNull Intent intent) {
                                Intrinsics.checkNotNullParameter(intent, "intent");
                                ddd.h0(Boolean.TRUE).K0(wv8.c()).n0(wv8.c()).b(new a(intent), b.INSTANCE);
                            }
                        };
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
                        vgf.a(contextA, broadcastReceiver, intentFilter, 2);
                    }

                    public final void m(@NotNull StatusBarNotification sbn) {
                        Intrinsics.checkNotNullParameter(sbn, "sbn");
                        w().e(sbn);
                    }

                    public final void n(boolean linkage, Node node) {
                        if (linkage) {
                            com.heytap.health.watch.notification.a.INSTANCE.a();
                            CloudPushManager.INSTANCE.l();
                            return;
                        }
                        if (com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.k("cloud_msg") && exc.a(node.getNodeId()).t2()) {
                            ixc ixcVarE = NotificationRoom.INSTANCE.a().e();
                            String strD = kdb.d(node.getNodeId());
                            Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(node.nodeId)");
                            NotificationCloudStatusBean notificationCloudStatusBeanQuery = ixcVarE.query(strD);
                            if (notificationCloudStatusBeanQuery == null || notificationCloudStatusBeanQuery.getSetPassword()) {
                                return;
                            }
                            com.heytap.health.watch.notification.a.INSTANCE.c();
                        }
                    }

                    public final void o(@Nullable NotificationRemoved dismiss) {
                        if (dismiss != null) {
                            INSTANCE.u().t(dismiss.getIntId());
                        }
                    }

                    public final void p(Runnable runnable) {
                        try {
                            runnable.run();
                        } catch (Exception e) {
                            m8b.b("NTF_Module", "execute: " + e.getMessage());
                        }
                    }

                    public final void q(@NotNull final Runnable runnable) {
                        Intrinsics.checkNotNullParameter(runnable, "runnable");
                        if (mThreadId == Thread.currentThread().getId()) {
                            p(runnable);
                        } else {
                            t().execute(new Runnable() { // from class: com.oplus.aiunit.vision.syc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    NotificationModule.r(runnable);
                                }
                            });
                        }
                    }

                    public final long s() {
                        return lastDisConnectSnap;
                    }

                    public final ExecutorService t() {
                        Object value = mExecutor.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "<get-mExecutor>(...)");
                        return (ExecutorService) value;
                    }

                    @NotNull
                    public final FluidManager u() {
                        return (FluidManager) mFluidManager.getValue();
                    }

                    public final SatelliteSmsManager v() {
                        return (SatelliteSmsManager) mSatelliteSmsManager.getValue();
                    }

                    public final VerifyCodeManager w() {
                        return (VerifyCodeManager) mVerifyCodeManager.getValue();
                    }

                    public final int x() {
                        Context contextA = e88.a();
                        if (mPhoneScreenStatus == 1) {
                            ezc ezcVar = ezc.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(contextA, "context");
                            if (!ezcVar.a(contextA)) {
                                return 1;
                            }
                        }
                        return 0;
                    }

                    public final CoroutineScope y() {
                        return (CoroutineScope) userPresentScope.getValue();
                    }

                    public final int z() {
                        return wearStatus;
                    }
                }
