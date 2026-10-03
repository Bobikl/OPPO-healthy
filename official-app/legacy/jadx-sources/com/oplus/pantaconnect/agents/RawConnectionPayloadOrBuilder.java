package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface RawConnectionPayloadOrBuilder extends MessageOrBuilder {
    long getConnectionId();

    ByteString getData();

    InternalPayloadType getType();

    int getTypeValue();
}
