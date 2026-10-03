package com.oplus.pantaconnect.sdk.connectionservice.lan;

import com.google.protobuf.ByteString;
import com.oplus.pantaconnect.connection.SocketQosResult;
import com.oplus.pantaconnect.sdk.ResultCode;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/Lan;", "clients", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanConnectivityClients;", "(Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanConnectivityClients;)V", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "enableConnectionHolding", "Ljava/util/concurrent/CompletableFuture;", "", "deviceId", "", "isForcedHolding", "getClient", "getIdentityHash", "getSocketQos", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/SocketQos;", "connectionType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "getSocketScore", "", "registerQosObserver", "", "qosObserver", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/IQosObserver;", "unregisterQosObserver", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLanImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanImpl.kt\ncom/oplus/pantaconnect/sdk/connectionservice/lan/LanImpl\n+ 2 CompletableFutureExt.kt\ncom/oplus/pantaconnect/sdk/ext/CompletableFutureExt\n*L\n1#1,89:1\n41#2,8:90\n41#2,8:98\n41#2,8:106\n*S KotlinDebug\n*F\n+ 1 LanImpl.kt\ncom/oplus/pantaconnect/sdk/connectionservice/lan/LanImpl\n*L\n38#1:90,8\n58#1:98,8\n71#1:106,8\n*E\n"})
public final class LanImpl implements Lan {

    @NotNull
    private final LanConnectivityClients clients;

    @NotNull
    private final SdkLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public LanImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final String getIdentityHash() {
        return String.valueOf(System.identityHashCode(this));
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.Lan
    @NotNull
    public CompletableFuture<Boolean> enableConnectionHolding(@NotNull String deviceId, boolean isForcedHolding) {
        CompletableFuture<SealedResult> completableFutureEnableConnectionHolding = this.clients.enableConnectionHolding(deviceId, ConnectionType.WLAN, isForcedHolding);
        final CompletableFuture<Boolean> completableFuture = new CompletableFuture<>();
        completableFutureEnableConnectionHolding.thenAcceptAsync((Consumer<? super SealedResult>) new LanImpl$inlined$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanImpl$enableConnectionHolding$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5198invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5198invoke(SealedResult sealedResult) {
                completableFuture.complete(Boolean.valueOf(sealedResult.getResultCode() == ResultCode.SUCCESS));
            }
        })).exceptionally(new Function() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanImpl$enableConnectionHolding$$inlined$map$2
            @Override // java.util.function.Function
            public final Void apply(Throwable th) {
                completableFuture.completeExceptionally(th);
                return null;
            }
        });
        return completableFuture;
    }

    @NotNull
    public final String getClient() {
        return getIdentityHash();
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.Lan
    @NotNull
    public CompletableFuture<SocketQos> getSocketQos(@NotNull ConnectionType connectionType, @NotNull String deviceId) {
        this.logger.info("getSocketQos, connectionType=" + connectionType);
        ConnectionType connectionType2 = ConnectionType.WLAN;
        if (connectionType == connectionType2) {
            CompletableFuture<SealedResult> socketQos = this.clients.getSocketQos(deviceId);
            final CompletableFuture<SocketQos> completableFuture = new CompletableFuture<>();
            socketQos.thenAcceptAsync((Consumer<? super SealedResult>) new LanImpl$inlined$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanImpl$getSocketQos$$inlined$map$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                    m5199invoke(sealedResult);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code duplicated, block: B:6:0x002b  */
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m5199invoke(SealedResult sealedResult) {
                    SocketQos socketQos2;
                    CompletableFuture completableFuture2 = completableFuture;
                    ByteString data = sealedResult.getData();
                    if (data != null) {
                        socketQos2 = LanExtensionKt.toSocketQos(SocketQosResult.parseFrom(data));
                        this.logger.info("getSocketQos, socketQos=" + socketQos2);
                        if (socketQos2 == null) {
                            socketQos2 = new SocketQos();
                        }
                    } else {
                        socketQos2 = new SocketQos();
                    }
                    completableFuture2.complete(socketQos2);
                }
            })).exceptionally(new Function() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanImpl$getSocketQos$$inlined$map$2
                @Override // java.util.function.Function
                public final Void apply(Throwable th) {
                    completableFuture.completeExceptionally(th);
                    return null;
                }
            });
            return completableFuture;
        }
        CompletableFuture<SocketQos> completableFuture2 = new CompletableFuture<>();
        completableFuture2.completeExceptionally(new IllegalArgumentException("getSocketQos only support " + connectionType2));
        return completableFuture2;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.Lan
    @NotNull
    public CompletableFuture<Integer> getSocketScore(@NotNull ConnectionType connectionType, @NotNull String deviceId) {
        this.logger.info("getSocketScore, connectionType=" + connectionType);
        ConnectionType connectionType2 = ConnectionType.WLAN;
        if (connectionType == connectionType2) {
            CompletableFuture<SealedResult> socketScore = this.clients.getSocketScore(deviceId);
            final CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
            socketScore.thenAcceptAsync((Consumer<? super SealedResult>) new LanImpl$inlined$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanImpl$getSocketScore$$inlined$map$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                    m5200invoke(sealedResult);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m5200invoke(SealedResult sealedResult) {
                    int i;
                    CompletableFuture completableFuture2 = completableFuture;
                    ByteString data = sealedResult.getData();
                    if (data != null) {
                        i = LanExtensionKt.toInt(data.toByteArray());
                        this.logger.info("getSocketScore, score=" + i);
                    } else {
                        i = 0;
                    }
                    completableFuture2.complete(Integer.valueOf(i));
                }
            })).exceptionally(new Function() { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.LanImpl$getSocketScore$$inlined$map$2
                @Override // java.util.function.Function
                public final Void apply(Throwable th) {
                    completableFuture.completeExceptionally(th);
                    return null;
                }
            });
            return completableFuture;
        }
        CompletableFuture<Integer> completableFuture2 = new CompletableFuture<>();
        completableFuture2.completeExceptionally(new IllegalArgumentException("getSocketScore only support " + connectionType2));
        return completableFuture2;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.Lan
    public void registerQosObserver(@NotNull IQosObserver qosObserver) {
        this.clients.registerQosObserver(qosObserver);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.Lan
    public void unregisterQosObserver(@NotNull IQosObserver qosObserver) {
        this.clients.unregisterQosObserver(qosObserver);
    }

    public LanImpl(@NotNull LanConnectivityClients lanConnectivityClients) {
        this.clients = lanConnectivityClients;
        this.logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "LanImpl", null, 2, null);
    }

    public /* synthetic */ LanImpl(LanConnectivityClients lanConnectivityClients, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LanConnectivityClientsKt.createLanConnectivityClients() : lanConnectivityClients);
    }
}
