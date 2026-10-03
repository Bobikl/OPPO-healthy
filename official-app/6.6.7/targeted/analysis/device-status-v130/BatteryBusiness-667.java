package com.heytap.health.devicemanagerimpl.host.business;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.RemoteException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.devicemanagerimpl.host.HDMManager;
import com.heytap.health.devicemanagerimpl.host.business.BatteryBusiness;
import com.heytap.health.protocol.dm.DMProto;
import com.heytap.health.vision.deviceability.DeviceModel;
import com.heytap.health.vision.manager.IDMMainProcessManager;
import com.heytap.health.vision.manager.IDeviceManager;
import com.heytap.health.vision.processor.bean.UserDeviceInfo;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.as3;
import com.oplus.aiunit.model.cm4;
import com.oplus.aiunit.model.em4;
import com.oplus.aiunit.model.gd5;
import com.oplus.aiunit.model.jm4;
import com.oplus.aiunit.model.mb5;
import com.oplus.aiunit.model.mzb;
import com.oplus.aiunit.model.nzb;
import com.oplus.aiunit.model.sl4;
import com.oplus.aiunit.model.wl4;
import com.oplus.aiunit.model.yc1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.jt;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.rze;
import com.oplus.aiunit.vision.veb;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%¨\u0006)"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/host/business/BatteryBusiness;", "Lcom/heytap/health/devicemanagerimpl/host/business/BaseBusiness;", "Landroid/content/Context;", "context", "Lcom/heytap/health/devicemanager/manager/IDeviceManager;", "manager", "m", "Lcom/oplus/aiunit/vision/mb5;", "g", BuildConfig.VERSION_NAME, "t", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "n", "p", "r", BuildConfig.VERSION_NAME, "mac", "C", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "s", "E", "H", "I", "B", "z", "D", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "userDeviceInfo", "J", "Lcom/oplus/aiunit/vision/jt;", "Lkotlin/Lazy;", "A", "()Lcom/oplus/aiunit/vision/jt;", "mAlarmScheduler", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "pendingStopJob", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"StaticFieldLeak"})
public final class BatteryBusiness extends BaseBusiness {

    @NotNull
    public static final BatteryBusiness INSTANCE = new BatteryBusiness();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mAlarmScheduler = LazyKt.lazy(new Function0<jt>() { // from class: com.heytap.health.devicemanagerimpl.host.business.BatteryBusiness$mAlarmScheduler$2
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final jt m145invoke() {
            return new jt(e88.a(), BatteryBusiness.INSTANCE.getTAG(), 600000L);
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public static Job pendingStopJob;

    public BatteryBusiness() {
        super("Battery");
    }

    public static final void F() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.xc1
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                BatteryBusiness.G();
            }
        });
    }

    public static final void G() throws RemoteException {
        INSTANCE.B();
    }

    public final jt A() {
        return (jt) mAlarmScheduler.getValue();
    }

    public final void B() throws RemoteException {
        em4 em4Var = wl4.managerApi;
        String currentConnectId = em4Var.getCurrentConnectId();
        boolean z = false;
        if (currentConnectId == null || currentConnectId.length() == 0) {
            Node node = (Node) CollectionsKt.firstOrNull(em4Var.getConnectedNodes());
            currentConnectId = node != null ? node.getNodeId() : null;
        }
        if (currentConnectId == null || currentConnectId.length() == 0) {
            if (em4Var.isCurrentConnected()) {
                cm4.c(getTAG(), "queryBatteryIfNeeded mac is null");
                return;
            } else {
                D();
                return;
            }
        }
        UserDeviceInfo boundDeviceInfoByMac = k().getBoundDeviceInfoByMac(currentConnectId);
        if (boundDeviceInfoByMac == null) {
            cm4.c(INSTANCE.getTAG(), "queryBatteryIfNeeded not find " + veb.a(currentConnectId));
            return;
        }
        as3 as3VarD = gd5.d(boundDeviceInfoByMac.getModel());
        if (((Boolean) as3VarD.a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.host.business.BatteryBusiness$queryBatteryIfNeeded$1$supportAutoUpdateBattery$1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "$this$applyMode");
                return Boolean.valueOf(deviceModel.va());
            }
        })).booleanValue()) {
            return;
        }
        if (!((Boolean) as3VarD.a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.host.business.BatteryBusiness$queryBatteryIfNeeded$1$1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "$this$applyMode");
                return Boolean.valueOf(deviceModel.k0());
            }
        })).booleanValue()) {
            INSTANCE.C(currentConnectId);
            return;
        }
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        if (rze.q(contextA)) {
            IDMMainProcessManager iDMMainProcessManager = (IDMMainProcessManager) ClientManager.getInstance().getBuildService("dm_main_process", true, new yc1());
            if (iDMMainProcessManager != null && !iDMMainProcessManager.isInForeground()) {
                z = true;
            }
            if (!z) {
                INSTANCE.C(currentConnectId);
                return;
            }
        }
        INSTANCE.J(boundDeviceInfoByMac);
    }

    public final void C(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        MessageEvent messageEventQ = mzb.q(mac);
        jm4 jm4Var = wl4.deviceMultiple.messageApi;
        mb5.a aVar = mb5.a.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(messageEventQ, "messageEvent");
        jm4Var.k(aVar, messageEventQ);
    }

    public final void D() {
        Job job = pendingStopJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        pendingStopJob = BuildersKt.launch$default(sl4.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new BatteryBusiness$scheduleStopIfNoDeviceConnected$1(null), 3, (Object) null);
    }

    public final void E() {
        A().j(new Runnable() { // from class: com.oplus.aiunit.vision.wc1
            @Override // java.lang.Runnable
            public final void run() {
                BatteryBusiness.F();
            }
        });
    }

    public final void H() {
        if (A().h()) {
            return;
        }
        A().l();
    }

    public final void I() {
        if (A().h()) {
            A().m();
        }
    }

    public final void J(UserDeviceInfo userDeviceInfo) {
        BuildersKt.launch$default(sl4.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new BatteryBusiness$updateIWatchBattery$1(userDeviceInfo, null), 3, (Object) null);
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    @NotNull
    public mb5 g() {
        return mb5.a.INSTANCE;
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    @NotNull
    public BaseBusiness m(@NotNull Context context, @NotNull IDeviceManager manager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        BaseBusiness baseBusinessM = super.m(context, manager);
        INSTANCE.E();
        return baseBusinessM;
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    public void n(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        super.n(node);
        m8b.f(getTAG(), "onDeviceBondConnected");
        z();
        String nodeId = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
        C(nodeId);
        H();
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    public void p(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        super.p(node);
        D();
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    public void r(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        super.r(node);
        D();
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    public void s(@NotNull String mac, @NotNull MessageEvent event) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        super.s(mac, event);
        if (nzb.c(event)) {
            try {
                DMProto.BatteryInfo from = DMProto.BatteryInfo.parseFrom(event.getData());
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(event.data)");
                cm4.d(getTAG(), "batteryInfo:" + from.getBatteryPercent() + ",mac:" + veb.a(mac) + ",isCharging:" + from.getIsCharging());
                UserDeviceInfo boundDeviceInfoByMac = k().getBoundDeviceInfoByMac(mac);
                if (boundDeviceInfoByMac == null) {
                    cm4.c(INSTANCE.getTAG(), "update battery not find " + from.getDeviceMac());
                    return;
                }
                if (boundDeviceInfoByMac.getCapacityPercent() == from.getBatteryPercent() && boundDeviceInfoByMac.getChargeStatus() == from.getIsCharging()) {
                    return;
                }
                boundDeviceInfoByMac.setCapacityPercent(from.getBatteryPercent());
                boundDeviceInfoByMac.setChargeStatus(from.getIsCharging());
                IDeviceManager iDeviceManagerK = INSTANCE.k();
                HDMManager hDMManager = iDeviceManagerK instanceof HDMManager ? (HDMManager) iDeviceManagerK : null;
                if (hDMManager != null) {
                    hDMManager.notifyBatteryListener$device_manager_impl_release(boundDeviceInfoByMac);
                }
            } catch (InvalidProtocolBufferException e) {
                cm4.c(getTAG(), "parse battery error " + e.getMessage());
            }
        }
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    public void t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.t(context);
        z();
        I();
    }

    public final void z() {
        Job job = pendingStopJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        pendingStopJob = null;
    }
}
