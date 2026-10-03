package com.heytap.connect.api.listener;

import com.heytap.connect.api.IConnection;
import com.heytap.connect.config.ip.IpInfo;
import com.heytap.connect.message.Message;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\fH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001c\u0010\u001aJ)\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0012\u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0012\u001a\u00020\u001fH&¢\u0006\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/heytap/connect/api/listener/IEventListener;", "Lcom/heytap/connect/api/listener/IConnectStateListener;", "Lcom/heytap/connect/api/listener/IMessageStateListener;", "Lcom/heytap/connect/api/listener/IConnIdListener;", "Lcom/heytap/connect/api/IConnection;", "connection", "Lcom/heytap/connect/config/ip/IpInfo;", "ip", "", "onTCPIpAcquired", "(Lcom/heytap/connect/api/IConnection;Lcom/heytap/connect/config/ip/IpInfo;)V", "onQUICIpAcquired", "Lkotlin/Function1;", "listener", "registerOnIpAcquired", "(Lkotlin/jvm/functions/Function1;)V", "registerOnQUICIpAcquired", "Lcom/heytap/connect/message/Message;", "message", "beforeMessageSend", "(Lcom/heytap/connect/message/Message;)V", "onTCPHeartBeating", "(Lcom/heytap/connect/api/IConnection;)V", "", "isSuccess", "onTCPHeartBeatResult", "(Lcom/heytap/connect/api/IConnection;Z)V", "onQUICHeartBeating", "onQUICHeartBeatResult", "", "state", "", "onConnectingNoThreadPool", "(Lcom/heytap/connect/api/IConnection;ILjava/lang/String;)V", "onQUICConnectingNoThreadPool", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IEventListener extends IConnectStateListener, IMessageStateListener, IConnIdListener {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void onConnectingNoThreadPool$default(IEventListener iEventListener, IConnection iConnection, int i, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConnectingNoThreadPool");
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            iEventListener.onConnectingNoThreadPool(iConnection, i, str);
        }

        public static /* synthetic */ void onQUICConnectingNoThreadPool$default(IEventListener iEventListener, IConnection iConnection, int i, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onQUICConnectingNoThreadPool");
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            iEventListener.onQUICConnectingNoThreadPool(iConnection, i, str);
        }
    }

    void beforeMessageSend(@NotNull Message message);

    void onConnectingNoThreadPool(@NotNull IConnection connection, int state, @NotNull String message);

    void onQUICConnectingNoThreadPool(@NotNull IConnection connection, int state, @NotNull String message);

    void onQUICHeartBeatResult(@NotNull IConnection connection, boolean isSuccess);

    void onQUICHeartBeating(@NotNull IConnection connection);

    void onQUICIpAcquired(@NotNull IConnection connection, @NotNull IpInfo ip);

    void onTCPHeartBeatResult(@NotNull IConnection connection, boolean isSuccess);

    void onTCPHeartBeating(@NotNull IConnection connection);

    void onTCPIpAcquired(@NotNull IConnection connection, @NotNull IpInfo ip);

    void registerOnIpAcquired(@NotNull Function1<? super IpInfo, Unit> listener);

    void registerOnQUICIpAcquired(@NotNull Function1<? super IpInfo, Unit> listener);
}
