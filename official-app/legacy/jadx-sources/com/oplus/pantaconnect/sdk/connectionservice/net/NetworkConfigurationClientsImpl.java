package com.oplus.pantaconnect.sdk.connectionservice.net;

import android.os.Process;
import android.os.RemoteException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import com.oplus.pantaconnect.sdk.RequestScope;
import com.oplus.pantaconnect.sdk.ResultCode;
import com.oplus.pantaconnect.sdk.SdkExtension;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.connection.ConnectionExtension;
import com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClientsImpl;
import com.oplus.pantaconnect.sdk.exception.IpcInterfaceNullPointException;
import com.oplus.pantaconnect.sdk.exception.ServerRemoteException;
import com.oplus.pantaconnect.sdk.ipc.AppIpc;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import jackFruit.prunes;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationClientsImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationClients;", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfigOptions;", "LjackFruit/prunes;", "toParams", "(Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfigOptions;)LjackFruit/prunes;", "options", "Ljava/util/concurrent/CompletableFuture;", "Lcom/oplus/pantaconnect/sdk/SealedResult;", "getWifiConfig", "(Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfigOptions;)Ljava/util/concurrent/CompletableFuture;", "getRecordWifiConfigs", "getSoftApWifiConfig", "", "registerSoftApListener", "()V", "unRegisterSoftApListener", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;", "connectionExtension", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "<init>", "(Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;)V", "connectionservice_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkConfigurationClientsImpl implements NetworkConfigurationClients {

    @Nullable
    private final ConnectionExtension connectionExtension;

    @NotNull
    private final SdkLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkConfigurationClientsImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRecordWifiConfigs$lambda$1(RequestScope requestScope, final NetworkConfigurationClientsImpl networkConfigurationClientsImpl, WifiConfigOptions wifiConfigOptions, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        AppIpc.remoteRequest$default(requestScope, "getRecordWifiConfigs", null, networkConfigurationClientsImpl.toParams(wifiConfigOptions).toByteArray(), new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClientsImpl$getRecordWifiConfigs$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                this.this$0.logger.info("result for getRecordWifiConfigs. resultCode: " + from.getResultCode());
                if (from.getResultCode() == ResultCode.SUCCESS) {
                    completableFuture.complete(from);
                } else {
                    completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage()));
                }
                return Boolean.TRUE;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSoftApWifiConfig$lambda$2(RequestScope requestScope, final NetworkConfigurationClientsImpl networkConfigurationClientsImpl, WifiConfigOptions wifiConfigOptions, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        AppIpc.remoteRequest$default(requestScope, "getSoftApWifiConfig", null, networkConfigurationClientsImpl.toParams(wifiConfigOptions).toByteArray(), new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClientsImpl$getSoftApWifiConfig$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                this.this$0.logger.info("result for getSoftApWifiConfig. resultCode: " + from.getResultCode());
                if (from.getResultCode() == ResultCode.SUCCESS) {
                    completableFuture.complete(from);
                } else {
                    completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage()));
                }
                return Boolean.TRUE;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getWifiConfig$lambda$0(RequestScope requestScope, final NetworkConfigurationClientsImpl networkConfigurationClientsImpl, WifiConfigOptions wifiConfigOptions, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        AppIpc.remoteRequest$default(requestScope, "getWifiConfig", null, networkConfigurationClientsImpl.toParams(wifiConfigOptions).toByteArray(), new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClientsImpl$getWifiConfig$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                this.this$0.logger.info("result for getWifiConfig. resultCode: " + from.getResultCode());
                if (from.getResultCode() == ResultCode.SUCCESS) {
                    completableFuture.complete(from);
                } else {
                    completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage()));
                }
                return Boolean.TRUE;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerSoftApListener$lambda$3(NetworkConfigurationClientsImpl networkConfigurationClientsImpl) throws InvalidProtocolBufferException {
        RequestScope requestScope = RequestScope.CONNECTION;
        byte[] bytes = String.valueOf(Process.myPid()).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        SealedResult from = SealedResult.parseFrom(AppIpc.remoteRequest$default(requestScope, "registerSoftApListener", null, bytes, 4, null));
        networkConfigurationClientsImpl.logger.info("registerSoftApListener. resultCode: " + from.getResultCode());
    }

    private final prunes toParams(WifiConfigOptions wifiConfigOptions) {
        return prunes.cranberry.toBuilder().prunes(wifiConfigOptions.getSsid()).coconut(wifiConfigOptions.getAllowedKeyManagement()).jackFruit(wifiConfigOptions.getPreSharedKey()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unRegisterSoftApListener$lambda$4(NetworkConfigurationClientsImpl networkConfigurationClientsImpl) throws InvalidProtocolBufferException {
        RequestScope requestScope = RequestScope.CONNECTION;
        byte[] bytes = String.valueOf(Process.myPid()).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        SealedResult from = SealedResult.parseFrom(AppIpc.remoteRequest$default(requestScope, "unRegisterSoftApListener", null, bytes, 4, null));
        networkConfigurationClientsImpl.logger.info("unRegisterSoftApListener. resultCode: " + from.getResultCode());
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClients
    @NotNull
    public CompletableFuture<SealedResult> getRecordWifiConfigs(@NotNull final WifiConfigOptions options) {
        final RequestScope requestScope;
        final CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        ConnectionExtension connectionExtension = this.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        CompletableFuture.runAsync(new Runnable() { // from class: com.oplus.aiunit.vision.ooc
            @Override // java.lang.Runnable
            public final void run() throws IpcInterfaceNullPointException, RemoteException {
                NetworkConfigurationClientsImpl.getRecordWifiConfigs$lambda$1(requestScope, this, options, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClients
    @NotNull
    public CompletableFuture<SealedResult> getSoftApWifiConfig(@NotNull final WifiConfigOptions options) {
        final RequestScope requestScope;
        final CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        ConnectionExtension connectionExtension = this.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        CompletableFuture.runAsync(new Runnable() { // from class: com.oplus.aiunit.vision.loc
            @Override // java.lang.Runnable
            public final void run() throws IpcInterfaceNullPointException, RemoteException {
                NetworkConfigurationClientsImpl.getSoftApWifiConfig$lambda$2(requestScope, this, options, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClients
    @NotNull
    public CompletableFuture<SealedResult> getWifiConfig(@NotNull final WifiConfigOptions options) {
        final RequestScope requestScope;
        final CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        ConnectionExtension connectionExtension = this.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        CompletableFuture.runAsync(new Runnable() { // from class: com.oplus.aiunit.vision.moc
            @Override // java.lang.Runnable
            public final void run() throws IpcInterfaceNullPointException, RemoteException {
                NetworkConfigurationClientsImpl.getWifiConfig$lambda$0(requestScope, this, options, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClients
    public void registerSoftApListener() {
        CompletableFuture.runAsync(new Runnable() { // from class: com.oplus.aiunit.vision.noc
            @Override // java.lang.Runnable
            public final void run() throws InvalidProtocolBufferException {
                NetworkConfigurationClientsImpl.registerSoftApListener$lambda$3(this.i);
            }
        });
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationClients
    public void unRegisterSoftApListener() {
        CompletableFuture.runAsync(new Runnable() { // from class: com.oplus.aiunit.vision.koc
            @Override // java.lang.Runnable
            public final void run() throws InvalidProtocolBufferException {
                NetworkConfigurationClientsImpl.unRegisterSoftApListener$lambda$4(this.i);
            }
        });
    }

    public NetworkConfigurationClientsImpl(@Nullable ConnectionExtension connectionExtension) {
        this.connectionExtension = connectionExtension;
        this.logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "NetworkConfigurationClientsImpl", null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NetworkConfigurationClientsImpl(ConnectionExtension connectionExtension, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            SdkExtension sdkExtension = PlatformInitialization.INSTANCE.getSdkExtension();
            connectionExtension = sdkExtension != null ? sdkExtension.getConnectionExtension() : null;
        }
        this(connectionExtension);
    }
}
