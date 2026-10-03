package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface InternalCompatScpSendPayloadOrBuilder extends MessageOrBuilder {
    ByteString getAgentAddress();

    long getConnectionId();

    ByteString getData();

    boolean getIsHandShake();

    InternalPayloadType getType();

    int getTypeValue();
}
