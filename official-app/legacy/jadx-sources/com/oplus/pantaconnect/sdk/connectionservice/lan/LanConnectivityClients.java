package com.oplus.pantaconnect.sdk.connectionservice.lan;

import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanConnectivityClients;", "", "enableConnectionHolding", "Ljava/util/concurrent/CompletableFuture;", "Lcom/oplus/pantaconnect/sdk/SealedResult;", "deviceId", "", "connectType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "isForcedHolding", "", "getSocketQos", "getSocketScore", "registerQosObserver", "qosObserver", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/IQosObserver;", "unregisterQosObserver", "", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LanConnectivityClients {
    @NotNull
    CompletableFuture<SealedResult> enableConnectionHolding(@NotNull String deviceId, @NotNull ConnectionType connectType, boolean isForcedHolding);

    @NotNull
    CompletableFuture<SealedResult> getSocketQos(@NotNull String deviceId);

    @NotNull
    CompletableFuture<SealedResult> getSocketScore(@NotNull String deviceId);

    @NotNull
    CompletableFuture<SealedResult> registerQosObserver(@NotNull IQosObserver qosObserver);

    void unregisterQosObserver(@NotNull IQosObserver qosObserver);
}
