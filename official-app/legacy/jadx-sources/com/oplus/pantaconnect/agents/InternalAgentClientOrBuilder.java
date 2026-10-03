package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface InternalAgentClientOrBuilder extends MessageOrBuilder {
    String getAgentId();

    ByteString getAgentIdBytes();

    String getAppName();

    ByteString getAppNameBytes();

    String getChannelName();

    ByteString getChannelNameBytes();

    long getConnectionId();

    int getPid();

    String getPkg();

    ByteString getPkgBytes();

    Role getRole();

    int getRoleValue();
}
