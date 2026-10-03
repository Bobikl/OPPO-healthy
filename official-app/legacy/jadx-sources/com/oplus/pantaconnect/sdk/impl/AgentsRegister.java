package com.oplus.pantaconnect.sdk.impl;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.pantaconnect.agents.InternalAgentClient;
import com.oplus.pantaconnect.agents.Role;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J8\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/oplus/pantaconnect/sdk/impl/AgentsRegister;", "", "buildInternalAgentClient", "Lcom/oplus/pantaconnect/agents/InternalAgentClient;", "id", "", "channelName", "role", "Lcom/oplus/pantaconnect/agents/Role;", "registerAgents", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lkotlin/Function1;", "", "", "Lcom/oplus/pantaconnect/sdk/ipc/Response;", "unregisterAgents", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AgentsRegister {
    @NotNull
    InternalAgentClient buildInternalAgentClient(@NotNull String id, @NotNull String channelName, @NotNull Role role);

    @NotNull
    InternalAgentClient registerAgents(@NotNull String id, @NotNull String channelName, @NotNull Role role, @NotNull Function1<? super byte[], Boolean> response);

    @NotNull
    InternalAgentClient unregisterAgents(@NotNull String id);
}
