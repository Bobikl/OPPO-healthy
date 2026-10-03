package com.oplus.channel.server;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u000eH&J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH&¨\u0006\u0011"}, d2 = {"Lcom/oplus/channel/server/IServerBusiness;", "", "()V", "createClientProxy", "Lcom/oplus/channel/server/ClientProxy;", "clientName", "", "config", "Lcom/oplus/channel/server/ClientConfig;", "commandHandler", "Lcom/oplus/channel/server/ICommandHandler;", "destroyClientProxy", "", "markIdle", "", "startServer", "unMarkIdle", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class IServerBusiness {
    public static /* synthetic */ ClientProxy createClientProxy$default(IServerBusiness iServerBusiness, String str, ClientConfig clientConfig, ICommandHandler iCommandHandler, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createClientProxy");
        }
        if ((i & 4) != 0) {
            iCommandHandler = null;
        }
        return iServerBusiness.createClientProxy(str, clientConfig, iCommandHandler);
    }

    @NotNull
    public abstract ClientProxy createClientProxy(@NotNull String clientName, @NotNull ClientConfig config, @Nullable ICommandHandler commandHandler);

    public abstract boolean destroyClientProxy(@NotNull String clientName);

    public abstract void markIdle();

    public final void startServer() {
        unMarkIdle();
    }

    public abstract void unMarkIdle();
}
