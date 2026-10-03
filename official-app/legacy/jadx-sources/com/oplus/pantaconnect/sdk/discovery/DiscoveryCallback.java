package com.oplus.pantaconnect.sdk.discovery;

import com.oplus.pantaconnect.sdk.Agent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryCallback;", "", "onAgentFound", "", "agent", "Lcom/oplus/pantaconnect/sdk/Agent;", "onAgentLost", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DiscoveryCallback {
    void onAgentFound(@NotNull Agent agent);

    void onAgentLost(@NotNull Agent agent);
}
