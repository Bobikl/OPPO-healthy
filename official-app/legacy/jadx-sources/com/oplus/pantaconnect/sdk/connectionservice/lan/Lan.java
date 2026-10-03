package com.oplus.pantaconnect.sdk.connectionservice.lan;

import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0014"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/lan/Lan;", "", "enableConnectionHolding", "Ljava/util/concurrent/CompletableFuture;", "", "deviceId", "", "isForcedHolding", "getSocketQos", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/SocketQos;", "connectionType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "getSocketScore", "", "registerQosObserver", "", "qosObserver", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/IQosObserver;", "unregisterQosObserver", "Companion", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Lan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/lan/Lan$Companion;", "", "()V", "create", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanImpl;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final LanImpl create() {
            return new LanImpl(null, 1, null);
        }
    }

    @JvmStatic
    @NotNull
    static LanImpl create() {
        return INSTANCE.create();
    }

    @NotNull
    CompletableFuture<Boolean> enableConnectionHolding(@NotNull String deviceId, boolean isForcedHolding);

    @NotNull
    CompletableFuture<SocketQos> getSocketQos(@NotNull ConnectionType connectionType, @NotNull String deviceId);

    @NotNull
    CompletableFuture<Integer> getSocketScore(@NotNull ConnectionType connectionType, @NotNull String deviceId);

    void registerQosObserver(@NotNull IQosObserver qosObserver);

    void unregisterQosObserver(@NotNull IQosObserver qosObserver);
}
