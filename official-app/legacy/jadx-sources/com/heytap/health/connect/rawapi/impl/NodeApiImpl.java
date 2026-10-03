package com.heytap.health.connect.rawapi.impl;

import android.os.RemoteException;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.connect.rawapi.IHeytap;
import com.heytap.health.connect.rawapi.IResult;
import com.heytap.health.connect.rawapi.NodeApi;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u0012\u0010#\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0016J\"\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102R$\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u000204j\b\u0012\u0004\u0012\u00020\u0002`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00106¨\u0006:"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/NodeApiImpl;", "Lcom/heytap/health/connect/rawapi/NodeApi;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "auto", "", EngineConstant.REASON, "", "connectNode", "disconnectNode", "", "key", "createBond", "Lcom/heytap/health/connect/rawapi/IResult;", "result", "removeBond", "Lcom/heytap/health/connect/rawapi/NodeApi$NodeListener;", "listener", "f", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/connect/rawapi/NodeApi$NodeStatusChanged;", "d", "c", "Lcom/oplus/aiunit/vision/auc;", "status", "b", "", "getBondNodes", "getConnectedNodes", "mac", "getNodeByMac", "getActiveNodeId", "getCurrentConnectId", "isCurrentConnected", "isConnected", "isStubModule", "isOafEnabled", "Lcom/heytap/health/base/utils/AsyncResult;", "a", "", "timeout", "enableWifiConnection", "disableWifiConnection", "isWifiConnected", "Ljava/lang/String;", "TAG", "Lcom/heytap/health/connect/rawapi/impl/b;", "Lcom/heytap/health/connect/rawapi/impl/b;", "getLCbManager", "()Lcom/heytap/health/connect/rawapi/impl/b;", "lCbManager", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "EMPTY_LIST", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class NodeApiImpl implements NodeApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "NodeApiImpl";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b lCbManager = b.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayList<Node> EMPTY_LIST = new ArrayList<>();

    @Override // com.heytap.health.connect.rawapi.NodeApi
    @NotNull
    public AsyncResult<Boolean> a() {
        return new AsyncResult<>(new NodeApiImpl$isOafEnabledByAsync$1(this));
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void b(@NotNull final String reason, @NotNull final Node node, @NotNull final auc status) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(status, "status");
        this.lCbManager.j("notifyNodeStatus", Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl$notifyNodeStatus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap it) throws RemoteException {
                Intrinsics.checkNotNullParameter(it, "it");
                it.notifyNodeStatus(reason, node, status.getStatus());
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void c(@NotNull NodeApi.NodeStatusChanged listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.Y(listener);
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void connectNode(@NotNull final Node node, final boolean auto, @NotNull final String reason) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.lCbManager.k("connectNode", true, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.connectNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                iHeytap.connectNode(node, auto, reason);
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void createBond(@NotNull final Node node, @NotNull final byte[] key, @NotNull final String reason) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.lCbManager.k("createBond", true, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.createBond.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                iHeytap.createBond(node, key, reason);
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void d(@NotNull NodeApi.NodeStatusChanged listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.T(listener);
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void disableWifiConnection(@NotNull final String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.lCbManager.k("disableWifiConnection", false, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.disableWifiConnection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                iHeytap.disableWifiConnection(reason);
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void disconnectNode(@NotNull final Node node, @NotNull final String reason) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(reason, "reason");
        wil.a(this.TAG, "disconnectNode " + node);
        this.lCbManager.k("disconnectNode", true, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.disconnectNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                wil.a(NodeApiImpl.this.TAG, "disconnectNode invokeIHeytap " + node);
                iHeytap.disconnectNode(node, reason);
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void e(@NotNull NodeApi.NodeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.X(listener);
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void enableWifiConnection(@NotNull final String reason, final long timeout, @Nullable final IResult result) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.lCbManager.k("enableWifiConnection", false, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.enableWifiConnection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                iHeytap.enableWifiConnection(reason, timeout, result);
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void f(@NotNull NodeApi.NodeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.H(listener);
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    @Nullable
    public String getActiveNodeId() {
        return (String) this.lCbManager.j("getActiveNodeId", null, new Function1<IHeytap, String>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.getActiveNodeId.1
            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final String invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return iHeytap.getActiveNodeId();
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    @NotNull
    public List<Node> getBondNodes() {
        Object objK = this.lCbManager.k("getBondNodes", true, this.EMPTY_LIST, new Function1<IHeytap, List<Node>>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.getBondNodes.1
            @Override // p010kotlin.jvm.functions.Function1
            public final List<Node> invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return iHeytap.getBondNodes();
            }
        });
        Intrinsics.checkNotNullExpressionValue(objK, "lCbManager.invokeIHeytap…eytap.bondNodes\n        }");
        return (List) objK;
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    @NotNull
    public List<Node> getConnectedNodes() {
        Object objJ = this.lCbManager.j("getConnectedNodes", this.EMPTY_LIST, new Function1<IHeytap, List<Node>>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.getConnectedNodes.1
            @Override // p010kotlin.jvm.functions.Function1
            public final List<Node> invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return iHeytap.getConnectedNodes();
            }
        });
        Intrinsics.checkNotNullExpressionValue(objJ, "lCbManager.invokeIHeytap….connectedNodes\n        }");
        return (List) objJ;
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    @Nullable
    public String getCurrentConnectId() {
        String strI = this.lCbManager.I();
        return strI != null ? strI : (String) this.lCbManager.j("getCurrentConnectId", null, new Function1<IHeytap, String>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.getCurrentConnectId.1
            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final String invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return iHeytap.getCurrentConnectId();
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    @Nullable
    public Node getNodeByMac(@Nullable final String mac) {
        if (mac == null) {
            return null;
        }
        return (Node) this.lCbManager.k("getNodeByMac", true, null, new Function1<IHeytap, Node>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.getNodeByMac.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final Node invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return iHeytap.getNodeByMac(mac);
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public boolean isConnected(@Nullable final String mac) {
        if (mac == null) {
            return false;
        }
        Boolean boolQ = this.lCbManager.Q(mac);
        return boolQ != null ? boolQ.booleanValue() : ((Boolean) this.lCbManager.j("isConnected", Boolean.FALSE, new Function1<IHeytap, Boolean>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.isConnected.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return Boolean.valueOf(iHeytap.isConnected(mac));
            }
        })).booleanValue();
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public boolean isCurrentConnected() {
        Boolean boolR = this.lCbManager.R();
        return boolR != null ? boolR.booleanValue() : ((Boolean) this.lCbManager.j("isCurrentConnected", Boolean.FALSE, new Function1<IHeytap, Boolean>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.isCurrentConnected.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return Boolean.valueOf(iHeytap.isCurrentConnected());
            }
        })).booleanValue();
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public boolean isOafEnabled() {
        return ((Boolean) this.lCbManager.k("isOafEnabled", true, Boolean.TRUE, new Function1<IHeytap, Boolean>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.isOafEnabled.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return Boolean.valueOf(iHeytap.isOafEnabled());
            }
        })).booleanValue();
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public boolean isStubModule() {
        Boolean boolS = this.lCbManager.S();
        return boolS != null ? boolS.booleanValue() : ((Boolean) this.lCbManager.j("isStubModule", Boolean.FALSE, new Function1<IHeytap, Boolean>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.isStubModule.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return Boolean.valueOf(iHeytap.isStubModule());
            }
        })).booleanValue();
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public boolean isWifiConnected() {
        return ((Boolean) this.lCbManager.k("isWifiConnected", false, Boolean.FALSE, new Function1<IHeytap, Boolean>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.isWifiConnected.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                return Boolean.valueOf(iHeytap.isWifiConnected());
            }
        })).booleanValue();
    }

    @Override // com.heytap.health.connect.rawapi.NodeApi
    public void removeBond(@NotNull final Node node, @NotNull final String reason, @Nullable final IResult result) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.lCbManager.k("removeBond", true, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.NodeApiImpl.removeBond.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                iHeytap.removeBond(node, reason, result);
            }
        });
    }
}
