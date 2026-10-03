package com.oplus.pantaconnect.sdk.connectionservice.net;

import com.google.protobuf.ByteString;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import jackFruit.blueberry;
import jackFruit.coconut;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfiguration;", "clients", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationClients;", "(Lcom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationClients;)V", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "getRecordWifiConfigs", "Ljava/util/concurrent/CompletableFuture;", "", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfig;", "options", "Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfigOptions;", "getSoftApWifiConfig", "getWifiConfig", "registerSoftApListener", "", "unRegisterSoftApListener", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkConfigurationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkConfigurationImpl.kt\ncom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationImpl\n+ 2 CompletableFutureExt.kt\ncom/oplus/pantaconnect/sdk/ext/CompletableFutureExt\n*L\n1#1,87:1\n41#2,8:88\n41#2,8:96\n41#2,8:104\n*S KotlinDebug\n*F\n+ 1 NetworkConfigurationImpl.kt\ncom/oplus/pantaconnect/sdk/connectionservice/net/NetworkConfigurationImpl\n*L\n34#1:88,8\n50#1:96,8\n66#1:104,8\n*E\n"})
public final class NetworkConfigurationImpl implements NetworkConfiguration {

    @NotNull
    private final NetworkConfigurationClients clients;

    @NotNull
    private final SdkLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkConfigurationImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    @NotNull
    public CompletableFuture<List<WifiConfig>> getRecordWifiConfigs() {
        return NetworkConfiguration.DefaultImpls.getRecordWifiConfigs(this);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    @NotNull
    public CompletableFuture<WifiConfig> getSoftApWifiConfig() {
        return NetworkConfiguration.DefaultImpls.getSoftApWifiConfig(this);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    @NotNull
    public CompletableFuture<WifiConfig> getWifiConfig() {
        return NetworkConfiguration.DefaultImpls.getWifiConfig(this);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    public void registerSoftApListener() {
        this.clients.registerSoftApListener();
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    public void unRegisterSoftApListener() {
        this.clients.unRegisterSoftApListener();
    }

    public NetworkConfigurationImpl(@NotNull NetworkConfigurationClients networkConfigurationClients) {
        this.clients = networkConfigurationClients;
        this.logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "NetworkConfigurationImpl", null, 2, null);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    @NotNull
    public CompletableFuture<List<WifiConfig>> getRecordWifiConfigs(@NotNull WifiConfigOptions options) {
        this.logger.info("getRecordWifiConfigs ");
        CompletableFuture<SealedResult> recordWifiConfigs = this.clients.getRecordWifiConfigs(options);
        final CompletableFuture<List<WifiConfig>> completableFuture = new CompletableFuture<>();
        recordWifiConfigs.thenAcceptAsync((Consumer<? super SealedResult>) new NetworkConfigurationImpl$inlined$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationImpl$getRecordWifiConfigs$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5201invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5201invoke(SealedResult sealedResult) {
                ?? EmptyList;
                CompletableFuture completableFuture2 = completableFuture;
                ByteString data = sealedResult.getData();
                if (data != null) {
                    List<blueberry> list = ((coconut) coconut.blueberry.parseFrom(data)).f20673coconut;
                    EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (blueberry blueberryVar : list) {
                        EmptyList.add(new WifiConfig(blueberryVar.getSsid(), blueberryVar.jackFruit(), BitSet.valueOf(blueberryVar.prunes.toByteArray()), blueberryVar.coconut()));
                    }
                } else {
                    EmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                completableFuture2.complete(EmptyList);
            }
        })).exceptionally(new Function() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationImpl$getRecordWifiConfigs$$inlined$map$2
            @Override // java.util.function.Function
            public final Void apply(Throwable th) {
                completableFuture.completeExceptionally(th);
                return null;
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    @NotNull
    public CompletableFuture<WifiConfig> getSoftApWifiConfig(@NotNull WifiConfigOptions options) {
        this.logger.info("getSoftApWifiConfig ");
        CompletableFuture<SealedResult> softApWifiConfig = this.clients.getSoftApWifiConfig(options);
        final CompletableFuture<WifiConfig> completableFuture = new CompletableFuture<>();
        softApWifiConfig.thenAcceptAsync((Consumer<? super SealedResult>) new NetworkConfigurationImpl$inlined$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationImpl$getSoftApWifiConfig$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5202invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5202invoke(SealedResult sealedResult) {
                WifiConfig wifiConfig;
                CompletableFuture completableFuture2 = completableFuture;
                ByteString data = sealedResult.getData();
                if (data != null) {
                    blueberry blueberryVar = (blueberry) blueberry.mango.parseFrom(data);
                    wifiConfig = new WifiConfig(blueberryVar.getSsid(), blueberryVar.jackFruit(), BitSet.valueOf(blueberryVar.prunes.toByteArray()), blueberryVar.coconut());
                } else {
                    wifiConfig = new WifiConfig(null, null, null, null, 15, null);
                }
                completableFuture2.complete(wifiConfig);
            }
        })).exceptionally(new Function() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationImpl$getSoftApWifiConfig$$inlined$map$2
            @Override // java.util.function.Function
            public final Void apply(Throwable th) {
                completableFuture.completeExceptionally(th);
                return null;
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration
    @NotNull
    public CompletableFuture<WifiConfig> getWifiConfig(@NotNull WifiConfigOptions options) {
        this.logger.info("getWifiConfig ");
        CompletableFuture<SealedResult> wifiConfig = this.clients.getWifiConfig(options);
        final CompletableFuture<WifiConfig> completableFuture = new CompletableFuture<>();
        wifiConfig.thenAcceptAsync((Consumer<? super SealedResult>) new NetworkConfigurationImpl$inlined$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationImpl$getWifiConfig$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5203invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5203invoke(SealedResult sealedResult) {
                WifiConfig wifiConfig2;
                CompletableFuture completableFuture2 = completableFuture;
                ByteString data = sealedResult.getData();
                if (data != null) {
                    blueberry blueberryVar = (blueberry) blueberry.mango.parseFrom(data);
                    wifiConfig2 = new WifiConfig(blueberryVar.getSsid(), blueberryVar.jackFruit(), BitSet.valueOf(blueberryVar.prunes.toByteArray()), blueberryVar.coconut());
                } else {
                    wifiConfig2 = new WifiConfig(null, null, null, null, 15, null);
                }
                completableFuture2.complete(wifiConfig2);
            }
        })).exceptionally(new Function() { // from class: com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfigurationImpl$getWifiConfig$$inlined$map$2
            @Override // java.util.function.Function
            public final Void apply(Throwable th) {
                completableFuture.completeExceptionally(th);
                return null;
            }
        });
        return completableFuture;
    }

    public /* synthetic */ NetworkConfigurationImpl(NetworkConfigurationClients networkConfigurationClients, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkConfigurationClientsImplKt.createNetworkConfigurationClients() : networkConfigurationClients);
    }
}
