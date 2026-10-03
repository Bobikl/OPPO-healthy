package com.heytap.connect.api.listener;

import com.heytap.connect.api.IConnection;
import com.heytap.connect.api.message.IMsgDispatcher;
import com.heytap.connect.message.Message;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\nJ!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH&¢\u0006\u0004\b\u001e\u0010\u0010J'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010\nJ!\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b \u0010\u0017J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\u0019J5\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH&¢\u0006\u0004\b#\u0010$J)\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/heytap/connect/api/listener/IConnectStateListener;", "", "Lcom/heytap/connect/api/IConnection;", "connection", "", "state", "", "message", "", "onTCPConnecting", "(Lcom/heytap/connect/api/IConnection;ILjava/lang/String;)V", "Lcom/heytap/connect/api/message/IMsgDispatcher;", "", "Lcom/heytap/connect/message/Message;", "dispatcher", "onTCPConnected", "(Lcom/heytap/connect/api/IConnection;Lcom/heytap/connect/api/message/IMsgDispatcher;)V", "reasonCode", "errMessage", "onTCPConnectFailed", "", "cause", "onTCPDisconnected", "(Lcom/heytap/connect/api/IConnection;Ljava/lang/Throwable;)V", "onTCPConnectClosed", "(Lcom/heytap/connect/api/IConnection;)V", "onQUICConnecting", "networkTyp", "onQUICConnectChange", "(Ljava/lang/String;)V", "onQUICConnected", "onQUICConnectFailed", "onQUICDisconnected", "onQUICConnectClosed", "connectType", "onConnected", "(ILcom/heytap/connect/api/IConnection;Lcom/heytap/connect/api/message/IMsgDispatcher;)V", "", "isSuccess", "onHeartBeatResult", "(ILcom/heytap/connect/api/IConnection;Z)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IConnectStateListener {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void onQUICConnecting$default(IConnectStateListener iConnectStateListener, IConnection iConnection, int i, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onQUICConnecting");
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            iConnectStateListener.onQUICConnecting(iConnection, i, str);
        }

        public static /* synthetic */ void onTCPConnecting$default(IConnectStateListener iConnectStateListener, IConnection iConnection, int i, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTCPConnecting");
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            iConnectStateListener.onTCPConnecting(iConnection, i, str);
        }
    }

    void onConnected(int connectType, @NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher);

    void onHeartBeatResult(int connectType, @Nullable IConnection connection, boolean isSuccess);

    void onQUICConnectChange(@NotNull String networkTyp);

    void onQUICConnectClosed(@NotNull IConnection connection);

    void onQUICConnectFailed(@NotNull IConnection connection, int reasonCode, @NotNull String errMessage);

    void onQUICConnected(@NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher);

    void onQUICConnecting(@Nullable IConnection connection, int state, @NotNull String message);

    void onQUICDisconnected(@NotNull IConnection connection, @Nullable Throwable cause);

    void onTCPConnectClosed(@NotNull IConnection connection);

    void onTCPConnectFailed(@NotNull IConnection connection, int reasonCode, @NotNull String errMessage);

    void onTCPConnected(@NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher);

    void onTCPConnecting(@Nullable IConnection connection, int state, @NotNull String message);

    void onTCPDisconnected(@NotNull IConnection connection, @Nullable Throwable cause);
}
