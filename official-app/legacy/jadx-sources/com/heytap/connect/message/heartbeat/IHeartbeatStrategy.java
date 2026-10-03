package com.heytap.connect.message.heartbeat;

import com.heytap.connect.TapConnection;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/heytap/connect/message/heartbeat/IHeartbeatStrategy;", "", "Lcom/heytap/connect/TapConnection;", "client", "", "onConnectSuccess", "(Lcom/heytap/connect/TapConnection;)V", "onConnectDisConnected", "", "isSuccess", "onHeartbeatResult", "(Z)V", "onHeartbeatCancel", "()V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IHeartbeatStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long MILLS_OF_MIN_PINGREQ = 30000;

    @NotNull
    public static final String TAG = "IHeartbeatStrategy";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/heytap/connect/message/heartbeat/IHeartbeatStrategy$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "MILLS_OF_MIN_PINGREQ", "J", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MILLS_OF_MIN_PINGREQ = 30000;

        @NotNull
        public static final String TAG = "IHeartbeatStrategy";

        private Companion() {
        }
    }

    void onConnectDisConnected(@NotNull TapConnection client);

    void onConnectSuccess(@NotNull TapConnection client);

    void onHeartbeatCancel();

    void onHeartbeatResult(boolean isSuccess);
}
