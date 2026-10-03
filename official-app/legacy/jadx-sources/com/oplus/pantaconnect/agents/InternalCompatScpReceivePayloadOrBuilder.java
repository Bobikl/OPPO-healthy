package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface InternalCompatScpReceivePayloadOrBuilder extends MessageOrBuilder {
    ByteString getData();

    boolean getIsScpPayload();

    InternalPayloadType getType();

    int getTypeValue();

    int getVersion();
}
