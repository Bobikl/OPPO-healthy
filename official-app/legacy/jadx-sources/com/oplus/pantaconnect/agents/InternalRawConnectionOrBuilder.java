package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface InternalRawConnectionOrBuilder extends MessageOrBuilder {
    ConnectType getConnectType();

    int getConnectTypeValue();

    long getConnectionId();

    String getDeviceAddress();

    ByteString getDeviceAddressBytes();
}
