package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface CompatScpAgentOrBuilder extends MessageOrBuilder {
    ByteString getAgentAddress();

    long getConnectionId();

    boolean getIsServer();

    int getPid();

    WakeupParams getWakeUpParams();

    WakeupParamsOrBuilder getWakeUpParamsOrBuilder();

    boolean hasWakeUpParams();
}
