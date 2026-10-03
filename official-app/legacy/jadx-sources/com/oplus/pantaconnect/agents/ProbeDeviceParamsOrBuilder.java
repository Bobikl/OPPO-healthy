package com.oplus.pantaconnect.agents;

import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ProbeDeviceParamsOrBuilder extends MessageOrBuilder {
    InternalAgentClient getClient();

    InternalAgentClientOrBuilder getClientOrBuilder();

    ExtensionArgs getExtension();

    ExtensionArgsOrBuilder getExtensionOrBuilder();

    boolean hasClient();

    boolean hasExtension();
}
