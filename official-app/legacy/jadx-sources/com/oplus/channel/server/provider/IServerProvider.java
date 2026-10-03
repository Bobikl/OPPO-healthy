package com.oplus.channel.server.provider;

import com.oplus.channel.server.data.Command;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J \u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/oplus/channel/server/provider/IServerProvider;", "", "idleState", "", "getIdleState", "()I", "getCommandList", "", "Lcom/oplus/channel/server/data/Command;", "clientName", "", "pullCommand", "runCallback", "", "callbackId", "data", "", "Companion", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IServerProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int STATE_IDLE = -1;
    public static final int STATE_NOT_IDLE = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/oplus/channel/server/provider/IServerProvider$Companion;", "", "()V", "STATE_IDLE", "", "STATE_NOT_IDLE", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int STATE_IDLE = -1;
        public static final int STATE_NOT_IDLE = 0;

        private Companion() {
        }
    }

    @NotNull
    List<Command> getCommandList(@NotNull String clientName);

    int getIdleState();

    @NotNull
    List<Command> pullCommand(@NotNull String clientName);

    void runCallback(@NotNull String clientName, @NotNull String callbackId, @NotNull byte[] data);
}
