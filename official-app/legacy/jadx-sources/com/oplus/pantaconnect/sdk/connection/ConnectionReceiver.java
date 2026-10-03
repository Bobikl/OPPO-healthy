package com.oplus.pantaconnect.sdk.connection;

import com.oplus.aiunit.vision.a8i;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0012"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/ConnectionReceiver;", "", "onConnectionClosed", "", "connection", "Lcom/oplus/pantaconnect/sdk/connection/RemoteConnection;", "reasonCode", "", "onPayloadReceived", "payload", "Lcom/oplus/pantaconnect/sdk/connection/Payload;", "onPayloadRequest", "payloadRequest", "Lcom/oplus/pantaconnect/sdk/connection/PayloadRequest;", "onPayloadTransferUpdate", a8i.UPDATE, "Lcom/oplus/pantaconnect/sdk/connection/PayloadTransferUpdate;", "Companion", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ConnectionReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int ERROR_CODE_SERVER_PROCESS_DEATH = 20001;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/ConnectionReceiver$Companion;", "", "()V", "ERROR_CODE_SERVER_PROCESS_DEATH", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ERROR_CODE_SERVER_PROCESS_DEATH = 20001;

        private Companion() {
        }
    }

    void onConnectionClosed(@NotNull RemoteConnection connection, int reasonCode);

    void onPayloadReceived(@NotNull RemoteConnection connection, @NotNull Payload payload);

    void onPayloadRequest(@NotNull RemoteConnection connection, @NotNull PayloadRequest payloadRequest);

    void onPayloadTransferUpdate(@NotNull RemoteConnection connection, @NotNull PayloadTransferUpdate update);
}
