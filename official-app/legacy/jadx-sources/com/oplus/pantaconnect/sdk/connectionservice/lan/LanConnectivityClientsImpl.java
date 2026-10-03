package com.oplus.pantaconnect.sdk.connectionservice.lan;

import android.os.RemoteException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.pantaconnect.connection.ConnectionHoldingParams;
import com.oplus.pantaconnect.connection.SocketQosObserverEvent;
import com.oplus.pantaconnect.connection.SocketQosObserverResult;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import com.oplus.pantaconnect.sdk.RequestScope;
import com.oplus.pantaconnect.sdk.ResultCode;
import com.oplus.pantaconnect.sdk.SdkExtension;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.connection.ConnectionExtension;
import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import com.oplus.pantaconnect.sdk.connection.ConnectionTypeKt;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClientsImpl;
import com.oplus.pantaconnect.sdk.exception.IpcInterfaceNullPointException;
import com.oplus.pantaconnect.sdk.exception.ServerRemoteException;
import com.oplus.pantaconnect.sdk.ipc.AppIpc;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanConnectivityClientsImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanConnectivityClients;", "connectionExtension", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;", "(Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;)V", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "enableConnectionHolding", "Ljava/util/concurrent/CompletableFuture;", "Lcom/oplus/pantaconnect/sdk/SealedResult;", "deviceId", "", "connectType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "isForcedHolding", "", "getSocketQos", "getSocketScore", "registerQosObserver", "qosObserver", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/IQosObserver;", "unregisterQosObserver", "", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LanConnectivityClientsImpl implements LanConnectivityClients {

    @Nullable
    private final ConnectionExtension connectionExtension;

    @NotNull
    private final SdkLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public LanConnectivityClientsImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableConnectionHolding$lambda$2(LanConnectivityClientsImpl lanConnectivityClientsImpl, ConnectionHoldingParams connectionHoldingParams, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope;
        ConnectionExtension connectionExtension = lanConnectivityClientsImpl.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        AppIpc.remoteRequest(requestScope, "enableConnectionHolding", null, connectionHoldingParams.toByteArray(), new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClientsImpl$enableConnectionHolding$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                return Boolean.valueOf(completableFuture.complete(SealedResult.parseFrom(bArr)));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSocketQos$lambda$1(LanConnectivityClientsImpl lanConnectivityClientsImpl, String str, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope;
        ConnectionExtension connectionExtension = lanConnectivityClientsImpl.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        AppIpc.remoteRequest(requestScope, "getSocketQos", str, new byte[0], new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClientsImpl$getSocketQos$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                return Boolean.valueOf(from.getResultCode() == ResultCode.SUCCESS ? completableFuture.complete(from) : completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage())));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSocketScore$lambda$0(LanConnectivityClientsImpl lanConnectivityClientsImpl, String str, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope;
        ConnectionExtension connectionExtension = lanConnectivityClientsImpl.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        AppIpc.remoteRequest(requestScope, "getSocketScore", str, new byte[0], new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClientsImpl$getSocketScore$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                if (from.getResultCode() == ResultCode.SUCCESS) {
                    completableFuture.complete(from);
                } else {
                    completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage()));
                }
                return Boolean.valueOf(completableFuture.complete(from));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerQosObserver$lambda$3(final LanConnectivityClientsImpl lanConnectivityClientsImpl, final IQosObserver iQosObserver) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope;
        ConnectionExtension connectionExtension = lanConnectivityClientsImpl.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        AppIpc.remoteRequest$default(requestScope, "registerQosObserver", String.valueOf(iQosObserver.hashCode()), null, new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClientsImpl$registerQosObserver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SocketQosObserverResult from = SocketQosObserverResult.parseFrom(bArr);
                this.this$0.logger.info("registerQosObserver, parseFrom=" + from);
                if (from.getEvent() == SocketQosObserverEvent.EVENT_SOCKET_QOS_AVAILABLE) {
                    iQosObserver.onSocketQosAvailable(from.getDeviceId(), LanExtensionKt.toSocketQos(from.getSocketQosResult()));
                } else if (from.getEvent() == SocketQosObserverEvent.EVENT_SOCKET_QOS_UNAVAILABLE) {
                    iQosObserver.onSocketQosUnavailable(from.getDeviceId(), LanExtensionKt.toSocketQos(from.getSocketQosResult()));
                }
                return Boolean.TRUE;
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unregisterQosObserver$lambda$4(final LanConnectivityClientsImpl lanConnectivityClientsImpl, IQosObserver iQosObserver) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope;
        ConnectionExtension connectionExtension = lanConnectivityClientsImpl.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        AppIpc.remoteRequest$default(requestScope, "unregisterQosObserver", String.valueOf(iQosObserver.hashCode()), null, new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClientsImpl$unregisterQosObserver$1$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                this.this$0.logger.info("unregisterQosObserver, parseFrom=" + from);
                return Boolean.TRUE;
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClients
    @NotNull
    public CompletableFuture<SealedResult> enableConnectionHolding(@NotNull String deviceId, @NotNull ConnectionType connectType, boolean isForcedHolding) {
        final CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        final ConnectionHoldingParams connectionHoldingParamsBuild = ConnectionHoldingParams.newBuilder().setDeviceId(deviceId).setConnectType(ConnectionTypeKt.toConnectType(connectType).getNumber()).setIsForcedHolding(isForcedHolding).build();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.eta
            @Override // java.util.function.Supplier
            public final Object get() {
                return LanConnectivityClientsImpl.enableConnectionHolding$lambda$2(this.a, connectionHoldingParamsBuild, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClients
    @NotNull
    public CompletableFuture<SealedResult> getSocketQos(@NotNull final String deviceId) {
        final CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.gta
            @Override // java.util.function.Supplier
            public final Object get() {
                return LanConnectivityClientsImpl.getSocketQos$lambda$1(this.a, deviceId, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClients
    @NotNull
    public CompletableFuture<SealedResult> getSocketScore(@NotNull final String deviceId) {
        final CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.dta
            @Override // java.util.function.Supplier
            public final Object get() {
                return LanConnectivityClientsImpl.getSocketScore$lambda$0(this.a, deviceId, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClients
    @NotNull
    public CompletableFuture<SealedResult> registerQosObserver(@NotNull final IQosObserver qosObserver) {
        CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        this.logger.info("registerQosObserver, qos=" + qosObserver.hashCode());
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.fta
            @Override // java.util.function.Supplier
            public final Object get() {
                return LanConnectivityClientsImpl.registerQosObserver$lambda$3(this.a, qosObserver);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.LanConnectivityClients
    public void unregisterQosObserver(@NotNull final IQosObserver qosObserver) {
        new CompletableFuture();
        this.logger.info("unregisterQosObserver, qos=" + qosObserver.hashCode());
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.cta
            @Override // java.util.function.Supplier
            public final Object get() {
                return LanConnectivityClientsImpl.unregisterQosObserver$lambda$4(this.a, qosObserver);
            }
        });
    }

    public LanConnectivityClientsImpl(@Nullable ConnectionExtension connectionExtension) {
        this.connectionExtension = connectionExtension;
        this.logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "LanConnectivityClientsImpl", null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LanConnectivityClientsImpl(ConnectionExtension connectionExtension, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            SdkExtension sdkExtension = PlatformInitialization.INSTANCE.getSdkExtension();
            connectionExtension = sdkExtension != null ? sdkExtension.getConnectionExtension() : null;
        }
        this(connectionExtension);
    }
}
