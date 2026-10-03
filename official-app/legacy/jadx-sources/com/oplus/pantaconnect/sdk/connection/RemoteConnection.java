package com.oplus.pantaconnect.sdk.connection;

import android.net.Uri;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.pantaconnect.sdk.Agent;
import com.oplus.smartenginehelper.ParserTag;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006 "}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/RemoteConnection;", "", "agent", "Lcom/oplus/pantaconnect/sdk/Agent;", "getAgent", "()Lcom/oplus/pantaconnect/sdk/Agent;", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "isClosed", "setClosed", "acceptPayload", "Ljava/util/concurrent/CompletableFuture;", "payloadId", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "cancelPayload", "close", "", EngineConstant.REASON, "", "registerConnectionReceiver", "receiver", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionReceiver;", "rejectPayload", "send", "payload", "Lcom/oplus/pantaconnect/sdk/connection/Payload;", "unregisterConnectionReceiver", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RemoteConnection {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static CompletableFuture<Boolean> acceptPayload(@NotNull RemoteConnection remoteConnection, int i) {
            return remoteConnection.acceptPayload(i, null);
        }

        public static void close(@NotNull RemoteConnection remoteConnection) {
            remoteConnection.close(null);
        }
    }

    @NotNull
    CompletableFuture<Boolean> acceptPayload(int payloadId);

    @NotNull
    CompletableFuture<Boolean> acceptPayload(int payloadId, @Nullable Uri uri);

    @NotNull
    CompletableFuture<Boolean> cancelPayload(int payloadId);

    void close();

    void close(@Nullable String reason);

    @NotNull
    Agent getAgent();

    boolean isCancelled();

    boolean isClosed();

    void registerConnectionReceiver(@NotNull ConnectionReceiver receiver);

    @NotNull
    CompletableFuture<Boolean> rejectPayload(int payloadId);

    @NotNull
    CompletableFuture<Integer> send(@NotNull Payload payload);

    void setCancelled(boolean z);

    void setClosed(boolean z);

    void unregisterConnectionReceiver(@NotNull ConnectionReceiver receiver);
}
