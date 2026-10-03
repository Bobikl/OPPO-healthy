package com.oplus.pantaconnect.sdk.impl;

import com.oplus.pantaconnect.sdk.Agent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getAgentId", "", "agent", "Lcom/oplus/pantaconnect/sdk/Agent;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AgentImplKt {
    @NotNull
    public static final String getAgentId(@NotNull Agent agent) {
        Intrinsics.checkNotNull(agent, "null cannot be cast to non-null type com.oplus.pantaconnect.sdk.impl.AgentImpl");
        return ((AgentImpl) agent).getAgentId();
    }
}
