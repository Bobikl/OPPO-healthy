package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface InternalCompatScpRemoteConnectionOrBuilder extends MessageOrBuilder {
    ByteString getAgentAddress();

    long getConnectionId();

    String getDeviceAddress();

    ByteString getDeviceAddressBytes();
}
