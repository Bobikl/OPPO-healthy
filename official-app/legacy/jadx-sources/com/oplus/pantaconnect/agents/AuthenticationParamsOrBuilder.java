package com.oplus.pantaconnect.agents;

import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface AuthenticationParamsOrBuilder extends MessageOrBuilder {
    InternalAgentClient getClient();

    InternalAgentClientOrBuilder getClientOrBuilder();

    boolean getIsAgree();

    boolean hasClient();
}
