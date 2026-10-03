package com.oplus.pantaconnect.sdk.connectionservice.net;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfiguration;", "", "getRecordWifiConfigs", "Ljava/util/concurrent/CompletableFuture;", "", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfig;", "options", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfigOptions;", "getSoftApWifiConfig", "getWifiConfig", "registerSoftApListener", "", "unRegisterSoftApListener", "Companion", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NetworkConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfiguration$Companion;", "", "()V", "create", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfiguration;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final NetworkConfiguration create() {
            return new NetworkConfigurationImpl(null, 1, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static CompletableFuture<List<WifiConfig>> getRecordWifiConfigs(@NotNull NetworkConfiguration networkConfiguration) {
            return networkConfiguration.getRecordWifiConfigs(new WifiConfigOptions(false, false, false, 7, null));
        }

        @NotNull
        public static CompletableFuture<WifiConfig> getSoftApWifiConfig(@NotNull NetworkConfiguration networkConfiguration) {
            return networkConfiguration.getSoftApWifiConfig(new WifiConfigOptions(false, false, false, 7, null));
        }

        @NotNull
        public static CompletableFuture<WifiConfig> getWifiConfig(@NotNull NetworkConfiguration networkConfiguration) {
            return networkConfiguration.getWifiConfig(new WifiConfigOptions(false, false, false, 7, null));
        }
    }

    @JvmStatic
    @NotNull
    static NetworkConfiguration create() {
        return INSTANCE.create();
    }

    @NotNull
    CompletableFuture<List<WifiConfig>> getRecordWifiConfigs();

    @NotNull
    CompletableFuture<List<WifiConfig>> getRecordWifiConfigs(@NotNull WifiConfigOptions options);

    @NotNull
    CompletableFuture<WifiConfig> getSoftApWifiConfig();

    @NotNull
    CompletableFuture<WifiConfig> getSoftApWifiConfig(@NotNull WifiConfigOptions options);

    @NotNull
    CompletableFuture<WifiConfig> getWifiConfig();

    @NotNull
    CompletableFuture<WifiConfig> getWifiConfig(@NotNull WifiConfigOptions options);

    void registerSoftApListener();

    void unRegisterSoftApListener();
}
