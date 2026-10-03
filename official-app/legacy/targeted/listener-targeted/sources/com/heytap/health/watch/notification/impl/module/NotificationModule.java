package com.heytap.health.watch.notification.impl.module;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.service.notification.StatusBarNotification;
import android.util.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.NotificationCloudStatusBean;
import com.heytap.health.watch.notification.NotificationRemoved;
import com.heytap.health.watch.notification.ScreenStatus;
import com.heytap.health.watch.notification.impl.cloud.CloudPushManager;
import com.heytap.health.watch.notification.impl.fluid.FluidConfigCenter;
import com.heytap.health.watch.notification.impl.fluid.FluidManager;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watch.notification.impl.push.WatchPushManager;
import com.heytap.health.watch.notification.impl.sms.SatelliteSmsManager;
import com.heytap.health.watch.notification.impl.sms.VerifyCodeManager;
import com.heytap.health.watch.notification.impl.transceiver.NotificationTransceiverManager;
import com.heytap.health.watch.notification.impl.whitelist.NotificationRoom;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ajl;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.gwc;
import com.oplus.aiunit.vision.ik5;
import com.oplus.aiunit.vision.kyc;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.ls8;
import com.oplus.aiunit.vision.mvc;
import com.oplus.aiunit.vision.mxc;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.o62;
import com.oplus.aiunit.vision.qvc;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.s7m;
import com.oplus.aiunit.vision.sjk;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.tl4;
import com.oplus.aiunit.vision.twc;
import com.oplus.aiunit.vision.vbb;
import com.oplus.aiunit.vision.vi5;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.zq8;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\rJ\u0010\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fR\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u001aR\"\u0010I\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010N\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001a\u001a\u0004\bK\u0010L\"\u0004\b2\u0010MR\u001b\u0010R\u001a\u00020O8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010TR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020A0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010W¨\u0006["}, d2 = {"Lcom/heytap/health/watch/notification/impl/module/NotificationModule;", "", "Ljava/lang/Runnable;", "runnable", "", LogFieldKey.PROCESS_NAME_KEY, c8l.KEY_B, LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "A", UserInfo.SEX_FEMALE, "L", "K", "", "linkage", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "n", "G", "", "x", "q", "H", "", "nodeId", "open", "J", "Landroid/service/notification/StatusBarNotification;", "sbn", LogFieldKey.MESSAGE_KEY, ExifInterface.LONGITUDE_EAST, "Lcom/heytap/health/watch/notification/NotificationRemoved;", "dismiss", "o", "Ljava/util/concurrent/ExecutorService;", "a", "Lkotlin/Lazy;", "t", "()Ljava/util/concurrent/ExecutorService;", "mExecutor", "Lkotlinx/coroutines/CoroutineScope;", "b", "y", "()Lkotlinx/coroutines/CoroutineScope;", "userPresentScope", "Lkotlinx/coroutines/Job;", "c", "Lkotlinx/coroutines/Job;", "userPresentDebounceJob", "d", "I", "mPhoneScreenStatus", MapSchema.FIELD_NAME_ENTRY, "Z", "mVerifyCodeEnable", "Lcom/heytap/health/watch/notification/impl/sms/VerifyCodeManager;", "f", "w", "()Lcom/heytap/health/watch/notification/impl/sms/VerifyCodeManager;", "mVerifyCodeManager", "Lcom/heytap/health/watch/notification/impl/sms/SatelliteSmsManager;", b2n.f, "v", "()Lcom/heytap/health/watch/notification/impl/sms/SatelliteSmsManager;", "mSatelliteSmsManager", "", b2n.g, "mThreadId", "i", "z", "()I", "setWearStatus", "(I)V", "wearStatus", "j", "s", "()J", "(J)V", "lastDisConnectSnap", "Lcom/heytap/health/watch/notification/impl/fluid/FluidManager;", "u", "()Lcom/heytap/health/watch/notification/impl/fluid/FluidManager;", "mFluidManager", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mFluidStatus", "", "Ljava/util/Map;", "fluidCloudRefreshTimeMap", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class NotificationModule {

    @NotNull
    public static final NotificationModule INSTANCE = new NotificationModule();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mExecutor = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorService>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mExecutor$2
        @Override // p010kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return zq8.d("NTF_Module");
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy userPresentScope = LazyKt__LazyJVMKt.lazy(new Function0<CoroutineScope>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$userPresentScope$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b("NTF_Module").plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile Job userPresentDebounceJob;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static int mPhoneScreenStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
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

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static long lastDisConnectSnap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mFluidManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static AtomicBoolean mFluidStatus;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Long> fluidCloudRefreshTimeMap;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/watch/notification/impl/module/NotificationModule$a", "Lcom/oplus/aiunit/vision/vi5;", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "list", "Lcom/oplus/aiunit/vision/sjk;", "updateType", "", "H2", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements vi5 {
        public final /* synthetic */ IDeviceWearStatusService i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ajl f6591j;

        public a(IDeviceWearStatusService iDeviceWearStatusService, ajl ajlVar) {
            this.i = iDeviceWearStatusService;
            this.f6591j = ajlVar;
        }

        public static final void b() {
            NotificationModule.INSTANCE.A();
        }

        @Override // com.oplus.aiunit.vision.vi5
        public void H2(@NotNull List<? extends UserDeviceInfo> list, @NotNull sjk updateType) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(updateType, "updateType");
            a7b.f("NTF_Module", "notifyUpdateDeviceInfo: " + list.size());
            Context context = b78.a();
            if (!list.isEmpty()) {
                twc.INSTANCE.o(context);
                this.i.bb(this.f6591j);
                NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.cxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationModule.a.b();
                    }
                });
            } else {
                this.i.l7(this.f6591j);
                twc.Companion companion = twc.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                companion.p(context);
                NotificationModule.INSTANCE.u().J(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¨\u0006\u000e"}, d2 = {"com/heytap/health/watch/notification/impl/module/NotificationModule$b", "Lcom/oplus/aiunit/vision/wl4$b;", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "Lcom/oplus/aiunit/vision/auc;", "nodeStatus", "", "onNodeStatusChanged", "Landroid/util/ArraySet;", "interests", "Lcom/oplus/aiunit/vision/ra5;", "getInterestingStatus", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements wl4.b {
        public static final void b(auc nodeStatus, Node node) {
            Intrinsics.checkNotNullParameter(nodeStatus, "$nodeStatus");
            Intrinsics.checkNotNullParameter(node, "$node");
            a7b.f("NTF_Module", "onNodeStatusChanged: " + nodeStatus);
            NotificationModule notificationModule = NotificationModule.INSTANCE;
            notificationModule.F();
            if (nodeStatus != auc.a.INSTANCE) {
                if (nodeStatus != auc.f.INSTANCE) {
                    if (nodeStatus == auc.k.INSTANCE) {
                        NotificationHolder.INSTANCE.a();
                        kyc.INSTANCE.a();
                        return;
                    }
                    return;
                }
                NotificationHolder.INSTANCE.a();
                kyc.INSTANCE.a();
                gwc.INSTANCE.N(0);
                notificationModule.n(false, node);
                notificationModule.L();
                notificationModule.I(System.currentTimeMillis());
                notificationModule.u().G();
                return;
            }
            gwc gwcVar = gwc.INSTANCE;
            gwcVar.M(node);
            NotificationTransceiverManager.INSTANCE.b(node);
            NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
            String nodeId = node.getNodeId();
            Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
            notificationHolder.m(nodeId);
            com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.s();
            gwcVar.K();
            WatchPushManager.INSTANCE.d();
            notificationModule.H();
            notificationModule.n(true, node);
            notificationModule.K();
            s7m.INSTANCE.j();
            notificationModule.u().J(node.getNodeId());
        }

        @Override // com.oplus.aiunit.vision.wl4.b
        @NotNull
        public ra5 getInterestingStatus(@NotNull ArraySet<auc> interests) {
            Intrinsics.checkNotNullParameter(interests, "interests");
            interests.add(auc.a.INSTANCE);
            interests.add(auc.f.INSTANCE);
            interests.add(auc.k.INSTANCE);
            return ra5.a.INSTANCE;
        }

        @Override // com.oplus.aiunit.vision.wl4.b
        public void onNodeStatusChanged(@NotNull ra5.c role, @NotNull final Node node, @NotNull final auc nodeStatus) {
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
            NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.dxc
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationModule.b.b(nodeStatus, node);
                }
            });
        }
    }

    static {
        mxc mxcVar = mxc.INSTANCE;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        mPhoneScreenStatus = mxcVar.c(contextA) ? 1 : 0;
        mVerifyCodeManager = LazyKt__LazyJVMKt.lazy(new Function0<VerifyCodeManager>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mVerifyCodeManager$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final VerifyCodeManager invoke() {
                return new VerifyCodeManager();
            }
        });
        mSatelliteSmsManager = LazyKt__LazyJVMKt.lazy(new Function0<SatelliteSmsManager>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mSatelliteSmsManager$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final SatelliteSmsManager invoke() {
                return new SatelliteSmsManager();
            }
        });
        mFluidManager = LazyKt__LazyJVMKt.lazy(new Function0<FluidManager>() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$mFluidManager$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final FluidManager invoke() {
                return new FluidManager();
            }
        });
        mFluidStatus = new AtomicBoolean(false);
        fluidCloudRefreshTimeMap = new LinkedHashMap();
    }

    @JvmStatic
    public static final void B() {
        INSTANCE.t().execute(new Runnable() { // from class: com.oplus.aiunit.vision.ywc
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
        ik5 ik5Var = gl4.deviceMultiple;
        tl4 tl4Var = ik5Var.messageApi;
        ra5.a aVar = ra5.a.INSTANCE;
        tl4Var.m(aVar, 2, "/ntf/TransceiverManager");
        ik5Var.messageApi.i(aVar, 2, "/ntf/TransceiverManager");
        ls8.INSTANCE.k(gwc.INSTANCE);
        s7m.INSTANCE.g();
        NotificationModule notificationModule = INSTANCE;
        notificationModule.v().d();
        ajl ajlVar = new ajl() { // from class: com.oplus.aiunit.vision.zwc
            @Override // com.oplus.aiunit.vision.ajl
            public final void a(String str, int i) {
                NotificationModule.D(str, i);
            }
        };
        Object objNavigation = x0.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService");
        gl4.managerApi.h(new a((IDeviceWearStatusService) objNavigation, ajlVar));
        ik5Var.nodeApi.e(new b());
        notificationModule.l();
        notificationModule.k();
        a7b.f("NTF_Module", "initInTransport: cost=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    public static final void D(String str, int i) {
        if (Intrinsics.areEqual(gl4.managerApi.q(ra5.a.INSTANCE), str)) {
            a7b.f("NTF_Module", "onWearingStatusChanged:" + gdb.a(str) + HttpUtils.EQUAL_SIGN + i);
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
            o62.INSTANCE.a();
            com.heytap.health.watch.notification.impl.flashback.a.INSTANCE.h();
        } else {
            o62.INSTANCE.b();
            com.heytap.health.watch.notification.impl.flashback.a.INSTANCE.n();
            mFluidStatus.set(true);
        }
    }

    public final boolean E() {
        return mVerifyCodeEnable;
    }

    public final void F() {
        String strQ = gl4.managerApi.q(ra5.a.INSTANCE);
        if (strQ.length() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, Long> map = fluidCloudRefreshTimeMap;
            Long l2 = map.get(strQ);
            if (jCurrentTimeMillis - (l2 != null ? l2.longValue() : 0L) >= 7200000) {
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
        userPresentDebounceJob = BuildersKt__Builders_commonKt.launch$default(y(), null, null, new NotificationModule$sendPresentDebounced$1(null), 3, null);
    }

    public final void H() {
        int iU = gwc.INSTANCE.u();
        boolean z = true;
        if (iU == 1 ? com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.k("screen_on_push") : iU != 2) {
            z = false;
        }
        int iX = x();
        a7b.f("NTF_Module", "sendScreenStatus: " + iU + " " + iX + " " + z);
        if (z) {
            gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 146, ScreenStatus.newBuilder().setStatus(iX).build().toByteArray()));
        }
    }

    public final void I(long j2) {
        lastDisConnectSnap = j2;
    }

    public final void J(@NotNull String nodeId, int open) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        qvc qvcVarE = NotificationRoom.INSTANCE.a().e();
        String strD = vbb.d(nodeId);
        Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(nodeId)");
        a7b.f("NTF_Module", "updateDeviceStatus: " + open);
        boolean z = open == 1;
        NotificationCloudStatusBean notificationCloudStatusBeanQuery = qvcVarE.query(strD);
        if (notificationCloudStatusBeanQuery == null) {
            qvcVarE.a(new NotificationCloudStatusBean(strD, false, z, null, 10, null));
        } else {
            notificationCloudStatusBeanQuery.setSetPassword(z);
            qvcVarE.b(notificationCloudStatusBeanQuery);
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
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        rdf.b(contextA, new BroadcastReceiver() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$addCarLinkResultBroadcastReceiver$receiver$1

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements o14 {
                public final /* synthetic */ Intent i;

                public a(Intent intent) {
                    this.i = intent;
                }

                public final void a(boolean z) {
                    Bundle extras = this.i.getExtras();
                    if (extras != null) {
                        a7b.f("NTF_Module", "onReceive: extras data");
                        int i = extras.getInt("notify_id");
                        Bitmap bitmap = (Bitmap) BundleCompat.getParcelable(extras, "icon", Bitmap.class);
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
                        NotificationCompat.Builder contentText = new NotificationCompat.Builder(b78.a()).setLargeIcon(bitmap).setContentTitle(string).setContentText(string2);
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
                        ls8.INSTANCE.g(healthNotificationBeanC, null);
                    }
                }

                @Override // com.oplus.aiunit.vision.o14
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    a(((Boolean) obj).booleanValue());
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            public static final class b<T> implements o14 {
                public static final b<T> INSTANCE = new b<>();

                @Override // com.oplus.aiunit.vision.o14
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    a7b.b("NTF_Module", "addCarLinkResultBroadcastReceiver");
                }
            }

            @Override // android.content.BroadcastReceiver
            @SuppressLint({"CheckResult"})
            public void onReceive(@Nullable Context context, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                a7b.f("NTF_Module", "onReceive: CarLinkResultBroadcast");
                lbd.h0(Boolean.TRUE).L0(su8.c()).n0(su8.c()).b(new a(intent), b.INSTANCE);
            }
        }, new IntentFilter("com.heytap.health.CAR_LINK_RESULT"), "com.oplus.permission.safe.CAR_LINK", null, 2);
    }

    public final void l() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.heytap.health.watch.notification.impl.module.NotificationModule$addScreenOnBroadcastReceiver$receiver$1

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "b", "(Z)V"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements o14 {
                public final /* synthetic */ Intent i;

                public a(Intent intent) {
                    this.i = intent;
                }

                public static final void c() {
                    com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.v();
                }

                @Override // com.oplus.aiunit.vision.o14
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
                                    a7b.f("NTF_Module", "onReceive: SCREEN_OFF");
                                    NotificationModule.mPhoneScreenStatus = 0;
                                    NotificationModule.INSTANCE.H();
                                    break;
                                }
                                break;
                            case -1454123155:
                                if (action.equals("android.intent.action.SCREEN_ON")) {
                                    a7b.f("NTF_Module", "onReceive: SCREEN_ON");
                                    NotificationModule.mPhoneScreenStatus = 1;
                                    NotificationModule.INSTANCE.H();
                                }
                                break;
                            case -19011148:
                                if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                                    a7b.f("NTF_Module", "onReceive: LOCALE_CHANGED");
                                    NotificationModule.INSTANCE.q(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: INVOKE 
                                          (wrap com.heytap.health.watch.notification.impl.module.NotificationModule:0x0034: SGET  A[WRAPPED] com.heytap.health.watch.notification.impl.module.NotificationModule.INSTANCE com.heytap.health.watch.notification.impl.module.NotificationModule)
                                          (wrap java.lang.Runnable:0x0038: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: com.oplus.aiunit.vision.bxc.<init>():void type: CONSTRUCTOR)
                                         VIRTUAL call: com.heytap.health.watch.notification.impl.module.NotificationModule.q(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] in method: com.heytap.health.watch.notification.impl.module.NotificationModule$addScreenOnBroadcastReceiver$receiver$1.a.b(boolean):void, file: classes19.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.bxc, state: NOT_LOADED
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
                                        com.oplus.aiunit.vision.a7b.f(r0, r1)
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
                                        com.oplus.aiunit.vision.a7b.f(r0, r1)
                                        com.heytap.health.watch.notification.impl.module.NotificationModule r1 = com.heytap.health.watch.notification.impl.module.NotificationModule.INSTANCE
                                        com.oplus.aiunit.vision.bxc r2 = new com.oplus.aiunit.vision.bxc
                                        r2.<init>()
                                        r1.q(r2)
                                        goto L6d
                                    L3f:
                                        java.lang.String r2 = "android.intent.action.SCREEN_ON"
                                        boolean r1 = r1.equals(r2)
                                        if (r1 == 0) goto L6d
                                        java.lang.String r1 = "onReceive: SCREEN_ON"
                                        com.oplus.aiunit.vision.a7b.f(r0, r1)
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
                                        com.oplus.aiunit.vision.a7b.f(r0, r1)
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
                            public static final class b<T> implements o14 {
                                public static final b<T> INSTANCE = new b<>();

                                @Override // com.oplus.aiunit.vision.o14
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final void accept(@NotNull Throwable it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    a7b.b("NTF_Module", "onReceive: SCREEN EVENT");
                                }
                            }

                            @Override // android.content.BroadcastReceiver
                            @SuppressLint({"CheckResult"})
                            public void onReceive(@Nullable Context context, @NotNull Intent intent) {
                                Intrinsics.checkNotNullParameter(intent, "intent");
                                lbd.h0(Boolean.TRUE).L0(su8.c()).n0(su8.c()).b(new a(intent), b.INSTANCE);
                            }
                        };
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
                        rdf.a(contextA, broadcastReceiver, intentFilter, 2);
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
                        if (com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.k("cloud_msg") && mvc.a(node.getNodeId()).s2()) {
                            qvc qvcVarE = NotificationRoom.INSTANCE.a().e();
                            String strD = vbb.d(node.getNodeId());
                            Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(node.nodeId)");
                            NotificationCloudStatusBean notificationCloudStatusBeanQuery = qvcVarE.query(strD);
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
                        } catch (Exception e2) {
                            a7b.b("NTF_Module", "execute: " + e2.getMessage());
                        }
                    }

                    public final void q(@NotNull final Runnable runnable) {
                        Intrinsics.checkNotNullParameter(runnable, "runnable");
                        if (mThreadId == Thread.currentThread().getId()) {
                            p(runnable);
                        } else {
                            t().execute(new Runnable() { // from class: com.oplus.aiunit.vision.axc
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
                        Context context = b78.a();
                        if (mPhoneScreenStatus == 1) {
                            mxc mxcVar = mxc.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            if (!mxcVar.a(context)) {
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
