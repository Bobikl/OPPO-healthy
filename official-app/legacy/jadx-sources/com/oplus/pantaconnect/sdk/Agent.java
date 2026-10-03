package com.oplus.pantaconnect.sdk;

import com.oplus.pantaconnect.sdk.connection.ConnectionOptions;
import com.oplus.pantaconnect.sdk.connection.RemoteConnection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013H\u0016J\u001a\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0018\u001a\u00020\u0017H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H&J\u0010\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013H\u0016J\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/oplus/pantaconnect/sdk/Agent;", "", "connections", "", "Lcom/oplus/pantaconnect/sdk/connection/RemoteConnection;", "getConnections", "()Ljava/util/List;", "displayName", "", "getDisplayName", "()Ljava/lang/CharSequence;", "extensions", "getExtensions", "()Ljava/lang/Object;", "serviceId", "", "getServiceId", "()Ljava/lang/String;", "acceptConnection", "Ljava/util/concurrent/CompletableFuture;", "options", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionOptions;", "authResponse", "", "isAgree", "close", "rejectConnection", "requestConnection", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Agent {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static CompletableFuture<RemoteConnection> acceptConnection(@NotNull Agent agent) {
            return agent.acceptConnection(null);
        }

        @NotNull
        public static CompletableFuture<RemoteConnection> requestConnection(@NotNull Agent agent) {
            return agent.requestConnection(null);
        }

        public static /* synthetic */ CompletableFuture requestConnection$default(Agent agent, ConnectionOptions connectionOptions, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestConnection");
            }
            if ((i & 1) != 0) {
                connectionOptions = null;
            }
            return agent.requestConnection(connectionOptions);
        }
    }

    @NotNull
    CompletableFuture<RemoteConnection> acceptConnection();

    @NotNull
    CompletableFuture<RemoteConnection> acceptConnection(@Nullable ConnectionOptions options);

    @NotNull
    CompletableFuture<Boolean> authResponse(boolean isAgree);

    @NotNull
    CompletableFuture<Boolean> close();

    @NotNull
    List<RemoteConnection> getConnections();

    @NotNull
    CharSequence getDisplayName();

    @Nullable
    Object getExtensions();

    @NotNull
    String getServiceId();

    @NotNull
    CompletableFuture<Boolean> rejectConnection();

    @NotNull
    CompletableFuture<RemoteConnection> requestConnection();

    @NotNull
    CompletableFuture<RemoteConnection> requestConnection(@Nullable ConnectionOptions options);
}
