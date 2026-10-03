package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface InternalPayloadBufferOrBuilder extends MessageOrBuilder {
    InternalAgentClient getClient();

    InternalAgentClientOrBuilder getClientOrBuilder();

    ByteString getData();

    int getId();

    InternalPayloadBuffer.TransferStatus getStatus();

    int getStatusValue();

    long getTotalLength();

    long getTransferredLength();

    InternalPayloadType getType();

    int getTypeValue();

    boolean hasClient();
}
