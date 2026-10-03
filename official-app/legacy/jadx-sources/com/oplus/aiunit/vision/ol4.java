package com.oplus.aiunit.vision;

import androidx.appcompat.app.AppCompatActivity;
import com.heytap.accessory.utils.XmlReader;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.connect.rawapi.IResult;
import com.heytap.health.devicemanager.client.params.ConnectParams;
import com.heytap.health.devicemanager.client.params.DMPairParams;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J&\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH&J$\u0010\u000f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\tH&J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tH&J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0010H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH&J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tH&J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0010H&J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH&J\b\u0010\u001c\u001a\u00020\tH&J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH&J\b\u0010 \u001a\u00020\u001fH&J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0010\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H&J\u0012\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\"H&J \u0010(\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\tH&J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J\b\u0010*\u001a\u00020\tH&J\u0012\u0010+\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\b\u0010,\u001a\u00020\u0010H&J\b\u0010-\u001a\u00020\u0010H&J\b\u0010.\u001a\u00020\u0010H&J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100/H&J\n\u00101\u001a\u0004\u0018\u00010\tH&J\n\u00102\u001a\u0004\u0018\u00010\tH&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020403H&J\u0014\u00106\u001a\u0004\u0018\u0001042\b\u0010\n\u001a\u0004\u0018\u00010\tH&J \u0010:\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u00107\u001a\u0002042\u0006\u00109\u001a\u000208H&J,\u0010A\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016J6\u0010C\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020\u0010H&J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH&J\b\u0010E\u001a\u00020\u0010H&¨\u0006F"}, d2 = {"Lcom/oplus/aiunit/vision/ol4;", "Lcom/oplus/aiunit/vision/vk4;", "Lcom/heytap/health/devicemanager/client/params/ConnectParams;", "dmParams", "", "connectDeviceByMac", "Lcom/heytap/health/devicemanager/client/params/DMPairParams;", "connectDeviceByPair", "disconnectDeviceByMac", "", "mac", "bleMac", "model", "z", EngineConstant.REASON, "y", "", "intercept", "setInterceptDevice", "interceptCacheExist", "autoCreate", LogFieldKey.LEVEL_KEY, "c", XmlReader.VALUE_DISABLE, "disableTryConnect", "clear", "clearAndDisconnectAll", "setCurrActiveMac", "getCurrActiveMac", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "j", "Lcom/oplus/aiunit/vision/ra5$c;", "n", "f", "Lcom/oplus/aiunit/vision/ra5;", "deviceRole", "q", "i", "", ServiceNodeBundleKeys.CONNECT_STATE, "updateDeviceConnectState", "A", MapSchema.FIELD_NAME_KEY, "isConnected", "isCurrentConnected", "isStubModule", "isOafEnabled", "Lcom/heytap/health/base/utils/AsyncResult;", "a", "getActiveNodeId", "getCurrentConnectId", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", "getConnectedNodes", "getNodeByMac", l9d.BUNDLE_KEY_NODE, "Lcom/oplus/aiunit/vision/auc;", "status", "b", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "timeout", "Lcom/heytap/health/connect/rawapi/IResult;", "result", MapSchema.FIELD_NAME_ENTRY, "forceDarkContent", "v", "disableWifiConnection", b2n.f, "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface ol4 extends vk4 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull ol4 ol4Var, @Nullable AppCompatActivity appCompatActivity, @NotNull String reason, long j2, @Nullable IResult iResult) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            ol4Var.v(appCompatActivity, reason, j2, iResult, false);
        }
    }

    void A(@NotNull String mac);

    @NotNull
    AsyncResult<Boolean> a();

    void b(@NotNull String reason, @NotNull Node node, @NotNull auc status);

    void c(@NotNull String reason);

    void clearAndDisconnectAll(@NotNull String reason, boolean clear);

    void connectDeviceByMac(@NotNull ConnectParams dmParams);

    void connectDeviceByPair(@NotNull DMPairParams dmParams);

    boolean disableTryConnect(boolean disable, @NotNull String reason);

    void disableWifiConnection(@NotNull String reason);

    void disconnectDeviceByMac(@NotNull DMPairParams dmParams);

    void e(@Nullable AppCompatActivity activity, @NotNull String reason, long timeout, @Nullable IResult result);

    @NotNull
    ra5.c f(@Nullable String mac);

    boolean g();

    @Nullable
    String getActiveNodeId();

    @NotNull
    List<Node> getConnectedNodes();

    @NotNull
    String getCurrActiveMac();

    @Nullable
    String getCurrentConnectId();

    @Nullable
    Node getNodeByMac(@Nullable String mac);

    @Nullable
    UserDeviceInfo i(@NotNull ra5 deviceRole);

    boolean interceptCacheExist(@NotNull String mac);

    boolean isConnected(@Nullable String mac);

    boolean isCurrentConnected();

    boolean isOafEnabled();

    boolean isStubModule();

    @Nullable
    UserDeviceInfo j();

    @NotNull
    String k();

    void l(@NotNull String reason, boolean autoCreate);

    @NotNull
    ra5.c n();

    @NotNull
    String q(@NotNull ra5 deviceRole);

    void setCurrActiveMac(@NotNull String mac, @NotNull String reason);

    void setInterceptDevice(@NotNull String mac, boolean intercept, @NotNull String reason);

    void updateDeviceConnectState(@NotNull String mac, int connectState, @NotNull String reason);

    void v(@Nullable AppCompatActivity activity, @NotNull String reason, long timeout, @Nullable IResult result, boolean forceDarkContent);

    void y(@Nullable String mac, @Nullable String model, @NotNull String reason);

    void z(@Nullable String mac, @Nullable String bleMac, @Nullable String model);
}
