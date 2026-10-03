package com.heytap.health.devicemanager.client.impl;

import android.content.DialogInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.accessory.utils.XmlReader;
import com.heytap.health.base.R$string;
import com.heytap.health.base.permission.WifiPermissionChecker;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.connect.rawapi.IResult;
import com.heytap.health.devicemanager.client.impl.DMManagerImpl;
import com.heytap.health.devicemanager.client.params.ConnectParams;
import com.heytap.health.devicemanager.client.params.DMPairParams;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.mc5;
import com.oplus.aiunit.vision.oe2;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.sj5;
import com.oplus.aiunit.vision.sjk;
import com.oplus.aiunit.vision.ta5;
import com.oplus.aiunit.vision.u89;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.vi5;
import com.oplus.aiunit.vision.vk4;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.xq8;
import com.oplus.aiunit.vision.zj5;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\be\u0010fJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tH\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0096\u0001J\u001b\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001J\u0013\u0010\u0014\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0096\u0001J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\rH\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0097\u0001J\t\u0010\u001c\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tH\u0096\u0001J\u0011\u0010 \u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0096\u0001J!\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0096\u0001J'\u0010&\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\"\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0096\u0001J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020*H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010(\u001a\u00020*H\u0016J&\u0010/\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\r2\b\u0010.\u001a\u0004\u0018\u00010\rH\u0016J$\u00100\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010.\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020\rH\u0016J \u00102\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\rH\u0016J\u0010\u00103\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\rH\u0016J\u0018\u00106\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\r2\u0006\u00105\u001a\u00020\u0012H\u0016J\u0018\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\rH\u0016J\u0018\u0010:\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\r2\u0006\u00109\u001a\u00020\u0012H\u0016J\u0018\u0010;\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0016J\b\u0010<\u001a\u00020\rH\u0016J\n\u0010=\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010@\u001a\u0004\u0018\u00010\u00102\u0006\u0010?\u001a\u00020>H\u0016J\u0010\u0010A\u001a\u00020\r2\u0006\u0010?\u001a\u00020>H\u0016J\b\u0010C\u001a\u00020BH\u0016J\u0012\u0010D\u001a\u00020B2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J \u0010F\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\rH\u0016J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010H\u001a\u00020\rH\u0016J\u0012\u0010I\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010J\u001a\u00020\u0012H\u0016J\b\u0010K\u001a\u00020\u0012H\u0016J\b\u0010L\u001a\u00020\u0012H\u0016J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0016J\n\u0010N\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010O\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u0016H\u0016J\u0014\u0010R\u001a\u0004\u0018\u00010P2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J \u0010V\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\r2\u0006\u0010S\u001a\u00020P2\u0006\u0010U\u001a\u00020TH\u0016J4\u0010^\u001a\u00020\u00052\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010Z\u001a\u00020Y2\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010]\u001a\u00020\u0012H\u0016J\u0010\u0010_\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\rH\u0016J\b\u0010`\u001a\u00020\u0012H\u0016R\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/DMManagerImpl;", "Lcom/oplus/aiunit/vision/ol4;", "Lcom/oplus/aiunit/vision/vk4;", "Lcom/oplus/aiunit/vision/ta5;", "listener", "", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/mc5;", "r", "Lcom/oplus/aiunit/vision/vi5;", b2n.g, "Lcom/oplus/aiunit/vision/sj5;", "u", "", "mac", "Lcom/heytap/health/base/utils/AsyncResult;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", LogFieldKey.MESSAGE_KEY, "", "w", "deleteDeviceByMac", "getBoundDeviceInfoByMac", "", "getBoundDeviceInfos", "deviceId", c8l.KEY_B, "", "getRunMode", "isSupportDynamicRegisterAgent", "o", "C", "t", "s", "deviceInfos", EngineConstant.REASON, "Lcom/oplus/aiunit/vision/sjk;", "updateType", "x", "d", "Lcom/heytap/health/devicemanager/client/params/ConnectParams;", "dmParams", "connectDeviceByMac", "Lcom/heytap/health/devicemanager/client/params/DMPairParams;", "connectDeviceByPair", "disconnectDeviceByMac", "bleMac", "model", "z", "y", "intercept", "setInterceptDevice", "interceptCacheExist", "c", "autoCreate", LogFieldKey.LEVEL_KEY, XmlReader.VALUE_DISABLE, "disableTryConnect", "clear", "clearAndDisconnectAll", "setCurrActiveMac", "getCurrActiveMac", "j", "Lcom/oplus/aiunit/vision/ra5;", "deviceRole", "i", "q", "Lcom/oplus/aiunit/vision/ra5$c;", "n", "f", ServiceNodeBundleKeys.CONNECT_STATE, "updateDeviceConnectState", "A", MapSchema.FIELD_NAME_KEY, "isConnected", "isCurrentConnected", "isStubModule", "isOafEnabled", "a", "getActiveNodeId", "getCurrentConnectId", "Lcom/oplus/wearable/linkservice/sdk/Node;", "getConnectedNodes", "getNodeByMac", l9d.BUNDLE_KEY_NODE, "Lcom/oplus/aiunit/vision/auc;", "status", "b", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "timeout", "Lcom/heytap/health/connect/rawapi/IResult;", "result", "forceDarkContent", "v", "disableWifiConnection", b2n.f, "Lcom/oplus/aiunit/vision/oe2;", "H", "()Lcom/oplus/aiunit/vision/oe2;", "manager", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class DMManagerImpl implements ol4, vk4 {
    public final /* synthetic */ DMBaseBaseDeviceManagerImpl a = new DMBaseBaseDeviceManagerImpl();

    public static final void F(AppCompatActivity appCompatActivity, boolean z, String reason, IResult iResult, long j2, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(reason, "$reason");
        dialogInterface.dismiss();
        BuildersKt__Builders_commonKt.launch$default(xq8.a(wq8.INSTANCE.f()), null, null, new DMManagerImpl$enableWifiConnection$1$1$1(appCompatActivity, z, reason, iResult, j2, null), 3, null);
    }

    public static final void G(IResult iResult, DialogInterface dialogInterface, int i) throws RemoteException {
        dialogInterface.dismiss();
        if (iResult != null) {
            iResult.onResult(false, "cancel", null);
        }
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void A(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        H().y0(mac);
    }

    @Override // com.oplus.aiunit.vision.vk4
    @Nullable
    public String B(@NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return this.a.B(deviceId);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void C(@NotNull mc5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.C(listener);
    }

    @NotNull
    public final oe2 H() {
        return zj5.INSTANCE.a();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @NotNull
    public AsyncResult<Boolean> a() {
        return u89.NodeApi.a();
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void b(@NotNull String reason, @NotNull Node node, @NotNull auc status) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(status, "status");
        u89.NodeApi.b(reason, node, status);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void c(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        l(reason, false);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void clearAndDisconnectAll(@NotNull String reason, boolean clear) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        H().i0(reason, clear);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void connectDeviceByMac(@NotNull ConnectParams dmParams) {
        Intrinsics.checkNotNullParameter(dmParams, "dmParams");
        H().j0(dmParams);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void connectDeviceByPair(@NotNull DMPairParams dmParams) {
        Intrinsics.checkNotNullParameter(dmParams, "dmParams");
        H().k0(dmParams);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public boolean d(@NotNull List<? extends UserDeviceInfo> deviceInfos, @NotNull String reason, @NotNull sjk updateType) {
        Intrinsics.checkNotNullParameter(deviceInfos, "deviceInfos");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        return this.a.d(deviceInfos, reason, updateType);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public boolean deleteDeviceByMac(@Nullable String mac) {
        return this.a.deleteDeviceByMac(mac);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public boolean disableTryConnect(boolean disable, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return H().l0(disable, reason);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void disableWifiConnection(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        u89.NodeApi.disableWifiConnection(reason);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void disconnectDeviceByMac(@NotNull DMPairParams dmParams) {
        Intrinsics.checkNotNullParameter(dmParams, "dmParams");
        H().m0(dmParams);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void e(@Nullable AppCompatActivity appCompatActivity, @NotNull String str, long j2, @Nullable IResult iResult) {
        ol4.a.a(this, appCompatActivity, str, j2, iResult);
    }

    @Override // com.oplus.aiunit.vision.ol4
    @NotNull
    public ra5.c f(@Nullable String mac) {
        return H().L(mac);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public boolean g() {
        return u89.NodeApi.isWifiConnected();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @Nullable
    public String getActiveNodeId() {
        return u89.NodeApi.getActiveNodeId();
    }

    @Override // com.oplus.aiunit.vision.vk4
    @Nullable
    public UserDeviceInfo getBoundDeviceInfoByMac(@Nullable String mac) {
        return this.a.getBoundDeviceInfoByMac(mac);
    }

    @Override // com.oplus.aiunit.vision.vk4
    @NotNull
    public List<UserDeviceInfo> getBoundDeviceInfos() {
        return this.a.getBoundDeviceInfos();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @NotNull
    public List<Node> getConnectedNodes() {
        return u89.NodeApi.getConnectedNodes();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @NotNull
    public String getCurrActiveMac() {
        return H().q0();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @Nullable
    public String getCurrentConnectId() {
        return u89.NodeApi.getCurrentConnectId();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @Nullable
    public Node getNodeByMac(@Nullable String mac) {
        return u89.NodeApi.getNodeByMac(mac);
    }

    @Override // com.oplus.aiunit.vision.vk4
    @WorkerThread
    public int getRunMode(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return this.a.getRunMode(mac);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void h(@NotNull vi5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.h(listener);
    }

    @Override // com.oplus.aiunit.vision.ol4
    @Nullable
    public UserDeviceInfo i(@NotNull ra5 deviceRole) {
        Intrinsics.checkNotNullParameter(deviceRole, "deviceRole");
        return H().o0(deviceRole);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public boolean interceptCacheExist(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return H().t0(mac);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public boolean isConnected(@Nullable String mac) {
        return u89.NodeApi.isConnected(mac);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public boolean isCurrentConnected() {
        return u89.NodeApi.isCurrentConnected();
    }

    @Override // com.oplus.aiunit.vision.ol4
    public boolean isOafEnabled() {
        return u89.NodeApi.isOafEnabled();
    }

    @Override // com.oplus.aiunit.vision.ol4
    public boolean isStubModule() {
        return ((Boolean) lc5.b(gl4.managerApi.i(ra5.a.INSTANCE)).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.devicemanager.client.impl.DMManagerImpl.isStubModule.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.K9());
            }
        })).booleanValue() && u89.NodeApi.isStubModule();
    }

    @Override // com.oplus.aiunit.vision.vk4
    public boolean isSupportDynamicRegisterAgent() {
        return this.a.isSupportDynamicRegisterAgent();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @Nullable
    public UserDeviceInfo j() {
        return H().n0();
    }

    @Override // com.oplus.aiunit.vision.ol4
    @NotNull
    public String k() {
        return H().s0();
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void l(@NotNull String reason, boolean autoCreate) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        H().z0(reason, autoCreate);
    }

    @Override // com.oplus.aiunit.vision.vk4
    @NotNull
    public AsyncResult<UserDeviceInfo> m(@Nullable String mac) {
        return this.a.m(mac);
    }

    @Override // com.oplus.aiunit.vision.ol4
    @NotNull
    public ra5.c n() {
        return H().p0();
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void o(@NotNull ta5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.o(listener);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void p(@NotNull ta5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.p(listener);
    }

    @Override // com.oplus.aiunit.vision.ol4
    @NotNull
    public String q(@NotNull ra5 deviceRole) {
        Intrinsics.checkNotNullParameter(deviceRole, "deviceRole");
        return H().r0(deviceRole);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void r(@NotNull mc5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.r(listener);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void s(@NotNull sj5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.s(listener);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void setCurrActiveMac(@NotNull String mac, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(reason, "reason");
        H().w0(mac, reason);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void setInterceptDevice(@NotNull String mac, boolean intercept, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(reason, "reason");
        H().x0(mac, intercept, reason);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void t(@NotNull vi5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.t(listener);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void u(@NotNull sj5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.u(listener);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void updateDeviceConnectState(@NotNull String mac, int connectState, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(reason, "reason");
        H().A0(mac, connectState, reason);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void v(@Nullable final AppCompatActivity activity, @NotNull final String reason, final long timeout, @Nullable final IResult result, final boolean forceDarkContent) throws RemoteException {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!ilj.B()) {
            if (result != null) {
                result.onResult(false, "not oppo, no support", null);
                return;
            }
            return;
        }
        if (!((Boolean) lc5.c(getActiveNodeId()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.devicemanager.client.impl.DMManagerImpl$enableWifiConnection$support$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.db());
            }
        })).booleanValue()) {
            if (result != null) {
                result.onResult(false, "no support", null);
                return;
            }
            return;
        }
        if (WifiPermissionChecker.INSTANCE.b()) {
            if (!TextUtils.isEmpty(reason)) {
                u89.NodeApi.enableWifiConnection(reason, timeout, result);
                return;
            } else {
                if (result != null) {
                    result.onResult(false, "has permission", null);
                    return;
                }
                return;
            }
        }
        if (activity != null) {
            if (DateUtils.isToday(v9g.x("wifi_tip").B(reason, -1L))) {
                if (result != null) {
                    result.onResult(false, "dialog limited", null);
                    return;
                }
                return;
            } else {
                v9g.x("wifi_tip").T(reason, System.currentTimeMillis());
                if (new HealthAlertDialogBuilder(activity).setTitle(activity.getString(R$string.lib_base_wifi_p2p_enable_title)).setPositiveButton(R$string.lib_base_wifi_p2p_enable_now, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.pl4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DMManagerImpl.F(activity, forceDarkContent, reason, result, timeout, dialogInterface, i);
                    }
                }).setNegativeButton(R$string.lib_base_wifi_p2p_enable_later, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ql4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) throws RemoteException {
                        DMManagerImpl.G(result, dialogInterface, i);
                    }
                }).setCancelable(false).show() != null) {
                    return;
                }
            }
        }
        if (result != null) {
            result.onResult(false, "no permission, no tip", null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.oplus.aiunit.vision.vk4
    public boolean w(@Nullable String mac) {
        return this.a.w(mac);
    }

    @Override // com.oplus.aiunit.vision.vk4
    public void x(@NotNull UserDeviceInfo deviceInfos, @NotNull String reason, @NotNull sjk updateType) {
        Intrinsics.checkNotNullParameter(deviceInfos, "deviceInfos");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        this.a.x(deviceInfos, reason, updateType);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void y(@Nullable String mac, @Nullable String model, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        H().u0(mac, model, reason);
    }

    @Override // com.oplus.aiunit.vision.ol4
    public void z(@Nullable String mac, @Nullable String bleMac, @Nullable String model) {
        H().v0(mac, bleMac, model);
    }
}
