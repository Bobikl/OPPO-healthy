package com.oplus.pantaconnect.agents;

import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DiscoveryParamsOrBuilder extends MessageOrBuilder {
    InternalAgentClient getClient();

    InternalAgentClientOrBuilder getClientOrBuilder();

    ExtensionArgs getExtension();

    ExtensionArgsOrBuilder getExtensionOrBuilder();

    StrategyType getStrategy();

    int getStrategyValue();

    WakeupParams getWakeup();

    WakeupParamsOrBuilder getWakeupOrBuilder();

    boolean hasClient();

    boolean hasExtension();

    boolean hasWakeup();
}
