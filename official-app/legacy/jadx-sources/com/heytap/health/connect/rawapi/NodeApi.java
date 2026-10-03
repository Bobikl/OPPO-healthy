package com.heytap.health.connect.rawapi;

import android.util.ArraySet;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.l9d;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002-.J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\"\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0015H&J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH&J\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H&J\n\u0010 \u001a\u0004\u0018\u00010\u0006H&J\n\u0010!\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\"\u001a\u00020\u0004H&J\u0012\u0010#\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H&J\b\u0010$\u001a\u00020\u0004H&J\b\u0010%\u001a\u00020\u0004H&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H&J$\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020(2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010,\u001a\u00020\u0004H&¨\u0006/"}, d2 = {"Lcom/heytap/health/connect/rawapi/NodeApi;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "auto", "", EngineConstant.REASON, "", "connectNode", "disconnectNode", "", "key", "createBond", "Lcom/heytap/health/connect/rawapi/IResult;", "result", "removeBond", "Lcom/heytap/health/connect/rawapi/NodeApi$NodeListener;", "listener", "f", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/connect/rawapi/NodeApi$NodeStatusChanged;", "d", "c", "Lcom/oplus/aiunit/vision/auc;", "status", "b", "", "getBondNodes", "getConnectedNodes", "mac", "getNodeByMac", "getActiveNodeId", "getCurrentConnectId", "isCurrentConnected", "isConnected", "isStubModule", "isOafEnabled", "Lcom/heytap/health/base/utils/AsyncResult;", "a", "", "timeout", "enableWifiConnection", "disableWifiConnection", "isWifiConnected", "NodeListener", "NodeStatusChanged", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public interface NodeApi {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/connect/rawapi/NodeApi$NodeListener;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "onPeerConnected", "onPeerDisconnected", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public interface NodeListener {
        void onPeerConnected(@NotNull Node node);

        void onPeerDisconnected(@NotNull Node node);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/connect/rawapi/NodeApi$NodeStatusChanged;", "", "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/auc;", "interests", "", "getInterestingStatus", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "nodeStatus", "d", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public interface NodeStatusChanged {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public static void a(@NotNull NodeStatusChanged nodeStatusChanged, @NotNull Node node, @NotNull auc nodeStatus) {
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
            }
        }

        void d(@NotNull Node node, @NotNull auc nodeStatus);

        void getInterestingStatus(@NotNull ArraySet<auc> interests);
    }

    @NotNull
    AsyncResult<Boolean> a();

    void b(@NotNull String reason, @NotNull Node node, @NotNull auc status);

    void c(@NotNull NodeStatusChanged listener);

    void connectNode(@NotNull Node node, boolean auto, @NotNull String reason);

    void createBond(@NotNull Node node, @NotNull byte[] key, @NotNull String reason);

    void d(@NotNull NodeStatusChanged listener);

    void disableWifiConnection(@NotNull String reason);

    void disconnectNode(@NotNull Node node, @NotNull String reason);

    void e(@NotNull NodeListener listener);

    void enableWifiConnection(@NotNull String reason, long timeout, @Nullable IResult result);

    void f(@NotNull NodeListener listener);

    @Nullable
    String getActiveNodeId();

    @NotNull
    List<Node> getBondNodes();

    @NotNull
    List<Node> getConnectedNodes();

    @Nullable
    String getCurrentConnectId();

    @Nullable
    Node getNodeByMac(@Nullable String mac);

    boolean isConnected(@Nullable String mac);

    boolean isCurrentConnected();

    boolean isOafEnabled();

    boolean isStubModule();

    boolean isWifiConnected();

    void removeBond(@NotNull Node node, @NotNull String reason, @Nullable IResult result);
}
