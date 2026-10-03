package com.oplus.pantaconnect.sdk.connectionservice.net;

import com.oplus.pantaconnect.sdk.SealedResult;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationClients;", "", "getRecordWifiConfigs", "Ljava/util/concurrent/CompletableFuture;", "Lcom/oplus/pantaconnect/sdk/SealedResult;", "options", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfigOptions;", "getSoftApWifiConfig", "getWifiConfig", "registerSoftApListener", "", "unRegisterSoftApListener", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NetworkConfigurationClients {
    @NotNull
    CompletableFuture<SealedResult> getRecordWifiConfigs(@NotNull WifiConfigOptions options);

    @NotNull
    CompletableFuture<SealedResult> getSoftApWifiConfig(@NotNull WifiConfigOptions options);

    @NotNull
    CompletableFuture<SealedResult> getWifiConfig(@NotNull WifiConfigOptions options);

    void registerSoftApListener();

    void unRegisterSoftApListener();
}
