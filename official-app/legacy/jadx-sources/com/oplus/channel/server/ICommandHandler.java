package com.oplus.channel.server;

import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.channel.server.data.Command;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/oplus/channel/server/ICommandHandler;", "", "handleAddCommand", "", "cmdList", "", "Lcom/oplus/channel/server/data/Command;", EngineConstant.WAKEUP_TYPE_COMMAND, "handlePullCommand", "shouldFilterRequest", "", "currentCommandList", "", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ICommandHandler {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void handleAddCommand(@NotNull ICommandHandler iCommandHandler, @NotNull List<Command> cmdList, @NotNull Command command) {
            Intrinsics.checkNotNullParameter(iCommandHandler, "this");
            Intrinsics.checkNotNullParameter(cmdList, "cmdList");
            Intrinsics.checkNotNullParameter(command, "command");
        }

        public static void handlePullCommand(@NotNull ICommandHandler iCommandHandler, @NotNull List<Command> cmdList) {
            Intrinsics.checkNotNullParameter(iCommandHandler, "this");
            Intrinsics.checkNotNullParameter(cmdList, "cmdList");
        }

        public static boolean shouldFilterRequest(@NotNull ICommandHandler iCommandHandler, @NotNull List<Command> currentCommandList, @NotNull Command command) {
            Intrinsics.checkNotNullParameter(iCommandHandler, "this");
            Intrinsics.checkNotNullParameter(currentCommandList, "currentCommandList");
            Intrinsics.checkNotNullParameter(command, "command");
            return true;
        }
    }

    void handleAddCommand(@NotNull List<Command> cmdList, @NotNull Command command);

    void handlePullCommand(@NotNull List<Command> cmdList);

    boolean shouldFilterRequest(@NotNull List<Command> currentCommandList, @NotNull Command command);
}
